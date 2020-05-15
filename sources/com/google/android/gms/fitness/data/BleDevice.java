package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ywk();

    /* renamed from: a */
    public final String f31981a;

    /* renamed from: b */
    public final String f31982b;

    /* renamed from: c */
    public final List f31983c;

    /* renamed from: d */
    public final List f31984d;

    public BleDevice(String str, String str2, List list, List list2) {
        this.f31981a = str;
        this.f31982b = str2;
        this.f31983c = Collections.unmodifiableList(list);
        this.f31984d = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BleDevice) {
            BleDevice bleDevice = (BleDevice) obj;
            return this.f31982b.equals(bleDevice.f31982b) && this.f31981a.equals(bleDevice.f31981a) && new HashSet(this.f31983c).equals(new HashSet(bleDevice.f31983c)) && new HashSet(this.f31984d).equals(new HashSet(bleDevice.f31984d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31982b, this.f31981a, this.f31983c, this.f31984d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("name", this.f31982b);
        a.mo25396a("address", this.f31981a);
        a.mo25396a("dataTypes", this.f31984d);
        a.mo25396a("supportedProfiles", this.f31983c);
        return a.toString();
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
        see.m35046a(parcel, 1, this.f31981a, false);
        see.m35046a(parcel, 2, this.f31982b, false);
        see.m35065b(parcel, 3, this.f31983c, false);
        see.m35066c(parcel, 4, this.f31984d, false);
        see.m35062b(parcel, a);
    }

    public BleDevice(String str, String str2, Set set, Set set2) {
        sdo.m34959a((Object) str);
        this.f31981a = str;
        sdo.m34959a((Object) str2);
        this.f31982b = str2;
        sdo.m34959a(set2);
        this.f31984d = new ArrayList(set2);
        sdo.m34959a(set);
        this.f31983c = new ArrayList(set);
    }
}
