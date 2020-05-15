package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SnapshotContentsEntity extends GamesAbstractSafeParcelable implements SnapshotContents {
    public static final Parcelable.Creator CREATOR = new aafr();

    /* renamed from: a */
    public Contents f32711a;

    public SnapshotContentsEntity(Contents contents) {
        this.f32711a = contents;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32711a, i, false);
        see.m35062b(parcel, a);
    }
}
