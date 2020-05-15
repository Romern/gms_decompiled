package com.google.android.gms.thunderbird.state;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeviceState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auhl();

    /* renamed from: a */
    public final int f109077a;

    /* renamed from: b */
    public final String f109078b;

    /* renamed from: c */
    public final String f109079c;

    /* renamed from: d */
    public final String f109080d;

    /* renamed from: e */
    public final String f109081e;

    /* renamed from: f */
    public final boolean f109082f;

    /* renamed from: g */
    public final String f109083g;

    /* renamed from: h */
    public final String f109084h;

    /* renamed from: i */
    public final String f109085i;

    public DeviceState(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7) {
        this.f109077a = i;
        this.f109078b = str;
        this.f109079c = str2;
        this.f109080d = str3;
        this.f109081e = str4;
        this.f109082f = z;
        this.f109083g = str5;
        this.f109084h = str6;
        this.f109085i = str7;
    }

    /* renamed from: a */
    private static String m93363a(String str) {
        if (str != null) {
            if (str.length() >= 5 && str.length() <= 6 && !str.startsWith("000")) {
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                int i = 0;
                while (i < length) {
                    char c = charArray[i];
                    if (c >= '0' && c <= '9') {
                        i++;
                    }
                }
            }
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final String mo59530b() {
        String str = this.f109084h;
        if (str != null) {
            return str.substring(0, 3);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo59531c() {
        String str = this.f109084h;
        if (str != null) {
            return str.substring(3);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceState deviceState = (DeviceState) obj;
            return this.f109077a == deviceState.f109077a && bmxi.m108538a(this.f109078b, deviceState.f109078b) && bmxi.m108538a(this.f109079c, deviceState.f109079c) && bmxi.m108538a(this.f109080d, deviceState.f109080d) && bmxi.m108538a(this.f109081e, deviceState.f109081e) && bmxi.m108538a(this.f109083g, deviceState.f109083g) && bmxi.m108538a(this.f109084h, deviceState.f109084h) && bmxi.m108538a(this.f109085i, deviceState.f109085i);
        }
    }

    public final int hashCode() {
        return this.f109077a;
    }

    public final String toString() {
        String a = mo59529a();
        String str = this.f109078b;
        String str2 = this.f109079c;
        String str3 = this.f109081e;
        String str4 = this.f109083g;
        String str5 = this.f109084h;
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 57 + length2 + length3 + length4 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append(a);
        sb.append("{IMEI=");
        sb.append(str);
        sb.append(", IMSI=");
        sb.append(str2);
        sb.append(", PhoneNumber=");
        sb.append(str3);
        sb.append(", HomeMCCMNC=");
        sb.append(str4);
        sb.append(", NetworkMCCMNC=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
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
        see.m35046a(parcel, 1, this.f109078b, false);
        see.m35046a(parcel, 2, this.f109079c, false);
        see.m35046a(parcel, 3, this.f109080d, false);
        see.m35046a(parcel, 4, this.f109081e, false);
        see.m35046a(parcel, 6, this.f109083g, false);
        see.m35046a(parcel, 7, this.f109084h, false);
        see.m35046a(parcel, 8, this.f109085i, false);
        see.m35063b(parcel, 9, this.f109077a);
        see.m35051a(parcel, 10, this.f109082f);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static String m93364a(String str, CellInfo cellInfo) {
        String str2;
        String a = m93363a(str);
        if (a != null || cellInfo == null) {
            return a;
        }
        int i = Build.VERSION.SDK_INT;
        String str3 = null;
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            String mccString = cellInfoGsm.getCellIdentity().getMccString();
            str3 = cellInfoGsm.getCellIdentity().getMncString();
            str2 = mccString;
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            String mccString2 = cellInfoLte.getCellIdentity().getMccString();
            str3 = cellInfoLte.getCellIdentity().getMncString();
            str2 = mccString2;
        } else if (cellInfo instanceof CellInfoWcdma) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            String mccString3 = cellInfoWcdma.getCellIdentity().getMccString();
            str3 = cellInfoWcdma.getCellIdentity().getMncString();
            str2 = mccString3;
        } else {
            str2 = null;
        }
        if (str3 == null || str2 == null) {
            return a;
        }
        String valueOf = String.valueOf(str2);
        String valueOf2 = String.valueOf(str3);
        return m93363a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    public static List m93365a(Context context) {
        int[] a = auho.m77072a(context);
        int length = a.length;
        bngs b = bngx.m109371b(length);
        for (int i : a) {
            b.mo67668c(new auhk(context, i).mo50527a());
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public final String mo59529a() {
        int i = this.f109077a;
        return i != Integer.MAX_VALUE ? Integer.toString(i) : "DEFAULT";
    }
}
