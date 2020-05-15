package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyInvalidationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ipd();

    /* renamed from: a */
    final int f10539a;

    /* renamed from: b */
    public final Status f10540b;

    public KeyInvalidationResult(int i, Status status) {
        this.f10539a = i;
        this.f10540b = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10539a);
        see.m35040a(parcel, 2, this.f10540b, i, false);
        see.m35062b(parcel, a);
    }
}
