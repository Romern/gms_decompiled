package p000;

import android.content.Context;
import android.net.Network;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: avpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpz {

    /* renamed from: d */
    private static final sek f93741d = avpq.m79020g("FileDownloader");

    /* renamed from: e */
    private static final long f93742e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    public final avpv f93743a;

    /* renamed from: b */
    public final Object f93744b;

    /* renamed from: c */
    public avpw f93745c;

    /* renamed from: f */
    private final Context f93746f;

    /* renamed from: g */
    private final WifiManager f93747g;

    /* renamed from: h */
    private final aboy f93748h;

    /* renamed from: i */
    private final String f93749i;

    /* renamed from: j */
    private final long f93750j;

    /* renamed from: k */
    private final bngx f93751k;

    /* renamed from: l */
    private final ExecutorService f93752l;

    /* renamed from: m */
    private final int f93753m;

    /* renamed from: n */
    private final avpy f93754n;

    /* renamed from: o */
    private final avqa f93755o;

    /* renamed from: p */
    private long f93756p;

    /* renamed from: q */
    private long f93757q;

    /* renamed from: r */
    private long f93758r;

    /* renamed from: s */
    private long f93759s = 0;

    /* renamed from: t */
    private boolean f93760t = false;

    public avpz(Context context, String str, avpv avpv, long j, long j2, long j3, bngx bngx, int i, avpy avpy, avqa avqa) {
        aboy aboy = new aboy(context, ((Boolean) rsv.f43636y.mo25081c()).booleanValue());
        this.f93746f = context;
        this.f93747g = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f93748h = aboy;
        sdo.m34977c(str);
        this.f93749i = str;
        sdo.m34959a(avpv);
        this.f93743a = avpv;
        this.f93756p = j;
        this.f93757q = j;
        this.f93750j = j2;
        this.f93758r = j3;
        this.f93751k = bngx;
        this.f93753m = i;
        this.f93754n = avpy;
        this.f93755o = avqa;
        this.f93744b = new Object();
        this.f93752l = new soc(1, 9);
    }

    /* renamed from: a */
    public static avpr m79028a(Context context) {
        return new avpr(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bc, code lost:
        if (r15 >= r11) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        p000.avpz.f93741d.mo25412b("Delay caused by aggressive file sync: %d ms.", java.lang.Long.valueOf(r13));
        r7.flush();
        r21.getFD().sync();
        m79029a(mo51485c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        p000.avpz.f93741d.mo25415d("Unable to close the file.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:87:0x01e7=Splitter:B:87:0x01e7, B:115:0x0269=Splitter:B:115:0x0269} */
    /* renamed from: f */
    private final void m79030f() {
        HttpURLConnection httpURLConnection;
        FileOutputStream fileOutputStream;
        boolean z;
        avpy avpy = this.f93754n;
        if (avpy != null) {
            avpy.mo51461b();
        }
        shr.m35313a(1033, 1061);
        try {
            avqa avqa = this.f93755o;
            if (avqa != null) {
                aboy aboy = this.f93748h;
                URL url = new URL(this.f93749i);
                if (avqa.f93761a.mo66813a()) {
                    httpURLConnection = aboy.mo32272a(url, (Network) avqa.f93761a.mo66814b());
                } else {
                    httpURLConnection = aboy.mo32271a(url);
                }
            } else {
                httpURLConnection = this.f93748h.mo32271a(new URL(this.f93749i));
            }
            httpURLConnection.setConnectTimeout((int) cfsd.m142759b());
            httpURLConnection.setReadTimeout((int) cfsd.f185543a.mo6606a().mo82608p());
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            long j = 0;
            if (mo51486d() + this.f93750j > 0) {
                long d = mo51486d();
                long j2 = this.f93750j;
                StringBuilder sb = new StringBuilder(27);
                sb.append("bytes=");
                sb.append(d + j2);
                sb.append("-");
                String sb2 = sb.toString();
                if (mo51484b() != -1) {
                    String valueOf = String.valueOf(sb2);
                    long j3 = this.f93750j;
                    long b = mo51484b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb3.append(valueOf);
                    sb3.append((j3 + b) - 1);
                    sb2 = sb3.toString();
                }
                httpURLConnection.setRequestProperty("Range", sb2);
            }
            bnre i = this.f93751k.listIterator();
            while (i.hasNext()) {
                C1240of ofVar = (C1240of) i.next();
                httpURLConnection.setRequestProperty((String) ofVar.f26798a, (String) ofVar.f26799b);
            }
            try {
                ((soc) this.f93752l).submit(new avpx(httpURLConnection, mo51486d() + this.f93750j > 0 ? BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR : BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)).get(cfsd.m142759b(), TimeUnit.MILLISECONDS);
                if (mo51484b() == -1) {
                    long d2 = mo51486d();
                    int i2 = Build.VERSION.SDK_INT;
                    long contentLengthLong = d2 + httpURLConnection.getContentLengthLong();
                    synchronized (this.f93744b) {
                        this.f93758r = contentLengthLong;
                    }
                    m79031g();
                }
                RandomAccessFile a = this.f93743a.mo51459a(mo51484b());
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(a.getFD());
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    try {
                        a.seek(mo51486d());
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                        byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
                        long scalb = (long) Math.scalb((float) cfru.f185530a.mo6606a().mo82583a(), -this.f93753m);
                        long j4 = 0;
                        long j5 = 0;
                        while (true) {
                            try {
                                synchronized (this.f93744b) {
                                    try {
                                        z = this.f93760t;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                                if (!z) {
                                    fileOutputStream = fileOutputStream2;
                                    long min = Math.min(16384L, mo51484b() - mo51485c());
                                    if (min <= 0) {
                                        break;
                                    }
                                    int read = bufferedInputStream.read(bArr, 0, (int) min);
                                    if (read >= 0) {
                                        bufferedOutputStream.write(bArr, 0, read);
                                        long j6 = (long) read;
                                        j5 += j6;
                                        long c = mo51485c() + j6;
                                        if (!cfsd.f185543a.mo6606a().mo82593a()) {
                                            if (!cfru.f185530a.mo6606a().mo82584b()) {
                                            }
                                            synchronized (this.f93744b) {
                                                this.f93756p = c;
                                            }
                                            m79031g();
                                            fileOutputStream2 = fileOutputStream;
                                        }
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        bufferedOutputStream.flush();
                                        fileOutputStream.getFD().sync();
                                        m79029a(c);
                                        j4 += SystemClock.elapsedRealtime() - elapsedRealtime;
                                        j5 = 0;
                                        fileOutputStream2 = fileOutputStream;
                                    }
                                } else {
                                    fileOutputStream = fileOutputStream2;
                                    throw new avps();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                                j = j4;
                                f93741d.mo25412b("Delay caused by aggressive file sync: %d ms.", Long.valueOf(j));
                                bufferedOutputStream.flush();
                                fileOutputStream.getFD().sync();
                                m79029a(mo51485c());
                                throw th;
                            }
                        }
                        while (true) {
                        }
                        shr.m35312a();
                        if (mo51485c() < mo51484b()) {
                            throw new avpt(String.format(Locale.US, "Downloaded file is smaller than expected (%d < %d).", Long.valueOf(mo51485c()), Long.valueOf(mo51484b())));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        f93741d.mo25412b("Delay caused by aggressive file sync: %d ms.", Long.valueOf(j));
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                        m79029a(mo51485c());
                        throw th;
                    }
                } catch (IOException e) {
                    if (e instanceof avpt) {
                        throw ((avpt) e);
                    } else if (!(e instanceof avps)) {
                        throw new avpt("Error when downloading file content.", e);
                    } else {
                        throw ((avps) e);
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    try {
                        a.close();
                    } catch (IOException e2) {
                        f93741d.mo25415d("Unable to close the file.", e2, new Object[0]);
                    }
                    shr.m35312a();
                    throw th5;
                }
            } catch (ExecutionException e3) {
                httpURLConnection.disconnect();
                if (bmzo.m108688b(e3) instanceof avpt) {
                    throw ((avpt) bmzo.m108688b(e3));
                }
                throw new avpt("Unknown download exception.", e3);
            } catch (InterruptedException | TimeoutException e4) {
                httpURLConnection.disconnect();
                throw new avpt("Unable to get response code.", e4);
            }
        } catch (IOException e5) {
            throw new avpt("Unable to open the network connection.", e5);
        }
    }

    /* renamed from: g */
    private final void m79031g() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bmxv bmxv = bmvz.f131120a;
        synchronized (this.f93744b) {
            if (elapsedRealtime - this.f93759s > f93742e) {
                this.f93759s = elapsedRealtime;
                avpw avpw = this.f93745c;
                if (avpw != null) {
                    bmxv = bmxv.m108566b(avpw);
                }
            }
        }
        if (bmxv.mo66813a()) {
            long b = mo51484b();
            long c = mo51485c();
            mo51486d();
            ((avpw) bmxv.mo66814b()).mo51457a(b, c);
        }
    }

    /* renamed from: b */
    public final long mo51484b() {
        long j;
        synchronized (this.f93744b) {
            j = this.f93758r;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo51485c() {
        long j;
        synchronized (this.f93744b) {
            j = this.f93756p;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo51486d() {
        long j;
        if (!cfru.f185530a.mo6606a().mo82585c()) {
            return mo51485c();
        }
        synchronized (this.f93744b) {
            j = this.f93757q;
        }
        return j;
    }

    /* renamed from: e */
    public final void mo51487e() {
        synchronized (this.f93744b) {
            avpy avpy = this.f93754n;
            if (avpy != null) {
                avpy.mo51462c();
            }
            this.f93760t = true;
        }
    }

    /* renamed from: a */
    private final void m79029a(long j) {
        synchronized (this.f93744b) {
            this.f93756p = j;
            this.f93757q = j;
        }
        m79031g();
    }

    /* renamed from: a */
    public final void mo51483a() {
        avqa avqa = this.f93755o;
        WifiManager.WifiLock wifiLock = null;
        if (avqa != null && avqa.mo51488a(this.f93746f)) {
            wifiLock = this.f93747g.createWifiLock(1, "Download system update");
            wifiLock.acquire();
        }
        try {
            m79030f();
            if (wifiLock != null) {
                wifiLock.release();
            }
        } catch (Throwable th) {
            if (wifiLock != null) {
                wifiLock.release();
            }
            throw th;
        }
    }
}
