package com.briup.cms.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Song;
import com.briup.cms.service.ISongService;
import com.briup.cms.service.impl.SongServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SongAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String author;
	
	private ISongService songservice = new SongServiceImpl();
	private List<Song>songlist;
	
	@Action(value="toAddSong",
			results={@Result(name="success",
			location="/WEB-INF/jsp/manager/addSong.jsp")})
     public String toAddSong(){
    	 return SUCCESS;
     }
	
	@Action(value="toSongManager",
			results={@Result(name="success",location="/WEB-INF/jsp/manager/songManager.jsp")})
	public String toSongManager(){
		//调用service层的方法查询所有的歌曲信息，并且将这些值赋给songList
		songlist = songservice.list();
		return SUCCESS;//"success"
	}
	
	@Action(value="addSong")
	public void addSong(){
		//将接收到的参数进行封装，封装为一个对象
		Song song = new Song(null, name, author);
		//调用sercice层的服务，完成添加歌曲的功能
		songservice.add(song);
	}
	
	@Action(value="delSong")
	public void delSong(){
		songservice.delete(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Song> getSonglist() {
		return songlist;
	}

	public void setSonglist(List<Song> songlist) {
		this.songlist = songlist;
	}
	
	
}
