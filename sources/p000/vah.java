package p000;

import com.android.volley.VolleyError;

/* renamed from: vah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vah extends Thread {

    /* renamed from: a */
    final /* synthetic */ int f48828a;

    /* renamed from: b */
    final /* synthetic */ vaf f48829b;

    /* renamed from: c */
    final /* synthetic */ vai f48830c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vah(vai vai, String str, int i, vaf vaf) {
        super(str);
        this.f48830c = vai;
        this.f48828a = i;
        this.f48829b = vaf;
    }

    public final void run() {
        String str;
        vcg vcg;
        vag vag;
        vag vag2 = new vag(false, 0, false);
        try {
            vai vai = this.f48830c;
            int i = this.f48828a;
            sbw sbw = vai.f48831a;
            str = vai.f48834d.f47682a;
            vcg = vai.f48833c.f49763j;
            vcg.mo28219a(str);
            try {
                vaj vaj = new vaj(vai.f48834d, vai.f48836f, vai.f48835e, i);
                vbi vbi = new vbi(vai.f48833c, vai.f48834d, vaj.mo28165b());
                vaj.mo28163a(vbi, vks.f49399a, vai.f48837g);
                vbi.mo28196a(vai.f48837g, false);
                vaj.mo28162a(vai.f48837g);
                vag = vai.mo28160a(true);
                vcg.mo28224b(str);
            } catch (VolleyError | InterruptedException | vbw e) {
                vai.f48831a.mo25378c("PreparedSyncMoreImpl", "Error syncing more.", e);
                vcg.mo28224b(str);
                vag = vai.mo28160a(false);
            }
            this.f48829b.mo28158a(vag);
        } catch (Throwable th) {
            this.f48829b.mo28158a(vag2);
            throw th;
        }
    }
}
