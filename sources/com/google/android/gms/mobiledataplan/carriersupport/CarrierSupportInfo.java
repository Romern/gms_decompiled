package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqc();

    /* renamed from: a */
    public String f80259a;

    /* renamed from: b */
    public String f80260b;

    /* renamed from: c */
    public CarrierSupportChannel[] f80261c;

    public CarrierSupportInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            return sdg.m34949a(this.f80259a, carrierSupportInfo.f80259a) && sdg.m34949a(this.f80260b, carrierSupportInfo.f80260b) && Arrays.equals(this.f80261c, carrierSupportInfo.f80261c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80259a, this.f80260b, Integer.valueOf(Arrays.hashCode(this.f80261c))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("TitleMessage", this.f80259a);
        a.mo25396a("LanguageCode", this.f80260b);
        a.mo25396a("SupportChannels", Arrays.toString(this.f80261c));
        return a.toString();
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.f80259a = str;
        this.f80260b = str2;
        this.f80261c = carrierSupportChannelArr;
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
        see.m35046a(parcel, 1, this.f80259a, false);
        see.m35046a(parcel, 2, this.f80260b, false);
        see.m35057a(parcel, 3, this.f80261c, i);
        see.m35062b(parcel, a);
    }
}
