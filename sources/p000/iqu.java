package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: iqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqu {

    /* renamed from: e */
    private static final Logger f21586e = new Logger(new String[]{"CryptauthGrpcClient"}, (byte[]) null);

    /* renamed from: a */
    public final chsz f21587a;

    /* renamed from: b */
    private final Account f21588b;

    /* renamed from: c */
    private final Context f21589c;

    /* renamed from: d */
    private final iss f21590d;

    public iqu(Context context, Account account, iss iss, String str) {
        chsz chsz;
        sdo.m34959a(account);
        this.f21588b = account;
        this.f21589c = context;
        if (ccex.f178847a.mo6606a().mo75841a()) {
            cifv b = cifv.m150191b(str, ((Integer) ipl.f21494d.mo58455c()).intValue());
            b.transportExecutor(new shs(-1, 1039));
            chsz = b.mo85581b();
        } else {
            chsz = chta.m149516a(str, ((Integer) ipl.f21494d.mo58455c()).intValue()).mo85581b();
        }
        this.f21587a = chsz;
        this.f21590d = iss;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final chqp mo13264a() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String a = gie.m13187a(this.f21589c, this.f21588b, (String) ipl.f21496f.mo58455c());
        this.f21590d.f21626c = System.currentTimeMillis() - currentTimeMillis;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new chvt(this.f21589c, a, true));
        try {
            str = new iei(this.f21589c).mo12952a(this.f21589c.getPackageName());
        } catch (gid | IOException e) {
            f21586e.mo25415d("Exception while trying to retrieve appCert.", e, new Object[0]);
            str = null;
        }
        if (str != null) {
            arrayList.add(new chvl(str));
        }
        chtr chtr = new chtr();
        chtr.mo85648a(chtn.m149535a("X-Goog-Api-Key", chtr.f189134b), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        chtr.mo85648a(chtn.m149535a("X-Android-Package", chtr.f189134b), this.f21589c.getPackageName());
        chtn a2 = chtn.m149535a("X-Android-Cert", chtr.f189134b);
        Context context = this.f21589c;
        chtr.mo85648a(a2, spn.m35895h(context, context.getPackageName()));
        arrayList.add(ciiu.m150402a(chtr));
        return chqx.m149438a(this.f21587a, arrayList);
    }

    /* renamed from: b */
    public final void mo13265b() {
        if (!this.f21587a.mo85625d()) {
            this.f21587a.mo85624c();
            try {
                this.f21587a.mo85623a(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: c */
    public final bqlf mo13266c() {
        return (bqlf) ((bqlf) ciig.m150372a(new bqle(), mo13264a())).mo86137a(((Long) ipl.f21495e.mo58455c()).longValue(), TimeUnit.SECONDS);
    }

    /* renamed from: d */
    public final bqly mo13267d() {
        return (bqly) ((bqly) ciig.m150372a(new bqlx(), mo13264a())).mo86137a(((Long) ipl.f21495e.mo58455c()).longValue(), TimeUnit.SECONDS);
    }
}
