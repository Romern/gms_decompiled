package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* renamed from: mze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mze implements mzc {

    /* renamed from: a */
    private static final lvn f35018a = new lvn("FullRestoreDownloader");

    /* renamed from: b */
    private final int f35019b;

    /* renamed from: c */
    private final int f35020c;

    /* renamed from: d */
    private final int f35021d;

    /* renamed from: e */
    private final Context f35022e;

    /* renamed from: f */
    private final String f35023f;

    /* renamed from: g */
    private final String f35024g;

    /* renamed from: h */
    private final Random f35025h;

    /* renamed from: i */
    private final aboy f35026i;

    /* renamed from: j */
    private long f35027j;

    /* renamed from: k */
    private long f35028k;

    /* renamed from: l */
    private boolean f35029l = false;

    /* renamed from: m */
    private final ndu f35030m;

    /* renamed from: n */
    private InputStream f35031n = null;

    /* renamed from: o */
    private HttpURLConnection f35032o = null;

    /* renamed from: p */
    private final AtomicBoolean f35033p;

    public mze(Context context, String str, String str2, aboy aboy, ndu ndu, Random random) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f35033p = atomicBoolean;
        this.f35022e = context;
        this.f35023f = str;
        this.f35024g = str2;
        this.f35026i = aboy;
        this.f35030m = ndu;
        this.f35025h = random;
        this.f35027j = 0;
        this.f35028k = -1;
        atomicBoolean.set(false);
        this.f35021d = (int) (ccnf.f179489a.mo6606a().mo76415I() * 1000);
        this.f35020c = (int) (ccnf.f179489a.mo6606a().mo76416J() * 1000);
        this.f35019b = (int) ccnf.f179489a.mo6606a().mo76417K();
        f35018a.mo25412b("Downloading from %s", str2);
    }

    /* renamed from: a */
    private final long m25807a(int i, int i2) {
        return ((long) i) + TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) i2)) + ((long) this.f35025h.nextInt(4000));
    }

    /* renamed from: b */
    private final void m25808b(int i) {
        srz.m36171a((Closeable) this.f35031n);
        this.f35031n = null;
        HttpURLConnection httpURLConnection = this.f35032o;
        if (httpURLConnection != null) {
            this.f35026i.mo32262a(httpURLConnection, i);
            this.f35032o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x035e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0383 A[SYNTHETIC] */
    /* renamed from: a */
    public final int mo20345a(byte[] bArr) {
        int i;
        long j;
        Throwable th;
        String str;
        long j2 = this.f35028k;
        long j3 = -1;
        if (j2 != -1 && this.f35027j >= j2) {
            return -1;
        }
        int j4 = (int) ccnf.f179489a.mo6606a().mo76438j();
        int i2 = 0;
        int i3 = 0;
        while (!this.f35033p.get()) {
            try {
                if (this.f35031n == null) {
                    lvn lvn = f35018a;
                    String valueOf = String.valueOf(this.f35023f);
                    lvn.mo25409a(valueOf.length() == 0 ? new String("Create http connection for ") : "Create http connection for ".concat(valueOf), new Object[0]);
                    if (this.f35024g == null) {
                        String valueOf2 = String.valueOf(this.f35023f);
                        throw new IOException(valueOf2.length() == 0 ? new String("No doc id found for package : ") : "No doc id found for package : ".concat(valueOf2));
                    }
                    String a = may.m24782a(this.f35022e, "oauth2:https://www.googleapis.com/auth/drive");
                    URL url = new URL(this.f35024g);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        HttpURLConnection a2 = this.f35026i.mo32271a(url);
                        a2.setConnectTimeout(this.f35021d);
                        a2.setRequestMethod("GET");
                        a2.setRequestProperty("User-Agent", lzu.f33299a);
                        String valueOf3 = String.valueOf(a);
                        if (valueOf3.length() == 0) {
                            try {
                                str = new String("Bearer ");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            str = "Bearer ".concat(valueOf3);
                        }
                        a2.setRequestProperty("Authorization", str);
                        long j5 = this.f35027j;
                        if (j5 > 0) {
                            try {
                                StringBuilder sb = new StringBuilder(27);
                                sb.append("bytes=");
                                sb.append(j5);
                                sb.append("-");
                                String sb2 = sb.toString();
                                a2.setRequestProperty("Range", sb2);
                                lvn lvn2 = f35018a;
                                String valueOf4 = String.valueOf(sb2);
                                lvn2.mo25409a(valueOf4.length() == 0 ? new String("Sending range request: ") : "Sending range request: ".concat(valueOf4), new Object[0]);
                            } catch (Throwable th3) {
                                th = th3;
                                this.f35030m.mo20500a(System.currentTimeMillis() - currentTimeMillis);
                                throw th;
                            }
                        } else {
                            try {
                                a2.setRequestProperty("Accept-Encoding", "gzip");
                                f35018a.mo25409a("Sending accept gzip request", new Object[0]);
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                this.f35030m.mo20500a(System.currentTimeMillis() - currentTimeMillis);
                                throw th;
                            }
                        }
                        a2.connect();
                        int responseCode = a2.getResponseCode();
                        boolean equals = "gzip".equals(a2.getContentEncoding());
                        this.f35029l = equals;
                        if (equals) {
                            try {
                                this.f35028k = -1;
                                f35018a.mo25409a("Received gzipped response", new Object[0]);
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                this.f35030m.mo20500a(System.currentTimeMillis() - currentTimeMillis);
                                throw th;
                            }
                        }
                        this.f35030m.mo20500a(System.currentTimeMillis() - currentTimeMillis);
                        lvn lvn3 = f35018a;
                        StringBuilder sb3 = new StringBuilder(49);
                        sb3.append("Drive download http response status : ");
                        sb3.append(responseCode);
                        lvn3.mo25414c(sb3.toString(), new Object[0]);
                        bxvd bxvd = this.f35030m.f35366d;
                        mrn mrn = ((mqk) bxvd.f164949b).f34291h;
                        if (mrn == null) {
                            mrn = mrn.f34444k;
                        }
                        bxvd bxvd2 = (bxvd) mrn.mo74142c(5);
                        bxvd2.mo73625a((bxvk) mrn);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        mrn mrn2 = (mrn) bxvd2.f164949b;
                        mrn2.f34446a |= 16;
                        mrn2.f34452g = responseCode;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        mqk mqk = (mqk) bxvd.f164949b;
                        mrn mrn3 = (mrn) bxvd2.mo74062i();
                        mqk mqk2 = mqk.f34276G;
                        mrn3.getClass();
                        mqk.f34291h = mrn3;
                        mqk.f34284a |= 32;
                        if (this.f35028k == -1 && !this.f35029l) {
                            long contentLength = (long) a2.getContentLength();
                            lvn lvn4 = f35018a;
                            StringBuilder sb4 = new StringBuilder(37);
                            sb4.append("ContentLength is ");
                            sb4.append(contentLength);
                            lvn4.mo25409a(sb4.toString(), new Object[0]);
                            this.f35028k = contentLength;
                        }
                        if (responseCode == 200 || responseCode == 206) {
                            this.f35032o = a2;
                            if (this.f35029l) {
                                this.f35031n = new GZIPInputStream(this.f35032o.getInputStream());
                            } else {
                                this.f35031n = a2.getInputStream();
                            }
                            this.f35030m.mo20501a(mrl.CONNECTED);
                        } else if (responseCode == 401) {
                            this.f35028k = -1;
                            this.f35026i.mo32262a(a2, responseCode);
                            Context context = this.f35022e;
                            adyd a3 = adyd.m51363a(context);
                            Account a4 = new lsp(context).mo19591a();
                            if (a4 == null) {
                                throw new mbh();
                            }
                            a3.mo33921b(a4.type, a);
                            may.m24782a(this.f35022e, "oauth2:https://www.googleapis.com/auth/drive");
                            throw new IOException("Unauthorized full data restore request");
                        } else if (responseCode != 500) {
                            this.f35028k = -1;
                            this.f35026i.mo32262a(a2, responseCode);
                            throw new mbf("Error http status for creating Drive download connection", responseCode);
                        } else {
                            this.f35028k = -1;
                            this.f35026i.mo32262a(a2, responseCode);
                            throw new IOException("Server internal error on full data retore");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        this.f35030m.mo20500a(System.currentTimeMillis() - currentTimeMillis);
                        throw th;
                    }
                }
                try {
                    try {
                        int read = this.f35031n.read(bArr);
                        if (read != -1) {
                            ndu ndu = this.f35030m;
                            mrn mrn4 = ((mqk) ndu.f35366d.f164949b).f34291h;
                            if (mrn4 == null) {
                                mrn4 = mrn.f34444k;
                            }
                            if ((mrn4.f34446a & 32) != 0) {
                                mrn mrn5 = ((mqk) ndu.f35366d.f164949b).f34291h;
                                if (mrn5 == null) {
                                    mrn5 = mrn.f34444k;
                                }
                                j = mrn5.f34453h + ((long) read);
                            } else {
                                j = (long) read;
                            }
                            bxvd bxvd3 = ndu.f35366d;
                            mrn mrn6 = ((mqk) bxvd3.f164949b).f34291h;
                            if (mrn6 == null) {
                                mrn6 = mrn.f34444k;
                            }
                            bxvd bxvd4 = (bxvd) mrn6.mo74142c(5);
                            bxvd4.mo73625a((bxvk) mrn6);
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            mrn mrn7 = (mrn) bxvd4.f164949b;
                            mrn7.f34446a |= 32;
                            mrn7.f34453h = j;
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            mqk mqk3 = (mqk) bxvd3.f164949b;
                            mrn mrn8 = (mrn) bxvd4.mo74062i();
                            mqk mqk4 = mqk.f34276G;
                            mrn8.getClass();
                            mqk3.f34291h = mrn8;
                            mqk3.f34284a |= 32;
                            long j6 = this.f35027j + ((long) read);
                            this.f35027j = j6;
                            lvn lvn5 = f35018a;
                            long j7 = this.f35028k;
                            StringBuilder sb5 = new StringBuilder(61);
                            sb5.append("Downloaded: ");
                            sb5.append(j6);
                            sb5.append(" / ");
                            sb5.append(j7);
                            sb5.append(" bytes");
                            lvn5.mo25409a(sb5.toString(), new Object[0]);
                        }
                        return read;
                    } catch (SocketTimeoutException e) {
                        e = e;
                        SocketTimeoutException socketTimeoutException = e;
                        f35018a.mo25415d("Reading next chunk on full restore - Socket timeout", socketTimeoutException, new Object[0]);
                        this.f35030m.mo20501a(mrl.TIMEOUT);
                        m25808b(500);
                        i2++;
                        if (i2 >= this.f35019b) {
                        }
                    } catch (IOException e2) {
                        e = e2;
                        IOException iOException = e;
                        f35018a.mo25415d("Reading next chunk on full restore - IOException", iOException, new Object[0]);
                        this.f35030m.mo20501a(mrl.EXCEPTION);
                        m25808b(500);
                        i = i2 + 1;
                        if (i >= this.f35019b) {
                        }
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    SocketTimeoutException socketTimeoutException2 = e;
                    f35018a.mo25415d("Reading next chunk on full restore - Socket timeout", socketTimeoutException2, new Object[0]);
                    this.f35030m.mo20501a(mrl.TIMEOUT);
                    m25808b(500);
                    i2++;
                    if (i2 >= this.f35019b) {
                        j3 = -1;
                    } else {
                        throw socketTimeoutException2;
                    }
                } catch (IOException e4) {
                    e = e4;
                    IOException iOException2 = e;
                    f35018a.mo25415d("Reading next chunk on full restore - IOException", iOException2, new Object[0]);
                    this.f35030m.mo20501a(mrl.EXCEPTION);
                    m25808b(500);
                    i = i2 + 1;
                    if (i >= this.f35019b) {
                        SystemClock.sleep(m25807a(this.f35020c, i2));
                        i2 = i;
                        j3 = -1;
                    } else {
                        throw iOException2;
                    }
                }
            } catch (Exception e5) {
                throw new mbb();
            } catch (IOException | mbb | mbf e6) {
                Throwable th7 = e6;
                if (i3 < j4) {
                    if (th7 instanceof mbf) {
                        int i4 = ((mbf) th7).f33375a;
                        if (i4 == 403 || i4 == 429) {
                            f35018a.mo25415d("Retrying HTTP connection to Drive frontend after getting http status code: %d", th7, Integer.valueOf(i4));
                        } else {
                            f35018a.mo25415d("Not retrying HTTP connection to Drive frontend after getting http status code: %d", th7, Integer.valueOf(i4));
                        }
                    } else if (th7 instanceof IOException) {
                        f35018a.mo25415d("Retrying IOException.", th7, new Object[0]);
                    } else if (!(th7 instanceof mbb) || i3 != 0) {
                        f35018a.mo25415d("Not retrying the HTTP connection.", th7, new Object[0]);
                    } else {
                        f35018a.mo25415d("Retrying AccountException.", th7, new Object[0]);
                    }
                    SystemClock.sleep(m25807a(this.f35020c, i3));
                    i3++;
                    j3 = -1;
                } else {
                    f35018a.mo25416d("Too many failed retries. Aborting.", new Object[0]);
                }
                throw th7;
            }
        }
        throw new IOException("Abort reading next data chunk due to framework timeout");
    }

    /* renamed from: a */
    public final void mo20346a(int i) {
        this.f35033p.set(true);
        m25808b(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        ndu ndu = this.f35030m;
        Context context = this.f35022e;
        bxvd bxvd = ndu.f35366d;
        mrn mrn = ((mqk) bxvd.f164949b).f34291h;
        if (mrn == null) {
            mrn = mrn.f34444k;
        }
        bxvd bxvd2 = (bxvd) mrn.mo74142c(5);
        bxvd2.mo73625a((bxvk) mrn);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mrn mrn2 = (mrn) bxvd2.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            mrn2.f34454i = i2;
            mrn2.f34446a |= 64;
            long currentTimeMillis = System.currentTimeMillis() - ndu.f35364b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            mrn mrn3 = (mrn) bxvd2.f164949b;
            mrn3.f34446a |= 4;
            mrn3.f34449d = currentTimeMillis;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mqk mqk = (mqk) bxvd.f164949b;
            mrn mrn4 = (mrn) bxvd2.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrn4.getClass();
            mqk.f34291h = mrn4;
            mqk.f34284a |= 32;
            ndu.mo20495a(context, ndu.f35366d, mqj.FULL_DATA_RESTORE);
            ndu.f35365c.f35369d.remove(ndu.f35366d);
            return;
        }
        throw null;
    }
}
