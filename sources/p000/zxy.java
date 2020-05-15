package p000;

import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.concurrent.ScheduledFuture;
import org.apache.http.client.methods.HttpGet;

/* renamed from: zxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxy implements Runnable {

    /* renamed from: a */
    public final String f56146a;

    /* renamed from: b */
    public final zxf f56147b;

    /* renamed from: c */
    public final Object f56148c = new Object();

    /* renamed from: d */
    public final bqgy f56149d;

    /* renamed from: e */
    public Status f56150e = zya.f56158b;

    /* renamed from: f */
    ScheduledFuture f56151f;

    /* renamed from: g */
    private final HttpGet f56152g;

    /* renamed from: h */
    private final File f56153h;

    /* renamed from: i */
    private final Runnable f56154i;

    /* renamed from: j */
    private final abop f56155j;

    public zxy(abop abop, String str, zxf zxf, File file, Runnable runnable, zxx zxx) {
        bmxy.m108582a(abop, "httpClient");
        this.f56155j = abop;
        bmxy.m108582a(str, "url");
        this.f56146a = str;
        bmxy.m108582a(zxf, "spec");
        this.f56147b = zxf;
        bmxy.m108582a(file, "destFile");
        this.f56153h = file;
        bmxy.m108582a(runnable, "resultPump");
        this.f56154i = runnable;
        bmxy.m108582a(zxx, "downloadTagging");
        this.f56152g = new HttpGet(str);
        this.f56149d = bqgy.m112818c();
    }

    /* renamed from: a */
    private final void m46663a() {
        Status status;
        synchronized (this.f56148c) {
            status = this.f56150e;
        }
        zyh.m46683c("FontsHttpClientDL", "Pump result %s for %s", status, this.f56146a);
        if (!this.f56149d.isDone()) {
            this.f56149d.mo69138b(status);
        }
        if (!this.f56151f.isDone()) {
            this.f56151f.cancel(false);
        }
        this.f56154i.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x019c, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019d, code lost:
        p000.srz.m36171a(r1);
        p000.srz.m36171a(r7);
        p000.zxx.m46662a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (p000.cdjz.m133767b() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        p000.shr.m35316b(24577);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = r12.f56155j.execute(r12.f56152g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r2.getStatusLine().getStatusCode() != 200) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r2 = r2.getEntity();
        r7 = r12.f56153h.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r7.isDirectory() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        p000.zyh.m46680a("FontsHttpClientDL", "Restoring lost download dir %s", r7);
        r7.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r7 = r12.f56147b.f56089d.mo73780k();
        p000.bmxy.m108582a(r7, "hash");
        r8 = p000.bnzi.m110902d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r7.length != 20) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        p000.zyh.m46680a("FontsHttpClientDL", "SHA1 hash detected; bad!", new java.lang.Object[0]);
        r8 = p000.bnzi.m110901c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r7 = new java.io.FileOutputStream(r12.f56153h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9 = new p000.bnzj(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.writeTo(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r9 = null;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r9 = null;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        throw new java.io.IOException("Non-200 response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        r7 = null;
        r9 = null;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        p000.zyh.m46681a("FontsHttpClientDL", r1, "Download %s failed in an unexpected way", r12.f56146a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        monitor-enter(r12.f56148c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r12.f56150e.f30115i == 23509) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        r12.f56150e = new com.google.android.gms.common.api.Status(8, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r7 = null;
        r9 = null;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        p000.zyh.m46681a("FontsHttpClientDL", r1, "Download %s failed", r12.f56146a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        monitor-enter(r12.f56148c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fc, code lost:
        if (r12.f56150e.f30115i == 23509) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fe, code lost:
        r12.f56150e = new com.google.android.gms.common.api.Status(8, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010a, code lost:
        p000.srz.m36171a(r9);
        p000.srz.m36171a(r7);
        p000.zxx.m46662a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0115, code lost:
        monitor-enter(r12.f56148c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011a, code lost:
        if (r12.f56150e.f30115i == 23509) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        if (java.util.Arrays.equals(r9.f132401a.mo68729a().mo68740b(), r12.f56147b.f56089d.mo73780k()) == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0134, code lost:
        p000.zyh.m46680a("FontsHttpClientDL", "Wrong hash for %s", r12.f56146a);
        r12.f56150e = p000.zya.f56160d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0146, code lost:
        r1 = r12.f56153h.length();
        r7 = r12.f56147b.f56088c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (r1 != r7) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0154, code lost:
        p000.zyh.m46680a("FontsHttpClientDL", "Wrong filesize, expected %d, got %d from %s", java.lang.Long.valueOf(r7), java.lang.Long.valueOf(r12.f56153h.length()), r12.f56146a);
        r12.f56150e = p000.zya.f56161e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r12.f56150e = com.google.android.gms.common.api.Status.f30107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017d, code lost:
        r1 = r12.f56150e.mo17710c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0184, code lost:
        if (r1 == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r12.f56153h.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018d, code lost:
        m46663a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0190, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0191, code lost:
        m46663a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0194, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0116 A[SYNTHETIC] */
    public final void run() {
        synchronized (this.f56148c) {
            Status status = this.f56150e;
            if (status.f30115i != 23509) {
                zyh.m46683c("FontsHttpClientDL", "Skip download, status %s already set for %s", status, this.f56146a);
            }
        }
    }

    /* renamed from: a */
    public final void mo31580a(Status status) {
        bmxy.m108582a(status, "cancellationStatus");
        synchronized (this.f56148c) {
            Status status2 = this.f56150e;
            if (status2.f30115i == 23509) {
                this.f56150e = status;
                zyh.m46680a("FontsHttpClientDL", "Rejecting cancel for completed (%s) download of %s", status2, this.f56146a);
                try {
                    this.f56152g.abort();
                } finally {
                    m46663a();
                }
            }
        }
    }
}
