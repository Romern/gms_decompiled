package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

/* renamed from: chp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chp implements chj {

    /* renamed from: a */
    private final chx f6871a;

    /* renamed from: b */
    private final File f6872b;

    /* renamed from: c */
    private final chn f6873c = new chn();

    /* renamed from: d */
    private cck f6874d;

    @Deprecated
    public chp(File file) {
        this.f6872b = file;
        this.f6871a = new chx();
    }

    /* renamed from: a */
    private final synchronized cck m4279a() {
        if (this.f6874d == null) {
            File file = this.f6872b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    cck.m3946a(file2, file3, false);
                }
            }
            cck cck = new cck(file);
            if (cck.f6488b.exists()) {
                try {
                    cck.mo3705a();
                    cck.m3945a(cck.f6489c);
                    Iterator it = cck.f6493g.values().iterator();
                    while (it.hasNext()) {
                        cci cci = (cci) it.next();
                        if (cci.f6484f != null) {
                            cci.f6484f = null;
                            for (int i = 0; i < cck.f6490d; i = 1) {
                                cck.m3945a(cci.mo3702b());
                                cck.m3945a(cci.mo3703c());
                            }
                            it.remove();
                        } else {
                            for (int i2 = 0; i2 < cck.f6490d; i2 = 1) {
                                cck.f6491e += cci.f6480b[0];
                            }
                        }
                    }
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    String valueOf = String.valueOf(file);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    cck.close();
                    ccn.m3961a(cck.f6487a);
                }
                this.f6874d = cck;
            }
            file.mkdirs();
            cck = new cck(file);
            cck.mo3708b();
            this.f6874d = cck;
        }
        return this.f6874d;
    }

    /* renamed from: a */
    public final File mo3902a(cdg cdg) {
        try {
            ccj a = m4279a().mo3704a(this.f6871a.mo3909a(cdg));
            if (a != null) {
                return a.f6486a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo3903a(cdg cdg, cez cez) {
        chl chl;
        chn chn;
        File c;
        String a = this.f6871a.mo3909a(cdg);
        chn chn2 = this.f6873c;
        synchronized (chn2) {
            chl = (chl) chn2.f6868a.get(a);
            if (chl == null) {
                chm chm = chn2.f6869b;
                synchronized (chm.f6867a) {
                    chl = (chl) chm.f6867a.poll();
                }
                if (chl == null) {
                    chl = new chl();
                }
                chn2.f6868a.put(a, chl);
            }
            chl.f6866b++;
        }
        chl.f6865a.lock();
        try {
            cck a2 = m4279a();
            if (a2.mo3704a(a) == null) {
                cch b = a2.mo3707b(a);
                if (b == null) {
                    throw new IllegalStateException(a.length() == 0 ? new String("Had two simultaneous puts for: ") : "Had two simultaneous puts for: ".concat(a));
                }
                try {
                    synchronized (b.f6478d) {
                        cci cci = b.f6475a;
                        if (cci.f6484f == b) {
                            if (!cci.f6483e) {
                                b.f6476b[0] = true;
                            }
                            c = cci.mo3703c();
                            if (!b.f6478d.f6487a.exists()) {
                                b.f6478d.f6487a.mkdirs();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (cez.f6644a.mo3725a(cez.f6645b, c, cez.f6646c)) {
                        b.f6478d.mo3706a(b, true);
                        b.f6477c = true;
                    }
                    b.mo3700b();
                    chn = this.f6873c;
                    chn.mo3904a(a);
                } catch (Throwable th) {
                    b.mo3700b();
                    throw th;
                }
            } else {
                chn = this.f6873c;
                chn.mo3904a(a);
            }
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th2) {
                this.f6873c.mo3904a(a);
                throw th2;
            }
        }
    }
}
