package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator CREATOR = new apby();

    /* renamed from: a */
    public final Integer f107238a;

    public DeviceVersionEntity(Integer num) {
        this.f107238a = num;
    }

    /* renamed from: a */
    public final Integer mo58810a() {
        return this.f107238a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceVersion)) {
            return false;
        }
        if (this != obj) {
            return sdg.m34949a(mo58810a(), ((DeviceVersion) obj).mo58810a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo58810a()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 2, this.f107238a);
        see.m35062b(parcel, a);
    }
}
