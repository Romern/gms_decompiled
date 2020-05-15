package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.time.Clock;
import java.util.Collections;

/* renamed from: key */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1130key extends keo {

    /* renamed from: a */
    public static final srn f23956a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final Uri f23957b;

    /* renamed from: c */
    public final kew f23958c;

    /* renamed from: d */
    public final Clock f23959d;

    /* renamed from: e */
    public final kex f23960e;

    /* renamed from: f */
    private final keo f23961f;

    public C1130key(Context context, bqgj bqgj, Account account, String str, keo keo, kew kew, keu keu) {
        befe a = beff.m94940a(context);
        a.f111479b = keu.f23952a;
        kex kex = new kex(new beeu(bqgj, Collections.singletonList(a.mo60653a())));
        Clock systemUTC = Clock.systemUTC();
        befh a2 = befi.m94962a(context);
        a2.mo60662b();
        a2.mo60660a("autofill");
        a2.mo60663b("data_source_cache/" + str);
        a2.mo60658a(account);
        this.f23957b = a2.mo60657a();
        this.f23960e = kex;
        this.f23961f = keo;
        this.f23958c = kew;
        this.f23959d = systemUTC;
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        bqgg a = this.f23961f.mo14429a(kej);
        kex kex = this.f23960e;
        bqgg b = kej.f23934a.f23937a.mo25819b(new keq(this, kex.f23955a.mo60631a(this.f23957b, behp.m95056a(), new beer[0])));
        bqgy c = bqgy.m112818c();
        bqga.m112781a(a, new ker(this, c), bqfb.INSTANCE);
        bqga.m112781a(b, new kes(c), bqfb.INSTANCE);
        return c;
    }
}
