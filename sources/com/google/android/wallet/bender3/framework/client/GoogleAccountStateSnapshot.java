package com.google.android.wallet.bender3.framework.client;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountStateSnapshot extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bjhj();

    /* renamed from: a */
    public Account[] f151759a;

    public GoogleAccountStateSnapshot() {
    }

    public GoogleAccountStateSnapshot(Account[] accountArr) {
        this.f151759a = accountArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f151759a, i);
        see.m35062b(parcel, a);
    }
}
