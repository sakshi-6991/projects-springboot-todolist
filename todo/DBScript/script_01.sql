create table 'user'(
    'user_id' BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    'first_name' varchar(50),
    'last_name' varchar(50),
    'email' VARCHAR(50) UNIQUE NOT NULL,
    'password' VARCHAR(50) NOT NULL,
    'mobile'VARCHAR(50) UNIQUE NOT NULL,
    'is_email_verified' VARCHAR(50) BIT(1) DEFAULT FALSE,
    'is_mobile_verified' VARCHAR(50) BIT(1) DEFAULT FALSE,
    'is_enabled'  VARCHAR(50) BIT(1) DEFAULT FALSE,
    'otp' VARCHAR(50),
    'created_at' timestamp,
    'updated_at'timestamp
);