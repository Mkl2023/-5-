CREATE DATABASE IF NOT EXISTS art_competition_db;
USE art_competition_db;


INSERT INTO roles (id, name) VALUES (1, 'ROLE_USER'), (2, 'ROLE_ORGANIZER'), (3, 'ROLE_ADMIN')
ON DUPLICATE KEY UPDATE name=name;

-- Пароль для админа: admin123 (захеширован BCrypt)
INSERT INTO users (id, username, password, email, full_name)
VALUES (1, 'admin', '$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HCGF5z00E.8T4r9vO9R/O', 'admin@artsys.ru', 'Главный Администратор')
ON DUPLICATE KEY UPDATE username=username;

INSERT INTO user_roles (user_id, role_id) VALUES (1, 3)
ON DUPLICATE KEY UPDATE user_id=user_id;
