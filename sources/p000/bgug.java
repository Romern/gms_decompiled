package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.ulr.ApiMetadata;
import java.io.Closeable;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgug implements Closeable {

    /* renamed from: a */
    public final bgui f117557a;

    /* renamed from: b */
    public final Context f117558b;

    /* renamed from: c */
    public final Object f117559c = new Object();

    /* renamed from: d */
    public LevelDb f117560d;

    public bgug(LevelDb levelDb, bgui bgui, Context context) {
        this.f117560d = levelDb;
        this.f117557a = bgui;
        this.f117558b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* renamed from: a */
    private static int m99965a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1591322833) {
            if (hashCode != 806778686) {
                if (hashCode == 2043376075 && str.equals("Delete")) {
                    c = 0;
                    if (c != 0) {
                        return 1;
                    }
                    if (c != 1) {
                        return c != 2 ? 2 : 4;
                    }
                    return 3;
                }
            } else if (str.equals("Locations")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("Activity")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    public static final bgvm m99968b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (bgvm) GeneratedMessageLite.m124016a(bgvm.f117686g, bArr, bxus.m123744c());
        } catch (bxwf e) {
            bgur.m100009a("GCoreUlr", 41, "Error deserializing datastore entry, item will be skipped", e);
            return null;
        }
    }

    public final void close() {
        synchronized (this.f117559c) {
            try {
                LevelDb levelDb = this.f117560d;
                if (levelDb != null) {
                    levelDb.close();
                }
            } catch (IllegalStateException e) {
                bgur.m100021b("GCoreUlr", "Error closing LevelDb", e);
            }
            this.f117560d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f117560d != null) {
            bgur.m100024c("GCoreUlr", 26, "LevelDb instance was not closed.");
            close();
        }
        super.finalize();
    }

    /* renamed from: a */
    public static LevelDb m99966a(String str, Context context) {
        LevelDb.Options options = new LevelDb.Options();
        options.mUseSnappy = false;
        return LevelDb.open(m99969b(str, context), options);
    }

    /* renamed from: a */
    public static boolean m99967a(LevelDb.Iterator iterator, Account account) {
        if (iterator.isValid()) {
            return new bgul(iterator.key()).mo63211a(account);
        }
        return false;
    }

    /* renamed from: b */
    static File m99969b(String str, Context context) {
        return context.getDir(str, 0);
    }

    /* renamed from: a */
    public final void mo63190a(Account account) {
        boolean z;
        String valueOf = String.valueOf(aeqm.m52397a(account));
        if (valueOf.length() == 0) {
            new String("Removing expired entries for ");
        } else {
            "Removing expired entries for ".concat(valueOf);
        }
        long r = chcs.m148246r() - 7200000;
        if (r > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        mo63191a(account, Long.MIN_VALUE, System.currentTimeMillis() - r);
    }

    /* renamed from: a */
    public final void mo63191a(Account account, long j, long j2) {
        synchronized (this.f117559c) {
            if (this.f117560d != null) {
                try {
                    int deleteRange = this.f117560d.deleteRange(bgul.m99987a(account, j2), bgul.m99992b(account, j));
                    String a = aeqm.m52397a(account);
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 93);
                    sb.append("Deleted ");
                    sb.append(deleteRange);
                    sb.append(" entries from datastore for ");
                    sb.append(a);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(" to ");
                    sb.append(j2);
                    sb.toString();
                } catch (LevelDbCorruptionException e) {
                    e = e;
                    mo63194a(e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    mo63194a(e);
                } catch (LevelDbException e3) {
                    bgur.m100012a("GCoreUlr", "Error deleting entries", e3);
                    bguz.m100120a(e3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63192a(bguf bguf, List list, long j, bgvm bgvm, String str) {
        byte[] a = mo63197a(bgvm, str);
        if (a != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bguf.mo63189a(bgul.m99990a((Account) it.next(), j, bgvm), a);
            }
        }
    }

    /* renamed from: a */
    public final void mo63193a(bguk bguk) {
        String valueOf = String.valueOf(bguk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Deleting from datastore: ");
        sb.append(valueOf);
        sb.toString();
        synchronized (this.f117559c) {
            if (this.f117560d != null) {
                bguf bguf = new bguf();
                try {
                    Iterator it = bguk.f117577f.iterator();
                    while (it.hasNext()) {
                        bguf.f117555a.delete((byte[]) it.next());
                        bguf.f117556b++;
                    }
                    mo63195a(bguf, "Delete");
                } finally {
                    bguf.mo63188a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63194a(Exception exc) {
        bgur.m100021b("GCoreUlr", "Datastore corrupted, removing and recreating", exc);
        try {
            this.f117560d.close();
            LevelDb.destroy(m99969b("ulr_db", this.f117558b));
            this.f117560d = m99966a("ulr_db", this.f117558b);
        } catch (LevelDbException e) {
            bgur.m100018b("GCoreUlr", 5, "datastore corrupted");
            bguz.m100120a(e);
            this.f117560d = null;
        } catch (IllegalStateException e2) {
            bgur.m100018b("GCoreUlr", 52, "LevelDb");
            bguz.m100120a(e2);
            this.f117560d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* renamed from: a */
    public final boolean mo63195a(bguf bguf, String str) {
        qxn qxn;
        char c;
        String str2;
        if (chcs.m148239k()) {
            qxn = bguv.m100039a();
        } else {
            qxn = null;
        }
        try {
            this.f117560d.write(bguf.f117555a);
            if (qxn != null) {
                qxn.mo24369a(bguv.m100050b("UlrProfLeveldbWriteSuccess"));
            }
            int hashCode = str.hashCode();
            if (hashCode != -1591322833) {
                if (hashCode != 806778686) {
                    if (hashCode == 2043376075 && str.equals("Delete")) {
                        c = 0;
                        if (c == 0) {
                            str2 = c != 1 ? c != 2 ? "UlrSavedMetadata" : "UlrSavedActivity" : "UlrSavedLocation";
                        } else {
                            str2 = "UlrEntitiesDeleted";
                        }
                        bguv.m100045a(str2, (long) bguf.f117556b);
                        return true;
                    }
                } else if (str.equals("Locations")) {
                    c = 1;
                    if (c == 0) {
                    }
                    bguv.m100045a(str2, (long) bguf.f117556b);
                    return true;
                }
            } else if (str.equals("Activity")) {
                c = 2;
                if (c == 0) {
                }
                bguv.m100045a(str2, (long) bguf.f117556b);
                return true;
            }
            c = 65535;
            if (c == 0) {
            }
            bguv.m100045a(str2, (long) bguf.f117556b);
            return true;
        } catch (LevelDbCorruptionException | IllegalStateException e) {
            mo63194a(e);
            if (qxn != null) {
                qxn.mo24369a(bguv.m100050b("UlrProfLeveldbWriteError"));
            }
            return false;
        } catch (LevelDbException e2) {
            if (qxn != null) {
                qxn.mo24369a(bguv.m100050b("UlrProfLeveldbWriteError"));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Error saving writebatch for '");
            sb.append(str);
            sb.append("' to datastore");
            bgur.m100009a("GCoreUlr", m99965a(str), sb.toString(), e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo63196a(List list, ApiMetadata apiMetadata, String str) {
        synchronized (this.f117559c) {
            if (this.f117560d == null) {
                return false;
            }
            bguf bguf = new bguf();
            try {
                bxvd da = bgvm.f117686g.mo74144da();
                String sio = apiMetadata.toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bgvm bgvm = (bgvm) da.f164949b;
                sio.getClass();
                bgvm.f117688a |= 4;
                bgvm.f117691d = sio;
                mo63192a(bguf, list, apiMetadata.mo71544b().longValue(), (bgvm) da.mo74062i(), str);
                boolean a = mo63195a(bguf, str);
                return a;
            } finally {
                bguf.mo63188a();
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo63197a(bgvm bgvm, String str) {
        try {
            return this.f117557a.mo63204a(bgvm.serializeToBytes());
        } catch (GeneralSecurityException e) {
            int a = m99965a(str);
            String valueOf = String.valueOf(str);
            bgur.m100009a("GCoreUlr", a, valueOf.length() == 0 ? new String("Error encrypting datastore entry for ") : "Error encrypting datastore entry for ".concat(valueOf), e);
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo63198a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return this.f117557a.mo63205b(bArr);
        } catch (GeneralSecurityException e) {
            bgur.m100009a("GCoreUlr", 41, "Error decrypting datastore entry, item will be skipped", e);
            return null;
        }
    }
}
