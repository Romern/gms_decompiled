package p000;

import android.media.ToneGenerator;
import android.os.SystemClock;

/* renamed from: afzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzu extends Thread {

    /* renamed from: a */
    public volatile boolean f65035a = false;

    public final void run() {
        ToneGenerator toneGenerator = new ToneGenerator(4, 100);
        while (!this.f65035a) {
            toneGenerator.startTone(25);
            SystemClock.sleep(2000);
        }
        toneGenerator.stopTone();
    }
}
