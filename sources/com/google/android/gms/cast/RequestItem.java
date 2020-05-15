package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgs();

    /* renamed from: a */
    public final String f29841a;

    /* renamed from: b */
    public final int f29842b;

    /* renamed from: c */
    public final int f29843c;

    /* renamed from: d */
    public final String f29844d;

    public RequestItem(String str, int i, int i2, String str2) {
        this.f29841a = str;
        this.f29842b = i;
        this.f29843c = i2;
        this.f29844d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestItem) {
            RequestItem requestItem = (RequestItem) obj;
            return ptk.m31236a(this.f29841a, requestItem.f29841a) && ptk.m31236a(Integer.valueOf(this.f29842b), Integer.valueOf(requestItem.f29842b)) && ptk.m31236a(Integer.valueOf(this.f29843c), Integer.valueOf(requestItem.f29843c)) && ptk.m31236a(requestItem.f29844d, this.f29844d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29841a, Integer.valueOf(this.f29842b), Integer.valueOf(this.f29843c), this.f29844d});
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
        see.m35046a(parcel, 2, this.f29841a, false);
        see.m35063b(parcel, 3, this.f29842b);
        see.m35063b(parcel, 4, this.f29843c);
        see.m35046a(parcel, 5, this.f29844d, false);
        see.m35062b(parcel, a);
    }
}
