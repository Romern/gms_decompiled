package p000;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* renamed from: bghn */
public final /* synthetic */ class bghn implements Runnable {

    /* renamed from: a */
    private final bgid f116444a;

    /* renamed from: b */
    private final PrintWriter f116445b;

    /* renamed from: c */
    private final CountDownLatch f116446c;

    public bghn(bgid bgid, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.f116444a = bgid;
        this.f116445b = printWriter;
        this.f116446c = countDownLatch;
    }

    public final void run() {
        String str;
        bgid bgid = this.f116444a;
        PrintWriter printWriter = this.f116445b;
        CountDownLatch countDownLatch = this.f116446c;
        bgid.f116491l.mo61032a(printWriter);
        bgid.f116481b.mo62046a();
        bgmk bgmk = bgid.f116485f.f116625f;
        bgid.f116481b.mo62054a(new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US), System.currentTimeMillis() - SystemClock.elapsedRealtime(), printWriter);
        if (bgid.f116488i.f116748a != 1) {
            str = "trusted";
        } else {
            str = "untrusted";
        }
        printWriter.println(str.length() == 0 ? new String("Wifi timestamps are currently ") : "Wifi timestamps are currently ".concat(str));
        countDownLatch.countDown();
    }
}
