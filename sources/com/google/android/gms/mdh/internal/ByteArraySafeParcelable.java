package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ByteArraySafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcr(new afli());

    /* renamed from: a */
    public final byte[] f80014a;

    public ByteArraySafeParcelable(byte[] bArr) {
        this.f80014a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        alcr.m60863a(this, parcel, new aflh());
    }
}
