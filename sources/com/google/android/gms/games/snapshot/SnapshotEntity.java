package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SnapshotEntity extends GamesAbstractSafeParcelable implements Snapshot {
    public static final Parcelable.Creator CREATOR = new aafs();

    /* renamed from: a */
    public final SnapshotMetadataEntity f32712a;

    /* renamed from: b */
    private final SnapshotContentsEntity f32713b;

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.f32712a = new SnapshotMetadataEntity(snapshotMetadata);
        this.f32713b = snapshotContentsEntity;
    }

    /* renamed from: a */
    public final SnapshotMetadata mo19503a() {
        return this.f32712a;
    }

    /* renamed from: b */
    public final SnapshotContents mo19504b() {
        SnapshotContentsEntity snapshotContentsEntity = this.f32713b;
        if (snapshotContentsEntity.f32711a != null) {
            return snapshotContentsEntity;
        }
        return null;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32712a, mo19504b()});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Snapshot) {
            if (this == obj) {
                return true;
            }
            Snapshot snapshot = (Snapshot) obj;
            if (!sdg.m34949a(snapshot.mo19503a(), this.f32712a) || !sdg.m34949a(snapshot.mo19504b(), mo19504b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Metadata", this.f32712a);
        a.mo25396a("HasContents", Boolean.valueOf(mo19504b() != null));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32712a, i, false);
        see.m35040a(parcel, 3, mo19504b(), i, false);
        see.m35062b(parcel, a);
    }
}
