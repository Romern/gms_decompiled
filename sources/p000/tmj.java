package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: tmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmj extends dcj implements tml {
    public tmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextListener");
    }

    /* renamed from: a */
    public final void mo26651a(ContextData contextData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, contextData);
        mo8528b(1, bj);
    }
}
