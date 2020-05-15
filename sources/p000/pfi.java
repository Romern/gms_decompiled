package p000;

import android.os.RemoteException;

/* renamed from: pfi */
public final /* synthetic */ class pfi implements roo {

    /* renamed from: a */
    private final pfv f39027a;

    /* renamed from: b */
    private final String f39028b;

    /* renamed from: c */
    private final String f39029c;

    public pfi(pfv pfv, String str, String str2) {
        this.f39027a = pfv;
        this.f39028b = str;
        this.f39029c = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        pfv pfv = this.f39027a;
        String str = this.f39028b;
        String str2 = this.f39029c;
        ptj ptj = (ptj) obj;
        long incrementAndGet = pfv.f39058h.incrementAndGet();
        pfv.mo23023d();
        try {
            pfv.f39068r.put(Long.valueOf(incrementAndGet), obj2);
            ((ptq) ptj.mo25289B()).mo23650a(str, str2, incrementAndGet);
        } catch (RemoteException e) {
            pfv.f39068r.remove(Long.valueOf(incrementAndGet));
            ((aucf) obj2).mo50390a((Exception) e);
        }
    }
}
