package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetUpBiometricAuthenticationKeysServiceResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awwf();

    /* renamed from: a */
    public final SetUpBiometricAuthenticationKeysResponse f110386a;

    /* renamed from: b */
    public final Status f110387b;

    public SetUpBiometricAuthenticationKeysServiceResponse(SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Status status) {
        this.f110386a = setUpBiometricAuthenticationKeysResponse;
        this.f110387b = status;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(sef.m35074a(this.f110386a));
        parcel.writeParcelable(this.f110387b, i);
    }
}
