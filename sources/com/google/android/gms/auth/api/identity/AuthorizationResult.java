package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hur();

    /* renamed from: a */
    public final String f10206a;

    /* renamed from: b */
    public final String f10207b;

    /* renamed from: c */
    public final String f10208c;

    /* renamed from: d */
    public final List f10209d;

    /* renamed from: e */
    public final GoogleSignInAccount f10210e;

    /* renamed from: f */
    public final PendingIntent f10211f;

    public AuthorizationResult(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f10206a = str;
        this.f10207b = str2;
        this.f10208c = str3;
        sdo.m34959a(list);
        this.f10209d = list;
        this.f10211f = pendingIntent;
        this.f10210e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthorizationResult) {
            AuthorizationResult authorizationResult = (AuthorizationResult) obj;
            if (!sdg.m34949a(this.f10206a, authorizationResult.f10206a) || !sdg.m34949a(this.f10207b, authorizationResult.f10207b) || !sdg.m34949a(this.f10208c, authorizationResult.f10208c) || !sdg.m34949a(this.f10209d, authorizationResult.f10209d) || !sdg.m34949a(this.f10211f, authorizationResult.f10211f) || !sdg.m34949a(this.f10210e, authorizationResult.f10210e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10206a, this.f10207b, this.f10208c, this.f10209d, this.f10211f, this.f10210e});
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
        see.m35046a(parcel, 1, this.f10206a, false);
        see.m35046a(parcel, 2, this.f10207b, false);
        see.m35046a(parcel, 3, this.f10208c, false);
        see.m35065b(parcel, 4, this.f10209d, false);
        see.m35040a(parcel, 5, this.f10210e, i, false);
        see.m35040a(parcel, 6, this.f10211f, i, false);
        see.m35062b(parcel, a);
    }
}
