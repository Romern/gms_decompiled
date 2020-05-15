package p000;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Future;

/* renamed from: lyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyz {

    /* renamed from: a */
    public static final lvn f33231a = new lvn("ContactsUtil");

    /* renamed from: b */
    public final Context f33232b;

    /* renamed from: c */
    private Future f33233c;

    public lyz(Context context) {
        bmxy.m108581a(context);
        this.f33232b = context;
    }

    /* renamed from: d */
    public static boolean m24693d() {
        int i = Build.VERSION.SDK_INT;
        return sfr.f44142a.mo25481a("android.permission.READ_CONTACTS") == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023 A[SYNTHETIC, Splitter:B:18:0x0023] */
    /* renamed from: a */
    public final synchronized void mo19770a() {
        bqgj bqgj;
        if (this.f33233c == null) {
            try {
                bqgj = snp.m35704b(9);
                try {
                    this.f33233c = bqgj.mo25819b(new lyy(this));
                    if (bqgj != null) {
                        bqgj.shutdown();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bqgj != null) {
                        bqgj.shutdown();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bqgj = null;
                if (bqgj != null) {
                }
                throw th;
            }
        } else {
            f33231a.logVerbose("Contacts backup async already set up", new Object[0]);
        }
    }

    /* renamed from: b */
    public final synchronized ByteArrayInputStream mo19771b() {
        mo19770a();
        return (ByteArrayInputStream) this.f33233c.get();
    }

    /* renamed from: c */
    public final synchronized void mo19772c() {
        Future future = this.f33233c;
        if (future == null) {
            f33231a.logVerbose("Contacts backup async not set up or already cancelled", new Object[0]);
            return;
        }
        future.cancel(true);
        this.f33233c = null;
    }
}
