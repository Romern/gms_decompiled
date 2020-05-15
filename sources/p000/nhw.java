package p000;

import android.os.SystemClock;

/* renamed from: nhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhw implements nhs {

    /* renamed from: e */
    private static final bnsn f35675e = odk.m28481a("CAR.AudioStreamsMgr");

    /* renamed from: a */
    public final nxc[] f35676a = new nxc[3];

    /* renamed from: b */
    public final nxe[] f35677b = new nxe[3];

    /* renamed from: c */
    public volatile int[] f35678c = {0, 0, 0};

    /* renamed from: d */
    public nhv f35679d;

    /* renamed from: f */
    private final Object f35680f = new Object();

    /* renamed from: g */
    private final boolean[] f35681g = new boolean[2];

    /* renamed from: h */
    private final njc f35682h;

    public nhw(njc njc) {
        this.f35682h = njc;
    }

    /* renamed from: a */
    private final void m26344a(int i, boolean z) {
        synchronized (this.f35680f) {
            if (z) {
                int[] iArr = this.f35678c;
                iArr[i] = iArr[i] | 2;
            } else {
                int[] iArr2 = this.f35678c;
                iArr2[i] = iArr2[i] & -3;
            }
        }
    }

    /* renamed from: e */
    private final void m26346e() {
        bnrv.m110182a(new nht(this));
        bnrv.m110182a(new nhu(this));
    }

    /* renamed from: j */
    private final boolean m26347j(int i) {
        if (!m26350m(i) || this.f35677b[i].mo20666k()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m26348k(int i) {
        return m26350m(i) && this.f35677b[i].mo20661f();
    }

    /* renamed from: l */
    private final boolean m26349l(int i) {
        boolean z;
        synchronized (this.f35680f) {
            z = (this.f35678c[i] & 2) != 0;
        }
        return z;
    }

    /* renamed from: m */
    private final boolean m26350m(int i) {
        boolean z;
        synchronized (this.f35680f) {
            z = this.f35678c[i] == 3;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo20709b() {
        int i = 1;
        while (true) {
            if (i < 0) {
                break;
            }
            synchronized (this.f35680f) {
                if (this.f35681g[i]) {
                    int i2 = i ^ 1;
                    nxe nxe = null;
                    if (m26348k(i)) {
                        if (this.f35677b[i].mo20654a(this.f35676a[i])) {
                            nxe = this.f35677b[i];
                        }
                    } else if (m26350m(i2)) {
                        if (m26348k(i2)) {
                            if (m26350m(i)) {
                                nxc g = this.f35677b[i].mo20662g();
                                if (g == null) {
                                    if (this.f35677b[i].mo20654a(this.f35676a[i])) {
                                        nxe = this.f35677b[i];
                                    }
                                } else if (njp.m26584a(g.mo20677b()) == i2) {
                                    if (this.f35677b[i2].mo20654a(g)) {
                                        g.mo20674a(this.f35677b[i2], 1000);
                                    }
                                    if (this.f35677b[i].mo20654a(this.f35676a[i])) {
                                        nxe = this.f35677b[i];
                                    }
                                }
                            } else if (this.f35677b[i2].mo20654a(this.f35676a[i])) {
                                nxe = this.f35677b[i2];
                            }
                        } else if (i == 1) {
                            nxe nxe2 = this.f35677b[i2];
                            nxc g2 = nxe2.mo20662g();
                            if (g2 != null) {
                                g2.mo20673a(nxe2);
                                nxe2.mo20664i();
                                mo20708a(3, 5000, false);
                                if (nxe2.mo20654a(this.f35676a[1])) {
                                    nxe = nxe2;
                                }
                                synchronized (this.f35680f) {
                                    this.f35681g[njp.m26584a(g2.mo20677b())] = true;
                                }
                            } else {
                                nxe = nxe2;
                            }
                        }
                    }
                    if (nxe == null) {
                        bnsi d = f35675e.mo68390d();
                        d.mo68432a("nhw", "b", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68409a("Couldn't get bottom half for %d", i);
                        break;
                    }
                    bnsi d2 = f35675e.mo68390d();
                    d2.mo68432a("nhw", "b", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("Requested bottom half available %s", nxe);
                    synchronized (this.f35680f) {
                        this.f35681g[i] = false;
                    }
                    this.f35676a[i].mo20678b(nxe);
                } else {
                    bnsi d3 = f35675e.mo68390d();
                    d3.mo68432a("nhw", "b", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68409a("Audio stream %d did not request bottom half", i);
                }
            }
            i--;
        }
        m26346e();
    }

    /* renamed from: c */
    public final synchronized void mo20700c(int i) {
        int a = njp.m26584a(i);
        synchronized (this.f35680f) {
            this.f35681g[a] = false;
        }
    }

    /* renamed from: d */
    public final void mo20711d() {
        nxe nxe;
        for (int i = 0; i < 3; i++) {
            if (!m26350m(i) && (nxe = this.f35677b[i]) != null) {
                nxe.mo20659d();
            }
        }
    }

    /* renamed from: f */
    public final void mo20703f(int i) {
        mo20708a(i, 5000, true);
    }

    /* renamed from: g */
    public final boolean mo20712g(int i) {
        boolean z;
        int a = njp.m26584a(i);
        synchronized (this.f35680f) {
            z = this.f35678c[a] == 3;
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhw.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nhw.a(nxc, nxe):void
      nhw.a(boolean, boolean):void
      nhs.a(boolean, boolean):void
      nhw.a(int, boolean):void */
    /* renamed from: h */
    public final void mo20713h(int i) {
        int a = njp.m26584a(i);
        boolean l = m26349l(a);
        bnsi d = f35675e.mo68390d();
        d.mo68432a("nhw", "h", 542, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68431a("enabling stream: %s, had focus: %b", (Object) njp.m26591d(i), l);
        if (!l) {
            m26344a(a, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhw.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nhw.a(nxc, nxe):void
      nhw.a(boolean, boolean):void
      nhs.a(boolean, boolean):void
      nhw.a(int, boolean):void */
    /* renamed from: i */
    public final void mo20714i(int i) {
        int a = njp.m26584a(i);
        boolean l = m26349l(a);
        bnsi d = f35675e.mo68390d();
        d.mo68432a("nhw", "i", 554, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68431a("disabling stream: %s, had focus: %b", (Object) njp.m26591d(i), l);
        if (l) {
            m26344a(a, false);
        }
    }

    /* renamed from: c */
    public final boolean mo20710c() {
        boolean z;
        synchronized (this.f35680f) {
            z = true;
            boolean j = m26347j(1);
            boolean j2 = m26347j(0);
            if (!j) {
                z = false;
            } else if (!j2) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public final void mo20701d(int i) {
        bnsi d = f35675e.mo68390d();
        d.mo68432a("nhw", "d", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Mark stream ready: %d", i);
        int a = njp.m26584a(i);
        synchronized (this.f35680f) {
            int[] iArr = this.f35678c;
            iArr[a] = iArr[a] | 1;
        }
        nxc nxc = this.f35676a[a];
        if (nxc != null) {
            nxc.mo20671a();
        }
        this.f35682h.mo20873a(biou.AUDIO_FOCUS_STATE_INVALID);
    }

    /* renamed from: a */
    private static final void m26345a(nxc nxc, nxe nxe) {
        nxe.mo20663h();
        nxe.mo20654a(nxc);
        nxc.mo20674a(nxe, 1000);
    }

    /* renamed from: e */
    public final void mo20702e(int i) {
        bnsi d = f35675e.mo68390d();
        d.mo68432a("nhw", "e", 351, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Mark stream not ready: %d", i);
        int a = njp.m26584a(i);
        synchronized (this.f35680f) {
            int[] iArr = this.f35678c;
            iArr[a] = iArr[a] & -2;
        }
        this.f35682h.mo20873a(biou.AUDIO_FOCUS_STATE_INVALID);
    }

    /* renamed from: a */
    public final synchronized nxe mo20696a(int i) {
        int a = njp.m26584a(i);
        if (m26350m(a)) {
            nxe nxe = this.f35677b[a];
            if (nxe.mo20661f()) {
                if (nxe.mo20654a(this.f35676a[a])) {
                    bnsi d = f35675e.mo68390d();
                    d.mo68432a("nhw", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68409a("requestBottomHalfForStream grant to stream %d", i);
                    return nxe;
                }
            } else if (this.f35676a[a] == nxe.mo20662g()) {
                bnsi c = f35675e.mo68388c();
                c.mo68432a("nhw", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("requestBottomHalfForStream for stream:%d while it is occupying BH", i);
                return nxe;
            }
        }
        synchronized (this.f35680f) {
            this.f35681g[a] = true;
        }
        this.f35679d.mo20705a();
        return null;
    }

    /* renamed from: a */
    public final void mo20697a() {
        this.f35679d.mo20705a();
    }

    /* renamed from: a */
    public final void mo20708a(int i, long j, boolean z) {
        int i2;
        int i3 = njp.f35842m;
        int a = njp.m26584a(i);
        nxe nxe = this.f35677b[a];
        if (nxe != null) {
            synchronized (this.f35680f) {
                i2 = this.f35678c[a] & 1;
            }
            if (i2 != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = j;
                while (!nxe.mo20666k() && j2 > 0) {
                    nxe.mo20648a(j2, z);
                    j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20698a(boolean z, boolean z2) {
        boolean z3;
        nxc nxc;
        boolean z4;
        boolean g = mo20712g(3);
        boolean g2 = mo20712g(5);
        nxe[] nxeArr = this.f35677b;
        nxe nxe = nxeArr[0];
        nxe nxe2 = nxeArr[1];
        nxc nxc2 = null;
        if (!g) {
            nxc = null;
            z3 = false;
        } else {
            if (nxe != null) {
                nxc = nxe.mo20662g();
                if (nxc == null) {
                    z3 = false;
                } else if (nxc.mo20677b() != 3) {
                    z3 = true;
                }
            } else {
                nxc = null;
            }
            z3 = false;
        }
        if (!g2) {
            z4 = false;
        } else {
            if (nxe2 != null) {
                nxc2 = nxe2.mo20662g();
                if (nxc2 == null) {
                    z4 = false;
                } else if (nxc2.mo20677b() != 5) {
                    z4 = true;
                }
            }
            z4 = false;
        }
        if (!z) {
            mo20714i(3);
        } else {
            mo20713h(3);
        }
        if (!z2) {
            mo20714i(5);
        } else {
            mo20713h(5);
        }
        bnsi d = f35675e.mo68390d();
        d.mo68432a("nhw", "a", 435, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        String str = "nhw";
        d.mo68426a("handleStreamFocusChange old state media: %b tts: %b, new state media: %b tts: %b", Boolean.valueOf(g), Boolean.valueOf(g2), Boolean.valueOf(z), Boolean.valueOf(z2));
        nxc[] nxcArr = this.f35676a;
        nxc nxc3 = nxcArr[0];
        nxc nxc4 = nxcArr[1];
        if (!z) {
            if (z2) {
                if (z3 && nxc4 != null && nxc4 == nxc) {
                    m26345a(nxc4, nxe2);
                } else if ((nxc4 == null || nxc4 != nxc2) && ((!z4 || nxc3 == null || nxc3 != nxc2) && nxc3 != null && nxc3 == nxc)) {
                    m26345a(nxc3, nxe2);
                }
            }
        } else if (!z2) {
            if (z4 && nxc3 != null && nxc3 == nxc2) {
                m26345a(nxc3, nxe);
            } else if ((nxc3 == null || nxc3 != nxc) && ((!z3 || nxc4 == null || nxc4 != nxc) && nxc4 != null && nxc4 == nxc2)) {
                m26345a(nxc4, nxe);
            }
        } else if (nxc == null || nxc2 == null) {
            if (nxc2 != null && nxc3 != null && nxc3 == nxc2) {
                m26345a(nxc3, nxe);
            } else if (!(nxc == null || nxc4 == null || nxc4 != nxc)) {
                m26345a(nxc4, nxe2);
            }
        } else if (z3) {
            bnsi c = f35675e.mo68388c();
            c.mo68432a(str, "a", 444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("media - tts channel swapped fully");
            nxc.mo20673a(nxe);
            m26345a(nxc2, nxe);
        }
        m26346e();
        mo20711d();
        mo20709b();
    }

    /* renamed from: b */
    public final synchronized void mo20699b(int i) {
        int a = njp.m26584a(i);
        synchronized (this.f35680f) {
            this.f35681g[a] = true;
        }
    }
}
