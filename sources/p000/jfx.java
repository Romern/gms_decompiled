package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfx extends dcj implements jfz {
    public jfx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.managed.internal.IEmmCallbacks");
    }

    /* renamed from: a */
    public final void mo13705a(Status status, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, pendingIntent);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo13708a(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
