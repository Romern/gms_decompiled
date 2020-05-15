package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CancelPendingActionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urh();

    /* renamed from: a */
    public final List f30809a;

    public CancelPendingActionsRequest(List list) {
        this.f30809a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 2, this.f30809a, false);
        see.m35062b(parcel, a);
    }
}
