USE ticket_system;

CREATE IF NOT EXISTS USER 'admin'@'%' IDENTIFIED BY 'admin';
CREATE IF NOT EXISTS USER 'admin'@'localhost' IDENTIFIED BY 'admin';
CREATE IF NOT EXISTS USER 'app_user'@'%' IDENTIFIED BY 'app_user';
CREATE IF NOT EXISTS USER 'app_user'@'localhost' IDENTIFIED BY 'app_user';
CREATE IF NOT EXISTS USER 'report_user'@'%' IDENTIFIED BY 'report_user';
CREATE IF NOT EXISTS USER 'report_user'@'localhost' IDENTIFIED BY 'report_user';

GRANT ALL PRIVILEGES ON ticket_system.* TO 'admin'@'%' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON ticket_system.* TO 'admin'@'localhost' WITH GRANT OPTION;
GRAND CREATE ON *.* TO 'admin'@'%';
GRAND CREATE ON *.* TO 'admin'@'localhost';
GRANT SELECT, INSERT, UPDATE, DELETE ON ticket_system.* TO 'app_user'@'%';
GRANT SELECT, INSERT, UPDATE, DELETE ON ticket_system.* TO 'app_user'@'localhost';
GRANT SELECT ON ticket_system.* TO 'report_user'@'%';
GRANT SELECT ON ticket_system.* TO 'report_user'@'localhost';

FLUSH PRIVILEGES;
