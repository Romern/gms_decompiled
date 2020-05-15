package p000;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.logging.Logger;

/* renamed from: cayf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayf {

    /* renamed from: a */
    public final catk f176390a;

    /* renamed from: b */
    public final catt f176391b;

    /* renamed from: c */
    public cayd f176392c;

    /* renamed from: d */
    public cayl f176393d;

    /* renamed from: e */
    public boolean f176394e;

    /* renamed from: f */
    public boolean f176395f;

    /* renamed from: g */
    public caxv f176396g;

    public cayf(catt catt, catk catk) {
        this.f176391b = catt;
        this.f176390a = catk;
    }

    /* renamed from: a */
    private final void m127535a(boolean z, boolean z2, boolean z3) {
        cayl cayl;
        cayl cayl2;
        synchronized (this.f176391b) {
            cayl = null;
            if (z3) {
                this.f176396g = null;
            }
            if (z2) {
                this.f176394e = true;
            }
            cayl cayl3 = this.f176393d;
            if (cayl3 != null) {
                if (z) {
                    cayl3.f176421k = true;
                }
                if (this.f176396g == null && (this.f176394e || cayl3.f176421k)) {
                    int size = cayl3.f176420j.size();
                    int i = 0;
                    while (i < size) {
                        if (((Reference) cayl3.f176420j.get(i)).get() == this) {
                            cayl3.f176420j.remove(i);
                            cayl cayl4 = this.f176393d;
                            if (cayl4.f176417g > 0) {
                                this.f176392c = null;
                            }
                            if (cayl4.f176420j.isEmpty()) {
                                this.f176393d.f176422l = System.nanoTime();
                                Logger logger = cavb.f176115a;
                                catt catt = this.f176391b;
                                cayl cayl5 = this.f176393d;
                                if (!cayl5.f176421k) {
                                    if (catt.f175958c != 0) {
                                        catt.notifyAll();
                                    }
                                }
                                catt.f175961f.remove(cayl5);
                                cayl2 = this.f176393d;
                                this.f176393d = null;
                                cayl = cayl2;
                            }
                            cayl2 = null;
                            this.f176393d = null;
                            cayl = cayl2;
                        } else {
                            i++;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        }
        if (cayl != null) {
            cavk.m127312a(cayl.f176413c);
        }
    }

    /* renamed from: b */
    public final synchronized cayl mo75075b() {
        return this.f176393d;
    }

    /* renamed from: c */
    public final void mo75076c() {
        m127535a(false, true, false);
    }

    /* renamed from: d */
    public final void mo75077d() {
        m127535a(true, false, false);
    }

    /* renamed from: e */
    public final void mo75078e() {
        m127535a(true, false, true);
    }

    public final String toString() {
        return this.f176390a.toString();
    }

    /* renamed from: a */
    public final cavi mo75071a() {
        Logger logger = cavb.f176115a;
        return this.f176391b.f175962g;
    }

    /* renamed from: a */
    public final void mo75072a(caxv caxv) {
        synchronized (this.f176391b) {
            if (caxv != null) {
                if (caxv == this.f176396g) {
                }
            }
            String valueOf = String.valueOf(this.f176396g);
            String valueOf2 = String.valueOf(caxv);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
            sb.append("expected ");
            sb.append(valueOf);
            sb.append(" but was ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
        m127535a(false, false, true);
    }

    /* renamed from: a */
    public final void mo75073a(cayl cayl) {
        cayl.f176420j.add(new WeakReference(this));
    }

    /* renamed from: a */
    public final void mo75074a(IOException iOException) {
        synchronized (this.f176391b) {
            cayd cayd = this.f176392c;
            if (cayd != null) {
                cayl cayl = this.f176393d;
                if (cayl.f176417g == 0) {
                    caup caup = cayl.f176411a;
                    if (caup.f176066b.type() != Proxy.Type.DIRECT) {
                        catk catk = cayd.f176378a;
                        catk.f175831f.connectFailed(catk.f175826a.mo74886b(), caup.f176066b.address(), iOException);
                    }
                    cayd.f176379b.mo74960a(caup);
                } else {
                    this.f176392c = null;
                }
            }
        }
        mo75078e();
    }
}
