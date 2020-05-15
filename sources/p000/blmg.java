package p000;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: blmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmg {

    /* renamed from: a */
    public static final /* synthetic */ int f126838a = 0;

    /* renamed from: b */
    private static final Object f126839b = new Object();

    /* renamed from: c */
    private static final Object f126840c = new Object();

    /* renamed from: d */
    private static volatile WeakReference f126841d = null;

    /* renamed from: a */
    private static blmf m107359a(blme blme, Supplier supplier) {
        Map a = m107360a();
        if (a == null) {
            synchronized (f126839b) {
                Map a2 = m107360a();
                if (a2 == null) {
                    ConcurrentMap c = bnmt.m109809c();
                    f126841d = new WeakReference(c);
                    a = c;
                } else {
                    a = a2;
                }
            }
        }
        blmf blmf = (blmf) a.get(blme);
        if (blmf != null) {
            return blmf;
        }
        synchronized (f126840c) {
            blmf blmf2 = (blmf) a.get(blme);
            if (blmf2 != null) {
                return blmf2;
            }
            blmf blmf3 = new blmf((Pattern) supplier.get(), new ConcurrentLinkedQueue());
            a.put(blme, blmf3);
            return blmf3;
        }
    }

    /* renamed from: a */
    private static Map m107360a() {
        if (f126841d != null) {
            return (Map) f126841d.get();
        }
        return null;
    }

    /* renamed from: a */
    public static Matcher m107361a(Pattern pattern, String str) {
        Matcher matcher = (Matcher) m107359a(blme.m107356a(pattern), new blmc(pattern)).f126837b.poll();
        if (matcher == null) {
            return pattern.matcher(str);
        }
        matcher.reset(str);
        return matcher;
    }

    /* renamed from: a */
    public static Pattern m107362a(String str, int i) {
        return m107359a(new blli(str, i), new blmb(str, i)).f126836a;
    }

    /* renamed from: a */
    public static void m107363a(Matcher matcher) {
        blme a = blme.m107356a(matcher.pattern());
        matcher.getClass();
        blmf a2 = m107359a(a, new blmd(matcher));
        matcher.reset("");
        a2.f126837b.add(matcher);
    }
}
