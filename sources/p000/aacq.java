package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;

/* renamed from: aacq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aacq implements Parcelable.Creator {
    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
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
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 10:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 16:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 17:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 18:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 19:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 20:
                    str10 = sed.m35020q(parcel2, readInt);
                    break;
                case 21:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 22:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 23:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 24:
                    str11 = sed.m35020q(parcel2, readInt);
                    break;
                case 25:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GameEntity(str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i, i2, i3, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GameEntity[i];
    }
}
