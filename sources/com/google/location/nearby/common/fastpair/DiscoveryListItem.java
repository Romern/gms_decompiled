package com.google.location.nearby.common.fastpair;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiscoveryListItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new burg();

    /* renamed from: a */
    public final String f191735a;

    /* renamed from: b */
    public final String f191736b;

    /* renamed from: c */
    public final String f191737c;

    /* renamed from: d */
    public final String f191738d;

    /* renamed from: e */
    public final String f191739e;

    /* renamed from: f */
    public final String f191740f;

    /* renamed from: g */
    public final float f191741g;

    /* renamed from: h */
    public final String f191742h;

    /* renamed from: i */
    public final Intent f191743i;

    /* renamed from: j */
    public final Bitmap f191744j;

    /* renamed from: k */
    public final boolean f191745k;

    /* renamed from: l */
    public final bzbk f191746l;

    /* renamed from: m */
    public final boolean f191747m;

    /* renamed from: n */
    public final double f191748n;

    /* renamed from: o */
    public final String f191749o;

    public DiscoveryListItem(Parcel parcel) {
        this.f191735a = parcel.readString();
        this.f191736b = parcel.readString();
        this.f191737c = parcel.readString();
        this.f191739e = parcel.readString();
        this.f191738d = parcel.readString();
        this.f191743i = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f191744j = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean z = true;
        this.f191745k = parcel.readByte() != 0;
        this.f191746l = bzbk.m125615a(parcel.readInt());
        this.f191747m = parcel.readByte() == 0 ? false : z;
        this.f191741g = parcel.readFloat();
        this.f191742h = parcel.readString();
        this.f191740f = parcel.readString();
        this.f191748n = parcel.readDouble();
        this.f191749o = parcel.readString();
    }

    /* renamed from: a */
    public final boolean mo86668a() {
        return this.f191748n >= 0.0d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f191735a);
        parcel.writeString(this.f191736b);
        parcel.writeString(this.f191737c);
        parcel.writeString(this.f191739e);
        parcel.writeString(this.f191738d);
        parcel.writeParcelable(this.f191743i, i);
        parcel.writeParcelable(this.f191744j, i);
        parcel.writeByte(this.f191745k ? (byte) 1 : 0);
        parcel.writeInt(this.f191746l.f169257h);
        parcel.writeByte(this.f191747m ? (byte) 1 : 0);
        parcel.writeFloat(this.f191741g);
        parcel.writeString(this.f191742h);
        parcel.writeString(this.f191740f);
        parcel.writeDouble(this.f191748n);
        parcel.writeString(this.f191749o);
    }

    public DiscoveryListItem(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, boolean z, bzbk bzbk, Intent intent, Bitmap bitmap, boolean z2, Double d, String str8) {
        this.f191735a = str;
        this.f191736b = str2;
        this.f191737c = str3;
        this.f191739e = str4;
        this.f191740f = str5;
        this.f191741g = f;
        this.f191742h = str6;
        this.f191738d = str7;
        this.f191743i = intent;
        this.f191744j = bitmap;
        this.f191745k = z;
        this.f191746l = bzbk;
        this.f191747m = z2;
        this.f191748n = d != null ? d.doubleValue() : -1.0d;
        this.f191749o = str8;
    }

    public DiscoveryListItem(String str, String str2, String str3, String str4, String str5, float f, boolean z, bzbk bzbk, Intent intent, Bitmap bitmap, boolean z2) {
        this(str, str2, str3, str4, str5, f, null, null, z, bzbk, intent, bitmap, z2, null, null);
    }
}
