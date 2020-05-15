package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.params.HttpParams;

/* renamed from: zya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zya implements zxw {

    /* renamed from: a */
    public static final String f56157a;

    /* renamed from: b */
    static final Status f56158b = new Status(23509, zxo.m46639a(23509));

    /* renamed from: c */
    static final Status f56159c = Status.f30111e;

    /* renamed from: d */
    static final Status f56160d = new Status(13, "Wrong checksum");

    /* renamed from: e */
    static final Status f56161e = new Status(13, "Wrong file size");

    /* renamed from: f */
    public static final Status f56162f = new Status(23512, "File system unavailable");

    /* renamed from: g */
    public final boolean f56163g;

    /* renamed from: h */
    private final ExecutorService f56164h;

    /* renamed from: i */
    private final ScheduledExecutorService f56165i;

    /* renamed from: j */
    private final File f56166j;

    /* renamed from: k */
    private final Runnable f56167k;

    /* renamed from: l */
    private final Object f56168l = new Object();

    /* renamed from: m */
    private final Map f56169m = new HashMap();

    /* renamed from: n */
    private final abop f56170n;

    static {
        StringBuilder sb = new StringBuilder(17);
        sb.append("Fonts/201515033");
        f56157a = sb.toString();
    }

    public zya(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, Context context, Runnable runnable) {
        boolean z;
        bmxy.m108582a(context, "context");
        Context applicationContext = context.getApplicationContext();
        bmxy.m108582a(executorService, "executor");
        this.f56164h = executorService;
        bmxy.m108582a(scheduledExecutorService, "scheduler");
        this.f56165i = scheduledExecutorService;
        bmxy.m108582a(runnable, "resultPump");
        this.f56167k = runnable;
        File file = new File(applicationContext.getCacheDir(), "httpclient_tmp");
        this.f56166j = file;
        if (file.isDirectory() || this.f56166j.mkdirs()) {
            z = true;
        } else {
            z = false;
        }
        this.f56163g = z;
        abop abop = new abop(applicationContext, f56157a, true);
        this.f56170n = abop;
        HttpParams httpParams = abop.f57804b;
        httpParams.setParameter("http.connection.timeout", 30000);
        httpParams.setParameter("http.socket.timeout", 10000);
    }

    /* renamed from: a */
    public final Status mo31576a(String str, zxf zxf) {
        Status status;
        if (!this.f56163g) {
            return f56162f;
        }
        zxy b = mo31583b(str, zxf);
        synchronized (b.f56148c) {
            status = b.f56150e;
        }
        return status;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r0.exists() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        p000.zyh.m46680a("FontsHttpClientDL", "Leftover temp file %s; deleting to download %s", r0, r13);
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        r13 = r12.f56165i.schedule(new p000.zxz(r11), 60000, java.util.concurrent.TimeUnit.MILLISECONDS);
        r14 = r11.f56148c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r11.f56151f != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r11.f56151f = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r12.f56164h.execute(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        throw new java.lang.IllegalStateException("Already have a timeoutFuture");
     */
    /* renamed from: b */
    public final zxy mo31583b(String str, zxf zxf) {
        bmxy.m108582a(str, "url");
        bmxy.m108582a(zxf, "spec");
        sdo.m34971a(zxf.f56088c < 2147483647L, (Object) "files must be < max int");
        File a = mo31577a(zxf.f56087b);
        synchronized (this.f56168l) {
            zxy zxy = (zxy) this.f56169m.get(str);
            if (zxy != null) {
                zyh.m46683c("FontsHttpClientDL", "Returning existing tracker for %s", str);
                return zxy;
            }
            for (Map.Entry entry : this.f56169m.entrySet()) {
                if (((zxy) entry.getValue()).f56147b.f56087b.equals(zxf.f56087b)) {
                    String str2 = (String) entry.getKey();
                    String str3 = zxf.f56087b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61 + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb.append("Requested concurrent download of two urls to one file: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    sb.append(" to ");
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            zyh.m46683c("FontsHttpClientDL", "Starting new download of %s", str);
            zxy zxy2 = new zxy(this.f56170n, str, zxf, a, this.f56167k, new zxx());
            this.f56169m.put(str, zxy2);
        }
    }

    /* renamed from: a */
    public final File mo31577a(String str) {
        return new File(this.f56166j, str);
    }

    /* renamed from: a */
    public final void mo31578a(String str, String str2) {
        zxy zxy;
        bmxy.m108582a(str, "url");
        bmxy.m108582a(str2, "filename");
        zyh.m46683c("FontsHttpClientDL", "forget(%s, %s)", str, str2);
        synchronized (this.f56168l) {
            zxy = (zxy) this.f56169m.get(str);
            if (zxy != null) {
                this.f56169m.remove(zxy.f56146a);
            }
        }
        if (zxy == null) {
            zyh.m46680a("FontsHttpClientDL", "Asked to forget %s but we weren't tracking it", str);
            return;
        }
        zxy.mo31580a(f56159c);
    }

    /* renamed from: b */
    public final byte[] mo31579b(String str) {
        return srz.m36174a(mo31577a(str));
    }
}
