package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;

/* renamed from: aady */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aady implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EventEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        PlayerEntity playerEntity = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) sed.m34998a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new EventEntity(str, str2, str3, uri, str4, playerEntity, j, str5, z);
    }
}
