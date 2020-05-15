package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciag {

    /* renamed from: a */
    public static final chtn f189644a = chtn.m149535a("grpc-timeout", new ciaf());

    /* renamed from: b */
    public static final chtn f189645b = chtn.m149535a("grpc-encoding", chtr.f189134b);

    /* renamed from: c */
    public static final chtn f189646c = chsg.m149481a("grpc-accept-encoding", new ciad());

    /* renamed from: d */
    public static final chtn f189647d = chtn.m149535a("content-encoding", chtr.f189134b);

    /* renamed from: e */
    public static final chtn f189648e = chsg.m149481a("accept-encoding", new ciad());

    /* renamed from: f */
    public static final chtn f189649f = chtn.m149535a("content-type", chtr.f189134b);

    /* renamed from: g */
    public static final chtn f189650g = chtn.m149535a("te", chtr.f189134b);

    /* renamed from: h */
    public static final chtn f189651h = chtn.m149535a(DataParser.USER_AGENT_KEY, chtr.f189134b);

    /* renamed from: i */
    public static final long f189652i = TimeUnit.SECONDS.toNanos(20);

    /* renamed from: j */
    public static final chun f189653j = new cidx();

    /* renamed from: k */
    public static final chqn f189654k = chqn.m149404a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");

    /* renamed from: l */
    public static final ciew f189655l = new ciaa();

    /* renamed from: m */
    public static final ciew f189656m = new ciab();

    /* renamed from: n */
    public static final bmzi f189657n = new ciac();

    /* renamed from: o */
    private static final Logger f189658o = Logger.getLogger(ciag.class.getName());

    static {
        Charset.forName("US-ASCII");
        bmyx.m108640a(',').mo66920b();
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }

    private ciag() {
    }

    /* renamed from: a */
    public static chuv m149908a(int i) {
        chus chus;
        if (i < 100 || i >= 200) {
            if (i != 400) {
                if (i == 401) {
                    chus = chus.UNAUTHENTICATED;
                } else if (i == 403) {
                    chus = chus.PERMISSION_DENIED;
                } else if (i != 404) {
                    if (i != 429) {
                        if (i != 431) {
                            switch (i) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    chus = chus.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    chus = chus.UNAVAILABLE;
                } else {
                    chus = chus.UNIMPLEMENTED;
                }
            }
            chus = chus.INTERNAL;
        } else {
            chus = chus.INTERNAL;
        }
        chuv a = chus.mo85686a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("HTTP status code ");
        sb.append(i);
        return a.mo85687a(sb.toString());
    }

    /* renamed from: b */
    public static URI m149917b(String str) {
        bmxy.m108582a(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid authority: ") : "Invalid authority: ".concat(valueOf), e);
        }
    }

    /* renamed from: c */
    public static ThreadFactory m149918c(String str) {
        bqha bqha = new bqha();
        bqha.mo69261a();
        bqha.mo69262a(str);
        return bqha.m112820a(bqha);
    }

    /* renamed from: a */
    static chxv m149909a(chso chso, boolean z) {
        chxv chxv;
        chss chss = chso.f189101b;
        if (chss != null) {
            cict cict = (cict) chss;
            bmxy.m108601b(cict.f189789f, "Subchannel is not started");
            chxv = cict.f189788e.mo85895a();
        } else {
            chxv = null;
        }
        if (chxv != null) {
            return chxv;
        }
        if (!chso.f189102c.mo85689a()) {
            if (chso.f189103d) {
                return new chzs(chso.f189102c, chxt.DROPPED);
            }
            if (!z) {
                return new chzs(chso.f189102c, chxt.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m149910a(String str, int i) {
        try {
            return new URI(null, null, str, i, null, null, null).getAuthority();
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static String m149911a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.29.0-SNAPSHOT");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m149912a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: a */
    static void m149913a(cidd cidd) {
        while (true) {
            InputStream a = cidd.mo85976a();
            if (a != null) {
                m149914a(a);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m149914a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                f189658o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m149915a(chqo chqo) {
        return !Boolean.TRUE.equals(chqo.mo85548a(f189654k));
    }

    /* renamed from: a */
    public static boolean m149916a(String str) {
        char charAt;
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc")) {
                if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
