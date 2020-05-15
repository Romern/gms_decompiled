package p000;

import java.util.Vector;

/* renamed from: bsbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbc implements Runnable {

    /* renamed from: a */
    protected final Vector f143924a = new Vector();

    /* renamed from: b */
    protected final Vector f143925b = new Vector();

    /* renamed from: c */
    public final Object f143926c = new Object();

    /* renamed from: d */
    public final Thread[] f143927d;

    /* renamed from: e */
    public final String f143928e;

    /* renamed from: f */
    public boolean f143929f = false;

    public bsbc(String str) {
        this.f143928e = str;
        this.f143927d = new Thread[1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo70156b(bsbb bsbb) {
        synchronized (this.f143926c) {
            int i = bsbb.f143923c;
            if (i == 1) {
                bsbe.m115043a(this.f143925b.contains(bsbb));
                this.f143925b.removeElement(bsbb);
                bsbb.f143923c = 0;
                this.f143926c.notifyAll();
                return true;
            } else if (i == 2) {
                bsbe.m115043a(this.f143924a.contains(bsbb));
                this.f143924a.removeElement(bsbb);
                bsbb.f143923c = 0;
                this.f143926c.notifyAll();
                return true;
            } else if (i != 3 && i != 4) {
                return false;
            } else {
                bsbb.f143923c = 0;
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo70157c(bsbb bsbb) {
        synchronized (this.f143926c) {
            bsbe.m115044b(this.f143924a.contains(bsbb));
            this.f143924a.add(bsbb);
            bsbb.f143923c = 2;
            this.f143926c.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r1 == null) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.mo70152c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        p000.bqye.m113758a(r2);
     */
    public final void run() {
        bsbb bsbb = null;
        while (true) {
            synchronized (this.f143926c) {
                if (bsbb != null) {
                    int i = bsbb.f143923c;
                    if (i == 4) {
                        bsbb.f143923c = 0;
                        bsbb.mo70154e();
                    } else if (i == 3) {
                        bsbb.f143923c = 0;
                    }
                }
                if (this.f143929f && this.f143924a.isEmpty()) {
                    try {
                        if (!this.f143925b.isEmpty()) {
                            long g = ((bsbd) this.f143925b.elementAt(0)).mo70162g() - System.currentTimeMillis();
                            if (g > 0) {
                                this.f143926c.wait(g);
                            }
                        } else {
                            this.f143926c.wait();
                        }
                    } catch (InterruptedException e) {
                        bqye.m113758a(e);
                    }
                }
                if (this.f143929f) {
                    while (!this.f143925b.isEmpty()) {
                        bsbd bsbd = (bsbd) this.f143925b.elementAt(0);
                        if (bsbd.mo70162g() - System.currentTimeMillis() > 0) {
                            break;
                        }
                        this.f143925b.removeElementAt(0);
                        mo70157c(bsbd);
                    }
                    if (!this.f143924a.isEmpty()) {
                        bsbb = (bsbb) this.f143924a.elementAt(0);
                        bsbb.f143923c = 3;
                        this.f143924a.removeElementAt(0);
                    } else {
                        bsbb = null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70155a(bsbb bsbb) {
        bsbe.m115040a(bsbb);
        synchronized (this.f143926c) {
            int i = bsbb.f143923c;
            if (i == 0) {
                bsbb.mo70154e();
            } else if (i == 3) {
                bsbb.f143923c = 4;
            }
        }
    }
}
