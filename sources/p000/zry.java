package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zry implements zre {

    /* renamed from: b */
    private static final srn f55765b = zvt.m46581a();

    /* renamed from: c */
    private final ztu f55766c;

    /* renamed from: d */
    private final zsg f55767d;

    public zry(ztu ztu, zsg zsg) {
        this.f55766c = ztu;
        this.f55767d = zsg;
    }

    /* renamed from: a */
    private final bngx m46081a(yfz yfz, int i) {
        cadp cadp;
        Set<caae> a = yfz.mo30454a();
        if (a.isEmpty()) {
            return bngx.m109376e();
        }
        bngs b = bngx.m109371b(a.size());
        for (caae caae : a) {
            yhe a2 = yfz.mo30455a(caae);
            long b2 = a2.mo30494b();
            long c = a2.mo30495c();
            int i2 = a2.f53821c + a2.f53820b;
            if (a2.mo30496d()) {
                cadp = this.f55767d.mo31427b(caae, b2, c, i2, i);
            } else {
                cadp = this.f55767d.mo31421a(caae, b2, c, a2.f53821c, i);
            }
            if (i == 1) {
                bxvd bxvd = (bxvd) cadp.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) cadp);
                cado cado = (cado) bxvd;
                m46082a(cado);
                cadp = (cadp) cado.mo74062i();
            }
            b.mo67668c(cadp);
        }
        return b.mo67664a();
    }

    /* renamed from: b */
    public final long mo31349b() {
        return this.f55766c.mo31349b();
    }

    /* renamed from: c */
    public final int mo31352c() {
        return this.f55766c.mo31352c();
    }

    /* renamed from: d */
    public final int mo31355d() {
        return this.f55766c.mo31355d();
    }

    /* renamed from: e */
    public final bngx mo31357e(long j) {
        return this.f55766c.mo31357e(j);
    }

    /* renamed from: f */
    public final boolean mo31378f() {
        return this.f55766c.mo31378f();
    }

    /* renamed from: g */
    public final boolean mo31379g() {
        try {
            this.f55767d.mo31429b();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "g", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception deleting leveldb");
        }
        return this.f55766c.mo31379g();
    }

    /* renamed from: h */
    public final Set mo31388h() {
        return this.f55766c.mo31388h();
    }

    /* renamed from: i */
    public final Map mo31389i() {
        LevelDb.Iterator it;
        Throwable th;
        zsg zsg = this.f55767d;
        HashMap hashMap = new HashMap();
        zsg.mo31423a();
        try {
            it = zsg.f55774a.iterator();
            it.seekToFirst();
            while (it.isValid()) {
                byte[] key = it.key();
                String b = zsa.m46140b(key);
                long a = zsa.m46136a(key);
                it.seek(zsa.m46139a(b, Long.MAX_VALUE));
                if (!it.isValid()) {
                    it.seekToLast();
                } else if (!zsa.m46140b(it.key()).equals(b)) {
                    it.prev();
                }
                hashMap.put(b, new zse(a, zsa.m46136a(it.key())));
                it.next();
            }
            if (it != null) {
                it.close();
            }
        } catch (Exception e) {
            if (e instanceof LevelDbCorruptionException) {
                zsg.mo31426a((LevelDbCorruptionException) e);
            } else {
                throw e;
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it2 = this.f55766c.mo31389i().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            caae caae = (caae) entry.getKey();
            ygw ygw = (ygw) entry.getValue();
            long j = ygw.f53781a;
            boolean z = ygw.f53782b;
            zse zse = (zse) hashMap.get(caae.f172326b);
            if (zse != null) {
                hashMap2.put(caae, new ygw(j, z, zse.f55771a, zse.f55772b, ygw.f53785e));
                it2 = it2;
            }
        }
        return hashMap2;
        throw th;
    }

    /* renamed from: j */
    public final Map mo31390j() {
        return this.f55766c.mo31390j();
    }

    /* renamed from: k */
    public final Map mo31391k() {
        return this.f55766c.mo31391k();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
     arg types: [java.util.List, long]
     candidates:
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object */
    /* renamed from: b */
    public final long mo31372b(caae caae) {
        zsg zsg = this.f55767d;
        if (!cdyu.m135389g()) {
            return ((Long) bnjd.m109589b((Iterable) zsg.mo31428b(caae, 0, Long.MAX_VALUE), (Object) -1L)).longValue();
        }
        byte[] a = zsa.m46137a(caae, 0);
        byte[] a2 = zsa.m46137a(caae, Long.MAX_VALUE);
        zsg.mo31423a();
        LevelDb.Iterator it = zsg.f55774a.iterator();
        try {
            it.seek(a);
            if (it.isValid()) {
                byte[] key = it.key();
                if (zsa.m46135a(key, a2) <= 0) {
                    long a3 = zsa.m46136a(key);
                    if (it == null) {
                        return a3;
                    }
                    it.close();
                    return a3;
                }
            }
            if (it == null) {
                return -1;
            }
            it.close();
            return -1;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final int mo31353c(long j) {
        return this.f55766c.mo31353c(j);
    }

    /* renamed from: d */
    public final int mo31356d(long j) {
        return this.f55766c.mo31356d(j);
    }

    /* renamed from: e */
    public final ydh mo31376e() {
        return this.f55766c.mo31376e();
    }

    /* renamed from: c */
    public final yqi mo31387c(caae caae) {
        return this.f55766c.mo31387c(caae);
    }

    /* renamed from: c */
    public final zrb mo31354c(int i, long j) {
        return this.f55766c.mo31354c(i, j);
    }

    /* renamed from: c */
    public final void mo31375c(caae caae, long j, long j2) {
        this.f55766c.mo31375c(caae, j, j2);
    }

    /* renamed from: c */
    public final void mo31395c(cadz cadz, int i) {
        this.f55766c.mo31395c(cadz, i);
    }

    /* renamed from: b */
    public final bngx mo31350b(int i, long j) {
        return this.f55766c.mo31350b(i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* renamed from: a */
    private final void m46082a(cado cado) {
        caae caae;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((cadp) cado.f164949b).f172714c.size(); i++) {
            cadn cadn = (cadn) ((cadp) cado.f164949b).f172714c.get(i);
            bxvd bxvd = (bxvd) cadn.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cadn);
            cadm cadm = (cadm) bxvd;
            cadn cadn2 = (cadn) cadm.f164949b;
            if ((cadn2.f172701a & 8) != 0) {
                caae caae2 = cadn2.f172706f;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                if ((caae2.f172325a & 1) != 0) {
                    caae caae3 = ((cadn) cadm.f164949b).f172706f;
                    if (caae3 == null) {
                        caae3 = caae.f172323i;
                    }
                    caae caae4 = (caae) hashMap.get(caae3.f172326b);
                    if (caae4 == null) {
                        caae caae5 = ((cadn) cadm.f164949b).f172706f;
                        if (caae5 == null) {
                            caae5 = caae.f172323i;
                        }
                        String str = caae5.f172326b;
                        if (str != null) {
                            Iterator it = mo31388h().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    caae caae6 = (caae) it.next();
                                    if (caae6.f172326b.equals(str)) {
                                        caae4 = caae6;
                                        break;
                                    }
                                } else if (((Boolean) yyd.m44989b(str).mo66810a(zrx.f55764a).mo66812a((Object) false)).booleanValue()) {
                                    caae4 = yyd.m44984a(str);
                                }
                            }
                            caae = ((cadn) cadm.f164949b).f172706f;
                            if (caae == null) {
                                caae = caae.f172323i;
                            }
                            hashMap.put(caae.f172326b, caae4);
                        }
                        caae4 = null;
                        caae = ((cadn) cadm.f164949b).f172706f;
                        if (caae == null) {
                        }
                        hashMap.put(caae.f172326b, caae4);
                    }
                    if (cadm.f164950c) {
                        cadm.mo74035c();
                        cadm.f164950c = false;
                    }
                    cadn cadn3 = (cadn) cadm.f164949b;
                    cadn cadn4 = cadn.f172699j;
                    caae4.getClass();
                    cadn3.f172706f = caae4;
                    cadn3.f172701a |= 8;
                    cadn cadn5 = (cadn) cadm.mo74062i();
                    if (cado.f164950c) {
                        cado.mo74035c();
                        cado.f164950c = false;
                    }
                    cadp cadp = (cadp) cado.f164949b;
                    cadp cadp2 = cadp.f172710f;
                    cadn5.getClass();
                    cadp.mo74621c();
                    cadp.f172714c.set(i, cadn5);
                }
            }
        }
    }

    /* renamed from: b */
    public final bngx mo31373b(yfz yfz) {
        return m46081a(yfz, 2);
    }

    /* renamed from: b */
    public final caah mo31383b(String str) {
        return this.f55766c.mo31383b(str);
    }

    /* renamed from: b */
    public final Set mo31384b(Set set) {
        return this.f55766c.mo31384b(set);
    }

    /* renamed from: b */
    public final zrb mo31351b(long j) {
        return this.f55766c.mo31351b(j);
    }

    /* renamed from: b */
    public final void mo31374b(caae caae, long j, long j2) {
        this.f55766c.mo31374b(caae, j, j2);
        try {
            this.f55767d.mo31424a(caae, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.MILLISECONDS.toNanos(j2));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "b", 443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception deleting from leveldb");
        }
    }

    /* renamed from: b */
    public final void mo31394b(cadz cadz, int i) {
        this.f55766c.mo31394b(cadz, i);
    }

    /* renamed from: b */
    public final void mo31385b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f55767d.mo31424a(yyd.m44992c((String) it.next()), 0, Long.MAX_VALUE);
        }
        this.f55766c.mo31385b(collection);
    }

    /* renamed from: b */
    public final void mo31386b(List list) {
        this.f55766c.mo31386b(list);
    }

    /* renamed from: a */
    public final int mo31358a(caae caae) {
        zsg zsg = this.f55767d;
        zsd zsd = new zsd();
        zsg.mo31425a(caae, 0, Long.MAX_VALUE, zsd);
        return zsd.f55770a;
    }

    /* renamed from: a */
    public final int mo31359a(caae caae, long j) {
        int a = this.f55766c.mo31359a(caae, j);
        try {
            this.f55767d.mo31424a(caae, 0, -1 + j);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "a", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception deleting from leveldb");
        }
        return a;
    }

    /* renamed from: a */
    public final int mo31344a(List list) {
        return this.f55766c.mo31344a(list);
    }

    /* renamed from: a */
    public final long mo31345a() {
        return this.f55766c.mo31345a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r0 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r0 == null) goto L_0x0093;
     */
    /* renamed from: a */
    public final long mo31360a(caae caae, int i) {
        int i2;
        zsg zsg = this.f55767d;
        long j = -1;
        if (!cdyu.m135389g()) {
            List b = zsg.mo31428b(caae, 0, Long.MAX_VALUE);
            if (i <= b.size()) {
                return ((Long) b.get(b.size() - i)).longValue();
            }
        } else {
            byte[] a = zsa.m46137a(caae, 0);
            byte[] a2 = zsa.m46137a(caae, Long.MAX_VALUE);
            zsg.mo31423a();
            LevelDb.Iterator it = zsg.f55774a.iterator();
            try {
                it.seek(a2);
                if (!it.isValid()) {
                    it.seekToLast();
                }
                while (true) {
                    i2 = 0;
                    if (it.isValid()) {
                        if (zsa.m46135a(it.key(), a2) <= 0) {
                            break;
                        }
                        it.prev();
                    } else {
                        break;
                    }
                }
                while (it.isValid() && zsa.m46135a(it.key(), a) >= 0) {
                    i2++;
                    if (i2 == i) {
                        j = zsa.m46136a(it.key());
                    } else {
                        it.prev();
                    }
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return j;
        throw th;
    }

    /* renamed from: a */
    public final bngx mo31346a(int i, long j) {
        return this.f55766c.mo31346a(i, j);
    }

    /* renamed from: a */
    public final bngx mo31392a(String str, String str2, String str3, long j, long j2) {
        return this.f55766c.mo31392a(str, str2, str3, j, j2);
    }

    /* renamed from: a */
    public final bngx mo31361a(List list, boolean z) {
        if (list.isEmpty()) {
            return bngx.m109376e();
        }
        this.f55766c.mo31361a(list, z);
        bngs j = bngx.m109377j();
        try {
            bnrd a = yyk.m45021b(list).entrySet().iterator();
            while (a.hasNext()) {
                Map.Entry entry = (Map.Entry) a.next();
                caae caae = (caae) entry.getKey();
                bngx bngx = (bngx) entry.getValue();
                bnre i = bngx.listIterator();
                long j2 = 0;
                long j3 = Long.MAX_VALUE;
                while (i.hasNext()) {
                    long j4 = ((cadn) i.next()).f172702b;
                    if (j4 < j3) {
                        j3 = j4;
                    }
                    if (j4 > j2) {
                        j2 = j4;
                    }
                }
                bnic a2 = bnic.m109495a((Collection) this.f55767d.mo31428b(caae, j3, j2));
                ArrayList arrayList = new ArrayList();
                bnre i2 = bngx.listIterator();
                while (i2.hasNext()) {
                    cadn cadn = (cadn) i2.next();
                    if (!a2.contains(Long.valueOf(cadn.f172702b))) {
                        arrayList.add(cadn);
                    }
                }
                j.mo67666b((Iterable) this.f55767d.mo31422a(arrayList, caae));
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception writing to leveldb");
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final bngx mo31362a(yfz yfz) {
        return m46081a(yfz, 1);
    }

    /* renamed from: a */
    public final caae mo31377a(String str) {
        return this.f55766c.mo31377a(str);
    }

    /* renamed from: a */
    public final cadp mo31363a(caae caae, long j, int i) {
        cadp cadp;
        boolean z;
        long j2;
        if (i == -1) {
            cadp = this.f55767d.mo31420a(caae, j, Long.MAX_VALUE, 1);
        } else {
            zsg zsg = this.f55767d;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            if (i == 0) {
                cadp = yyl.m45028a(caae);
            } else {
                List b = zsg.mo31428b(caae, j, Long.MAX_VALUE);
                if (b.size() > i) {
                    j2 = ((Long) b.get(i - 1)).longValue();
                } else {
                    j2 = Long.MAX_VALUE;
                }
                cadp = zsg.mo31420a(caae, j, j2, 1);
            }
        }
        bxvd bxvd = (bxvd) cadp.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadp);
        cado cado = (cado) bxvd;
        m46082a(cado);
        return (cadp) cado.mo74062i();
    }

    /* renamed from: a */
    public final cadp mo31364a(caae caae, long j, long j2) {
        cadp a = this.f55767d.mo31420a(caae, j, j2, 1);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        cado cado = (cado) bxvd;
        m46082a(cado);
        return (cadp) cado.mo74062i();
    }

    /* renamed from: a */
    public final cadp mo31365a(caae caae, long j, long j2, int i) {
        cadp cadp;
        if (i != -1) {
            cadp = this.f55767d.mo31427b(caae, j, j2, i, 1);
        } else {
            cadp = this.f55767d.mo31420a(caae, j, j2, 1);
        }
        bxvd bxvd = (bxvd) cadp.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadp);
        cado cado = (cado) bxvd;
        m46082a(cado);
        return (cadp) cado.mo74062i();
    }

    /* renamed from: a */
    public final cadp mo31366a(cadp cadp, boolean z) {
        cadp a = this.f55766c.mo31366a(cadp, z);
        try {
            zsg zsg = this.f55767d;
            bxwc bxwc = a.f172714c;
            caae caae = a.f172713b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            List a2 = zsg.mo31422a(bxwc, caae);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            cado cado = (cado) bxvd;
            if (cado.f164950c) {
                cado.mo74035c();
                cado.f164950c = false;
            }
            cadp cadp2 = cadp.f172710f;
            ((cadp) cado.f164949b).f172714c = GeneratedMessageLite.m124030de();
            cado.mo74617a(a2);
            return (cadp) cado.mo74062i();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception writing to leveldb");
            return a;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Set mo31380a(Collection collection) {
        return this.f55766c.mo31380a(collection);
    }

    /* renamed from: a */
    public final zrb mo31347a(long j) {
        return this.f55766c.mo31347a(j);
    }

    /* renamed from: a */
    public final void mo31367a(long j, long j2, caae caae, boolean z) {
        this.f55766c.mo31367a(j, j2, caae, z);
        try {
            this.f55767d.mo31424a(caae, j, j2);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zry", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception deleting from leveldb");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zry.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      zry.a(caae, long, long, int):cadp
      zry.a(caae, long, long, cadp):void
      zry.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zry.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zry.a(cadp, boolean):cadp
     arg types: [cadp, int]
     candidates:
      zry.a(yfz, int):bngx
      zry.a(caae, long):int
      zry.a(caae, int):long
      zry.a(int, long):bngx
      zry.a(java.util.List, boolean):bngx
      zry.a(cadz, int):boolean
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zry.a(cadp, boolean):cadp */
    /* renamed from: a */
    public final void mo31368a(caae caae, long j, long j2, cadp cadp) {
        mo31367a(j, j2, caae, true);
        mo31366a(cadp, true);
    }

    /* renamed from: a */
    public final void mo31369a(caae caae, List list, boolean z) {
        WriteBatch create;
        this.f55766c.mo31369a(caae, list, z);
        try {
            zsg zsg = this.f55767d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                caae caae2 = ((cadn) it.next()).f172705e;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                bmxy.m108588a(caae2.equals(caae));
            }
            if (!list.isEmpty()) {
                ArrayList<cadn> arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    cadn cadn = (cadn) it2.next();
                    long j = cadn.f172702b;
                    cadp a = zsg.mo31420a(caae, j, j, 1);
                    if (a.f172714c.size() > 0) {
                        cadn cadn2 = (cadn) a.f172714c.get(0);
                        if (cadn2.f172702b == cadn.f172702b && cadn2.f172703c == cadn.f172703c && cadn2.f172707g == cadn.f172707g && cadn2.f172704d.equals(cadn.f172704d)) {
                            caae caae3 = cadn2.f172706f;
                            if (caae3 == null) {
                                caae3 = caae.f172323i;
                            }
                            caae caae4 = cadn.f172706f;
                            if (caae4 == null) {
                                caae4 = caae.f172323i;
                            }
                            if (sdg.m34949a(zsg.m46147a(caae3), zsg.m46147a(caae4))) {
                                arrayList.add(cadn2);
                            }
                        }
                    }
                }
                zsg.mo31423a();
                try {
                    create = WriteBatch.create();
                    for (cadn cadn3 : arrayList) {
                        create.delete(zsa.m46138a(cadn3));
                    }
                    LevelDb levelDb = zsg.f55774a;
                    bmxy.m108581a(levelDb);
                    levelDb.write(create);
                    create.close();
                    return;
                } catch (LevelDbCorruptionException e) {
                    zsg.mo31426a(e);
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } else {
                return;
            }
            throw th;
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) f55765b.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("zry", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Caught exception deleting from leveldb");
        }
    }

    /* renamed from: a */
    public final void mo31381a(caah caah) {
        this.f55766c.mo31381a(caah);
    }

    /* renamed from: a */
    public final void mo31348a(Set set) {
        this.f55766c.mo31348a(set);
    }

    /* renamed from: a */
    public final void mo31370a(Set set, long j, long j2, boolean z) {
        this.f55766c.mo31370a(set, j, j2, z);
        for (caae caae : mo31388h()) {
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (set.contains(caah.f172336b)) {
                try {
                    this.f55767d.mo31424a(caae, j, j2);
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f55765b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("zry", "a", 463, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Caught exception deleting from leveldb");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31371a(ydh ydh) {
        this.f55766c.mo31371a(ydh);
    }

    /* renamed from: a */
    public final void mo31382a(yqi yqi) {
        this.f55766c.mo31382a(yqi);
    }

    /* renamed from: a */
    public final boolean mo31393a(cadz cadz, int i) {
        return this.f55766c.mo31393a(cadz, i);
    }
}
