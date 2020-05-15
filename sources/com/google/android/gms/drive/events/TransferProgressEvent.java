package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransferProgressEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new uqw();

    /* renamed from: a */
    public final TransferProgressData f30787a;

    public TransferProgressEvent(TransferProgressData transferProgressData) {
        this.f30787a = transferProgressData;
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return sdg.m34949a(this.f30787a, ((TransferProgressEvent) obj).f30787a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30787a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30787a, i, false);
        see.m35062b(parcel, a);
    }
}
