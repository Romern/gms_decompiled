package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SaveRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hir();

    /* renamed from: a */
    public final Credential f10141a;

    public SaveRequest(Credential credential) {
        this.f10141a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10141a, i, false);
        see.m35062b(parcel, a);
    }
}
