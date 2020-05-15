package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AnnotateCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aprr();

    /* renamed from: a */
    public Status f107450a;

    /* renamed from: b */
    public List f107451b;

    /* renamed from: c */
    public Bundle f107452c;

    public AnnotateCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107450a;
    }

    public AnnotateCall$Response(Status status, List list, Bundle bundle) {
        this.f107450a = status;
        this.f107451b = list;
        this.f107452c = bundle;
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
        see.m35040a(parcel, 1, this.f107450a, i, false);
        see.m35066c(parcel, 2, this.f107451b, false);
        see.m35037a(parcel, 3, this.f107452c, false);
        see.m35062b(parcel, a);
    }
}
