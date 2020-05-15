package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* renamed from: aaer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaer implements Parcelable.Creator {
    /* renamed from: a */
    public GameBadgeEntity createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GameBadgeEntity(i, str, str2, uri);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GameBadgeEntity[i];
    }
}
