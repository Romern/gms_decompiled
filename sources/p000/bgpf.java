package p000;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: bgpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpf implements bfec {

    /* renamed from: a */
    public long f117175a = -1;

    /* renamed from: b */
    public boolean f117176b = false;

    /* renamed from: c */
    public boolean f117177c = false;

    /* renamed from: d */
    public long f117178d = 0;

    /* renamed from: e */
    public final bgnp f117179e;

    /* renamed from: f */
    int f117180f = 0;

    /* renamed from: g */
    public int f117181g = 0;

    /* renamed from: h */
    public int f117182h = 0;

    /* renamed from: i */
    private boolean f117183i = false;

    /* renamed from: j */
    private bgpe f117184j = bgpe.IDLE;

    /* renamed from: k */
    private long f117185k = -1;

    /* renamed from: l */
    private List f117186l = new ArrayList();

    /* renamed from: m */
    private long f117187m = 0;

    /* renamed from: n */
    private bffq f117188n;

    /* renamed from: o */
    private final bfjf f117189o;

    /* renamed from: p */
    private final bfjy f117190p;

    /* renamed from: q */
    private final File f117191q;

    /* renamed from: r */
    private final FileFilter f117192r = new bgpd();

    public bgpf(bgnp bgnp, bfjf bfjf, File file, bfjy bfjy) {
        this.f117179e = bgnp;
        this.f117189o = bfjf;
        this.f117190p = bfjy;
        this.f117191q = file;
    }

    /* renamed from: a */
    private final void m99686a(long j) {
        File[] listFiles;
        File[] listFiles2;
        if (j - this.f117187m >= 3600000) {
            this.f117187m = j;
            File file = this.f117191q;
            if (file != null && file.exists() && (listFiles = this.f117191q.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isDirectory()) {
                        long b = this.f117179e.mo62751f().mo62775b();
                        if (!m99687a(file2, b)) {
                            if (file2 != null && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null) {
                                int length = listFiles2.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        if (m99687a(listFiles2[i], b)) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        new Object[1][0] = file2.getPath();
                        bhcy.m100662a(file2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m99688b(long j) {
        if (j != this.f117175a) {
            String valueOf = String.valueOf(new Date(this.f117179e.mo62751f().mo62777d() + j));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Resetting alarm to: ");
            sb.append(valueOf);
            sb.toString();
            this.f117175a = j;
            this.f117179e.mo62756k().mo62917a(bgnq.SENSOR_UPLOADER, this.f117175a, null);
        }
    }

    /* renamed from: c */
    private final void m99689c(long j) {
        this.f117185k = j;
        long j2 = 7200000 + j;
        this.f117189o.mo61783a(this.f117179e.mo62751f().mo62777d() + j);
        String valueOf = String.valueOf(new Date(this.f117179e.mo62751f().mo62777d() + j2));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("Next session upload attempt will be at: ");
        sb.append(j2);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
    }

    /* renamed from: d */
    private final void m99690d() {
        bffq bffq = this.f117188n;
        if (bffq != null) {
            bffq.mo61510b();
            this.f117188n = null;
        }
        this.f117186l.clear();
        if (this.f117183i) {
            this.f117179e.mo62756k().mo62925c(bgnq.SENSOR_UPLOADER);
            this.f117183i = false;
        }
        this.f117184j = bgpe.IDLE;
        m99688b(0);
    }

    /* renamed from: e */
    private final boolean m99691e() {
        return this.f117191q != null && this.f117176b && this.f117190p.f114251i == 1;
    }

    /* renamed from: f */
    private final boolean m99692f() {
        return this.f117176b && this.f117177c;
    }

    /* renamed from: b */
    public final void mo63065b() {
        if (m99691e() && m99692f() && this.f117184j == bgpe.UPLOADING) {
            while (this.f117186l.size() > 0) {
                List list = this.f117186l;
                File file = (File) list.remove(list.size() - 1);
                if (bfgo.f113789a.mo61667b(file)) {
                    String.valueOf(file.getAbsolutePath()).concat(" locked.");
                } else {
                    String valueOf = String.valueOf(file.getName());
                    if (valueOf.length() == 0) {
                        new String("Handling session: ");
                    } else {
                        "Handling session: ".concat(valueOf);
                    }
                    bffq a = this.f117179e.mo62761p().mo62794a(file.getAbsolutePath(), this, "SensorUploader");
                    this.f117188n = a;
                    if (a != null) {
                        a.mo61506a();
                        return;
                    }
                }
            }
        }
        m99690d();
    }

    /* renamed from: c */
    public final void mo63066c() {
        boolean e = m99691e();
        boolean f = m99692f();
        if (!e || !f) {
            String c = this.f117190p.mo61814c();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 38);
            sb.append("Aborting upload. wifiConnected: ");
            sb.append(f);
            sb.append(" ");
            sb.append(c);
            sb.toString();
            m99690d();
        }
    }

    /* renamed from: a */
    private static final boolean m99687a(File file, long j) {
        long lastModified = file.lastModified();
        long j2 = j - lastModified;
        if (j2 > 604800000 || lastModified > j + 3600000) {
            return true;
        }
        if (!file.getName().equals(".lck") || j2 <= 3600000) {
            return false;
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Found old lock file in directory. Age = ");
        sb.append(j2);
        sb.toString();
        return true;
    }

    /* renamed from: a */
    public final void mo63064a() {
        File[] listFiles;
        File[] listFiles2;
        boolean z;
        if (this.f117190p.f114250h) {
            boolean z2 = false;
            do {
                bgpe bgpe = this.f117184j;
                bgpe bgpe2 = bgpe.IDLE;
                int ordinal = bgpe.ordinal();
                if (ordinal == 0) {
                    long c = this.f117179e.mo62751f().mo62776c();
                    long j = this.f117185k + 7200000;
                    if (m99691e() && c >= j) {
                        File file = this.f117191q;
                        if (file != null && file.exists() && (listFiles = this.f117191q.listFiles()) != null) {
                            int length = listFiles.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                File file2 = listFiles[i];
                                if (file2 == null || !file2.isDirectory()) {
                                    i++;
                                } else if (c - this.f117178d < 5000) {
                                    m99688b(5000 + c);
                                } else {
                                    if (!this.f117183i) {
                                        this.f117179e.mo62756k().mo62923b(bgnq.SENSOR_UPLOADER, 60000, null);
                                        if (!this.f117177c) {
                                            boolean c2 = this.f117179e.mo62759n().mo62805c();
                                            StringBuilder sb = new StringBuilder(20);
                                            sb.append("Wifi reconnect ");
                                            sb.append(c2);
                                            sb.toString();
                                        }
                                        this.f117183i = true;
                                    }
                                    this.f117184j = bgpe.WIFI_WAIT;
                                    m99689c(this.f117179e.mo62751f().mo62776c());
                                    z2 = true;
                                }
                            }
                        }
                        m99689c(c);
                        z2 = true;
                    } else if (j <= c) {
                        long j2 = this.f117175a;
                        if (j2 == -1 || j2 < c) {
                            m99688b(7200000 + c);
                        }
                    } else {
                        m99688b(j);
                    }
                    m99686a(c);
                    z2 = false;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        long j3 = this.f117185k + 1200000;
                        if (this.f117179e.mo62751f().mo62776c() >= j3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean e = m99691e();
                        boolean f = m99692f();
                        if (!z && e && f) {
                            m99688b(j3);
                            z2 = false;
                        } else {
                            StringBuilder sb2 = new StringBuilder(75);
                            sb2.append("Canceling upload. timeout: ");
                            sb2.append(z);
                            sb2.append(" goodConditions: ");
                            sb2.append(e);
                            sb2.append(" wifiConnected: ");
                            sb2.append(f);
                            sb2.toString();
                            m99690d();
                            z2 = true;
                        }
                    }
                } else if (!m99691e()) {
                    String valueOf = String.valueOf(this.f117190p.mo61814c());
                    if (valueOf.length() == 0) {
                        new String("Conditions not good for collection. ");
                    } else {
                        "Conditions not good for collection. ".concat(valueOf);
                    }
                    m99690d();
                    z2 = true;
                } else {
                    long c3 = this.f117179e.mo62751f().mo62776c();
                    long j4 = this.f117185k + 15000;
                    if (c3 < j4) {
                        m99688b(j4);
                        z2 = false;
                    } else if (m99692f()) {
                        this.f117184j = bgpe.UPLOADING;
                        this.f117186l = new ArrayList();
                        File file3 = this.f117191q;
                        if (file3 != null) {
                            File[] listFiles3 = file3.listFiles();
                            if (listFiles3 != null) {
                                for (File file4 : listFiles3) {
                                    if (file4 != null && file4.isDirectory()) {
                                        if (file4 != null && file4.isDirectory() && (listFiles2 = file4.listFiles(this.f117192r)) != null && listFiles2.length > 20) {
                                            new Object[1][0] = file4.getPath();
                                            bhcy.m100662a(file4);
                                        } else {
                                            this.f117186l.add(file4);
                                        }
                                    }
                                }
                            }
                            mo63065b();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        m99690d();
                        z2 = true;
                    }
                }
                bgpe bgpe3 = this.f117184j;
                if (bgpe != bgpe3) {
                    Object[] objArr = {bgpe, bgpe3};
                    continue;
                }
            } while (z2);
        } else if (this.f117184j != bgpe.IDLE) {
            String valueOf2 = String.valueOf(this.f117190p.mo61814c());
            if (valueOf2.length() == 0) {
                new String("Can't schedule due to sensorCollectionPolicy. Returning to idle ");
            } else {
                "Can't schedule due to sensorCollectionPolicy. Returning to idle ".concat(valueOf2);
            }
            m99690d();
        } else {
            m99686a(this.f117179e.mo62751f().mo62776c());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* renamed from: a */
    public final void mo61525a(String str) {
        File file;
        FileWriter fileWriter;
        if (ceze.f183524a.mo6606a().enableTestLogSensorIds() && (file = this.f117191q) != null) {
            try {
                File file2 = new File(file, "session_ids.txt");
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                String absolutePath = file2.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(absolutePath).length());
                sb.append("Writing session id ");
                sb.append(str);
                sb.append(" to ");
                sb.append(absolutePath);
                sb.toString();
                fileWriter = new FileWriter(file2, true);
                fileWriter.append((CharSequence) str).append(10);
                fileWriter.close();
            } catch (IOException e) {
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        this.f117180f++;
        mo63065b();
        return;
        throw th;
    }
}
