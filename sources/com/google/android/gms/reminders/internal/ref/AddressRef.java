package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.AddressEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddressRef extends aotf implements Address {
    public AddressRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91859a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "country"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "locality"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "region"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "street_address"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "street_number"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "street_name"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "postal_code"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "name"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new AddressEntity(this);
    }

    /* renamed from: c */
    public final String mo58606c() {
        return mo25151d(mo46858k("country"));
    }

    /* renamed from: d */
    public final String mo58607d() {
        return mo25151d(mo46858k("locality"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this != obj) {
            return AddressEntity.m91992a(this, (Address) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58609f() {
        return mo25151d(mo46858k("region"));
    }

    /* renamed from: g */
    public final String mo58610g() {
        return mo25151d(mo46858k("street_address"));
    }

    /* renamed from: h */
    public final String mo58611h() {
        return mo25151d(mo46858k("street_number"));
    }

    public final int hashCode() {
        return AddressEntity.m91991a(this);
    }

    /* renamed from: i */
    public final String mo58612i() {
        return mo25151d(mo46858k("street_name"));
    }

    /* renamed from: j */
    public final String mo58613j() {
        return mo25151d(mo46858k("postal_code"));
    }

    /* renamed from: k */
    public final String mo58614k() {
        return mo25151d(mo46858k("name"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotg.m69494a(new AddressEntity(this), parcel);
    }
}
