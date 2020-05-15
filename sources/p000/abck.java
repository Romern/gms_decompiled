package p000;

import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abck {

    /* renamed from: a */
    public final GoogleHelp f57036a;

    /* renamed from: a */
    public static final void m47447a(Runnable runnable, int i) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(i);
        thread.start();
    }

    public abck(GoogleHelp googleHelp) {
        this.f57036a = googleHelp;
    }
}
