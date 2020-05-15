package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CapabilityInfoParcelable extends AbstractSafeParcelable implements axoj {
    public static final Parcelable.Creator CREATOR = new axqd();

    /* renamed from: a */
    public final String f110898a;

    /* renamed from: b */
    public final List f110899b;

    /* renamed from: c */
    private final Object f110900c = new Object();

    /* renamed from: d */
    private Set f110901d;

    public CapabilityInfoParcelable(String str, List list) {
        this.f110898a = str;
        this.f110899b = list;
        this.f110901d = null;
        sdo.m34959a((Object) str);
        sdo.m34959a(this.f110899b);
    }

    /* renamed from: a */
    public final String mo53306a() {
        return this.f110898a;
    }

    /* renamed from: b */
    public final Set mo53307b() {
        Set set;
        synchronized (this.f110900c) {
            if (this.f110901d == null) {
                this.f110901d = new HashSet(this.f110899b);
            }
            set = this.f110901d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.f110898a;
        if (str == null ? capabilityInfoParcelable.f110898a != null : !str.equals(capabilityInfoParcelable.f110898a)) {
            return false;
        }
        List list = this.f110899b;
        return list == null ? capabilityInfoParcelable.f110899b == null : list.equals(capabilityInfoParcelable.f110899b);
    }

    public final int hashCode() {
        String str = this.f110898a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f110899b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f110898a;
        String valueOf = String.valueOf(this.f110899b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
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
        see.m35046a(parcel, 2, this.f110898a, false);
        see.m35066c(parcel, 3, this.f110899b, false);
        see.m35062b(parcel, a);
    }
}
