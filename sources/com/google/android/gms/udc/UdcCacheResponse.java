package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avae();

    /* renamed from: a */
    public final List f109350a;

    /* renamed from: b */
    public final int[] f109351b;

    /* renamed from: c */
    public final boolean f109352c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new auzq();

        /* renamed from: a */
        public final boolean f109353a;

        public SettingAvailability(boolean z) {
            this.f109353a = z;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return obj != null && (obj instanceof SettingAvailability) && this.f109353a == ((SettingAvailability) obj).f109353a;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109353a)});
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("CanShowValue", Boolean.valueOf(this.f109353a));
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35051a(parcel, 2, this.f109353a);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avai();

        /* renamed from: a */
        public final int f109354a;

        /* renamed from: b */
        public final int f109355b;

        /* renamed from: c */
        public final SettingAvailability f109356c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.f109354a = i;
            this.f109355b = i2;
            this.f109356c = settingAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof UdcSetting)) {
                UdcSetting udcSetting = (UdcSetting) obj;
                return this.f109354a == udcSetting.f109354a && this.f109355b == udcSetting.f109355b && sdg.m34949a(this.f109356c, udcSetting.f109356c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f109354a), Integer.valueOf(this.f109355b), this.f109356c});
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("SettingId", Integer.valueOf(this.f109354a));
            a.mo25396a("SettingValue", Integer.valueOf(this.f109355b));
            a.mo25396a("SettingAvailability", this.f109356c);
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f109354a);
            see.m35063b(parcel, 3, this.f109355b);
            see.m35040a(parcel, 4, this.f109356c, i, false);
            see.m35062b(parcel, a);
        }
    }

    public UdcCacheResponse(List list, int[] iArr, boolean z) {
        this.f109350a = list;
        this.f109351b = iArr;
        this.f109352c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof UdcCacheResponse)) {
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
            return this.f109350a.equals(udcCacheResponse.f109350a) && Arrays.equals(this.f109351b, udcCacheResponse.f109351b) && this.f109352c == udcCacheResponse.f109352c;
        }
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f109350a, this.f109351b, Boolean.valueOf(this.f109352c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Settings", this.f109350a);
        a.mo25396a("ConsentableSettings", Arrays.toString(this.f109351b));
        a.mo25396a("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.f109352c));
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f109350a, false);
        see.m35055a(parcel, 3, this.f109351b, false);
        see.m35051a(parcel, 4, this.f109352c);
        see.m35062b(parcel, a);
    }
}
