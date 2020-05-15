package p000;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* renamed from: aada */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aada extends aadb {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final PlayerEntity mo16738a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            PlayerEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                return new PlayerEntity(readString, readString2, readString3 != null ? Uri.parse(readString3) : null, readString4 != null ? Uri.parse(readString4) : null, parcel.readLong(), -1, -1, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1, false, -1, null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
