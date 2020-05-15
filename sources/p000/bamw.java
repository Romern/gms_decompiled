package p000;

import android.util.Pair;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: bamw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamw implements bamq {

    /* renamed from: a */
    private final bamx f101304a;

    /* renamed from: b */
    private final bams f101305b;

    /* renamed from: c */
    private final bxtx f101306c;

    /* renamed from: d */
    private final byte[] f101307d;

    /* renamed from: e */
    private final babr f101308e;

    /* renamed from: f */
    private boolean f101309f;

    /* renamed from: g */
    private final bamj f101310g;

    public bamw(bxtx bxtx, bamx bamx, bams bams, babr babr, bamj bamj) {
        this.f101304a = bamx;
        this.f101305b = bams;
        this.f101306c = bxtx;
        this.f101307d = bamx.m87175a(bxtx).mo73780k();
        this.f101308e = babr;
        this.f101310g = bamj;
        synchronized (bamx.f101317b) {
            bmxy.m108601b(!bamx.f101318c, "Factory is closed");
            bmxy.m108589a(!bamx.f101316a.containsKey(bxtx), "Storage already created");
            bamx.f101316a.put(bxtx, this);
        }
    }

    /* renamed from: a */
    private final banv m87157a(String str, Exception exc) {
        if (!this.f101308e.mo32684f()) {
            this.f101305b.mo55784a(exc);
        } else if (bams.m87144a((Throwable) exc)) {
            this.f101310g.mo55758a();
        }
        return new banv(str, exc);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [banx, bana], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    private final void m87161b(banx r2) {
        bane bane;
        boolean z;
        if (r2 instanceof banb) {
            bane = ((banb) r2).mo55791a();
        } else {
            bane = r2.mo55791a();
        }
        if (bane == mo55766a()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Using a transaction from a wrong namespace");
    }

    public final void close() {
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bamx bamx = this.f101304a;
        bxtx bxtx = this.f101306c;
        synchronized (bamx.f101317b) {
            bamx.f101316a.remove(bxtx);
        }
        this.f101309f = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private final void m87158a(bany bany) {
        boolean z = true;
        bmxy.m108589a(true, (Object) "Transaction is not a write transaction for LevelDB storage");
        if (((bamz) bany).f101333f != mo55766a()) {
            z = false;
        }
        bmxy.m108589a(z, "Using a transaction from a wrong namespace");
    }

    /* renamed from: b */
    private final byte[] m87162b(byte[] bArr) {
        return Arrays.copyOfRange(bArr, this.f101306c.mo73744a(), bArr.length);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo55775b(banx banx, bxtx bxtx) {
        LevelDb.Iterator it;
        if (this.f101308e.mo32671C()) {
            ArrayList arrayList = new ArrayList();
            mo55769a(banx, bxtx, new bamu(arrayList));
            return arrayList;
        }
        m87161b(banx);
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bxtx);
        byte[] bArr = this.f101307d;
        ArrayList arrayList2 = new ArrayList();
        try {
            it = this.f101305b.mo55788e().iterator();
            Comparator comparator = bqcv.f140491b;
            it.seek(m87159a(bxtx));
            while (it.isValid() && comparator.compare(it.key(), bArr) < 0) {
                arrayList2.add(Pair.create(bxtx.m123261a(m87162b(it.key())), bxtx.m123261a(it.value())));
                it.next();
            }
            if (it == null) {
                return arrayList2;
            }
            it.close();
            return arrayList2;
        } catch (Exception e) {
            throw m87157a("Read range error", e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final byte[] m87159a(bxtx bxtx) {
        byte[] bArr = new byte[(this.f101306c.mo73744a() + bxtx.mo73744a())];
        this.f101306c.mo73771a(bArr, 0);
        bxtx.mo73771a(bArr, this.f101306c.mo73744a());
        return bArr;
    }

    /* renamed from: a */
    private final byte[] m87160a(byte[] bArr) {
        int a = this.f101306c.mo73744a();
        int length = bArr.length;
        byte[] bArr2 = new byte[(a + length)];
        this.f101306c.mo73771a(bArr2, 0);
        System.arraycopy(bArr, 0, bArr2, this.f101306c.mo73744a(), length);
        return bArr2;
    }

    /* renamed from: a */
    public final bane mo55766a() {
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        return this.f101304a.mo55782b();
    }

    /* renamed from: a */
    public final bxtx mo55767a(banx banx, bxtx bxtx) {
        byte[] a = mo55774a(banx, bxtx.mo73780k());
        if (a != null) {
            return bxtx.m123261a(a);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo55768a(banx banx, byte[] bArr, byte[] bArr2) {
        ArrayList arrayList;
        LevelDb.Iterator it;
        if (this.f101308e.mo32671C()) {
            arrayList = new ArrayList();
            bamv bamv = new bamv(arrayList);
            m87161b(banx);
            bmxy.m108601b(!this.f101309f, "Storage is closed");
            bmxy.m108581a(bArr);
            byte[] a = bArr2 == null ? this.f101307d : m87160a(bArr2);
            LevelDb.Iterator it2 = this.f101305b.mo55788e().iterator();
            try {
                Comparator comparator = bqcv.f140491b;
                it2.seek(m87160a(bArr));
                while (true) {
                    if (!it2.isValid() || comparator.compare(it2.key(), a) >= 0) {
                        if (it2 != null) {
                            it2.close();
                            return arrayList;
                        }
                    } else if (bamv.mo55759a(m87162b(it2.key()), it2.value())) {
                        it2.next();
                    } else if (it2 != null) {
                        it2.close();
                        return arrayList;
                    }
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            m87161b(banx);
            bmxy.m108601b(!this.f101309f, "Storage is closed");
            bmxy.m108581a(bArr);
            byte[] a2 = bArr2 == null ? this.f101307d : m87160a(bArr2);
            arrayList = new ArrayList();
            try {
                it = this.f101305b.mo55788e().iterator();
                Comparator comparator2 = bqcv.f140491b;
                it.seek(m87160a(bArr));
                while (it.isValid() && comparator2.compare(it.key(), a2) < 0) {
                    arrayList.add(Pair.create(m87162b(it.key()), it.value()));
                    it.next();
                }
                if (it != null) {
                    it.close();
                }
            } catch (Exception e) {
                throw m87157a("Read range error", e);
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        return arrayList;
        throw th;
        throw th;
    }

    /* renamed from: b */
    public final void mo55776b(bany bany, bxtx bxtx, bxtx bxtx2) {
        mo55777b(bany, bxtx.mo73780k(), bxtx2 != null ? bxtx2.mo73780k() : null);
    }

    /* renamed from: b */
    public final void mo55777b(bany bany, byte[] bArr, byte[] bArr2) {
        LevelDb.Iterator it;
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bArr);
        byte[] a = m87160a(bArr);
        byte[] a2 = bArr2 == null ? this.f101307d : m87160a(bArr2);
        m87158a(bany);
        band band = (band) bany;
        bmxy.m108601b(!band.f101328a, "Transaction is closed");
        bmxy.m108601b(!band.f101339k, "Trying to modify after setSuccessful()");
        synchronized (band.f101335g) {
            try {
                it = ((band) bany).f101340l.f101343c.mo55788e().iterator();
                it.seek(a);
                while (it.isValid() && ((band) bany).f101337i.compare(it.key(), a2) < 0) {
                    ((band) bany).f101336h.delete(it.key());
                    ((band) bany).f101338j.remove(it.key());
                    it.next();
                }
                if (((band) bany).f101337i.compare(a, a2) < 0) {
                    for (byte[] bArr3 : ((band) bany).f101338j.subSet(a, true, a2, false)) {
                        ((band) bany).f101336h.delete(bArr3);
                        ((band) bany).f101338j.remove(bArr3);
                    }
                }
                if (it != null) {
                    it.close();
                }
            } catch (Exception e) {
                ((achw) ((band) bany).f101340l.f101342b.mo16713a()).mo25418e("Delete range error", new Object[0]);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final void mo55769a(banx banx, bxtx bxtx, bamp bamp) {
        m87161b(banx);
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bxtx);
        byte[] bArr = this.f101307d;
        LevelDb.Iterator it = this.f101305b.mo55788e().iterator();
        try {
            Comparator comparator = bqcv.f140491b;
            it.seek(m87159a(bxtx));
            while (it.isValid() && comparator.compare(it.key(), bArr) < 0) {
                if (bamp.mo55759a(bxtx.m123261a(m87162b(it.key())), bxtx.m123261a(it.value()))) {
                    it.next();
                } else if (it != null) {
                    it.close();
                    return;
                } else {
                    return;
                }
            }
            if (it != null) {
                it.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo55770a(bany bany, bxtx bxtx) {
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bxtx);
        m87158a(bany);
        byte[] a = m87159a(bxtx);
        band band = (band) bany;
        bmxy.m108601b(!band.f101328a, "Transaction is closed");
        bmxy.m108601b(!band.f101339k, "Trying to modify after setSuccessful()");
        synchronized (band.f101335g) {
            ((band) bany).f101336h.delete(a);
            ((band) bany).f101338j.remove(a);
        }
    }

    /* renamed from: a */
    public final void mo55771a(bany bany, bxtx bxtx, bxtx bxtx2) {
        mo55772a(bany, bxtx.mo73780k(), bxtx2.mo73780k());
    }

    /* renamed from: a */
    public final void mo55772a(bany bany, byte[] bArr, byte[] bArr2) {
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bArr);
        bmxy.m108581a(bArr2);
        m87158a(bany);
        byte[] a = m87160a(bArr);
        band band = (band) bany;
        bmxy.m108601b(!band.f101328a, "Transaction is closed");
        bmxy.m108601b(!band.f101339k, "Trying to modify after setSuccessful()");
        synchronized (band.f101335g) {
            ((band) bany).f101336h.put(a, bArr2);
            ((band) bany).f101338j.add(a);
        }
    }

    /* renamed from: a */
    public final boolean mo55773a(banx banx) {
        LevelDb.Iterator it;
        m87161b(banx);
        boolean z = true;
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        try {
            it = this.f101305b.mo55788e().iterator();
            it.seek(this.f101306c.mo73780k());
            if (it.isValid() && bqcv.f140491b.compare(it.key(), this.f101307d) < 0) {
                z = false;
            }
            if (it != null) {
                it.close();
            }
            return z;
        } catch (Exception e) {
            throw m87157a("Empty status resolution error", e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final byte[] mo55774a(banx banx, byte[] bArr) {
        m87161b(banx);
        bmxy.m108601b(!this.f101309f, "Storage is closed");
        bmxy.m108581a(bArr);
        try {
            return this.f101305b.mo55788e().get(m87160a(bArr));
        } catch (LevelDbException e) {
            String valueOf = String.valueOf(Arrays.toString(bArr));
            throw m87157a(valueOf.length() == 0 ? new String("Error getting value for key ") : "Error getting value for key ".concat(valueOf), e);
        }
    }
}
