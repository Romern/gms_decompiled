package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransferStateEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new uqy();

    /* renamed from: a */
    final List f30789a;

    public TransferStateEvent(List list) {
        this.f30789a = list;
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return sdg.m34949a(this.f30789a, ((TransferStateEvent) obj).f30789a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30789a});
    }

    public final String toString() {
        return String.format("TransferStateEvent[%s]", TextUtils.join("','", this.f30789a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 3, this.f30789a, false);
        see.m35062b(parcel, a);
    }
}
