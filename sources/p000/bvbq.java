package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bvbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbq extends bvct {

    /* renamed from: i */
    public static final /* synthetic */ int f155550i = 0;

    /* renamed from: a */
    public final bvbk f155551a;

    /* renamed from: b */
    public final String f155552b;

    /* renamed from: c */
    public final bvcu f155553c;

    /* renamed from: d */
    public final AtomicInteger f155554d = new AtomicInteger(0);

    /* renamed from: e */
    public final buqh f155555e;

    /* renamed from: f */
    final bvda f155556f = new bvbn(this);

    /* renamed from: g */
    final bvda f155557g = new bvbo(this);

    /* renamed from: h */
    public final buqn f155558h = new bvbp(this, "AsynchronousOperation_checkStatusAndStop");

    /* renamed from: n */
    private final Callable f155559n;

    public bvbq(bvbk bvbk, buqh buqh) {
        this.f155551a = bvbk;
        this.f155552b = bvbk.getClass().getSimpleName();
        bvat a = mo73315a(bvbk.mo73128a().getClass());
        this.f155555e = buqh;
        this.f155559n = new bvbl(this, buqh, bvbk, a);
        this.f155553c = new bvcu(this.f155552b, new bvbm(a, bvbk));
    }

    /* renamed from: a */
    public final void mo73285a() {
        this.f155555e.mo72984b();
        if (this.f155553c.mo73323g()) {
            this.f155553c.mo73317a();
            try {
                srn srn = bvcm.f155598a;
                this.f155559n.call();
            } catch (Exception e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("bvbq", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s ERROR starting operation!", this.f155552b);
                this.f155553c.mo73321e();
            }
        }
    }

    /* renamed from: b */
    public final void mo73286b() {
        this.f155555e.mo72984b();
        if (!this.f155553c.mo73324h()) {
            return;
        }
        if (this.f155553c.mo73322f()) {
            this.f155553c.mo73319c();
            this.f155553c.mo73320d();
        } else if (this.f155554d.get() == 0) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bvbq", "b", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s hasn't been active yet", this.f155552b);
            mo73287c();
        } else {
            this.f155555e.mo72987c(this.f155558h);
        }
    }

    /* renamed from: c */
    public final void mo73287c() {
        this.f155555e.mo72984b();
        this.f155553c.mo73319c();
        try {
            this.f155551a.mo73130a(this.f155557g);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("bvbq", "c", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s ERROR in canceling!", this.f155552b);
            this.f155553c.mo73321e();
        }
    }

    /* renamed from: d */
    public final bvaa mo73288d() {
        bxvd da = bvaa.f155448d.mo74144da();
        String str = this.f155606l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvaa bvaa = (bvaa) da.f164949b;
        str.getClass();
        int i = bvaa.f155450a | 1;
        bvaa.f155450a = i;
        bvaa.f155451b = str;
        bvaa.f155452c = this.f155553c.f155608a.f155464j;
        bvaa.f155450a = i | 2;
        return (bvaa) da.mo74062i();
    }

    public final String toString() {
        String str = this.f155552b;
        String valueOf = String.valueOf(this.f155553c);
        int i = this.f155554d.get();
        String str2 = i != 0 ? i != 1 ? i != 2 ? "START_STATE_UNKNOWN" : "START_COMPLETE" : "START_CALLED" : "START_NOT_CALLED";
        String valueOf2 = String.valueOf(this.f155551a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 67 + String.valueOf(valueOf).length() + str2.length() + String.valueOf(valueOf2).length());
        sb.append("AsynchronousOperationTask{name='");
        sb.append(str);
        sb.append("', state=");
        sb.append(valueOf);
        sb.append(", hasStarted=");
        sb.append(str2);
        sb.append(", operation=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
