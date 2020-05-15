package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PaycacheSetupIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfs();

    /* renamed from: a */
    public ProtoSafeParcelable f81563a;

    private PaycacheSetupIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaycacheSetupIntentArgs) {
            return sdg.m34949a(this.f81563a, ((PaycacheSetupIntentArgs) obj).f81563a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81563a});
    }

    public PaycacheSetupIntentArgs(ProtoSafeParcelable protoSafeParcelable) {
        this.f81563a = protoSafeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81563a, i, false);
        see.m35062b(parcel, a);
    }
}
