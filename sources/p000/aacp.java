package p000;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* renamed from: aacp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacp extends aacq {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    /* renamed from: a */
    public final GameEntity mo16728a(Parcel parcel) {
        Uri uri;
        Uri uri2;
        Uri uri3;
        boolean z;
        boolean z2;
        if (!GamesDowngradeableSafeParcel.m24080a(DowngradeableSafeParcel.m22605bx())) {
            GameEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.m22606by()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (readString7 != null) {
                    uri = Uri.parse(readString7);
                } else {
                    uri = null;
                }
                String readString8 = parcel.readString();
                if (readString8 != null) {
                    uri2 = Uri.parse(readString8);
                } else {
                    uri2 = null;
                }
                String readString9 = parcel.readString();
                if (readString9 != null) {
                    uri3 = Uri.parse(readString9);
                } else {
                    uri3 = null;
                }
                if (parcel.readInt() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new GameEntity(readString, readString2, readString3, readString4, readString5, readString6, uri, uri2, uri3, z, z2, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
            }
        }
        return super.createFromParcel(parcel);
    }
}
