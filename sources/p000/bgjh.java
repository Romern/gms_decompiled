package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjh implements bgmh, bugo, bugl {

    /* renamed from: a */
    bugr f116596a = null;

    /* renamed from: b */
    public boolean f116597b = false;

    /* renamed from: c */
    private final bugn f116598c;

    /* renamed from: d */
    private final sns f116599d;

    /* renamed from: e */
    private final snr f116600e;

    /* renamed from: f */
    private final List f116601f = new ArrayList();

    /* renamed from: g */
    private final bgns f116602g;

    /* renamed from: h */
    private final Context f116603h;

    /* renamed from: i */
    private bgmf f116604i = null;

    /* renamed from: j */
    private int f116605j;

    public bgjh(Context context, bugn bugn, bgns bgns) {
        this.f116603h = context;
        this.f116598c = bugn;
        this.f116602g = bgns;
        sns sns = new sns("Chre_Sleep_Handler", 10);
        this.f116599d = sns;
        sns.start();
        this.f116600e = new snr(this.f116599d);
        this.f116605j = 3;
    }

    /* renamed from: a */
    public static synchronized bgjh m99068a(bugp bugp, Context context, bgns bgns) {
        synchronized (bgjh.class) {
            bugn a = bugp.mo62634a(context);
            if (a == null) {
                return null;
            }
            bgjh bgjh = new bgjh(context, a, bgns);
            bgjh.f116598c.mo72629a(5147455389092024335L, bgjh, bgjh.f116600e);
            return bgjh;
        }
    }

    /* renamed from: d */
    private final synchronized void m99070d() {
        bugr a = this.f116598c.mo72627a(5147455389092024335L);
        this.f116596a = a;
        if (a != null) {
            bxvd da = buga.f153763c.mo74144da();
            bxvd da2 = bufx.f153757a.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buga buga = (buga) da.f164949b;
            bufx bufx = (bufx) da2.mo74062i();
            bufx.getClass();
            buga.f153766b = bufx;
            buga.f153765a = 2;
            mo62888a((buga) da.mo74062i());
            bmxy.m108581a(this.f116596a);
            this.f116596a.mo72645b(this);
        }
        bgmf bgmf = this.f116604i;
        if (bgmf != null) {
            this.f116601f.remove(bgmf);
        }
        this.f116596a = null;
        this.f116605j = 2;
    }

    /* renamed from: e */
    private final void m99071e() {
        bugr bugr = this.f116596a;
        if (bugr != null) {
            bugr.mo72645b(this);
            this.f116596a = null;
            bgmf bgmf = this.f116604i;
            if (bgmf != null) {
                this.f116601f.remove(bgmf);
            }
        }
        this.f116605j = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        return;
     */
    /* renamed from: f */
    private final synchronized void m99072f() {
        bugr a = this.f116598c.mo72627a(5147455389092024335L);
        this.f116596a = a;
        if (a != null) {
            a.mo72643a(this, this.f116600e);
            bewq a2 = bewq.m95998a(this.f116603h);
            bxvd da = buga.f153763c.mo74144da();
            bxvd da2 = bufz.f153761a.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buga buga = (buga) da.f164949b;
            bufz bufz = (bufz) da2.mo74062i();
            bufz.getClass();
            buga.f153766b = bufz;
            buga.f153765a = 1;
            if (mo62888a((buga) da.mo74062i())) {
                if (cfam.m138536f()) {
                    bxvd da3 = btzg.f153106g.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btzg btzg = (btzg) da3.f164949b;
                    btzg.f153109b = 3;
                    btzg.f153108a |= 1;
                    a2.mo61204a((btzg) da3.mo74062i());
                }
                bgmf bgmf = this.f116604i;
                if (bgmf != null && !this.f116601f.contains(bgmf)) {
                    this.f116601f.add(this.f116604i);
                }
                this.f116605j = 1;
                if (cfam.m138533c()) {
                    bxvd da4 = buga.f153763c.mo74144da();
                    bxvd da5 = bufy.f153759a.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    buga buga2 = (buga) da4.f164949b;
                    bufy bufy = (bufy) da5.mo74062i();
                    bufy.getClass();
                    buga2.f153766b = bufy;
                    buga2.f153765a = 3;
                    if (mo62888a((buga) da4.mo74062i()) && cfam.m138536f()) {
                        bxvd da6 = btzg.f153106g.mo74144da();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        btzg btzg2 = (btzg) da6.f164949b;
                        btzg2.f153109b = 4;
                        btzg2.f153108a = 1 | btzg2.f153108a;
                        a2.mo61204a((btzg) da6.mo74062i());
                    }
                }
            } else {
                this.f116596a = null;
                if (cfam.m138536f()) {
                    bxvd da7 = btzg.f153106g.mo74144da();
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    btzg btzg3 = (btzg) da7.f164949b;
                    btzg3.f153109b = 5;
                    btzg3.f153108a = 1 | btzg3.f153108a;
                    a2.mo61204a((btzg) da7.mo74062i());
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo62887a(bgmf bgmf) {
        this.f116604i = bgmf;
    }

    /* renamed from: b */
    public final synchronized void mo61884b(int i) {
        m99071e();
    }

    /* renamed from: c */
    public final void mo62890c() {
        boolean j = cfam.m138540j();
        boolean d = cfam.m138534d();
        int i = this.f116605j;
        if (i != 1 && this.f116597b && j && d) {
            m99072f();
        } else if (i == 1 && (!this.f116597b || !j || !d)) {
            m99070d();
        }
        String a = bgjg.m99067a(this.f116605j);
        StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("updated NanoAppState: ");
        sb.append(a);
        sb.toString();
    }

    /* renamed from: cr */
    public final synchronized void mo61886cr() {
        mo62890c();
    }

    /* renamed from: b */
    public final synchronized boolean mo62889b() {
        String a = bgjg.m99067a(this.f116605j);
        StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("Sleep nanoapp status: ");
        sb.append(a);
        sb.toString();
        return this.f116605j == 1;
    }

    /* renamed from: a */
    private static final boolean m99069a(bugu bugu) {
        try {
            int intValue = ((Integer) bugu.get(1, TimeUnit.SECONDS)).intValue();
            if (intValue == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Failed to send message to nanoapp: request result=");
            sb.append(intValue);
            sb.toString();
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send message to nanoapp: ");
                return false;
            }
            "Failed to send message to nanoapp: ".concat(valueOf);
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo61880a(int i) {
        m99071e();
    }

    /* renamed from: a */
    public final synchronized void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        if (bugr != null) {
            int i = buhd.f153831a;
            int i2 = 1;
            if (i != 0) {
                i2 = i != 1 ? i != 2 ? 0 : 3 : 2;
            }
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 != 2) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown message type: ");
                sb.append(i);
                sb.toString();
            } else {
                mo62890c();
                bufv bufv = (bufv) buhd.mo72661a((bxxk) bufv.f153745i.mo74142c(7));
                if (!cfam.m138533c() && (bufv.f153747a & 64) != 0) {
                    bxvd da = buga.f153763c.mo74144da();
                    bxvd da2 = bufw.f153755a.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    buga buga = (buga) da.f164949b;
                    bufw bufw = (bufw) da2.mo74062i();
                    bufw.getClass();
                    buga.f153766b = bufw;
                    buga.f153765a = 4;
                    mo62888a((buga) da.mo74062i());
                }
                bugr.mo72647c();
                bgmg bgmg = new bgmg(bufv.f153748b, bufv.f153749c, bufv.f153753g, bufv.f153750d, (bufv.f153747a & 64) != 0 ? bufv.f153751e : -1.0f, bufv.f153752f, bufv.f153754h);
                List list = this.f116601f;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f116602g.mo62921a((Runnable) new bgjf((bgmf) list.get(i4), bgmg));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62888a(buga buga) {
        bugu a;
        bugr bugr = this.f116596a;
        if (bugr == null || (a = bugr.mo72640a(1, 1, buga)) == null) {
            return false;
        }
        return m99069a(a);
    }
}
