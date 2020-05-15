package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new syj();

    /* renamed from: a */
    public final PhoneNumberVerification[] f30490a;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr) {
        this.f30490a = phoneNumberVerificationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f30490a, i);
        see.m35062b(parcel, a);
    }
}
