package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

/* renamed from: giu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class giu {

    /* renamed from: a */
    private final Context f18314a;

    /* renamed from: b */
    private final CookieManager f18315b;

    public giu(Context context) {
        CookieManager instance = CookieManager.getInstance();
        this.f18314a = context;
        this.f18315b = instance;
    }

    /* renamed from: a */
    public static giu m13225a(Context context) {
        return new giu(context);
    }

    /* renamed from: a */
    static String m13226a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                StringBuilder sb = new StringBuilder(String.valueOf(protocol).length() + 3 + String.valueOf(host).length());
                sb.append(protocol);
                sb.append("://");
                sb.append(host);
                builder.appendQueryParameter("url", sb.toString());
                i++;
            } catch (MalformedURLException e) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid URL: ") : "Invalid URL: ".concat(valueOf));
            }
        }
        String valueOf2 = String.valueOf(builder.build().getQuery());
        return valueOf2.length() == 0 ? new String("weblogin:") : "weblogin:".concat(valueOf2);
    }

    /* renamed from: a */
    private final Set m13227a(List list) {
        String str;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Long l;
        Set b = sqw.m36046b(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jht jht = (jht) list.get(i);
            if (!TextUtils.isEmpty(jht.f22511e)) {
                str = jht.f22511e;
            } else {
                str = jht.f22510d;
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(jht.f22508b) || TextUtils.isEmpty(jht.f22509c)) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                if ((jht.f22507a & 32) != 0) {
                    bool = Boolean.valueOf(jht.f22513g);
                } else {
                    bool = null;
                }
                String a = ghx.m13173a(str, bool);
                String str2 = jht.f22508b;
                String str3 = jht.f22509c;
                String str4 = jht.f22510d;
                String str5 = jht.f22512f;
                if ((jht.f22507a & 64) != 0) {
                    bool2 = Boolean.valueOf(jht.f22514h);
                } else {
                    bool2 = null;
                }
                if ((jht.f22507a & 32) != 0) {
                    bool3 = Boolean.valueOf(jht.f22513g);
                } else {
                    bool3 = null;
                }
                if ((jht.f22507a & 128) != 0) {
                    l = Long.valueOf((long) jht.f22515i);
                } else {
                    l = null;
                }
                String a2 = ghx.m13174a(str2, str3, str4, str5, bool2, bool3, l);
                String valueOf = String.valueOf(a);
                if (valueOf.length() == 0) {
                    new String("Setting cookie for url: ");
                } else {
                    "Setting cookie for url: ".concat(valueOf);
                }
                this.f18315b.setCookie(a, a2);
                b.add(a);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final Set mo11918a(Account account, String... strArr) {
        boolean z;
        sdo.m34959a(account);
        int i = 1;
        if (strArr == null || strArr.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "Must have at least one URL.");
        try {
            jhu jhu = (jhu) GeneratedMessageLite.m124016a(jhu.f22516c, Base64.decode(gik.m13216d(this.f18314a, account, m13226a(strArr)), 9), bxus.m123744c());
            if (jhu == null || (jhu.f22518a & 1) == 0) {
                throw new gid("Invalid response.");
            }
            jia jia = jhu.f22519b;
            if (jia == null) {
                jia = jia.f22529d;
            }
            int a = jhz.m16742a(jia.f22531a);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                return m13227a(jia.f22532b);
            }
            if (i2 == 2) {
                throw new IOException("Request failed, but server said RETRY.");
            } else if (i2 != 5) {
                String valueOf = String.valueOf(jia);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("WebLoginHelper", sb.toString());
                int a2 = jhz.m16742a(jia.f22531a);
                if (a2 != 0) {
                    i = a2;
                }
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unknown response status: ");
                sb2.append(i - 1);
                throw new gid(sb2.toString());
            } else {
                m13227a(jia.f22532b);
                bxwc bxwc = jia.f22533c;
                int size = bxwc.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jhx jhx = (jhx) bxwc.get(i3);
                    int a3 = jhw.m16739a(jhx.f22523a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i4 = a3 - 1;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            throw new git(jhx.f22524b);
                        } else if (i4 != 3) {
                            int a4 = jhw.m16739a(jhx.f22523a);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            StringBuilder sb3 = new StringBuilder(47);
                            sb3.append("Unrecognized failed account status: ");
                            sb3.append(a4 - 1);
                            Log.w("WebLoginHelper", sb3.toString());
                        }
                    }
                }
                throw new gid("Authorization failed, but no recoverable accounts.");
            }
        } catch (bxwf e) {
            throw new gid("Couldn't read data from server.", e);
        }
    }
}
