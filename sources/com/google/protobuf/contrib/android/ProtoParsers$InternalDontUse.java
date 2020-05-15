package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bxzk();

    /* renamed from: a */
    public volatile byte[] f191792a;

    /* renamed from: b */
    public volatile bxxc f191793b;

    public ProtoParsers$InternalDontUse(byte[] bArr, bxxc bxxc) {
        boolean z = true;
        if (bArr == null && bxxc == null) {
            z = false;
        }
        bmxy.m108589a(z, "Must have a message or bytes");
        this.f191792a = bArr;
        this.f191793b = bxxc;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f191792a == null) {
            byte[] bArr = new byte[this.f191793b.mo74145db()];
            try {
                this.f191793b.mo73644a(bxuk.m123637a(bArr));
                this.f191792a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.f191792a.length);
        parcel.writeByteArray(this.f191792a);
    }
}
