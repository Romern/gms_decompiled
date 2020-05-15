package p000;

import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: nwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwc implements Runnable {

    /* renamed from: a */
    final AtomicIntegerArray f36714a = new AtomicIntegerArray(10);

    /* renamed from: b */
    nin f36715b;

    /* renamed from: c */
    int f36716c;

    /* renamed from: d */
    volatile int f36717d = 0;

    /* renamed from: e */
    volatile String f36718e = "";

    /* renamed from: f */
    final /* synthetic */ nwd f36719f;

    public nwc(nwd nwd) {
        this.f36719f = nwd;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, android.content.ComponentName, int]
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
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.Integer, int]
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
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d0, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d1, code lost:
        r1.f36714a.set(r0, 2);
        r1.f36719f.f36726g.f36785k.put(r1.f36716c, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e2, code lost:
        if (r2 == null) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e4, code lost:
        r0 = r1.f36719f.f36726g;
        r0.f36788n = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f0, code lost:
        if (r0.f36787m.drainPermits() <= 0) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f2, code lost:
        r0 = p000.nip.f35749b.mo68388c();
        r0.mo68432a("nwc", "run", 2443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Drained unexpected stop permit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0302, code lost:
        r2.mo20771a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0306, code lost:
        p000.nwp.m28033a(r1.f36719f.f36726g.f36787m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0314, code lost:
        if (r3.mo20773b() != 1) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0320, code lost:
        if (r1.f36719f.f36726g.f36782h.mo21679c() != false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0322, code lost:
        r1.f36719f.f36726g.f36782h.mo21677c(r3.mo20776c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0330, code lost:
        r0 = r8.f35736e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0332, code lost:
        if (r0 == null) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0335, code lost:
        r0 = r3.mo20776c().mo22448m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033d, code lost:
        r1.f36719f.f36726g.f36782h.mo21664a(r3.mo20776c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x034a, code lost:
        r1.f36719f.f36726g.f36790p = r8.f35732a.f35741a;
        r1.f36719f.f36726g.f36792r.post(new p000.nwb(r1, r3, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0362, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r0 = r1.f36719f.f36726g;
        r3 = p000.nwe.f36732u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r0.f36789o != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r1.f36719f.mo21739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r1.f36719f.f36726g.f36782h.mo21693i() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r1.f36719f.f36726g.mo20798a(r1.f36716c, r1.f36715b);
        r1.f36719f.mo21739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = r1.f36715b;
        r3 = r0.f35746f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r3 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r3 = (p000.niv) r1.f36719f.f36726g.f36784j.get(r0.f35741a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r3 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = r1.f36715b;
        r3 = r0.f35745e.mo20765a(r1.f36719f.f36726g, r0.f35741a);
        r1.f36719f.f36726g.f36784j.put(r1.f36715b.f35741a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if ((r1.f36715b.f35742b.getFlags() & 1048576) != 0) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b6, code lost:
        r1.f36715b.f35742b.addFlags(67108864);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        if (r1.f36719f.f36726g.f36784j.get(r3.f35779d) == r3) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        r0 = p000.nip.f35749b.mo68387b();
        r0.mo68432a("nwc", "run", 2370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68422a("Task finished before activity could start, task:%s, # tasks: %d", (java.lang.Object) r3.f35779d, r1.f36719f.f36726g.f36784j.f26809h);
        r0 = r1.f36719f.f36726g.f36784j.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fa, code lost:
        if (r0.hasNext() == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fc, code lost:
        r3 = p000.nip.f35749b.mo68387b();
        r3.mo68432a("nwc", "run", 2374, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r3.mo68420a("Task root: %s", (android.content.ComponentName) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        r1.f36719f.mo21739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        r9 = r1.f36715b;
        r0 = r1.f36716c;
        r8 = r1.f36719f.f36726g;
        r10 = r8.f36780f;
        r8 = r8.f36782h.mo21671b();
        r11 = r1.f36719f.f36726g.f36782h.mo21679c();
        r12 = r9.f35742b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013a, code lost:
        if (r3.mo20844a() == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013c, code lost:
        r3.mo20844a().mo20788n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014a, code lost:
        if ((1048576 & r9.f35742b.getFlags()) == 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014c, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014e, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        r0 = r3.mo20845a(r9, r3.f35778c, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015b, code lost:
        if (r3.f35780e.remove(r0) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015d, code lost:
        r7 = r9.f35742b;
        r7.setFlags(r7.getFlags() & -1048577);
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016b, code lost:
        r3.f35780e.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
        if (r11 != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0173, code lost:
        r8 = new p000.nil(r9, r0, r7);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017b, code lost:
        r11 = r9.f35743c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017d, code lost:
        if (r11 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017f, code lost:
        r12 = new p000.niq(r11);
        r11 = r12.f35751a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018c, code lost:
        if (r11 != null) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        r8 = p000.niv.f35775a.mo68388c();
        r8.mo68432a("niv", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r8.mo68405a("Package name cannot be null.");
        r8 = android.util.Pair.create(null, null);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r10 = r10.createPackageContext(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a9, code lost:
        r11 = r12.f35752b;
        r12 = r12.f35753c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ad, code lost:
        if (r11 == 0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b0, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b1, code lost:
        if (r12 == 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b3, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b5, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b6, code lost:
        if (r2 == r3) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b8, code lost:
        r2 = p000.niv.f35775a.mo68388c();
        r2.mo68432a("niv", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null.");
        r2 = null;
        r8 = android.util.Pair.create(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ce, code lost:
        if (r11 == 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d0, code lost:
        r8 = android.util.Pair.create(r8.mo22480a(r10, r11), r8.mo22480a(r10, r12));
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f1, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to find package: %s", r11), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f2, code lost:
        r2 = null;
        r8 = android.util.Pair.create(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f8, code lost:
        r8 = new p000.nil(r9, r0, r7, (android.view.animation.Animation) r8.first, (android.view.animation.Animation) r8.second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020a, code lost:
        r0 = (p000.nij) r1.f36719f.f36726g.f36785k.get(r1.f36716c);
        r3 = r8.f35733b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021a, code lost:
        if (r0 != null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021d, code lost:
        if (r0 == r3) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0223, code lost:
        if (r0.mo20788n() != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0226, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0229, code lost:
        if (r3 != null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022b, code lost:
        r0 = p000.nip.f35749b.mo68390d();
        r0.mo68432a("nwc", "run", 2398, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68420a("Could not find client to start for %s", r1.f36715b.f35741a.toShortString());
        r1.f36719f.mo21739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024d, code lost:
        if (r3.mo20778d() == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x024f, code lost:
        r3.mo20779e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0260, code lost:
        if (r1.f36719f.f36726g.f36783i.mo67309b(r1.f36715b.f35741a, r3) != false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0262, code lost:
        r1.f36714a.set(0, 1);
        r1.f36715b.f35741a.toShortString();
        r1.f36719f.f36726g.f36783i.mo67268a(r1.f36715b.f35741a, r3);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0283, code lost:
        if (r3.mo20788n() == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0285, code lost:
        r1.f36718e = r3.mo20790p();
        r1.f36717d = r3.mo20789o();
        r3.f35707d.getShortClassName();
        r1.f36714a.set(0, 4);
        r3.mo20774b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a5, code lost:
        if (r3.mo20773b() == 7) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a7, code lost:
        r1.f36719f.f36726g.f36782h.mo21692i(r3.mo20776c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b4, code lost:
        r1.f36719f.mo21739a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ba, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bb, code lost:
        r1.f36718e = r3.mo20790p();
        r1.f36717d = r3.mo20789o();
        r7 = r1.f36719f.f36723d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02cb, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r1.f36719f.f36725f = r3;
     */
    public final void run() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            this.f36714a.set(i2, 0);
            i2++;
            i = 0;
        }
        int i3 = nip.f35750c;
        nij.m26407a(this.f36715b.f35741a);
        synchronized (this.f36719f.f36723d) {
            Integer num = (Integer) this.f36719f.f36721b.peek();
            if (num != null) {
                if (this.f36719f.f36720a.get(num.intValue()) == this) {
                    this.f36719f.f36720a.remove(this.f36716c);
                    this.f36719f.f36721b.remove();
                }
            }
            bnsi c = nip.f35749b.mo68388c();
            c.mo68432a("nwc", "run", 2321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68422a("Window layer already processed: %d %d", (Object) num, this.f36716c);
            this.f36719f.mo21739a();
        }
    }
}
