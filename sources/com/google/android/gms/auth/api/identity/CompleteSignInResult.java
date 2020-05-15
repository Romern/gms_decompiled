package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new huu();

    /* renamed from: a */
    public final SignInCredential f10222a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        sdo.m34959a(signInCredential);
        this.f10222a = signInCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10222a, i, false);
        see.m35062b(parcel, a);
    }
}
