package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReauthSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iya();

    /* renamed from: a */
    final int f10701a;

    /* renamed from: b */
    public final int f10702b;

    /* renamed from: c */
    public final PasswordSettings f10703c;

    /* renamed from: d */
    public final PinSettings f10704d;

    public ReauthSettingsResponse(int i) {
        this(1, i, null, null);
    }

    public ReauthSettingsResponse(int i, int i2, PasswordSettings passwordSettings, PinSettings pinSettings) {
        this.f10701a = i;
        this.f10702b = i2;
        this.f10703c = passwordSettings;
        this.f10704d = pinSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10701a);
        see.m35063b(parcel, 2, this.f10702b);
        see.m35040a(parcel, 3, this.f10703c, i, false);
        see.m35040a(parcel, 4, this.f10704d, i, false);
        see.m35062b(parcel, a);
    }
}
