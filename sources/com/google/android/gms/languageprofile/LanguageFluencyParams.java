package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LanguageFluencyParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adut();

    /* renamed from: a */
    public final float f79268a;

    /* renamed from: b */
    public final int f79269b;

    /* renamed from: c */
    public final int f79270c;

    public LanguageFluencyParams(float f, int i, int i2) {
        this.f79268a = f;
        this.f79269b = i;
        this.f79270c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageFluencyParams) {
            LanguageFluencyParams languageFluencyParams = (LanguageFluencyParams) obj;
            return sdg.m34949a(Float.valueOf(this.f79268a), Float.valueOf(languageFluencyParams.f79268a)) && sdg.m34949a(Integer.valueOf(this.f79269b), Integer.valueOf(languageFluencyParams.f79269b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f79268a), Integer.valueOf(this.f79269b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35034a(parcel, 1, this.f79268a);
        see.m35063b(parcel, 2, this.f79269b);
        see.m35063b(parcel, 3, this.f79270c);
        see.m35062b(parcel, a);
    }
}
