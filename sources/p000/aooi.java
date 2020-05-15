package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: aooi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aooi extends dcj implements aook {
    public aooi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    /* renamed from: a */
    public final void mo43125a(aooh aooh) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aooh);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo43127b(aooh aooh) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aooh);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo43126a(aooh aooh, PseudonymousIdToken pseudonymousIdToken) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aooh);
        dcl.m8165a(bj, (Parcelable) null);
        mo8530c(2, bj);
    }
}
