package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chuj {

    /* renamed from: b */
    private static final Logger f189182b = Logger.getLogger(chuj.class.getName());

    /* renamed from: c */
    private static chuj f189183c;

    /* renamed from: a */
    public final chtz f189184a = new chuh(this);

    /* renamed from: d */
    private final LinkedHashSet f189185d = new LinkedHashSet();

    /* renamed from: e */
    private List f189186e = Collections.emptyList();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static synchronized chuj m149588a() {
        chuj chuj;
        synchronized (chuj.class) {
            if (f189183c == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("chzo"));
                } catch (ClassNotFoundException e) {
                    f189182b.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<chuf> a = chur.m149599a(chuf.class, Collections.unmodifiableList(arrayList), chuf.class.getClassLoader(), new chui());
                if (a.isEmpty()) {
                    f189182b.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f189183c = new chuj();
                for (chuf chuf : a) {
                    Logger logger = f189182b;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(chuf);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", sb.toString());
                    if (chuf.mo85679b()) {
                        f189183c.m149589a(chuf);
                    }
                }
                f189183c.m149590c();
            }
            chuj = f189183c;
        }
        return chuj;
    }

    /* renamed from: c */
    private final synchronized void m149590c() {
        ArrayList arrayList = new ArrayList(this.f189185d);
        Collections.sort(arrayList, Collections.reverseOrder(new chug()));
        this.f189186e = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized List mo85682b() {
        return this.f189186e;
    }

    /* renamed from: a */
    private final synchronized void m149589a(chuf chuf) {
        bmxy.m108589a(chuf.mo85679b(), "isAvailable() returned false");
        this.f189185d.add(chuf);
    }
}
