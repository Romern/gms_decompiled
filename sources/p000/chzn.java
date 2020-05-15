package p000;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chzn extends chue {

    /* renamed from: a */
    public static final Logger f189585a = Logger.getLogger(chzn.class.getName());

    /* renamed from: b */
    public static final Set f189586b = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: c */
    static final boolean f189587c = Boolean.parseBoolean(f189591s);

    /* renamed from: d */
    static final boolean f189588d = Boolean.parseBoolean(f189592t);

    /* renamed from: e */
    protected static final boolean f189589e = Boolean.parseBoolean(f189593u);

    /* renamed from: f */
    public static final chzm f189590f;

    /* renamed from: s */
    private static final String f189591s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");

    /* renamed from: t */
    private static final String f189592t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");

    /* renamed from: u */
    private static final String f189593u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");

    /* renamed from: v */
    private static String f189594v;

    /* renamed from: A */
    private final boolean f189595A;

    /* renamed from: B */
    private chua f189596B;

    /* renamed from: g */
    final chun f189597g;

    /* renamed from: h */
    public final Random f189598h = new Random();

    /* renamed from: i */
    protected volatile chzg f189599i = chzi.INSTANCE;

    /* renamed from: j */
    public final AtomicReference f189600j = new AtomicReference();

    /* renamed from: k */
    public final String f189601k;

    /* renamed from: l */
    public final int f189602l;

    /* renamed from: m */
    public final long f189603m;

    /* renamed from: n */
    public final chvc f189604n;

    /* renamed from: o */
    public final bmza f189605o;

    /* renamed from: p */
    protected boolean f189606p;

    /* renamed from: q */
    public final chud f189607q;

    /* renamed from: r */
    public boolean f189608r;

    /* renamed from: w */
    private final String f189609w;

    /* renamed from: x */
    private final ciew f189610x;

    /* renamed from: y */
    private boolean f189611y;

    /* renamed from: z */
    private Executor f189612z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassCastException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    static {
        chzm chzm = null;
        try {
            try {
                try {
                    chzm chzm2 = (chzm) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, chzn.class.getClassLoader()).asSubclass(chzm.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (chzm2.mo85844b() != null) {
                        f189585a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", chzm2.mo85844b());
                    } else {
                        chzm = chzm2;
                    }
                } catch (Exception e) {
                    f189585a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                f189585a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassNotFoundException e3) {
            f189585a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassCastException e4) {
            f189585a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        f189590f = chzm;
    }

    protected chzn(String str, chtx chtx, ciew ciew, bmza bmza, boolean z) {
        boolean z2;
        String str2 = str;
        chtx chtx2 = chtx;
        bmza bmza2 = bmza;
        bmxy.m108582a(chtx2, "args");
        this.f189610x = ciew;
        bmxy.m108582a(str2, "name");
        URI create = URI.create(str.length() == 0 ? new String("//") : "//".concat(str2));
        boolean z3 = true;
        if (create.getHost() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108596a(z2, "Invalid DNS name: %s", str2);
        String authority = create.getAuthority();
        bmxy.m108587a(authority, "nameUri (%s) doesn't have an authority", create);
        this.f189609w = authority;
        this.f189601k = create.getHost();
        if (create.getPort() != -1) {
            this.f189602l = create.getPort();
        } else {
            this.f189602l = chtx2.f189162a;
        }
        chun chun = chtx2.f189163b;
        bmxy.m108582a(chun, "proxyDetector");
        this.f189597g = chun;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException e) {
                    f189585a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.f189603m = j;
        bmxy.m108582a(bmza2, "stopwatch");
        this.f189605o = bmza2;
        chvc chvc = chtx2.f189164c;
        bmxy.m108582a(chvc, "syncContext");
        this.f189604n = chvc;
        Executor executor = chtx2.f189166e;
        this.f189612z = executor;
        this.f189595A = executor != null ? false : z3;
        chud chud = chtx2.f189165d;
        bmxy.m108582a(chud, "serviceConfigParser");
        this.f189607q = chud;
    }

    /* renamed from: d */
    public static String m149840d() {
        if (f189594v == null) {
            try {
                f189594v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f189594v;
    }

    /* renamed from: e */
    private final void m149841e() {
        if (!this.f189608r && !this.f189611y) {
            if (this.f189606p) {
                long j = this.f189603m;
                if (j != 0 && (j <= 0 || this.f189605o.mo66928a(TimeUnit.NANOSECONDS) <= this.f189603m)) {
                    return;
                }
            }
            this.f189608r = true;
            this.f189612z.execute(new chzk(this, this.f189596B));
        }
    }

    /* renamed from: a */
    public final String mo85675a() {
        return this.f189609w;
    }

    /* renamed from: b */
    public final void mo85677b() {
        if (!this.f189611y) {
            this.f189611y = true;
            Executor executor = this.f189612z;
            if (executor != null && this.f189595A) {
                ciex.m150142b(this.f189610x, executor);
                this.f189612z = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo85678c() {
        bmxy.m108601b(this.f189596B != null, "not started");
        m149841e();
    }

    /* renamed from: a */
    public final void mo85676a(chua chua) {
        boolean z;
        if (this.f189596B == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "already started");
        if (this.f189595A) {
            this.f189612z = (Executor) ciex.m150140a(this.f189610x);
        }
        bmxy.m108582a(chua, "listener");
        this.f189596B = chua;
        m149841e();
    }
}
