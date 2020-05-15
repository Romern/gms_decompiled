package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: brjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brjb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MutateRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ActionImpl actionImpl = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    thingArr = (Thing[]) sed.m35004b(parcel, readInt, Thing.CREATOR);
                    break;
                case 3:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 4:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 5:
                    strArr2 = sed.m34989A(parcel, readInt);
                    break;
                case 6:
                    actionImpl = (ActionImpl) sed.m34998a(parcel, readInt, ActionImpl.CREATOR);
                    break;
                case 7:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new MutateRequest(i, thingArr, strArr, strArr2, actionImpl, str, str2);
    }
}
