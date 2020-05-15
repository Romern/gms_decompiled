package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aduv();

    /* renamed from: a */
    public final float f79274a;

    /* renamed from: b */
    public final int f79275b;

    /* renamed from: c */
    public final int f79276c;

    public LanguagePreferenceParams(float f, int i, int i2) {
        this.f79274a = f;
        this.f79275b = i;
        this.f79276c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreferenceParams) {
            LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) obj;
            return sdg.m34949a(Float.valueOf(this.f79274a), Float.valueOf(languagePreferenceParams.f79274a)) && sdg.m34949a(Integer.valueOf(this.f79275b), Integer.valueOf(languagePreferenceParams.f79275b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f79274a), Integer.valueOf(this.f79275b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 1, this.f79274a);
        see.m35063b(parcel, 2, this.f79275b);
        see.m35063b(parcel, 3, this.f79276c);
        see.m35062b(parcel, a);
    }
}
