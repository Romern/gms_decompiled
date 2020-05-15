package com.felicanetworks.mfc;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class PushSegment implements Parcelable {
    public static Parcelable.Creator CREATOR;
    protected int activateType;
    protected byte[] pushData;

    public abstract void checkFormat();

    public int getType() {
        return this.activateType;
    }
}
