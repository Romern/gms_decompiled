package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationGroupEntity extends AbstractSafeParcelable implements LocationGroup {
    public static final Parcelable.Creator CREATOR = new aotr();

    /* renamed from: a */
    public final String f107147a;

    /* renamed from: b */
    public final Integer f107148b;

    /* renamed from: c */
    public final ChainInfoEntity f107149c;

    /* renamed from: d */
    public final CategoryInfoEntity f107150d;

    public LocationGroupEntity(LocationGroup locationGroup) {
        String c = locationGroup.mo58649c();
        Integer d = locationGroup.mo58650d();
        ChainInfo f = locationGroup.mo58652f();
        CategoryInfo g = locationGroup.mo58653g();
        this.f107147a = c;
        this.f107148b = d;
        CategoryInfoEntity categoryInfoEntity = null;
        this.f107149c = f != null ? new ChainInfoEntity(f) : null;
        this.f107150d = g != null ? new CategoryInfoEntity(g) : categoryInfoEntity;
    }

    /* renamed from: a */
    public static int m92094a(LocationGroup locationGroup) {
        return Arrays.hashCode(new Object[]{locationGroup.mo58649c(), locationGroup.mo58650d(), locationGroup.mo58652f(), locationGroup.mo58653g()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo58649c() {
        return this.f107147a;
    }

    /* renamed from: d */
    public final Integer mo58650d() {
        return this.f107148b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this != obj) {
            return m92095a(this, (LocationGroup) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final ChainInfo mo58652f() {
        return this.f107149c;
    }

    /* renamed from: g */
    public final CategoryInfo mo58653g() {
        return this.f107150d;
    }

    public final int hashCode() {
        return m92094a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotr.m69509a(this, parcel, i);
    }

    /* renamed from: a */
    public static boolean m92095a(LocationGroup locationGroup, LocationGroup locationGroup2) {
        return sdg.m34949a(locationGroup.mo58649c(), locationGroup2.mo58649c()) && sdg.m34949a(locationGroup.mo58650d(), locationGroup2.mo58650d()) && sdg.m34949a(locationGroup.mo58652f(), locationGroup2.mo58652f()) && sdg.m34949a(locationGroup.mo58653g(), locationGroup2.mo58653g());
    }

    public LocationGroupEntity(String str, Integer num, ChainInfoEntity chainInfoEntity, CategoryInfoEntity categoryInfoEntity) {
        this.f107147a = str;
        this.f107148b = num;
        this.f107149c = chainInfoEntity;
        this.f107150d = categoryInfoEntity;
    }
}
