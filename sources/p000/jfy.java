package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jfy extends dck implements jfz {
    public jfy() {
        super("com.google.android.gms.auth.managed.internal.IEmmCallbacks");
    }

    /* renamed from: a */
    public void mo13705a(Status status, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo13708a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13708a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
        } else if (i != 9) {
            return false;
        } else {
            mo13705a((Status) dcl.m8163a(parcel, Status.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
