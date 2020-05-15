package p000;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: acfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfq implements bmzi {

    /* renamed from: b */
    private static final byte[] f59721b = "22".getBytes(bmwy.f131158c);

    /* renamed from: c */
    private static final basa f59722c;

    /* renamed from: a */
    public final ayuj f59723a;

    /* renamed from: d */
    private final Executor f59724d;

    /* renamed from: e */
    private final basb f59725e;

    static {
        barz b = basa.m87474b();
        b.mo55924a(f59721b, 1);
        f59722c = b.mo55923a();
    }

    public acfq(Executor executor, baso baso, Account account, ayuj ayuj) {
        azzs azzs;
        this.f59724d = executor;
        this.f59723a = ayuj;
        basb a = baso.mo55938a(account, 553, byip.f166588d);
        this.f59725e = a;
        if (acaw.m48786c()) {
            azzr i = azzs.m86408i();
            azzu c = azzv.m86422c();
            c.mo55526a((int) cemd.f182957a.mo6606a().mo79329i(), TimeUnit.SECONDS);
            i.mo55520a(c.mo55525a());
            azzs = i.mo55519a();
        } else {
            azzs = azzs.f100343i;
        }
        a.mo55929a(azzs, f59722c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        return bqdx.m112673a(batn.m87524a(this.f59724d, this.f59725e.mo55925a(f59722c), f59721b), new acfp(this), this.f59724d);
    }
}
