package p000;

import android.os.IBinder;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: bfuc */
final /* synthetic */ class bfuc implements Runnable {

    /* renamed from: a */
    private final bfuh f115312a;

    /* renamed from: b */
    private final aehq f115313b;

    public bfuc(bfuh bfuh, aehq aehq) {
        this.f115312a = bfuh;
        this.f115313b = aehq;
    }

    public final void run() {
        bfuh bfuh = this.f115312a;
        IBinder asBinder = this.f115313b.asBinder();
        if (asBinder != null) {
            bfub bfub = (bfub) bfuh.f115327c.mo25989b(asBinder);
            if (bfub != null) {
                bfox bfox = bfuh.f115331g;
                String str = bfub.f115308b;
                if (bfox.mo62073a() && bfox.f114735c.containsKey(str)) {
                    Pair pair = (Pair) bfox.f114735c.get(str);
                    if (((Integer) pair.first).intValue() == 1) {
                        bxvd bxvd = (bxvd) bfox.f114736d.get(str);
                        int seconds = ((bpla) bxvd.f164949b).f138052c + ((int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - ((Long) pair.second).longValue()));
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpla bpla = (bpla) bxvd.f164949b;
                        bpla bpla2 = bpla.f138048d;
                        bpla.f138050a |= 8;
                        bpla.f138052c = seconds;
                        bfox.f114736d.put(str, bxvd);
                        bfox.f114735c.remove(str);
                    } else {
                        bfox.f114735c.put(str, Pair.create(Integer.valueOf(((Integer) pair.first).intValue() - 1), (Long) pair.second));
                    }
                }
                bfuh.f115327c.mo25984a(asBinder);
                return;
            }
            return;
        }
        bftx.m97877a("Received null listener to remove", new Object[0]);
    }
}
