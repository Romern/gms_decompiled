package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new agdt();

    /* renamed from: a */
    public final Bundle f80131a;

    public EventParams(Bundle bundle) {
        this.f80131a = bundle;
    }

    /* renamed from: a */
    public final Bundle mo44007a() {
        return new Bundle(this.f80131a);
    }

    /* renamed from: b */
    public final Long mo44009b(String str) {
        return Long.valueOf(this.f80131a.getLong(str));
    }

    /* renamed from: c */
    public final String mo44010c(String str) {
        return this.f80131a.getString(str);
    }

    public final Iterator iterator() {
        return new agds(this);
    }

    public final String toString() {
        return this.f80131a.toString();
    }

    /* renamed from: a */
    public final Object mo44008a(String str) {
        return this.f80131a.get(str);
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
        see.m35037a(parcel, 2, mo44007a(), false);
        see.m35062b(parcel, a);
    }
}
