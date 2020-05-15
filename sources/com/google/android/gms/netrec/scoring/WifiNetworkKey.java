package com.google.android.gms.netrec.scoring;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiNetworkKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akkv();

    /* renamed from: c */
    private static final Pattern f81195c = Pattern.compile("(\".*\")|(0x[\\p{XDigit}]+)", 32);

    /* renamed from: d */
    private static final Pattern f81196d = Pattern.compile("([\\p{XDigit}]{2}:){5}[\\p{XDigit}]{2}");

    /* renamed from: a */
    public final String f81197a;

    /* renamed from: b */
    public final String f81198b;

    public WifiNetworkKey(String str, String str2) {
        if (!f81195c.matcher(str).matches()) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid ssid: ") : "Invalid ssid: ".concat(valueOf));
        } else if (!f81196d.matcher(str2).matches()) {
            String valueOf2 = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid bssid: ") : "Invalid bssid: ".concat(valueOf2));
        } else {
            this.f81197a = str;
            this.f81198b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WifiNetworkKey wifiNetworkKey = (WifiNetworkKey) obj;
            return sdg.m34949a(this.f81197a, wifiNetworkKey.f81197a) && sdg.m34949a(this.f81198b, wifiNetworkKey.f81198b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81197a, this.f81198b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ssid", "REDACTED");
        a.mo25396a("bssid", "REDACTED");
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
        see.m35046a(parcel, 1, this.f81197a, false);
        see.m35046a(parcel, 2, this.f81198b, false);
        see.m35062b(parcel, a);
    }
}
