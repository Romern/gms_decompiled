package p000;

import android.content.Context;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avoh extends avnj implements avpj {

    /* renamed from: e */
    public static final avto f93595e = new avto("file_path", "");

    /* renamed from: g */
    private static final Logger f93596g = avpq.m79018e("NonStreamingAbApplyAction");

    /* renamed from: h */
    private static final avta f93597h = new avta("post_installation", false);

    /* renamed from: i */
    private static final avtb f93598i = new avtb("progress", Double.valueOf(-1.0d));

    /* renamed from: f */
    public final Object f93599f = new Object();

    /* renamed from: j */
    private final avsw f93600j = avou.m78959a();

    /* renamed from: k */
    private final avtn f93601k = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: l */
    private final avmi f93602l = ((avmi) avmi.f93389c.mo51589b());

    /* renamed from: m */
    private final avmq f93603m = ((avmq) avmq.f93413e.mo51589b());

    /* renamed from: n */
    private final avmx f93604n = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: o */
    private final Context f93605o;

    /* renamed from: p */
    private final AtomicBoolean f93606p = new AtomicBoolean(false);

    /* renamed from: q */
    private final AtomicBoolean f93607q = new AtomicBoolean(((Boolean) mo51433a(f93597h)).booleanValue());

    /* renamed from: r */
    private final bqei f93608r = new bqei(((Double) mo51433a(f93598i)).doubleValue());

    /* renamed from: s */
    private avpk f93609s;

    public avoh(String str, Context context, avte avte) {
        super(str, avte);
        this.f93605o = context;
    }

    /* renamed from: e */
    private final avpk m78913e() {
        avpk avpk;
        synchronized (this.f93599f) {
            avpk = this.f93609s;
        }
        return avpk;
    }

    /* renamed from: a */
    public final void mo51456a(int i, int i2, float f) {
        int i3;
        boolean z = true;
        if (!(i == 5 || i == 6)) {
            z = false;
        }
        double d = (double) f;
        this.f93608r.mo69164a(d);
        this.f93607q.set(z);
        avmx avmx = this.f93604n;
        if (!z) {
            i3 = 273;
        } else {
            i3 = 529;
        }
        avmx.mo51402a(i3, d);
        this.f93604n.mo51403a(i, i2);
    }

    /* renamed from: b */
    public final void mo51434b() {
        f93596g.mo25412b("Requesting update engine to reset.", new Object[0]);
        this.f93606p.set(true);
        avpk e = m78913e();
        if (e != null) {
            try {
                e.mo51469e();
            } catch (InterruptedException e2) {
                f93596g.mo25417e("Reset operation interrupted.", e2, new Object[0]);
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
        avni avni;
        asfb asfb;
        this.f93602l.mo51379d();
        this.f93603m.mo51392b();
        this.f93602l.mo51376a();
        try {
            avlr a = avlw.m78755a(this.f93605o, this.f93604n.mo51414d());
            try {
                this.f93604n.mo51402a(a.f93325a, this.f93608r.mo69163a());
                int i = a.f93325a;
                if (i != 273) {
                    if (i == 275) {
                        this.f93602l.mo51378c();
                    }
                    if (a.f93325a == 1043) {
                        this.f93603m.mo51390a();
                    }
                    avoa f = avob.m78904f();
                    f.mo51452a(a.f93326b);
                    f.mo51446a("non-streaming-ab-apply", mo51432a());
                    avni = f.mo51447b();
                } else if (avlx.m78767a(this.f93600j)) {
                    avtd a2 = avte.m79303a();
                    a2.mo51595a(avnt.f93547f.mo51602b((String) mo51433a(f93595e)));
                    avni = new avni("ab-reboot", a2.mo51593a());
                } else {
                    if (cfsg.m142815b()) {
                        f93596g.mo25414c("Bypassing the self-update check.", new Object[0]);
                    } else if (avlx.m78768b(this.f93600j)) {
                        f93596g.mo25418e("The package has already been applied; stale checkin?", new Object[0]);
                        this.f93604n.mo51402a(0, -1.0d);
                        avni = new avni("finished-execution", avte.m79305a(new avtc[0]));
                    }
                    if (avlx.m78769c(this.f93600j)) {
                        f93596g.mo25418e("The package is unintentionally downgrading.", new Object[0]);
                        this.f93604n.mo51402a(530, -1.0d);
                        avni = new avni("finished-execution", avte.m79305a(new avtc[0]));
                    } else {
                        bmxv bmxv = (bmxv) this.f93601k.mo51607b(avnp.f93533h);
                        if (!bmxv.mo66813a()) {
                            avtd a3 = avte.m79303a();
                            a3.mo51595a(avoj.f93623e.mo51602b((String) mo51433a(f93595e)));
                            avni = new avni("non-streaming-process-package", a3.mo51593a());
                        } else {
                            try {
                                ArrayList arrayList = new ArrayList();
                                if (!avme.m78793b(this.f93605o, this.f93604n.mo51414d())) {
                                    arrayList.add("SWITCH_SLOT_ON_REBOOT=0");
                                }
                                if (this.f93604n.mo51414d().f109466h.f109451d) {
                                    arrayList.add("RUN_POST_INSTALL=0");
                                }
                                avsp avsp = (avsp) bmxv.mo66814b();
                                avpk a4 = avpk.m78987a();
                                a4.mo51465a(this);
                                a4.mo51466b();
                                try {
                                    synchronized (this.f93599f) {
                                        this.f93609s = a4;
                                    }
                                    asfb = new asfb(this.f93605o, 1, "non-streaming-ab-apply", null, "com.google.android.gms");
                                    asfb.mo49115a(false);
                                    asfb.mo49117b();
                                    int a5 = a4.mo51464a(avsp, arrayList);
                                    asfb.mo49120c();
                                    a4.mo51467c();
                                    if (this.f93606p.get()) {
                                        avtd b = mo51432a().mo51598b();
                                        b.mo51594a(f93598i, Double.valueOf(this.f93608r.mo69163a()));
                                        b.mo51594a(f93597h, Boolean.valueOf(this.f93607q.get()));
                                        avni = new avni("non-streaming-ab-apply", b.mo51593a());
                                    } else if (!avpl.m79001a(a5)) {
                                        f93596g.mo25418e("Installation failed with error code: %d.", Integer.valueOf(a5));
                                        this.f93604n.mo51402a(1042, -1.0d);
                                        avni = avon.m78931a(this.f93605o, false);
                                    } else {
                                        String str = (String) mo51433a(f93595e);
                                        avou.m78961a(str, stm.m36299a(new File(str).getParent()));
                                        if (avlw.m78759b(this.f93605o)) {
                                            if (avls.m78742h(this.f93605o)) {
                                                try {
                                                    ((avmq) avmq.f93413e.mo51589b()).mo51391a(ReceiverIntentOperation.m93722b(this.f93605o));
                                                } catch (IOException e) {
                                                    f93596g.mo25415d("Reboot with resume preparation failed.", e, new Object[0]);
                                                }
                                            }
                                        }
                                        avni = new avni("ab-reboot", avte.m79305a(new avtc[0]));
                                    }
                                } catch (Throwable th) {
                                    a4.mo51467c();
                                    throw th;
                                }
                            } catch (InterruptedException e2) {
                                f93596g.mo25417e("Installation interrupted.", e2, new Object[0]);
                                this.f93604n.mo51402a(1042, -1.0d);
                                avni = avon.m78931a(this.f93605o, false);
                            }
                        }
                    }
                }
            } catch (IOException e3) {
                f93596g.mo25417e("Unable to extract the care_map file.", e3, new Object[0]);
            } catch (Throwable th2) {
                this.f93602l.mo51377b();
                throw th2;
            }
        } catch (avlq e4) {
            f93596g.mo25417e("Unable to continue due to invalid config.", e4, new Object[0]);
            this.f93604n.mo51402a(786, this.f93608r.mo69163a());
            avni = new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        this.f93602l.mo51377b();
        return avni;
    }

    /* renamed from: d */
    public final boolean mo51436d() {
        try {
            if (avlw.m78755a(this.f93605o, this.f93604n.mo51414d()).f93325a != 273 && (!this.f93607q.get() || cfsj.m142902b())) {
                f93596g.mo25412b("Requesting update engine to stop.", new Object[0]);
                this.f93606p.set(true);
                avpk e = m78913e();
                if (e != null) {
                    try {
                        e.mo51468d();
                    } catch (InterruptedException e2) {
                        f93596g.mo25417e("Stop operation interrupted.", e2, new Object[0]);
                    }
                }
            }
            return true;
        } catch (avlq e3) {
            f93596g.mo25417e("Invalid config.", e3, new Object[0]);
            return true;
        }
    }
}
