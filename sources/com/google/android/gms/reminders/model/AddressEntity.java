package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddressEntity extends AbstractSafeParcelable implements Address {
    public static final Parcelable.Creator CREATOR = new aotg();

    /* renamed from: a */
    public final String f107106a;

    /* renamed from: b */
    public final String f107107b;

    /* renamed from: c */
    public final String f107108c;

    /* renamed from: d */
    public final String f107109d;

    /* renamed from: e */
    public final String f107110e;

    /* renamed from: f */
    public final String f107111f;

    /* renamed from: g */
    public final String f107112g;

    /* renamed from: h */
    public final String f107113h;

    public AddressEntity(Address address) {
        this(address.mo58606c(), address.mo58607d(), address.mo58609f(), address.mo58610g(), address.mo58611h(), address.mo58612i(), address.mo58613j(), address.mo58614k());
    }

    /* renamed from: a */
    public static int m91991a(Address address) {
        return Arrays.hashCode(new Object[]{address.mo58606c(), address.mo58607d(), address.mo58609f(), address.mo58610g(), address.mo58611h(), address.mo58612i(), address.mo58613j(), address.mo58614k()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo58606c() {
        return this.f107106a;
    }

    /* renamed from: d */
    public final String mo58607d() {
        return this.f107107b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this != obj) {
            return m91992a(this, (Address) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58609f() {
        return this.f107108c;
    }

    /* renamed from: g */
    public final String mo58610g() {
        return this.f107109d;
    }

    /* renamed from: h */
    public final String mo58611h() {
        return this.f107110e;
    }

    public final int hashCode() {
        return m91991a(this);
    }

    /* renamed from: i */
    public final String mo58612i() {
        return this.f107111f;
    }

    /* renamed from: j */
    public final String mo58613j() {
        return this.f107112g;
    }

    /* renamed from: k */
    public final String mo58614k() {
        return this.f107113h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotg.m69494a(this, parcel);
    }

    public AddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f107106a = str;
        this.f107107b = str2;
        this.f107108c = str3;
        this.f107109d = str4;
        this.f107110e = str5;
        this.f107111f = str6;
        this.f107112g = str7;
        this.f107113h = str8;
    }

    /* renamed from: a */
    public static boolean m91992a(Address address, Address address2) {
        return sdg.m34949a(address.mo58606c(), address2.mo58606c()) && sdg.m34949a(address.mo58607d(), address2.mo58607d()) && sdg.m34949a(address.mo58609f(), address2.mo58609f()) && sdg.m34949a(address.mo58610g(), address2.mo58610g()) && sdg.m34949a(address.mo58611h(), address2.mo58611h()) && sdg.m34949a(address.mo58612i(), address2.mo58612i()) && sdg.m34949a(address.mo58613j(), address2.mo58613j()) && sdg.m34949a(address.mo58614k(), address2.mo58614k());
    }
}
