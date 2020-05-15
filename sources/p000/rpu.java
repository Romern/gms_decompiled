package p000;

import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

/* renamed from: rpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rpu implements RequestQueue.RequestEventListener {

    /* renamed from: a */
    final /* synthetic */ rpw f43502a;

    public rpu(rpw rpw) {
        this.f43502a = rpw;
    }

    public final void onRequestEvent(Request request, int i) {
        synchronized (this.f43502a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (((Boolean) this.f43502a.f43507e.mo6606a()).booleanValue()) {
                                    ((rpv) this.f43502a.f43506c.get(request)).f43504b.mo69138b((Object) null);
                                }
                                this.f43502a.f43506c.remove(request);
                            }
                        }
                    }
                }
                blka blka = (blka) rpw.f43505d.get();
                if (blka == null) {
                    Log.e("GmsRequestQueue", "Old trace reference is null");
                } else {
                    blka.m107274a(blka);
                    rpw.f43505d.remove();
                }
            }
            if (rpw.f43505d.get() == null) {
                rpw.f43505d.set(blka.m107273a());
            }
            blka.m107274a(((rpv) this.f43502a.f43506c.get(request)).f43503a);
        }
    }
}
