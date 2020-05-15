package p000;

import android.os.Binder;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: olw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class olw implements oln {

    /* renamed from: a */
    private static final bnsn f37930a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    private final Object f37931b = new Object();

    /* renamed from: c */
    private olm f37932c = olm.IDLE;

    /* renamed from: d */
    private final bnfd f37933d;

    /* renamed from: e */
    private final int f37934e;

    /* renamed from: f */
    private final niw f37935f;

    public olw(int i, niw niw) {
        this.f37934e = i;
        this.f37935f = niw;
        bnfd a = bnfd.m109230a(10);
        this.f37933d = a;
        a.add(new ConnectionState(System.currentTimeMillis(), this.f37932c.ordinal(), null, SystemClock.elapsedRealtime()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (p000.olm.CONNECTING.equals(r12) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (p000.olm.DISCONNECTING.equals(r12) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r3 == false) goto L_0x0073;
     */
    /* renamed from: b */
    private final void m29113b(olm olm, CriticalError criticalError) {
        olm olm2;
        boolean z;
        synchronized (this.f37931b) {
            olm2 = this.f37932c;
            this.f37932c = olm;
            this.f37933d.add(new ConnectionState(System.currentTimeMillis(), olm.ordinal(), criticalError, SystemClock.elapsedRealtime()));
        }
        olm olm3 = olm.IDLE;
        int ordinal = olm2.ordinal();
        if (ordinal == 0) {
            z = olm.CONNECTING.equals(olm);
        } else if (ordinal == 1) {
            if (!olm.CONNECTED.equals(olm)) {
            }
            bnsi d = f37930a.mo68390d();
            d.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68424a("Car connection state changed: %s->%s", olm2, olm);
        } else if (ordinal == 2) {
            z = olm.DISCONNECTING.equals(olm);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (!olm.IDLE.equals(olm)) {
                }
                bnsi d2 = f37930a.mo68390d();
                d2.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68424a("Car connection state changed: %s->%s", olm2, olm);
            }
            bnsi c = f37930a.mo68388c();
            c.mo68432a("olw", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68424a("Unexpected state transition: %s->%s", olm2, olm);
            bnsi d22 = f37930a.mo68390d();
            d22.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d22.mo68424a("Car connection state changed: %s->%s", olm2, olm);
        } else {
            z = olm.DISCONNECTED.equals(olm);
        }
    }

    /* renamed from: c */
    public final void mo22279c() {
        m29112a(false);
    }

    /* renamed from: d */
    public final void mo22280d() {
        m29112a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (p000.olm.CONNECTING.equals(r7) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (p000.olm.DISCONNECTING.equals(r7) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r0 == false) goto L_0x0053;
     */
    /* renamed from: a */
    private final void m29111a(olm olm, olm olm2) {
        boolean z;
        olm olm3 = olm.IDLE;
        int ordinal = olm.ordinal();
        if (ordinal == 0) {
            z = olm.CONNECTING.equals(olm2);
        } else if (ordinal == 1) {
            if (!olm.CONNECTED.equals(olm2)) {
            }
            bnsi d = f37930a.mo68390d();
            d.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68424a("Car connection state changed: %s->%s", olm, olm2);
        } else if (ordinal == 2) {
            z = olm.DISCONNECTING.equals(olm2);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (!olm.IDLE.equals(olm2)) {
                }
                bnsi d2 = f37930a.mo68390d();
                d2.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68424a("Car connection state changed: %s->%s", olm, olm2);
            }
            bnsi c = f37930a.mo68388c();
            c.mo68432a("olw", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68424a("Unexpected state transition: %s->%s", olm, olm2);
            bnsi d22 = f37930a.mo68390d();
            d22.mo68432a("olw", "a", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d22.mo68424a("Car connection state changed: %s->%s", olm, olm2);
        } else {
            z = olm.DISCONNECTED.equals(olm2);
        }
    }

    /* renamed from: a */
    private final void m29112a(boolean z) {
        bngx d;
        if (ccuz.m131757b() || (Binder.getCallingPid() != Process.myPid() && Binder.getCallingUid() == this.f37934e)) {
            synchronized (this.f37931b) {
                boolean equals = olm.CONNECTED.equals(this.f37932c);
                if (z) {
                    equals |= olm.CONNECTING.equals(this.f37932c);
                }
                if (!equals) {
                    if (ccuz.f180014a.mo6606a().mo76863c()) {
                        olv olv = new olv();
                        synchronized (this.f37931b) {
                            d = bngx.m109368a((Collection) this.f37933d).mo67670d();
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = d.iterator();
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ConnectionState connectionState = (ConnectionState) it.next();
                            if (z3) {
                                if (z4) {
                                    break;
                                }
                            }
                            if (connectionState.f29473b == olm.CONNECTED.ordinal()) {
                                if (!z4) {
                                    olv.f37928b = elapsedRealtime - connectionState.f29475d;
                                    z4 = true;
                                }
                            }
                            if (connectionState.f29473b == olm.DISCONNECTED.ordinal() || connectionState.f29473b == olm.DISCONNECTING.ordinal()) {
                                if (!z3) {
                                    olv.f37927a = connectionState.f29474c;
                                    olv.f37929c = elapsedRealtime - connectionState.f29475d;
                                    z3 = true;
                                }
                            }
                        }
                        CriticalError criticalError = olv.f37927a;
                        if (criticalError == null) {
                            if (ccuz.f180014a.mo6606a().mo76864d()) {
                                bnsi c = f37930a.mo68388c();
                                c.mo68404a(bnsk.FULL);
                                c.mo68432a("olw", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                if (olv.f37928b != 0) {
                                    z2 = true;
                                }
                                c.mo68424a("Never entered DISCONNECTED state, ever entered connected state: %s, current state: %s", bryx.m114908a(Boolean.valueOf(z2)), bryx.m114908a(Integer.valueOf(this.f37932c.ordinal())));
                            }
                            this.f37935f.mo20859a(bpdn.UNKNOWN_CODE, bpdo.UNKNOWN_DETAIL, olv.f37928b, olv.f37929c);
                        } else {
                            niw niw = this.f37935f;
                            bmxy.m108581a(criticalError);
                            bpdn a = bpdn.m111806a(criticalError.f29486a);
                            CriticalError criticalError2 = olv.f37927a;
                            bmxy.m108581a(criticalError2);
                            niw.mo20859a(a, bpdo.m111808a(criticalError2.f29487b), olv.f37928b, olv.f37929c);
                        }
                    }
                    throw new IllegalStateException("OutOfCarLifecycle");
                }
            }
        }
    }

    /* renamed from: b */
    public final List mo22278b() {
        bngx a;
        synchronized (this.f37931b) {
            a = bngx.m109368a((Collection) this.f37933d);
        }
        return a;
    }

    /* renamed from: a */
    public final olm mo22275a() {
        olm olm;
        synchronized (this.f37931b) {
            olm = this.f37932c;
        }
        return olm;
    }

    /* renamed from: a */
    public final void mo22276a(olm olm) {
        boolean z = false;
        if (!(olm == olm.DISCONNECTED || olm == olm.DISCONNECTING)) {
            z = true;
        }
        bmxy.m108589a(z, "newState cannot be DISCONNECTED or DISCONNECTING, please use updateState(newState, reason) instead.");
        m29113b(olm, null);
    }

    /* renamed from: a */
    public final void mo22277a(olm olm, CriticalError criticalError) {
        boolean z = true;
        if (!(olm == olm.DISCONNECTED || olm == olm.DISCONNECTING)) {
            z = false;
        }
        bmxy.m108589a(z, "newState must be DISCONNECTED or DISCONNECTING.");
        m29113b(olm, criticalError);
    }
}
