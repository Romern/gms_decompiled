package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bewj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewj {

    /* renamed from: a */
    public int f112811a;

    /* renamed from: b */
    public int f112812b;

    /* renamed from: c */
    public int f112813c;

    /* renamed from: d */
    public long f112814d = -1;

    /* renamed from: e */
    public float[][] f112815e;

    /* renamed from: f */
    public boolean f112816f;

    /* renamed from: g */
    public long f112817g;

    /* renamed from: h */
    public bfnl f112818h;

    /* renamed from: i */
    public final List f112819i = new ArrayList();

    /* renamed from: j */
    public final List f112820j = new ArrayList();

    public bewj(bfnl bfnl) {
        this.f112818h = bfnl;
        try {
            bsax a = bfnl.mo61993a();
            if (a.mo70135h(3)) {
                boolean z = true;
                this.f112817g = a.mo70124c(1);
                int b = a.mo70114b(2);
                this.f112812b = b;
                int i = (b + 1) % 240;
                this.f112811a = i;
                if (i != 0 && !a.mo70113a(3)) {
                    z = false;
                }
                this.f112816f = z;
                int b2 = a.mo70114b(4);
                StringBuilder sb = new StringBuilder(51);
                sb.append("Loading ");
                sb.append(b2);
                sb.append(" dimensional features from disk.");
                sb.toString();
                int j = a.mo70138j(5) / b2;
                this.f112815e = new float[240][];
                for (int i2 = 0; i2 < j; i2++) {
                    this.f112815e[i2] = new float[b2];
                    for (int i3 = 0; i3 < b2; i3++) {
                        this.f112815e[i2][i3] = a.mo70128e(5, (i2 * b2) + i3);
                    }
                }
                if (a.mo70135h(6)) {
                    int j2 = a.mo70138j(6) / 2;
                    for (int i4 = 0; i4 < j2; i4++) {
                        int i5 = i4 + i4;
                        this.f112819i.add(new bfne(Long.valueOf(a.mo70127d(6, i5)), Long.valueOf(a.mo70127d(6, i5 + 1))));
                    }
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("Loaded ");
                    sb2.append(j2);
                    sb2.append(" missingDataWindows from disk.");
                    sb2.toString();
                }
                if (a.mo70135h(7)) {
                    int j3 = a.mo70138j(7) / 2;
                    for (int i6 = 0; i6 < j3; i6++) {
                        int i7 = i6 + i6;
                        this.f112820j.add(new bfne(Long.valueOf(a.mo70127d(7, i7)), Long.valueOf(a.mo70127d(7, i7 + 1))));
                    }
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("Loaded ");
                    sb3.append(j3);
                    sb3.append(" previouslyDetectedSleep from disk.");
                    sb3.toString();
                }
                this.f112813c = 0;
                StringBuilder sb4 = new StringBuilder(38);
                sb4.append("Loaded ");
                sb4.append(j);
                sb4.append(" features from disk.");
                sb4.toString();
                return;
            }
            m95985e();
        } catch (IOException e) {
            m95985e();
        }
    }

    /* renamed from: a */
    public static final int m95984a(bewp[] bewpArr) {
        int i = 0;
        for (bewp bewp : bewpArr) {
            int i2 = bewp.f112842b;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: e */
    private final void m95985e() {
        this.f112811a = 0;
        this.f112812b = 0;
        this.f112816f = false;
        this.f112815e = new float[240][];
        this.f112817g = -1;
        this.f112813c = 0;
    }

    /* renamed from: a */
    public final int mo61193a() {
        if (!this.f112816f) {
            return this.f112811a;
        }
        return 239;
    }

    /* renamed from: b */
    public final List mo61195b() {
        Iterator it = this.f112819i.iterator();
        while (it.hasNext()) {
            bfne bfne = (bfne) it.next();
            String valueOf = String.valueOf(bfne.f114467a);
            String valueOf2 = String.valueOf(bfne.f114468b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
            sb.append("Missing data: ");
            sb.append(valueOf);
            sb.append(" - ");
            sb.append(valueOf2);
            sb.toString();
            if (((Long) bfne.f114468b).longValue() < System.currentTimeMillis() - 86400000) {
                it.remove();
            }
        }
        return this.f112819i;
    }

    /* renamed from: c */
    public final void mo61196c() {
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        Iterator it = this.f112820j.iterator();
        while (it.hasNext()) {
            if (((Long) ((bfne) it.next()).f114468b).longValue() < currentTimeMillis) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final long mo61197d() {
        if (this.f112814d == -1 || !cfam.m138538h()) {
            return System.currentTimeMillis();
        }
        return this.f112814d;
    }

    /* renamed from: a */
    public final void mo61194a(long j) {
        int i;
        int i2;
        bsax bsax = new bsax(bgox.f117117cd);
        bsax.mo70117b(1, j);
        bsax.mo70134g(2, this.f112812b);
        bsax.mo70119b(3, this.f112816f);
        float[][] fArr = this.f112815e;
        if (cfam.m138538h()) {
            i = this.f112811a;
        } else {
            i = 0;
        }
        int length = fArr[i].length;
        bsax.mo70134g(4, length);
        this.f112813c = 0;
        if (this.f112816f) {
            i2 = this.f112815e.length;
        } else {
            i2 = this.f112811a + 1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                bsax.mo70104a(5, this.f112815e[i3][i4]);
            }
        }
        if (!mo61195b().isEmpty()) {
            List list = this.f112819i;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                bfne bfne = (bfne) list.get(i5);
                bsax.mo70106a(6, ((Long) bfne.f114467a).longValue());
                bsax.mo70106a(6, ((Long) bfne.f114468b).longValue());
            }
        }
        mo61196c();
        if (!this.f112820j.isEmpty()) {
            List list2 = this.f112820j;
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                bfne bfne2 = (bfne) list2.get(i6);
                bsax.mo70106a(7, ((Long) bfne2.f114467a).longValue());
                bsax.mo70106a(7, ((Long) bfne2.f114468b).longValue());
            }
        }
        int size3 = this.f112819i.size();
        int size4 = this.f112820j.size();
        StringBuilder sb = new StringBuilder(102);
        sb.append("Saving ");
        sb.append(i2);
        sb.append(" features, ");
        sb.append(size3);
        sb.append(" missing windows, ");
        sb.append(size4);
        sb.append(" previous sleep segments to disk.");
        sb.toString();
        try {
            this.f112818h.mo61994a(bsax);
        } catch (IOException e) {
        }
    }
}
