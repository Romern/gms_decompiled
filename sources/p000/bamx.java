package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bamx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamx implements bamr {

    /* renamed from: d */
    private static final ByteString f101311d = ByteString.m123261a(new byte[]{47});

    /* renamed from: e */
    private static final ByteString f101312e = ByteString.m123261a(new byte[]{48});

    /* renamed from: f */
    private static final ByteString f101313f = ByteString.m123261a(new byte[]{58});

    /* renamed from: g */
    private static final ByteString f101314g = ByteString.m123261a(new byte[]{59});

    /* renamed from: h */
    private static final banl f101315h;

    /* renamed from: a */
    public final Map f101316a = new HashMap();

    /* renamed from: b */
    public final ByteString f101317b;

    /* renamed from: c */
    public volatile boolean f101318c;

    /* renamed from: i */
    private final cayo f101319i;

    /* renamed from: j */
    private final bams f101320j;

    /* renamed from: k */
    private final bane f101321k;

    /* renamed from: l */
    private final bamx f101322l;

    /* renamed from: m */
    private final Map f101323m = new HashMap();

    /* renamed from: n */
    private final babr f101324n;

    /* renamed from: o */
    private final cayo f101325o;

    /* renamed from: p */
    private final bamj f101326p;

    static {
        bank a = banl.m87214a();
        a.mo55804a((byte) 47);
        a.mo55804a((byte) 48);
        a.mo55804a((byte) 58);
        a.mo55804a((byte) 59);
        f101315h = a.mo55803a();
    }

    public bamx(bamx bamx, cayo cayo, bams bams, ByteString bxtx, ByteString bxtx2, bane bane, babr babr, cayo cayo2, bamj bamj) {
        this.f101319i = cayo;
        this.f101320j = bams;
        this.f101322l = bamx;
        ByteString a = bxtx.mo73770a(f101315h.mo55805a(bxtx2)).mo73770a(f101311d);
        this.f101317b = a;
        this.f101321k = bane;
        this.f101324n = babr;
        this.f101325o = cayo2;
        this.f101326p = bamj;
        if (bamx != null) {
            synchronized (bamx.f101317b) {
                bmxy.m108601b(!bamx.f101318c, "Factory is closed");
                bmxy.m108589a(!bamx.f101323m.containsKey(a), "Namespace already created");
                bamx.f101323m.put(a, this);
            }
        }
    }

    /* renamed from: a */
    static ByteString m87175a(ByteString bxtx) {
        boolean z;
        if (bxtx.mo73743a(bxtx.mo73744a() - 1) == 58) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        return bxtx.mo73754a(0, bxtx.mo73744a() - 1).mo73770a(f101314g);
    }

    /* renamed from: c */
    private final void m87177c() {
        if (!this.f101316a.isEmpty()) {
            m87176a(this.f101319i, this.f101316a.keySet(), "Close failed due to opened storages:");
            throw new IllegalStateException("Not every KeyValueStorage created with this factory is closed");
        } else if (!this.f101323m.isEmpty()) {
            m87176a(this.f101319i, this.f101323m.keySet(), "Close failed due to opened factories:");
            throw new IllegalStateException("Not every KeyValueStorageFactory created with this factory is closed");
        }
    }

    /* renamed from: b */
    public final bamr mo55781b(String str) {
        return new bamx(this, this.f101319i, this.f101320j, this.f101317b, ByteString.m123258a(str), new bane(this.f101319i, this.f101320j, this.f101324n, this.f101325o, this.f101326p), this.f101324n, this.f101325o, this.f101326p);
    }

    public final void close() {
        boolean z;
        synchronized (this.f101317b) {
            bmxy.m108601b(!this.f101318c, "Factory is closed");
            m87177c();
            bamx bamx = this.f101322l;
            if (bamx != null) {
                ByteString bxtx = this.f101317b;
                synchronized (bamx.f101317b) {
                    bamx.f101323m.remove(bxtx);
                }
            } else {
                bams bams = this.f101320j;
                synchronized (bams.f101291e) {
                    if (bams.f101294h != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108600b(z);
                    bams.f101294h = null;
                }
            }
            this.f101318c = true;
        }
    }

    /* renamed from: a */
    private static void m87176a(cayo cayo, Set set, String str) {
        if (((achw) cayo.mo16713a()).mo19637a(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                ByteString bxtx = (ByteString) it.next();
                if (i != 0) {
                    if (i >= 10) {
                        break;
                    }
                    sb.append(", ");
                } else {
                    sb.append(' ');
                }
                sb.append(bxtx.mo73773b(bmwy.f131158c));
                i++;
            }
            if (i != set.size()) {
                sb.append("...");
            }
            ((achw) cayo.mo16713a()).logVerbose(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    public final bane mo55782b() {
        bmxy.m108601b(!this.f101318c, "Factory is closed");
        return this.f101321k;
    }

    /* renamed from: a */
    public final bamq mo55779a(String str) {
        return new bamw(this.f101317b.mo73770a(f101315h.mo55805a(ByteString.m123258a(str))).mo73770a(f101313f), this, this.f101320j, this.f101324n, this.f101326p);
    }

    /* renamed from: a */
    public final void mo55780a() {
        synchronized (this.f101317b) {
            boolean z = true;
            bmxy.m108601b(!this.f101318c, "Factory is closed");
            m87177c();
            try {
                LevelDb e = this.f101320j.mo55788e();
                byte[] k = this.f101317b.getKey();
                ByteString bxtx = this.f101317b;
                if (bxtx.mo73743a(bxtx.mo73744a() - 1) != 47) {
                    z = false;
                }
                bmxy.m108588a(z);
                e.deleteRange(k, bxtx.mo73754a(0, bxtx.mo73744a() - 1).mo73770a(f101312e).getKey());
            } catch (LevelDbException e2) {
                if (!this.f101324n.mo32684f()) {
                    this.f101320j.mo55784a((Exception) e2);
                } else if (bams.m87144a((Throwable) e2)) {
                    this.f101326p.mo55758a();
                }
                throw new banv("Error removing data from database", e2);
            }
        }
    }
}
