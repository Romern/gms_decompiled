package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atff {

    /* renamed from: a */
    static final RequestQueue f90228a = rpr.m34216b().getRequestQueue();

    /* renamed from: b */
    static final bmxv f90229b = bmvz.f131120a;

    /* renamed from: c */
    private static final srn f90230c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static btnf m75758a(VolleyError volleyError) {
        Throwable cause = volleyError.getCause();
        if (cause instanceof atfh) {
            return ((atfh) cause).f90231a;
        }
        return null;
    }

    /* renamed from: b */
    public static bxxc m75769b(askf askf, String str, bxxc bxxc, bxxc bxxc2) {
        sdo.m34974b(!str.startsWith("e/"));
        return m75761a(askf, str, bxxc, bxxc2, (Map) null, askc.m74270a(askf.f89125c), 1);
    }

    /* renamed from: c */
    public static bxxc m75771c(askf askf, String str, bxxc bxxc, bxxc bxxc2) {
        sdo.m34974b(!str.startsWith("e/"));
        return m75761a(askf, str, bxxc, bxxc2, (Map) null, askc.m74273b(askf.f89125c), 0);
    }

    /* renamed from: a */
    public static bxxc m75759a(askf askf, String str, bxxc bxxc, bxxc bxxc2) {
        sdo.m34974b(!str.startsWith("e/"));
        return m75760a(askf, str, bxxc, bxxc2, (Map) null);
    }

    /* renamed from: a */
    public static bxxc m75760a(askf askf, String str, bxxc bxxc, bxxc bxxc2, Map map) {
        return m75761a(askf, str, bxxc, bxxc2, map, askc.m74270a(askf.f89125c), 0);
    }

    /* renamed from: b */
    public static void m75770b(askf askf, String str, bxxc bxxc, bxxc bxxc2, Response.Listener listener, Response.ErrorListener errorListener, Object obj) {
        m75766a(askf, str, bxxc, bxxc2, atfb.m75757a(listener, errorListener), obj, 1);
    }

    /* renamed from: a */
    public static bxxc m75761a(askf askf, String str, bxxc bxxc, bxxc bxxc2, Map map, String str2, int i) {
        try {
            sdo.m34970a(!asko.m74292a(askf.f89126d).mo49214a().isDbLockedByCurrentThread());
        } catch (asks e) {
        }
        if (map != null) {
            if (!map.isEmpty()) {
                sdo.m34974b(str.startsWith("e/"));
            }
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        f90228a.add(m75763a(askf, str, bxxc, bxxc2, newFuture, newFuture, null, map, str2, i));
        try {
            return (bxxc) newFuture.get(60, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException(e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof VolleyError) {
                Throwable cause2 = cause.getCause();
                if (cause2 instanceof atfh) {
                    throw ((atfh) cause2);
                } else if (cause2 instanceof IOException) {
                    throw ((IOException) cause2);
                }
            }
            throw new IOException(cause);
        }
    }

    /* renamed from: a */
    public static bxxc m75762a(btnf btnf, bxxc bxxc, int i) {
        String str;
        if (btnf != null) {
            if (i == 1) {
                str = "type.googleapis.com/google.internal.tapandpay.v1.TokenizationErrorDetails";
            } else if (i == 2) {
                str = "type.googleapis.com/google.internal.tapandpay.v1.AttestationErrorDetails";
            } else if (i == 3) {
                str = "type.googleapis.com/google.internal.tapandpay.v1.CommonErrorDetails";
            } else if (i == 4) {
                str = "type.googleapis.com/google.internal.tapandpay.v1.SetupErrorDetails";
            } else {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Trying to get an undefined error detail type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            bxwc bxwc = btnf.f149605d;
            int size = bxwc.size();
            int i2 = 0;
            while (i2 < size) {
                bxte bxte = (bxte) bxwc.get(i2);
                i2++;
                if (bxte.f164765a.equals(str)) {
                    try {
                        return (bxxc) bxxc.mo74143cZ().mo73653a(bxte.f164766b);
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f90230c.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("atff", "a", 526, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Error parsing error details");
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Request m75763a(askf askf, String str, bxxc bxxc, bxxc bxxc2, Response.Listener listener, Response.ErrorListener errorListener, Object obj, Map map, String str2, int i) {
        boolean z;
        Account account;
        askf askf2 = askf;
        String str3 = str;
        Object obj2 = obj;
        sdo.m34977c(str);
        String languageTag = Locale.getDefault().toLanguageTag();
        if (map == null || map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !str3.startsWith("e/") ? false : z;
        Uri.Builder appendQueryParameter = Uri.parse(askc.m74271a(askf2.f89125c, i)).buildUpon().appendEncodedPath(str3).appendQueryParameter("forcehl", "1").appendQueryParameter("hl", languageTag);
        if (z2) {
            appendQueryParameter.appendQueryParameter("s7e_mode", "proto");
        }
        String builder = appendQueryParameter.toString();
        String str4 = askf2.f89127e;
        Context context = askf2.f89126d;
        btpt btpt = (btpt) btpu.f149888f.mo74144da();
        long a = asjm.m74238a(context);
        if (btpt.f164950c) {
            btpt.mo74035c();
            btpt.f164950c = false;
        }
        btpu btpu = (btpu) btpt.f164949b;
        btpu.f149890a = a;
        btpu.f149893d = 1;
        bxvd da = btps.f149882e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        "com.google.android.gms".getClass();
        ((btps) da.f164949b).f149884a = "com.google.android.gms";
        String num = Integer.toString(201515033);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btps btps = (btps) da.f164949b;
        num.getClass();
        btps.f149885b = num;
        "20.15.15 (120300-{{cl}})".getClass();
        btps.f149886c = "20.15.15 (120300-{{cl}})";
        btpy btpy = btpy.TAPANDPAY_GMS_MODULE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btps) da.f164949b).f149887d = btpy.mo3214a();
        if (btpt.f164950c) {
            btpt.mo74035c();
            btpt.f164950c = false;
        }
        btps btps2 = (btps) da.mo74062i();
        btps2.getClass();
        ((btpu) btpt.f164949b).f149891b = btps2;
        bmxv bmxv = f90229b;
        Boolean valueOf = Boolean.valueOf(alfj.m60866b(context));
        bmxv.mo66812a(valueOf);
        if (valueOf.booleanValue()) {
            btpy btpy2 = btpy.PAY_GMS_MODULE;
            if (btpt.f164950c) {
                btpt.mo74035c();
                btpt.f164950c = false;
            }
            btpu btpu2 = (btpu) btpt.f164949b;
            btpy2.getClass();
            if (!btpu2.f149894e.mo73666a()) {
                btpu2.f149894e = bxvk.m124019a(btpu2.f149894e);
            }
            btpu2.f149894e.mo74153d(btpy2.mo3214a());
        }
        if (!TextUtils.isEmpty(str4)) {
            bxvd da2 = btps.f149882e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str4.getClass();
            ((btps) da2.f164949b).f149884a = str4;
            try {
                String num2 = Integer.toString(spn.m35864b(context, str4));
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                num2.getClass();
                ((btps) da2.f164949b).f149885b = num2;
                String b = bmxx.m108578b(spn.m35848a(context, str4));
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                b.getClass();
                ((btps) da2.f164949b).f149886c = b;
            } catch (PackageManager.NameNotFoundException e) {
            }
            if (btpt.f164950c) {
                btpt.mo74035c();
                btpt.f164950c = false;
            }
            btps btps3 = (btps) da2.mo74062i();
            btps3.getClass();
            ((btpu) btpt.f164949b).f149892c = btps3;
        }
        bxvd da3 = btpv.f149895c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btpu btpu3 = (btpu) btpt.mo74062i();
        btpu3.getClass();
        ((btpv) da3.f164949b).f149897a = btpu3;
        bxvd da4 = bxte.f164763c.mo74144da();
        bxtx aL = bxxc.mo73639aL();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        aL.getClass();
        ((bxte) da4.f164949b).f164766b = aL;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxte bxte = (bxte) da4.mo74062i();
        bxte.getClass();
        ((btpv) da3.f164949b).f149898b = bxte;
        byte[] k = ((btpv) da3.mo74062i()).mo73642k();
        Context context2 = askf2.f89126d;
        if (!TextUtils.isEmpty(askf2.f89124b)) {
            account = new Account(askf2.f89124b, "com.google");
        } else {
            account = null;
        }
        atfa atfa = new atfa(context2, builder, k, account, str2, bxxc2, listener, errorListener);
        atfa.setShouldCache(false);
        atfa.mo49918a("User-Agent", String.format(Locale.US, "androidpay %s-v%d (Android %s %s %s %s)", "20.15.15 (120300-{{cl}})", 201515033, Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS));
        atfa.mo49918a("Accept-Language", languageTag);
        if (z) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : map.entrySet()) {
                String valueOf2 = String.valueOf(entry.getKey());
                String valueOf3 = String.valueOf(entry.getValue());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 5 + String.valueOf(valueOf3).length());
                sb.append("2.2.");
                sb.append(valueOf2);
                sb.append(";");
                sb.append(valueOf3);
                hashSet.add(sb.toString());
            }
            atfa.mo49918a("EES-Proto-Tokenization", bmxr.m108544a(", ").mo66874a((Iterable) hashSet));
        }
        if (obj2 != null) {
            atfa.setTag(obj2);
        }
        return atfa;
    }

    /* renamed from: a */
    public static void m75764a(askf askf, String str, bxxc bxxc, bxxc bxxc2, atfd atfd) {
        sdo.m34974b(!str.startsWith("e/"));
        f90228a.add(m75763a(askf, str, bxxc, bxxc2, atfd, atfd, null, null, askc.m74273b(askf.f89125c), 0));
    }

    /* renamed from: a */
    public static void m75765a(askf askf, String str, bxxc bxxc, bxxc bxxc2, atfd atfd, Object obj) {
        m75766a(askf, str, bxxc, bxxc2, atfd, obj, 0);
    }

    /* renamed from: a */
    private static void m75766a(askf askf, String str, bxxc bxxc, bxxc bxxc2, atfd atfd, Object obj, int i) {
        sdo.m34974b(!str.startsWith("e/"));
        f90228a.add(m75763a(askf, str, bxxc, bxxc2, atfd, atfd, obj, null, askc.m74270a(askf.f89125c), i));
    }

    /* renamed from: a */
    public static void m75767a(askf askf, String str, bxxc bxxc, bxxc bxxc2, Response.Listener listener, Response.ErrorListener errorListener, Object obj) {
        m75766a(askf, str, bxxc, bxxc2, atfb.m75757a(listener, errorListener), obj, 0);
    }

    /* renamed from: a */
    public static void m75768a(Object obj) {
        f90228a.cancelAll(obj);
    }
}
