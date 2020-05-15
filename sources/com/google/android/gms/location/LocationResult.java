package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aeib();

    /* renamed from: a */
    public static final List f79357a = Collections.emptyList();

    /* renamed from: b */
    public final List f79358b;

    public LocationResult(List list) {
        this.f79358b = list;
    }

    /* renamed from: a */
    public static LocationResult m66865a(List list) {
        if (list == null) {
            list = f79357a;
        }
        return new LocationResult(list);
    }

    /* renamed from: b */
    public static LocationResult m66867b(Intent intent) {
        if (m66866a(intent)) {
            return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.f79358b.size() == this.f79358b.size()) {
                Iterator it = this.f79358b.iterator();
                for (Location location : locationResult.f79358b) {
                    if (((Location) it.next()).getTime() != location.getTime()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location location : this.f79358b) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79358b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m66866a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79358b, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Location mo43561a() {
        int size = this.f79358b.size();
        if (size != 0) {
            return (Location) this.f79358b.get(size - 1);
        }
        return null;
    }
}
