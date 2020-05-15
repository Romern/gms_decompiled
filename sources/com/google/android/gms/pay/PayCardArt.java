package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayCardArt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfm();

    /* renamed from: a */
    public PayCardArtInfo f81539a;

    /* renamed from: b */
    public Bitmap f81540b;

    private PayCardArt() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArt) {
            PayCardArt payCardArt = (PayCardArt) obj;
            return sdg.m34949a(this.f81539a, payCardArt.f81539a) && sdg.m34949a(this.f81540b, payCardArt.f81540b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81539a, this.f81540b});
    }

    public PayCardArt(PayCardArtInfo payCardArtInfo, Bitmap bitmap) {
        this.f81539a = payCardArtInfo;
        this.f81540b = bitmap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81539a, i, false);
        see.m35040a(parcel, 2, this.f81540b, i, false);
        see.m35062b(parcel, a);
    }
}
