package p000;

import android.os.SystemClock;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bhtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtl implements bhtp {

    /* renamed from: a */
    public bhsw f119550a;

    /* renamed from: b */
    public bhsw f119551b;

    /* renamed from: c */
    public int f119552c = 0;

    /* renamed from: d */
    public long f119553d = -1;

    /* renamed from: e */
    public final File f119554e;

    /* renamed from: f */
    public final bhsx f119555f;

    /* renamed from: g */
    public final Executor f119556g;

    /* renamed from: h */
    public final Executor f119557h;

    /* renamed from: i */
    public bhty f119558i;

    /* renamed from: j */
    private final File f119559j;

    /* renamed from: k */
    private final bhuk f119560k;

    public bhtl(File file, bhsx bhsx, Executor executor, Executor executor2, bhuk bhuk) {
        this.f119554e = file;
        this.f119555f = bhsx;
        this.f119556g = executor;
        this.f119557h = executor2;
        this.f119560k = bhuk;
        bhuj.m101555a();
        this.f119559j = new File(file, "ttl2");
    }

    /* renamed from: a */
    private static final int m101523a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File file2 : listFiles) {
            i = (int) (((long) i) + file2.length());
        }
        return i;
    }

    /* renamed from: b */
    public final long mo64274b() {
        try {
            long j = this.f119553d;
            if (j == -1) {
                FileInputStream fileInputStream = new FileInputStream(this.f119559j);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte readByte = dataInputStream.readByte();
                this.f119553d = dataInputStream.readLong();
                dataInputStream.close();
                fileInputStream.close();
                if (readByte == 2) {
                    j = this.f119553d;
                } else {
                    this.f119553d = -1;
                    throw new IOException("TTL file has wrong version");
                }
            }
            return System.currentTimeMillis() - j;
        } catch (IOException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo64268a() {
        File[] listFiles = this.f119554e.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    file.delete();
                }
            }
        }
        bhsw bhsw = this.f119550a;
        if (bhsw != null && this.f119551b != null) {
            bhsw.mo64245c();
            this.f119551b.mo64245c();
            this.f119553d = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f119559j);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.write(2);
                dataOutputStream.writeLong(this.f119553d);
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                bhuj.m101555a().mo64359a("Failed to write TTL", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo64275b(int i) {
        bhuj.m101555a();
        StringBuilder sb = new StringBuilder(33);
        sb.append("L2 disk size: ");
        sb.append(i);
        sb.append(" entries");
        sb.toString();
        if (i > ((int) cggm.f186849a.mo6606a().mo83737p())) {
            bhuj.m101555a();
            mo64269a(3);
        }
    }

    /* renamed from: a */
    public final void mo64269a(int i) {
        if (this.f119550a != null && this.f119551b != null) {
            if (i != 2) {
                this.f119558i.f119598m++;
            } else {
                this.f119558i.f119596k++;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int d = this.f119550a.mo64246d();
            int d2 = this.f119551b.mo64246d();
            bhsz a = this.f119550a.mo64241a((float) cggm.f186849a.mo6606a().mo83735n());
            HashSet hashSet = new HashSet();
            Iterator it = a.f119526b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (long j : (long[]) it.next()) {
                    hashSet.add(Long.valueOf(j));
                }
            }
            for (long[] jArr : a.f119525a) {
                for (long j2 : jArr) {
                    hashSet.remove(Long.valueOf(j2));
                }
            }
            this.f119551b.mo64244b(hashSet);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(mo64274b());
            int d3 = this.f119550a.mo64246d();
            int d4 = this.f119551b.mo64246d();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            bhuk bhuk = this.f119560k;
            int i2 = (int) seconds;
            int i3 = (int) (elapsedRealtime2 - elapsedRealtime);
            bxvd da = bpod.f138479i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpod bpod = (bpod) da.f164949b;
            int i4 = bpod.f138481a | 32;
            bpod.f138481a = i4;
            bpod.f138487g = i;
            int i5 = i4 | 4;
            bpod.f138481a = i5;
            bpod.f138484d = i2;
            int i6 = i5 | 64;
            bpod.f138481a = i6;
            bpod.f138488h = i3;
            int i7 = i6 | 1;
            bpod.f138481a = i7;
            bpod.f138482b = d;
            int i8 = i7 | 2;
            bpod.f138481a = i8;
            bpod.f138483c = d2;
            int i9 = i8 | 8;
            bpod.f138481a = i9;
            bpod.f138485e = d3;
            bpod.f138481a = i9 | 16;
            bpod.f138486f = d4;
            bpod bpod2 = (bpod) da.mo74062i();
            bicx bicx = (bicx) bhuk;
            bpoh a2 = bicx.mo64530a();
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpoh bpoh = (bpoh) bxvd.f164949b;
            bpoh bpoh2 = bpoh.f138508s;
            bpoh.f138512c = 6;
            int i10 = 2 | bpoh.f138510a;
            bpoh.f138510a = i10;
            if (bpod2 != null) {
                bpod2.getClass();
                bpoh.f138522m = bpod2;
                bpoh.f138510a = i10 | 2048;
            }
            bicx.mo64534a((bpoh) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo64270a(int i, int i2, int i3) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(mo64274b());
        bhuk bhuk = this.f119560k;
        int a = m101523a(new File(this.f119554e, "l1"));
        int i4 = (int) seconds;
        int a2 = m101523a(new File(this.f119554e, "l2"));
        bxvd da = bpoc.f138470h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpoc bpoc = (bpoc) da.f164949b;
        int i5 = bpoc.f138472a | 32;
        bpoc.f138472a = i5;
        bpoc.f138478g = i;
        int i6 = i5 | 4;
        bpoc.f138472a = i6;
        bpoc.f138475d = i4;
        int i7 = i6 | 1;
        bpoc.f138472a = i7;
        bpoc.f138473b = a;
        int i8 = i7 | 2;
        bpoc.f138472a = i8;
        bpoc.f138474c = a2;
        int i9 = i8 | 8;
        bpoc.f138472a = i9;
        bpoc.f138476e = i2;
        bpoc.f138472a = i9 | 16;
        bpoc.f138477f = i3;
        bpoc bpoc2 = (bpoc) da.mo74062i();
        bicx bicx = (bicx) bhuk;
        bpoh a3 = bicx.mo64530a();
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 4;
        int i10 = bpoh.f138510a | 2;
        bpoh.f138510a = i10;
        if (bpoc2 != null) {
            bpoc2.getClass();
            bpoh.f138520k = bpoc2;
            bpoh.f138510a = i10 | 512;
        }
        bicx.mo64534a((bpoh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo64271a(Collection collection, bhtn bhtn) {
        this.f119556g.execute(new bhth(this, collection, bhtn));
    }

    /* renamed from: a */
    public final void mo64272a(Collection collection, bhto bhto) {
        this.f119556g.execute(new bhtj(this, collection, bhto));
    }

    /* renamed from: a */
    public final void mo64273a(bvoa[] bvoaArr) {
        this.f119556g.execute(new bhtg(this, bvoaArr));
    }
}
