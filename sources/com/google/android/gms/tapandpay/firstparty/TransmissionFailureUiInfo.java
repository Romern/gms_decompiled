package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransmissionFailureUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspg();

    /* renamed from: a */
    public String f108477a;

    /* renamed from: b */
    public String f108478b;

    /* renamed from: c */
    public String f108479c;

    /* renamed from: d */
    public String f108480d;

    private TransmissionFailureUiInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransmissionFailureUiInfo) {
            TransmissionFailureUiInfo transmissionFailureUiInfo = (TransmissionFailureUiInfo) obj;
            return sdg.m34949a(this.f108477a, transmissionFailureUiInfo.f108477a) && sdg.m34949a(this.f108478b, transmissionFailureUiInfo.f108478b) && sdg.m34949a(this.f108479c, transmissionFailureUiInfo.f108479c) && sdg.m34949a(this.f108480d, transmissionFailureUiInfo.f108480d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108477a, this.f108478b, this.f108479c, this.f108480d});
    }

    public TransmissionFailureUiInfo(String str, String str2, String str3, String str4) {
        this.f108477a = str;
        this.f108478b = str2;
        this.f108479c = str3;
        this.f108480d = str4;
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
        see.m35046a(parcel, 1, this.f108477a, false);
        see.m35046a(parcel, 2, this.f108478b, false);
        see.m35046a(parcel, 3, this.f108479c, false);
        see.m35046a(parcel, 4, this.f108480d, false);
        see.m35062b(parcel, a);
    }
}
