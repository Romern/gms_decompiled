package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* renamed from: akzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzq {

    /* renamed from: g */
    public static final /* synthetic */ int f73176g = 0;

    /* renamed from: h */
    private static final Charset f73177h = Charset.forName("UTF-8");

    /* renamed from: j */
    private static akzq f73178j;

    /* renamed from: a */
    public final giu f73179a;

    /* renamed from: b */
    public final bqgj f73180b;

    /* renamed from: c */
    public final CookieManager f73181c;

    /* renamed from: d */
    bniq f73182d;

    /* renamed from: e */
    String f73183e;

    /* renamed from: f */
    bngx f73184f = bngx.m109376e();

    /* renamed from: i */
    private final bnzc f73185i;

    public akzq(giu giu, bqgj bqgj, CookieManager cookieManager) {
        sdo.m34959a(giu);
        this.f73179a = giu;
        sdo.m34959a(cookieManager);
        this.f73181c = cookieManager;
        sdo.m34959a(bqgj);
        this.f73180b = bqgj;
        this.f73185i = bnzi.m110907i();
    }

    /* renamed from: a */
    public static synchronized akzq m60714a() {
        akzq akzq;
        synchronized (akzq.class) {
            if (f73178j == null) {
                f73178j = new akzq(giu.m13225a(rpr.m34216b()), snp.m35702a(9), CookieManager.getInstance());
            }
            akzq = f73178j;
        }
        return akzq;
    }

    /* renamed from: b */
    public final void mo40028b() {
        bniq bniq = this.f73182d;
        if (bniq != null) {
            bnrd a = bniq.iterator();
            while (a.hasNext()) {
                String str = (String) a.next();
                List a2 = m60717a(str, this.f73181c);
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    akzp akzp = (akzp) a2.get(i);
                    if (this.f73184f.contains(m60716a(str, akzp.f73174a))) {
                        this.f73181c.setCookie(str, String.valueOf(akzp.f73174a).concat("=;expires=Thu, 01 Jan 1970 00:00:00 UTC"));
                    }
                }
            }
            this.f73182d = null;
            this.f73184f = bngx.m109376e();
        }
        this.f73183e = null;
    }

    /* renamed from: a */
    private final String m60715a(Account account, SortedSet sortedSet) {
        StringBuilder sb = new StringBuilder();
        if (sortedSet == null) {
            return null;
        }
        Iterator it = sortedSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            List a = m60717a(str, this.f73181c);
            if (!a.isEmpty()) {
                sb.append(str);
                Collections.sort(a);
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    akzp akzp = (akzp) a.get(i);
                    if (this.f73184f.contains(m60716a(str, akzp.f73174a))) {
                        sb.append(akzp.f73174a);
                        sb.append(akzp.f73175b);
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        sb.append(account.name);
        return this.f73185i.mo68721a(sb.toString(), f73177h).toString();
    }

    /* renamed from: b */
    public final synchronized boolean mo40029b(Account account) {
        return cfrc.f185484a.mo6606a().mo82550h() || stm.m36302d(this.f73183e) || !this.f73183e.equals(m60715a(account, this.f73182d));
    }

    /* renamed from: a */
    static String m60716a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static List m60717a(String str, CookieManager cookieManager) {
        ArrayList arrayList = new ArrayList();
        if (!stm.m36302d(str)) {
            String cookie = cookieManager.getCookie(str);
            if (!stm.m36302d(cookie)) {
                String[] split = cookie.split(";");
                for (String str2 : split) {
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0) {
                        String trim = str2.substring(0, indexOf).trim();
                        if (!trim.isEmpty()) {
                            arrayList.add(new akzp(trim, str2.substring(indexOf + 1)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo40027a(Account account) {
        this.f73183e = m60715a(account, this.f73182d);
    }
}
