package p000;

import android.content.res.AssetManager;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.concurrent.ScheduledFuture;

/* renamed from: zxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zxk implements Runnable {

    /* renamed from: a */
    public final bqgy f56113a;

    /* renamed from: b */
    ScheduledFuture f56114b;

    /* renamed from: c */
    private final String f56115c;

    /* renamed from: d */
    private final zxv f56116d;

    /* renamed from: e */
    private final AssetManager f56117e;

    /* renamed from: f */
    private final Object f56118f = new Object();

    /* renamed from: g */
    private Status f56119g = zxm.f56121a;

    public zxk(String str, zxv zxv, AssetManager assetManager) {
        this.f56115c = str;
        this.f56116d = zxv;
        this.f56117e = assetManager;
        this.f56113a = bqgy.m112818c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* renamed from: b */
    private final void m46633b(Status status) {
        synchronized (this.f56118f) {
            if (this.f56119g.f30115i == 23509) {
                this.f56119g = status;
                if (!this.f56113a.isDone()) {
                    this.f56113a.mo69138b(this.f56119g);
                }
                if (!this.f56114b.isDone()) {
                    this.f56114b.cancel(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31555a(Status status) {
        bmxy.m108582a(status, "cancellationStatus");
        m46633b(status);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public final void run() {
        Status status;
        long j;
        try {
            byte[] a = boav.m111020a(this.f56117e.open(this.f56115c));
            zxv zxv = this.f56116d;
            String str = this.f56115c;
            sdo.checkIfNull((Object) str, (Object) "fileName");
            sdo.checkIfNull(a, "content");
            File file = new File(zxv.f56133a, str);
            synchronized (zxv.f56135c) {
                File file2 = new File(zxv.f56133a, String.valueOf(str).concat(".tmp"));
                try {
                    zxv.mo31571a((long) a.length);
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            String valueOf = String.valueOf(file2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                            sb.append("Unable to delete ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    bobi.m111040a(a, file2);
                } catch (Exception e) {
                    zyh.m46683c("FontDisk", "Unable to write bundled font %s to %s on disk", str, file, e);
                }
                long length = (long) a.length;
                if (!zxv.mo31573a(length, file2, file)) {
                    boolean exists = file.exists();
                    if (exists) {
                        j = file.length();
                    } else {
                        j = -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FontDisk failed to take file ");
                    if (exists) {
                        sb2.append("wrong size, actual ");
                        sb2.append(j);
                        sb2.append(" != expected ");
                        sb2.append(length);
                    } else {
                        sb2.append("missing");
                    }
                    sb2.append(" at ");
                    sb2.append(file);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            status = Status.f30107a;
        } catch (Exception e2) {
            zyh.m46681a("FontsBundledExtractor", e2, "Exception in extracting assets.", new Object[0]);
            status = new Status(8, e2.getMessage());
        }
        m46633b(status);
    }
}
