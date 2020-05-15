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
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new xyj();

    /* renamed from: a */
    public final Integer f31923a;

    /* renamed from: b */
    public final Double f31924b;

    /* renamed from: c */
    public final Uri f31925c;

    /* renamed from: d */
    public final List f31926d;

    /* renamed from: e */
    public final List f31927e;

    /* renamed from: f */
    public final ChannelIdValue f31928f;

    /* renamed from: g */
    public final String f31929g;

    /* renamed from: h */
    public Set f31930h;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f31923a = num;
        this.f31924b = d;
        this.f31925c = uri;
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "empty list of register requests is provided");
        this.f31926d = list;
        this.f31927e = list2;
        this.f31928f = channelIdValue;
        Uri uri2 = this.f31925c;
        HashSet hashSet = new HashSet();
        if (uri2 != null) {
            hashSet.add(uri2);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RegisterRequest registerRequest = (RegisterRequest) list.get(i);
            if (uri2 == null && registerRequest.f31922d == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            sdo.m34975b(z3, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.f31922d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i2);
            if (uri2 == null && registeredKey.f31935b == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            sdo.m34975b(z2, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.f31935b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        this.f31930h = hashSet;
        sdo.m34975b((str == null || str.length() <= 80) ? true : z4, "Display Hint cannot be longer than 80 characters");
        this.f31929g = str;
    }

    /* renamed from: a */
    public final Integer mo18800a() {
        return this.f31923a;
    }

    /* renamed from: b */
    public final Double mo18801b() {
        return this.f31924b;
    }

    /* renamed from: c */
    public final Set mo18802c() {
        return this.f31930h;
    }

    /* renamed from: d */
    public final ChannelIdValue mo18803d() {
        return this.f31928f;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterRequestParams) {
            RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
            return sdg.m34949a(this.f31923a, registerRequestParams.f31923a) && sdg.m34949a(this.f31924b, registerRequestParams.f31924b) && sdg.m34949a(this.f31925c, registerRequestParams.f31925c) && sdg.m34949a(this.f31926d, registerRequestParams.f31926d) && (((list = this.f31927e) == null && registerRequestParams.f31927e == null) || (list != null && (list2 = registerRequestParams.f31927e) != null && list.containsAll(list2) && registerRequestParams.f31927e.containsAll(this.f31927e))) && sdg.m34949a(this.f31928f, registerRequestParams.f31928f) && sdg.m34949a(this.f31929g, registerRequestParams.f31929g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31923a, this.f31925c, this.f31924b, this.f31926d, this.f31927e, this.f31928f, this.f31929g});
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
        see.m35044a(parcel, 2, this.f31923a);
        see.m35042a(parcel, 3, this.f31924b);
        see.m35040a(parcel, 4, this.f31925c, i, false);
        see.m35066c(parcel, 5, this.f31926d, false);
        see.m35066c(parcel, 6, this.f31927e, false);
        see.m35040a(parcel, 7, this.f31928f, i, false);
        see.m35046a(parcel, 8, this.f31929g, false);
        see.m35062b(parcel, a);
    }
}
