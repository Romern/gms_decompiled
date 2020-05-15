package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hvm();

    /* renamed from: a */
    public final String f10248a;

    /* renamed from: b */
    public final String f10249b;

    /* renamed from: c */
    public final String f10250c;

    /* renamed from: d */
    public final String f10251d;

    /* renamed from: e */
    public final Uri f10252e;

    /* renamed from: f */
    public final String f10253f;

    /* renamed from: g */
    public final String f10254g;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        sdo.m34977c(str);
        this.f10248a = str;
        this.f10249b = str2;
        this.f10250c = str3;
        this.f10251d = str4;
        this.f10252e = uri;
        this.f10253f = str5;
        this.f10254g = str6;
    }

    /* renamed from: a */
    public final int mo7495a() {
        int i;
        if (!TextUtils.isEmpty(this.f10249b)) {
            i = 2;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(this.f10250c)) {
            i++;
        }
        if (!TextUtils.isEmpty(this.f10251d)) {
            i++;
        }
        return (this.f10252e == null || Uri.EMPTY.equals(this.f10252e)) ? i : i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInCredential) {
            SignInCredential signInCredential = (SignInCredential) obj;
            if (!sdg.m34949a(this.f10248a, signInCredential.f10248a) || !sdg.m34949a(this.f10249b, signInCredential.f10249b) || !sdg.m34949a(this.f10250c, signInCredential.f10250c) || !sdg.m34949a(this.f10251d, signInCredential.f10251d) || !sdg.m34949a(this.f10252e, signInCredential.f10252e) || !sdg.m34949a(this.f10253f, signInCredential.f10253f) || !sdg.m34949a(this.f10254g, signInCredential.f10254g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10248a, this.f10249b, this.f10250c, this.f10251d, this.f10252e, this.f10253f, this.f10254g});
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
        see.m35046a(parcel, 1, this.f10248a, false);
        see.m35046a(parcel, 2, this.f10249b, false);
        see.m35046a(parcel, 3, this.f10250c, false);
        see.m35046a(parcel, 4, this.f10251d, false);
        see.m35040a(parcel, 5, this.f10252e, i, false);
        see.m35046a(parcel, 6, this.f10253f, false);
        see.m35046a(parcel, 7, this.f10254g, false);
        see.m35062b(parcel, a);
    }
}
