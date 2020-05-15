package p000;

import com.android.volley.VolleyError;
import java.util.Collections;

/* renamed from: vaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vaz extends Thread {

    /* renamed from: a */
    final /* synthetic */ int f48898a;

    /* renamed from: b */
    final /* synthetic */ vbb f48899b;

    /* renamed from: c */
    final /* synthetic */ ubx f48900c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vaz(vbb vbb, String str, int i, ubx ubx) {
        super(str);
        this.f48899b = vbb;
        this.f48898a = i;
        this.f48900c = ubx;
    }

    public final void run() {
        vbb vbb;
        vba vba;
        vba vba2 = new vba(false, Collections.EMPTY_LIST);
        try {
            vbb = this.f48899b;
            int i = this.f48898a;
            sbw sbw = vbb.f48903a;
            vbc vbc = new vbc(vbb.f48905c, vbb.f48907e, vbb.f48906d, i);
            vbi vbi = new vbi(vbb.f48904b, vbb.f48905c, vbc.mo28165b());
            vbc.mo28163a(vbi, vks.f49399a, vbb.f48908f);
            vbi.mo28196a(vbb.f48908f, true);
            vbc.mo28162a(vbb.f48908f);
            vba = vbb.mo28186a(true);
        } catch (VolleyError | InterruptedException | vbw e) {
            vbb.f48903a.mo25378c("PreparedSearch", "Full text search error.", e);
            vba = vbb.mo28186a(false);
        } catch (Throwable th) {
            this.f48900c.mo27225a(vba2);
            throw th;
        }
        this.f48900c.mo27225a(vba);
    }
}
