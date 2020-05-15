package p000;

import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chwp extends chta {

    /* renamed from: a */
    static final long f189390a = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: b */
    public static final long f189391b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: p */
    private static final Logger f189392p = Logger.getLogger(chwp.class.getName());

    /* renamed from: q */
    private static final cidm f189393q = ciey.m150145a(ciag.f189655l);

    /* renamed from: r */
    private static final chrp f189394r = chrp.f189048b;

    /* renamed from: s */
    private static final chrf f189395s = chrf.f189025a;

    /* renamed from: c */
    cidm f189396c;

    /* renamed from: d */
    final cidm f189397d;

    /* renamed from: e */
    public final List f189398e = new ArrayList();

    /* renamed from: f */
    final chuj f189399f;

    /* renamed from: g */
    public chtz f189400g;

    /* renamed from: h */
    final String f189401h;

    /* renamed from: i */
    public String f189402i;

    /* renamed from: j */
    final String f189403j;

    /* renamed from: k */
    final chrp f189404k;

    /* renamed from: l */
    final chrf f189405l;

    /* renamed from: m */
    public long f189406m;

    /* renamed from: n */
    final chsc f189407n;

    /* renamed from: o */
    protected final cifg f189408o;

    protected chwp(String str) {
        cidm cidm = f189393q;
        this.f189396c = cidm;
        this.f189397d = cidm;
        chuj a = chuj.m149588a();
        this.f189399f = a;
        this.f189400g = a.f189184a;
        this.f189403j = "pick_first";
        this.f189404k = f189394r;
        this.f189405l = f189395s;
        this.f189406m = f189390a;
        this.f189407n = chsc.f189082b;
        this.f189408o = cifh.f189999a;
        bmxy.m108582a(str, "target");
        this.f189401h = str;
    }

    /* renamed from: a */
    static String m149714a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append("/");
            sb.append(valueOf);
            return new URI("directaddress", "", sb.toString(), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract chxx mo85716a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.reflect.InvocationTargetException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.IllegalAccessException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.NoSuchMethodException]
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
    /* renamed from: b */
    public final chsz mo85581b() {
        chqt chqt;
        chxx a = mo85716a();
        ciey a2 = ciey.m150145a(ciag.f189655l);
        bmzi bmzi = ciag.f189657n;
        ArrayList arrayList = new ArrayList(this.f189398e);
        chqt chqt2 = null;
        try {
            chqt = (chqt) Class.forName("chvu").getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE).invoke(null, true, true, false);
        } catch (ClassNotFoundException e) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
            chqt = null;
        } catch (NoSuchMethodException e2) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
            chqt = null;
        } catch (IllegalAccessException e3) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
            chqt = null;
        } catch (InvocationTargetException e4) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
            chqt = null;
        }
        if (chqt != null) {
            arrayList.add(0, chqt);
        }
        try {
            chqt2 = (chqt) Class.forName("chvv").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e5) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
        } catch (NoSuchMethodException e6) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
        } catch (IllegalAccessException e7) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e7);
        } catch (InvocationTargetException e8) {
            f189392p.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e8);
        }
        if (chqt2 != null) {
            arrayList.add(0, chqt2);
        }
        return new cicx(new cicv(this, a, a2, bmzi, arrayList, cifd.f189995a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo85769c() {
        return 443;
    }

    /* renamed from: a */
    public final void mo85768a(Executor executor) {
        if (executor != null) {
            this.f189396c = new chzt(executor);
        } else {
            this.f189396c = f189393q;
        }
    }

    protected chwp(SocketAddress socketAddress, String str) {
        cidm cidm = f189393q;
        this.f189396c = cidm;
        this.f189397d = cidm;
        chuj a = chuj.m149588a();
        this.f189399f = a;
        this.f189400g = a.f189184a;
        this.f189403j = "pick_first";
        this.f189404k = f189394r;
        this.f189405l = f189395s;
        this.f189406m = f189390a;
        this.f189407n = chsc.f189082b;
        this.f189408o = cifh.f189999a;
        this.f189401h = m149714a(socketAddress);
        this.f189400g = new chwo(socketAddress, str);
    }
}
