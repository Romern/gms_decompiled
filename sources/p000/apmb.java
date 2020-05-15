package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: apmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apmb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingErrorInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Thing thing = null;
        ActionImpl actionImpl = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 6:
                    thing = (Thing) sed.m34998a(parcel, readInt, Thing.CREATOR);
                    break;
                case 7:
                    actionImpl = (ActionImpl) sed.m34998a(parcel, readInt, ActionImpl.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AppIndexingErrorInfo(str, i, i2, str2, j, thing, actionImpl);
    }
}
