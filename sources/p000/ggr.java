package p000;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.Closeable;
import java.io.File;
import java.util.HashMap;

/* renamed from: ggr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggr implements Closeable {

    /* renamed from: a */
    private final Context f18147a;

    /* renamed from: b */
    private final ggi f18148b;

    /* renamed from: c */
    private LevelDb f18149c;

    public ggr(Context context) {
        this.f18147a = context;
        this.f18148b = new ggi(context);
    }

    /* renamed from: b */
    private static boolean m13115b(ghk ghk) {
        bssp bssp;
        bssn bssn = ghk.f18256b;
        if (bssn == null) {
            bssn = bssn.f146882h;
        }
        bsst bsst = bssn.f146887d;
        if (bsst == null) {
            bsst = bsst.f146912c;
        }
        if (bsst.f146914a == 1) {
            bssp = (bssp) bsst.f146915b;
        } else {
            bssp = bssp.f146893l;
        }
        if ((bssp.f146895a & 16) == 0) {
            return true;
        }
        bssn bssn2 = ghk.f18256b;
        if (bssn2 == null) {
            bssn2 = bssn.f146882h;
        }
        if ((bssn2.f146884a & 16) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        return;
     */
    /* renamed from: d */
    private final synchronized void m13116d() {
        LevelDb levelDb;
        if (this.f18149c == null) {
            File file = new File(this.f18147a.getFilesDir(), "audit_db");
            if (cbws.f178484a.mo6606a().mo75554b()) {
                try {
                    LevelDb.Options options = new LevelDb.Options();
                    options.mDeleteIfCorrupted = false;
                    levelDb = LevelDb.open(file, options);
                } catch (LevelDbException e) {
                    this.f18148b.mo11792a(2);
                    try {
                        LevelDb.destroy(file);
                    } catch (LevelDbException e2) {
                    }
                    levelDb = LevelDb.open(file);
                }
                this.f18149c = levelDb;
                return;
            }
            this.f18149c = LevelDb.open(file);
        }
    }

    /* renamed from: a */
    public final synchronized ghk mo11803a() {
        m13116d();
        LevelDb.Iterator it = this.f18149c.iterator();
        try {
            it.seekToFirst();
            if (it.isValid()) {
                do {
                    ghk ghk = (ghk) GeneratedMessageLite.m124016a(ghk.f18253f, it.value(), bxus.m123744c());
                    if (m13115b(ghk)) {
                        this.f18149c.delete(it.key());
                        it.next();
                        if (cbws.f178484a.mo6606a().mo75555c()) {
                            this.f18148b.mo11792a(4);
                        }
                    } else {
                        it.close();
                        return ghk;
                    }
                } while (it.isValid());
            }
        } catch (bxwf e) {
            this.f18149c.delete(it.key());
            it.next();
            this.f18148b.mo11792a(3);
        } catch (Throwable th) {
            it.close();
            throw th;
        }
        it.close();
        return null;
    }

    /* renamed from: c */
    public final synchronized ghd[] mo11807c() {
        HashMap hashMap;
        bssp bssp;
        bxvd bxvd;
        m13116d();
        hashMap = new HashMap();
        LevelDb.Iterator it = this.f18149c.iterator();
        try {
            it.seekToFirst();
            while (it.isValid()) {
                try {
                    ghk ghk = (ghk) GeneratedMessageLite.m124016a(ghk.f18253f, it.value(), bxus.m123744c());
                    if (!m13115b(ghk)) {
                        bssn bssn = ghk.f18256b;
                        if (bssn == null) {
                            bssn = bssn.f146882h;
                        }
                        bsst bsst = bssn.f146887d;
                        if (bsst == null) {
                            bsst = bsst.f146912c;
                        }
                        if (bsst.f146914a == 1) {
                            bssp = (bssp) bsst.f146915b;
                        } else {
                            bssp = bssp.f146893l;
                        }
                        String str = bssp.f146900f;
                        int i = ghk.f18259e;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append(i);
                        sb.append("-");
                        sb.append(str);
                        String sb2 = sb.toString();
                        int i2 = ghk.f164961ai;
                        if (i2 == -1) {
                            i2 = bxxm.f165037a.mo74228a(ghk).mo74223b(ghk);
                            ghk.f164961ai = i2;
                        }
                        if (hashMap.containsKey(sb2)) {
                            ghd ghd = (ghd) hashMap.get(sb2);
                            bxvd = (bxvd) ghd.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) ghd);
                        } else {
                            bxvd da = ghd.f18222f.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ghd ghd2 = (ghd) da.f164949b;
                            str.getClass();
                            int i3 = ghd2.f18224a | 1;
                            ghd2.f18224a = i3;
                            ghd2.f18225b = str;
                            ghd2.f18224a = i3 | 8;
                            ghd2.f18228e = i;
                            bxvd = da;
                        }
                        int i4 = ((ghd) bxvd.f164949b).f18226c + 1;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ghd ghd3 = (ghd) bxvd.f164949b;
                        ghd ghd4 = ghd.f18222f;
                        int i5 = ghd3.f18224a | 2;
                        ghd3.f18224a = i5;
                        ghd3.f18226c = i4;
                        ghd3.f18224a = i5 | 4;
                        ghd3.f18227d += i2;
                        hashMap.put(sb2, (ghd) bxvd.mo74062i());
                        it.next();
                    } else {
                        it.next();
                    }
                } catch (bxwf e) {
                }
            }
        } catch (NullPointerException e2) {
        } catch (Throwable th) {
            it.close();
            throw th;
        }
        it.close();
        return (ghd[]) hashMap.values().toArray(new ghd[hashMap.size()]);
    }

    public final synchronized void close() {
        LevelDb levelDb = this.f18149c;
        if (levelDb != null) {
            levelDb.close();
            this.f18149c = null;
        }
    }

    /* renamed from: b */
    public final synchronized int mo11806b() {
        int i;
        m13116d();
        LevelDb.Iterator it = this.f18149c.iterator();
        try {
            it.seekToFirst();
            i = 0;
            while (it.isValid()) {
                i++;
                it.next();
            }
        } finally {
            it.close();
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo11804a(ghk ghk) {
        m13116d();
        this.f18149c.delete(ggs.m13122a(ghk));
    }

    /* renamed from: a */
    public final synchronized boolean mo11805a(bssn bssn, String str) {
        m13116d();
        bxvd da = ghk.f18253f.mo74144da();
        bssu bssu = bssn.f146888e;
        if (bssu == null) {
            bssu = bssu.f146916d;
        }
        long j = bssu.f146919b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ghk ghk = (ghk) da.f164949b;
        int i = ghk.f18255a | 2;
        ghk.f18255a = i;
        ghk.f18257c = j;
        int i2 = bssn.f146886c;
        int i3 = i | 8;
        ghk.f18255a = i3;
        ghk.f18259e = i2;
        bssn.getClass();
        ghk.f18256b = bssn;
        int i4 = i3 | 1;
        ghk.f18255a = i4;
        str.getClass();
        ghk.f18255a = i4 | 4;
        ghk.f18258d = str;
        long b = cbwm.m128776b();
        long j2 = 0;
        while (j2 < b) {
            long j3 = ((ghk) da.f164949b).f18257c + j2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ghk ghk2 = (ghk) da.f164949b;
            ghk2.f18255a |= 2;
            ghk2.f18257c = j3;
            ghk ghk3 = (ghk) da.mo74062i();
            byte[] a = ggs.m13122a(ghk3);
            if (this.f18149c.get(a) != null) {
                j2++;
            } else {
                this.f18149c.put(a, ghk3.serializeToBytes());
                return true;
            }
        }
        return false;
    }
}
