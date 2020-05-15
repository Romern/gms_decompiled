package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapFailureUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asou();

    /* renamed from: a */
    public String f108442a;

    /* renamed from: b */
    public String f108443b;

    /* renamed from: c */
    public String f108444c;

    /* renamed from: d */
    public String f108445d;

    public TapFailureUiInfo(String str, String str2, String str3, String str4) {
        this.f108442a = str;
        this.f108443b = str2;
        this.f108444c = str3;
        this.f108445d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TapFailureUiInfo) {
            TapFailureUiInfo tapFailureUiInfo = (TapFailureUiInfo) obj;
            if (!sdg.m34949a(this.f108442a, tapFailureUiInfo.f108442a) || !sdg.m34949a(this.f108443b, tapFailureUiInfo.f108443b) || !sdg.m34949a(this.f108444c, tapFailureUiInfo.f108444c) || !sdg.m34949a(this.f108445d, tapFailureUiInfo.f108445d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108442a, this.f108443b, this.f108444c, this.f108445d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("errorMessage", this.f108442a);
        a.mo25396a("actionButtonLabel", this.f108443b);
        a.mo25396a("actionButtonIntentAction", this.f108444c);
        a.mo25396a("googleAnalyticsAction", this.f108445d);
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
        see.m35046a(parcel, 1, this.f108442a, false);
        see.m35046a(parcel, 2, this.f108443b, false);
        see.m35046a(parcel, 3, this.f108444c, false);
        see.m35046a(parcel, 4, this.f108445d, false);
        see.m35062b(parcel, a);
    }
}
