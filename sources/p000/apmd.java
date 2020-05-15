package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: apmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apmd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingUserActionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        long j = 0;
        ActionImpl actionImpl = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                actionImpl = (ActionImpl) sed.m34998a(parcel, readInt, ActionImpl.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AppIndexingUserActionInfo(str, j, actionImpl);
    }
}
