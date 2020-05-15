package p000;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: aaew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaew extends aaex {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final InvitationEntity mo16809a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            InvitationEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
                }
                return new InvitationEntity(gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
            }
        }
        return super.createFromParcel(parcel);
    }
}
