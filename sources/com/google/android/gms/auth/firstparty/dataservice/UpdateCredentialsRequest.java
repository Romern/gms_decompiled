package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iye();

    /* renamed from: a */
    final int f10750a;

    /* renamed from: b */
    public AccountCredentials f10751b;

    /* renamed from: c */
    public CaptchaSolution f10752c;

    public UpdateCredentialsRequest() {
        this.f10750a = 1;
    }

    public UpdateCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.f10750a = i;
        this.f10751b = accountCredentials;
        this.f10752c = captchaSolution;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10750a);
        see.m35040a(parcel, 2, this.f10751b, i, false);
        see.m35040a(parcel, 3, this.f10752c, i, false);
        see.m35062b(parcel, a);
    }
}
