package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationRef extends aotf implements Location {

    /* renamed from: f */
    private boolean f107066f = false;

    /* renamed from: g */
    private FeatureIdProtoRef f107067g;

    /* renamed from: h */
    private boolean f107068h = false;

    /* renamed from: i */
    private AddressRef f107069i;

    public LocationRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new LocationEntity(this);
    }

    /* renamed from: c */
    public final Double mo58655c() {
        return mo46857j(mo46858k("lat"));
    }

    /* renamed from: d */
    public final Double mo58656d() {
        return mo46857j(mo46858k("lng"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this != obj) {
            return LocationEntity.m92079a(this, (Location) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58658f() {
        return mo25151d(mo46858k("name"));
    }

    /* renamed from: g */
    public final Integer mo58659g() {
        return mo46856i(mo46858k("radius_meters"));
    }

    /* renamed from: h */
    public final Integer mo58660h() {
        return mo46856i(mo46858k("location_type"));
    }

    public final int hashCode() {
        return LocationEntity.m92078a(this);
    }

    /* renamed from: i */
    public final FeatureIdProto mo58661i() {
        if (!this.f107066f) {
            this.f107066f = true;
            this.f107067g = !FeatureIdProtoRef.m91897a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("location_")) ? new FeatureIdProtoRef(this.f43672a, this.f43673b, this.f83581d.concat("location_")) : null;
        }
        return this.f107067g;
    }

    /* renamed from: j */
    public final String mo58662j() {
        return mo25151d(mo46858k("display_address"));
    }

    /* renamed from: k */
    public final Address mo58663k() {
        if (!this.f107068h) {
            this.f107068h = true;
            this.f107069i = !AddressRef.m91859a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("address_")) ? new AddressRef(this.f43672a, this.f43673b, this.f83581d.concat("address_")) : null;
        }
        return this.f107069i;
    }

    /* renamed from: l */
    public final String mo58664l() {
        return mo25151d(mo46858k("location_alias_id"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotq.m69508a(new LocationEntity(this), parcel, i);
    }
}
