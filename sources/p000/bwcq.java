package p000;

import android.net.TrafficStats;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bwcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcq extends bwco implements Runnable, bwcp {

    /* renamed from: a */
    public final bwcs f158850a;

    /* renamed from: b */
    public volatile int f158851b = 1536;

    /* renamed from: c */
    public volatile int f158852c = -1;

    /* renamed from: d */
    public long f158853d;

    /* renamed from: e */
    private long f158854e = 20000;

    /* renamed from: f */
    private String f158855f = "GET";

    /* renamed from: g */
    private String f158856g;

    /* renamed from: h */
    private final String f158857h;

    /* renamed from: i */
    private final ArrayList f158858i;

    /* renamed from: j */
    private DataInputStream f158859j;

    /* renamed from: k */
    private String f158860k;

    /* renamed from: l */
    private long f158861l;

    /* renamed from: m */
    private int f158862m;

    /* renamed from: n */
    private byte[] f158863n;

    /* renamed from: o */
    private bsav f158864o;

    public bwcq(bwcs bwcs, String str) {
        this.f158850a = bwcs;
        this.f158857h = str;
        this.f158858i = new ArrayList();
    }

    /* renamed from: p */
    private final boolean m121785p() {
        return this.f158863n != null;
    }

    /* renamed from: a */
    public final synchronized int mo73485a() {
        mo73474cU();
        return this.f158862m;
    }

    /* renamed from: a */
    public final synchronized void mo73486a(String str) {
        this.f158855f = str;
    }

    /* renamed from: a */
    public final synchronized void mo73487a(byte[] bArr) {
        this.f158863n = bArr;
    }

    /* renamed from: b */
    public final synchronized void mo73472b() {
        if (mo73481g()) {
            bsat.m114960a(this.f158859j);
            bsat.m114959a(this.f158864o);
            super.mo73472b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo73489b(String str) {
        this.f158856g = str;
    }

    /* renamed from: e */
    public final synchronized long mo73490e() {
        mo73474cU();
        return this.f158861l;
    }

    /* renamed from: h */
    public final synchronized String mo73491h() {
        mo73474cU();
        return this.f158860k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final synchronized void mo73482i() {
        this.f158853d = System.currentTimeMillis();
        super.mo73482i();
    }

    /* renamed from: j */
    public final synchronized DataInputStream mo73492j() {
        mo73474cU();
        return this.f158859j;
    }

    /* renamed from: k */
    public final synchronized void mo73493k() {
        this.f158854e = 20000;
    }

    /* renamed from: n */
    public final synchronized long mo73494n() {
        return this.f158854e;
    }

    /* renamed from: o */
    public final synchronized void mo73495o() {
        if (mo73475cV() == 1) {
            mo73471a(new bwcu());
        }
    }

    public final void run() {
        bsav bsav;
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        Exception e;
        int i;
        bwcr bwcr = new bwcr(this.f158850a.f158866a);
        bwcr.f158865d = this;
        bwcr.mo70159a(mo73494n());
        bwcr.mo70161f();
        TrafficStats.setThreadStatsTag(this.f158851b);
        if (this.f158852c != -1) {
            TrafficStats.setThreadStatsUid(this.f158852c);
        }
        DataInputStream dataInputStream2 = null;
        try {
            synchronized (this) {
                mo73476cW();
                mo73482i();
                bsav = new bsav(this.f158857h, this.f158855f.equals(DataParser.CONNECT_TYPE_POST));
                try {
                    synchronized (this) {
                        if (mo73480f()) {
                            this.f158864o = bsav;
                            mo73482i();
                            String str = this.f158856g;
                            if (str == null) {
                                bsav.mo70101a("Content-Type", "application/binary");
                            } else {
                                bsav.mo70101a("Content-Type", str);
                            }
                            Iterator it = this.f158858i.iterator();
                            while (true) {
                                i = 0;
                                if (!it.hasNext()) {
                                    break;
                                }
                                String[] strArr = (String[]) it.next();
                                bsav.mo70101a(strArr[0], strArr[1]);
                            }
                            if (m121785p()) {
                                byte[] bArr = this.f158863n;
                                if (bArr != null) {
                                    i = bArr.length;
                                }
                                bsav.mo70101a("Content-Length", Integer.toString(i));
                                if (!bsav.f143909b) {
                                    String valueOf = String.valueOf(bsav.f143908a.getURL());
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                    sb.append("Can't open output stream on a GET to ");
                                    sb.append(valueOf);
                                    throw new IOException(sb.toString());
                                } else if (!bsav.f143910c) {
                                    bsav.f143910c = true;
                                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(bsav.f143908a.getOutputStream()));
                                } else {
                                    String valueOf2 = String.valueOf(bsav.f143908a.getURL());
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                                    sb2.append("The output stream to ");
                                    sb2.append(valueOf2);
                                    sb2.append(" has been opened.");
                                    throw new IOException(sb2.toString());
                                }
                            } else {
                                dataOutputStream = null;
                            }
                            try {
                                if (m121785p()) {
                                    byte[] bArr2 = this.f158863n;
                                    if (bArr2 != null) {
                                        dataOutputStream.write(bArr2);
                                    }
                                    bsat.m114961a(dataOutputStream);
                                }
                                int responseCode = bsav.f143908a.getResponseCode();
                                long contentLength = (long) bsav.f143908a.getContentLength();
                                String contentType = bsav.f143908a.getContentType();
                                if (contentType == null) {
                                    contentType = "";
                                }
                                if (!bsav.f143911d) {
                                    bsav.f143911d = true;
                                    dataInputStream = new DataInputStream(new BufferedInputStream(bsav.f143908a.getInputStream()));
                                    try {
                                        mo73482i();
                                        synchronized (this) {
                                            if (mo73480f()) {
                                                this.f158862m = responseCode;
                                                this.f158861l = contentLength;
                                                this.f158860k = contentType;
                                                this.f158859j = dataInputStream;
                                                mo73477cX();
                                                bwcr.mo70150a();
                                                TrafficStats.clearThreadStatsTag();
                                                TrafficStats.clearThreadStatsUid();
                                                return;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                    } catch (Throwable th) {
                                        th = th;
                                        dataInputStream2 = dataInputStream;
                                        bwcr.mo70150a();
                                        TrafficStats.clearThreadStatsTag();
                                        TrafficStats.clearThreadStatsUid();
                                        bsat.m114960a(dataInputStream2);
                                        bsat.m114961a(dataOutputStream);
                                        bsat.m114959a(bsav);
                                        throw th;
                                    }
                                } else {
                                    String valueOf3 = String.valueOf(bsav.f143908a.getURL());
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                                    sb3.append("The input stream to ");
                                    sb3.append(valueOf3);
                                    sb3.append(" has been opened.");
                                    throw new IOException(sb3.toString());
                                }
                            } catch (Exception e3) {
                                dataInputStream = null;
                                e = e3;
                                try {
                                    synchronized (this) {
                                        if (mo73475cV() == 1) {
                                            mo73471a(e);
                                        }
                                        if (mo73475cV() == 3) {
                                            bqye.m113758a(e);
                                        }
                                        bwcr.mo70150a();
                                        TrafficStats.clearThreadStatsTag();
                                        TrafficStats.clearThreadStatsUid();
                                        bsat.m114960a(dataInputStream);
                                        bsat.m114961a(dataOutputStream);
                                        bsat.m114959a(bsav);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    dataInputStream2 = dataInputStream;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bwcr.mo70150a();
                                TrafficStats.clearThreadStatsTag();
                                TrafficStats.clearThreadStatsUid();
                                bsat.m114960a(dataInputStream2);
                                bsat.m114961a(dataOutputStream);
                                bsat.m114959a(bsav);
                                throw th;
                            }
                        } else {
                            bwcr.mo70150a();
                            TrafficStats.clearThreadStatsTag();
                            TrafficStats.clearThreadStatsUid();
                            bsat.m114960a((InputStream) null);
                            bsat.m114961a((OutputStream) null);
                        }
                    }
                } catch (Exception e4) {
                    dataInputStream = null;
                    e = e4;
                    dataOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    dataOutputStream = null;
                    bwcr.mo70150a();
                    TrafficStats.clearThreadStatsTag();
                    TrafficStats.clearThreadStatsUid();
                    bsat.m114960a(dataInputStream2);
                    bsat.m114961a(dataOutputStream);
                    bsat.m114959a(bsav);
                    throw th;
                }
                bsat.m114959a(bsav);
            }
        } catch (Exception e5) {
            bsav = null;
            dataInputStream = null;
            e = e5;
            dataOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            dataOutputStream = null;
            bsav = null;
            bwcr.mo70150a();
            TrafficStats.clearThreadStatsTag();
            TrafficStats.clearThreadStatsUid();
            bsat.m114960a(dataInputStream2);
            bsat.m114961a(dataOutputStream);
            bsat.m114959a(bsav);
            throw th;
        }
        bwcr.mo70150a();
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
        bsat.m114960a(dataInputStream);
        bsat.m114961a(dataOutputStream);
        bsat.m114959a(bsav);
    }

    public final String toString() {
        int cV = mo73475cV();
        StringBuilder sb = new StringBuilder(19);
        sb.append("[state=");
        sb.append(cV);
        sb.append("]");
        return sb.toString();
    }
}
