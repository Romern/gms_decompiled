package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: zsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsg implements Closeable {

    /* renamed from: b */
    private static final srn f55773b = zvt.m46581a();

    /* renamed from: a */
    public LevelDb f55774a = null;

    /* renamed from: c */
    private final String f55775c;

    /* renamed from: d */
    private final Context f55776d;

    /* renamed from: e */
    private final ytp f55777e;

    public zsg(Context context, String str, ytp ytp) {
        this.f55776d = context;
        this.f55775c = str;
        this.f55777e = ytp;
    }

    /* renamed from: a */
    private static cadn m46145a(cadn cadn, long j) {
        if (cadn.f172708h != 0) {
            return cadn;
        }
        bxvd bxvd = (bxvd) cadn.mo74142c(5);
        bxvd.mo73625a((bxvk) cadn);
        cadm cadm = (cadm) bxvd;
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn2 = (cadn) cadm.f164949b;
        cadn cadn3 = cadn.f172699j;
        cadn2.f172701a |= 32;
        cadn2.f172708h = j;
        return (cadn) cadm.mo74062i();
    }

    /* renamed from: a */
    public static String m46147a(caae caae) {
        if (caae != null) {
            return caae.f172326b;
        }
        return null;
    }

    /* renamed from: c */
    private final synchronized void m46149c() {
        if (this.f55774a == null) {
            File a = m46146a(this.f55775c, this.f55776d);
            LevelDb.Options options = new LevelDb.Options();
            options.mDeleteIfCorrupted = false;
            try {
                this.f55774a = LevelDb.open(a, options);
                ytq a2 = this.f55777e.mo30767a(this.f55776d);
                a2.mo30762a(this.f55775c);
                a2.mo30755a(413);
                a2.mo30765d(2);
                a2.mo30754a();
            } catch (LevelDbException e) {
                ytq a3 = this.f55777e.mo30767a(this.f55776d);
                a3.mo30762a(this.f55775c);
                a3.mo30755a(413);
                a3.mo30765d(10);
                a3.mo30754a();
                throw e;
            }
        }
    }

    /* renamed from: b */
    public final cadp mo31427b(caae caae, long j, long j2, int i, int i2) {
        long j3;
        if (i <= 0) {
            return yyl.m45028a(caae);
        }
        List b = mo31428b(caae, j, j2);
        if (b.size() > i) {
            j3 = ((Long) b.get(b.size() - i)).longValue();
        } else {
            j3 = j;
        }
        return mo31420a(caae, j3, j2, i2);
    }

    public final synchronized void close() {
        LevelDb levelDb = this.f55774a;
        if (levelDb != null) {
            levelDb.close();
            this.f55774a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: b */
    public final List mo31428b(caae caae, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        arrayList.getClass();
        mo31425a(caae, j, j2, new zsb(arrayList));
        return arrayList;
    }

    /* renamed from: b */
    public final void mo31429b() {
        close();
        LevelDb.destroy(m46146a(this.f55775c, this.f55776d));
    }

    /* renamed from: a */
    private static File m46146a(String str, Context context) {
        return new File(context.getDir(Uri.encode(str), 0), "datapoints");
    }

    /* renamed from: a */
    private final void m46148a(int i) {
        ytq a = this.f55777e.mo30767a(this.f55776d);
        a.mo30762a(this.f55775c);
        a.mo30755a(403);
        a.mo30765d(i);
        a.mo30754a();
    }

    /* renamed from: a */
    public final cadp mo31420a(caae caae, long j, long j2, int i) {
        return mo31421a(caae, j, j2, 0, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.ArrayList, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    public final cadp mo31421a(caae caae, long j, long j2, int i, int i2) {
        LevelDb.Iterator it;
        byte[] a = zsa.m46137a(caae, j);
        byte[] a2 = zsa.m46137a(caae, j2);
        mo31423a();
        try {
            it = this.f55774a.iterator();
            it.seek(a);
            if (i > 0) {
                byte[] a3 = zsa.m46137a(caae, 0);
                if (!it.isValid()) {
                    it.seekToLast();
                    if (!it.isValid() || zsa.m46135a(it.key(), a3) < 0 || zsa.m46135a(it.key(), a2) > 0) {
                        it.seek(a);
                    } else {
                        i--;
                    }
                }
                if (it.isValid()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i) {
                            break;
                        }
                        it.prev();
                        if (it.isValid()) {
                            if (zsa.m46135a(it.key(), a3) < 0) {
                                it.next();
                                break;
                            }
                            i3++;
                        } else {
                            it.seekToFirst();
                            break;
                        }
                    }
                }
            }
            zsh a4 = zsh.m46160a(it, caae, a2);
            if (i2 - 1 != 0) {
                ArrayList arrayList = new ArrayList();
                while (a4.mo31432a()) {
                    int c = a4.f55779b.mo73791c(a4.f55780c);
                    bxuc bxuc = a4.f55779b;
                    byte[] e = bxuc.mo73795e(bxuc.mo73817z());
                    a4.f55779b.mo73793d(c);
                    a4.mo31433b();
                    arrayList.add(e);
                }
                cado b = yyl.m45033b(caae);
                b.mo74618b(bnkn.m109668a((List) arrayList, zsc.f55769a));
                cadp cadp = (cadp) b.mo74062i();
                if (it != null) {
                    it.close();
                }
                return cadp;
            }
            ArrayList arrayList2 = new ArrayList();
            while (a4.mo31432a()) {
                bxuc bxuc2 = a4.f55779b;
                int i4 = a4.f55780c;
                caae caae2 = a4.f55778a;
                cadm cadm = (cadm) cadn.f172699j.mo74144da();
                int c2 = bxuc2.mo73791c(i4);
                cadm.mo73627a(bxuc2, bxus.m123744c());
                bxuc2.mo73793d(c2);
                if (cadm.f164950c) {
                    cadm.mo74035c();
                    cadm.f164950c = false;
                }
                cadn cadn = (cadn) cadm.f164949b;
                caae2.getClass();
                cadn.f172705e = caae2;
                cadn.f172701a |= 4;
                a4.mo31433b();
                arrayList2.add((cadn) cadm.mo74062i());
            }
            cado b2 = yyl.m45033b(caae);
            b2.mo74617a(arrayList2);
            cadp cadp2 = (cadp) b2.mo74062i();
            if (it != null) {
                it.close();
            }
            return cadp2;
        } catch (LevelDbCorruptionException e2) {
            mo31426a(e2);
            return yyl.m45028a(caae);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final List mo31422a(Collection collection, caae caae) {
        Throwable th;
        WriteBatch writeBatch;
        long j;
        WriteBatch writeBatch2;
        boolean z;
        long j2;
        bxuk bxuk;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            caae caae2 = ((cadn) it.next()).f172705e;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            bmxy.m108588a(caae2.equals(caae));
        }
        mo31423a();
        ArrayList arrayList2 = new ArrayList();
        try {
            WriteBatch create = WriteBatch.create();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                zsi zsi = new zsi(this.f55775c, this.f55776d, caae, create, this.f55777e);
                Iterator it2 = collection.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    try {
                        cadn a = m46145a((cadn) it2.next(), currentTimeMillis);
                        try {
                            if (zsi.f55789c != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bmxy.m108601b(z, "Cannot use the same RawDataPointWriter post flush");
                            int a2 = zsi.m46164a(a);
                            int k = bxuk.m123661k(a2) + a2 + 8;
                            int i = k + 1;
                            if (i <= 16384) {
                                if (zsi.f55789c.mo73827a() < i) {
                                    zsi.mo31434a();
                                    zsi.f55789c = bxuk.m123637a(zsi.f55788b);
                                }
                                int a3 = zsi.f55789c.mo73827a();
                                zsi.f55789c.mo73855d(a2);
                                zsi.m46165a(a, zsi.f55789c);
                                writeBatch2 = create;
                                try {
                                    j2 = a.f172702b;
                                    bxuk = zsi.f55789c;
                                    j = currentTimeMillis;
                                } catch (zrz e) {
                                    j = currentTimeMillis;
                                    try {
                                        arrayList2.add(a);
                                        create = writeBatch2;
                                        currentTimeMillis = j;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        writeBatch = writeBatch2;
                                        try {
                                            writeBatch.close();
                                        } catch (Throwable th3) {
                                            bqye.m113761a(th, th3);
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    bxuk.mo73872g(((int) (j2 >> 56)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 48)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 40)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 32)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 24)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 16)) & 255);
                                    bxuk.mo73872g(((int) (j2 >> 8)) & 255);
                                    bxuk.mo73872g(((int) j2) & 255);
                                    int a4 = a3 - zsi.f55789c.mo73827a();
                                    if (a4 != k) {
                                        ((bnsl) zsi.f55787a.mo68387b()).mo68411a("Issue while computing space. computed: [%d], actual [%d]", k, a4);
                                        ytq a5 = zsi.f55792f.mo30767a(zsi.f55791e);
                                        a5.mo30762a(zsi.f55790d);
                                        a5.mo30755a(414);
                                        a5.mo30765d(52);
                                        a5.mo30754a();
                                    }
                                    arrayList.add(a);
                                    create = writeBatch2;
                                    currentTimeMillis = j;
                                    z2 = true;
                                } catch (zrz e2) {
                                    arrayList2.add(a);
                                    create = writeBatch2;
                                    currentTimeMillis = j;
                                }
                            } else {
                                throw new zrz();
                            }
                        } catch (zrz e3) {
                            writeBatch2 = create;
                            j = currentTimeMillis;
                            arrayList2.add(a);
                            create = writeBatch2;
                            currentTimeMillis = j;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        writeBatch = create;
                        writeBatch.close();
                        throw th;
                    }
                }
                WriteBatch writeBatch3 = create;
                if (z2) {
                    try {
                        zsi.mo31434a();
                        LevelDb levelDb = this.f55774a;
                        bmxy.m108581a(levelDb);
                        writeBatch = writeBatch3;
                        try {
                            levelDb.write(writeBatch);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        writeBatch = writeBatch3;
                        th = th;
                        writeBatch.close();
                        throw th;
                    }
                } else {
                    writeBatch = writeBatch3;
                }
                writeBatch.close();
            } catch (Throwable th7) {
                th = th7;
                writeBatch = create;
                th = th;
                writeBatch.close();
                throw th;
            }
        } catch (LevelDbCorruptionException e4) {
            mo31426a(e4);
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            cadn cadn = (cadn) arrayList2.get(i2);
            cadn a6 = m46145a(cadn, System.currentTimeMillis());
            byte[] a7 = zsa.m46138a(a6);
            byte[] bArr = new byte[zsi.m46164a(a6)];
            zsi.m46165a(a6, bxuk.m123637a(bArr));
            mo31423a();
            try {
                this.f55774a.put(a7, bArr);
            } catch (LevelDbCorruptionException e5) {
                mo31426a(e5);
            }
            arrayList.add(cadn);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo31423a() {
        try {
            m46149c();
        } catch (LevelDbCorruptionException e) {
            mo31426a(e);
        } catch (LevelDbException e2) {
            mo31426a(e2);
        }
    }

    /* renamed from: a */
    public final void mo31424a(caae caae, long j, long j2) {
        byte[] a = zsa.m46137a(caae, j);
        byte[] a2 = zsa.m46137a(caae, j2);
        mo31423a();
        try {
            this.f55774a.deleteRange(a, a2);
        } catch (LevelDbCorruptionException e) {
            mo31426a(e);
        }
    }

    /* renamed from: a */
    public final void mo31425a(caae caae, long j, long j2, zsf zsf) {
        LevelDb.Iterator it;
        long j3;
        byte[] a = zsa.m46137a(caae, j);
        byte[] a2 = zsa.m46137a(caae, j2);
        mo31423a();
        try {
            it = this.f55774a.iterator();
            it.seek(a);
            zsh a3 = zsh.m46160a(it, caae, a2);
            while (a3.mo31432a()) {
                int c = a3.f55779b.mo73791c(a3.f55780c);
                int a4 = a3.f55779b.mo73786a();
                Long l = null;
                do {
                    if (l == null) {
                        if (a4 == 8) {
                            l = Long.valueOf(a3.f55779b.mo73794e());
                            a4 = a3.f55779b.mo73786a();
                        }
                    }
                    a3.f55779b.mo73789b(a4);
                    a4 = a3.f55779b.mo73786a();
                } while (a4 != 0);
                a3.f55779b.mo73793d(c);
                a3.mo31433b();
                if (l != null) {
                    j3 = l.longValue();
                } else {
                    j3 = 0;
                }
                zsf.mo31416a(j3);
            }
            if (it != null) {
                it.close();
                return;
            }
            return;
        } catch (LevelDbCorruptionException e) {
            mo31426a(e);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31426a(LevelDbException levelDbException) {
        bnsl bnsl = (bnsl) f55773b.mo68387b();
        bnsl.mo68437a(levelDbException);
        bnsl.mo68405a("LevelDB exception: recreating the Database");
        try {
            mo31429b();
            m46149c();
            zrf.m46035a(this.f55776d, this.f55775c).edit().putBoolean("is_migratedv2", false).commit();
            m46148a(2);
        } catch (LevelDbException e) {
            bnsl bnsl2 = (bnsl) f55773b.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68405a("Failed to recreate database.");
            m46148a(10);
            throw levelDbException;
        }
    }
}
