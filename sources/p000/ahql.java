package p000;

import java.util.Collections;

/* renamed from: ahql */
final /* synthetic */ class ahql implements Runnable {

    /* renamed from: a */
    private final ahra f67795a;

    /* renamed from: b */
    private final buut f67796b;

    /* renamed from: c */
    private final String f67797c;

    /* renamed from: d */
    private final buuq f67798d;

    /* renamed from: e */
    private final ahkv f67799e;

    public ahql(ahra ahra, buut buut, String str, buuq buuq, ahkv ahkv) {
        this.f67795a = ahra;
        this.f67796b = buut;
        this.f67797c = str;
        this.f67798d = buuq;
        this.f67799e = ahkv;
    }

    public final void run() {
        int i;
        long j;
        ahra ahra = this.f67795a;
        buut buut = this.f67796b;
        String str = this.f67797c;
        buuq buuq = this.f67798d;
        ahkv ahkv = this.f67799e;
        ahqy a = ahra.f67855d.mo36987a(buut.f154982b);
        if (a != null && a.mo36979a(str) != null) {
            boolean a2 = ahra.m56393a(buuq);
            ahis ahis = new ahis();
            ahis.mo36542b(buut.f154982b);
            if (!a2) {
                i = 3;
            } else {
                i = 1;
            }
            ahis.mo36540a(i);
            ahis.mo36543c(buut.f154984d);
            if (!a2) {
                j = buuq.f154976c + ((long) buuq.f154977d.mo73744a());
            } else {
                j = buuq.f154976c;
            }
            ahis.mo36541a(j);
            ahkv.mo36696a(str, ahis.f67256a);
            if (a2) {
                ahkv.f67390f.mo36658a(str, buut.f154982b, bvih.SUCCESS);
                a.mo36982a(Collections.singletonList(str));
                if (a.mo36984c().isEmpty()) {
                    a.mo36985d();
                    ahra.f67855d.mo36990b(buut.f154982b);
                    return;
                }
                return;
            }
            ahkv.f67390f.mo36657a(str, buut.f154982b, (long) buuq.f154977d.mo73744a());
        }
    }
}
