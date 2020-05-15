package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UnregisterSharingProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akbr();

    /* renamed from: a */
    public rnt f81138a;

    /* renamed from: b */
    public ajyk f81139b;

    public UnregisterSharingProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterSharingProviderParams) {
            UnregisterSharingProviderParams unregisterSharingProviderParams = (UnregisterSharingProviderParams) obj;
            return sdg.m34949a(this.f81139b, unregisterSharingProviderParams.f81139b) && sdg.m34949a(this.f81138a, unregisterSharingProviderParams.f81138a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81139b, this.f81138a});
    }

    public UnregisterSharingProviderParams(IBinder iBinder, IBinder iBinder2) {
        ajyk ajyk;
        rnt rnt = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IExternalSharingProvider");
            ajyk = queryLocalInterface instanceof ajyk ? (ajyk) queryLocalInterface : new ajyk(iBinder);
        } else {
            ajyk = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof rnt) {
                rnt = (rnt) queryLocalInterface2;
            } else {
                rnt = new rnr(iBinder2);
            }
        }
        this.f81139b = ajyk;
        this.f81138a = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81139b.f12819a);
        see.m35038a(parcel, 2, this.f81138a.asBinder());
        see.m35062b(parcel, a);
    }
}
