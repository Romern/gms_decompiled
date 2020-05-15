package p000;

import android.os.RemoteException;

/* renamed from: jmn */
final /* synthetic */ class jmn implements roo {

    /* renamed from: a */
    private final jmx f22825a;

    /* renamed from: b */
    private final rod f22826b;

    public jmn(jmx jmx, rod rod) {
        this.f22825a = jmx;
        this.f22826b = rod;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        jmx jmx = this.f22825a;
        rod rod = this.f22826b;
        jsv jsv = (jsv) obj;
        if (jmx.f22847b.size() == 0) {
            try {
                ((jsp) jsv.mo25289B()).mo13883a(jmx.f22846a);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        jmx.f22847b.add(rod);
    }
}
