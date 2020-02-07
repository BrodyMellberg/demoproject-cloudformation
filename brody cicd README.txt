Set up your ECR Repo with a Docker image of your app (tagged 'latest')
Use this repo for the parameter "ECRRepoName"
"ECRRepoName" is currently used as the container name so cannot have invalid characters such as"/"

CLI configuration
- aws configure
- account ID
- account region
- access key
- secret access key

CLI parameters checklist (for FinalStackSingleFile.yaml)
- Stack name
- Template file path 
- VPC ID
- Subnet ID
- GitHub Owner 
- GitHub Repo
- GitHub Branch
- GitHub OAuth token (with permissions "repo" and "admin:repo_hook")
- ECR Repo Name

Update imagedefinitions.json (instructions in README)
[
  {
    "name": " <ECR Repo Name> "
    "imageUri": "<Account Number>.dkr.ecr.<Region>.amazonaws.com/<ECR Repo Name>:latest"
  }
]

DELETING STACK
- S3 buckets will not delete if they have items inside them. S3 buckets need to be deleted 
  manually