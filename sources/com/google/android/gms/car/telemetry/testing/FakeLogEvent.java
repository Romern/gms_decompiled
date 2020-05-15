package com.google.android.gms.car.telemetry.testing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FakeLogEvent implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new omr();

    /* renamed from: f */
    private static final byte[] f29519f = new byte[0];

    /* renamed from: a */
    public String f29520a;

    /* renamed from: b */
    public String f29521b;

    /* renamed from: c */
    public int f29522c = -1;

    /* renamed from: d */
    public byte[] f29523d = f29519f;

    /* renamed from: e */
    public long f29524e;

    public FakeLogEvent() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29520a);
        parcel.writeString(this.f29521b);
        parcel.writeInt(this.f29522c);
        parcel.writeLong(this.f29524e);
        parcel.writeByteArray(this.f29523d);
    }

    public FakeLogEvent(Parcel parcel) {
        this.f29520a = parcel.readString();
        this.f29521b = parcel.readString();
        this.f29522c = parcel.readInt();
        this.f29524e = parcel.readLong();
        this.f29523d = parcel.createByteArray();
    }
}
