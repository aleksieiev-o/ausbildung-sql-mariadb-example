-- Create databases
CREATE DATABASE ticket_system;

-- Use the ticket_system database
USE ticket_system;

-- Create users
CREATE USER 'admin'@'%' IDENTIFIED BY 'admin';
CREATE USER 'app_user'@'%' IDENTIFIED BY 'app_user';
CREATE USER 'report_user'@'%' IDENTIFIED BY 'report_user';

-- Grant permissions to the users for the ticket_system database
GRANT ALL PRIVILEGES ON ticket_system.* TO 'admin'@'%' WITH GRANT OPTION;
GRANT SELECT, INSERT, UPDATE, DELETE ON ticket_system.* TO 'app_user'@'%';
GRANT SELECT ON ticket_system.* TO 'report_user'@'%';
