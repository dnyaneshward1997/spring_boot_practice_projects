package com.cdac.service;

import java.util.List;
import com.cdac.model.Subject;

public interface SubjectService {

	void add_Subject(Subject subject);

	void update_Subject(Subject subject);

	void delete_Subject_By_Id(int id);

	Subject get_Subject_By_Id(int id);

	List<Subject> get_All_Subject();

}
