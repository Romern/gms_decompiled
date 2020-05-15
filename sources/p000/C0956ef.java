package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0956ef implements C0931dh, C0930dg {

    /* renamed from: h */
    static final TreeMap f14810h = new TreeMap();

    /* renamed from: a */
    public final long[] f14811a;

    /* renamed from: b */
    final double[] f14812b;

    /* renamed from: c */
    final String[] f14813c;

    /* renamed from: d */
    public final byte[][] f14814d;

    /* renamed from: e */
    public final int[] f14815e;

    /* renamed from: f */
    final int f14816f;

    /* renamed from: g */
    int f14817g;

    /* renamed from: i */
    private volatile String f14818i;

    private C0956ef(int i) {
        this.f14816f = i;
        int i2 = i + 1;
        this.f14815e = new int[i2];
        this.f14811a = new long[i2];
        this.f14812b = new double[i2];
        this.f14813c = new String[i2];
        this.f14814d = new byte[i2][];
    }

    /* renamed from: a */
    public static C0956ef m10280a(String str, int i) {
        synchronized (f14810h) {
            Map.Entry ceilingEntry = f14810h.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f14810h.remove(ceilingEntry.getKey());
                C0956ef efVar = (C0956ef) ceilingEntry.getValue();
                efVar.mo10065b(str, i);
                return efVar;
            }
            C0956ef efVar2 = new C0956ef(i);
            efVar2.mo10065b(str, i);
            return efVar2;
        }
    }

    /* renamed from: a */
    public final String mo8483a() {
        return this.f14818i;
    }

    /* renamed from: a */
    public final void mo8918a(int i, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo8920a(int i, byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo10064b() {
        synchronized (f14810h) {
            f14810h.put(Integer.valueOf(this.f14816f), this);
            if (f14810h.size() > 15) {
                int size = f14810h.size() - 10;
                Iterator it = f14810h.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10065b(String str, int i) {
        this.f14818i = str;
        this.f14817g = i;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final void mo8917a(int i) {
        this.f14815e[i] = 1;
    }

    /* renamed from: a */
    public final void mo8919a(int i, String str) {
        this.f14815e[i] = 4;
        this.f14813c[i] = str;
    }

    /* renamed from: a */
    public final void mo8484a(C0930dg dgVar) {
        for (int i = 1; i <= this.f14817g; i++) {
            int i2 = this.f14815e[i];
            if (i2 == 1) {
                dgVar.mo8917a(i);
            } else if (i2 == 2) {
                dgVar.mo8918a(i, this.f14811a[i]);
            } else if (i2 == 3) {
                ((C0938do) dgVar).f13665a.bindDouble(i, this.f14812b[i]);
            } else if (i2 == 4) {
                dgVar.mo8919a(i, this.f14813c[i]);
            } else if (i2 == 5) {
                dgVar.mo8920a(i, this.f14814d[i]);
            }
        }
    }
}
