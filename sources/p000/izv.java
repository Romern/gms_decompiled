package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: izv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class izv extends dck implements izw {
    public izv() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13540a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
