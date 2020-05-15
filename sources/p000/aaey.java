package p000;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* renamed from: aaey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaey extends aaez {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final ParticipantEntity mo16812a(Parcel parcel) {
        boolean z;
        PlayerEntity playerEntity;
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            ParticipantEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                String readString5 = parcel.readString();
                if (parcel.readInt() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Uri uri = null;
                if (parcel.readInt() > 0) {
                    playerEntity = (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel);
                } else {
                    playerEntity = null;
                }
                Uri parse = readString3 != null ? Uri.parse(readString3) : null;
                if (readString4 != null) {
                    uri = Uri.parse(readString4);
                }
                return new ParticipantEntity(readString, readString2, parse, uri, readInt, readString5, z, playerEntity, 7, null, null, null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
