package p000;

import android.content.Context;
import java.io.Closeable;
import java.util.Collections;
import java.util.Set;

/* renamed from: rue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rue implements Closeable {

    /* renamed from: a */
    public static final Set f43695a = sqw.m36045b();

    /* renamed from: c */
    private static rue f43696c = null;

    /* renamed from: d */
    private static int f43697d;

    /* renamed from: b */
    private final ruf f43698b = new ruf();

    protected rue() {
    }

    /* renamed from: a */
    public static long m34466a(Context context) {
        return anfb.m64138a(context, "direct_boot:gms_chimera_phenotype_flags").getLong("__dd_sp_version_key", -1);
    }

    /* renamed from: b */
    public static Set m34468b() {
        Set b = sqw.m36045b();
        b.addAll(bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) cdkp.f181122a.mo6606a().mo77819f()));
        return b;
    }

    /* renamed from: c */
    public final Set mo25174c() {
        Set unmodifiableSet;
        synchronized (rue.class) {
            unmodifiableSet = Collections.unmodifiableSet(f43695a);
        }
        return unmodifiableSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    public final void close() {
        synchronized (rue.class) {
            if (f43696c != null) {
                int i = f43697d - 1;
                f43697d = i;
                if (i <= 0) {
                    f43697d = 0;
                    this.f43698b.close();
                    f43696c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized rue m34467a() {
        rue rue;
        synchronized (rue.class) {
            if (f43696c == null) {
                f43696c = new rue();
            }
            f43697d++;
            rue = f43696c;
        }
        return rue;
    }
}
