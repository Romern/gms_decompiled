package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.LocationGroupEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationGroupRef extends aotf implements LocationGroup {

    /* renamed from: f */
    private boolean f107062f = false;

    /* renamed from: g */
    private ChainInfoRef f107063g;

    /* renamed from: h */
    private boolean f107064h = false;

    /* renamed from: i */
    private CategoryInfoRef f107065i;

    public LocationGroupRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new LocationGroupEntity(this);
    }

    /* renamed from: c */
    public final String mo58649c() {
        return mo25151d(mo46858k("location_query"));
    }

    /* renamed from: d */
    public final Integer mo58650d() {
        return mo46856i(mo46858k("location_query_type"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this != obj) {
            return LocationGroupEntity.m92095a(this, (LocationGroup) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final ChainInfo mo58652f() {
        if (!this.f107062f) {
            this.f107062f = true;
            this.f107063g = !ChainInfoRef.m91874a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new ChainInfoRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107063g;
    }

    /* renamed from: g */
    public final CategoryInfo mo58653g() {
        if (!this.f107064h) {
            this.f107064h = true;
            this.f107065i = !CategoryInfoRef.m91869a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new CategoryInfoRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107065i;
    }

    public final int hashCode() {
        return LocationGroupEntity.m92094a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotr.m69509a(new LocationGroupEntity(this), parcel, i);
    }
}
