package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebViewPageLoadEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjet();

    /* renamed from: a */
    public String f151749a;

    /* renamed from: b */
    public boolean f151750b;

    /* renamed from: c */
    public long f151751c;

    /* renamed from: d */
    public int f151752d;

    /* renamed from: e */
    public String f151753e = "";

    /* renamed from: f */
    public int f151754f;

    /* renamed from: g */
    public int f151755g;

    /* renamed from: h */
    public int f151756h;

    /* renamed from: i */
    public float f151757i;

    /* renamed from: j */
    public float f151758j;

    public WebViewPageLoadEvent() {
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("url: ");
        sb.append(this.f151749a);
        sb.append("\nisTopLevelUrl: ");
        sb.append(this.f151750b);
        sb.append("\nstartTimestampMs: ");
        sb.append(this.f151751c);
        sb.append("\nerrorCode: ");
        sb.append(this.f151752d);
        sb.append("\nerrorDescription: ");
        sb.append(this.f151753e);
        sb.append("\norientation: ");
        sb.append(this.f151754f);
        sb.append("\nscreenWidthPx: ");
        sb.append(this.f151755g);
        sb.append("\nscreenHeightPx: ");
        sb.append(this.f151756h);
        sb.append("\nscreenXDpi: ");
        sb.append(this.f151757i);
        sb.append("\nscreenYDpi: ");
        sb.append(this.f151758j);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151749a);
        parcel.writeInt(this.f151750b ? 1 : 0);
        parcel.writeLong(this.f151751c);
        parcel.writeInt(this.f151752d);
        parcel.writeString(this.f151753e);
        parcel.writeInt(this.f151754f);
        parcel.writeInt(this.f151755g);
        parcel.writeInt(this.f151756h);
        parcel.writeFloat(this.f151757i);
        parcel.writeFloat(this.f151758j);
    }

    public WebViewPageLoadEvent(Parcel parcel) {
        this.f151749a = parcel.readString();
        this.f151750b = parcel.readInt() != 0;
        this.f151751c = parcel.readLong();
        this.f151752d = parcel.readInt();
        this.f151753e = parcel.readString();
        this.f151754f = parcel.readInt();
        this.f151755g = parcel.readInt();
        this.f151756h = parcel.readInt();
        this.f151757i = parcel.readFloat();
        this.f151758j = parcel.readFloat();
    }
}
