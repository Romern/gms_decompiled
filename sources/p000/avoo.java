package p000;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avoo extends avnj implements avqc, avpj {

    /* renamed from: e */
    public static final avto f93634e = new avto("dir_path", "");

    /* renamed from: g */
    private static final sek f93635g = avpq.m79018e("StreamingApplyAction");

    /* renamed from: h */
    private static final avtg f93636h = new avtg("network_error_attempts", 0);

    /* renamed from: i */
    private static final avta f93637i = new avta("post_installation", false);

    /* renamed from: j */
    private static final avtb f93638j = new avtb("progress", Double.valueOf(-1.0d));

    /* renamed from: f */
    public final AtomicBoolean f93639f;

    /* renamed from: k */
    private final Context f93640k;

    /* renamed from: l */
    private final avtn f93641l = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: m */
    private final avmi f93642m = ((avmi) avmi.f93389c.mo51589b());

    /* renamed from: n */
    private final avmq f93643n = ((avmq) avmq.f93413e.mo51589b());

    /* renamed from: o */
    private final avmx f93644o = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: p */
    private final avnb f93645p = ((avnb) avnb.f93488c.mo51589b());

    /* renamed from: q */
    private final avsw f93646q = avou.m78959a();

    /* renamed from: r */
    private final avpp f93647r;

    /* renamed from: s */
    private final avqd f93648s;

    /* renamed from: t */
    private final AtomicBoolean f93649t;

    /* renamed from: u */
    private final bqei f93650u;

    /* renamed from: v */
    private final AtomicReference f93651v;

    /* renamed from: w */
    private final AtomicReference f93652w;

    private avoo(Context context, avte avte) {
        super("streaming-apply", avte);
        avqd avqd;
        this.f93640k = context;
        this.f93647r = avpp.m79008a(context);
        if (avlt.m78748a()) {
            avqd = avqf.m79049a(context, avlt.m78749b(), cfsd.m142766i(), cfsd.m142764g(), cfsd.m142765h());
        } else {
            avqd = avqe.m79047a(context, cfsd.m142764g());
        }
        this.f93648s = avqd;
        this.f93649t = new AtomicBoolean(false);
        this.f93650u = new bqei(((Double) mo51433a(f93638j)).doubleValue());
        this.f93639f = new AtomicBoolean(((Boolean) mo51433a(f93637i)).booleanValue());
        this.f93651v = new AtomicReference(bmvz.f131120a);
        this.f93652w = new AtomicReference(bmvz.f131120a);
    }

    /* renamed from: a */
    public static avoo m78932a(Context context, avte avte) {
        sdo.m34970a(avls.m78732a());
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        return new avoo(context, avte);
    }

    /* renamed from: f */
    private final avlr m78933f() {
        SystemUpdateStatus d = this.f93644o.mo51414d();
        if (!this.f93639f.get()) {
            avlr a = avlt.m78747a(this.f93640k, this.f93648s.mo51494a(), d);
            if (a.f93325a != 2) {
                return a;
            }
        }
        return avlw.m78755a(this.f93640k, d);
    }

    /* renamed from: g */
    private final avni m78934g() {
        int intValue = ((Integer) mo51433a(f93636h)).intValue();
        avtd h = m78935h();
        h.mo51594a(f93636h, Integer.valueOf(intValue + 1));
        avte a = h.mo51593a();
        avnx f = avny.m78899f();
        f.mo51451a(cfsd.m142761d(), cfsd.m142762e());
        f.mo51449a(cfsd.m142763f());
        f.mo51450a(intValue);
        f.mo51446a("streaming-apply", a);
        return f.mo51447b();
    }

    /* renamed from: h */
    private final avtd m78935h() {
        avtd b = mo51432a().mo51598b();
        b.mo51594a(f93638j, Double.valueOf(this.f93650u.mo69163a()));
        b.mo51594a(f93637i, Boolean.valueOf(this.f93639f.get()));
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: i */
    private final bmxv m78936i() {
        if (bmxx.m108577a(this.f93644o.mo51414d().f109459a)) {
            this.f93644o.mo51402a(0, -1.0d);
            return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
        } else if (avlx.m78767a(this.f93646q)) {
            f93635g.mo25414c("Unable to stream a brick package. Falling back to non-streaming flow.", new Object[0]);
            return bmxv.m108566b(new avni("non-streaming-download", avte.m79305a(new avtc[0])));
        } else {
            if (cfsg.m142815b()) {
                f93635g.mo25414c("Bypassing the self-update check.", new Object[0]);
            } else if (avlx.m78768b(this.f93646q)) {
                f93635g.mo25418e("The package has already been applied; stale checkin?", new Object[0]);
                this.f93644o.mo51402a(0, -1.0d);
                return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
            }
            if (avlx.m78769c(this.f93646q)) {
                f93635g.mo25418e("The package is unintentionally downgrading.", new Object[0]);
                this.f93644o.mo51402a(530, -1.0d);
                return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
            }
            try {
                avlr f = m78933f();
                int i = f.f93325a;
                int i2 = 273;
                if (i == 2 || i == 273) {
                    avmx avmx = this.f93644o;
                    if (this.f93639f.get()) {
                        i2 = 529;
                    }
                    avmx.mo51402a(i2, this.f93650u.mo69163a());
                    return bmvz.f131120a;
                }
                this.f93644o.mo51402a(i, this.f93650u.mo69163a());
                if (f.f93325a == 2059) {
                    this.f93645p.mo51426c();
                }
                int i3 = f.f93325a;
                if (i3 == 2315 || i3 == 275) {
                    this.f93642m.mo51378c();
                }
                if (f.f93325a == 1043) {
                    this.f93643n.mo51390a();
                }
                avoa f2 = avob.m78904f();
                f2.mo51452a(f.f93326b);
                f2.mo51446a("streaming-apply", mo51432a());
                return bmxv.m108566b(f2.mo51447b());
            } catch (avlq e) {
                f93635g.mo25417e("Unable to continue due to invalid config.", e, new Object[0]);
                this.f93644o.mo51402a(786, -1.0d);
                return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
            }
        }
    }

    /* renamed from: b */
    public final void mo51434b() {
        bmxv bmxv = (bmxv) this.f93652w.getAndSet(bmvz.f131120a);
        if (bmxv.mo66813a()) {
            ((avot) bmxv.mo66814b()).mo51462c();
        }
        this.f93649t.set(true);
        f93635g.mo25412b("Requesting update engine to reset.", new Object[0]);
        bmxv bmxv2 = (bmxv) this.f93651v.get();
        if (bmxv2.mo66813a()) {
            try {
                ((avpk) bmxv2.mo66814b()).mo51469e();
            } catch (InterruptedException e) {
                f93635g.mo25417e("Reset operation interrupted.", e, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: c */
    public final avni mo51435c() {
        avni a;
        avnb avnb;
        asfb asfb;
        int i;
        this.f93644o.mo51407a(true);
        this.f93642m.mo51379d();
        this.f93643n.mo51392b();
        this.f93645p.mo51427d();
        bmxv i2 = m78936i();
        if (i2.mo66813a()) {
            return (avni) i2.mo66814b();
        }
        avqd avqd = this.f93648s;
        synchronized (avqd.f93767c) {
            avqd.f93768d = this;
        }
        try {
            this.f93648s.mo51499c();
            this.f93647r.mo51479a(avoc.m78906a(this.f93640k, this.f93648s));
            try {
                this.f93642m.mo51376a();
                this.f93645p.mo51424a();
                try {
                    bmxv i3 = m78936i();
                    if (i3.mo66813a()) {
                        a = (avni) i3.mo66814b();
                    } else {
                        bmxv bmxv = (bmxv) this.f93641l.mo51607b(avnp.f93533h);
                        if (bmxv.mo66813a()) {
                            if (!this.f93639f.get()) {
                                avot a2 = avot.m78956a();
                                this.f93652w.set(bmxv.m108566b(a2));
                                a2.mo51461b();
                                if (this.f93649t.get()) {
                                    f93635g.mo25412b("Cancelled. Will restart later.", new Object[0]);
                                    a = new avni("streaming-apply", m78935h().mo51593a());
                                }
                            }
                            avqa avqa = (avqa) this.f93648s.mo51494a().mo66815c();
                            if (avqa != null) {
                                avsp avsp = (avsp) bmxv.mo66814b();
                                long networkHandle = ((Network) avqa.f93761a.mo66814b()).getNetworkHandle();
                                avpk a3 = avpk.m78987a();
                                a3.mo51466b();
                                try {
                                    a3.mo51465a(this);
                                    this.f93651v.set(bmxv.m108566b(a3));
                                    asfb = new asfb(this.f93640k, 1, "streaming-apply", null, "com.google.android.gms");
                                    asfb.mo49115a(false);
                                    asfb.mo49117b();
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        StringBuilder sb = new StringBuilder(31);
                                        sb.append("NETWORK_ID=");
                                        sb.append(networkHandle);
                                        arrayList.add(sb.toString());
                                        bnre i4 = avou.m78960a(this.f93640k).listIterator();
                                        while (i4.hasNext()) {
                                            C1240of ofVar = (C1240of) i4.next();
                                            String str = (String) ofVar.f26798a;
                                            String str2 = (String) ofVar.f26799b;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                                            sb2.append(str);
                                            sb2.append("=");
                                            sb2.append(str2);
                                            arrayList.add(sb2.toString());
                                        }
                                        if (!avme.m78793b(this.f93640k, this.f93644o.mo51414d())) {
                                            arrayList.add("SWITCH_SLOT_ON_REBOOT=0");
                                        }
                                        if (this.f93644o.mo51414d().f109466h.f109451d) {
                                            arrayList.add("RUN_POST_INSTALL=0");
                                        }
                                        i = a3.mo51464a(avsp, arrayList);
                                        f93635g.mo25412b("Update engine finished with code %d.", Integer.valueOf(i));
                                        asfb.mo49120c();
                                        a3.mo51467c();
                                    } catch (InterruptedException e) {
                                        f93635g.mo25417e("Failed to stream the update.", e, new Object[0]);
                                        asfb.mo49120c();
                                        a3.mo51467c();
                                        i = 1;
                                    }
                                    if (this.f93649t.get()) {
                                        f93635g.mo25412b("Cancelled. Will restart later.", new Object[0]);
                                        a = new avni("streaming-apply", m78935h().mo51593a());
                                    } else if (avpl.m79001a(i)) {
                                        File file = new File((String) mo51433a(f93634e), "payload_metadata.bin");
                                        avtd a4 = avte.m79303a();
                                        if (file.exists()) {
                                            a4.mo51595a(avnt.f93548g.mo51602b(file.getAbsolutePath()));
                                        }
                                        if (avlw.m78759b(this.f93640k)) {
                                            if (avls.m78742h(this.f93640k)) {
                                                try {
                                                    ((avmq) avmq.f93413e.mo51589b()).mo51391a(ReceiverIntentOperation.m93722b(this.f93640k));
                                                } catch (IOException e2) {
                                                    f93635g.mo25415d("Reboot with resume preparation failed.", e2, new Object[0]);
                                                }
                                            }
                                        }
                                        a = new avni("ab-reboot", a4.mo51593a());
                                    } else if (i == 9) {
                                        this.f93644o.mo51402a(262, this.f93650u.mo69163a());
                                        a = m78934g();
                                    } else {
                                        this.f93644o.mo51402a(1042, -1.0d);
                                        a = avon.m78931a(this.f93640k, true);
                                    }
                                } catch (Throwable th) {
                                    a3.mo51467c();
                                    throw th;
                                }
                            } else {
                                this.f93644o.mo51402a(262, this.f93650u.mo69163a());
                                a = m78934g();
                            }
                        } else {
                            avtd a5 = avte.m79303a();
                            a5.mo51595a(avor.f93664e.mo51602b((String) mo51433a(f93634e)));
                            a = new avni("streaming-process-package", a5.mo51593a());
                        }
                    }
                    this.f93642m.mo51377b();
                    avnb = this.f93645p;
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof RemoteException) {
                        f93635g.mo25417e("Failed to apply payload due to UpdateEngine RemoteException.", e3, new Object[0]);
                        this.f93644o.mo51402a(1042, -1.0d);
                        a = avon.m78931a(this.f93640k, true);
                        this.f93642m.mo51377b();
                        avnb = this.f93645p;
                    } else {
                        throw e3;
                    }
                }
                avnb.mo51425b();
                this.f93648s.mo51497b();
                return a;
            } catch (Throwable th2) {
                this.f93648s.mo51497b();
                throw th2;
            }
        } catch (IOException e4) {
            f93635g.mo25417e("Failed to request streaming network.", e4, new Object[0]);
            this.f93644o.mo51402a(262, this.f93650u.mo69163a());
            this.f93647r.mo51479a(avoc.m78906a(this.f93640k, this.f93648s));
            return m78934g();
        }
    }

    /* renamed from: d */
    public final boolean mo51436d() {
        try {
            int i = m78933f().f93325a;
            if (!(i == 2 || i == 273)) {
                mo51458e();
            }
            return true;
        } catch (avlq e) {
            f93635g.mo25417e("Unable to continue due to invalid config.", e, new Object[0]);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo51458e() {
        if (!this.f93639f.get() || cfsj.m142902b()) {
            bmxv bmxv = (bmxv) this.f93652w.getAndSet(bmvz.f131120a);
            if (bmxv.mo66813a()) {
                ((avot) bmxv.mo66814b()).mo51462c();
            }
            this.f93649t.set(true);
            f93635g.mo25412b("Requesting update engine to stop.", new Object[0]);
            bmxv bmxv2 = (bmxv) this.f93651v.get();
            if (bmxv2.mo66813a()) {
                try {
                    ((avpk) bmxv2.mo66814b()).mo51468d();
                } catch (InterruptedException e) {
                    f93635g.mo25417e("Stop operation interrupted.", e, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51456a(int i, int i2, float f) {
        int i3;
        boolean z = true;
        if (!(i == 5 || i == 6)) {
            z = false;
        }
        double d = (double) f;
        this.f93650u.mo69164a(d);
        this.f93639f.set(z);
        avmx avmx = this.f93644o;
        if (!z) {
            i3 = 273;
        } else {
            i3 = 529;
        }
        avmx.mo51402a(i3, d);
        this.f93644o.mo51403a(i, i2);
    }
}
