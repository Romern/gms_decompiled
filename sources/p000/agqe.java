package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: agqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqe {

    /* renamed from: a */
    private static agqe f66266a = null;

    /* renamed from: c */
    private static final srn f66267c = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Map f66268b;

    protected agqe() {
        HashMap hashMap = new HashMap();
        this.f66268b = hashMap;
        m54829a(hashMap, "this is an invalid api key", "CLIENT_TestInvalid", 2);
        m54829a(this.f66268b, "AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0", "CLIENT_TestApiMemBattery", 3);
        m54829a(this.f66268b, "AIzaSyDil7P0s1hvamdVWsqFtySc1T5P1S9dHqk", "CLIENT_DemoApp", 3);
        m54829a(this.f66268b, "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI", "CLIENT_MdpUx", 3);
        m54829a(this.f66268b, "AIzaSyCV2I1gEhkJYkd51xG7MGaZGC85zylcS74", "CLIENT_Phonesky", 5);
        m54829a(this.f66268b, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", "CLIENT_BackgroundService", 3);
        m54829a(this.f66268b, "AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA", "CLIENT_GoogleOne", 6);
        m54829a(this.f66268b, "AIzaSyCqrNxCAJrrk_NQqIUp1-baqW05d3JYeOc", "CLIENT_Assistant", 8);
        m54829a(this.f66268b, "AIzaSyA_n-CBlmsO1fOxFUZqRnQ9SX4Bh1jCjWg", "CLIENT_Esim", 3);
        m54829a(this.f66268b, "AIzaSyCChP9IaeaDS_LLGBI0P9CDQwTzCxn1kp8", "CLIENT_Assistant", 8);
        m54829a(this.f66268b, "AIzaSyDHQ9ipnphqTzDqZsbtd8_Ru4_kiKVQe2k", "CLIENT_Youtube", 9);
        m54829a(this.f66268b, "AIzaSyD5cCj3gK6IKFQCHRf1pYAt9nDKUzfxmPg", "ClientApp 11", 2);
        m54829a(this.f66268b, "AIzaSyA64xQnVODx8qBOeSsrlfDc8gDEw_NLopk", "ClientApp 12", 2);
        m54829a(this.f66268b, "AIzaSyBD1uN7sPOWjkZ3fNKv7xDlLqF7Rg_JLnk", "ClientApp 13", 2);
        m54829a(this.f66268b, "AIzaSyDtpXO8h8u8Z6N7asPxy6AczIICsqmkg64", "ClientApp 14", 2);
        m54829a(this.f66268b, "AIzaSyCymf5PAosq7hWs5DkgHy0-3uacHaY1SPE", "ClientApp 15", 2);
    }

    /* renamed from: a */
    public static synchronized agqe m54828a() {
        agqe agqe;
        synchronized (agqe.class) {
            if (f66266a == null) {
                f66266a = new agqe();
            }
            agqe = f66266a;
        }
        return agqe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* renamed from: b */
    public final agqd mo35932b(String str, String str2) {
        String str3;
        cfmv.m140304c();
        if (!TextUtils.isEmpty(cfmv.m140304c()) && cfmv.m140304c().equals(str)) {
            return new agqd((agqd) this.f66268b.get("AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0"), str);
        }
        char c = 0;
        agqd agqd = null;
        if (!agqg.m54853h() || TextUtils.isEmpty(str2)) {
            if (str != null && str.length() > 1) {
                synchronized (this.f66268b) {
                    String substring = str.substring(str.length() - 8);
                    Iterator it = this.f66268b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        agqd agqd2 = (agqd) it.next();
                        if (agqd2 != null && (str3 = agqd2.f66262b) != null && str3.equals(substring)) {
                            agqd = new agqd(agqd2, str.substring(0, str.length() - 8));
                            break;
                        }
                    }
                }
            }
            return agqd;
        }
        synchronized (this.f66268b) {
            int hashCode = str2.hashCode();
            if (hashCode != -438899875) {
                if (hashCode == 967426967 && str2.equals("api_test")) {
                    if (c == 0) {
                        agqd agqd3 = new agqd((agqd) this.f66268b.get("AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0"), str);
                        return agqd3;
                    } else if (c != 1) {
                        f66267c.mo26019b(agyt.m55307c()).mo68420a("Invalid forTest parameter %s passed to getClient", str2);
                        return null;
                    } else {
                        agqd agqd4 = new agqd((agqd) this.f66268b.get("AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI"), str);
                        return agqd4;
                    }
                }
            } else if (str2.equals("ui_test")) {
                c = 1;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }

    /* renamed from: a */
    private static void m54829a(Map map, String str, String str2, int i) {
        int size = map.size() * 8;
        String substring = "So0spJLqXM3ISkeQXqJp5Ljn9CefehfuA63QJayEq9jXqWCaBonDMicBQgQ1ej7yB7RzPZMPJbyWlzblbLZyTZ7ZZuFWKMovskRTAA8BSpur8wEspmRCn7gWJFFTjuI2qPrZzjkpZrsmBcTUbKkE9h7x1mV0egE3".substring(size, size + 8);
        if (substring != null && substring.length() == 8) {
            map.put(str, new agqd(str, substring, str2, null, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[ADDED_TO_REGION] */
    /* renamed from: a */
    public static boolean m54830a(agqd agqd, String str) {
        char c;
        String str2 = agqd.f66261a;
        int hashCode = str2.hashCode();
        if (hashCode != -488300893) {
            if (hashCode == 537222264 && str2.equals("AIzaSyCqrNxCAJrrk_NQqIUp1-baqW05d3JYeOc")) {
                c = 0;
                if (c != 0 || c == 1) {
                    return cfmv.f184430a.mo6606a().mo81551T().f165797a.contains(str);
                }
                return true;
            }
        } else if (str2.equals("AIzaSyCChP9IaeaDS_LLGBI0P9CDQwTzCxn1kp8")) {
            c = 1;
            if (c != 0) {
            }
            return cfmv.f184430a.mo6606a().mo81551T().f165797a.contains(str);
        }
        c = 65535;
        if (c != 0) {
        }
        return cfmv.f184430a.mo6606a().mo81551T().f165797a.contains(str);
    }

    /* renamed from: a */
    public final agqd mo35930a(String str) {
        agqd agqd;
        synchronized (this.f66268b) {
            agqd = (agqd) this.f66268b.get(str);
        }
        return agqd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return r5;
     */
    /* renamed from: a */
    public final String mo35931a(String str, String str2) {
        synchronized (this.f66268b) {
            if (mo35930a(str2) == null) {
                return null;
            }
            agqd agqd = (agqd) this.f66268b.get(str2);
            if (agqd == null) {
                return null;
            }
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(agqd.f66262b);
            String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
    }
}
