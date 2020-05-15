package p000;

import android.accounts.Account;
import java.util.Map;

/* renamed from: afug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afug {

    /* renamed from: a */
    private static final Object f64816a = new Object();

    /* renamed from: b */
    private static volatile afug f64817b;

    /* renamed from: f */
    public static afug m53560f() {
        if (f64817b == null) {
            synchronized (f64816a) {
                if (f64817b == null) {
                    f64817b = new afuf();
                }
            }
        }
        return f64817b;
    }

    /* renamed from: a */
    public final aftw mo35033a(Account account) {
        aftw aftw;
        aftx a = mo35028a();
        synchronized (a.f64734a) {
            if (!a.f64736c.containsKey(account)) {
                Map map = a.f64736c;
                afua b = ((aftz) a.f64735b).mo6445a();
                cazf.m127594a(account);
                b.f64739a = account;
                cazf.m127595a(b.f64739a, Account.class);
                map.put(account, new afud(b.f64740b, b.f64739a));
            }
            aftw = (aftw) a.f64736c.get(account);
            bmxy.m108581a(aftw);
        }
        return aftw;
    }

    /* renamed from: a */
    public abstract aftx mo35028a();

    /* renamed from: b */
    public abstract afwv mo35029b();

    /* renamed from: c */
    public abstract afxd mo35030c();

    /* renamed from: d */
    public abstract afwx mo35031d();

    /* renamed from: e */
    public abstract afxa mo35032e();
}
