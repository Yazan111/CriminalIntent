package com.example.criminalintent;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequirePolice;
    private GregorianCalendar mTime;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTime = new GregorianCalendar();
        mTime.set(2020, 10, 4);
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public GregorianCalendar getTime() {
        return mTime;
    }

    public void setTime(GregorianCalendar time) {
        mTime = time;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isRequirePolice() {
        return mRequirePolice;
    }

    public void setRequirePolice(boolean requirePolice) {
        mRequirePolice = requirePolice;
    }
}
