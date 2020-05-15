package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SendTransmissionEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asoq();

    /* renamed from: a */
    public TransmissionEvent f108436a;

    private SendTransmissionEventRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendTransmissionEventRequest) {
            return sdg.m34949a(this.f108436a, ((SendTransmissionEventRequest) obj).f108436a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108436a});
    }

    public SendTransmissionEventRequest(TransmissionEvent transmissionEvent) {
        this.f108436a = transmissionEvent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f108436a, i, false);
        see.m35062b(parcel, a);
    }
}
