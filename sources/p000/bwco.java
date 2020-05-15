package p000;

/* renamed from: bwco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bwco implements bwct {

    /* renamed from: a */
    private Exception f158847a;

    /* renamed from: b */
    private bsbb f158848b;

    /* renamed from: c */
    private int f158849c;

    protected bwco() {
        mo73483l();
    }

    /* renamed from: a */
    private final synchronized void m121759a(int i) {
        this.f158849c = i;
    }

    /* renamed from: b */
    private final synchronized void m121760b(Exception exc) {
        this.f158847a = exc;
    }

    /* renamed from: a */
    public final synchronized void mo73470a(bsbb bsbb) {
        this.f158848b = bsbb;
    }

    /* renamed from: c */
    public final synchronized Exception mo73473c() {
        return this.f158847a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cU */
    public final synchronized void mo73474cU() {
        if (this.f158849c != 2) {
            throw new IllegalStateException("state != STATE_COMPLETED");
        }
    }

    /* renamed from: cV */
    public final synchronized int mo73475cV() {
        return this.f158849c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cW */
    public final synchronized void mo73476cW() {
        m121759a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: cX */
    public final synchronized void mo73477cX() {
        m121759a(2);
        mo73484m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: cY */
    public final synchronized void mo73478cY() {
        m121759a(4);
    }

    /* renamed from: d */
    public final synchronized boolean mo73479d() {
        return this.f158847a != null;
    }

    /* renamed from: f */
    public final synchronized boolean mo73480f() {
        return this.f158849c == 1;
    }

    /* renamed from: g */
    public final synchronized boolean mo73481g() {
        int i;
        i = this.f158849c;
        return i == 2 || i == 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public synchronized void mo73482i() {
        mo73484m();
    }

    /* renamed from: l */
    public final synchronized void mo73483l() {
        this.f158849c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final synchronized void mo73484m() {
        bsbb bsbb = this.f158848b;
        if (bsbb != null) {
            bsbb.f143921a.mo70155a(bsbb);
        }
    }

    /* renamed from: b */
    public synchronized void mo73472b() {
        mo73478cY();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo73471a(Exception exc) {
        m121759a(3);
        m121760b(exc);
        mo73484m();
    }
}
