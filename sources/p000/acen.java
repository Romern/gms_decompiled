package p000;

import android.accounts.Account;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: acen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acen {

    /* renamed from: a */
    public final Executor f59656a;

    /* renamed from: b */
    public final cayo f59657b;

    /* renamed from: c */
    public final ayuj f59658c;

    /* renamed from: d */
    public final basb f59659d;

    /* renamed from: e */
    public final byte[] f59660e;

    /* renamed from: f */
    public final Object f59661f = new Object();

    /* renamed from: g */
    public boolean f59662g;

    /* renamed from: h */
    public bonk f59663h;

    /* renamed from: i */
    public bqgy f59664i;

    /* renamed from: j */
    public boolean f59665j;

    /* renamed from: k */
    private final bmzi f59666k;

    public acen(byte[] bArr, Account account, baso baso, cayo cayo, Executor executor, bmzi bmzi, ayuj ayuj) {
        bmxy.m108581a(bArr);
        bmxy.m108581a(executor);
        bmxy.m108581a(cayo);
        bmxy.m108581a(bmzi);
        bmxy.m108581a(ayuj);
        this.f59660e = bArr;
        this.f59656a = executor;
        this.f59657b = cayo;
        this.f59666k = bmzi;
        this.f59658c = ayuj;
        this.f59659d = baso.mo55938a(account, ErrorInfo.TYPE_SDU_UNKNOWN, bonk.f133816f);
        if (!cenv.m137617c()) {
            mo32713b();
        }
    }

    /* renamed from: a */
    public final void mo32710a() {
        synchronized (this.f59661f) {
            if (!this.f59662g && this.f59663h != null) {
                this.f59662g = true;
                bqga.m112781a((bqgg) this.f59666k.mo6606a(), new acek(this), this.f59656a);
            }
        }
    }

    /* renamed from: b */
    public final void mo32713b() {
        azzs azzs;
        if (acaw.m48786c()) {
            azzr i = azzs.m86408i();
            azzu c = azzv.m86422c();
            c.mo55526a((int) cemd.f182957a.mo6606a().mo79338r(), TimeUnit.SECONDS);
            i.mo55523b(c.mo55525a());
            i.mo55522a(cenv.f183121a.mo6606a().mo79472f());
            i.mo55524b(cenv.f183121a.mo6606a().mo79473g());
            if (cenv.f183121a.mo6606a().mo79469c()) {
                azzu c2 = azzv.m86422c();
                c2.mo55526a((int) cenv.f183121a.mo6606a().mo79471e(), TimeUnit.SECONDS);
                i.mo55520a(c2.mo55525a());
            }
            azzs = i.mo55519a();
        } else {
            azzs = azzs.f100343i;
        }
        basb basb = this.f59659d;
        barz b = basa.m87474b();
        b.mo55924a(this.f59660e, 1);
        basb.mo55929a(azzs, b.mo55923a());
    }

    /* renamed from: a */
    public final void mo32711a(bonk bonk) {
        bqga.m112781a(this.f59659d.mo55928a(this.f59660e, bonk), new acem(this), this.f59656a);
    }

    /* renamed from: a */
    public final void mo32712a(String str, Throwable th) {
        Log.e("AppsUpload", str, th);
        ((bads) this.f59657b.mo16713a()).mo32743a(12008);
        synchronized (this.f59661f) {
            this.f59662g = false;
            this.f59663h = null;
            this.f59664i.mo69136a(th);
            this.f59664i = null;
        }
    }
}
