package p000;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: apki */
final /* synthetic */ class apki implements Callable {

    /* renamed from: a */
    private final apkk f84601a;

    public apki(apkk apkk) {
        this.f84601a = apkk;
    }

    public final Object call() {
        apkk apkk = this.f84601a;
        String valueOf = String.valueOf(apkk.f84605c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("nts:reachability:check:");
        sb.append(valueOf);
        aech aech = new aech(sb.toString());
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            apkb apkb = new apkb(elapsedRealtime, apkk.f84606d.mo47354a(apkk.f84605c, apkk.f84603a), SystemClock.elapsedRealtime() - elapsedRealtime);
            aech.close();
            return apkb;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
