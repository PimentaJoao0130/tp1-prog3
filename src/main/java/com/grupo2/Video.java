package com.grupo2;

public class Video {
    private long numColuna;
    private String claim_Status;
    private long video_id;
    private long video_duration_sec;
    private String video_transcription_text;
    private String verified_status;
    private String author_ban_status;
    private long video_view_count;
    private long video_like_count;
    private long video_share_count;
    private long video_download_count;

    
    public Video(long numColuna, String claim_Status, long video_id, long video_duration_sec, String video_transcription_text,
            String verified_status, String author_ban_status, long video_view_count, long video_like_count,
            long video_share_count, long video_download_count, long video_comment_count) {
        this.numColuna = numColuna;
        this.claim_Status = claim_Status;
        this.video_id = video_id;
        this.video_duration_sec = video_duration_sec;
        this.video_transcription_text = video_transcription_text;
        this.verified_status = verified_status;
        this.author_ban_status = author_ban_status;
        this.video_view_count = video_view_count;
        this.video_like_count = video_like_count;
        this.video_share_count = video_share_count;
        this.video_download_count = video_download_count;
        this.video_comment_count = video_comment_count;
    }

    public String getClaim_Status() {
        return claim_Status;
    }

    public void setClaim_Status(String claim_Status) {
        this.claim_Status = claim_Status;
    }

    public long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(long video_id) {
        this.video_id = video_id;
    }

    public long getVideo_duration_sec() {
        return video_duration_sec;
    }

    public void setVideo_duration_sec(long video_duration_sec) {
        this.video_duration_sec = video_duration_sec;
    }

    public String getVideo_transcription_text() {
        return video_transcription_text;
    }

    public void setVideo_transcription_text(String video_transcription_text) {
        this.video_transcription_text = video_transcription_text;
    }

    public String getVerified_status() {
        return verified_status;
    }

    public void setVerified_status(String verified_status) {
        this.verified_status = verified_status;
    }

    public String getAuthor_ban_status() {
        return author_ban_status;
    }

    public void setAuthor_ban_status(String author_ban_status) {
        this.author_ban_status = author_ban_status;
    }

    public long getVideo_view_count() {
        return video_view_count;
    }

    public void setVideo_view_count(long video_view_count) {
        this.video_view_count = video_view_count;
    }

    public long getVideo_like_count() {
        return video_like_count;
    }

    public void setVideo_like_count(long video_like_count) {
        this.video_like_count = video_like_count;
    }

    public long getVideo_share_count() {
        return video_share_count;
    }

    public void setVideo_share_count(long video_share_count) {
        this.video_share_count = video_share_count;
    }

    public long getVideo_download_count() {
        return video_download_count;
    }

    public void setVideo_download_count(long video_download_count) {
        this.video_download_count = video_download_count;
    }

    public long getVideo_comment_count() {
        return video_comment_count;
    }

    public void setVideo_comment_count(long video_comment_count) {
        this.video_comment_count = video_comment_count;
    }

    private long video_comment_count;


    public long getNumColuna() {
        return numColuna;
    }

    public void setNumColuna(long numColuna) {
        this.numColuna = numColuna;
    }

    
}
