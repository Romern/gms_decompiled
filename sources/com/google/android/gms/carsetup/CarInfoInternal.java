package com.google.android.gms.carsetup;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarInfoInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new orh();

    /* renamed from: a */
    public final CarInfo f29539a;

    /* renamed from: b */
    public String f29540b;

    /* renamed from: c */
    public boolean f29541c;

    /* renamed from: d */
    public long f29542d;

    /* renamed from: e */
    public long f29543e;

    /* renamed from: f */
    public String f29544f;

    /* renamed from: g */
    public String f29545g;

    /* renamed from: h */
    public String f29546h;

    /* renamed from: i */
    public String f29547i;

    /* renamed from: j */
    public int f29548j;

    /* renamed from: k */
    public String f29549k;

    /* renamed from: l */
    public int f29550l;

    /* renamed from: m */
    public int f29551m;

    /* renamed from: n */
    public int f29552n;

    /* renamed from: o */
    public boolean f29553o;

    /* renamed from: p */
    public boolean f29554p;

    public CarInfoInternal() {
        this.f29539a = new CarInfo();
    }

    /* renamed from: a */
    public static CarInfoInternal m22107a(bivd bivd, int i, int i2, String str, int i3, int i4, int i5) {
        String str2;
        String str3;
        bivd bivd2 = bivd;
        bxwc bxwc = bivd2.f121949a;
        int size = bxwc.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                str2 = null;
                break;
            }
            bivb bivb = (bivb) bxwc.get(i6);
            i6++;
            if ((bivb.f121923a & 32) != 0) {
                bipg bipg = bivb.f121929g;
                if (bipg == null) {
                    bipg = bipg.f121156d;
                }
                str2 = bipg.f121158a;
            }
        }
        String str4 = bivd2.f121961m;
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4;
        } else {
            str3 = bivd2.f121950b;
        }
        int i7 = bivd2.f121960l;
        String str5 = bivd2.f121950b;
        String str6 = bivd2.f121951c;
        String str7 = bivd2.f121952d;
        boolean a = m22108a(i7, 1);
        int a2 = biqb.m102716a(bivd2.f121954f);
        if (a2 == 0) {
            a2 = 1;
        }
        CarInfo carInfo = new CarInfo(str5, str6, str7, null, i, i2, a, a2 - 1, bivd2.f121955g, bivd2.f121956h, bivd2.f121957i, bivd2.f121958j, m22108a(i7, 8), m22108a(i7, 2), m22108a(i7, 4), null, str3);
        if (bivd2.f121959k) {
            carInfo.f29344m = true;
        }
        return new CarInfoInternal(carInfo, bivd2.f121953e, false, 0, 0, str2, null, null, null, -1, str, i3, i4, i5, false, false);
    }

    /* renamed from: a */
    private static final boolean m22108a(int i, int i2) {
        return (i & i2) == i2;
    }

    public final String toString() {
        String name = getClass().getName();
        long j = this.f29542d;
        CarInfo carInfo = this.f29539a;
        String str = carInfo.f29332a;
        String str2 = carInfo.f29333b;
        int i = carInfo.f29336e;
        int i2 = carInfo.f29337f;
        String str3 = carInfo.f29334c;
        String str4 = carInfo.f29335d;
        boolean z = this.f29541c;
        boolean z2 = carInfo.f29338g;
        int i3 = carInfo.f29339h;
        String str5 = carInfo.f29340i;
        String str6 = carInfo.f29341j;
        String str7 = carInfo.f29342k;
        String str8 = carInfo.f29343l;
        boolean z3 = carInfo.f29344m;
        boolean z4 = carInfo.f29345n;
        boolean z5 = carInfo.f29346o;
        String str9 = this.f29544f;
        String str10 = this.f29545g;
        String str11 = this.f29546h;
        int i4 = this.f29548j;
        String str12 = this.f29549k;
        int i5 = this.f29550l;
        int i6 = this.f29551m;
        int i7 = this.f29552n;
        boolean z6 = this.f29553o;
        boolean z7 = this.f29554p;
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(str5).length();
        int length7 = String.valueOf(str6).length();
        int length8 = String.valueOf(str7).length();
        int length9 = String.valueOf(str8).length();
        int length10 = String.valueOf(str9).length();
        int length11 = String.valueOf(str10).length();
        StringBuilder sb = new StringBuilder(length + 555 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(str11).length() + String.valueOf(str12).length());
        sb.append(name);
        sb.append("[dbId=");
        sb.append(j);
        sb.append(",manufacturer=");
        sb.append(str);
        sb.append(",model=");
        sb.append(str2);
        sb.append(",headUnitProtocolVersion=");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(",modelYear=");
        sb.append(str3);
        sb.append(",vehicleId=");
        sb.append(str4);
        sb.append(",bluetoothAllowed=");
        sb.append(z);
        sb.append(",hideProjectedClock=");
        sb.append(z2);
        sb.append(",driverPosition=");
        sb.append(i3);
        sb.append(",headUnitMake=");
        sb.append(str5);
        sb.append(",headUnitModel=");
        sb.append(str6);
        sb.append(",headUnitSoftwareBuild=");
        sb.append(str7);
        sb.append(",headUnitSoftwareVersion=");
        sb.append(str8);
        sb.append(",canPlayNativeMediaDuringVr=");
        sb.append(z3);
        sb.append(",hidePhoneSignal=");
        sb.append(z4);
        sb.append(",hideBatteryLevel=");
        sb.append(z5);
        sb.append(",bluetoothaddress=");
        sb.append(str9);
        sb.append(",wifiSsid=");
        sb.append(str10);
        sb.append(",wifiBssid=");
        sb.append(str11);
        sb.append(",wifiSecurityMode=");
        sb.append(i4);
        sb.append(",sslSubjectName=");
        sb.append(str12);
        sb.append(",wifiVersionMajor=");
        sb.append(i5);
        sb.append(",wifiVersionMinor=");
        sb.append(i6);
        sb.append(",wifiFrequencyMHz=");
        sb.append(i7);
        sb.append(",known=");
        sb.append(z6);
        sb.append(",projectionAllowed=");
        sb.append(z7);
        sb.append("]");
        return sb.toString();
    }

    public CarInfoInternal(CarInfo carInfo, String str, boolean z, long j, long j2, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4, boolean z2, boolean z3) {
        sdo.m34959a(carInfo);
        this.f29539a = carInfo;
        this.f29540b = str;
        this.f29541c = z;
        this.f29542d = j;
        this.f29543e = j2;
        this.f29544f = str2;
        this.f29545g = str3;
        this.f29546h = str4;
        this.f29547i = str5;
        this.f29548j = i;
        this.f29549k = str6;
        this.f29550l = i2;
        this.f29551m = i3;
        this.f29552n = i4;
        this.f29553o = z2;
        this.f29554p = z3;
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
        see.m35040a(parcel, 1, this.f29539a, i, false);
        see.m35046a(parcel, 2, this.f29540b, false);
        see.m35051a(parcel, 3, this.f29541c);
        see.m35036a(parcel, 4, this.f29542d);
        see.m35036a(parcel, 5, this.f29543e);
        see.m35046a(parcel, 6, this.f29544f, false);
        see.m35046a(parcel, 7, this.f29545g, false);
        see.m35046a(parcel, 8, this.f29546h, false);
        see.m35046a(parcel, 9, this.f29547i, false);
        see.m35063b(parcel, 10, this.f29548j);
        see.m35046a(parcel, 11, this.f29549k, false);
        see.m35063b(parcel, 12, this.f29550l);
        see.m35063b(parcel, 13, this.f29551m);
        see.m35063b(parcel, 14, this.f29552n);
        see.m35051a(parcel, 15, this.f29553o);
        see.m35051a(parcel, 16, this.f29554p);
        see.m35062b(parcel, a);
    }
}
