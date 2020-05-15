package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneNumberEntity extends AbstractSafeParcelable implements PhoneNumber {
    public static final Parcelable.Creator CREATOR = new apcc();

    /* renamed from: a */
    public final String f107240a;

    public PhoneNumberEntity(PhoneNumber phoneNumber) {
        this(((PhoneNumberEntity) phoneNumber).f107240a);
    }

    /* renamed from: a */
    public final String mo58818a() {
        return this.f107240a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        if (this != obj) {
            return sdg.m34949a(mo58818a(), ((PhoneNumber) obj).mo58818a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo58818a()});
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
        see.m35046a(parcel, 2, this.f107240a, false);
        see.m35062b(parcel, a);
    }

    public PhoneNumberEntity(String str) {
        this.f107240a = str;
    }
}
