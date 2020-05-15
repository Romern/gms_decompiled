package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TopUpIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algs();

    /* renamed from: a */
    public ProtoSafeParcelable f81614a;

    private TopUpIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopUpIntentArgs) {
            return sdg.m34949a(this.f81614a, ((TopUpIntentArgs) obj).f81614a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81614a});
    }

    public TopUpIntentArgs(ProtoSafeParcelable protoSafeParcelable) {
        this.f81614a = protoSafeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81614a, i, false);
        see.m35062b(parcel, a);
    }
}
