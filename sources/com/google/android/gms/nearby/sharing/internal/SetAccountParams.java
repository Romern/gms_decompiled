package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetAccountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akau();

    /* renamed from: a */
    public Account f81122a;

    /* renamed from: b */
    public rnt f81123b;

    public SetAccountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetAccountParams) {
            SetAccountParams setAccountParams = (SetAccountParams) obj;
            return sdg.m34949a(this.f81122a, setAccountParams.f81122a) && sdg.m34949a(this.f81123b, setAccountParams.f81123b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81122a, this.f81123b});
    }

    public SetAccountParams(Account account, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81122a = account;
        this.f81123b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81122a, i, false);
        see.m35038a(parcel, 2, this.f81123b.asBinder());
        see.m35062b(parcel, a);
    }
}
