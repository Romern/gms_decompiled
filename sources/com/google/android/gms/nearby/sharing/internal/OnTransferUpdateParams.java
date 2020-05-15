package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzn();

    /* renamed from: a */
    public ShareTarget f81093a;

    /* renamed from: b */
    public TransferMetadata f81094b;

    public OnTransferUpdateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnTransferUpdateParams) {
            OnTransferUpdateParams onTransferUpdateParams = (OnTransferUpdateParams) obj;
            return sdg.m34949a(this.f81093a, onTransferUpdateParams.f81093a) && sdg.m34949a(this.f81094b, onTransferUpdateParams.f81094b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81093a, this.f81094b});
    }

    public OnTransferUpdateParams(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f81093a = shareTarget;
        this.f81094b = transferMetadata;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81093a, i, false);
        see.m35040a(parcel, 2, this.f81094b, i, false);
        see.m35062b(parcel, a);
    }
}
