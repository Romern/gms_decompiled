package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fra();

    /* renamed from: a */
    public final int f9547a;

    /* renamed from: b */
    final Bundle f9548b;

    public Feature(int i) {
        this(i, new Bundle());
    }

    /* renamed from: a */
    public static Feature m6140a(int i, Feature[] featureArr) {
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                if (feature.f9547a == i) {
                    return feature;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (this.f9547a == feature.f9547a) {
                Bundle bundle = this.f9548b;
                if (bundle == null) {
                    return feature.f9548b == null;
                }
                if (feature.f9548b != null && bundle.size() == feature.f9548b.size()) {
                    for (String str : this.f9548b.keySet()) {
                        if (!feature.f9548b.containsKey(str) || !sdg.m34949a(this.f9548b.getString(str), feature.f9548b.getString(str))) {
                            return false;
                        }
                        while (r1.hasNext()) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f9547a));
        Bundle bundle = this.f9548b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                arrayList.add(this.f9548b.getString(str));
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    public Feature(int i, Bundle bundle) {
        this.f9547a = i;
        this.f9548b = bundle;
    }

    /* renamed from: a */
    public static void m6141a(List list, Feature feature) {
        if (feature != null) {
            int i = 0;
            while (i < list.size()) {
                int i2 = ((Feature) list.get(i)).f9547a;
                int i3 = feature.f9547a;
                if (i2 != i3) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Feature ");
                    sb.append(i3);
                    sb.append(" already exists");
                    throw new IllegalStateException(sb.toString());
                }
            }
            list.add(feature);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f9547a);
        see.m35037a(parcel, 2, this.f9548b, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final String mo7177a(String str) {
        return this.f9548b.getString(str);
    }

    /* renamed from: a */
    public final void mo7178a(String str, String str2) {
        this.f9548b.putString(str, str2);
    }
}
