package com.google.android.gms.car.senderprotocol;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ogt();

    /* renamed from: a */
    public final int f29508a;

    /* renamed from: b */
    public final int f29509b;

    /* renamed from: c */
    public final ByteBuffer f29510c;

    /* renamed from: d */
    public final int f29511d;

    /* renamed from: e */
    public final boolean f29512e;

    /* renamed from: f */
    public final boolean f29513f;

    /* renamed from: g */
    public final boolean f29514g;

    /* renamed from: h */
    public final boolean f29515h;

    /* renamed from: i */
    public final int f29516i;

    /* renamed from: j */
    public long f29517j = 0;

    public ChannelMessage(int i, ByteBuffer byteBuffer, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4) {
        this.f29509b = i;
        this.f29510c = byteBuffer;
        this.f29512e = z;
        this.f29513f = z2;
        this.f29514g = z3;
        this.f29515h = z4;
        this.f29516i = i3;
        this.f29511d = i2;
        this.f29508a = i4;
    }

    /* renamed from: a */
    public final void mo17393a(long j) {
        bmxy.m108600b(j > 0);
        this.f29517j = j;
    }

    /* renamed from: a */
    public final boolean mo17394a() {
        return this.f29517j != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29509b);
        parcel.writeStrongBinder(ojq.m28926a(this.f29510c).asBinder());
        parcel.writeInt(this.f29511d);
        parcel.writeByte(this.f29512e ? (byte) 1 : 0);
        parcel.writeByte(this.f29513f ? (byte) 1 : 0);
        parcel.writeByte(this.f29514g ? (byte) 1 : 0);
        parcel.writeByte(this.f29515h ? (byte) 1 : 0);
        parcel.writeInt(this.f29516i);
        parcel.writeInt(this.f29508a);
    }
}
