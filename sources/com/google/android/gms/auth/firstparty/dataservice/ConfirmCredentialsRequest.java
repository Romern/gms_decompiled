package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfirmCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwo();

    /* renamed from: a */
    final int f10612a;

    /* renamed from: b */
    public AccountCredentials f10613b;

    /* renamed from: c */
    public CaptchaSolution f10614c;

    public ConfirmCredentialsRequest() {
        this.f10612a = 1;
    }

    public ConfirmCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.f10612a = i;
        this.f10613b = accountCredentials;
        this.f10614c = captchaSolution;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10612a);
        see.m35040a(parcel, 2, this.f10613b, i, false);
        see.m35040a(parcel, 3, this.f10614c, i, false);
        see.m35062b(parcel, a);
    }
}
