package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Application extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywj();

    /* renamed from: a */
    public static final Application f31979a = new Application("com.google.android.gms");

    /* renamed from: b */
    public final String f31980b;

    public Application(String str) {
        sdo.m34959a((Object) str);
        this.f31980b = str;
    }

    /* renamed from: a */
    public static Application m23661a(String str) {
        return !"com.google.android.gms".equals(str) ? new Application(str) : f31979a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Application) {
            return this.f31980b.equals(((Application) obj).f31980b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31980b.hashCode();
    }

    public final String toString() {
        return String.format("Application{%s}", this.f31980b);
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
        see.m35046a(parcel, 1, this.f31980b, false);
        see.m35062b(parcel, a);
    }
}
