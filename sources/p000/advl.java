package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: advl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class advl {

    /* renamed from: a */
    public static final bmzi f62810a = bmzn.m108681a(advk.f62809a);

    /* renamed from: b */
    private static final bmzi f62811b = bmzn.m108681a(advj.f62808a);

    /* renamed from: a */
    public static befa m51240a() {
        return (befa) f62811b.mo6606a();
    }

    /* renamed from: b */
    public static beju m51242b() {
        bejv bejv = new bejv();
        bejv.f111685a = snp.m35702a(10);
        bejv.f111686b = m51240a();
        bejv.mo60768a(bejj.f111648a);
        return bejv.mo60766a();
    }

    /* renamed from: c */
    public static befa m51243c() {
        rpr b = rpr.m34216b();
        befe a = beff.m94940a(b);
        befh a2 = befi.m94962a(b);
        a2.mo60660a("languageprofile");
        a2.mo60663b("mobstore_accounts.pb");
        Uri a3 = a2.mo60657a();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        bejv bejv = new bejv();
        bejv.mo60768a(beku.f111735a);
        bejv.f111686b = new befa(Arrays.asList(beff.m94940a(b).mo60653a()));
        bejv.f111685a = newSingleThreadExecutor;
        beju a4 = bejv.mo60766a();
        bejq g = bejr.m95186g();
        g.mo60764a(byeg.f165899d);
        g.mo60762a(a3);
        a.f111480c = new befp(a4.mo60765a(g.mo60761a()));
        return new befa(bngx.m109356a(a.mo60653a()));
    }

    /* renamed from: a */
    public static befl m51241a(Collection collection) {
        befk a = befl.m94970a();
        a.f111501a = m51240a();
        befh a2 = befi.m94962a(rpr.m34216b());
        a2.mo60664c();
        a2.mo60660a("languageprofile");
        a.mo60667a(a2.mo60657a());
        a.mo60668a(collection);
        return a.mo60666a();
    }
}
