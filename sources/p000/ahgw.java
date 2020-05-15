package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahgw {

    /* renamed from: a */
    public boolean f67196a = false;

    /* renamed from: b */
    private LevelDb f67197b;

    /* renamed from: c */
    private final Context f67198c;

    /* renamed from: d */
    private final String f67199d;

    /* renamed from: e */
    private final String f67200e;

    /* renamed from: f */
    private final buqh f67201f;

    public ahgw(Context context, String str, String str2) {
        this.f67198c = context;
        this.f67199d = str;
        this.f67200e = str2;
        this.f67201f = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    private static File m55733a(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath(), str2);
    }

    /* renamed from: b */
    private static void m55734b(Context context, String str, String str2) {
        try {
            LevelDb.destroy(m55733a(context, str, str2));
        } catch (LevelDbException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68432a("ahgw", "b", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Failed to delete DB, folder=%s, file=%s", str, str2);
        }
    }

    /* renamed from: e */
    private final boolean mo37106e() {
        if (this.f67196a) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68432a("ahgw", "e", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DB is explicitly closed.");
            return false;
        } else if (this.f67197b != null) {
            return true;
        } else {
            try {
                this.f67197b = LevelDb.open(m55733a(this.f67198c, this.f67199d, this.f67200e));
                return true;
            } catch (LevelDbException e) {
                bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ahgw", "e", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("Failed to create on disk store, folder=%s, file=%s", this.f67199d, this.f67200e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                bnsl bnsl3 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("ahgw", "e", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("LevelDb wasn't able to use native methods");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo36458a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo36460a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo36461a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo36463b(Object obj);

    /* renamed from: c */
    public final void mo36466c() {
        this.f67201f.mo72984b();
        LevelDb levelDb = this.f67197b;
        if (levelDb != null) {
            levelDb.close();
            this.f67197b = null;
        }
        Context context = this.f67198c;
        String str = this.f67199d;
        String str2 = this.f67200e;
        try {
            LevelDb.destroy(m55733a(context, str, str2));
        } catch (LevelDbException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68432a("ahgw", "b", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Failed to delete DB, folder=%s, file=%s", str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract byte[] mo36467c(Object obj);

    /* renamed from: d */
    public final List mo36468d() {
        this.f67201f.mo72984b();
        if (!mo37106e()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            LevelDb.Iterator it = this.f67197b.iterator();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    byte[] bArr = this.f67197b.get(it.key());
                    if (bArr != null) {
                        Object a = mo36460a(bArr);
                        if (a != null) {
                            if (mo36461a(a)) {
                                arrayList2.add(a);
                            } else {
                                arrayList.add(a);
                            }
                        }
                    }
                    it.next();
                }
            } catch (OutOfMemoryError e) {
                bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ahgw", "d", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to get all data, returning partial results");
            } catch (Throwable th) {
                if (it != null) {
                    it.close();
                }
                throw th;
            }
            if (it != null) {
                it.close();
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                mo36469d(arrayList2.get(i));
            }
            return arrayList;
        } catch (LevelDbException e2) {
            mo36466c();
            bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ahgw", "d", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get all data");
            return Collections.emptyList();
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* renamed from: a */
    public final Object mo36459a(String str) {
        this.f67201f.mo72984b();
        if (str == null) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68432a("ahgw", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("get(id) given null for DB=%s", this.f67200e);
            return null;
        }
        if (mo37106e()) {
            try {
                byte[] bArr = this.f67197b.get(str.getBytes());
                if (bArr != null) {
                    return mo36460a(bArr);
                }
            } catch (LevelDbCorruptionException e) {
                bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ahgw", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to get proto with ID=%s", str);
                mo36466c();
            } catch (LevelDbException e2) {
                bnsl bnsl3 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("ahgw", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to get proto with ID=%s", str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo36464b() {
        LevelDb levelDb = this.f67197b;
        if (levelDb != null) {
            levelDb.close();
            this.f67197b = null;
            this.f67196a = true;
        }
    }

    /* renamed from: b */
    public final boolean mo36465b(String str) {
        this.f67201f.mo72984b();
        if (!mo37106e()) {
            return false;
        }
        try {
            this.f67197b.delete(str.getBytes());
            return true;
        } catch (LevelDbCorruptionException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahgw", "b", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to delete proto with ID=%s", str);
            mo36466c();
            return false;
        } catch (LevelDbException e2) {
            bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ahgw", "b", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to delete proto with ID=%s", str);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo36470e(Object obj) {
        mo36462a(mo36463b(obj), obj);
    }

    /* renamed from: a */
    public final boolean mo36462a(String str, Object obj) {
        this.f67201f.mo72984b();
        if (str == null || obj == null) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68432a("ahgw", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("ID and object cannot be null. id=%s, object=%s", str, obj);
            return false;
        } else if (!mo37106e()) {
            return false;
        } else {
            try {
                this.f67197b.put(str.getBytes(), mo36467c(obj));
                return true;
            } catch (LevelDbCorruptionException e) {
                bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ahgw", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("Failed to save proto with ID=%s, object=%s", str, obj);
                mo36466c();
                return false;
            } catch (LevelDbException e2) {
                bnsl bnsl3 = (bnsl) ahfp.f67119a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("ahgw", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68424a("Failed to save proto with ID=%s, object=%s", str, obj);
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo36469d(Object obj) {
        return mo36465b(mo36463b(obj));
    }
}
