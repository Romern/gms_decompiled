package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: tkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tkq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FenceTriggerInfoImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FenceTriggerInfoImpl(z, str);
    }
}
