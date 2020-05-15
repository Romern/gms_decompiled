package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zva {

    /* renamed from: a */
    public static final srn f55961a = zvt.m46581a();

    /* renamed from: b */
    public final zsr f55962b;

    /* renamed from: c */
    public final zre f55963c;

    /* renamed from: d */
    private final yrz f55964d;

    public zva(zsr zsr, yrz yrz, zre zre) {
        this.f55964d = yrz;
        this.f55962b = zsr;
        this.f55963c = zre;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bxwc, zuz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* renamed from: a */
    private final void m46545a(Map map, cabn cabn) {
        caae caae = cabn.f172456a;
        if (caae == null) {
            caae = caae.f172323i;
        }
        yqi yqi = (yqi) map.get(caae);
        if (yqi == null) {
            this.f55962b.mo31461c();
            bnsl bnsl = (bnsl) f55961a.mo68388c();
            bnsl.mo68432a("zva", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            caae caae2 = cabn.f172456a;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            bnsl.mo68420a("Missing sync status for data source %s", caae2.f172326b);
            return;
        }
        bngx a = bngx.m109355a(bnjd.m109586b((Iterable) cabn.f172457b, (bmxz) new zuz(yqi)));
        zre zre = this.f55963c;
        caae caae3 = cabn.f172456a;
        if (caae3 == null) {
            caae3 = caae.f172323i;
        }
        zre.mo31361a((List) yrm.m44667a(a, caae3, this.f55963c), false);
    }

    /* renamed from: a */
    public final cacg mo31534a(String str, List list) {
        try {
            yrz yrz = this.f55964d;
            return (cacg) yrz.f54521d.mo25819b(new yrx(yrz, str, list)).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            zvj.m46564a(zvk.DOWNLOAD_CHANGE_LOGS, e);
            throw yqh.m44583a(e);
        }
    }
}
