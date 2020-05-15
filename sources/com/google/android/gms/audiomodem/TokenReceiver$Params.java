package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenReceiver$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ges();

    /* renamed from: a */
    public final Encoding[] f9895a;

    public TokenReceiver$Params(Encoding[] encodingArr) {
        this.f9895a = encodingArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f9895a, i);
        see.m35062b(parcel, a);
    }
}
