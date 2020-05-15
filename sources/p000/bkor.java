package p000;

/* renamed from: bkor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkor implements bkov {

    /* renamed from: a */
    public bkou f125029a;

    /* renamed from: b */
    int f125030b = 3;

    /* renamed from: c */
    private boolean f125031c;

    /* renamed from: a */
    public final synchronized void mo66173a() {
        if (this.f125030b == 3) {
            this.f125030b = 2;
            mo66177c();
        } else {
            throw new IllegalStateException("Cannot open if connection is not in state NEW.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo66175a(bkou bkou) {
        this.f125029a = bkou;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r0.mo66151a();
     */
    /* renamed from: b */
    public final void mo66176b() {
        synchronized (this) {
            if (this.f125030b != 1) {
                this.f125030b = 1;
                mo66178d();
                bkou bkou = this.f125029a;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo66177c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo66178d();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66174a(bkot bkot) {
        bkou bkou;
        synchronized (this) {
            if (!this.f125031c) {
                this.f125031c = true;
                bkou = this.f125029a;
            } else {
                bkou = null;
            }
        }
        if (bkou != null) {
            bkou.mo66153a(bkot);
        }
    }
}
