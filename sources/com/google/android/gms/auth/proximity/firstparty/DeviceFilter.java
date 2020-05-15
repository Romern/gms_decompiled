package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jor();

    /* renamed from: a */
    final Boolean f11157a;

    /* renamed from: b */
    final Boolean f11158b;

    /* renamed from: c */
    final Boolean f11159c;

    /* renamed from: d */
    final List f11160d;

    /* renamed from: e */
    final Boolean f11161e;

    /* renamed from: f */
    final Boolean f11162f;

    /* renamed from: g */
    final List f11163g;

    /* renamed from: h */
    final List f11164h;

    public DeviceFilter(Boolean bool, Boolean bool2, Boolean bool3, List list, Boolean bool4, Boolean bool5, List list2, List list3) {
        this.f11157a = bool;
        this.f11158b = bool2;
        this.f11159c = bool3;
        this.f11160d = list;
        this.f11161e = bool4;
        this.f11162f = bool5;
        this.f11163g = list2;
        this.f11164h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceFilter deviceFilter = (DeviceFilter) obj;
            Boolean bool = this.f11157a;
            if (bool == null ? deviceFilter.f11157a != null : !bool.equals(deviceFilter.f11157a)) {
                return false;
            }
            Boolean bool2 = this.f11158b;
            if (bool2 == null ? deviceFilter.f11158b != null : !bool2.equals(deviceFilter.f11158b)) {
                return false;
            }
            Boolean bool3 = this.f11159c;
            if (bool3 == null ? deviceFilter.f11159c != null : !bool3.equals(deviceFilter.f11159c)) {
                return false;
            }
            Boolean bool4 = this.f11161e;
            if (bool4 == null ? deviceFilter.f11161e != null : !bool4.equals(deviceFilter.f11161e)) {
                return false;
            }
            Boolean bool5 = this.f11162f;
            if (bool5 == null ? deviceFilter.f11162f == null : bool5.equals(deviceFilter.f11162f)) {
                return this.f11160d.equals(deviceFilter.f11160d) && this.f11164h.size() == deviceFilter.f11164h.size() && this.f11164h.containsAll(deviceFilter.f11164h) && this.f11163g.size() == deviceFilter.f11163g.size() && this.f11163g.containsAll(deviceFilter.f11163g);
            }
            return false;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11157a, this.f11158b, this.f11159c, this.f11160d, this.f11161e, this.f11162f, this.f11163g, this.f11164h});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35041a(parcel, 1, this.f11157a);
        see.m35041a(parcel, 2, this.f11158b);
        see.m35041a(parcel, 3, this.f11159c);
        see.m35065b(parcel, 4, this.f11160d, false);
        see.m35041a(parcel, 5, this.f11161e);
        see.m35041a(parcel, 6, this.f11162f);
        see.m35065b(parcel, 7, this.f11163g, false);
        see.m35065b(parcel, 8, this.f11164h, false);
        see.m35062b(parcel, a);
    }
}
