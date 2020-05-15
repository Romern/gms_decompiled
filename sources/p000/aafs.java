package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* renamed from: aafs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) sed.m34998a(parcel, readInt, SnapshotMetadataEntity.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) sed.m34998a(parcel, readInt, SnapshotContentsEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }
}
