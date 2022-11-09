package assignments;
//import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
class News
{
    int newsId;
    String postedByUser;
    String commentByUser;
    String comment;
    News(int newsId,String postedByUser,String commentByUser,String comment)
    {
        this.newsId=newsId;
        this.postedByUser=postedByUser;
        this.commentByUser=commentByUser;
        this.comment=comment;

    }

    @Override
    public String toString() {
        return "News{" +
                "newId=" + newsId +
                ", postedByUser='" + postedByUser + '/' +
                ", commentByUser='" + commentByUser + '/' +
                ", comment='" + comment + '/' +
                '}';
    }
    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }
}

