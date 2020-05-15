package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: afle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afle implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncSubPolicy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SyncSubPolicy(z, i);
    }
}
