package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* renamed from: slt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
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
                case 7:
                case 9:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 8:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 16:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 17:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                    z = sed.m35006c(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }
}
