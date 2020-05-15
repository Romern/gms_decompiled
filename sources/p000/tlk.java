package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;

/* renamed from: tlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tlk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateFenceOperation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        ContextFenceRegistrationStub contextFenceRegistrationStub = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    contextFenceRegistrationStub = (ContextFenceRegistrationStub) sed.m34998a(parcel2, readInt, ContextFenceRegistrationStub.CREATOR);
                    break;
                case 4:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new UpdateFenceOperation(i, contextFenceRegistrationStub, iBinder, pendingIntent, str, j, j2);
    }
}
