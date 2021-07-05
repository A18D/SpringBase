package org.example.dao.interfaces;


import org.example.dao.objects.Author;
import org.example.dao.objects.MP3;

import java.util.List;
import java.util.Map;

public interface MP3Dao {

	int insertMP3(MP3 mp3);

	int insertList(List<MP3> mp3List);

	void delete(MP3 mp3);

	void delete(int id);

	MP3 getMP3ByID(int id);

	List<MP3> getMP3ListByName(String name);

	List<MP3> getMP3ListByAuthor(String author);

	int getMP3Count();

	Map<String, Integer> getStat();

	int insertAuthor(Author author);

}
