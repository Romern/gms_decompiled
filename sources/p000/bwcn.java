package p000;

/* renamed from: bwcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcn {

    /* renamed from: a */
    private static bwcn f158845a;

    /* renamed from: b */
    private final bwcm f158846b;

    protected bwcn(bwcm bwcm) {
        this.f158846b = bwcm;
    }

    /* renamed from: a */
    public static synchronized bwcn m121756a() {
        bwcn bwcn;
        synchronized (bwcn.class) {
            if (f158845a == null) {
                String googleLocationServer = ceze.f183524a.mo6606a().googleLocationServer();
                String str = "https://www.google.com/loc/m/api";
                if (googleLocationServer != null && googleLocationServer.length() > 0) {
                    String[] split = googleLocationServer.split(" ", 4);
                    if (split.length == 3 && split[0].equals(str) && split[1].equals("rewrite")) {
                        str = split[2];
                    }
                }
                bwcl bwcl = new bwcl();
                bwcl.f158823a = str;
                bwcl.f158824b = "location";
                bwcl.f158825c = Integer.toString(2023);
                bwcl.f158826d = "android";
                bwcl.f158827e = "gms";
                f158845a = m121757a(bwcl);
            }
            bwcn = f158845a;
        }
        return bwcn;
    }

    /* renamed from: a */
    public static synchronized bwcn m121757a(bwcl bwcl) {
        bwcn bwcn;
        synchronized (bwcn.class) {
            if (f158845a == null) {
                bwcm.m121750a(bwcl);
                f158845a = new bwcn(bwcm.m121749a());
            }
            bwcn = f158845a;
        }
        return bwcn;
    }

    /* renamed from: a */
    public final synchronized void mo73469a(bwdg bwdg) {
        bwcm bwcm = this.f158846b;
        synchronized (bwcm.f158833f) {
            if (bwdg.f158891d == -1) {
                bwdg.f158891d = System.currentTimeMillis();
            }
            bwdg.mo73498a(bwcm.mo73468d());
            if (bwdg.f158889b != -1) {
                bwcm.f158832e.put(bwdg, "");
                bwcm.mo73466b();
            } else {
                bwcm.f158831d.add(bwdg);
                bwcm.mo73467c();
            }
        }
    }
}
