package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendVerificationCodeAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkh();

    /* renamed from: a */
    public final SendVerificationCodeRequest f152453a;

    public SendVerificationCodeAidlRequest(SendVerificationCodeRequest sendVerificationCodeRequest) {
        this.f152453a = sendVerificationCodeRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f152453a, i, false);
        see.m35062b(parcel, a);
    }
}
