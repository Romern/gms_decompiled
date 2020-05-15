package p000;

import android.app.PendingIntent;
import android.os.IBinder;

/* renamed from: zmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zmh {

    /* renamed from: a */
    public final int f55456a;

    /* renamed from: b */
    public final IBinder f55457b;

    /* renamed from: c */
    public final PendingIntent f55458c;

    public zmh(int i) {
        this(i, null);
    }

    public zmh(int i, IBinder iBinder) {
        this(i, iBinder, null);
    }

    public zmh(int i, IBinder iBinder, PendingIntent pendingIntent) {
        this.f55456a = i;
        this.f55457b = iBinder;
        this.f55458c = pendingIntent;
    }
}
