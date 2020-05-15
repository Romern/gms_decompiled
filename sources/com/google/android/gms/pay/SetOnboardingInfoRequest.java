package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetOnboardingInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algg();

    /* renamed from: a */
    public ProtoSafeParcelable f81594a;

    private SetOnboardingInfoRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetOnboardingInfoRequest) {
            return sdg.m34949a(this.f81594a, ((SetOnboardingInfoRequest) obj).f81594a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81594a});
    }

    public SetOnboardingInfoRequest(ProtoSafeParcelable protoSafeParcelable) {
        this.f81594a = protoSafeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81594a, i, false);
        see.m35062b(parcel, a);
    }
}
