package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoh {

    /* renamed from: a */
    bxvd f41843a;

    /* renamed from: b */
    private final File f41844b;

    /* renamed from: c */
    private long f41845c = -1;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    public qoh(File file) {
        bxvd bxvd;
        int size;
        byte[] a;
        qoj qoj;
        this.f41844b = file;
        if (!file.isDirectory()) {
            dhb.m8476a(file);
            if (file.mkdir()) {
                Log.e("downloadstore", "Failed to create download dir");
            }
        }
        File a2 = m32560a(file);
        if (a2.exists() && (a = dft.m8323a(a2)) != null) {
            try {
                qoj = (qoj) bxvk.m124016a(qoj.f41860d, a, bxus.m123743b());
            } catch (bxwf e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("downloadstore", valueOf.length() == 0 ? new String("Failed to parse download store state: ") : "Failed to parse download store state: ".concat(valueOf));
                qoj = null;
            }
            if (qoj != null) {
                int i = qoj.f41863b;
                if (i == 1) {
                    bxvd = (bxvd) qoj.mo74142c(5);
                    bxvd.mo73625a((bxvk) qoj);
                    this.f41843a = bxvd;
                    size = ((qoj) bxvd.f164949b).f41864c.size();
                    if (size <= 0) {
                        this.f41845c = this.f41843a.mo74114v(size - 1).f41849b - 1;
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(68);
                sb.append("Discarding download store state with unexpected version: ");
                sb.append(i);
                Log.i("downloadstore", sb.toString());
            }
        }
        bxvd = m32562c();
        this.f41843a = bxvd;
        size = ((qoj) bxvd.f164949b).f41864c.size();
        if (size <= 0) {
        }
    }

    /* renamed from: a */
    private static File m32560a(File file) {
        return new File(file, "download_store.pb");
    }

    /* renamed from: c */
    private static bxvd m32562c() {
        bxvd da = qoj.f41860d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qoj qoj = (qoj) da.f164949b;
        qoj.f41862a |= 1;
        qoj.f41863b = 1;
        return da;
    }

    /* renamed from: e */
    private final int m32563e(long j) {
        for (int i = 0; i < ((qoj) this.f41843a.f164949b).f41864c.size(); i++) {
            if (j == this.f41843a.mo74114v(i).f41849b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final synchronized void mo24166b() {
        File[] listFiles = this.f41844b.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        bxvd c = m32562c();
        this.f41843a = c;
        m32561a(c);
    }

    /* renamed from: d */
    public final synchronized void mo24169d(long j) {
        int e = m32563e(j);
        if (e != -1) {
            qoi v = this.f41843a.mo74114v(e);
            bxvd bxvd = this.f41843a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qoj qoj = (qoj) bxvd.f164949b;
            qoj qoj2 = qoj.f41860d;
            qoj.mo24170a();
            qoj.f41864c.remove(e);
            String str = v.f41851d;
            if (!cdjh.m133556f() && mo24163a(str) == null) {
                new File(this.f41844b, str).delete();
            }
            m32561a(this.f41843a);
            return;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Deleting a non-exisitent reocrd: ");
        sb.append(j);
        sb.toString();
    }

    /* renamed from: a */
    private final boolean m32561a(bxvd bxvd) {
        boolean z = false;
        if (dft.m8316a(((qoj) bxvd.mo74062i()).mo73642k(), new File(this.f41844b, "pending_download_store.pb"), m32560a(this.f41844b), false) > 0) {
            z = true;
        }
        if (!z) {
            Log.e("downloadstore", "Failed to write state");
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo24167b(long j) {
        int e = m32563e(j);
        if (e == -1) {
            return false;
        }
        qoi v = this.f41843a.mo74114v(e);
        bxvd bxvd = this.f41843a;
        bxvd bxvd2 = (bxvd) v.mo74142c(5);
        bxvd2.mo73625a((bxvk) v);
        int i = v.f41854g + 1;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qoi qoi = (qoi) bxvd2.f164949b;
        qoi qoi2 = qoi.f41846m;
        qoi.f41848a |= 32;
        qoi.f41854g = i;
        bxvd.mo74027b(e, bxvd2);
        return m32561a(this.f41843a);
    }

    /* renamed from: c */
    public final synchronized ParcelFileDescriptor mo24168c(long j) {
        int e;
        e = m32563e(j);
        if (e != -1) {
        } else {
            StringBuilder sb = new StringBuilder(37);
            sb.append("No record for id ");
            sb.append(j);
            throw new FileNotFoundException(sb.toString());
        }
        return ParcelFileDescriptor.open(new File(this.f41844b, this.f41843a.mo74114v(e).f41851d), 268435456);
    }

    /* renamed from: a */
    public final synchronized List mo24160a() {
        return Collections.unmodifiableList(((qoj) this.f41843a.f164949b).f41864c);
    }

    /* renamed from: a */
    public final synchronized Map mo24161a(Set set, long... jArr) {
        C1223np npVar;
        int length = jArr.length;
        npVar = new C1223np(length);
        for (long j : jArr) {
            qoi a = mo24162a(j);
            if (a == null) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("No such record: ");
                sb.append(j);
                Log.w("downloadstore", sb.toString());
            } else {
                int i = a.f41852e;
                Long valueOf = Long.valueOf(j);
                if (!set.contains(valueOf)) {
                    if (i != 8) {
                        i = 16;
                    }
                }
                npVar.put(valueOf, Integer.valueOf(i));
            }
        }
        return npVar;
    }

    /* renamed from: a */
    public final synchronized qoi mo24162a(long j) {
        for (qoi qoi : Collections.unmodifiableList(((qoj) this.f41843a.f164949b).f41864c)) {
            if (j == qoi.f41849b) {
                return qoi;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized qoi mo24163a(String str) {
        for (qoi qoi : Collections.unmodifiableList(((qoj) this.f41843a.f164949b).f41864c)) {
            if (str.equals(qoi.f41851d)) {
                return qoi;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized qoi mo24164a(String str, String str2, boolean z, boolean z2, long j, long j2, boolean z3, int i) {
        synchronized (this) {
            bxvd da = qoi.f41846m.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qoi qoi = (qoi) da.f164949b;
            str2.getClass();
            int i2 = qoi.f41848a | 4;
            qoi.f41848a = i2;
            qoi.f41851d = str2;
            str.getClass();
            int i3 = i2 | 2;
            qoi.f41848a = i3;
            qoi.f41850c = str;
            long j3 = this.f41845c;
            this.f41845c = -1 + j3;
            int i4 = i3 | 1;
            qoi.f41848a = i4;
            qoi.f41849b = j3;
            int i5 = i4 | 8;
            qoi.f41848a = i5;
            qoi.f41852e = 2;
            int i6 = i5 | 16;
            qoi.f41848a = i6;
            qoi.f41853f = z;
            int i7 = i6 | 64;
            qoi.f41848a = i7;
            qoi.f41855h = j2;
            int i8 = i7 | 128;
            qoi.f41848a = i8;
            qoi.f41856i = z2;
            int i9 = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qoi.f41848a = i9;
            qoi.f41857j = j;
            int i10 = i9 | 1024;
            qoi.f41848a = i10;
            qoi.f41859l = z3;
            qoi.f41848a = i10 | 512;
            qoi.f41858k = i;
            qoi qoi2 = (qoi) da.mo74062i();
            bxvd bxvd = this.f41843a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qoj qoj = (qoj) bxvd.f164949b;
            qoj qoj2 = qoj.f41860d;
            qoi2.getClass();
            qoj.mo24170a();
            qoj.f41864c.add(qoi2);
            if (!m32561a(this.f41843a)) {
                return null;
            }
            return qoi2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo24165a(long j, int i, long j2) {
        int e = m32563e(j);
        if (e != -1) {
            qoi v = this.f41843a.mo74114v(e);
            bxvd bxvd = this.f41843a;
            bxvd bxvd2 = (bxvd) v.mo74142c(5);
            bxvd2.mo73625a((bxvk) v);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            qoi qoi = (qoi) bxvd2.f164949b;
            qoi qoi2 = qoi.f41846m;
            int i2 = qoi.f41848a | 8;
            qoi.f41848a = i2;
            qoi.f41852e = i;
            qoi.f41848a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qoi.f41857j = j2;
            bxvd.mo74027b(e, bxvd2);
            m32561a(this.f41843a);
        }
    }
}
