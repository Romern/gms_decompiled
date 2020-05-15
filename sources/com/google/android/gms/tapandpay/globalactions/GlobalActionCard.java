package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspr();

    /* renamed from: a */
    public int f108506a;

    /* renamed from: b */
    public String f108507b;

    /* renamed from: c */
    public Bitmap f108508c;

    /* renamed from: d */
    public String f108509d;

    /* renamed from: e */
    public String f108510e;

    /* renamed from: f */
    public String f108511f;

    /* renamed from: g */
    public Bitmap f108512g;

    /* renamed from: h */
    public PendingIntent f108513h;

    public GlobalActionCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            return sdg.m34949a(Integer.valueOf(this.f108506a), Integer.valueOf(globalActionCard.f108506a)) && sdg.m34949a(this.f108507b, globalActionCard.f108507b) && sdg.m34949a(this.f108508c, globalActionCard.f108508c) && sdg.m34949a(this.f108509d, globalActionCard.f108509d) && sdg.m34949a(this.f108510e, globalActionCard.f108510e) && sdg.m34949a(this.f108511f, globalActionCard.f108511f) && sdg.m34949a(this.f108512g, globalActionCard.f108512g) && sdg.m34949a(this.f108513h, globalActionCard.f108513h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108506a), this.f108507b, this.f108508c, this.f108509d, this.f108510e, this.f108511f, this.f108512g, this.f108513h});
    }

    public GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.f108506a = i;
        this.f108507b = str;
        this.f108508c = bitmap;
        this.f108509d = str2;
        this.f108510e = str3;
        this.f108511f = str4;
        this.f108512g = bitmap2;
        this.f108513h = pendingIntent;
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
        see.m35063b(parcel, 1, this.f108506a);
        see.m35046a(parcel, 2, this.f108507b, false);
        see.m35040a(parcel, 3, this.f108508c, i, false);
        see.m35046a(parcel, 4, this.f108509d, false);
        see.m35046a(parcel, 5, this.f108510e, false);
        see.m35040a(parcel, 6, this.f108512g, i, false);
        see.m35040a(parcel, 7, this.f108513h, i, false);
        see.m35046a(parcel, 8, this.f108511f, false);
        see.m35062b(parcel, a);
    }
}
