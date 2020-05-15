package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransferStateOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uqz();

    /* renamed from: a */
    final List f30790a;

    public TransferStateOptions(List list) {
        this.f30790a = list;
    }

    /* renamed from: a */
    public final Set mo18165a() {
        return new HashSet(this.f30790a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return sdg.m34949a(this.f30790a, ((TransferStateOptions) obj).f30790a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30790a});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", this.f30790a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30790a, false);
        see.m35062b(parcel, a);
    }
}
