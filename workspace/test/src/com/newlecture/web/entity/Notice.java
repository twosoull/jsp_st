package com.newlecture.web.entity;

import java.sql.Date;

public class Notice {
	private int id;
	private String title;
	private String writerId;
	private Date Regdate;
	private String hit;
	private String files;
	private String content;

	public Notice() {}
	public Notice(int id, String title, String writerId, Date regdate, String hit, String files, String content) {
		super();
		this.id = id;
		this.title = title;
		this.writerId = writerId;
		Regdate = regdate;
		this.hit = hit;
		this.files = files;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public Date getRegdate() {
		return Regdate;
	}

	public void setRegdate(Date regdate) {
		Regdate = regdate;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Notice [title=" + title + ", writerId=" + writerId + ", Regdate=" + Regdate + ", hit=" + hit + ", files=" + files + ", content=" + content
				+ "]";
	}

}
