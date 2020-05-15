package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqa();

    /* renamed from: a */
    public String f80253a;

    /* renamed from: b */
    public String f80254b;

    /* renamed from: c */
    public String f80255c;

    /* renamed from: d */
    public String f80256d;

    /* renamed from: e */
    public String f80257e;

    /* renamed from: f */
    public int f80258f;

    public CarrierSupportChannel() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportChannel) {
            CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel) obj;
            return sdg.m34949a(this.f80253a, carrierSupportChannel.f80253a) && sdg.m34949a(this.f80254b, carrierSupportChannel.f80254b) && sdg.m34949a(this.f80255c, carrierSupportChannel.f80255c) && sdg.m34949a(this.f80256d, carrierSupportChannel.f80256d) && sdg.m34949a(this.f80257e, carrierSupportChannel.f80257e) && sdg.m34949a(Integer.valueOf(this.f80258f), Integer.valueOf(carrierSupportChannel.f80258f));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80253a, this.f80254b, this.f80255c, this.f80256d, this.f80257e, Integer.valueOf(this.f80258f)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Title", this.f80253a);
        a.mo25396a("SubTitle", this.f80254b);
        a.mo25396a("Target", this.f80255c);
        a.mo25396a("DefaultMessageSubject", this.f80256d);
        a.mo25396a("DefaultMessageBody", this.f80257e);
        a.mo25396a("Type", Integer.valueOf(this.f80258f));
        return a.toString();
    }

    public CarrierSupportChannel(String str, String str2, String str3, String str4, String str5, int i) {
        this.f80253a = str;
        this.f80254b = str2;
        this.f80255c = str3;
        this.f80256d = str4;
        this.f80257e = str5;
        this.f80258f = i;
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
        see.m35046a(parcel, 1, this.f80253a, false);
        see.m35046a(parcel, 2, this.f80254b, false);
        see.m35046a(parcel, 3, this.f80255c, false);
        see.m35046a(parcel, 4, this.f80256d, false);
        see.m35046a(parcel, 5, this.f80257e, false);
        see.m35063b(parcel, 6, this.f80258f);
        see.m35062b(parcel, a);
    }
}
