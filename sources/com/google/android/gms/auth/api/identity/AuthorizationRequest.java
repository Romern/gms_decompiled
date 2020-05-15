package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new huq();

    /* renamed from: a */
    public final List f10199a;

    /* renamed from: b */
    public final String f10200b;

    /* renamed from: c */
    public final boolean f10201c;

    /* renamed from: d */
    public final boolean f10202d;

    /* renamed from: e */
    public final Account f10203e;

    /* renamed from: f */
    public final String f10204f;

    /* renamed from: g */
    public final String f10205g;

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3) {
        boolean z3 = false;
        if (list != null && !list.isEmpty()) {
            z3 = true;
        }
        sdo.m34975b(z3, "requestedScopes cannot be null or empty");
        this.f10199a = list;
        this.f10200b = str;
        this.f10201c = z;
        this.f10202d = z2;
        this.f10203e = account;
        this.f10204f = str2;
        this.f10205g = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthorizationRequest) {
            AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
            if (this.f10199a.size() != authorizationRequest.f10199a.size() || !this.f10199a.containsAll(authorizationRequest.f10199a) || this.f10201c != authorizationRequest.f10201c || this.f10202d != authorizationRequest.f10202d || !sdg.m34949a(this.f10200b, authorizationRequest.f10200b) || !sdg.m34949a(this.f10203e, authorizationRequest.f10203e) || !sdg.m34949a(this.f10204f, authorizationRequest.f10204f) || !sdg.m34949a(this.f10205g, authorizationRequest.f10205g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10199a, this.f10200b, Boolean.valueOf(this.f10201c), Boolean.valueOf(this.f10202d), this.f10203e, this.f10204f, this.f10205g});
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
        see.m35066c(parcel, 1, this.f10199a, false);
        see.m35046a(parcel, 2, this.f10200b, false);
        see.m35051a(parcel, 3, this.f10201c);
        see.m35051a(parcel, 4, this.f10202d);
        see.m35040a(parcel, 5, this.f10203e, i, false);
        see.m35046a(parcel, 6, this.f10204f, false);
        see.m35046a(parcel, 7, this.f10205g, false);
        see.m35062b(parcel, a);
    }
}
