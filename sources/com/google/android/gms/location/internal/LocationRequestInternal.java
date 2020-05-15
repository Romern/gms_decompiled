package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aekm();

    /* renamed from: a */
    public static final List f79419a = Collections.emptyList();

    /* renamed from: b */
    public LocationRequest f79420b;

    /* renamed from: c */
    public List f79421c;

    /* renamed from: d */
    public String f79422d;

    /* renamed from: e */
    public boolean f79423e;

    /* renamed from: f */
    public boolean f79424f;

    /* renamed from: g */
    public boolean f79425g;

    /* renamed from: h */
    public String f79426h;

    /* renamed from: i */
    public boolean f79427i;

    /* renamed from: j */
    public boolean f79428j;

    /* renamed from: k */
    public String f79429k;

    /* renamed from: l */
    public long f79430l;

    public LocationRequestInternal(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f79420b = locationRequest;
        this.f79421c = list;
        this.f79422d = str;
        this.f79423e = z;
        this.f79424f = z2;
        this.f79425g = z3;
        this.f79426h = str2;
        this.f79427i = z4;
        this.f79428j = z5;
        this.f79429k = str3;
        this.f79430l = j;
    }

    /* renamed from: a */
    public static LocationRequestInternal m66888a(LocationRequestInternal locationRequestInternal) {
        return new LocationRequestInternal(locationRequestInternal.f79420b, locationRequestInternal.f79421c, locationRequestInternal.f79422d, locationRequestInternal.f79423e, locationRequestInternal.f79424f, locationRequestInternal.f79425g, locationRequestInternal.f79426h, locationRequestInternal.f79427i, locationRequestInternal.f79428j, locationRequestInternal.f79429k, locationRequestInternal.f79430l);
    }

    /* renamed from: b */
    public static LocationRequestInternal m66890b(LocationRequestInternal locationRequestInternal) {
        LocationRequestInternal a = m66888a(locationRequestInternal);
        a.mo43613a(new ArrayList(locationRequestInternal.f79421c));
        a.mo43612a(new LocationRequest(locationRequestInternal.f79420b));
        return a;
    }

    /* renamed from: a */
    public final void mo43611a() {
        this.f79425g = true;
    }

    /* renamed from: b */
    public final void mo43614b() {
        this.f79423e = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
            if (!sdg.m34949a(this.f79420b, locationRequestInternal.f79420b) || !sdg.m34949a(this.f79421c, locationRequestInternal.f79421c) || !sdg.m34949a(this.f79422d, locationRequestInternal.f79422d) || this.f79423e != locationRequestInternal.f79423e || this.f79424f != locationRequestInternal.f79424f || this.f79425g != locationRequestInternal.f79425g || !sdg.m34949a(this.f79426h, locationRequestInternal.f79426h) || this.f79427i != locationRequestInternal.f79427i || this.f79428j != locationRequestInternal.f79428j || !sdg.m34949a(this.f79429k, locationRequestInternal.f79429k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79420b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f79420b);
        if (this.f79422d != null) {
            sb.append(" tag=");
            sb.append(this.f79422d);
        }
        if (this.f79426h != null) {
            sb.append(" moduleId=");
            sb.append(this.f79426h);
        }
        if (this.f79429k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f79429k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f79423e);
        sb.append(" clients=");
        sb.append(this.f79421c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f79424f);
        if (this.f79425g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f79427i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f79428j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static LocationRequestInternal m66889a(String str, LocationRequest locationRequest) {
        return new LocationRequestInternal(locationRequest, f79419a, str, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79420b, i, false);
        see.m35066c(parcel, 5, this.f79421c, false);
        see.m35046a(parcel, 6, this.f79422d, false);
        see.m35051a(parcel, 7, this.f79423e);
        see.m35051a(parcel, 8, this.f79424f);
        see.m35051a(parcel, 9, this.f79425g);
        see.m35046a(parcel, 10, this.f79426h, false);
        see.m35051a(parcel, 11, this.f79427i);
        see.m35051a(parcel, 12, this.f79428j);
        see.m35046a(parcel, 13, this.f79429k, false);
        see.m35036a(parcel, 14, this.f79430l);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo43612a(LocationRequest locationRequest) {
        sdo.m34959a(locationRequest);
        this.f79420b = locationRequest;
    }

    /* renamed from: a */
    public final void mo43613a(List list) {
        sdo.m34959a(list);
        this.f79421c = list;
    }
}
