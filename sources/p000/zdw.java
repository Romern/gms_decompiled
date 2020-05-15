package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: zdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdw implements zgg {

    /* renamed from: a */
    public static final srn f54981a = zvt.m46581a();

    /* renamed from: b */
    public static final bmyv f54982b = bmyx.m108643a(",").mo66917a().mo66924c("=");

    /* renamed from: c */
    private static final yuw f54983c = yuq.m44881a(zdu.f54979a, zdv.f54980a);

    /* renamed from: d */
    private final caae f54984d;

    /* renamed from: e */
    private final zrn f54985e;

    /* renamed from: f */
    private final ConcurrentMap f54986f = new ConcurrentHashMap();

    /* renamed from: g */
    private final int f54987g;

    public zdw(caae caae, zrn zrn, int i) {
        this.f54984d = caae;
        this.f54985e = zrn;
        this.f54987g = i;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        long j;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            caae caae = cadn.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            String str = caah.f172336b;
            long j2 = cadn.f172702b;
            bnhe bnhe = (bnhe) f54983c.mo30787a();
            if (bnhe.containsKey(str)) {
                j = ((Long) bnhe.get(str)).longValue();
            } else {
                j = cdzs.f182101a.mo6606a().mo78629c();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            if (nanos != 0) {
                synchronized (this.f54986f) {
                    Long l = (Long) this.f54986f.get(str);
                    if (l != null) {
                        if (j2 - l.longValue() < nanos) {
                        }
                    }
                    this.f54986f.put(str, Long.valueOf(j2));
                }
            }
            zrn zrn = this.f54985e;
            int i = this.f54987g;
            synchronized (zrn.f55753g) {
                caah a = yyk.m45008a(cadn);
                if (cdyu.f181962a.mo6606a().mo78501e()) {
                    if (((bnic) yvm.f54688a.mo30787a()).contains(a.f172336b)) {
                        i = 1;
                    }
                }
                if (i - 1 == 0) {
                    zrn.f55747a.add(cadn);
                } else if (a.equals(bzzn.f172101an)) {
                    if (zrn.f55749c == null) {
                        zrn.mo31407b(cadn);
                    } else if (zrn.f55748b != null && zrn.m46061c(cadn) - zrn.m46061c(zrn.f55748b) >= ((int) cdzd.m135488q())) {
                        if (!zrn.mo31405a()) {
                            yyk.m45007a(cadn, bzzj.f172029au);
                            cdzd.m135488q();
                            zrn.mo31407b(cadn);
                        } else {
                            zrn.mo31407b(zrn.f55749c);
                        }
                    }
                    zrn.f55749c = cadn;
                } else {
                    zrn.mo31403a(cadn);
                }
            }
        }
    }

    public final String toString() {
        String b = yyd.m44990b(this.f54984d);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 19);
        sb.append("RecordingListener{");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
