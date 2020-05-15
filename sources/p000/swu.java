package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import com.google.android.gms.config.internal.FetchConfigIpcRequest;
import java.util.ArrayList;

/* renamed from: swu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FetchConfigIpcRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        DataHolder dataHolder = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    dataHolder = (DataHolder) sed.m34998a(parcel2, readInt, DataHolder.CREATOR);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 9:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    arrayList2 = sed.m35005c(parcel2, readInt, AnalyticsUserProperty.CREATOR);
                    break;
                case 11:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new FetchConfigIpcRequest(str, j, dataHolder, str2, str3, str4, arrayList, i, arrayList2, i2, i3);
    }
}
