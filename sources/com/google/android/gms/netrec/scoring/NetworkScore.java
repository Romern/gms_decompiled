package com.google.android.gms.netrec.scoring;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkScore extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akks();

    /* renamed from: a */
    public final WifiNetworkKey f81185a;

    /* renamed from: b */
    public final RssiScoreCurve f81186b;

    /* renamed from: c */
    public final RssiScoreCurve f81187c;

    /* renamed from: d */
    public final boolean f81188d;

    /* renamed from: e */
    public final Bundle f81189e;

    public NetworkScore(WifiNetworkKey wifiNetworkKey, RssiScoreCurve rssiScoreCurve, boolean z, Bundle bundle, RssiScoreCurve rssiScoreCurve2) {
        this.f81185a = wifiNetworkKey;
        this.f81186b = rssiScoreCurve;
        this.f81188d = z;
        if (bundle != null && bundle.isEmpty()) {
            bundle = null;
        }
        this.f81189e = bundle;
        this.f81187c = rssiScoreCurve2;
    }

    public final String toString() {
        String str;
        sdf a = sdg.m34948a(this);
        a.mo25396a("wifiNetworkKey", this.f81185a);
        a.mo25396a("rssiCurve", this.f81186b);
        a.mo25396a("badgingCurve", this.f81187c);
        a.mo25396a("isMeteredHint", Boolean.valueOf(this.f81188d));
        Bundle bundle = this.f81189e;
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("{");
            for (String str2 : bundle.keySet()) {
                sb.append(str2);
                sb.append(':');
                sb.append(bundle.get(str2));
            }
            sb.append("}");
            str = sb.toString();
        } else {
            str = "(null)";
        }
        a.mo25396a("attributes", str);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81185a, i, false);
        see.m35040a(parcel, 2, this.f81186b, i, false);
        see.m35051a(parcel, 3, this.f81188d);
        see.m35037a(parcel, 4, this.f81189e, false);
        see.m35040a(parcel, 5, this.f81187c, i, false);
        see.m35062b(parcel, a);
    }
}
