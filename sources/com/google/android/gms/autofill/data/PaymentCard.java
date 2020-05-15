package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.YearMonth;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PaymentCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kdc();

    /* renamed from: a */
    public final kdj f11613a;

    /* renamed from: b */
    public final kdj f11614b;

    /* renamed from: c */
    public final String f11615c;

    /* renamed from: d */
    public final YearMonth f11616d;

    /* renamed from: e */
    public final kdg f11617e;

    /* renamed from: f */
    public final int f11618f;

    public PaymentCard(kdj kdj, kdj kdj2, String str, YearMonth yearMonth, kdg kdg, int i) {
        this.f11613a = kdj;
        this.f11614b = kdj2;
        this.f11615c = str;
        this.f11616d = yearMonth;
        this.f11617e = kdg;
        this.f11618f = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentCard) {
            PaymentCard paymentCard = (PaymentCard) obj;
            return this.f11613a.equals(paymentCard.f11613a) && bmxi.m108538a(this.f11614b, paymentCard.f11614b) && bmxi.m108538a(this.f11615c, paymentCard.f11615c) && bmxi.m108538a(this.f11616d, paymentCard.f11616d) && bmxi.m108538a(this.f11617e, paymentCard.f11617e) && this.f11618f == paymentCard.f11618f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11613a, this.f11614b, this.f11615c, this.f11616d, this.f11617e, Integer.valueOf(this.f11618f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f11613a.f23889a);
        kdj kdj = this.f11614b;
        if (kdj != null) {
            str = kdj.f23889a;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.f11615c);
        if (this.f11616d != null) {
            parcel.writeInt(1);
            parcel.writeInt(this.f11616d.getMonthValue());
            parcel.writeInt(this.f11616d.getYear());
        } else {
            parcel.writeInt(0);
        }
        if (this.f11617e != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f11617e.mo73642k());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f11618f);
    }
}
