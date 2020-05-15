package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrn {

    /* renamed from: f */
    private static final Charset f51188f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static wrn f51189g;

    /* renamed from: a */
    public final giu f51190a;

    /* renamed from: b */
    public final bqgj f51191b;

    /* renamed from: c */
    public final CookieManager f51192c;

    /* renamed from: d */
    bniq f51193d;

    /* renamed from: e */
    bngx f51194e = bngx.m109376e();

    /* renamed from: h */
    private final bnzc f51195h;

    public wrn(giu giu, bqgj bqgj, CookieManager cookieManager) {
        sdo.m34959a(giu);
        this.f51190a = giu;
        sdo.m34959a(cookieManager);
        this.f51192c = cookieManager;
        sdo.m34959a(bqgj);
        this.f51191b = bqgj;
        this.f51195h = bnzi.m110907i();
    }

    /* renamed from: a */
    static String m42181a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static List m42182a(String str, CookieManager cookieManager) {
        ArrayList arrayList = new ArrayList();
        if (!stm.m36302d(str)) {
            String cookie = cookieManager.getCookie(str);
            if (!stm.m36302d(cookie)) {
                for (String str2 : bmyx.m108643a(";").mo66918a((CharSequence) cookie)) {
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0) {
                        String trim = str2.substring(0, indexOf).trim();
                        if (!trim.isEmpty()) {
                            arrayList.add(new wrm(trim, str2.substring(indexOf + 1)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized wrn m42183a() {
        wrn wrn;
        synchronized (wrn.class) {
            if (f51189g == null) {
                f51189g = new wrn(giu.m13225a(rpr.m34216b()), snp.m35702a(9), CookieManager.getInstance());
            }
            wrn = f51189g;
        }
        return wrn;
    }

    /* renamed from: a */
    public final synchronized void mo29317a(Account account) {
        bniq<String> bniq = this.f51193d;
        StringBuilder sb = new StringBuilder();
        if (bniq != null) {
            boolean z = false;
            for (String str : bniq) {
                List a = m42182a(str, this.f51192c);
                if (!a.isEmpty()) {
                    sb.append(str);
                    Collections.sort(a);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        wrm wrm = (wrm) a.get(i);
                        if (this.f51194e.contains(m42181a(str, wrm.f51186a))) {
                            sb.append(wrm.f51186a);
                            sb.append(wrm.f51187b);
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                sb.append(account.name);
                this.f51195h.mo68721a(sb.toString(), f51188f).toString();
            }
        }
    }
}
