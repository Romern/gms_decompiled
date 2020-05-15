package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bfox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfox {

    /* renamed from: a */
    public int f114733a = -1;

    /* renamed from: b */
    public int f114734b = -1;

    /* renamed from: c */
    public final Map f114735c = new C1223np();

    /* renamed from: d */
    public final Map f114736d = new C1223np();

    /* renamed from: e */
    public final bxvd f114737e = bplb.f138053h.mo74144da();

    /* renamed from: f */
    private final qws f114738f;

    /* renamed from: g */
    private boolean f114739g = false;

    /* renamed from: h */
    private long f114740h = Long.MIN_VALUE;

    /* renamed from: i */
    private final Context f114741i;

    public bfox(Context context) {
        qws qws = new qws(context, "LE", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        this.f114738f = qws;
        this.f114741i = context;
        m97454c();
    }

    /* renamed from: b */
    private final boolean m97453b() {
        if (cewg.m138352j() && !aeri.m52434a(this.f114741i) && this.f114739g) {
            m97455d();
        }
        return this.f114739g;
    }

    /* renamed from: c */
    private final void m97454c() {
        if (m97453b()) {
            bxvd bxvd = this.f114737e;
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(cewg.m138350h());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bplb bplb = (bplb) bxvd.f164949b;
            bplb bplb2 = bplb.f138053h;
            bplb.f138055a |= 8;
            bplb.f138061g = minutes;
            bxvd da = bplc.f138062d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bplc) da.f164949b).f138066c = bxvk.m124030de();
            for (bxvd bxvd2 : this.f114736d.values()) {
                bpla bpla = (bpla) bxvd2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bplc bplc = (bplc) da.f164949b;
                bpla.getClass();
                if (!bplc.f138066c.mo73666a()) {
                    bplc.f138066c = bxvk.m124021a(bplc.f138066c);
                }
                bplc.f138066c.add(bpla);
            }
            bplb bplb3 = (bplb) this.f114737e.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplc bplc2 = (bplc) da.f164949b;
            bplb3.getClass();
            bplc2.f138065b = bplb3;
            bplc2.f138064a |= 1;
            bxvd da2 = bonq.f133833p.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonq bonq = (bonq) da2.f164949b;
            bonq.f133836b = 9;
            bonq.f133835a |= 1;
            bplc bplc3 = (bplc) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonq bonq2 = (bonq) da2.f164949b;
            bplc3.getClass();
            bonq2.f133845k = bplc3;
            bonq2.f133835a |= 512;
            this.f114738f.mo24333a(da2.mo74062i()).mo24327b();
        }
        m97455d();
    }

    /* renamed from: d */
    private final void m97455d() {
        bxvd bxvd = this.f114737e;
        boolean z = false;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bplb bplb = bplb.f138053h;
        ((bplb) bxvd.f164949b).f138056b = bxvk.m124028dc();
        List b = bqcn.m112586b(new int[5]);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bplb bplb2 = (bplb) bxvd.f164949b;
        bplb2.mo68963a();
        bxsy.m123078a(b, bplb2.f138056b);
        bxvd bxvd2 = this.f114737e;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((bplb) bxvd2.f164949b).f138057c = bxvk.m124028dc();
        List b2 = bqcn.m112586b(new int[9]);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bplb bplb3 = (bplb) bxvd2.f164949b;
        bplb3.mo68964b();
        bxsy.m123078a(b2, bplb3.f138057c);
        bxvd bxvd3 = this.f114737e;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bplb bplb4 = (bplb) bxvd3.f164949b;
        bplb4.f138055a &= -9;
        bplb4.f138061g = 0;
        bxvd bxvd4 = this.f114737e;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bplb bplb5 = (bplb) bxvd4.f164949b;
        bplb5.f138055a &= -3;
        bplb5.f138059e = 0;
        bxvd bxvd5 = this.f114737e;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        bplb bplb6 = (bplb) bxvd5.f164949b;
        bplb6.f138055a &= -2;
        bplb6.f138058d = 0;
        bxvd bxvd6 = this.f114737e;
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        bplb bplb7 = (bplb) bxvd6.f164949b;
        bplb7.f138055a &= -5;
        bplb7.f138060f = 0;
        this.f114733a = -1;
        this.f114734b = -1;
        this.f114735c.clear();
        this.f114736d.clear();
        this.f114740h = SystemClock.elapsedRealtime();
        if (cewg.m138352j()) {
            if (aeri.m52434a(this.f114741i) && Math.random() < cewg.m138351i()) {
                z = true;
            }
            this.f114739g = z;
            return;
        }
        if (Math.random() < cewg.m138351i()) {
            z = true;
        }
        this.f114739g = z;
    }

    /* renamed from: a */
    public final boolean mo62073a() {
        if (this.f114740h < 0 || SystemClock.elapsedRealtime() - this.f114740h > cewg.m138350h()) {
            m97454c();
        }
        return m97453b();
    }
}
