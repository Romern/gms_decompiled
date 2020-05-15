package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adfz();

    /* renamed from: a */
    public final int f79160a;

    /* renamed from: b */
    public final long f79161b;

    /* renamed from: c */
    public final int f79162c;

    /* renamed from: d */
    public final Account f79163d;

    /* renamed from: e */
    public final Account[] f79164e;

    public DiagnosticInfo(int i, long j, int i2, Account account, Account[] accountArr) {
        this.f79160a = i;
        this.f79161b = j;
        this.f79162c = i2;
        this.f79163d = account;
        this.f79164e = accountArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79160a);
        see.m35036a(parcel, 3, this.f79161b);
        see.m35063b(parcel, 4, this.f79162c);
        see.m35040a(parcel, 5, this.f79163d, i, false);
        see.m35057a(parcel, 6, this.f79164e, i);
        see.m35062b(parcel, a);
    }
}
