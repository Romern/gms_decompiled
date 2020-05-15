package com.google.android.gms.security.verifier;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApkUploadEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aqgf();

    /* renamed from: a */
    public final long f107598a;

    /* renamed from: b */
    public final String f107599b;

    /* renamed from: c */
    public final int f107600c;

    /* renamed from: d */
    public final byte[] f107601d;

    /* renamed from: e */
    public final byte[] f107602e;

    /* renamed from: f */
    public final long f107603f;

    /* renamed from: g */
    public final int f107604g;

    /* renamed from: h */
    public final long f107605h;

    /* renamed from: i */
    public final int f107606i;

    /* renamed from: j */
    public final int f107607j;

    public ApkUploadEntry(long j, String str, int i, byte[] bArr, byte[] bArr2, long j2, int i2, long j3, int i3, int i4) {
        this.f107598a = j;
        this.f107599b = str;
        this.f107600c = i;
        this.f107601d = bArr;
        if (bArr2 == null || bArr2.length != 256) {
            this.f107602e = aqgx.m71598a();
        } else {
            this.f107602e = bArr2;
        }
        this.f107603f = j2;
        this.f107604g = i2;
        this.f107605h = j3;
        this.f107606i = i3;
        this.f107607j = i4;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("id: %d, package_name=%s, version_code=%d, state=%d", Long.valueOf(this.f107598a), this.f107599b, Integer.valueOf(this.f107600c), Integer.valueOf(this.f107604g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f107598a);
        parcel.writeString(this.f107599b);
        parcel.writeInt(this.f107600c);
        parcel.writeByteArray(this.f107601d);
        parcel.writeByteArray(this.f107602e);
        parcel.writeLong(this.f107603f);
        parcel.writeInt(this.f107604g);
        parcel.writeLong(this.f107605h);
        parcel.writeInt(this.f107606i);
    }

    public ApkUploadEntry(String str, int i, byte[] bArr, byte[] bArr2, long j, int i2) {
        this.f107598a = -1;
        this.f107599b = str;
        this.f107600c = i;
        this.f107601d = bArr;
        if (bArr2 == null) {
            this.f107602e = aqgx.m71598a();
        } else {
            this.f107602e = bArr2;
        }
        this.f107603f = j;
        this.f107604g = 0;
        this.f107605h = -1;
        this.f107606i = 0;
        if (cgkt.m145949u()) {
            this.f107607j = i2;
        } else {
            this.f107607j = 0;
        }
    }
}
