package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;

/* renamed from: tkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tkk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextFenceRegistrationStub[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        long j = 0;
        ContextFenceStub contextFenceStub = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                contextFenceStub = (ContextFenceStub) sed.m34998a(parcel, readInt, ContextFenceStub.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ContextFenceRegistrationStub(str, contextFenceStub, j);
    }
}
