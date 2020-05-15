package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;

/* renamed from: tmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new KeyFilterImpl.Inclusion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 3) {
                strArr2 = sed.m34989A(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                strArr3 = sed.m34989A(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new KeyFilterImpl.Inclusion(strArr, strArr2, strArr3);
    }
}
