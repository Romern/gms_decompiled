package p000;

import android.content.Context;
import android.os.Handler;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aaxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxg implements Response.Listener, Response.ErrorListener, aarn {

    /* renamed from: a */
    public final Context f56746a;

    /* renamed from: b */
    public final abcr f56747b;

    /* renamed from: c */
    public final HelpConfig f56748c;

    /* renamed from: d */
    public final aaxf f56749d;

    /* renamed from: e */
    public Handler f56750e;

    /* renamed from: f */
    public Runnable f56751f;

    /* renamed from: g */
    Handler f56752g;

    /* renamed from: h */
    public final bqgj f56753h = snp.m35702a(9);

    /* renamed from: i */
    private final boolean f56754i;

    /* renamed from: j */
    private aarp f56755j;

    public aaxg(Context context, HelpConfig helpConfig, abcr abcr, aaxf aaxf, aarp aarp, boolean z) {
        this.f56746a = context;
        this.f56748c = helpConfig;
        this.f56747b = abcr;
        this.f56755j = aarp;
        this.f56749d = aaxf;
        this.f56754i = z;
    }

    /* renamed from: c */
    private final int m47149c() {
        aarp aarp = this.f56755j;
        if (aarp != null) {
            return aarp.mo31693a(aasj.m46870d(this.f56748c), -1);
        }
        return -1;
    }

    /* renamed from: d */
    private final void m47150d() {
        this.f56749d.mo31862h();
    }

    /* renamed from: e */
    private final void m47151e() {
        long j;
        long max = (long) Math.max(1, mo31866a());
        if (max > ceeg.f182447a.mo6606a().mo79020o()) {
            m47150d();
            return;
        }
        this.f56750e = new adzt();
        long b = mo31868b();
        if (m47149c() != 0) {
            j = ceeg.m136396B();
        } else {
            j = ceeg.f182447a.mo6606a().mo78976aQ();
        }
        aaxe aaxe = new aaxe(this, b);
        this.f56751f = aaxe;
        this.f56750e.postDelayed(aaxe, max * j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31866a() {
        int i;
        aarp aarp = this.f56755j;
        if (aarp != null) {
            i = aarp.mo31693a(aasj.m46871e(this.f56748c), 0);
        } else {
            i = 0;
        }
        return Math.max(0, i);
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        this.f56755j = aarp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: b */
    public final long mo31868b() {
        aarp aarp = this.f56755j;
        if (aarp != null) {
            return aarp.mo31694a(aasj.m46868b(this.f56748c), -1L);
        }
        return -1;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            i = networkResponse.statusCode;
        } else {
            i = -1;
        }
        if (i != -1) {
            if (i == 205) {
                this.f56749d.mo31863i();
            } else if (!(i == 500 || i == 503)) {
                m47150d();
            }
            this.f56749d.mo31861g();
            return;
        }
        mo31867a(mo31866a() + 1);
        m47151e();
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        bzqe bzqe = (bzqe) obj;
        int c = m47149c();
        if (bzqe != null) {
            aawg.m47103a(this.f56748c, this.f56755j, bzqe);
            if (mo31866a() > 0) {
                mo31867a(0);
            }
            if (!aawg.m47115e(this.f56746a, this.f56748c)) {
                m47151e();
            }
            if (bzqe.f170978a == 0) {
                this.f56749d.mo31864j();
            }
            if (aaya.m47229b(ceih.f182713a.mo6606a().mo79164a()) || bzqe.f170978a < c || c == -1) {
                if (aaya.m47229b(cein.f182721a.mo6606a().mo79172c()) && this.f56754i) {
                    long j = bzqe.f170980c;
                    adzt adzt = new adzt();
                    this.f56752g = adzt;
                    adzt.postDelayed(new aaxd(this, j), cein.f182721a.mo6606a().mo79173d());
                    return;
                }
                this.f56749d.mo31861g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Expected a non-null ChatRequestStatus object.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31867a(int i) {
        aarp aarp = this.f56755j;
        if (aarp != null) {
            aasa a = aarp.mo31695a();
            a.mo31687a(aasj.m46871e(this.f56748c), i);
            a.mo31685a();
        }
    }
}
