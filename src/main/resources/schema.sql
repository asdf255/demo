CREATE table user(
    id INT auto_increment,
    user_id VARCHAR(10) UNIQUE NOT NULL,
    user_name VARCHAR(10) NOT NULL,
    email_address VARCHAR(40) NOT NULL,
    password VARCHAR(40) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    PRIMARY KEY(id)
);