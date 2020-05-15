package p000;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avop extends avnj {

    /* renamed from: e */
    private static final Logger f93653e = avpq.m79018e("StreamingDownloadAction");

    /* renamed from: f */
    private static final avtg f93654f = new avtg("downloaded_files", 0);

    /* renamed from: g */
    private static final avtg f93655g = new avtg("network_error_attempts", 0);

    /* renamed from: h */
    private static final bnic f93656h = bnic.m109493a("care_map.pb", "care_map.txt", "compatibility.zip", "metadata", "payload_properties.txt");

    /* renamed from: i */
    private final Context f93657i;

    /* renamed from: j */
    private final avmi f93658j = ((avmi) avmi.f93389c.mo51589b());

    /* renamed from: k */
    private final avmx f93659k = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: l */
    private final avnb f93660l = ((avnb) avnb.f93488c.mo51589b());

    /* renamed from: m */
    private final avqd f93661m;

    /* renamed from: n */
    private final AtomicReference f93662n;

    private avop(Context context, avte avte) {
        super("streaming-download", avte);
        avqd avqd;
        this.f93657i = context;
        if (avlt.m78748a()) {
            avqd = avqf.m79049a(context, avlt.m78749b(), cfsd.m142766i(), cfsd.m142764g(), cfsd.m142765h());
        } else {
            avqd = avqe.m79047a(context, cfsd.m142764g());
        }
        this.f93661m = avqd;
        this.f93662n = new AtomicReference(bmvz.f131120a);
    }

    /* renamed from: a */
    private final avni m78942a(int i) {
        avtd b = mo51432a().mo51598b();
        b.mo51594a(f93654f, Integer.valueOf(i));
        avtg avtg = f93655g;
        b.mo51594a(avtg, Integer.valueOf(((Integer) mo51433a(avtg)).intValue() + 1));
        avte a = b.mo51593a();
        avnx f = avny.m78899f();
        f.mo51451a(cfsd.m142761d(), cfsd.m142762e());
        f.mo51449a(cfsd.m142763f());
        f.mo51450a(((Integer) mo51433a(f93655g)).intValue());
        f.mo51446a("streaming-download", a);
        return f.mo51447b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: e */
    private final bmxv m78944e() {
        if (bmxx.m108577a(this.f93659k.mo51414d().f109459a)) {
            this.f93659k.mo51402a(0, -1.0d);
            return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
        }
        try {
            avlr a = avlt.m78747a(this.f93657i, this.f93661m.mo51494a(), this.f93659k.mo51414d());
            this.f93659k.mo51402a(a.f93325a, -1.0d);
            int i = a.f93325a;
            if (i == 2) {
                return bmvz.f131120a;
            }
            if (i == 2059) {
                this.f93660l.mo51426c();
            }
            if (a.f93325a == 2315) {
                this.f93658j.mo51378c();
            }
            avoa f = avob.m78904f();
            f.mo51452a(a.f93326b);
            f.mo51446a("streaming-download", mo51432a());
            return bmxv.m108566b(f.mo51447b());
        } catch (avlq e) {
            f93653e.mo25417e("Unable to continue due to invalid config.", e, new Object[0]);
            this.f93659k.mo51402a(774, -1.0d);
            return bmxv.m108566b(new avni("finished-execution", avte.m79305a(new avtc[0])));
        }
    }

    /* renamed from: b */
    public final void mo51434b() {
        bmxv bmxv = (bmxv) this.f93662n.get();
        if (bmxv.mo66813a()) {
            ((avpz) bmxv.mo66814b()).mo51487e();
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
        int intValue;
        this.f93658j.mo51379d();
        this.f93660l.mo51427d();
        this.f93659k.mo51407a(true);
        bmxv e = m78944e();
        if (e.mo66813a()) {
            return (avni) e.mo66814b();
        }
        try {
            this.f93661m.mo51499c();
            try {
                this.f93658j.mo51376a();
                this.f93660l.mo51424a();
                try {
                    String str = (String) avma.f93363i.mo51364a();
                    if (bmxx.m108577a(str)) {
                        f93653e.mo25418e("Unable to continue due to empty streamingPropertyFiles flag.", new Object[0]);
                        avni = new avni("non-streaming-download", avte.m79305a(new avtc[0]));
                    } else {
                        try {
                            List a = avlz.m78770a(str);
                            bmxv e2 = m78944e();
                            if (!e2.mo66813a()) {
                                int size = a.size();
                                intValue = ((Integer) mo51433a(f93654f)).intValue();
                                while (intValue < size) {
                                    avly avly = (avly) a.get(intValue);
                                    if (f93656h.contains(avly.f93350a)) {
                                        Logger Logger = f93653e;
                                        String str2 = avly.f93350a;
                                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37);
                                        sb.append(intValue + 1);
                                        sb.append("/");
                                        sb.append(size);
                                        sb.append(": Downloading ");
                                        sb.append(str2);
                                        Logger.mo25412b(sb.toString(), new Object[0]);
                                        avox a2 = avox.m78972a(this.f93657i, avly.f93350a, avlt.m78750c());
                                        avqa avqa = (avqa) this.f93661m.mo51494a().mo66815c();
                                        if (avqa != null) {
                                            avpr a3 = avpz.m79028a(this.f93657i);
                                            a3.f93728a = this.f93659k.mo51414d().f109459a;
                                            a3.f93731d = avly.f93351b;
                                            a3.f93732e = avly.f93352c;
                                            a3.f93735h = avot.m78956a();
                                            a3.f93733f = avou.m78960a(this.f93657i);
                                            a3.f93729b = a2;
                                            a3.f93736i = avqa;
                                            avpz a4 = a3.mo51481a();
                                            this.f93662n.set(bmxv.m108566b(a4));
                                            a4.mo51483a();
                                        } else {
                                            throw new avpt("No network available");
                                        }
                                    } else {
                                        f93653e.mo25412b("%d/%d: %s is to be streamed; skipped.", Integer.valueOf(intValue + 1), Integer.valueOf(size), avly.f93350a);
                                    }
                                    intValue++;
                                }
                                avtd a5 = avte.m79303a();
                                a5.mo51594a(avor.f93664e, avov.m78963a().getAbsolutePath());
                                avni = new avni("streaming-process-package", a5.mo51593a());
                            } else {
                                avni = (avni) e2.mo66814b();
                            }
                        } catch (IOException e3) {
                            f93653e.mo25417e("Unable to continue due to invalid streamingPropertyFiles flag.", e3, new Object[0]);
                            avni = new avni("non-streaming-download", avte.m79305a(new avtc[0]));
                        }
                    }
                } catch (avpu e4) {
                    f93653e.mo25417e("Unable to create the file.", e4, new Object[0]);
                    this.f93659k.mo51402a(518, -1.0d);
                    avtd b = mo51432a().mo51598b();
                    b.mo51594a(f93654f, Integer.valueOf(intValue));
                    avte a6 = b.mo51593a();
                    avoa f = avob.m78904f();
                    f.mo51452a(cfsd.m142760c());
                    f.mo51446a("streaming-download", a6);
                    avni = f.mo51447b();
                } catch (avpt e5) {
                    f93653e.mo25417e("Failed to download.", e5, new Object[0]);
                    this.f93659k.mo51402a(262, -1.0d);
                    avni = m78942a(intValue);
                } catch (avps e6) {
                    f93653e.mo25417e("Download cancelled.", e6, new Object[0]);
                    avtd b2 = mo51432a().mo51598b();
                    b2.mo51594a(f93654f, Integer.valueOf(intValue));
                    avni = new avni("streaming-download", b2.mo51593a());
                } catch (Throwable th) {
                    this.f93658j.mo51377b();
                    this.f93660l.mo51425b();
                    throw th;
                }
                this.f93658j.mo51377b();
                this.f93660l.mo51425b();
                return avni;
            } finally {
                this.f93661m.mo51497b();
            }
        } catch (IOException e7) {
            f93653e.mo25417e("Failed to request for the network.", e7, new Object[0]);
            this.f93659k.mo51402a(262, -1.0d);
            return m78942a(((Integer) mo51433a(f93654f)).intValue());
        }
    }

    /* renamed from: d */
    public final boolean mo51436d() {
        try {
            if (avlt.m78747a(this.f93657i, this.f93661m.mo51494a(), this.f93659k.mo51414d()).f93325a != 2) {
                mo51434b();
            }
            return true;
        } catch (avlq e) {
            return true;
        }
    }

    /* renamed from: a */
    public static avop m78943a(Context context, avte avte) {
        sdo.m34970a(avls.m78732a());
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        return new avop(context, avte);
    }
}
