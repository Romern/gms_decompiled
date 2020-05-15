package com.google.android.gms.tapandpay.firstparty;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ValuableInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aspi();

    /* renamed from: a */
    public String f108481a;

    /* renamed from: b */
    public String f108482b;

    /* renamed from: c */
    public String f108483c;

    /* renamed from: d */
    public Uri f108484d;

    /* renamed from: e */
    public int f108485e;

    /* renamed from: f */
    public int f108486f;

    /* renamed from: g */
    public int f108487g;

    /* renamed from: h */
    public Uri f108488h;

    /* renamed from: i */
    public Uri f108489i;

    /* renamed from: j */
    public String f108490j;

    /* renamed from: k */
    public String f108491k;

    /* renamed from: l */
    public String f108492l;

    /* renamed from: m */
    public Bitmap f108493m;

    /* renamed from: n */
    public Bitmap f108494n;

    /* renamed from: o */
    public Bitmap f108495o;

    /* renamed from: p */
    public int f108496p;

    /* renamed from: q */
    public String f108497q;

    public ValuableInfo(String str, String str2, String str3, Uri uri, int i, int i2, int i3, Uri uri2, Uri uri3, String str4, String str5, String str6, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i4, String str7) {
        this.f108481a = str;
        this.f108482b = str2;
        this.f108483c = str3;
        this.f108484d = uri;
        this.f108485e = i;
        this.f108486f = i2;
        this.f108487g = i3;
        this.f108488h = uri2;
        this.f108489i = uri3;
        this.f108490j = str4;
        this.f108491k = str5;
        this.f108492l = str6;
        this.f108493m = bitmap;
        this.f108494n = bitmap2;
        this.f108495o = bitmap3;
        this.f108496p = i4;
        this.f108497q = str7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ValuableInfo) {
            ValuableInfo valuableInfo = (ValuableInfo) obj;
            if (!sdg.m34949a(this.f108481a, valuableInfo.f108481a) || !sdg.m34949a(this.f108482b, valuableInfo.f108482b) || !sdg.m34949a(this.f108483c, valuableInfo.f108483c) || !sdg.m34949a(this.f108484d, valuableInfo.f108484d) || this.f108485e != valuableInfo.f108485e || this.f108486f != valuableInfo.f108486f || this.f108487g != valuableInfo.f108487g || !sdg.m34949a(this.f108488h, valuableInfo.f108488h) || !sdg.m34949a(this.f108489i, valuableInfo.f108489i) || !sdg.m34949a(this.f108490j, valuableInfo.f108490j) || !sdg.m34949a(this.f108491k, valuableInfo.f108491k) || !sdg.m34949a(this.f108492l, valuableInfo.f108492l) || !sdg.m34949a(this.f108493m, valuableInfo.f108493m) || !sdg.m34949a(this.f108494n, valuableInfo.f108494n) || !sdg.m34949a(this.f108495o, valuableInfo.f108495o) || !sdg.m34949a(Integer.valueOf(this.f108496p), Integer.valueOf(valuableInfo.f108496p)) || !sdg.m34949a(this.f108497q, valuableInfo.f108497q)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108481a, this.f108482b, this.f108483c, this.f108484d, Integer.valueOf(this.f108485e), Integer.valueOf(this.f108486f), Integer.valueOf(this.f108487g), this.f108488h, this.f108489i, this.f108490j, this.f108491k, this.f108492l, this.f108493m, this.f108494n, this.f108495o, Integer.valueOf(this.f108496p), this.f108497q});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("title", this.f108481a);
        a.mo25396a("merchant", this.f108482b);
        a.mo25396a("sideNote", this.f108483c);
        a.mo25396a("logo", this.f108484d);
        a.mo25396a("backgroundColor", Integer.valueOf(this.f108485e));
        a.mo25396a("textColor", Integer.valueOf(this.f108486f));
        a.mo25396a("valuableType", Integer.valueOf(this.f108487g));
        a.mo25396a("heroImage", this.f108488h);
        a.mo25396a("wordmark", this.f108489i);
        a.mo25396a("detailSubtitle", this.f108490j);
        a.mo25396a("footer", this.f108491k);
        a.mo25396a("contentDescription", this.f108492l);
        a.mo25396a("heroImageBitmap", this.f108493m);
        a.mo25396a("wordmarkBitmap", this.f108494n);
        a.mo25396a("logoBitmap", this.f108495o);
        a.mo25396a("payCardArtType", Integer.valueOf(this.f108496p));
        a.mo25396a("cardArtId", this.f108497q);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f108481a, false);
        see.m35046a(parcel, 3, this.f108482b, false);
        see.m35046a(parcel, 4, this.f108483c, false);
        see.m35040a(parcel, 5, this.f108484d, i, false);
        see.m35063b(parcel, 6, this.f108485e);
        see.m35063b(parcel, 7, this.f108486f);
        see.m35063b(parcel, 8, this.f108487g);
        see.m35040a(parcel, 9, this.f108488h, i, false);
        see.m35040a(parcel, 10, this.f108489i, i, false);
        see.m35046a(parcel, 11, this.f108490j, false);
        see.m35046a(parcel, 12, this.f108491k, false);
        see.m35046a(parcel, 13, this.f108492l, false);
        see.m35040a(parcel, 14, this.f108493m, i, false);
        see.m35040a(parcel, 15, this.f108494n, i, false);
        see.m35040a(parcel, 16, this.f108495o, i, false);
        see.m35063b(parcel, 17, this.f108496p);
        see.m35046a(parcel, 18, this.f108497q, false);
        see.m35062b(parcel, a);
    }
}
