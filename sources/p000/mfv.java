package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.ExecutorService;

/* renamed from: mfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mfv implements Runnable {

    /* renamed from: a */
    public final mib f33608a;

    /* renamed from: b */
    private final ExecutorService f33609b;

    /* renamed from: c */
    private final Context f33610c;

    public mfv(Context context, ExecutorService executorService, mib mib) {
        this.f33609b = executorService;
        this.f33608a = mib;
        this.f33610c = context;
    }

    public final void run() {
        Intent registerReceiver = this.f33610c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        bxvd da = mpd.f34110e.mo74144da();
        int intExtra = registerReceiver.getIntExtra("level", -1);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpd mpd = (mpd) da.f164949b;
        mpd.f34112a |= 2;
        mpd.f34114c = intExtra;
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpd mpd2 = (mpd) da.f164949b;
        boolean z = true;
        mpd2.f34112a |= 1;
        mpd2.f34113b = intExtra2;
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        if (!(intExtra3 == 2 || intExtra3 == 5)) {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpd mpd3 = (mpd) da.f164949b;
        mpd3.f34112a |= 4;
        mpd3.f34115d = z;
        this.f33609b.execute(new mfu(this, da));
    }
}
