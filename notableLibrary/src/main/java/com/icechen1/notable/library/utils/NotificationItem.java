package com.icechen1.notable.library.utils;

public class NotificationItem {
 
    //private variables
    public int _id;
    String _title;
    String _icon;
	private String _longtext;
	long _timestamp;
    long _reminder_timestamp;
    boolean _dismissed;
 
    // constructor
    public NotificationItem(int id, String title, String longtext, String icon){
        this._id = id;
        this._title = title;
        this._longtext = longtext;
        this._icon = icon;
    }

    // constructor
    public NotificationItem(int id, String title, String longtext, String icon, long reminder_timestamp){
        this._id = id;
        this._title = title;
        this._longtext = longtext;
        this._icon = icon;
        this._reminder_timestamp = reminder_timestamp;
    }
 
    // constructor
    public NotificationItem(int id, String title, String icon){
        this._id = id;
        this._title = title;
        this._icon = icon;
    }

	public NotificationItem() {
		// TODO Auto-generated constructor stub
	}

	// getting ID
    public int getID(){
        return this._id;
    }
 
    // setting id
    public void setID(int l){
        this._id = l;
    }
 
    // getting name
    public String getTitle(){
        return this._title;
    }
 
    // setting name
    public void setTitle(String title){
        this._title = title;
    }
 
    // getting longtext
    public String getLongText(){
        return this._longtext;
    }
 
    // setting longtext
    public void setLongText(String text){
        this._longtext = text;
    }
    
    // getting icon
    public String getIcon(){
        return this._icon;
    }
 
    // setting icon
    public void setIcon(String icon){
        this._icon = icon;
    }
    
    // getting time
    public long getTime(){
        return this._timestamp;
    }
 
    // setting time
    public void setTime(long time){
        this._timestamp = time;
    }

    // getting reminder time
    public long getReminderTime(){
        return this._reminder_timestamp;
    }

    // setting reminder time
    public void setReminderTime(long time){
        this._reminder_timestamp = time;
    }

    // getting dismissed state
    public boolean getDismissed(){
        return this._dismissed;
    }

    // setting dismissed state
    public void setDismissed(boolean b){
        this._dismissed = b;
    }
 
}