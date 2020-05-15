package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aelx();

    /* renamed from: a */
    final int f79486a;

    /* renamed from: b */
    public final String f79487b;

    /* renamed from: c */
    public final String f79488c;

    /* renamed from: d */
    public final String f79489d;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.f79486a = i;
        this.f79487b = str;
        this.f79488c = str2;
        this.f79489d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlaceReport) {
            PlaceReport placeReport = (PlaceReport) obj;
            if (!sdg.m34949a(this.f79487b, placeReport.f79487b) || !sdg.m34949a(this.f79488c, placeReport.f79488c) || !sdg.m34949a(this.f79489d, placeReport.f79489d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79487b, this.f79488c, this.f79489d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("placeId", this.f79487b);
        a.mo25396a("tag", this.f79488c);
        if (!"unknown".equals(this.f79489d)) {
            a.mo25396a("source", this.f79489d);
        }
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
        see.m35063b(parcel, 1, this.f79486a);
        see.m35046a(parcel, 2, this.f79487b, false);
        see.m35046a(parcel, 3, this.f79488c, false);
        see.m35046a(parcel, 4, this.f79489d, false);
        see.m35062b(parcel, a);
    }
}
