package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awkn();

    /* renamed from: a */
    public final int f110164a;

    /* renamed from: b */
    public byte[][] f110165b;

    public InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.f110164a = i;
        this.f110165b = bArr;
    }

    public InitializeBuyFlowRequest(byte[]... bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f110164a);
        see.m35060a(parcel, 2, this.f110165b);
        see.m35062b(parcel, a);
    }
}
