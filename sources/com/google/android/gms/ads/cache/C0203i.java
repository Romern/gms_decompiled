package com.google.android.gms.ads.cache;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.google.android.gms.ads.cache.p011io.C0205b;
import com.google.android.gms.ads.cache.policy.C0219b;
import com.google.android.gms.ads.cache.policy.C0220c;
import com.google.android.gms.ads.cache.policy.C0221d;
import com.google.android.gms.ads.cache.policy.C0222e;
import com.google.android.gms.ads.cache.policy.C0223f;
import com.google.android.gms.ads.cache.policy.C0226i;
import com.google.android.gms.ads.cache.policy.C0228k;
import com.google.android.gms.ads.cache.policy.C0230m;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.cache.C0324f;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.p012js.function.C0475c;
import com.google.android.gms.ads.internal.p012js.function.C0484l;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.ads.cache.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0203i extends C0324f {

    /* renamed from: a */
    private static C0198d f7857a;

    /* renamed from: b */
    private static final Object f7858b = new Object();

    /* renamed from: c */
    private final C0198d f7859c;

    /* renamed from: d */
    private final ExecutorService f7860d;

    public C0203i(Context context) {
        C0198d a = m5055a(context);
        bqgj a2 = snp.m35702a(10);
        this.f7859c = a;
        this.f7860d = a2;
    }

    /* renamed from: a */
    static C0198d m5055a(Context context) {
        C0484l lVar;
        synchronized (f7858b) {
            if (f7857a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    return null;
                }
                C0371o.m5339a(applicationContext);
                try {
                    C0205b bVar = C0205b.f7864a;
                    C0475c h = C0387d.m5370h();
                    VersionInfoParcel a = VersionInfoParcel.m5635a();
                    synchronized (h.f8461a) {
                        if (h.f8462b == null) {
                            h.f8462b = new C0484l(C0475c.m5445a(applicationContext), a, (String) C0371o.f8213a.mo6604a());
                        }
                        lVar = h.f8462b;
                    }
                    f7857a = new C0198d(applicationContext, bVar, lVar);
                } catch (C0200f e) {
                    C0633h.m5669b("Unable to create cache instance.", e);
                }
            }
            C0198d dVar = f7857a;
            return dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0360, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0361, code lost:
        com.google.android.gms.ads.internal.util.client.C0633h.m5669b("Unable to apply cache policy!", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0368, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r3 = r1.f7843d.f7847b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0388, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1.mo6385a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r4 = r1.f7841b.f7916d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0390, code lost:
        if (r4 == null) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0393, code lost:
        r4 = com.google.android.gms.ads.cache.C0216o.f7906d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0395, code lost:
        r4 = r4.f7909b;
        r5 = r1.f7841b.f7917e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039b, code lost:
        if (r5 == null) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039e, code lost:
        r5 = com.google.android.gms.ads.cache.C0215n.f7897h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a2, code lost:
        if (r5.f7904f != false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03af, code lost:
        if (r1.f7842c.mo6411a() > 0) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03b9, code lost:
        if (r1.f7843d.f7847b.mo6401a(r4) != false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03bb, code lost:
        r5 = com.google.android.gms.ads.cache.C0217p.f7911g.mo74141a(r1.f7841b);
        r6 = r1.f7841b.f7917e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03c7, code lost:
        if (r6 == null) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03ca, code lost:
        r6 = com.google.android.gms.ads.cache.C0215n.f7897h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03cc, code lost:
        r6 = com.google.android.gms.ads.cache.C0215n.f7897h.mo74141a(r6);
        r7 = r1.f7841b.f7917e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03d6, code lost:
        if (r7 == null) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d9, code lost:
        r7 = com.google.android.gms.ads.cache.C0215n.f7897h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03db, code lost:
        r7 = r7.f7905g + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03e1, code lost:
        if (r6.f164950c != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e4, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ea, code lost:
        r8 = (com.google.android.gms.ads.cache.C0215n) r6.f164949b;
        r8.f7899a |= 16;
        r8.f7905g = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03f8, code lost:
        if (r5.f164950c != false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03fb, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0401, code lost:
        r7 = (com.google.android.gms.ads.cache.C0217p) r5.f164949b;
        r6 = (com.google.android.gms.ads.cache.C0215n) r6.mo74062i();
        r6.getClass();
        r7.f7917e = r6;
        r7.f7913a |= 8;
        r1.f7841b = (com.google.android.gms.ads.cache.C0217p) r5.mo74062i();
        r1.f7843d.mo6390b(r1.f7841b);
        r1.f7843d.f7847b.mo6399a(r4, r1.f7842c.mo6413c(), new com.google.android.gms.ads.cache.C0196b(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0437, code lost:
        r1 = r1.f7842c;
        r4 = r1.f7872a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x043b, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r1.mo6416e();
        r5 = new com.google.android.gms.ads.cache.p011io.C0206c(r1);
        r1.f7876e.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0449, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r1 = android.os.ParcelFileDescriptor.createPipe();
        r3 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r25.f7860d.execute(new com.google.android.gms.ads.cache.C0202h(r5, r2.f8088h, new android.os.ParcelFileDescriptor.AutoCloseOutputStream(r1[1])));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x046d, code lost:
        return new com.google.android.gms.ads.internal.cache.CacheEntryParcel(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x046e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x046f, code lost:
        com.google.android.gms.ads.internal.util.client.C0633h.m5669b("Unable to create parcel pipe.", r0);
        p000.srz.m36171a((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x047f, code lost:
        return new com.google.android.gms.ads.internal.cache.CacheEntryParcel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0480, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0486, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0488, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x048a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0495, code lost:
        throw new com.google.android.gms.ads.cache.C0200f("unable to open InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0496, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0499, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x049a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x049c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x049e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04a4, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: a */
    public final CacheEntryParcel mo6397a(CacheOffering cacheOffering) {
        C0217p pVar;
        C0219b bVar;
        CacheOffering cacheOffering2 = cacheOffering;
        C0198d dVar = this.f7859c;
        if (dVar == null) {
            return new CacheEntryParcel();
        }
        try {
            synchronized (dVar.f7847b) {
                try {
                    byte[] a = new C0201g(cacheOffering2.f8083c, cacheOffering2.f8084d, cacheOffering2.f8085e).mo6394a();
                    C0217p a2 = dVar.mo6387a(a);
                    if (a2 == null) {
                        bxvd da = C0217p.f7911g.mo74144da();
                        String str = cacheOffering2.f8083c;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0217p pVar2 = (C0217p) da.f164949b;
                        str.getClass();
                        pVar2.f7913a |= 1;
                        pVar2.f7914b = str;
                        String str2 = new String(a, "UTF-8");
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < str2.length(); i++) {
                            char charAt = str2.charAt(i);
                            if (Character.isLetterOrDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        long a3 = C0387d.m5368f().mo20505a();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 21);
                        sb3.append(sb2);
                        sb3.append("-");
                        sb3.append(a3);
                        String sb4 = sb3.toString();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0217p pVar3 = (C0217p) da.f164949b;
                        sb4.getClass();
                        pVar3.f7913a |= 16;
                        pVar3.f7918f = sb4;
                        bxvd da2 = C0213l.f7887d.mo74144da();
                        String str3 = cacheOffering2.f8084d;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        C0213l lVar = (C0213l) da2.f164949b;
                        str3.getClass();
                        int i2 = lVar.f7889a | 1;
                        lVar.f7889a = i2;
                        lVar.f7890b = str3;
                        String str4 = cacheOffering2.f8085e;
                        str4.getClass();
                        lVar.f7889a = i2 | 2;
                        lVar.f7891c = str4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0217p pVar4 = (C0217p) da.f164949b;
                        C0213l lVar2 = (C0213l) da2.mo74062i();
                        lVar2.getClass();
                        pVar4.f7915c = lVar2;
                        pVar4.f7913a |= 2;
                        bxvd da3 = C0216o.f7906d.mo74144da();
                        String str5 = cacheOffering2.f8081a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        C0216o oVar = (C0216o) da3.f164949b;
                        str5.getClass();
                        int i3 = oVar.f7908a | 1;
                        oVar.f7908a = i3;
                        oVar.f7909b = str5;
                        long j = cacheOffering2.f8082b;
                        oVar.f7908a = i3 | 2;
                        oVar.f7910c = j;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0217p pVar5 = (C0217p) da.f164949b;
                        C0216o oVar2 = (C0216o) da3.mo74062i();
                        oVar2.getClass();
                        pVar5.f7916d = oVar2;
                        pVar5.f7913a |= 4;
                        long a4 = C0387d.m5368f().mo20505a();
                        bxvd da4 = C0215n.f7897h.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        C0215n nVar = (C0215n) da4.f164949b;
                        int i4 = nVar.f7899a | 2;
                        nVar.f7899a = i4;
                        nVar.f7902d = a4;
                        nVar.f7899a = i4 | 1;
                        nVar.f7901c = a4;
                        C0198d.m5046a(cacheOffering2, da4);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0217p pVar6 = (C0217p) da.f164949b;
                        C0215n nVar2 = (C0215n) da4.mo74062i();
                        nVar2.getClass();
                        pVar6.f7917e = nVar2;
                        pVar6.f7913a |= 8;
                        pVar = (C0217p) da.mo74062i();
                    } else {
                        C0215n nVar3 = a2.f7917e;
                        if (nVar3 == null) {
                            nVar3 = C0215n.f7897h;
                        }
                        bxvd a5 = C0215n.f7897h.mo74141a(nVar3);
                        C0198d.m5046a(cacheOffering2, a5);
                        long a6 = C0387d.m5368f().mo20505a();
                        if (a5.f164950c) {
                            a5.mo74035c();
                            a5.f164950c = false;
                        }
                        C0215n nVar4 = (C0215n) a5.f164949b;
                        nVar4.f7899a |= 1;
                        nVar4.f7901c = a6;
                        bxvd a7 = C0217p.f7911g.mo74141a(a2);
                        if (a7.f164950c) {
                            a7.mo74035c();
                            a7.f164950c = false;
                        }
                        C0217p pVar7 = (C0217p) a7.f164949b;
                        C0215n nVar5 = (C0215n) a5.mo74062i();
                        nVar5.getClass();
                        pVar7.f7917e = nVar5;
                        pVar7.f7913a |= 8;
                        try {
                            dVar.f7849d.put(a, ((C0217p) a7.mo74062i()).mo73642k());
                            dVar.f7851f++;
                            pVar = null;
                        } catch (LevelDbException e) {
                            C0633h.m5673d("Unable to update cache entry snapshot in the DB.", e);
                            pVar = null;
                        }
                    }
                    try {
                        C0219b a8 = dVar.mo6388a();
                        if (pVar != null) {
                            bVar = new C0219b(a8);
                            bVar.mo6424a(pVar);
                        } else {
                            bVar = a8;
                        }
                        long longValue = ((Long) C0371o.f8230ah.mo6604a()).longValue();
                        StringBuilder sb5 = new StringBuilder(25);
                        sb5.append(201515033);
                        sb5.append(".");
                        sb5.append(201515033);
                        sb5.append(".1");
                        String sb6 = sb5.toString();
                        StatFs statFs = new StatFs(dVar.f7846a.getCacheDir().getAbsolutePath());
                        long blockSize = (long) statFs.getBlockSize();
                        long blockCount = (long) statFs.getBlockCount();
                        C0219b bVar2 = a8;
                        C0219b bVar3 = ((C0230m) dVar.f7848c.mo6669a(new C0228k(new C0226i(sb6, blockCount * blockSize, (blockCount - ((long) statFs.getAvailableBlocks())) * blockSize, Build.VERSION.RELEASE, Build.MODEL), bVar), longValue)).f7935b;
                        C1225nr<String> nrVar = new C1225nr();
                        nrVar.addAll(bVar2.mo6423a());
                        nrVar.addAll(bVar3.mo6423a());
                        C1223np npVar = new C1223np();
                        C1223np npVar2 = new C1223np();
                        for (String str6 : nrVar) {
                            npVar.putAll(C0223f.m5088a(bVar2.mo6422a(str6)));
                            npVar2.putAll(C0223f.m5088a(bVar3.mo6422a(str6)));
                            bVar2 = bVar2;
                        }
                        Set keySet = npVar.keySet();
                        Set keySet2 = npVar2.keySet();
                        C1225nr<String> nrVar2 = new C1225nr();
                        nrVar2.addAll(keySet);
                        nrVar2.addAll(keySet2);
                        C1225nr nrVar3 = new C1225nr();
                        for (String str7 : nrVar2) {
                            boolean contains = keySet.contains(str7);
                            boolean contains2 = keySet2.contains(str7);
                            if (!contains || !contains2) {
                                if (contains) {
                                    nrVar3.add(new C0221d((C0217p) npVar.get(str7)));
                                } else if (contains2) {
                                    nrVar3.add(new C0220c((C0217p) npVar2.get(str7)));
                                }
                            } else if (!((C0217p) npVar.get(str7)).equals(npVar2.get(str7))) {
                                nrVar3.add(new C0220c((C0217p) npVar2.get(str7)));
                            }
                        }
                        C0223f fVar = new C0223f(nrVar3);
                        C0195a aVar = new C0195a(dVar);
                        for (C0222e eVar : fVar.f7923a) {
                            eVar.mo6428a(aVar);
                        }
                    } catch (C0200f e2) {
                        C0633h.m5669b("Unable to create representation of DB state.", e2);
                    }
                    C0197c cVar = new C0197c(dVar, a, dVar.mo6387a(a));
                    dVar.f7850e.put(cVar, null);
                } catch (UnsupportedEncodingException e3) {
                    throw new C0200f("Cannot encode key as UTF-8 string.", e3);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (C0200f e4) {
            e = e4;
            C0633h.m5669b("Unable to get entry from cache.", e);
            return new CacheEntryParcel();
        }
    }
}
