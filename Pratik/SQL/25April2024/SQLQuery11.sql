USE [CollageDB]
GO

/****** Object:  Table [dbo].[student]    Script Date: 25-04-2024 10:43:07 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Batch2](
	[id] [int] IDENTITY(1,2) NOT NULL,
	[name] [varchar](50) NULL,
	[departmentid] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[student]  WITH CHECK ADD FOREIGN KEY([departmentid])
REFERENCES [dbo].[department] ([id])
GO

INSERT INTO Batch2 Values ('Pratik',13)
INSERT INTO Batch2 Values ('Shrutika',13)
INSERT INTO Batch2 Values ('Anil',15)


INSERT INTO Batch1 Values ('Ashish',13)
INSERT INTO Batch1 Values ('Sunita',15)


select * from Batch2

select * from Batch1

SELECT * FROM BATCH1 b1
JOIN Department d
ON b1.departmentid = d.id

SELECT d.name, b2.name, b1.name FROM Department d
join Batch2 b2
ON d.id = b2.departmentid
join batch1 b1
on d.id = b1.departmentid
where d.name = 'net'






SELECT * FROM Student
SELECT * FROM Department





