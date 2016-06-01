package Entity;

public class ItemCommentsInfo {
    private String itemno;

    private String commentimage;

    private String comment;

    private Short scope;

    private String username;

    private String time;
    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getCommentimage() {
        return commentimage;
    }

    public void setCommentimage(String commentimage) {
        this.commentimage = commentimage == null ? null : commentimage.trim();
    }

    public String getComments() {
        return comment;
    }

    public void setComments(String comments) {
        this.comment = comments == null ? null : comment.trim();
    }

    public Short getScope() {
        return scope;
    }

    public void setScope(Short scope) {
        this.scope = scope;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time == null ? null : time.trim();
	}
}