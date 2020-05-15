package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DirectTransferOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arqo();

    /* renamed from: a */
    public final int f108053a;

    public DirectTransferOptions(int i) {
        this.f108053a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108053a);
        see.m35062b(parcel, a);
    }
}
