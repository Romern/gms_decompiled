package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator CREATOR = new amoq();

    /* renamed from: a */
    public final Integer f82007a;

    public DeviceVersionEntity(Integer num) {
        this.f82007a = num;
    }

    /* renamed from: a */
    public final Integer mo46416a() {
        return this.f82007a;
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
            return sdg.m34949a(mo46416a(), ((DeviceVersion) obj).mo46416a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46416a()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 2, this.f82007a);
        see.m35062b(parcel, a);
    }
}
