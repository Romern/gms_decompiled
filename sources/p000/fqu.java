package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;

/* renamed from: fqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CorpusStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 6:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CorpusStatus(z, j, j2, j3, bundle, str, str2);
    }
}
