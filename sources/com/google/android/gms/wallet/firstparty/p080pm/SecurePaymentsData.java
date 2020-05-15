package com.google.android.gms.wallet.firstparty.p080pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecurePaymentsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awli();

    /* renamed from: a */
    public int f110174a;

    /* renamed from: b */
    public String f110175b;

    public SecurePaymentsData(int i, String str) {
        boolean z;
        this.f110174a = i;
        this.f110175b = str;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "SecurePaymentsData.key must be > 0");
        sdo.m34975b(str == null ? false : z2, "SecurePaymentsData.value must not be null");
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
        see.m35063b(parcel, 2, this.f110174a);
        see.m35046a(parcel, 3, this.f110175b, false);
        see.m35062b(parcel, a);
    }
}
