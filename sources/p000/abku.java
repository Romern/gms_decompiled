package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abku {

    /* renamed from: e */
    private static final Charset f57641e = Charset.forName("UTF-8");

    /* renamed from: f */
    private static abku f57642f;

    /* renamed from: a */
    public final giu f57643a;

    /* renamed from: b */
    public final CookieManager f57644b;

    /* renamed from: c */
    bniq f57645c;

    /* renamed from: d */
    bngx f57646d = bngx.m109376e();

    /* renamed from: g */
    private final bqgj f57647g;

    /* renamed from: h */
    private final bnzc f57648h;

    public abku(giu giu, bqgj bqgj, CookieManager cookieManager) {
        sdo.m34959a(giu);
        this.f57643a = giu;
        sdo.m34959a(cookieManager);
        this.f57644b = cookieManager;
        sdo.m34959a(bqgj);
        this.f57647g = bqgj;
        this.f57648h = bnzi.m110907i();
    }

    /* renamed from: a */
    public static synchronized abku m47822a() {
        abku abku;
        synchronized (abku.class) {
            if (f57642f == null) {
                f57642f = new abku(giu.m13225a(rpr.m34216b()), snp.m35702a(9), CookieManager.getInstance());
            }
            abku = f57642f;
        }
        return abku;
    }

    /* renamed from: a */
    static String m47823a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static List m47824a(String str, CookieManager cookieManager) {
        ArrayList arrayList = new ArrayList();
        if (!stm.m36302d(str)) {
            String cookie = cookieManager.getCookie(str);
            if (!stm.m36302d(cookie)) {
                for (String str2 : bmyx.m108643a(";").mo66918a((CharSequence) cookie)) {
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0) {
                        String trim = str2.substring(0, indexOf).trim();
                        if (!trim.isEmpty()) {
                            arrayList.add(new abkt(trim, str2.substring(indexOf + 1)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final aucb mo32188a(Account account, String str) {
        return aucu.m76780a(this.f57647g, new abks(this, account, str));
    }

    /* renamed from: a */
    public final synchronized void mo32189a(Account account) {
        bniq<String> bniq = this.f57645c;
        StringBuilder sb = new StringBuilder();
        if (bniq != null) {
            boolean z = false;
            for (String str : bniq) {
                List a = m47824a(str, this.f57644b);
                if (!a.isEmpty()) {
                    sb.append(str);
                    Collections.sort(a);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        abkt abkt = (abkt) a.get(i);
                        if (this.f57646d.contains(m47823a(str, abkt.f57639a))) {
                            sb.append(abkt.f57639a);
                            sb.append(abkt.f57640b);
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                sb.append(account.name);
                this.f57648h.mo68721a(sb.toString(), f57641e).toString();
            }
        }
    }
}
