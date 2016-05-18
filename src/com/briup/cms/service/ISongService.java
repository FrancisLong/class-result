package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Song;

public interface ISongService {
			//添加歌曲
		void add(Song song);
		//列出所有歌曲
		List<Song> list();
		//删除歌曲
		void delete(long id);
}
