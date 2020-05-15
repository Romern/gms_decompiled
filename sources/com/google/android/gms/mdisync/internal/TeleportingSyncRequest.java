package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcr(new afvu());

    /* renamed from: a */
    public final SyncRequest f80033a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.f80033a = syncRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        alcr.m60863a(this, parcel, new afvt(i));
    }
}
