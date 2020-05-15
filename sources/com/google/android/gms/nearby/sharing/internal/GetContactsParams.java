package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajxu();

    /* renamed from: a */
    public ajyj f81078a;

    /* renamed from: b */
    public int f81079b;

    /* renamed from: c */
    public int f81080c;

    /* renamed from: d */
    public ContactFilter f81081d;

    public GetContactsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsParams) {
            GetContactsParams getContactsParams = (GetContactsParams) obj;
            return sdg.m34949a(this.f81078a, getContactsParams.f81078a) && sdg.m34949a(Integer.valueOf(this.f81079b), Integer.valueOf(getContactsParams.f81079b)) && sdg.m34949a(Integer.valueOf(this.f81080c), Integer.valueOf(getContactsParams.f81080c)) && sdg.m34949a(this.f81081d, getContactsParams.f81081d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81078a, Integer.valueOf(this.f81079b), Integer.valueOf(this.f81080c), this.f81081d});
    }

    public GetContactsParams(IBinder iBinder, int i, int i2, ContactFilter contactFilter) {
        ajyj ajyj;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
            ajyj = queryLocalInterface instanceof ajyj ? (ajyj) queryLocalInterface : new ajyh(iBinder);
        } else {
            ajyj = null;
        }
        this.f81078a = ajyj;
        this.f81079b = i;
        this.f81080c = i2;
        this.f81081d = contactFilter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81078a.asBinder());
        see.m35063b(parcel, 2, this.f81079b);
        see.m35063b(parcel, 3, this.f81080c);
        see.m35040a(parcel, 4, this.f81081d, i, false);
        see.m35062b(parcel, a);
    }
}
