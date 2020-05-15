package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarGalMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new nll();

    /* renamed from: a */
    public long f29323a;

    /* renamed from: b */
    public int f29324b;

    /* renamed from: c */
    public int f29325c;

    /* renamed from: d */
    public byte[] f29326d;

    /* renamed from: e */
    public int f29327e;

    /* renamed from: f */
    public int f29328f;

    /* renamed from: g */
    public boolean f29329g;

    public CarGalMessage() {
        mo17324a(0, 0, 0, null, 0, 0, false);
    }

    /* renamed from: a */
    public final void mo17324a(long j, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
        this.f29323a = j;
        this.f29324b = i;
        this.f29325c = i2;
        this.f29326d = bArr;
        this.f29327e = i3;
        this.f29328f = i4;
        this.f29329g = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29323a);
        parcel.writeInt(this.f29324b);
        parcel.writeInt(this.f29325c);
        if (this.f29326d != null) {
            parcel.writeInt(this.f29328f);
            int i2 = this.f29328f;
            if (i2 > 0) {
                parcel.writeByteArray(this.f29326d, this.f29327e, i2);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f29329g ? 1 : 0);
    }

    public CarGalMessage(Parcel parcel) {
        this.f29323a = parcel.readLong();
        this.f29324b = parcel.readInt();
        this.f29325c = parcel.readInt();
        boolean z = false;
        this.f29327e = 0;
        int readInt = parcel.readInt();
        this.f29328f = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f29326d = bArr;
            parcel.readByteArray(bArr);
        } else {
            this.f29326d = null;
        }
        this.f29329g = parcel.readInt() != 0 ? true : z;
    }
}
