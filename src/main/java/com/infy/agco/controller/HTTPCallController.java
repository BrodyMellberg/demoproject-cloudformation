package com.infy.agco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.agco.util.Welcome;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@RestController
public class HTTPCallController
{
	private final String USER_AGENT = "Mozilla/5.0";
	private static final String welcomemsg = "Welcome! for HTTP call";
	private static final String region = "us-east-2"; //default AWS region

	@RequestMapping(value="/http", method=RequestMethod.GET )
	@ResponseBody
    public Welcome welcomeUser() throws Exception
	{
		//	sendGet();
        return new Welcome("\n"+String.format(sendGet() )+"\n\n");
    }

    // HTTP GET request
	private String sendGet() throws Exception
	{
		String url = "http://vpce-0e3cd47c27842c6bb-rie2ycjm.vpce-svc-09314a7b4c6c78edf."+region+".vpce.amazonaws.com:4570/http";
		//String url = "3.134.85.78:4570/http";
		/*hard coding the task IP won't work because the IP changes after every build*/
		//String url =
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null)
		{
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
        return response.toString();
	}
	
	// HTTP POST request
	private void sendPost() throws Exception
	{
		String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add request header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
			
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null)
		{
			response.append(inputLine);
		}
		in.close();
			
		//print result
		System.out.println(response.toString());
	}
}
