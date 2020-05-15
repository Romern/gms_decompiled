package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bdtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdtd implements bqeg {

    /* renamed from: a */
    public final bdru f106397a;

    /* renamed from: b */
    public final Executor f106398b;

    /* renamed from: c */
    public final bxog f106399c = ((bxog) bxoj.f164158b.mo74144da());

    /* renamed from: d */
    public Boolean f106400d;

    /* renamed from: e */
    final /* synthetic */ bdti f106401e;

    /* renamed from: f */
    private final bdrx f106402f;

    /* renamed from: g */
    private final long f106403g;

    /* renamed from: h */
    private int f106404h = 0;

    public bdtd(bdti bdti, bdrx bdrx, bdru bdru, Executor executor) {
        this.f106401e = bdti;
        this.f106402f = bdrx;
        this.f106397a = bdru;
        this.f106398b = executor;
        this.f106403g = System.nanoTime();
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        return bqdx.m112674a(bdrg.m91328a(((bbnn) this.f106401e.f106411e.mo6606a()).mo56235a(), "DeletionsDownloader"), new bdsn(this), this.f106401e.f106415i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bqgg mo58346b() {
        bqgg bqgg;
        try {
            bdtm a = this.f106401e.f106414h.mo58348a(((bdrr) this.f106402f).f106326c);
            bxvd da = bxpg.f164258g.mo74144da();
            bxvd da2 = bxpo.f164291c.mo74144da();
            String d = this.f106401e.f106407a.mo58306d();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpo bxpo = (bxpo) da2.f164949b;
            d.getClass();
            bxpo.f164293a |= 2;
            bxpo.f164294b = d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpg bxpg = (bxpg) da.f164949b;
            bxpo bxpo2 = (bxpo) da2.mo74062i();
            bxpo2.getClass();
            bxpg.f164261b = bxpo2;
            bxpg.f164260a |= 1;
            bxvd da3 = bxpf.f164252e.mo74144da();
            int i = this.f106401e.f106408b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxpf bxpf = (bxpf) da3.f164949b;
            int i2 = bxpf.f164254a | 1;
            bxpf.f164254a = i2;
            bxpf.f164255b = i;
            int i3 = this.f106401e.f106409c;
            bxpf.f164254a = i2 | 2;
            bxpf.f164256c = i3;
            bxvd da4 = bxun.f164861c.mo74144da();
            long j = (long) this.f106401e.f106410d;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ((bxun) da4.f164949b).f164863a = j;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxpf bxpf2 = (bxpf) da3.f164949b;
            bxun bxun = (bxun) da4.mo74062i();
            bxun.getClass();
            bxpf2.f164257d = bxun;
            bxpf2.f164254a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpg bxpg2 = (bxpg) da.f164949b;
            bxpf bxpf3 = (bxpf) da3.mo74062i();
            bxpf3.getClass();
            if (!bxpg2.f164264e.mo73666a()) {
                bxpg2.f164264e = GeneratedMessageLite.m124021a(bxpg2.f164264e);
            }
            bxpg2.f164264e.add(bxpf3);
            bmxv bmxv = a.f106418a;
            if (bmxv.mo66813a()) {
                ByteString bxtx = (ByteString) bmxv.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpg bxpg3 = (bxpg) da.f164949b;
                bxtx.getClass();
                bxpg3.f164260a |= 2;
                bxpg3.f164262c = bxtx;
            }
            bngx bngx = a.f106419b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpg bxpg4 = (bxpg) da.f164949b;
            if (!bxpg4.f164263d.mo73666a()) {
                bxpg4.f164263d = GeneratedMessageLite.m124021a(bxpg4.f164263d);
            }
            bxsy.m123078a(bngx, bxpg4.f164263d);
            bxqc a2 = bdti.m91409a(((bdrr) this.f106402f).f106325b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpg bxpg5 = (bxpg) da.f164949b;
            bxpg5.f164265f = a2.f164366l;
            bxpg5.f164260a |= 4;
            bxpg bxpg6 = (bxpg) da.mo74062i();
            if (this.f106404h >= 10) {
                bqgg = bqga.m112777a((Throwable) new bdtg());
            } else if (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f106403g) >= ((bdrr) this.f106402f).f106324a) {
                bqgg = bqga.m112777a((Throwable) new bdth());
            } else {
                this.f106404h++;
                bqgg = bqdf.m112620a(this.f106401e.f106413g.mo32599a(bxpg6), Exception.class, bdsx.f106387a, this.f106401e.f106415i);
            }
            return bqdx.m112674a(bqgg, new bdsw(this, a), this.f106401e.f106415i);
        } catch (bdvx e) {
            return bqga.m112777a((Throwable) new bdrc(e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo58344a(bqgg bqgg, bbnm bbnm) {
        return bqdx.m112673a(bqdf.m112620a(bqfl.m112747c(bqgg), Exception.class, new bdsu(this, bbnm), this.f106401e.f106415i), new bdsv(this, bbnm), this.f106401e.f106415i);
    }

    /* renamed from: a */
    public final bxpv mo58345a(bdwf bdwf, bbnm bbnm) {
        if (bbnm != null) {
            bdwf.mo58402a(bbnm.mo56233e(), bdtc.f106396a);
        }
        Boolean bool = this.f106400d;
        if (bool != null) {
            bdwf.mo58403a(bool.booleanValue());
        }
        return bdwf.mo58401a();
    }
}
