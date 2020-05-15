package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bjfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfq extends dcj implements bjfs {
    public bjfq(IBinder iBinder) {
        super(iBinder, "com.google.android.wallet.bender3.framework.actions.IActionExecutorService");
    }

    /* renamed from: a */
    public final Intent mo52452a(Intent intent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, intent);
        Parcel a = mo8526a(1, bj);
        Intent intent2 = (Intent) dcl.m8163a(a, Intent.CREATOR);
        a.recycle();
        return intent2;
    }
}
