SET IDENTITY_INSERT Topics ON;
INSERT INTO Topics (topicId, name, description, status) VALUES
  (1, 'Java', 'Java Programming', 1),
  (2, 'Spring Boot', 'Spring Boot Framework', 1);
SET IDENTITY_INSERT Topics OFF;

SET IDENTITY_INSERT Courses ON;
INSERT INTO Courses (courseId, title, description, price, createdAt, rating, imageUrl, videoTrailerUrl, status) VALUES
  (1, 'Java Fundamentals', 'Learn Java from scratch', 500000, '2025-07-01 10:00:00', 4.5, 'java.jpg', 'trailer1.mp4', 1),
  (2, 'Spring Boot Masterclass', 'Deep dive into Spring Boot', 700000, '2025-07-05 10:00:00', 4.8, 'spring.jpg', 'trailer2.mp4', 1);
SET IDENTITY_INSERT Courses OFF;

SET IDENTITY_INSERT Chapters ON;
INSERT INTO Chapters (chapterId, title, createdAt, courseId) VALUES
  (1, 'Introduction', '2025-07-01 12:00:00', 1),
  (2, 'OOP Concepts', '2025-07-01 13:00:00', 1),
  (3, 'Spring Boot Basics', '2025-07-05 12:00:00', 2);
SET IDENTITY_INSERT Chapters OFF;

SET IDENTITY_INSERT Users ON;
INSERT INTO Users (userId, fullName) VALUES (1, 'alice'), (2, 'bob');
SET IDENTITY_INSERT Users OFF;

SET IDENTITY_INSERT Enrollments ON;
INSERT INTO Enrollments (enrollmentId, enrolledAt, progress, userId, courseId) VALUES
  (1, '2025-07-10 09:00:00', 0.1, 1, 1),
  (2, '2025-07-11 10:00:00', 0.5, 2, 2);
SET IDENTITY_INSERT Enrollments OFF;

SET IDENTITY_INSERT Ratings ON;
INSERT INTO Ratings (ratingId, rating, feedback, createdAt, userId, courseId) VALUES
  (1, 5, 'Great course!', '2025-07-12 09:00:00', 1, 1),
  (2, 4, 'Very helpful', '2025-07-13 10:00:00', 2, 2);
SET IDENTITY_INSERT Ratings OFF;

SET IDENTITY_INSERT OrderItems ON;
INSERT INTO OrderItems (orderItemId, price, courseId, orderId) VALUES
  (1, 500000, 1, 1),
  (2, 700000, 2, 1);
SET IDENTITY_INSERT OrderItems OFF;


INSERT INTO Course_Topic (courseId, topicId) VALUES
  (1, 1), -- Course 1 liên kết Topic 1
  (2, 1), -- Course 2 liên kết Topic 1
  (2, 2); -- Course 2 liên kết Topic 2


