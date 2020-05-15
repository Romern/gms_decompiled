package p000;

import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zil extends zim implements zir {

    /* renamed from: b */
    private static final srn f55143b = zvt.m46581a();

    /* renamed from: c */
    private final zis f55144c;

    /* renamed from: d */
    private final ScheduledExecutorService f55145d;

    /* renamed from: e */
    private final Object f55146e = new Object();

    /* renamed from: f */
    private final Map f55147f = bnmt.getNewHashMap();

    /* renamed from: g */
    private boolean f55148g;

    public zil(zgf zgf, zis zis, ScheduledExecutorService scheduledExecutorService) {
        super(zgf);
        this.f55144c = zis;
        this.f55145d = scheduledExecutorService;
    }

    /* renamed from: a */
    public static bqgg m45511a(bqgg bqgg) {
        return bqdx.m112673a(bqgg, zii.f55136a, bqfb.INSTANCE);
    }

    /* renamed from: b */
    private static boolean m45512b(zgh zgh) {
        caah caah = zgh.f55011a.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return caah.equals(bzzn.f172073M);
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return this.f55149a.mo19154a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        zik zik;
        bqgg bqgg;
        if (!m45512b(zgh)) {
            return this.f55149a.mo19155a(zgh);
        }
        synchronized (this.f55146e) {
            if (this.f55147f.containsKey(zgh.f55012b)) {
                bnsl bnsl = (bnsl) f55143b.mo68388c();
                bnsl.mo68432a("zil", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Listener already registered?");
            }
            if (this.f55148g) {
                if (this.f55144c.mo31158b()) {
                    bqgg = this.f55149a.mo19155a(zgh);
                    zik = new zik(zgh, m45511a(bqgg));
                    this.f55147f.put(zgh.f55012b, zik);
                    if (!this.f55144c.mo31158b()) {
                        this.f55144c.mo31157a(this);
                    }
                }
            }
            bqgg = bqga.m112775a((Object) true);
            zik = new zik(zgh, bqga.m112775a(zij.UNREGISTERED));
            this.f55147f.put(zgh.f55012b, zik);
            if (!this.f55144c.mo31158b()) {
            }
        }
        return bqgg;
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        printWriter.print("  ConditionalSensorAdapter[");
        this.f55149a.mo19156a(printWriter);
        printWriter.print("\n]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo31154a(boolean z) {
        synchronized (this.f55146e) {
            this.f55148g = z;
            if (!this.f55147f.isEmpty()) {
                if (!z) {
                    bqgg a = bqga.m112773a(this.f55149a.mo19154a(), 5, TimeUnit.SECONDS, this.f55145d);
                    for (zik zik : this.f55147f.values()) {
                        bqgg bqgg = zik.f55142b;
                        zik.f55142b = bqga.m112783b(a, bqgg).mo69216a(new zih(this, bqgg, zik), this.f55145d);
                    }
                } else {
                    for (zik zik2 : this.f55147f.values()) {
                        zik2.f55142b = bqdx.m112674a(zik2.f55142b, new zig(this, zik2), this.f55145d);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return true;
     */
    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        synchronized (this.f55146e) {
            zik zik = (zik) this.f55147f.get(zgg);
            if (zik != null) {
                if (m45512b(zik.f55141a)) {
                    zik.f55142b = bqdx.m112673a(zik.f55142b, new zif(this, zgg), this.f55145d);
                    this.f55147f.remove(zgg);
                    if (this.f55147f.isEmpty()) {
                        this.f55144c.mo31156a();
                    }
                }
            }
            boolean a = this.f55149a.mo19160a(zgg);
            return a;
        }
    }
}
