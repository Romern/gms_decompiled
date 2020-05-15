package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gwj();

    /* renamed from: a */
    final int f10113a;

    /* renamed from: b */
    public final CredentialPickerConfig f10114b;

    /* renamed from: c */
    public final boolean f10115c;

    /* renamed from: d */
    public final boolean f10116d;

    /* renamed from: e */
    public final String[] f10117e;

    /* renamed from: f */
    public final boolean f10118f;

    /* renamed from: g */
    public final String f10119g;

    /* renamed from: h */
    public final String f10120h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f10113a = i;
        sdo.m34959a(credentialPickerConfig);
        this.f10114b = credentialPickerConfig;
        this.f10115c = z;
        this.f10116d = z2;
        this.f10117e = (String[]) sdo.m34959a(strArr);
        if (this.f10113a < 2) {
            this.f10118f = true;
            this.f10119g = null;
            this.f10120h = null;
            return;
        }
        this.f10118f = z3;
        this.f10119g = str;
        this.f10120h = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
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
        see.m35040a(parcel, 1, this.f10114b, i, false);
        see.m35051a(parcel, 2, this.f10115c);
        see.m35051a(parcel, 3, this.f10116d);
        see.m35058a(parcel, 4, this.f10117e, false);
        see.m35051a(parcel, 5, this.f10118f);
        see.m35046a(parcel, 6, this.f10119g, false);
        see.m35046a(parcel, 7, this.f10120h, false);
        see.m35063b(parcel, 1000, this.f10113a);
        see.m35062b(parcel, a);
    }
}
