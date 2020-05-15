package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adha {

    /* renamed from: A */
    private long f61616A = 0;

    /* renamed from: B */
    private final List f61617B = new ArrayList();

    /* renamed from: a */
    private final Context f61618a;

    /* renamed from: b */
    private final adfc f61619b;

    /* renamed from: c */
    private final adfc f61620c;

    /* renamed from: d */
    private final adfc f61621d;

    /* renamed from: e */
    private final adfc f61622e;

    /* renamed from: f */
    private final adfc f61623f;

    /* renamed from: g */
    private final adfc f61624g;

    /* renamed from: h */
    private final adfc f61625h;

    /* renamed from: i */
    private final adfc f61626i;

    /* renamed from: j */
    private final adfc f61627j;

    /* renamed from: k */
    private final adfc f61628k;

    /* renamed from: l */
    private final adfc f61629l;

    /* renamed from: m */
    private final adfc f61630m;

    /* renamed from: n */
    private final adfc f61631n;

    /* renamed from: o */
    private final adfc f61632o;

    /* renamed from: p */
    private final adfc f61633p;

    /* renamed from: q */
    private final adfc f61634q;

    /* renamed from: r */
    private final adfc f61635r;

    /* renamed from: s */
    private final adfc f61636s;

    /* renamed from: t */
    private final adfc f61637t;

    /* renamed from: u */
    private final adfc f61638u;

    /* renamed from: v */
    private final adfc f61639v;

    /* renamed from: w */
    private final adfc f61640w;

    /* renamed from: x */
    private final File f61641x;

    /* renamed from: y */
    private final adfs f61642y;

    /* renamed from: z */
    private LevelDb f61643z;

    private adha(Context context, adfd adfd, String str, LevelDb levelDb, File file, adfs adfs) {
        this.f61618a = context;
        this.f61619b = adfd.mo33415b(String.valueOf(str).concat(".InitializedWhenNullSuccess"));
        this.f61620c = adfd.mo33415b(String.valueOf(str).concat(".InitializedWhenNullFail"));
        this.f61621d = adfd.mo33415b(String.valueOf(str).concat(".InitializedWhenNullThrottle"));
        this.f61622e = adfd.mo33415b(String.valueOf(str).concat(".GetCorruptionReset"));
        this.f61623f = adfd.mo33415b(String.valueOf(str).concat(".PutCorruptionReset"));
        this.f61624g = adfd.mo33415b(String.valueOf(str).concat(".DeleteCorruptionReset"));
        this.f61625h = adfd.mo33415b(String.valueOf(str).concat(".WriteBatchCorruptionReset"));
        this.f61626i = adfd.mo33415b(String.valueOf(str).concat(".WipeAllCorruptionReset"));
        this.f61627j = adfd.mo33415b(String.valueOf(str).concat(".GetCorruptionUnhandled"));
        this.f61628k = adfd.mo33415b(String.valueOf(str).concat(".PutCorruptionUnhandled"));
        this.f61629l = adfd.mo33415b(String.valueOf(str).concat(".DeleteCorruptionUnhandled"));
        this.f61630m = adfd.mo33415b(String.valueOf(str).concat(".WriteBatchCorruptionUnhandled"));
        this.f61631n = adfd.mo33415b(String.valueOf(str).concat(".GetGenericLevelDbException"));
        this.f61632o = adfd.mo33415b(String.valueOf(str).concat(".PutGenericLevelDbException"));
        this.f61633p = adfd.mo33415b(String.valueOf(str).concat(".DeleteGenericLevelDbException"));
        this.f61634q = adfd.mo33415b(String.valueOf(str).concat(".WriteBatchGenericLevelDbException"));
        this.f61635r = adfd.mo33415b(String.valueOf(str).concat(".WipeAllGenericLevelDbException"));
        this.f61636s = adfd.mo33415b(String.valueOf(str).concat(".CorruptedDbClosed"));
        this.f61637t = adfd.mo33415b(String.valueOf(str).concat(".CorruptedDbDeleted"));
        this.f61638u = adfd.mo33415b(String.valueOf(str).concat(".CorruptedDbDeleteFailed"));
        this.f61639v = adfd.mo33415b(String.valueOf(str).concat(".CorruptedDbRecreateSuccess"));
        this.f61640w = adfd.mo33415b(String.valueOf(str).concat(".CorruptedDbRecreateFailed"));
        this.f61643z = levelDb;
        this.f61641x = file;
        this.f61642y = adfs;
        if (levelDb != null) {
            this.f61616A = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static adha m50459a(Context context, String str, File file) {
        String str2 = str.length() == 0 ? new String("DataStore") : "DataStore".concat(str);
        adfs adfs = new adfs(str2);
        return new adha(context, new adfd(context), str2, m50460a(context, file, adfs), file, adfs);
    }

    /* renamed from: e */
    private final synchronized boolean m50461e() {
        LevelDb a;
        this.f61642y.mo33423a("Reloading level DB", new Object[0]);
        bmxy.m108600b(this.f61643z == null);
        this.f61616A = SystemClock.uptimeMillis();
        a = m50460a(this.f61618a, this.f61641x, this.f61642y);
        this.f61643z = a;
        return a != null;
    }

    /* renamed from: f */
    private final synchronized void m50462f() {
        if (this.f61643z == null) {
            throw new IllegalStateException("LevelDb was null");
        }
    }

    /* renamed from: b */
    public final synchronized adgz mo33515b() {
        adgz adgz;
        m50462f();
        adgz = new adgz(this.f61643z.getSnapshot());
        this.f61617B.add(new WeakReference(adgz));
        return adgz;
    }

    /* renamed from: c */
    public final synchronized adgy mo33517c() {
        return mo33509a((adgz) null);
    }

    /* renamed from: d */
    public final synchronized void mo33519d() {
        m50462f();
        try {
            this.f61643z.deleteRange(null, null);
        } catch (LevelDbCorruptionException e) {
            if (cepo.f183226a.mo6606a().mo79560d()) {
                this.f61626i.mo33410a();
                mo33511a(e);
            }
        } catch (LevelDbException e2) {
            this.f61642y.mo33425a(e2, "Failure deleteRange from LevelDb", new Object[0]);
            this.f61635r.mo33410a();
            throw new IOException(e2);
        }
    }

    /* renamed from: c */
    public final synchronized byte[] mo33518c(byte[] bArr) {
        m50462f();
        try {
        } catch (LevelDbCorruptionException e) {
            if (cepo.f183226a.mo6606a().mo79558b()) {
                this.f61622e.mo33410a();
                mo33511a(e);
                throw new IOException("Corrupted data store on get");
            }
            this.f61627j.mo33410a();
            throw e;
        } catch (LevelDbException e2) {
            this.f61642y.mo33425a(e2, "Failure getting from LevelDb", new Object[0]);
            this.f61631n.mo33410a();
            throw new IOException(e2);
        }
        return this.f61643z.get(null, bArr);
    }

    /* renamed from: a */
    private static LevelDb m50460a(Context context, File file, adfs adfs) {
        try {
            return LevelDb.open(file);
        } catch (LevelDbException e) {
            adfu.m50331a(context, String.format("Unable to open LevelDb: %s", file), e, adfs);
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo33516b(byte[] bArr) {
        m50462f();
        try {
            this.f61643z.delete(bArr);
        } catch (LevelDbCorruptionException e) {
            if (cepo.f183226a.mo6606a().mo79557a()) {
                this.f61624g.mo33410a();
                mo33511a(e);
                throw new IOException("Corrupted data store on delete");
            }
            this.f61629l.mo33410a();
            throw e;
        } catch (LevelDbException e2) {
            this.f61642y.mo33425a(e2, "Failure deleting from LevelDb", new Object[0]);
            this.f61633p.mo33410a();
            throw new IOException(e2);
        }
    }

    /* renamed from: a */
    public final synchronized adgy mo33509a(adgz adgz) {
        LevelDb.Snapshot snapshot;
        adgy adgy;
        m50462f();
        if (adgz != null) {
            snapshot = adgz.f61614a;
        } else {
            snapshot = null;
        }
        adgy = new adgy(this.f61643z.iterator(snapshot));
        this.f61617B.add(new WeakReference(adgy));
        return adgy;
    }

    /* renamed from: a */
    public final synchronized void mo33510a(WriteBatch writeBatch) {
        m50462f();
        try {
            this.f61643z.write(writeBatch);
        } catch (LevelDbCorruptionException e) {
            if (cepo.f183226a.mo6606a().mo79561e()) {
                this.f61625h.mo33410a();
                mo33511a(e);
                throw new IOException("Corrupted data store on writeBatch");
            }
            this.f61630m.mo33410a();
            throw e;
        } catch (LevelDbException e2) {
            this.f61642y.mo33425a(e2, "Failure writing batch to LevelDb", new Object[0]);
            this.f61634q.mo33410a();
            throw new IOException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33511a(Exception exc) {
        this.f61642y.mo33425a(exc, "Datastore corrupted, removing and recreating", new Object[0]);
        try {
            for (int size = this.f61617B.size() - 1; size >= 0; size--) {
                srz.m36171a((Closeable) ((WeakReference) this.f61617B.remove(size)).get());
            }
            LevelDb levelDb = this.f61643z;
            if (levelDb != null) {
                levelDb.close();
                this.f61636s.mo33410a();
            }
            LevelDb.destroy(this.f61641x);
            this.f61637t.mo33410a();
        } catch (LevelDbException e) {
            this.f61638u.mo33410a();
            adfu.m50331a(this.f61618a, String.format("Unable to recreate corrupted LevelDb: %s", this.f61641x), e, this.f61642y);
            this.f61643z = null;
        }
        LevelDb a = m50460a(this.f61618a, this.f61641x, this.f61642y);
        this.f61643z = a;
        if (a != null) {
            this.f61639v.mo33410a();
        } else {
            this.f61640w.mo33410a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo33512a(byte[] bArr, byte[] bArr2) {
        m50462f();
        try {
            this.f61643z.put(bArr, bArr2);
        } catch (LevelDbCorruptionException e) {
            if (cepo.f183226a.mo6606a().mo79559c()) {
                this.f61623f.mo33410a();
                mo33511a(e);
                throw new IOException("Corrupted data store on put");
            }
            this.f61628k.mo33410a();
            throw e;
        } catch (LevelDbException e2) {
            this.f61642y.mo33425a(e2, "Failure writing to LevelDb", new Object[0]);
            this.f61632o.mo33410a();
            throw new IOException(e2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo33513a() {
        if (this.f61643z != null) {
            return true;
        }
        long f = cepo.f183226a.mo6606a().mo79562f();
        if (f >= 0) {
            if (SystemClock.uptimeMillis() - this.f61616A >= f) {
                if (m50461e()) {
                    this.f61619b.mo33410a();
                    return true;
                }
                this.f61620c.mo33410a();
                return false;
            }
        }
        this.f61621d.mo33410a();
        return false;
    }

    /* renamed from: a */
    public final synchronized byte[] mo33514a(byte[] bArr) {
        return mo33518c(bArr);
    }
}
