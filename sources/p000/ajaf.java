package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ajaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajaf {

    /* renamed from: a */
    public final aiyr f70223a;

    /* renamed from: b */
    public final aiyq f70224b = new ajad(this);

    /* renamed from: c */
    public boolean f70225c = false;

    /* renamed from: d */
    private LevelDb f70226d;

    /* renamed from: e */
    private final Context f70227e;

    /* renamed from: f */
    private final ClientAppIdentifier f70228f;

    /* renamed from: g */
    private final sqv f70229g;

    /* renamed from: h */
    private final ajat f70230h;

    public ajaf(Context context, ClientAppIdentifier clientAppIdentifier) {
        this.f70227e = context;
        this.f70228f = clientAppIdentifier;
        this.f70229g = (sqv) ahgz.m55754a(context, sqv.class);
        this.f70230h = (ajat) ahgz.m55754a(context, ajat.class);
        aiyr aiyr = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f70223a = aiyr;
        aiyr.mo38295a(this.f70224b);
        if (clientAppIdentifier != null) {
            mo38359a();
        }
    }

    /* renamed from: a */
    private static bryx m58315a(Object obj) {
        return new bryx(1, obj);
    }

    /* renamed from: c */
    private final void m58318c(ajae ajae) {
        if (mo38365c()) {
            try {
                this.f70226d.delete(ajae.mo38353a());
            } catch (LevelDbCorruptionException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajaf", "c", 538, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68426a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", ajae, m58315a(LevelDbCorruptionException.class.getSimpleName()), m58315a(e.toString()));
                mo38364b();
                m58321f();
            } catch (LevelDbException e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("ajaf", "c", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68426a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", ajae, m58315a(LevelDbException.class.getSimpleName()), m58315a(e2.toString()));
            }
        }
    }

    /* renamed from: d */
    private final File m58319d() {
        File cacheDir = this.f70227e.getCacheDir();
        ClientAppIdentifier clientAppIdentifier = this.f70228f;
        String clientAppIdentifier2 = clientAppIdentifier != null ? clientAppIdentifier.toString() : "global";
        StringBuilder sb = new StringBuilder(String.valueOf(clientAppIdentifier2).length() + 24);
        sb.append(clientAppIdentifier2);
        sb.append("_beacon_message_cache.db");
        return new File(cacheDir, sb.toString());
    }

    /* renamed from: e */
    private final LevelDb m58320e() {
        srn srn = ahfq.f67120a;
        try {
            return LevelDb.open(m58319d());
        } catch (LevelDbCorruptionException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajaf", "e", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("%s Failed to open LevelDb because of %s, %s", "BeaconMessageCache:", m58315a(LevelDbCorruptionException.class.getSimpleName()), m58315a(e.toString()));
            m58321f();
            return null;
        } catch (LevelDbException e2) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ajaf", "e", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("%s Failed to open LevelDb because of %s, %s", "BeaconMessageCache:", m58315a(LevelDbException.class.getSimpleName()), m58315a(e2.toString()));
            return null;
        } catch (UnsatisfiedLinkError e3) {
            bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("ajaf", "e", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("%s LevelDb wasn't able to use native methods", "BeaconMessageCache:");
            return null;
        }
    }

    /* renamed from: f */
    private final void m58321f() {
        try {
            LevelDb.destroy(m58319d());
        } catch (LevelDbException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajaf", "f", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Failed to destroy the database because of %s, %s", m58315a(LevelDbException.class.getSimpleName()), m58315a(e.toString()));
        }
    }

    /* renamed from: b */
    public final Set mo38363b(ajae ajae) {
        bgfc a = mo38357a(ajae);
        if (a != null) {
            return sqw.m36047b((byzr[]) a.f116338c.toArray(new byzr[0]));
        }
        return null;
    }

    /* renamed from: a */
    public static void m58316a(WriteBatch writeBatch, ajae ajae, bgfc bgfc) {
        writeBatch.put(ajae.mo38353a(), bgfc.mo73642k());
    }

    /* renamed from: b */
    public final void mo38364b() {
        LevelDb levelDb = this.f70226d;
        if (levelDb != null) {
            levelDb.close();
            this.f70226d = null;
        }
    }

    /* renamed from: a */
    private final void m58317a(WriteBatch writeBatch, ajae ajae, Collection collection, boolean z) {
        byyr byyr;
        bgfc a = mo38357a(ajae);
        bgfc a2 = mo38358a(collection);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bgfc bgfc = (bgfc) bxvd.f164949b;
        bgfc bgfc2 = bgfc.f116334f;
        bgfc.f116336a |= 4;
        bgfc.f116340e = z;
        if (a != null) {
            byyr = a.f116339d;
            if (byyr == null) {
                byyr = byyr.f168996d;
            }
        } else {
            byyr = null;
        }
        if (byyr == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bgfc bgfc3 = (bgfc) bxvd.f164949b;
            bgfc3.f116339d = null;
            bgfc3.f116336a &= -3;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bgfc bgfc4 = (bgfc) bxvd.f164949b;
            byyr.getClass();
            bgfc4.f116339d = byyr;
            bgfc4.f116336a |= 2;
        }
        m58316a(writeBatch, ajae, (bgfc) bxvd.mo74062i());
    }

    /* renamed from: c */
    public final boolean mo38365c() {
        if (cfop.f185115a.mo6606a().mo82227f() && !this.f70225c) {
            if (this.f70226d == null) {
                this.f70226d = m58320e();
            }
            if (this.f70226d != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c4, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r6 = (p000.bnsl) p000.ahfq.f67120a.mo68387b();
        r6.mo68437a(r3);
        r6.mo68432a("ajaf", "a", 492, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68426a("%s Unable to parse the db result for beacon %s because of %s, %s", "BeaconMessageCache:", r14, m58315a(p000.bxwf.class.getSimpleName()), m58315a(r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f1, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r6 = (p000.bnsl) p000.ahfq.f67120a.mo68387b();
        r6.mo68437a(r3);
        r6.mo68432a("ajaf", "a", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68426a("%s Database failed during get for beacon %s because of %s, %s", "BeaconMessageCache:", r14, m58315a(com.google.android.gms.leveldb.LevelDbException.class.getSimpleName()), m58315a(r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x011f, code lost:
        r6 = (p000.bnsl) p000.ahfq.f67120a.mo68387b();
        r6.mo68437a(r3);
        r6.mo68432a("ajaf", "a", 476, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68426a("%s Database failed during get for beacon %s because of %s, %s", "BeaconMessageCache:", r14, m58315a(com.google.android.gms.leveldb.LevelDbCorruptionException.class.getSimpleName()), m58315a(r3.toString()));
        mo38364b();
        m58321f();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4 A[ExcHandler: bxwf (r3v3 'e' bxwf A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    public final bgfc mo38357a(ajae ajae) {
        if (mo38365c()) {
            try {
                byte[] bArr = this.f70226d.get(ajae.mo38353a());
                if (bArr != null) {
                    bgfc bgfc = (bgfc) bxvk.m124016a(bgfc.f116334f, bArr, bxus.m123744c());
                    if ((bgfc.f116340e && cfop.f185115a.mo6606a().mo82207K()) || bgfc.f116337b + TimeUnit.MINUTES.toMillis((long) this.f70230h.mo38427m().f168870i) >= this.f70229g.mo20505a()) {
                        return bgfc;
                    }
                    if (mo38365c()) {
                        this.f70226d.delete(ajae.mo38353a());
                    }
                    return null;
                }
            } catch (LevelDbCorruptionException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajaf", "c", 538, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68426a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", ajae, m58315a(LevelDbCorruptionException.class.getSimpleName()), m58315a(e.toString()));
                mo38364b();
                m58321f();
            } catch (LevelDbException e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("ajaf", "c", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68426a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", ajae, m58315a(LevelDbException.class.getSimpleName()), m58315a(e2.toString()));
            } catch (bxwf e3) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final bgfc mo38358a(Collection collection) {
        bxvd da = bgfc.f116334f.mo74144da();
        long a = this.f70229g.mo20505a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bgfc bgfc = (bgfc) da.f164949b;
        bgfc.f116336a |= 1;
        bgfc.f116337b = a;
        if (!bgfc.f116338c.mo73666a()) {
            bgfc.f116338c = bxvk.m124021a(bgfc.f116338c);
        }
        bxsy.m123078a(collection, bgfc.f116338c);
        return (bgfc) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo38359a() {
        if (mo38365c()) {
            srn srn = ahfq.f67120a;
            mo38364b();
            m58321f();
        }
    }

    /* renamed from: a */
    public final void mo38360a(WriteBatch writeBatch) {
        if (mo38365c()) {
            try {
                this.f70226d.write(writeBatch);
            } catch (LevelDbCorruptionException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajaf", "a", 510, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68425a("%s Database failed during WriteBatch because of %s, %s", "BeaconMessageCache:", m58315a(LevelDbCorruptionException.class.getSimpleName()), m58315a(e.toString()));
                mo38364b();
                m58321f();
            } catch (LevelDbException e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("ajaf", "a", 518, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68425a("%s Database failed during WriteBatch because of %s, %s", "BeaconMessageCache:", m58315a(LevelDbException.class.getSimpleName()), m58315a(e2.toString()));
            } catch (Throwable th) {
                writeBatch.close();
                throw th;
            }
            writeBatch.close();
        }
    }

    /* renamed from: a */
    public final void mo38361a(Set<ajae> set, boolean z) {
        if (mo38365c()) {
            if (!z) {
                HashSet hashSet = new HashSet(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ajae ajae = (ajae) it.next();
                    if (mo38363b(ajae) == null) {
                        hashSet.add(ajae);
                    }
                }
                set = hashSet;
            }
            srn srn = ahfq.f67120a;
            set.size();
            WriteBatch create = WriteBatch.create();
            for (ajae ajae2 : set) {
                m58317a(create, ajae2, bnon.f131923a, false);
            }
            mo38360a(create);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnot.b(java.lang.Object, java.lang.Iterable):void
     arg types: [ajae, java.util.Collection]
     candidates:
      bndd.b(bndd, int):void
      bndl.b(java.lang.Object, java.lang.Object):boolean
      bnmu.b(java.lang.Object, java.lang.Object):boolean
      bnmu.b(java.lang.Object, java.lang.Object):boolean
      bnot.b(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final void mo38362a(byzr[] byzrArr, boolean z) {
        if (mo38365c()) {
            bnge s = bnge.m109299s();
            for (byzr byzr : byzrArr) {
                bxwc bxwc = byzr.f169155d;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    s.mo67268a(new ajae((byys) bxwc.get(i)), byzr);
                }
                bxwc bxwc2 = byzr.f169156e;
                int size2 = bxwc2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    s.mo67268a(new ajae((String) bxwc2.get(i2)), byzr);
                }
            }
            for (ajae ajae : s.mo67316o()) {
                HashMap hashMap = new HashMap();
                Set<byzr> b = mo38363b(ajae);
                if (b != null) {
                    for (byzr byzr2 : b) {
                        byze byze = byzr2.f169154c;
                        if (byze == null) {
                            byze = byze.f169064e;
                        }
                        hashMap.put(byze, byzr2);
                    }
                }
                for (byzr byzr3 : s.mo67361a(ajae)) {
                    byze byze2 = byzr3.f169154c;
                    if (byze2 == null) {
                        byze2 = byze.f169064e;
                    }
                    hashMap.put(byze2, byzr3);
                }
                s.mo67363b((Object) ajae, (Iterable) hashMap.values());
            }
            srn srn = ahfq.f67120a;
            s.mo67316o().size();
            int length = byzrArr.length;
            s.mo67316o();
            WriteBatch create = WriteBatch.create();
            for (ajae ajae2 : s.mo67316o()) {
                m58317a(create, ajae2, s.mo67127c(ajae2), z);
            }
            mo38360a(create);
        }
    }
}
