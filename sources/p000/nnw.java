package p000;

import android.os.Binder;
import android.os.IBinder;

/* renamed from: nnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnw {

    /* renamed from: a */
    public final IBinder.DeathRecipient f36121a;

    /* renamed from: b */
    public final int f36122b = Binder.getCallingPid();

    /* renamed from: c */
    public final nrl f36123c;

    public nnw(nrl nrl, IBinder.DeathRecipient deathRecipient) {
        this.f36123c = nrl;
        this.f36121a = deathRecipient;
    }
}
