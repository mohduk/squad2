

CREATE TABLE [dbo].[student](
	[id] [int] IDENTITY(1,2) NOT NULL,
	[name] [varchar](50) NULL,
	[departmentid] int NOT NULL Foreign key references department(id)
PRIMARY KEY (id)
)
GO