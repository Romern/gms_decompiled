package p000;

import java.util.logging.Level;

/* renamed from: bknq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bknu f124948a;

    /* renamed from: b */
    private final bkob f124949b;

    public bknq(bknu bknu, bkob bkob) {
        this.f124948a = bknu;
        this.f124949b = bkob;
    }

    public final void run() {
        synchronized (this.f124948a) {
            if (!this.f124948a.mo66147c()) {
                bknu.f124952a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$BindRunnable", "run", "Opening bind request to server.");
                bknu bknu = this.f124948a;
                bknx bknx = bknu.f124961j;
                bknv bknv = new bknv(bknu.f124955d, this.f124949b, bknx.f124973a, bknu.f124958g);
                this.f124948a.mo66145a(bknv);
                bkns bkns = this.f124948a.f124954c;
                bknv.f124968f = bkns;
                bknv.f124969g = bkns;
                bknv.f124970h = bkns;
                bknv.f124971i = bkns;
                bknv.f124964b.mo66173a();
            }
        }
    }
}
