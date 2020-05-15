package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwh();

    /* renamed from: a */
    final int f10591a;

    /* renamed from: b */
    public AppDescription f10592b;

    /* renamed from: c */
    public boolean f10593c;

    /* renamed from: d */
    public boolean f10594d;

    /* renamed from: e */
    public CaptchaSolution f10595e;

    /* renamed from: f */
    public AccountCredentials f10596f;

    public AccountSignInRequest() {
        this.f10591a = 1;
    }

    public AccountSignInRequest(int i, AppDescription appDescription, boolean z, boolean z2, CaptchaSolution captchaSolution, AccountCredentials accountCredentials) {
        this.f10591a = i;
        this.f10592b = appDescription;
        this.f10593c = z;
        this.f10594d = z2;
        this.f10595e = captchaSolution;
        this.f10596f = accountCredentials;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10591a);
        see.m35040a(parcel, 2, this.f10592b, i, false);
        see.m35051a(parcel, 3, this.f10593c);
        see.m35051a(parcel, 4, this.f10594d);
        see.m35040a(parcel, 5, this.f10595e, i, false);
        see.m35040a(parcel, 6, this.f10596f, i, false);
        see.m35062b(parcel, a);
    }
}
