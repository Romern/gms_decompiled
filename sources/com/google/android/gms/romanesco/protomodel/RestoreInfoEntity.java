package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RestoreInfoEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apce();

    /* renamed from: a */
    public final String f107246a;

    /* renamed from: b */
    public final Long f107247b;

    public RestoreInfoEntity(String str, Long l) {
        this.f107246a = str;
        this.f107247b = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreInfoEntity)) {
            return false;
        }
        RestoreInfoEntity restoreInfoEntity = (RestoreInfoEntity) obj;
        if (this == restoreInfoEntity) {
            return true;
        }
        if (!sdg.m34949a(restoreInfoEntity.f107246a, this.f107246a) || !sdg.m34949a(restoreInfoEntity.f107247b, this.f107247b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f107246a, this.f107247b});
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
        see.m35046a(parcel, 2, this.f107246a, false);
        see.m35045a(parcel, 3, this.f107247b);
        see.m35062b(parcel, a);
    }
}
