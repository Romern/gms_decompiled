package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetContactsCountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxs();

    /* renamed from: a */
    public ajyn f81076a;

    /* renamed from: b */
    public ContactFilter f81077b;

    public GetContactsCountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsCountParams) {
            GetContactsCountParams getContactsCountParams = (GetContactsCountParams) obj;
            return sdg.m34949a(this.f81076a, getContactsCountParams.f81076a) && sdg.m34949a(this.f81077b, getContactsCountParams.f81077b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81076a, this.f81077b});
    }

    public GetContactsCountParams(IBinder iBinder, ContactFilter contactFilter) {
        ajyn ajyn;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            ajyn = queryLocalInterface instanceof ajyn ? (ajyn) queryLocalInterface : new ajyl(iBinder);
        } else {
            ajyn = null;
        }
        this.f81076a = ajyn;
        this.f81077b = contactFilter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81076a.asBinder());
        see.m35040a(parcel, 2, this.f81077b, i, false);
        see.m35062b(parcel, a);
    }
}
