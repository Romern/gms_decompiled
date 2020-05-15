package com.google.android.location.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParcelableByteArray implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bhcp();

    /* renamed from: a */
    public final byte f150970a;

    /* renamed from: b */
    public final byte f150971b;

    /* renamed from: c */
    public final byte[] f150972c;

    public ParcelableByteArray(Parcel parcel) {
        this.f150970a = parcel.readByte();
        this.f150971b = parcel.readByte();
        byte[] bArr = new byte[parcel.readInt()];
        this.f150972c = bArr;
        parcel.readByteArray(bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParcelableByteArray) {
            ParcelableByteArray parcelableByteArray = (ParcelableByteArray) obj;
            return parcelableByteArray.f150970a == this.f150970a && parcelableByteArray.f150971b == this.f150971b && Arrays.equals(parcelableByteArray.f150972c, this.f150972c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f150972c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f150970a);
        parcel.writeByte(this.f150971b);
        byte[] bArr = this.f150972c;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.f150972c);
    }

    public ParcelableByteArray(byte[] bArr) {
        this.f150970a = 0;
        this.f150971b = 0;
        this.f150972c = bArr;
    }
}
