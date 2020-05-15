package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chsy {

    /* renamed from: a */
    private static final Logger f189113a = Logger.getLogger(chsy.class.getName());

    /* renamed from: b */
    private static chsy f189114b;

    /* renamed from: c */
    private static final Iterable f189115c;

    /* renamed from: d */
    private final LinkedHashSet f189116d = new LinkedHashSet();

    /* renamed from: e */
    private final LinkedHashMap f189117e = new LinkedHashMap();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("cidt"));
        } catch (ClassNotFoundException e) {
            f189113a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            f189113a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        f189115c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static synchronized chsy m149506a() {
        chsy chsy;
        synchronized (chsy.class) {
            if (f189114b == null) {
                List<chsw> a = chur.m149599a(chsw.class, f189115c, chsw.class.getClassLoader(), new chsx());
                f189114b = new chsy();
                for (chsw chsw : a) {
                    Logger logger = f189113a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(chsw);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", sb.toString());
                    if (chsw.mo85614a()) {
                        f189114b.m149507a(chsw);
                    }
                }
                f189114b.m149508b();
            }
            chsy = f189114b;
        }
        return chsy;
    }

    /* renamed from: b */
    private final synchronized void m149508b() {
        this.f189117e.clear();
        Iterator it = this.f189116d.iterator();
        while (it.hasNext()) {
            chsw chsw = (chsw) it.next();
            String c = chsw.mo85616c();
            chsw chsw2 = (chsw) this.f189117e.get(c);
            if (chsw2 == null || chsw2.mo85615b() < chsw.mo85615b()) {
                this.f189117e.put(c, chsw);
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m149507a(chsw chsw) {
        bmxy.m108589a(chsw.mo85614a(), "isAvailable() returned false");
        this.f189116d.add(chsw);
    }

    /* renamed from: a */
    public final synchronized chsw mo85622a(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f189117e;
        bmxy.m108582a(str, "policy");
        return (chsw) linkedHashMap.get(str);
    }
}
