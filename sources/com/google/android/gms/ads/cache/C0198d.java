package com.google.android.gms.ads.cache;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.cache.p011io.C0205b;
import com.google.android.gms.ads.cache.p011io.C0208e;
import com.google.android.gms.ads.cache.p011io.C0209f;
import com.google.android.gms.ads.cache.p011io.C0210g;
import com.google.android.gms.ads.cache.policy.C0219b;
import com.google.android.gms.ads.cache.policy.C0228k;
import com.google.android.gms.ads.cache.policy.C0230m;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.p012js.function.C0474b;
import com.google.android.gms.ads.internal.p012js.function.C0484l;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.cache.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0198d {

    /* renamed from: a */
    public final Context f7846a;

    /* renamed from: b */
    public final C0205b f7847b;

    /* renamed from: c */
    public final C0474b f7848c;

    /* renamed from: d */
    public final LevelDb f7849d;

    /* renamed from: e */
    public final WeakHashMap f7850e;

    /* renamed from: f */
    public int f7851f;

    public C0198d(Context context, C0205b bVar, C0484l lVar) {
        try {
            this.f7846a = context;
            this.f7847b = bVar;
            this.f7849d = LevelDb.open(context.getDir("ads_cache", 0));
            this.f7850e = new WeakHashMap();
            this.f7848c = lVar.mo6672a("AFMA_updateCache", C0228k.f7931a, C0230m.f7934a);
        } catch (LevelDbException e) {
            throw new C0200f("Unable to create Cache!", e);
        }
    }

    /* renamed from: a */
    public static void m5046a(CacheOffering cacheOffering, bxvd bxvd) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0215n nVar = C0215n.f7897h;
        ((C0215n) bxvd.f164949b).f7900b = bxvk.m124030de();
        for (String str : cacheOffering.f8086f.keySet()) {
            String string = cacheOffering.f8086f.getString(str);
            if (!TextUtils.isEmpty(string)) {
                bxvd da = C0214m.f7892d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0214m mVar = (C0214m) da.f164949b;
                str.getClass();
                int i = mVar.f7894a | 1;
                mVar.f7894a = i;
                mVar.f7895b = str;
                string.getClass();
                mVar.f7894a = i | 2;
                mVar.f7896c = string;
                bxvd.mo74038c(da);
            }
        }
    }

    /* renamed from: b */
    public final void mo6390b(C0217p pVar) {
        synchronized (this.f7847b) {
            try {
                this.f7849d.put(new C0201g(pVar).mo6394a(), pVar.mo73642k());
                this.f7851f++;
            } catch (C0200f | LevelDbException e) {
                C0633h.m5669b("Unable to add entry to DB.", e);
            }
        }
    }

    /* renamed from: c */
    public final C0208e mo6391c(C0217p pVar) {
        C0209f fVar;
        File file = new File(this.f7846a.getCacheDir(), "ads_cache");
        file.mkdirs();
        File file2 = new File(file, pVar.f7918f);
        try {
            C0210g gVar = C0210g.f7881a;
            File canonicalFile = file2.getCanonicalFile();
            synchronized (gVar.f7882b) {
                fVar = (C0209f) gVar.f7883c.get(canonicalFile);
                if (fVar != null) {
                    synchronized (fVar.f7880i.f7882b) {
                        fVar.f7878g++;
                    }
                } else {
                    fVar = new C0209f(gVar, canonicalFile);
                    gVar.f7883c.put(canonicalFile, fVar);
                }
            }
            return fVar;
        } catch (IOException e) {
            throw new C0200f("Unable to open cache data file.", e);
        }
    }

    /* renamed from: a */
    public final C0217p mo6387a(byte[] bArr) {
        try {
            byte[] bArr2 = this.f7849d.get(bArr);
            if (bArr2 != null) {
                return (C0217p) bxvk.m124014a(C0217p.f7911g, bArr2);
            }
            return null;
        } catch (bxwf | LevelDbException e) {
            C0633h.m5669b("Unable to read cache entry from LevelDB.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final C0219b mo6388a() {
        C0219b bVar;
        synchronized (this.f7847b) {
            bVar = new C0219b();
            LevelDb.Iterator it = this.f7849d.iterator();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    C0217p pVar = (C0217p) bxvk.m124014a(C0217p.f7911g, it.value());
                    C0208e c = mo6391c(pVar);
                    bxvd a = C0217p.f7911g.mo74141a(pVar);
                    C0215n nVar = pVar.f7917e;
                    if (nVar == null) {
                        nVar = C0215n.f7897h;
                    }
                    bxvd a2 = C0215n.f7897h.mo74141a(nVar);
                    long a3 = c.mo6411a();
                    if (a2.f164950c) {
                        a2.mo74035c();
                        a2.f164950c = false;
                    }
                    C0215n nVar2 = (C0215n) a2.f164949b;
                    nVar2.f7899a |= 4;
                    nVar2.f7903e = a3;
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    C0217p pVar2 = (C0217p) a.f164949b;
                    C0215n nVar3 = (C0215n) a2.mo74062i();
                    nVar3.getClass();
                    pVar2.f7917e = nVar3;
                    pVar2.f7913a |= 8;
                    srz.m36171a(c);
                    bVar.mo6424a((C0217p) a.mo74062i());
                    it.next();
                }
                it.close();
            } catch (IOException e) {
                throw new C0200f("Unable to get state of cache.", e);
            } catch (Throwable th) {
                it.close();
                throw th;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo6389a(C0217p pVar) {
        synchronized (this.f7847b) {
            try {
                C0208e c = mo6391c(pVar);
                c.mo6415d();
                srz.m36171a(c);
            } catch (C0200f | IOException e) {
                C0633h.m5669b("Unable to delete cache file from disk!!!.", e);
            }
            C0205b bVar = this.f7847b;
            C0216o oVar = pVar.f7916d;
            if (oVar == null) {
                oVar = C0216o.f7906d;
            }
            bVar.mo6402b(oVar.f7909b);
            try {
                byte[] a = new C0201g(pVar).mo6394a();
                ArrayList<C0197c> arrayList = new ArrayList(1);
                for (C0197c cVar : this.f7850e.keySet()) {
                    if (Arrays.equals(cVar.f7840a, a)) {
                        arrayList.add(cVar);
                    }
                }
                for (C0197c cVar2 : arrayList) {
                    cVar2.close();
                }
                this.f7849d.delete(a);
                this.f7851f++;
            } catch (C0200f | LevelDbException e2) {
                C0633h.m5669b("Unable to delete entry from DB.", e2);
            }
        }
    }
}
