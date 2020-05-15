package p000;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avoi extends avnj implements avpw {

    /* renamed from: e */
    private static final Logger f93610e = avpq.m79018e("NonStreamingDownloadAction");

    /* renamed from: f */
    private static final avto f93611f = new avto("file_path", "");

    /* renamed from: g */
    private static final avtk f93612g = new avtk("downloaded_bytes", 0L);

    /* renamed from: h */
    private static final avtg f93613h = new avtg("network_error_attempts", 0);

    /* renamed from: i */
    private static final avtb f93614i = new avtb("progress", Double.valueOf(-1.0d));

    /* renamed from: j */
    private final Context f93615j;

    /* renamed from: k */
    private final avmi f93616k = ((avmi) avmi.f93389c.mo51589b());

    /* renamed from: l */
    private final avmx f93617l = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: m */
    private final avpp f93618m;

    /* renamed from: n */
    private final avnb f93619n;

    /* renamed from: o */
    private final avqd f93620o;

    /* renamed from: p */
    private final AtomicReference f93621p;

    /* renamed from: q */
    private final bqei f93622q;

    public avoi(Context context, avte avte) {
        super("non-streaming-download", avte);
        avqd avqd;
        this.f93615j = context;
        this.f93618m = avpp.m79008a(context);
        this.f93619n = (avnb) avnb.f93488c.mo51589b();
        if (avlt.m78748a()) {
            avqd = avqf.m79049a(context, avlt.m78749b(), cfsd.m142766i(), cfsd.m142764g(), cfsd.m142765h());
        } else {
            avqd = avqe.m79047a(context, cfsd.m142764g());
        }
        this.f93620o = avqd;
        this.f93621p = new AtomicReference(bmvz.f131120a);
        this.f93622q = new bqei(((Double) mo51433a(f93614i)).doubleValue());
    }

    /* renamed from: e */
    private final avtd m78918e() {
        bmxv bmxv = (bmxv) this.f93621p.get();
        avtd b = mo51432a().mo51598b();
        b.mo51594a(f93614i, Double.valueOf(this.f93622q.mo69163a()));
        if (bmxv.mo66813a()) {
            b.mo51594a(f93612g, Long.valueOf(((avpz) bmxv.mo66814b()).mo51486d()));
            b.mo51594a(f93611f, ((avos) ((avpz) bmxv.mo66814b()).f93743a).mo51460a());
        }
        return b;
    }

    /* renamed from: f */
    private final avni m78919f() {
        avtd e = m78918e();
        avtg avtg = f93613h;
        e.mo51594a(avtg, Integer.valueOf(((Integer) mo51433a(avtg)).intValue() + 1));
        avte a = e.mo51593a();
        avnx f = avny.m78899f();
        f.mo51451a(cfsd.m142761d(), cfsd.m142762e());
        f.mo51449a(cfsd.m142763f());
        f.mo51450a(((Integer) mo51433a(f93613h)).intValue());
        f.mo51446a("non-streaming-download", a);
        return f.mo51447b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: g */
    private final bmxv m78920g() {
        if (bmxx.m108577a(this.f93617l.mo51414d().f109459a)) {
            this.f93617l.mo51402a(0, -1.0d);
            return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
        }
        try {
            avlr a = avlt.m78747a(this.f93615j, this.f93620o.mo51494a(), this.f93617l.mo51414d());
            this.f93617l.mo51402a(a.f93325a, this.f93622q.mo69163a());
            int i = a.f93325a;
            if (i == 2) {
                return bmvz.f131120a;
            }
            if (i == 2059) {
                this.f93619n.mo51426c();
            }
            if (a.f93325a == 2315) {
                this.f93616k.mo51378c();
            }
            avoa f = avob.m78904f();
            f.mo51452a(a.f93326b);
            f.mo51446a("non-streaming-download", mo51432a());
            return bmxv.m108566b(f.mo51447b());
        } catch (avlq e) {
            f93610e.mo25417e("Unable to continue due to invalid config.", e, new Object[0]);
            this.f93617l.mo51402a(774, -1.0d);
            return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
        }
    }

    /* renamed from: a */
    public final void mo51457a(long j, long j2) {
        bmxv bmxv = (bmxv) this.f93621p.get();
        if (bmxv.mo66813a()) {
            avtc[] avtcArr = {f93611f.mo51602b(((avos) ((avpz) bmxv.mo66814b()).f93743a).mo51460a()), f93612g.mo51602b(Long.valueOf(((avpz) bmxv.mo66814b()).mo51486d()))};
            synchronized (this.f93512b) {
                avtd b = this.f93514d.mo51598b();
                b.mo51595a(avtcArr);
                this.f93514d = b.mo51593a();
                if (this.f93513c.mo66813a()) {
                    avte avte = this.f93514d;
                    ((avnk) this.f93513c.mo66814b()).f93515a.f93519d.mo51605a(avnp.f93528c.mo51602b(avte));
                }
            }
        }
        bqei bqei = this.f93622q;
        double d = (double) j2;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        bqei.mo69164a(d / d2);
        this.f93617l.mo51402a(2, this.f93622q.mo69163a());
    }

    /* renamed from: b */
    public final void mo51434b() {
        bmxv bmxv = (bmxv) this.f93621p.get();
        if (bmxv.mo66813a()) {
            ((avpz) bmxv.mo66814b()).mo51487e();
        }
    }

    /* renamed from: c */
    public final avni mo51435c() {
        avni avni;
        String str;
        this.f93616k.mo51379d();
        this.f93619n.mo51427d();
        this.f93617l.mo51407a(false);
        bmxv g = m78920g();
        if (g.mo66813a()) {
            return (avni) g.mo66814b();
        }
        try {
            this.f93620o.mo51499c();
            try {
                this.f93616k.mo51376a();
                this.f93619n.mo51424a();
                try {
                    bmxv g2 = m78920g();
                    if (g2.mo66813a()) {
                        avni = (avni) g2.mo66814b();
                    } else {
                        Context context = this.f93615j;
                        if (!((Boolean) avma.f93362h.mo51364a()).booleanValue()) {
                            str = "update.zip";
                        } else {
                            str = "update_s.zip";
                        }
                        avos a = avos.m78951a(context, str, (String) mo51433a(f93611f), avlt.m78750c());
                        try {
                            avqa avqa = (avqa) this.f93620o.mo51494a().mo66815c();
                            if (avqa != null) {
                                int intValue = ((Integer) ((avtn) avtn.f93892a.mo51589b()).mo51603a(avnp.f93530e).f93879b).intValue();
                                avpr a2 = avpz.m79028a(this.f93615j);
                                a2.f93728a = this.f93617l.mo51414d().f109459a;
                                a2.f93730c = ((Long) mo51433a(f93612g)).longValue();
                                a2.f93735h = avot.m78956a();
                                a2.f93729b = a;
                                a2.f93736i = avqa;
                                a2.f93733f = avou.m78960a(this.f93615j);
                                a2.f93734g = intValue;
                                avpz a3 = a2.mo51481a();
                                synchronized (a3.f93744b) {
                                    a3.f93745c = this;
                                }
                                this.f93621p.set(bmxv.m108566b(a3));
                                a3.mo51483a();
                                avtd a4 = avte.m79303a();
                                a4.mo51594a(avoj.f93623e, a.mo51460a());
                                avni = new avni("non-streaming-process-package", a4.mo51593a());
                            } else {
                                throw new avpt("No network available");
                            }
                        } catch (avpu e) {
                            f93610e.mo25417e("Unable to create the file.", e, new Object[0]);
                            this.f93617l.mo51402a(518, this.f93622q.mo69163a());
                            avoa f = avob.m78904f();
                            f.mo51452a(cfsd.m142760c());
                            f.mo51446a("non-streaming-download", m78918e().mo51593a());
                            avni = f.mo51447b();
                        } catch (avpt e2) {
                            f93610e.mo25417e("Failed to download: %s", e2, bmxx.m108578b(e2.getMessage()));
                            this.f93617l.mo51402a(262, this.f93622q.mo69163a());
                            avni = m78919f();
                        } catch (avps e3) {
                            f93610e.mo25417e("Download cancelled.", e3, new Object[0]);
                            avni = new avni("non-streaming-download", m78918e().mo51593a());
                        }
                    }
                    return avni;
                } finally {
                    this.f93616k.mo51377b();
                    this.f93619n.mo51425b();
                }
            } finally {
                this.f93620o.mo51497b();
            }
        } catch (IOException e4) {
            f93610e.mo25417e("Failed to acquire network.", e4, new Object[0]);
            this.f93617l.mo51402a(262, this.f93622q.mo69163a());
            return m78919f();
        } finally {
            this.f93618m.mo51479a(avoc.m78906a(this.f93615j, this.f93620o));
        }
    }

    /* renamed from: d */
    public final boolean mo51436d() {
        try {
            if (avlt.m78747a(this.f93615j, this.f93620o.mo51494a(), this.f93617l.mo51414d()).f93325a != 2) {
                mo51434b();
            }
            return true;
        } catch (avlq e) {
            return true;
        }
    }
}
