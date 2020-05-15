package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auzs();

    /* renamed from: a */
    public SettingState f109344a;

    /* renamed from: b */
    public String f109345b;

    /* renamed from: c */
    public String f109346c;

    public SettingDisplayInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingDisplayInfo) {
            SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
            return sdg.m34949a(this.f109345b, settingDisplayInfo.f109345b) && sdg.m34949a(this.f109346c, settingDisplayInfo.f109346c) && sdg.m34949a(this.f109344a, settingDisplayInfo.f109344a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109344a, this.f109345b, this.f109346c});
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.f109344a = settingState;
        this.f109345b = str;
        this.f109346c = str2;
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
        see.m35040a(parcel, 2, this.f109344a, i, false);
        see.m35046a(parcel, 3, this.f109345b, false);
        see.m35046a(parcel, 4, this.f109346c, false);
        see.m35062b(parcel, a);
    }
}
