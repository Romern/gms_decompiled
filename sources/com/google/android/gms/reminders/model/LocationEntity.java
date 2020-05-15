package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationEntity extends AbstractSafeParcelable implements Location {
    public static final Parcelable.Creator CREATOR = new aotq();

    /* renamed from: a */
    public final Double f107138a;

    /* renamed from: b */
    public final Double f107139b;

    /* renamed from: c */
    public final String f107140c;

    /* renamed from: d */
    public final Integer f107141d;

    /* renamed from: e */
    public final Integer f107142e;

    /* renamed from: f */
    public final FeatureIdProtoEntity f107143f;

    /* renamed from: g */
    public final String f107144g;

    /* renamed from: h */
    public final AddressEntity f107145h;

    /* renamed from: i */
    public final String f107146i;

    public LocationEntity(Location location) {
        Double c = location.mo58655c();
        Double d = location.mo58656d();
        String f = location.mo58658f();
        Integer g = location.mo58659g();
        Integer h = location.mo58660h();
        FeatureIdProto i = location.mo58661i();
        String j = location.mo58662j();
        Address k = location.mo58663k();
        String l = location.mo58664l();
        this.f107138a = c;
        this.f107139b = d;
        this.f107140c = f;
        this.f107141d = g;
        this.f107142e = h;
        this.f107144g = j;
        this.f107146i = l;
        AddressEntity addressEntity = null;
        this.f107143f = i != null ? new FeatureIdProtoEntity(i) : null;
        this.f107145h = k != null ? new AddressEntity(k) : addressEntity;
    }

    /* renamed from: a */
    public static int m92078a(Location location) {
        return Arrays.hashCode(new Object[]{location.mo58655c(), location.mo58656d(), location.mo58658f(), location.mo58659g(), location.mo58660h(), location.mo58661i(), location.mo58662j(), location.mo58663k(), location.mo58664l()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Double mo58655c() {
        return this.f107138a;
    }

    /* renamed from: d */
    public final Double mo58656d() {
        return this.f107139b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this != obj) {
            return m92079a(this, (Location) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58658f() {
        return this.f107140c;
    }

    /* renamed from: g */
    public final Integer mo58659g() {
        return this.f107141d;
    }

    /* renamed from: h */
    public final Integer mo58660h() {
        return this.f107142e;
    }

    public final int hashCode() {
        return m92078a(this);
    }

    /* renamed from: i */
    public final FeatureIdProto mo58661i() {
        return this.f107143f;
    }

    /* renamed from: j */
    public final String mo58662j() {
        return this.f107144g;
    }

    /* renamed from: k */
    public final Address mo58663k() {
        return this.f107145h;
    }

    /* renamed from: l */
    public final String mo58664l() {
        return this.f107146i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotq.m69508a(this, parcel, i);
    }

    /* renamed from: a */
    public static boolean m92079a(Location location, Location location2) {
        return sdg.m34949a(location.mo58655c(), location2.mo58655c()) && sdg.m34949a(location.mo58656d(), location2.mo58656d()) && sdg.m34949a(location.mo58658f(), location2.mo58658f()) && sdg.m34949a(location.mo58659g(), location2.mo58659g()) && sdg.m34949a(location.mo58660h(), location2.mo58660h()) && sdg.m34949a(location.mo58661i(), location2.mo58661i()) && sdg.m34949a(location.mo58662j(), location2.mo58662j()) && sdg.m34949a(location.mo58663k(), location2.mo58663k()) && sdg.m34949a(location.mo58664l(), location2.mo58664l());
    }

    public LocationEntity(Double d, Double d2, String str, Integer num, Integer num2, FeatureIdProtoEntity featureIdProtoEntity, String str2, AddressEntity addressEntity, String str3) {
        this.f107138a = d;
        this.f107139b = d2;
        this.f107140c = str;
        this.f107141d = num;
        this.f107142e = num2;
        this.f107143f = featureIdProtoEntity;
        this.f107144g = str2;
        this.f107145h = addressEntity;
        this.f107146i = str3;
    }
}
