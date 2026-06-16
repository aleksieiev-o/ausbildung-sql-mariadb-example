USE ticket_system;

INSERT INTO categories (name) VALUES
	('Bug'),
	('Feature Request'),
	('Security'),
	('Design'),
	('Documentation')
;

INSERT INTO tickets (title, description, author, category_id) VALUES
	('Critical bug in search functionality','This bug causes search results to be incorrect.', 'John Doe', 1),
	('Improved user interface design','The new design makes the application more user-friendly.', 'Jane Smith', 4),
	('New security feature added','This feature helps protect the application from unauthorized access.', 'Alice Johnson', 3),
	('Documentation update needed','The documentation needs to be updated to reflect the new features.', 'Bob Brown', 5),
	('Security vulnerability found','An exploit has been discovered in the application.', 'Charlie Wilson', 3),
	('Feature request for new feature','The application should have a new feature to improve user experience.', 'David Garcia', 2),
	('Bug fix for performance issue','This fix improves the application performance.', 'Emily Davis', 1),
	('Design update for better user experience','The new design makes the application more appealing to users.', 'Frank Smith', 4),
	('Documentation update for new feature','The documentation needs to be updated to reflect the new feature.', 'George Brown', 5)
;

INSERT INTO comments (body, author, ticket_id) VALUES
  ('The bug has been fixed.', 'John Doe', 1),
  ('The new design looks great!', 'Jane Smith', 4),
	('The security feature has been added successfully.', 'Alice Johnson', 3),
  ('The documentation has been updated.', 'Bob Brown', 5),
	('The exploit has been patched.', 'Charlie Wilson', 3),
  ('The new feature has been implemented.', 'David Garcia', 2),
	('The performance issue has been resolved.', 'Emily Davis', 1),
  ('The new design is much better.', 'Frank Smith', 4),
	('The documentation has been updated again.', 'George Brown', 5),
	('I agree with your suggestions.', 'John Doe', 1),
  ('I think the new design is perfect.', 'Jane Smith', 4),
	('I completely agree with you.', 'Alice Johnson', 3),
  ('I think the documentation is clear now.', 'Bob Brown', 5),
	('I agree with your points.', 'Charlie Wilson', 3),
  ('I think the new feature is a great idea.', 'David Garcia', 2)
;
