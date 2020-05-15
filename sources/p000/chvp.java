package p000;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvp extends chql {

    /* renamed from: a */
    public static final Logger f189281a = Logger.getLogger(chvp.class.getName());

    /* renamed from: e */
    private static final chvn f189282e;

    /* renamed from: f */
    private static final Class f189283f;

    /* renamed from: b */
    final bllc f189284b;

    /* renamed from: c */
    public chtr f189285c;

    /* renamed from: d */
    public Map f189286d;

    /* renamed from: g */
    private final boolean f189287g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    static {
        chvn chvn;
        NoSuchMethodException noSuchMethodException;
        ClassLoader classLoader = chvp.class.getClassLoader();
        Class<? extends U> cls = null;
        try {
            try {
                chvn = new chvn(Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
            } catch (ClassNotFoundException e) {
                noSuchMethodException = e;
            } catch (NoSuchMethodException e2) {
                noSuchMethodException = e2;
            }
        } catch (ClassNotFoundException e3) {
            chvn = null;
        }
        f189282e = chvn;
        try {
            cls = Class.forName("bllf").asSubclass(bllc.class);
        } catch (ClassNotFoundException e4) {
            f189281a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (Throwable) e4);
        }
        f189283f = cls;
        f189281a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", noSuchMethodException);
        chvn = null;
        f189282e = chvn;
        cls = Class.forName("bllf").asSubclass(bllc.class);
        f189283f = cls;
    }

    public chvp(bllc bllc) {
        boolean z;
        InvocationTargetException invocationTargetException;
        chvn chvn = f189282e;
        bmxy.m108582a(bllc, "creds");
        Class cls = f189283f;
        if (cls != null) {
            z = cls.isInstance(bllc);
        } else {
            z = false;
        }
        if (chvn != null && chvn.f189274a.isInstance(bllc)) {
            try {
                bllc bllc2 = (bllc) chvn.f189274a.cast(bllc);
                try {
                    if (((Collection) chvn.f189277d.invoke(bllc2, new Object[0])).size() == 0) {
                        Object invoke = chvn.f189275b.invoke(null, new Object[0]);
                        for (chvo chvo : chvn.f189278e) {
                            chvo.f189280b.invoke(invoke, chvo.f189279a.invoke(bllc2, new Object[0]));
                        }
                        bllc = (bllc) chvn.f189276c.invoke(invoke, new Object[0]);
                    } else {
                        bllc = bllc2;
                    }
                } catch (IllegalAccessException e) {
                    e = e;
                    bllc = bllc2;
                    invocationTargetException = e;
                    f189281a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                    this.f189287g = z;
                    this.f189284b = bllc;
                } catch (InvocationTargetException e2) {
                    invocationTargetException = e2;
                    bllc = bllc2;
                    f189281a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                    this.f189287g = z;
                    this.f189284b = bllc;
                }
            } catch (IllegalAccessException e3) {
                e = e3;
                invocationTargetException = e;
                f189281a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                this.f189287g = z;
                this.f189284b = bllc;
            } catch (InvocationTargetException e4) {
                invocationTargetException = e4;
                f189281a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                this.f189287g = z;
                this.f189284b = bllc;
            }
        }
        this.f189287g = z;
        this.f189284b = bllc;
    }

    /* renamed from: a */
    private static URI m149644a(String str, chtv chtv) {
        String valueOf = String.valueOf(chtv.f189151c);
        try {
            URI uri = new URI("https", str, valueOf.length() == 0 ? new String("/") : "/".concat(valueOf), null, null);
            return uri.getPort() == 443 ? m149645a(uri) : uri;
        } catch (URISyntaxException e) {
            throw chuv.f189223j.mo85687a("Unable to construct service URI for auth").mo85692c(e).mo85693c();
        }
    }

    /* renamed from: a */
    private static URI m149645a(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw chuv.f189223j.mo85687a("Unable to construct service URI after removing port").mo85692c(e).mo85693c();
        }
    }

    /* renamed from: a */
    public final void mo55569a(chqj chqj, Executor executor, chqk chqk) {
        chuo chuo = (chuo) bmxu.m108565a((chuo) chqj.f189002b.f189437a.mo85743a().mo85534a(chzz.f189624a), chuo.NONE);
        if (this.f189287g && chuo != chuo.PRIVACY_AND_INTEGRITY) {
            chuv chuv = chuv.f189223j;
            String valueOf = String.valueOf(chuo);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
            sb.append("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ");
            sb.append(valueOf);
            chqk.mo85539a(chuv.mo85687a(sb.toString()));
            return;
        }
        String str = (String) bmxu.m108565a(null, chqj.f189002b.f189438b);
        bmxy.m108582a(str, "authority");
        try {
            m149644a(str, chqj.f189001a);
            this.f189284b.mo66643a(executor, new chvm(this, chqk));
        } catch (chuw e) {
            chqk.mo85539a(e.f189236a);
        }
    }
}
