package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zkf implements zgf {

    /* renamed from: a */
    public static final /* synthetic */ int f55284a = 0;

    /* renamed from: b */
    private static final srn f55285b = zvt.m46581a();

    /* renamed from: c */
    private final zgf f55286c;

    /* renamed from: d */
    private final String f55287d;

    /* renamed from: e */
    private final Runnable f55288e;

    /* renamed from: f */
    private final C1245ok f55289f;

    /* renamed from: g */
    private final zki f55290g;

    /* renamed from: h */
    private final int f55291h;

    public zkf(zgf zgf, int i, String str, Runnable runnable) {
        this.f55289f = new C1245ok();
        this.f55290g = new zki();
        this.f55286c = zgf;
        this.f55291h = i;
        this.f55287d = str;
        this.f55288e = runnable;
    }

    /* renamed from: a */
    private final bqgg m45648a(caae caae, zkd zkd) {
        zkc a = zkd.mo31190a();
        return this.f55286c.mo19155a(new zgh(caae, zkd, a.f55274a, a.f55278e, a.f55275b, a.f55276c, a.f55277d, a.f55279f));
    }

    /* renamed from: b */
    private final zkd m45650b(caae caae) {
        return (zkd) this.f55289f.get(caae.f172326b);
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        return this.f55286c.mo19161b(caah);
    }

    public zkf(zgf zgf, String str) {
        this(zgf, 1, str, zke.f55283a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r8.f55286c.mo19160a(r1) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r10 = (p000.bnsl) p000.zkf.f55285b.mo68388c();
        r10.mo68432a("zkf", "a", (int) com.felicanetworks.mfc.mfi.BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r10.mo68424a("%s: Could not unregister %s", r8.f55287d, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1.mo31194b() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        m45648a(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* renamed from: a */
    private final void m45649a(caae caae, zgg zgg) {
        synchronized (this.f55289f) {
            zkd b = m45650b(caae);
            if (b != null) {
                zkc a = b.mo31190a();
                if (b.mo31192a(zgg)) {
                    boolean a2 = b.mo31193a(a);
                    if (!(!b.mo31194b())) {
                        bnsl bnsl = (bnsl) f55285b.mo68390d();
                        bnsl.mo68432a("zkf", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68424a("%s: Last listener removed. Unregistering from %s", this.f55287d, caae.f172326b);
                        this.f55289f.remove(caae.f172326b);
                    } else if (a2) {
                        b.mo31190a();
                    }
                } else {
                    bnsl bnsl2 = (bnsl) f55285b.mo68390d();
                    bnsl2.mo68432a("zkf", "a", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68425a("%s: Could not remove %s from %s", this.f55287d, zgg, b);
                }
            } else {
                bnsl bnsl3 = (bnsl) f55285b.mo68390d();
                bnsl3.mo68432a("zkf", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68424a("%s: No active registrations found for %s", this.f55287d, caae.f172326b);
            }
        }
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return this.f55286c.mo19154a();
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        zkd b;
        boolean z;
        caae caae = zgh.f55011a;
        synchronized (this.f55289f) {
            b = m45650b(caae);
            if (b == null) {
                bnsl bnsl = (bnsl) f55285b.mo68390d();
                bnsl.mo68432a("zkf", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s: Initial registration for %s", this.f55287d, caae.f172326b);
                b = new zkd(this.f55291h, this.f55288e);
                this.f55289f.put(caae.f172326b, b);
                z = true;
            } else {
                z = false;
            }
        }
        zkc a = b.mo31190a();
        synchronized (this.f55290g) {
            b.mo31191a(zgh);
            zki zki = this.f55290g;
            zkg zkg = new zkg();
            zkg.f55292a = zgh.f55012b;
            zkg.mo31199a(zgh.f55013c, zgh.f55014d);
            zkh a2 = zkg.mo31198a();
            zkh zkh = (zkh) zki.f55305a.putIfAbsent(a2.f55298a, a2);
            if (zkh != null) {
                a2 = zkh;
            }
            a2.mo31200a(caae);
            this.f55290g.mo31205a(a2);
        }
        boolean a3 = b.mo31193a(a);
        if (!z && !a3) {
            return bqga.m112775a((Object) true);
        }
        if (a3 && !z) {
            this.f55286c.mo19160a(b);
        }
        return m45648a(caae, b);
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        String str;
        synchronized (this.f55289f) {
            if (!this.f55289f.isEmpty()) {
                printWriter.append((CharSequence) "Listener Registrations for ").append((CharSequence) this.f55287d).append((CharSequence) ":\n");
                int i = 0;
                while (true) {
                    C1245ok okVar = this.f55289f;
                    if (i >= okVar.f26809h) {
                        break;
                    }
                    zkd zkd = (zkd) this.f55289f.mo15621c(i);
                    printWriter.append((CharSequence) "  ").append((CharSequence) ((String) okVar.mo15620b(i))).append((CharSequence) " ");
                    zkc a = zkd.mo31190a();
                    long j = a.f55279f;
                    if (j != Long.MAX_VALUE) {
                        str = String.format("%ss", Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(j)));
                    } else {
                        str = "Inf";
                    }
                    printWriter.append((CharSequence) String.format("@%ss/%ss/%s", Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(a.f55274a)), Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(a.f55275b)), str));
                    bnrd a2 = zkd.mo31195c().iterator();
                    while (a2.hasNext()) {
                        printWriter.append((CharSequence) "\n    ").append((CharSequence) ((zgg) a2.next()).toString());
                    }
                    printWriter.append((CharSequence) "\n");
                    i++;
                }
            }
            printWriter.append((CharSequence) "Delegate Sensor Adapters for ").append((CharSequence) this.f55287d).append((CharSequence) ":\n");
            this.f55286c.mo19156a(printWriter);
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        return this.f55286c.mo19158a(caae);
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return this.f55286c.mo19159a(caah);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0.hasNext() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r1 = (p000.caae) r0.next();
        r3 = r11.f55289f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4 = m45650b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r4 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r4.mo31190a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r4.mo31192a(r12) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r8 = r4.mo31193a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if ((true ^ r4.mo31194b()) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r2 = (p000.bnsl) p000.zkf.f55285b.mo68390d();
        r2.mo68432a("zkf", "a", (int) com.felicanetworks.sdu.ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68424a("%s: Last listener removed. Unregistering from %s", r11.f55287d, r1.f172326b);
        r11.f55289f.remove(r1.f172326b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r8 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r4.mo31190a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r11.f55286c.mo19160a(r4) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        r2 = (p000.bnsl) p000.zkf.f55285b.mo68388c();
        r2.mo68432a("zkf", "a", (int) com.felicanetworks.mfc.mfi.BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68424a("%s: Could not unregister %s", r11.f55287d, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r4.mo31194b() != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        m45648a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        r1 = (p000.bnsl) p000.zkf.f55285b.mo68390d();
        r1.mo68432a("zkf", "a", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r1.mo68425a("%s: Could not remove %s from %s", r11.f55287d, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r2 = (p000.bnsl) p000.zkf.f55285b.mo68390d();
        r2.mo68432a("zkf", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68424a("%s: No active registrations found for %s", r11.f55287d, r1.f172326b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = r1.iterator();
     */
    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        synchronized (this.f55290g) {
            zkh a = this.f55290g.mo31204a(zgg);
            if (a == null || a.f55300c.isEmpty()) {
                return false;
            }
            List list = a.f55300c;
        }
    }
}
