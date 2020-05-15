package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new xyn();

    /* renamed from: a */
    public final Integer f31937a;

    /* renamed from: b */
    public final Double f31938b;

    /* renamed from: c */
    public final Uri f31939c;

    /* renamed from: d */
    public final byte[] f31940d;

    /* renamed from: e */
    public final List f31941e;

    /* renamed from: f */
    public final ChannelIdValue f31942f;

    /* renamed from: g */
    public final String f31943g;

    /* renamed from: h */
    public final Set f31944h;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f31937a = num;
        this.f31938b = d;
        this.f31939c = uri;
        this.f31940d = bArr;
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "registeredKeys must not be null or empty");
        this.f31941e = list;
        this.f31942f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RegisteredKey registeredKey = (RegisteredKey) list.get(i);
            if (registeredKey.f31935b != null) {
                z2 = true;
            } else {
                z2 = uri != null;
            }
            sdo.m34975b(z2, "registered key has null appId and no request appId is provided");
            if (registeredKey.f31936c != null) {
                z3 = true;
            } else {
                z3 = list != null;
            }
            sdo.m34975b(z3, "register request has null challenge and no default challenge isprovided");
            String str2 = registeredKey.f31935b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        this.f31944h = hashSet;
        sdo.m34975b((str == null || str.length() <= 80) ? true : z4, "Display Hint cannot be longer than 80 characters");
        this.f31943g = str;
    }

    /* renamed from: a */
    public final Integer mo18800a() {
        return this.f31937a;
    }

    /* renamed from: b */
    public final Double mo18801b() {
        return this.f31938b;
    }

    /* renamed from: c */
    public final Set mo18802c() {
        return this.f31944h;
    }

    /* renamed from: d */
    public final ChannelIdValue mo18803d() {
        return this.f31942f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignRequestParams) {
            SignRequestParams signRequestParams = (SignRequestParams) obj;
            return sdg.m34949a(this.f31937a, signRequestParams.f31937a) && sdg.m34949a(this.f31938b, signRequestParams.f31938b) && sdg.m34949a(this.f31939c, signRequestParams.f31939c) && Arrays.equals(this.f31940d, signRequestParams.f31940d) && this.f31941e.containsAll(signRequestParams.f31941e) && signRequestParams.f31941e.containsAll(this.f31941e) && sdg.m34949a(this.f31942f, signRequestParams.f31942f) && sdg.m34949a(this.f31943g, signRequestParams.f31943g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31937a, this.f31939c, this.f31938b, this.f31941e, this.f31942f, this.f31943g, Integer.valueOf(Arrays.hashCode(this.f31940d))});
    }

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
        see.m35044a(parcel, 2, this.f31937a);
        see.m35042a(parcel, 3, this.f31938b);
        see.m35040a(parcel, 4, this.f31939c, i, false);
        see.m35052a(parcel, 5, this.f31940d, false);
        see.m35066c(parcel, 6, this.f31941e, false);
        see.m35040a(parcel, 7, this.f31942f, i, false);
        see.m35046a(parcel, 8, this.f31943g, false);
        see.m35062b(parcel, a);
    }
}
