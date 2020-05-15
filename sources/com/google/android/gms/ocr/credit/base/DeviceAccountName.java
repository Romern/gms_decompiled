package com.google.android.gms.ocr.credit.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceAccountName implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aksr();

    /* renamed from: a */
    public final String f81293a;

    /* renamed from: b */
    public final String f81294b;

    /* renamed from: c */
    public final String f81295c;

    /* renamed from: d */
    public final String f81296d;

    public DeviceAccountName(String str, String str2, String str3, String str4) {
        this.f81293a = str == null ? "" : str;
        this.f81294b = str2 == null ? "" : str2;
        this.f81295c = str3 == null ? "" : str3;
        this.f81296d = str4 == null ? "" : str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        if (!this.f81293a.isEmpty()) {
            sb.append(this.f81293a);
            sb.append(" ");
        }
        if (!this.f81294b.isEmpty()) {
            sb.append(this.f81294b);
            sb.append(" ");
        }
        if (!this.f81295c.isEmpty()) {
            sb.append(this.f81295c);
            sb.append(" ");
        }
        if (!this.f81296d.isEmpty()) {
            sb.append(this.f81296d);
        }
        return sb.toString().trim();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81293a);
        parcel.writeString(this.f81294b);
        parcel.writeString(this.f81295c);
        parcel.writeString(this.f81296d);
    }
}
