variable "aws_region" {
  default = "us-east-1"
}

variable "subnets" {
  type = list(string)
}

variable "security_groups" {
  type = list(string)
}

variable "db_username" {
  type        = string
  description = "The username for the RDS instance"
}

variable "db_password" {
  type        = string
  description = "The password for the RDS instance"
}