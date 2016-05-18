package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Song;
import com.briup.cms.dao.SongDao;
import com.briup.cms.service.ISongService;

public class SongServiceImpl implements ISongService {
	private SongDao songDao = new SongDao();
	@Override
	public void add(Song song) {
		songDao.save(song);
	}
	
	@Override
	public List<Song> list() {
		List<Song> list = songDao.findAll();
		return list;
	}
	
	@Override
	public void delete(long id) {
		songDao.deleteById(id);
	}

}
