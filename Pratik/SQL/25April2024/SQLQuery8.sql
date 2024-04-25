USE [CollageDB]
GO

ALTER TABLE [dbo].[student]  
WITH CHECK 
ADD FOREIGN KEY([departmentid])
REFERENCES [dbo].[department] ([id])
GO


