package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import java.util.ArrayList;

/* renamed from: aafd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafd extends aafe {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final RoomEntity mo16820a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            RoomEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                String readString3 = parcel.readString();
                int readInt2 = parcel.readInt();
                Bundle readBundle = parcel.readBundle();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                for (int i = 0; i < readInt3; i++) {
                    arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
                }
                return new RoomEntity(readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
            }
        }
        return super.createFromParcel(parcel);
    }
}
