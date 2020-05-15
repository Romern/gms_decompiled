package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: bvdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdi extends bvct {

    /* renamed from: g */
    public static final /* synthetic */ int f155648g = 0;

    /* renamed from: a */
    public final bvdc f155649a;

    /* renamed from: b */
    public final String f155650b;

    /* renamed from: c */
    public final buqh f155651c;

    /* renamed from: d */
    final bvcu f155652d;

    /* renamed from: e */
    final buqn f155653e = new bvdg(this, "SOPStop");

    /* renamed from: f */
    public boolean f155654f;

    /* renamed from: h */
    private final Executor f155655h;

    /* renamed from: i */
    private final Callable f155656i;

    /* renamed from: n */
    private bvbr f155657n;

    public bvdi(bvdc bvdc, buqh buqh, Executor executor) {
        this.f155649a = bvdc;
        this.f155650b = bvdc.getClass().getSimpleName();
        this.f155651c = buqh;
        this.f155655h = executor;
        this.f155654f = false;
        this.f155657n = null;
        bvat a = mo73315a(bvdc.mo73125c().getClass());
        this.f155656i = new bvdd(bvdc, a);
        this.f155652d = new bvcu(this.f155650b, new bvdh("SOPOnStatusUpdate", a, bvdc));
    }

    /* renamed from: a */
    public final void mo73285a() {
        this.f155651c.mo72984b();
        if (this.f155652d.mo73323g()) {
            this.f155652d.mo73317a();
            try {
                this.f155657n = (bvbr) this.f155656i.call();
                this.f155652d.mo73318b();
                bvbr bvbr = this.f155657n;
                if (bvbr == null) {
                    this.f155651c.mo72987c(this.f155653e);
                } else {
                    this.f155655h.execute(new bvde(this, bvbr));
                }
            } catch (Exception e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("bvdi", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s ERROR starting operation!", this.f155650b);
                this.f155654f = true;
                this.f155652d.mo73321e();
            }
        }
    }

    /* renamed from: b */
    public final void mo73286b() {
        this.f155651c.mo72984b();
        if (!this.f155652d.mo73324h()) {
            return;
        }
        if (this.f155652d.mo73322f()) {
            this.f155652d.mo73319c();
            this.f155652d.mo73320d();
        } else if (this.f155657n != null) {
            this.f155652d.mo73319c();
            try {
                this.f155657n.mo73116a();
            } catch (Exception e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("bvdi", "b", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s ERROR in canceling!", this.f155650b);
            }
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
        bvaa.f155452c = this.f155652d.f155608a.f155464j;
        bvaa.f155450a = i | 2;
        return (bvaa) da.mo74062i();
    }

    public final String toString() {
        String str = this.f155650b;
        String valueOf = String.valueOf(this.f155652d);
        String valueOf2 = String.valueOf(this.f155649a);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("SynchronousOperationTask{name='");
        sb.append(str);
        sb.append("', state=");
        sb.append(valueOf);
        sb.append(", operation=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo73337a(bvbr bvbr) {
        try {
            srn srn = bvcm.f155598a;
            bvbr.run();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("bvdi", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s ERROR in background job!", this.f155650b);
            this.f155654f = true;
        }
        this.f155651c.mo72987c(this.f155653e);
    }
}
