package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: jtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jtr implements jtt {

    /* renamed from: a */
    private static final sek f23197a = jsy.m17256a("ExternalDeviceInfoDB");

    /* renamed from: b */
    private static LevelDb f23198b;

    /* renamed from: c */
    private final Context f23199c;

    /* renamed from: d */
    private final jsx f23200d = jsw.m17254a();

    public jtr(Context context) {
        this.f23199c = context;
    }

    /* renamed from: c */
    private static final byte[] m17307c(Account account) {
        String valueOf = String.valueOf(account.name);
        return (valueOf.length() == 0 ? new String("l@") : "l@".concat(valueOf)).getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: d */
    private final boolean m17308d() {
        boolean e;
        synchronized (jtr.class) {
            try {
                e = m17310e();
            } catch (LevelDbException e2) {
                f23197a.mo25417e("Failed to open.", e2, new Object[0]);
                this.f23200d.mo14033a(e2);
                return m17311f();
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    /* renamed from: e */
    private final boolean m17310e() {
        synchronized (jtr.class) {
            if (f23198b != null) {
                return true;
            }
            try {
                f23198b = LevelDb.open(mo14087c());
                return true;
            } catch (UnsatisfiedLinkError e) {
                f23197a.mo25417e("LevelDb wasn't able to use native methods", e, new Object[0]);
                this.f23200d.mo14033a(e);
                return false;
            }
        }
    }

    /* renamed from: f */
    private final boolean m17311f() {
        boolean e;
        synchronized (jtr.class) {
            try {
                close();
                LevelDb.destroy(mo14087c());
                e = m17310e();
            } catch (LevelDbException e2) {
                this.f23200d.mo14033a(e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x001c A[SYNTHETIC] */
    /* renamed from: a */
    public final Map mo14081a() {
        List list;
        synchronized (jtr.class) {
            C1223np npVar = new C1223np();
            if (!m17308d()) {
                return npVar;
            }
            Context context = this.f23199c;
            for (Account account : soz.m35801d(context, context.getPackageName())) {
                synchronized (jtr.class) {
                    list = null;
                    if (m17308d()) {
                        try {
                            byte[] bArr = f23198b.get(m17309d(account));
                            if (bArr != null) {
                                list = jts.m17319a(bArr);
                            }
                        } catch (LevelDbCorruptionException e) {
                            f23197a.mo25418e("Failed to get devices for %s", account.name, e);
                            m17311f();
                        } catch (IOException e2) {
                            e = e2;
                            f23197a.mo25418e("Failed to get devices for %s", account.name, e);
                            this.f23200d.mo14033a(e);
                        } catch (siy e3) {
                            e = e3;
                            f23197a.mo25418e("Failed to get devices for %s", account.name, e);
                            this.f23200d.mo14033a(e);
                        }
                    }
                    if (list == null) {
                        npVar.put(account.name, list);
                    }
                }
            }
            return npVar;
        }
        if (list == null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* renamed from: b */
    public final boolean mo14085b() {
        synchronized (jtr.class) {
            if (!m17308d()) {
                return false;
            }
            LevelDb.Iterator it = f23198b.iterator();
            try {
                it.seekToFirst();
                boolean isValid = it.isValid();
                if (it != null) {
                    it.close();
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        throw th;
    }

    public final void close() {
        synchronized (jtr.class) {
            if (f23198b != null) {
                f23198b.close();
                f23198b = null;
            }
        }
    }

    /* renamed from: c */
    public final File mo14087c() {
        return this.f23199c.getDir("cryptauth_external_device_db", 0);
    }

    /* renamed from: d */
    private static final byte[] m17309d(Account account) {
        return account.name.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: b */
    public final boolean mo14086b(Account account) {
        return mo14082a(account) != null;
    }

    /* renamed from: a */
    public final jrn mo14082a(Account account) {
        synchronized (jtr.class) {
            if (!m17308d()) {
                return null;
            }
            try {
                byte[] bArr = f23198b.get(m17307c(account));
                if (bArr != null) {
                    jrn a = jts.m17320a(bArr, (ObjectInputStream) null);
                    return a;
                }
            } catch (LevelDbCorruptionException e) {
                f23197a.mo25418e("Failed to get local device for %s", account.name, e);
                m17311f();
            } catch (IOException e2) {
                e = e2;
                f23197a.mo25418e("Failed to get local device for %s", account.name, e);
                this.f23200d.mo14033a(e);
            } catch (siy e3) {
                e = e3;
                f23197a.mo25418e("Failed to get local device for %s", account.name, e);
                this.f23200d.mo14033a(e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo14083a(Account account, List list) {
        ObjectOutputStream objectOutputStream;
        synchronized (jtr.class) {
            if (!m17308d()) {
                return false;
            }
            try {
                LevelDb levelDb = f23198b;
                byte[] d = m17309d(account);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jts.m17321a((jrn) it.next(), objectOutputStream);
                }
                objectOutputStream.close();
                levelDb.put(d, byteArrayOutputStream.toByteArray());
                return true;
            } catch (LevelDbCorruptionException e) {
                this.f23200d.mo14033a(e);
                m17311f();
                f23197a.mo25418e("Failed to save devices for account %s. devices=%s", account.name, list);
                return false;
            } catch (IOException e2) {
                this.f23200d.mo14033a(e2);
                f23197a.mo25418e("Failed to save devices for account %s. devices=%s", account.name, list);
                return false;
            } catch (Throwable th) {
                objectOutputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14084a(Account account, jrn jrn) {
        synchronized (jtr.class) {
            if (!m17308d()) {
                return false;
            }
            try {
                f23198b.put(m17307c(account), jts.m17321a(jrn, (ObjectOutputStream) null));
                return true;
            } catch (LevelDbCorruptionException e) {
                this.f23200d.mo14033a(e);
                m17311f();
                f23197a.mo25418e("Failed to save local metadata for account %s.", account.name);
                return false;
            } catch (IOException e2) {
                this.f23200d.mo14033a(e2);
                f23197a.mo25418e("Failed to save local metadata for account %s.", account.name);
                return false;
            }
        }
    }
}
