package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChangeEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new upn();

    /* renamed from: a */
    public final DriveId f30770a;

    /* renamed from: b */
    final int f30771b;

    public ChangeEvent(DriveId driveId, int i) {
        this.f30770a = driveId;
        this.f30771b = i;
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 1;
    }

    public final String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", this.f30770a, Integer.valueOf(this.f30771b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30770a, i, false);
        see.m35063b(parcel, 3, this.f30771b);
        see.m35062b(parcel, a);
    }
}
