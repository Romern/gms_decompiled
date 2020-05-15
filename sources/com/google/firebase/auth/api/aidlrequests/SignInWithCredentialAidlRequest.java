package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInWithCredentialAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkk();

    /* renamed from: a */
    public final VerifyAssertionRequest f152456a;

    public SignInWithCredentialAidlRequest(VerifyAssertionRequest verifyAssertionRequest) {
        this.f152456a = verifyAssertionRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f152456a, i, false);
        see.m35062b(parcel, a);
    }
}
