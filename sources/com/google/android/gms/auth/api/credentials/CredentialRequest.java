package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gvp();

    /* renamed from: a */
    final int f10104a;

    /* renamed from: b */
    public final boolean f10105b;

    /* renamed from: c */
    public final String[] f10106c;

    /* renamed from: d */
    public final CredentialPickerConfig f10107d;

    /* renamed from: e */
    public final CredentialPickerConfig f10108e;

    /* renamed from: f */
    public final boolean f10109f;

    /* renamed from: g */
    public final String f10110g;

    /* renamed from: h */
    public final String f10111h;

    /* renamed from: i */
    public final boolean f10112i;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f10104a = i;
        this.f10105b = z;
        this.f10106c = (String[]) sdo.m34959a(strArr);
        this.f10107d = credentialPickerConfig == null ? gvn.m14019a() : credentialPickerConfig;
        this.f10108e = credentialPickerConfig2 == null ? gvn.m14019a() : credentialPickerConfig2;
        if (i < 3) {
            this.f10109f = true;
            this.f10110g = null;
            this.f10111h = null;
        } else {
            this.f10109f = z2;
            this.f10110g = str;
            this.f10111h = str2;
        }
        this.f10112i = z3;
    }

    /* renamed from: a */
    public final Set mo7408a() {
        return new HashSet(Arrays.asList(this.f10106c));
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
        see.m35051a(parcel, 1, this.f10105b);
        see.m35058a(parcel, 2, this.f10106c, false);
        see.m35040a(parcel, 3, this.f10107d, i, false);
        see.m35040a(parcel, 4, this.f10108e, i, false);
        see.m35051a(parcel, 5, this.f10109f);
        see.m35046a(parcel, 6, this.f10110g, false);
        see.m35046a(parcel, 7, this.f10111h, false);
        see.m35051a(parcel, 8, this.f10112i);
        see.m35063b(parcel, 1000, this.f10104a);
        see.m35062b(parcel, a);
    }
}
