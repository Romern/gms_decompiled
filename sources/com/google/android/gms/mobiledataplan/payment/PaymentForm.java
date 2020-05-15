package com.google.android.gms.mobiledataplan.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PaymentForm extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agrr();

    /* renamed from: a */
    public int f80302a;

    private PaymentForm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentForm) {
            return sdg.m34949a(Integer.valueOf(this.f80302a), Integer.valueOf(((PaymentForm) obj).f80302a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80302a)});
    }

    public PaymentForm(int i) {
        this.f80302a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80302a);
        see.m35062b(parcel, a);
    }
}
