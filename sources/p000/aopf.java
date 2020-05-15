package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;

/* renamed from: aopf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopf {

    /* renamed from: a */
    private static final sek f78638a = aope.m66267a("RetryScheduler");

    /* renamed from: b */
    private final Context f78639b;

    /* renamed from: c */
    private final skc f78640c;

    public aopf(Context context) {
        this.f78639b = context;
        this.f78640c = new skc(context);
    }

    /* renamed from: a */
    public final void mo43145a(int i, String str) {
        if (i >= 0 && i < 3) {
            long j = i != 0 ? i != 1 ? 1800000 : 300000 : 15000;
            f78638a.mo25414c("Scheduling retry for rebind attempt %d with delay %d", Integer.valueOf(i), Long.valueOf(j));
            skc skc = this.f78640c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.f78639b;
            skc.mo25675a("RcsBindingRetry", 2, elapsedRealtime + j, PendingIntent.getService(context, 0, aopd.m66266a(context).putExtra("attempt", i), 134217728), str);
            return;
        }
        sek sek = f78638a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Binding retry attempt out of allowed range: ");
        sb.append(i);
        sek.mo25416d(sb.toString(), new Object[0]);
    }
}
