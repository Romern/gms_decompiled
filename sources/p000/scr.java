package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* renamed from: scr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scr extends dcj implements sct {
    public scr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }

    /* renamed from: a */
    public final void mo25387a(ResolveAccountResponse resolveAccountResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, resolveAccountResponse);
        mo8528b(2, bj);
    }
}
