package p000;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* renamed from: aaeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaeq extends aaer {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final GameBadgeEntity mo16798a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            GameBadgeEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                return new GameBadgeEntity(readInt, readString, readString2, readString3 != null ? Uri.parse(readString3) : null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
