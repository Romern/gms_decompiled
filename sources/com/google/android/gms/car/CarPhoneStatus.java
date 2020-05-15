package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarPhoneStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nmc();

    /* renamed from: a */
    public CarCall[] f29355a;

    /* renamed from: b */
    public int f29356b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CarCall extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new nmb();

        /* renamed from: a */
        public int f29357a;

        /* renamed from: b */
        public int f29358b;

        /* renamed from: c */
        public String f29359c;

        /* renamed from: d */
        public String f29360d;

        /* renamed from: e */
        public String f29361e;

        /* renamed from: f */
        public byte[] f29362f;

        public CarCall() {
        }

        public CarCall(int i, int i2, String str, String str2, String str3, byte[] bArr) {
            this.f29357a = i;
            this.f29359c = str;
            this.f29358b = i2;
            this.f29360d = str2;
            this.f29361e = str3;
            this.f29362f = bArr;
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
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, byte[], boolean):void
         arg types: [android.os.Parcel, int, byte[], int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f29357a);
            see.m35063b(parcel, 2, this.f29358b);
            see.m35046a(parcel, 3, this.f29359c, false);
            see.m35046a(parcel, 4, this.f29360d, false);
            see.m35046a(parcel, 5, this.f29361e, false);
            see.m35052a(parcel, 6, this.f29362f, false);
            see.m35062b(parcel, a);
        }
    }

    public CarPhoneStatus() {
    }

    public CarPhoneStatus(CarCall[] carCallArr, int i) {
        this.f29355a = carCallArr;
        this.f29356b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f29355a, i);
        see.m35063b(parcel, 2, this.f29356b);
        see.m35062b(parcel, a);
    }
}
