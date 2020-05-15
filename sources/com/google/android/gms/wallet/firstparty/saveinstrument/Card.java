package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awll();

    /* renamed from: a */
    public String f110178a;

    /* renamed from: b */
    public String f110179b;

    /* renamed from: c */
    public int f110180c;

    /* renamed from: d */
    public int f110181d;

    public Card() {
    }

    /* renamed from: a */
    public final String mo59922a() {
        return this.f110178a.replaceAll("[\\s\\-]", "");
    }

    /* renamed from: b */
    public final String mo59923b() {
        String str = this.f110179b;
        if (str != null) {
            return str.replaceAll("[\\s\\-]", "");
        }
        return null;
    }

    public Card(String str, String str2, int i, int i2) {
        this.f110178a = str;
        this.f110179b = str2;
        this.f110180c = i;
        this.f110181d = i2;
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
        see.m35046a(parcel, 1, this.f110178a, false);
        see.m35046a(parcel, 2, this.f110179b, false);
        see.m35063b(parcel, 3, this.f110180c);
        see.m35063b(parcel, 4, this.f110181d);
        see.m35062b(parcel, a);
    }
}
