package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnlineAccountCardLinkInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asoh();

    /* renamed from: a */
    public int f108414a;

    /* renamed from: b */
    public int f108415b;

    public OnlineAccountCardLinkInfo(int i, int i2) {
        this.f108414a = i;
        this.f108415b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OnlineAccountCardLinkInfo) {
            OnlineAccountCardLinkInfo onlineAccountCardLinkInfo = (OnlineAccountCardLinkInfo) obj;
            return sdg.m34949a(Integer.valueOf(this.f108414a), Integer.valueOf(onlineAccountCardLinkInfo.f108414a)) && sdg.m34949a(Integer.valueOf(this.f108415b), Integer.valueOf(onlineAccountCardLinkInfo.f108415b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108414a), Integer.valueOf(this.f108415b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("accountType", Integer.valueOf(this.f108414a));
        a.mo25396a("status", Integer.valueOf(this.f108415b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108414a);
        see.m35063b(parcel, 2, this.f108415b);
        see.m35062b(parcel, a);
    }
}
