package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;

/* renamed from: anjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoBackupStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    strArr = sed.m34989A(parcel2, readInt);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AutoBackupStatus(i, i2, str, str2, f, i3, i4, i5, strArr, str3, i6);
    }
}
