package p000;

import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;

/* renamed from: apkf */
public final /* synthetic */ class apkf implements Runnable {

    /* renamed from: a */
    private final ReachabilityObserver$AlarmReceiver f84589a;

    public apkf(ReachabilityObserver$AlarmReceiver reachabilityObserver$AlarmReceiver) {
        this.f84589a = reachabilityObserver$AlarmReceiver;
    }

    public final void run() {
        ReachabilityObserver$AlarmReceiver reachabilityObserver$AlarmReceiver = this.f84589a;
        synchronized (reachabilityObserver$AlarmReceiver.f107341a) {
            apkg apkg = reachabilityObserver$AlarmReceiver.f107341a;
            int i = apkg.f84590d;
            apkg.f84594c = null;
            if (cedu.m136333b()) {
                for (apkk apkk : apkg.f84593b.values()) {
                    apkk.mo47363a();
                }
            }
        }
    }
}
