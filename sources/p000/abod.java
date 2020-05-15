package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: abod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abod {

    /* renamed from: f */
    private static final bmyx f57773f = bmyx.m108640a(',').mo66920b().mo66917a();

    /* renamed from: a */
    public Map f57774a = new HashMap();

    /* renamed from: b */
    public Map f57775b = new HashMap();

    /* renamed from: c */
    public SparseIntArray f57776c = new SparseIntArray();

    /* renamed from: d */
    public final Map f57777d = new HashMap();

    /* renamed from: e */
    public final Object f57778e = new Object();

    /* renamed from: g */
    private Map f57779g = new HashMap();

    /* renamed from: h */
    private SparseIntArray f57780h = new SparseIntArray();

    /* renamed from: i */
    private final Set f57781i = new HashSet();

    /* renamed from: j */
    private long f57782j = cekz.m137119b();

    public abod() {
        mo32233b();
    }

    /* renamed from: a */
    public static abod m47984a() {
        return aboc.f57772a;
    }

    /* renamed from: b */
    public final int mo32232b(String str, int i) {
        return Arrays.hashCode(new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: c */
    public final boolean mo32234c() {
        return ((long) abmm.m47908a()) >= this.f57782j;
    }

    /* renamed from: a */
    public final boolean mo32229a(int i) {
        return this.f57776c.get(i, 0) >= this.f57780h.get(i, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final boolean mo32230a(String str) {
        int i;
        Integer num;
        String str2 = (String) this.f57774a.get(str);
        if (str2 != null) {
            Integer num2 = (Integer) this.f57779g.get(str2);
            if (num2 == null) {
                eoa.m10828c("Herrevad", "sourcePackageBucketId %s mapped to a null limit. This shouldn't happen.", str2);
                i = -1;
            } else {
                i = num2.intValue();
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        String str3 = (String) this.f57774a.get(str);
        return ((str3 == null || (num = (Integer) this.f57775b.get(str3)) == null) ? 0 : num.intValue()) >= i;
    }

    /* renamed from: b */
    public final void mo32233b() {
        synchronized (this.f57778e) {
            this.f57782j = cekz.m137119b();
            bxwc<caeo> bxwc = cekz.f182874a.mo6606a().mo79260k().f172848a;
            this.f57779g = new HashMap();
            this.f57774a = new HashMap();
            HashMap hashMap = new HashMap();
            for (caeo caeo : bxwc) {
                ArrayList arrayList = new ArrayList(caeo.f172843a);
                Collections.sort(arrayList);
                String join = TextUtils.join(",", arrayList);
                this.f57779g.put(join, Integer.valueOf(caeo.f172844b));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f57774a.put((String) it.next(), join);
                }
                Integer num = (Integer) this.f57775b.get(join);
                if (num == null) {
                    hashMap.put(join, 0);
                } else {
                    hashMap.put(join, num);
                }
            }
            this.f57775b = hashMap;
            bxwc<caem> bxwc2 = cekz.f182874a.mo6606a().mo79257h().f172840a;
            this.f57780h = new SparseIntArray();
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (caem caem : bxwc2) {
                int i = caem.f172835a;
                this.f57780h.put(i, caem.f172836b);
                sparseIntArray.put(i, this.f57776c.get(i, 0));
            }
            this.f57776c = sparseIntArray;
            String i2 = cekz.f182874a.mo6606a().mo79258i();
            synchronized (this.f57778e) {
                this.f57781i.clear();
                for (String str : f57773f.mo66918a((CharSequence) i2)) {
                    this.f57781i.add(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo32231a(String str, int i) {
        Long l;
        if (this.f57781i.contains(str) || (l = (Long) this.f57777d.get(Integer.valueOf(mo32232b(str, i)))) == null || SystemClock.elapsedRealtime() >= l.longValue() + cekz.f182874a.mo6606a().mo79259j()) {
            return false;
        }
        return true;
    }
}
