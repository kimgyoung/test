-- 모든 제약 조건 비활성화
SET REFERENTIAL_INTEGRITY FALSE;
truncate table user_tb;
SET REFERENTIAL_INTEGRITY TRUE;

INSERT INTO user_tb (`id`,`email`,`password`,`userName`, `roles`) VALUES ('1', 'admin@green.com', '{bcrypt}$2a$10$8xUmHrF0/jqYAGLgI/CKOemXcApJ7CNpAfAxQJxoc88UxC/WoXGJe', '홍길동', 'ROLE_ADMIN');
INSERT INTO user_tb (`id`,`email`,`password`,`userName`, `roles`) VALUES ('2', 'user@green.com', '{bcrypt}$2a$10$8xUmHrF0/jqYAGLgI/CKOemXcApJ7CNpAfAxQJxoc88UxC/WoXGJe', '임꺽정', 'ROLE_USER');