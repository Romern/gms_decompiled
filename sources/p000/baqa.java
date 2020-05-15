package p000;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: baqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class baqa {
    /* renamed from: a */
    public static boolean m87367a(baqa baqa, baqa baqa2) {
        return baqa.mo55838a() != baqa2.mo55838a();
    }

    /* renamed from: b */
    public static boolean m87368b(baqa baqa, baqa baqa2) {
        return baqa.mo55839b() != baqa2.mo55839b();
    }

    /* renamed from: c */
    public static boolean m87369c(baqa baqa, baqa baqa2) {
        return m87367a(baqa, baqa2) || m87368b(baqa, baqa2);
    }

    /* renamed from: e */
    public static bapz m87370e() {
        bnha bnha = new bnha();
        Iterator it = EnumSet.complementOf(EnumSet.of(bqao.UNRECOGNIZED)).iterator();
        while (it.hasNext()) {
            bnha.mo67695b((bqao) it.next(), 0L);
        }
        bapz bapz = new bapz();
        bapz.mo55882a(0);
        bapz.mo55884b(0);
        bapz.mo55883a(bnha.mo67618b());
        return bapz;
    }

    /* renamed from: a */
    public abstract long mo55838a();

    /* renamed from: b */
    public abstract long mo55839b();

    /* renamed from: c */
    public abstract bnhe mo55840c();

    /* renamed from: d */
    public abstract bapz mo55841d();

    /* renamed from: a */
    public final long mo55885a(bqao bqao) {
        return ((Long) mo55840c().get(bqao)).longValue();
    }
}
