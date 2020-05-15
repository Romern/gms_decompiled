package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CustomProperty extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uys();

    /* renamed from: a */
    public final CustomPropertyKey f31068a;

    /* renamed from: b */
    public final String f31069b;

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        sdo.checkIfNull(customPropertyKey, "key");
        this.f31068a = customPropertyKey;
        this.f31069b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            CustomProperty customProperty = (CustomProperty) obj;
            return sdg.m34949a(this.f31068a, customProperty.f31068a) && sdg.m34949a(this.f31069b, customProperty.f31069b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31068a, this.f31069b});
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
        see.m35040a(parcel, 2, this.f31068a, i, false);
        see.m35046a(parcel, 3, this.f31069b, false);
        see.m35062b(parcel, a);
    }
}
