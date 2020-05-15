package p000;

import android.util.ArrayMap;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: akda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akda {

    /* renamed from: a */
    public final ScheduledExecutorService f71635a = ahhr.m55804a();

    /* renamed from: b */
    public akfr f71636b;

    /* renamed from: c */
    private final Map f71637c = new ArrayMap();

    /* renamed from: a */
    private final void m59443a(long j) {
        akcz akcz = (akcz) this.f71637c.remove(Long.valueOf(j));
        if (akcz != null) {
            akcz.mo39239a();
            srn srn = ajvp.f71371a;
        }
    }

    /* renamed from: b */
    private final void m59445b(long j) {
        for (Long l : this.f71637c.keySet()) {
            akcz akcz = (akcz) this.f71637c.get(Long.valueOf(l.longValue()));
            if (akcz != null) {
                if (akcz.f71634d != null) {
                    akcz.mo39239a();
                }
                akcy akcy = new akcy(this, akcz);
                srn srn = ajvp.f71371a;
                ahfi b = ahfi.m55635b(akcy, j, this.f71635a);
                akcz.mo39239a();
                akcz.f71634d = b;
            }
        }
    }

    /* renamed from: c */
    private static long m59446c(ShareTarget shareTarget) {
        return (long) Arrays.hashCode(new Object[]{shareTarget.f81029b, shareTarget.f81030c, Integer.valueOf(shareTarget.f81031d), Boolean.valueOf(shareTarget.f81036i), shareTarget.f81037j, Boolean.valueOf(shareTarget.f81038k)});
    }

    /* renamed from: d */
    public final synchronized void mo39247d() {
        ArrayList arrayList = new ArrayList(this.f71637c.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m59443a(((Long) arrayList.get(i)).longValue());
        }
    }

    /* renamed from: a */
    public static boolean m59444a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        return m59446c(shareTarget) == m59446c(shareTarget2);
    }

    /* renamed from: c */
    public final synchronized void mo39246c() {
        m59445b(cfov.f185185a.mo6606a().mo82279O());
    }

    /* renamed from: a */
    public final synchronized List mo39240a() {
        return bngx.m109368a(this.f71637c.values());
    }

    /* renamed from: a */
    public final synchronized void mo39241a(akcz akcz, String str) {
        long c = m59446c(akcz.f71633c);
        if (((akcz) this.f71637c.get(Long.valueOf(c))) == akcz) {
            m59443a(c);
            akfr akfr = this.f71636b;
            if (akfr != null) {
                srn srn = ajvp.f71371a;
                akgy akgy = akfr.f71826a;
                akgy.mo39385a(new akfs(akgy, str));
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo39244b() {
        m59445b(cfov.f185185a.mo6606a().mo82278N());
    }

    /* renamed from: b */
    public final synchronized boolean mo39245b(ShareTarget shareTarget) {
        akcz akcz;
        akcz = (akcz) this.f71637c.get(Long.valueOf(m59446c(shareTarget)));
        return akcz == null || akcz.f71634d != null;
    }

    /* renamed from: a */
    public final synchronized void mo39242a(ShareTarget shareTarget) {
        m59443a(m59446c(shareTarget));
    }

    /* renamed from: a */
    public final synchronized void mo39243a(ShareTarget shareTarget, String str, byte[] bArr) {
        long c = m59446c(shareTarget);
        Map map = this.f71637c;
        Long valueOf = Long.valueOf(c);
        akcz akcz = (akcz) map.get(valueOf);
        if (akcz != null) {
            akcz.mo39239a();
        }
        this.f71637c.put(valueOf, new akcz(str, bArr, shareTarget));
        srn srn = ajvp.f71371a;
    }
}
