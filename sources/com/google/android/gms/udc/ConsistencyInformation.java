package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsistencyInformation extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new auzn();

    /* renamed from: a */
    public final String f109338a;

    /* renamed from: b */
    public final int f109339b;

    public ConsistencyInformation(String str, int i) {
        this.f109338a = str;
        this.f109339b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConsistencyInformation) {
            ConsistencyInformation consistencyInformation = (ConsistencyInformation) obj;
            return sdg.m34949a(this.f109338a, consistencyInformation.f109338a) && this.f109339b == consistencyInformation.f109339b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109338a, Integer.valueOf(this.f109339b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ConsistencyTokenJar", this.f109338a);
        a.mo25396a("MaxAgeSec", Integer.valueOf(this.f109339b));
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
        see.m35046a(parcel, 2, this.f109338a, false);
        see.m35063b(parcel, 3, this.f109339b);
        see.m35062b(parcel, a);
    }
}
