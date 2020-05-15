package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayGlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfp();

    /* renamed from: a */
    public int f81543a;

    /* renamed from: b */
    public String f81544b;

    /* renamed from: c */
    public Bitmap f81545c;

    /* renamed from: d */
    public String f81546d;

    /* renamed from: e */
    public String f81547e;

    /* renamed from: f */
    public String f81548f;

    /* renamed from: g */
    public Bitmap f81549g;

    /* renamed from: h */
    public PendingIntent f81550h;

    /* renamed from: i */
    public int f81551i;

    private PayGlobalActionCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayGlobalActionCard) {
            PayGlobalActionCard payGlobalActionCard = (PayGlobalActionCard) obj;
            return sdg.m34949a(Integer.valueOf(this.f81543a), Integer.valueOf(payGlobalActionCard.f81543a)) && sdg.m34949a(this.f81544b, payGlobalActionCard.f81544b) && sdg.m34949a(this.f81545c, payGlobalActionCard.f81545c) && sdg.m34949a(this.f81546d, payGlobalActionCard.f81546d) && sdg.m34949a(this.f81547e, payGlobalActionCard.f81547e) && sdg.m34949a(this.f81548f, payGlobalActionCard.f81548f) && sdg.m34949a(this.f81549g, payGlobalActionCard.f81549g) && sdg.m34949a(this.f81550h, payGlobalActionCard.f81550h) && sdg.m34949a(Integer.valueOf(this.f81551i), Integer.valueOf(payGlobalActionCard.f81551i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81543a), this.f81544b, this.f81545c, this.f81546d, this.f81547e, this.f81548f, this.f81549g, this.f81550h, Integer.valueOf(this.f81551i)});
    }

    public PayGlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent, int i2) {
        this.f81543a = i;
        this.f81544b = str;
        this.f81545c = bitmap;
        this.f81546d = str2;
        this.f81547e = str3;
        this.f81548f = str4;
        this.f81549g = bitmap2;
        this.f81550h = pendingIntent;
        this.f81551i = i2;
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
        see.m35063b(parcel, 1, this.f81543a);
        see.m35046a(parcel, 2, this.f81544b, false);
        see.m35040a(parcel, 3, this.f81545c, i, false);
        see.m35046a(parcel, 4, this.f81546d, false);
        see.m35046a(parcel, 5, this.f81547e, false);
        see.m35040a(parcel, 6, this.f81549g, i, false);
        see.m35040a(parcel, 7, this.f81550h, i, false);
        see.m35046a(parcel, 8, this.f81548f, false);
        see.m35063b(parcel, 9, this.f81551i);
        see.m35062b(parcel, a);
    }
}
