variable "aws_region" {
  default = "us-east-1"
}

variable "subnets" {
  type = list(string)
}

variable "security_groups" {
  type = list(string)
}
