package p000;

import android.content.Intent;

/* renamed from: azes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azes implements ciiv {

    /* renamed from: a */
    final azcs f99177a;

    /* renamed from: b */
    public final Intent f99178b;

    /* renamed from: c */
    final /* synthetic */ azet f99179c;

    /* renamed from: d */
    private final afjc f99180d;

    public azes(azet azet, azcs azcs, Intent intent, afjc afjc) {
        this.f99179c = azet;
        this.f99177a = azcs;
        this.f99178b = intent;
        this.f99180d = afjc;
    }

    /* renamed from: a */
    public final void mo25548a() {
        synchronized (this.f99179c.f99185a) {
            if (this.f99180d == this.f99179c.f99200p) {
                azet azet = this.f99179c;
                azet.f99191g.mo55141a(455, azet.f99207w);
                this.f99179c.f99195k.mo54886b("close bind connection from onCompleted", new azer(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r6.f99179c.mo54847c() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r6.f99179c.mo54848d();
        r7 = r6.f99179c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r7.f99202r == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r7.f99195k.mo54886b("send pull request from end of pull", new p000.azep(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r7.mo54840a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r1 == 1) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r1 != 8) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (p000.cfec.m138765b() != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1 = r6.f99179c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r7.f177384a != 8) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r7 = (p000.cbjy) r7.f177385b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r7 = p000.cbjy.f177377b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r1.mo54850f() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r1.f99206v.mo66813a() != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        r1.f99191g.mo55170c(807, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = new android.content.Intent("com.google.android.gms.matchstick.handle_register_refresh_response_action");
        r7 = r7.f177379a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r7 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r7 = p000.cblg.f177496f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r7 = r0.putExtra("register_refresh_response_extra", r7.mo73642k()).putExtra("register_refresh_request_extra", ((p000.cblf) r1.f99206v.mo66814b()).mo73642k());
        r1.f99206v = p000.bmvz.f131120a;
        r0 = r1.f99205u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r0 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r7.putExtra("register_refresh_new_public_key_extra", r0.f191540a.mo86595a()).putExtra("register_refresh_new_private_key_extra", r1.f99205u.f191541b.f191538a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.m94594b(r7, r1.f99187c);
        r1.f99191g.mo55141a(806, r1.f99207w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        r1 = r6.f99179c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if (r7.f177384a != 8) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
        r7 = (p000.cbjy) r7.f177385b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        r7 = p000.cbjy.f177377b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
        if (r1.mo54849e() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        if (r1.f99206v.mo66813a() != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r1.f99191g.mo55170c(807, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        r0 = new android.content.Intent("com.google.android.gms.matchstick.handle_register_refresh_response_action");
        r7 = r7.f177379a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010b, code lost:
        if (r7 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r7 = p000.cblg.f177496f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r7 = r0.putExtra("register_refresh_response_extra", r7.mo73642k()).putExtra("register_refresh_request_extra", ((p000.cblf) r1.f99206v.mo66814b()).mo73642k());
        p000.azoi.m85926a(r7, r1.f99207w);
        r1.f99206v = p000.bmvz.f131120a;
        com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.m94594b(r7, r1.f99187c);
        r1.f99191g.mo55141a(806, r1.f99207w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0143, code lost:
        if (r1 != 5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0145, code lost:
        r7 = r6.f99179c;
        r7.f99191g.mo55141a(459, r7.f99207w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        r6.f99179c.f99195k.mo54886b("Receive message task", new p000.azeo(r6, (p000.cbkj) r7.f177385b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        new java.lang.Object[1][0] = r7;
        r1 = r7.f177384a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r7 = r6.f99179c;
        r7.f99191g.mo55141a(460, r7.f99207w);
        r6.f99179c.mo54845b();
        r2 = r6.f99179c.f99185a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        monitor-enter(r2);
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25549a(Object obj) {
        cbka cbka = (cbka) obj;
        synchronized (this.f99179c.f99185a) {
            if (this.f99180d != this.f99179c.f99200p) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (p000.azfn.m85585b(r0) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        com.google.android.libraries.matchstick.task.ScheduledTaskService.m94658a(r0, "gms:matchstick:restoreConn");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (p000.azfn.m85581a(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        p000.bmxy.m108581a(r3.f99178b);
        r3.f99179c.f99189e.mo54875a(r3.f99178b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r3.f99179c.f99191g.mo55156a(122, r4, (java.lang.String) null);
        r3.f99179c.f99195k.mo54886b("close bind connection from onError", new p000.azeq(r3));
        r0 = r3.f99179c;
        r1 = r3.f99177a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (p000.azfn.m85588c(r4) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        r0.f99189e.mo54876a(r1, r0.f99207w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        r0 = r3.f99179c.f99187c.getApplicationContext();
     */
    /* renamed from: a */
    public final void mo25550a(Throwable th) {
        azoj.m85931a("GrpcManager", th, "onError from stream %s", th.getMessage());
        synchronized (this.f99179c.f99185a) {
            if (this.f99180d != this.f99179c.f99200p) {
            }
        }
    }
}
