package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.Session;

/* renamed from: yxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Session[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Application application = null;
        Long l = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    application = (Application) sed.m34998a(parcel2, readInt, Application.CREATOR);
                    break;
                case 9:
                    l = sed.m35013j(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new Session(j, j2, str, str2, str3, i, application, l);
    }
}
