package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.ArrayList;

/* renamed from: sjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AlarmEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 9:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AlarmEvent(i, j, i2, str, j2, j3, j4, arrayList, i3, i4, str2, f);
    }
}
