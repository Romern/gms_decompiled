package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new asmh();

    /* renamed from: G */
    private static final bnic f108333G = bnic.m109490a((Object) 10, (Object) 9);

    /* renamed from: A */
    public long f108334A;

    /* renamed from: B */
    public long f108335B;

    /* renamed from: C */
    public boolean f108336C;

    /* renamed from: D */
    public long f108337D;

    /* renamed from: E */
    public String f108338E;

    /* renamed from: F */
    String f108339F;

    /* renamed from: a */
    public String f108340a;

    /* renamed from: b */
    public byte[] f108341b;

    /* renamed from: c */
    public String f108342c;

    /* renamed from: d */
    public String f108343d;

    /* renamed from: e */
    public int f108344e;

    /* renamed from: f */
    public TokenStatus f108345f;

    /* renamed from: g */
    public String f108346g;

    /* renamed from: h */
    public Uri f108347h;

    /* renamed from: i */
    public int f108348i;

    /* renamed from: j */
    public int f108349j;

    /* renamed from: k */
    public IssuerInfo f108350k;

    /* renamed from: l */
    public String f108351l;

    /* renamed from: m */
    public TransactionInfo f108352m;

    /* renamed from: n */
    public String f108353n;

    /* renamed from: o */
    public byte[] f108354o;

    /* renamed from: p */
    public int f108355p;

    /* renamed from: q */
    int f108356q;

    /* renamed from: r */
    public int f108357r;

    /* renamed from: s */
    public InStoreCvmConfig f108358s;

    /* renamed from: t */
    public InAppCvmConfig f108359t;

    /* renamed from: u */
    public String f108360u;

    /* renamed from: v */
    public OnlineAccountCardLinkInfo[] f108361v;

    /* renamed from: w */
    public boolean f108362w;

    /* renamed from: x */
    public List f108363x;

    /* renamed from: y */
    public boolean f108364y;

    /* renamed from: z */
    public boolean f108365z;

    public CardInfo(String str, byte[] bArr, String str2, String str3, int i, TokenStatus tokenStatus, String str4, Uri uri, int i2, int i3, IssuerInfo issuerInfo, String str5, TransactionInfo transactionInfo, String str6, byte[] bArr2, int i4, int i5, int i6, InStoreCvmConfig inStoreCvmConfig, InAppCvmConfig inAppCvmConfig, String str7, OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr, boolean z, List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str8, String str9) {
        this.f108340a = str;
        this.f108341b = bArr;
        this.f108342c = str2;
        this.f108343d = str3;
        this.f108344e = i;
        this.f108345f = tokenStatus;
        this.f108346g = str4;
        this.f108347h = uri;
        this.f108348i = i2;
        this.f108349j = i3;
        this.f108350k = issuerInfo;
        this.f108351l = str5;
        this.f108352m = transactionInfo;
        this.f108353n = str6;
        this.f108354o = bArr2;
        this.f108355p = i4;
        this.f108356q = i5;
        this.f108357r = i6;
        this.f108358s = inStoreCvmConfig;
        this.f108359t = inAppCvmConfig;
        this.f108360u = str7;
        this.f108361v = onlineAccountCardLinkInfoArr;
        this.f108362w = z;
        this.f108363x = list;
        this.f108364y = z2;
        this.f108365z = z3;
        this.f108334A = j;
        this.f108335B = j2;
        this.f108336C = z4;
        this.f108337D = j3;
        this.f108338E = str8;
        this.f108339F = str9;
    }

    /* renamed from: a */
    public final boolean mo59217a() {
        return f108333G.contains(Integer.valueOf(this.f108344e));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (!sdg.m34949a(this.f108340a, cardInfo.f108340a) || !Arrays.equals(this.f108341b, cardInfo.f108341b) || !sdg.m34949a(this.f108342c, cardInfo.f108342c) || !sdg.m34949a(this.f108343d, cardInfo.f108343d) || this.f108344e != cardInfo.f108344e || !sdg.m34949a(this.f108345f, cardInfo.f108345f) || !sdg.m34949a(this.f108346g, cardInfo.f108346g) || !sdg.m34949a(this.f108347h, cardInfo.f108347h) || this.f108348i != cardInfo.f108348i || this.f108349j != cardInfo.f108349j || !sdg.m34949a(this.f108350k, cardInfo.f108350k) || !sdg.m34949a(this.f108351l, cardInfo.f108351l) || !sdg.m34949a(this.f108352m, cardInfo.f108352m) || this.f108355p != cardInfo.f108355p || this.f108356q != cardInfo.f108356q || this.f108357r != cardInfo.f108357r || !sdg.m34949a(this.f108358s, cardInfo.f108358s) || !sdg.m34949a(this.f108359t, cardInfo.f108359t) || !sdg.m34949a(this.f108360u, cardInfo.f108360u) || !Arrays.equals(this.f108361v, cardInfo.f108361v) || this.f108362w != cardInfo.f108362w || !sdg.m34949a(this.f108363x, cardInfo.f108363x) || this.f108364y != cardInfo.f108364y || this.f108365z != cardInfo.f108365z || this.f108334A != cardInfo.f108334A || this.f108336C != cardInfo.f108336C || this.f108337D != cardInfo.f108337D || !sdg.m34949a(this.f108338E, cardInfo.f108338E) || !sdg.m34949a(this.f108339F, cardInfo.f108339F)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108340a, this.f108341b, this.f108342c, this.f108343d, Integer.valueOf(this.f108344e), this.f108345f, this.f108346g, this.f108347h, Integer.valueOf(this.f108348i), Integer.valueOf(this.f108349j), this.f108351l, this.f108352m, Integer.valueOf(this.f108355p), Integer.valueOf(this.f108356q), Integer.valueOf(this.f108357r), this.f108358s, this.f108359t, this.f108360u, this.f108361v, Boolean.valueOf(this.f108362w), this.f108363x, Boolean.valueOf(this.f108364y), Boolean.valueOf(this.f108365z), Long.valueOf(this.f108334A), Boolean.valueOf(this.f108336C), Long.valueOf(this.f108337D), this.f108338E, this.f108339F});
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        sdf a = sdg.m34948a(this);
        a.mo25396a("billingCardId", this.f108340a);
        byte[] bArr = this.f108341b;
        String str4 = null;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = null;
        }
        a.mo25396a("serverToken", str);
        a.mo25396a("cardholderName", this.f108342c);
        a.mo25396a("displayName", this.f108343d);
        a.mo25396a("cardNetwork", Integer.valueOf(this.f108344e));
        a.mo25396a("tokenStatus", this.f108345f);
        a.mo25396a("panLastDigits", this.f108346g);
        a.mo25396a("cardImageUrl", this.f108347h);
        a.mo25396a("cardColor", Integer.valueOf(this.f108348i));
        a.mo25396a("overlayTextColor", Integer.valueOf(this.f108349j));
        IssuerInfo issuerInfo = this.f108350k;
        if (issuerInfo != null) {
            str2 = issuerInfo.toString();
        } else {
            str2 = null;
        }
        a.mo25396a("issuerInfo", str2);
        a.mo25396a("tokenLastDigits", this.f108351l);
        a.mo25396a("transactionInfo", this.f108352m);
        byte[] bArr2 = this.f108354o;
        if (bArr2 != null) {
            str3 = Arrays.toString(bArr2);
        } else {
            str3 = null;
        }
        a.mo25396a("inAppCardToken", str3);
        a.mo25396a("cachedEligibility", Integer.valueOf(this.f108355p));
        a.mo25396a("paymentProtocol", Integer.valueOf(this.f108356q));
        a.mo25396a("tokenType", Integer.valueOf(this.f108357r));
        a.mo25396a("inStoreCvmConfig", this.f108358s);
        a.mo25396a("inAppCvmConfig", this.f108359t);
        a.mo25396a("tokenDisplayName", this.f108360u);
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.f108361v;
        if (onlineAccountCardLinkInfoArr != null) {
            str4 = Arrays.toString(onlineAccountCardLinkInfoArr);
        }
        a.mo25396a("onlineAccountCardLinkInfos", str4);
        a.mo25396a("allowAidSelection", Boolean.valueOf(this.f108362w));
        String join = TextUtils.join(", ", this.f108363x);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
        sb.append('[');
        sb.append(join);
        sb.append(']');
        a.mo25396a("badges", sb.toString());
        a.mo25396a("upgradeAvailable", Boolean.valueOf(this.f108364y));
        a.mo25396a("requiresSignature", Boolean.valueOf(this.f108365z));
        a.mo25396a("googleTokenId", Long.valueOf(this.f108334A));
        a.mo25396a("isTransit", Boolean.valueOf(this.f108336C));
        a.mo25396a("googleWalletId", Long.valueOf(this.f108337D));
        a.mo25396a("devicePaymentMethodId", this.f108338E);
        a.mo25396a("cloudPaymentMethodId", this.f108339F);
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
        see.m35046a(parcel, 2, this.f108340a, false);
        see.m35052a(parcel, 3, this.f108341b, false);
        see.m35046a(parcel, 4, this.f108342c, false);
        see.m35046a(parcel, 5, this.f108343d, false);
        see.m35063b(parcel, 6, this.f108344e);
        see.m35040a(parcel, 7, this.f108345f, i, false);
        see.m35046a(parcel, 8, this.f108346g, false);
        see.m35040a(parcel, 9, this.f108347h, i, false);
        see.m35063b(parcel, 10, this.f108348i);
        see.m35063b(parcel, 11, this.f108349j);
        see.m35040a(parcel, 12, this.f108350k, i, false);
        see.m35046a(parcel, 13, this.f108351l, false);
        see.m35040a(parcel, 15, this.f108352m, i, false);
        see.m35046a(parcel, 16, this.f108353n, false);
        see.m35052a(parcel, 17, this.f108354o, false);
        see.m35063b(parcel, 18, this.f108355p);
        see.m35063b(parcel, 20, this.f108356q);
        see.m35063b(parcel, 21, this.f108357r);
        see.m35040a(parcel, 22, this.f108358s, i, false);
        see.m35040a(parcel, 23, this.f108359t, i, false);
        see.m35046a(parcel, 24, this.f108360u, false);
        see.m35057a(parcel, 25, this.f108361v, i);
        see.m35051a(parcel, 26, this.f108362w);
        see.m35066c(parcel, 27, this.f108363x, false);
        see.m35051a(parcel, 28, this.f108364y);
        see.m35051a(parcel, 29, this.f108365z);
        see.m35036a(parcel, 30, this.f108334A);
        see.m35036a(parcel, 31, this.f108335B);
        see.m35051a(parcel, 32, this.f108336C);
        see.m35036a(parcel, 33, this.f108337D);
        see.m35046a(parcel, 34, this.f108338E, false);
        see.m35046a(parcel, 35, this.f108339F, false);
        see.m35062b(parcel, a);
    }
}
