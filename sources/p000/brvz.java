package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: brvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brvz extends chqs {

    /* renamed from: a */
    public final Object f143495a = new Object();

    /* renamed from: b */
    public final Queue f143496b = new ArrayDeque();

    /* renamed from: c */
    public chqs f143497c = this.f143498d.mo70053a(this.f143499e, this.f143500f);

    /* renamed from: d */
    final /* synthetic */ chqp f143498d;

    /* renamed from: e */
    final /* synthetic */ chtv f143499e;

    /* renamed from: f */
    final /* synthetic */ chqo f143500f;

    public brvz(chqp chqp, chtv chtv, chqo chqo) {
        this.f143498d = chqp;
        this.f143499e = chtv;
        this.f143500f = chqo;
    }

    /* renamed from: a */
    public final chqs mo70028a() {
        chqs chqs;
        synchronized (this.f143495a) {
            chqs = this.f143497c;
        }
        return chqs;
    }

    /* renamed from: b */
    public final void mo70032b() {
        synchronized (this.f143495a) {
            this.f143496b.add(new brvw(this));
            mo70028a().mo70032b();
        }
    }

    /* renamed from: a */
    public final void mo70029a(int i) {
        synchronized (this.f143495a) {
            this.f143496b.add(new brvu(this, i));
            mo70028a().mo70029a(i);
        }
    }

    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        synchronized (this.f143495a) {
            chtr chtr2 = new chtr();
            chtr2.mo85649a(chtr);
            this.f143496b.add(new brvt(this, chqr, chtr2));
            mo70028a().mo56351a(new brvy(this, chqr), chtr);
        }
    }

    /* renamed from: a */
    public final void mo70030a(Object obj) {
        synchronized (this.f143495a) {
            this.f143496b.add(new brvx(this, obj));
            mo70028a().mo70030a(obj);
        }
    }

    /* renamed from: a */
    public final void mo70031a(String str, Throwable th) {
        synchronized (this.f143495a) {
            this.f143496b.add(new brvv(this, str, th));
            mo70028a().mo70031a(str, th);
        }
    }
}
