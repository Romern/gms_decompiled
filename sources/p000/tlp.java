package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;

/* renamed from: tlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tlp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl.Inclusion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TimeFilterImpl timeFilterImpl = null;
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                timeFilterImpl = (TimeFilterImpl) sed.m34998a(parcel, readInt, TimeFilterImpl.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                keyFilterImpl = (KeyFilterImpl) sed.m34998a(parcel, readInt, KeyFilterImpl.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ContextDataFilterImpl.Inclusion(i, i2, timeFilterImpl, keyFilterImpl);
    }
}
