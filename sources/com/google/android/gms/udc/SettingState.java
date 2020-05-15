package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auzt();

    /* renamed from: a */
    public int f109347a;

    /* renamed from: b */
    public int f109348b;

    public SettingState() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingState) {
            SettingState settingState = (SettingState) obj;
            return sdg.m34949a(Integer.valueOf(this.f109347a), Integer.valueOf(settingState.f109347a)) && sdg.m34949a(Integer.valueOf(this.f109348b), Integer.valueOf(settingState.f109348b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f109347a), Integer.valueOf(this.f109348b)});
    }

    public SettingState(int i, int i2) {
        this.f109347a = i;
        this.f109348b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109347a);
        see.m35063b(parcel, 3, this.f109348b);
        see.m35062b(parcel, a);
    }
}
