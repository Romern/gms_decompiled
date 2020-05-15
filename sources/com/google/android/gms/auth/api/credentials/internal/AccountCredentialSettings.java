package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountCredentialSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hhz();

    /* renamed from: a */
    public final boolean f10134a;

    /* renamed from: b */
    public final boolean f10135b;

    /* renamed from: c */
    public final List f10136c;

    /* renamed from: d */
    public final boolean f10137d;

    public AccountCredentialSettings(boolean z, boolean z2, List list, boolean z3) {
        this.f10134a = z;
        this.f10135b = z2;
        sdo.m34959a(list);
        this.f10136c = bngx.m109368a((Collection) list);
        this.f10137d = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f10134a);
        see.m35051a(parcel, 2, this.f10135b);
        see.m35065b(parcel, 3, this.f10136c, false);
        see.m35051a(parcel, 4, this.f10137d);
        see.m35062b(parcel, a);
    }
}
