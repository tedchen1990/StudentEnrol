package com.enrol

class BootStrap {

    def init = { servletContext ->
	
	def course1 = new Course
	(
	department: 'Computing3',
	courseCode: 'CS123',
	courseTitle: 'BSc Hon Computing',
	courseLeader: 'Dr Michelle Murphy',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents: 55,
	studyMode:'Fulltime',
	tuitionFees:9000.60,
	description : 'Lorem ipsum dolor sit amet...'	
	).save()

def course2 = new Course
	(
	department: 'Computing2',
	courseCode: 'CS123',
	courseTitle: 'BSc Hon Computing',
	courseLeader: 'Dr Michelle Murphy',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents: 55,
	studyMode:'Fulltime',
	tuitionFees:9000.60,
	description : 'Lorem ipsum dolor sit amet...'	
	).save()

def course3 = new Course
	(
	department: 'Computin3',
	courseCode: 'CS123',
	courseTitle: 'BSc Hon Computing',
	courseLeader: 'Dr Michelle Murphy',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents: 55,
	studyMode:'Fulltime',
	tuitionFees:9000.60,
	description : 'Lorem ipsum dolor sit amet...'	
	).save()
    }

    def destroy = {
    }
}
