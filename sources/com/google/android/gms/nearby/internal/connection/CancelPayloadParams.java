package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CancelPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aidj();

    /* renamed from: a */
    public aigr f80563a;

    /* renamed from: b */
    public long f80564b;

    public CancelPayloadParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CancelPayloadParams) {
            CancelPayloadParams cancelPayloadParams = (CancelPayloadParams) obj;
            return sdg.m34949a(this.f80563a, cancelPayloadParams.f80563a) && sdg.m34949a(Long.valueOf(this.f80564b), Long.valueOf(cancelPayloadParams.f80564b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80563a, Long.valueOf(this.f80564b)});
    }

    public CancelPayloadParams(IBinder iBinder, long j) {
        aigr aigr;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            aigr = queryLocalInterface instanceof aigr ? (aigr) queryLocalInterface : new aigp(iBinder);
        } else {
            aigr = null;
        }
        this.f80563a = aigr;
        this.f80564b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        aigr aigr = this.f80563a;
        if (aigr != null) {
            iBinder = aigr.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35036a(parcel, 2, this.f80564b);
        see.m35062b(parcel, a);
    }
}
