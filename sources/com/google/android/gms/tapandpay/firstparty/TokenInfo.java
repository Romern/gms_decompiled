package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asow();

    /* renamed from: a */
    String f108446a;

    /* renamed from: b */
    String f108447b;

    /* renamed from: c */
    int f108448c;

    /* renamed from: d */
    TokenStatus f108449d;

    /* renamed from: e */
    String f108450e;

    /* renamed from: f */
    Uri f108451f;

    /* renamed from: g */
    byte[] f108452g;

    /* renamed from: h */
    OnlineAccountCardLinkInfo[] f108453h;

    /* renamed from: i */
    int f108454i;

    /* renamed from: j */
    boolean f108455j;

    public TokenInfo(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr, int i2, boolean z) {
        this.f108446a = str;
        this.f108447b = str2;
        this.f108448c = i;
        this.f108449d = tokenStatus;
        this.f108450e = str3;
        this.f108451f = uri;
        this.f108452g = bArr;
        this.f108453h = onlineAccountCardLinkInfoArr;
        this.f108454i = i2;
        this.f108455j = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenInfo) {
            TokenInfo tokenInfo = (TokenInfo) obj;
            if (!sdg.m34949a(this.f108446a, tokenInfo.f108446a) || !sdg.m34949a(this.f108447b, tokenInfo.f108447b) || this.f108448c != tokenInfo.f108448c || !sdg.m34949a(this.f108449d, tokenInfo.f108449d) || !sdg.m34949a(this.f108450e, tokenInfo.f108450e) || !sdg.m34949a(this.f108451f, tokenInfo.f108451f) || !Arrays.equals(this.f108452g, tokenInfo.f108452g) || !Arrays.equals(this.f108453h, tokenInfo.f108453h) || this.f108454i != tokenInfo.f108454i || this.f108455j != tokenInfo.f108455j) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108446a, this.f108447b, Integer.valueOf(this.f108448c), this.f108449d, this.f108450e, this.f108451f, this.f108452g, this.f108453h, Integer.valueOf(this.f108454i), Boolean.valueOf(this.f108455j)});
    }

    public final String toString() {
        String str;
        sdf a = sdg.m34948a(this);
        a.mo25396a("billingCardId", this.f108446a);
        a.mo25396a("displayName", this.f108447b);
        a.mo25396a("cardNetwork", Integer.valueOf(this.f108448c));
        a.mo25396a("tokenStatus", this.f108449d);
        a.mo25396a("panLastDigits", this.f108450e);
        a.mo25396a("cardImageUrl", this.f108451f);
        byte[] bArr = this.f108452g;
        String str2 = null;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = null;
        }
        a.mo25396a("inAppCardToken", str);
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.f108453h;
        if (onlineAccountCardLinkInfoArr != null) {
            str2 = Arrays.toString(onlineAccountCardLinkInfoArr);
        }
        a.mo25396a("onlineAccountCardLinkInfos", str2);
        a.mo25396a("tokenType", Integer.valueOf(this.f108454i));
        a.mo25396a("supportsOdaTransit", Boolean.valueOf(this.f108455j));
        return a.toString();
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
        see.m35046a(parcel, 1, this.f108446a, false);
        see.m35046a(parcel, 2, this.f108447b, false);
        see.m35063b(parcel, 3, this.f108448c);
        see.m35040a(parcel, 4, this.f108449d, i, false);
        see.m35046a(parcel, 5, this.f108450e, false);
        see.m35040a(parcel, 6, this.f108451f, i, false);
        see.m35052a(parcel, 7, this.f108452g, false);
        see.m35057a(parcel, 8, this.f108453h, i);
        see.m35063b(parcel, 9, this.f108454i);
        see.m35051a(parcel, 10, this.f108455j);
        see.m35062b(parcel, a);
    }
}
