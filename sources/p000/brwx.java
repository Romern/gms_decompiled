package p000;

import android.content.Context;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: brwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brwx extends chqp {

    /* renamed from: a */
    private final bruo f143547a;

    /* renamed from: b */
    private final brue f143548b;

    /* renamed from: c */
    private final Object f143549c = new Object();

    /* renamed from: d */
    private final ConcurrentHashMap f143550d = new ConcurrentHashMap();

    public brwx(bruo bruo, brue brue) {
        this.f143547a = bruo;
        this.f143548b = brue;
    }

    /* renamed from: a */
    private static final URI m114821a(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            if (uri.getPort() == -1) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            return uri;
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    /* renamed from: a */
    public final chqs mo70053a(chtv chtv, chqo chqo) {
        chqo chqo2 = chqo;
        brue brue = this.f143548b;
        String str = (String) chqo2.mo85548a(brup.f143420a);
        if (str == null) {
            str = mo70054a();
        }
        URI a = m114821a(str);
        bmxy.m108601b(!TextUtils.isEmpty(a.getAuthority()), "Could not parse channel authority");
        brwc brwc = new brwc(a, ((Long) this.f143548b.mo69956m().mo6606a()).longValue(), (Integer) chqo2.mo85548a(bruj.f143414a), (Integer) chqo2.mo85548a(bruj.f143415b));
        chqp chqp = (chqp) this.f143550d.get(brwc);
        if (chqp == null) {
            synchronized (this.f143549c) {
                if (!this.f143550d.containsKey(brwc)) {
                    bmzi a2 = bmzn.m108683a((Object) false);
                    brut brut = new brut();
                    brut.mo69990a(a2);
                    Context a3 = brue.mo69942a();
                    if (a3 != null) {
                        brut.f143423a = a3;
                        brut.f143424b = brwc.f143504a;
                        brut.f143430h = brwc.f143506c;
                        brut.f143431i = brwc.f143507d;
                        brut.f143432j = Long.valueOf(brwc.f143505b);
                        Executor f = brue.mo69948f();
                        if (f != null) {
                            brut.f143425c = f;
                            Executor d = brue.mo69945d();
                            if (d != null) {
                                brut.f143426d = d;
                                brut.f143427e = brue.mo69949g();
                                brut.mo69990a(brue.mo69953j());
                                brut.f143429g = brue.mo69958o();
                                String str2 = "";
                                if (brut.f143423a == null) {
                                    str2 = " applicationContext";
                                }
                                if (brut.f143424b == null) {
                                    str2 = str2.concat(" uri");
                                }
                                if (brut.f143425c == null) {
                                    str2 = String.valueOf(str2).concat(" networkExecutor");
                                }
                                if (brut.f143426d == null) {
                                    str2 = String.valueOf(str2).concat(" transportExecutor");
                                }
                                if (brut.f143428f == null) {
                                    str2 = String.valueOf(str2).concat(" recordNetworkMetricsToPrimes");
                                }
                                if (brut.f143432j == null) {
                                    str2 = String.valueOf(str2).concat(" grpcIdleTimeoutMillis");
                                }
                                if (str2.isEmpty()) {
                                    this.f143550d.put(brwc, new brwn(brue.mo69944c(), new bruc(brut.f143423a, brut.f143424b, brut.f143425c, brut.f143426d, brut.f143427e, brut.f143428f, brut.f143429g, brut.f143430h, brut.f143431i, brut.f143432j.longValue()), brue.mo69946e()));
                                } else {
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                }
                            } else {
                                throw new NullPointerException("Null transportExecutor");
                            }
                        } else {
                            throw new NullPointerException("Null networkExecutor");
                        }
                    } else {
                        throw new NullPointerException("Null applicationContext");
                    }
                }
                chqp = (chqp) this.f143550d.get(brwc);
            }
        }
        return chqp.mo70053a(chtv, chqo2);
    }

    /* renamed from: a */
    public final String mo70054a() {
        return this.f143547a.mo69987a().f105583a;
    }
}
