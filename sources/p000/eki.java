package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* renamed from: eki */
final /* synthetic */ class eki implements Runnable {

    /* renamed from: a */
    private final ekn f15183a;

    /* renamed from: b */
    private final ejb f15184b;

    /* renamed from: c */
    private final int f15185c;

    /* renamed from: d */
    private final Runnable f15186d;

    public eki(ekn ekn, ejb ejb, int i, Runnable runnable) {
        this.f15183a = ekn;
        this.f15184b = ejb;
        this.f15185c = i;
        this.f15186d = runnable;
    }

    public final void run() {
        ejl ejl;
        ekn ekn = this.f15183a;
        ejb ejb = this.f15184b;
        int i = this.f15185c;
        Runnable runnable = this.f15186d;
        try {
            emd emd = ekn.f15201d;
            ekw ekw = ekn.f15199b;
            ekw.getClass();
            emd.mo10265a(new ekl(ekw));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ekn.f15198a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    ejs a = ekn.f15202e.mo10212a(((eit) ejb).f15098a);
                    Iterable<ekz> iterable = (Iterable) ekn.f15201d.mo10265a(new ekj(ekn, ejb));
                    if (iterable.iterator().hasNext()) {
                        if (a != null) {
                            ArrayList arrayList = new ArrayList();
                            for (ekz ekz : iterable) {
                                arrayList.add(ekz.mo10251c());
                            }
                            ejj ejj = new ejj();
                            ejj.f15141a = arrayList;
                            ejj.f15142b = ((eit) ejb).f15099b;
                            String str = "";
                            if (ejj.f15141a == null) {
                                str = " events";
                            }
                            if (str.isEmpty()) {
                                ejl = a.mo10161a(new ejf(ejj.f15141a, ejj.f15142b));
                            } else {
                                throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
                            }
                        } else {
                            ejt.m10552a("Uploader", ejb);
                            ejl = ejl.m10538d();
                        }
                        ekn.f15201d.mo10265a(new ekk(ekn, ejl, iterable, ejb, i));
                    }
                    runnable.run();
                }
            }
            ekn.f15201d.mo10265a(new ekm(ekn, ejb, i));
        } catch (emb e) {
            ekn.f15200c.mo10228a(ejb, i + 1);
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
        runnable.run();
    }
}
