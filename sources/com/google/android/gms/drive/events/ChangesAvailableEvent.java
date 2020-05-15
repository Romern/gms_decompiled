package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChangesAvailableEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new ups();

    /* renamed from: a */
    final ChangesAvailableOptions f30772a;

    public ChangesAvailableEvent(ChangesAvailableOptions changesAvailableOptions) {
        this.f30772a = changesAvailableOptions;
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return sdg.m34949a(this.f30772a, ((ChangesAvailableEvent) obj).f30772a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30772a});
    }

    public final String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", this.f30772a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 3, this.f30772a, i, false);
        see.m35062b(parcel, a);
    }
}
