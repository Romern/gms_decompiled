package p000;

import android.accounts.Account;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: afwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afwu {

    /* renamed from: a */
    public static final bnsn f64886a = afvx.m53604b();

    /* renamed from: b */
    public final Map f64887b;

    /* renamed from: c */
    public final bmxj f64888c;

    /* renamed from: d */
    public final bmzi f64889d;

    /* renamed from: e */
    private final aecs f64890e;

    /* renamed from: f */
    private final Executor f64891f;

    /* renamed from: g */
    private final afvy f64892g;

    public afwu(Map map, bmxj bmxj, aecs aecs, Executor executor, bmzi bmzi, afvy afvy) {
        this.f64887b = map;
        this.f64888c = bmxj;
        this.f64890e = aecs;
        this.f64891f = executor;
        this.f64889d = bmzi;
        this.f64892g = afvy;
    }

    /* renamed from: a */
    public static int m53626a(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return 0;
        }
        return (i == 2 || i2 == 2) ? 2 : 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, afyf, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* renamed from: a */
    public final int mo35050a(aecc aecc) {
        afyd afyd;
        afyf afyf;
        boolean z;
        afye afye;
        String str = aecc.f63128a;
        bnsi d = f64886a.mo68390d();
        d.mo68432a("afwu", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Dispatching task '%s'...", str);
        int lastIndexOf = str.lastIndexOf(95);
        int i = 0;
        if (lastIndexOf == -1) {
            afyd = afyd.UNKNOWN;
        } else {
            try {
                afyd = afyd.m53664a(Integer.parseInt(str.substring(0, lastIndexOf)));
                if (afyd == null) {
                    afyd = afyd.UNKNOWN;
                }
            } catch (NumberFormatException e) {
                afyd = afyd.UNKNOWN;
            }
        }
        if (afyd != afyd.UNKNOWN) {
            afye[] values = afye.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    afye = null;
                    break;
                }
                afye = values[i2];
                if (str.endsWith(afye.f64963c)) {
                    break;
                }
                i2++;
            }
            if (afye != null) {
                afyf = afyf.m53667a(afyd, afye);
                if (afyf != null) {
                    bnsi c = afvx.m53603a().mo68388c();
                    c.mo68402a((int) cfgy.m139565b());
                    c.mo68432a("afwu", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Invalid task tag '%s'!", str);
                    return 2;
                }
                afxx afxx = (afxx) afyf;
                afxz afxz = (afxz) this.f64887b.get(afxx.f64951a);
                if (afxz != null) {
                    bnsi d2 = f64886a.mo68390d();
                    d2.mo68432a("afwu", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("Running singleton-scoped task '%s'...", afyf);
                    i = m53626a(0, mo35051a(afyf, afxz, null));
                    bnsi d3 = f64886a.mo68390d();
                    d3.mo68432a("afwu", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68422a("Singleton-scoped task '%s' finished with result '%d'!", (Object) afyf, i);
                    z = true;
                } else {
                    z = false;
                }
                for (Account account : (List) this.f64889d.mo6606a()) {
                    afxz afxz2 = (afxz) ((Map) this.f64888c.apply(account)).get(afxx.f64951a);
                    if (afxz2 != null) {
                        bnsi d4 = f64886a.mo68390d();
                        d4.mo68432a("afwu", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d4.mo68420a("Running account-scoped task '%s'...", afyf);
                        i = m53626a(i, mo35051a(afyf, afxz2, account));
                        z = true;
                    }
                }
                if (!z) {
                    bnsi c2 = afvx.m53603a().mo68388c();
                    c2.mo68402a((int) cfgy.m139565b());
                    c2.mo68432a("afwu", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68420a("Task '%s' has no registered task handlers!", afyf);
                    return 2;
                }
                bnsi d5 = f64886a.mo68390d();
                d5.mo68432a("afwu", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d5.mo68422a("Task '%s' finished with result '%d'!", (Object) afyf, i);
                return i;
            }
        }
        afyf = null;
        if (afyf != null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f A[Catch:{ ExecutionException -> 0x0072, InterruptedException -> 0x0147, bbjk -> 0x012c, bbjh -> 0x0111, afyb -> 0x00eb, afya -> 0x00c6, RuntimeException -> 0x00a0 }] */
    /* renamed from: a */
    public final int mo35051a(afyf afyf, afxz afxz, Account account) {
        bqgg bqgg;
        aect aect;
        afyd a = afyf.mo35058a();
        try {
            int i = 3;
            if (!cfgy.m139570g()) {
                aect a2 = this.f64890e.mo34060a(afyf.mo35058a());
                afwt afwt = new afwt(afxz, afyf);
                if (afyf.mo35059b() != afye.PERIODIC) {
                    i = 2;
                }
                bqgg = a2.mo34066a(afwt, i, this.f64891f);
            } else {
                if (account != null) {
                    if (cfgy.m139571h()) {
                        aect = this.f64890e.mo34061a(afyf.mo35058a(), account);
                        afws afws = new afws(afxz, afyf);
                        if (afyf.mo35059b() != afye.PERIODIC) {
                            i = 2;
                        }
                        bqgg = aect.mo34068a(afws, i, this.f64891f);
                    }
                }
                aect = this.f64890e.mo34060a(afyf.mo35058a());
                afws afws2 = new afws(afxz, afyf);
                if (afyf.mo35059b() != afye.PERIODIC) {
                }
                bqgg = aect.mo34068a(afws2, i, this.f64891f);
            }
            bqgg.get();
            this.f64892g.mo35046a(2, a);
            return 0;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            bmxy.m108582a(cause, "Failed task must have a cause!");
            bmzo.m108687a(cause, InterruptedException.class);
            bmzo.m108687a(cause, afyb.class);
            bmzo.m108687a(cause, afya.class);
            bmzo.m108687a(cause, bbjk.class);
            bmzo.m108687a(cause, bbjh.class);
            bmzo.m108686a(cause);
            throw new IllegalStateException("Task failed with an unknown checked exception!", cause);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.f64892g.mo35046a(6, a);
            return 1;
        } catch (bbjk e3) {
            this.f64892g.mo35046a(11, a);
            bnsi c = afvx.m53604b().mo68388c();
            c.mo68432a("afwu", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Task '%s' failed with disabled!", afyf);
            return 2;
        } catch (bbjh e4) {
            this.f64892g.mo35046a(10, a);
            bnsi c2 = afvx.m53604b().mo68388c();
            c2.mo68432a("afwu", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68420a("Task '%s' failed with sync constraints not met!", afyf);
            return 1;
        } catch (afyb e5) {
            this.f64892g.mo35046a(9, a);
            bnsi c3 = afvx.m53603a().mo68388c();
            c3.mo68402a((int) cfgy.m139566c());
            c3.mo68437a(e5);
            c3.mo68432a("afwu", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68420a("Task '%s' failed with a recoverable error!", afyf);
            return 1;
        } catch (afya e6) {
            this.f64892g.mo35046a(5, a);
            bnsi c4 = afvx.m53603a().mo68388c();
            c4.mo68402a((int) cfgy.m139566c());
            c4.mo68437a(e6);
            c4.mo68432a("afwu", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c4.mo68420a("Task '%s' failed with an internal error!", afyf);
            return 2;
        } catch (RuntimeException e7) {
            this.f64892g.mo35046a(12, a);
            bnsi c5 = afvx.m53603a().mo68388c();
            c5.mo68402a((int) cfgy.m139565b());
            c5.mo68437a(e7);
            c5.mo68432a("afwu", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c5.mo68420a("Task '%s' failed with an unexpected error!", afyf);
            return 2;
        }
    }
}
