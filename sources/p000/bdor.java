package p000;

import android.os.StrictMode;

/* renamed from: bdor */
final /* synthetic */ class bdor implements Runnable {

    /* renamed from: a */
    static final Runnable f106160a = new bdor();

    private bdor() {
    }

    public final void run() {
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
    }
}
