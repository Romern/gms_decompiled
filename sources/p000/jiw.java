package p000;

import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jiw implements Runnable {

    /* renamed from: a */
    public final jix f22582a;

    /* renamed from: b */
    private final neg f22583b;

    /* renamed from: c */
    private final WeakReference f22584c;

    public jiw(jix jix, neg neg, jiy jiy) {
        this.f22582a = jix;
        this.f22583b = neg;
        this.f22584c = new WeakReference(jiy);
    }

    /* renamed from: a */
    private final void m16781a(jiy jiy) {
        jiv jiv = new jiv(this);
        aucb a = this.f22583b.mo20514a(jiv, this.f22582a.f22585a);
        try {
            aucu.m76783a(a, 5, TimeUnit.SECONDS);
            if (a.mo50384b()) {
                jiy.f22592e.put(this.f22582a.f22586b, jiv);
            }
            m16782a(a.mo50384b());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            jiy.f22588a.mo25417e("Error starting updates.", e, new Object[0]);
            m16782a(false);
        }
    }

    /* renamed from: b */
    private final void m16783b(jiy jiy) {
        nej nej = (nej) jiy.f22592e.get(this.f22582a.f22586b);
        if (nej == null) {
            jiy.f22588a.mo25416d("stopScan() was called without a previous call to startScan().", new Object[0]);
            m16782a(false);
            return;
        }
        aucb a = this.f22583b.mo20513a(nej);
        try {
            aucu.m76783a(a, 5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            jiy.f22588a.mo25417e("Error stopping updates.", e, new Object[0]);
        }
        jiy.f22592e.remove(this.f22582a.f22586b);
        m16782a(a.mo50384b());
    }

    public final void run() {
        jiy jiy = (jiy) this.f22584c.get();
        if (jiy == null) {
            jiy.f22588a.mo25418e("BleBackgroundScanner was GC'ed before one of the tasks it ran.", new Object[0]);
            return;
        }
        aucb a = this.f22583b.mo20512a();
        try {
            aucu.m76783a(a, 5, TimeUnit.SECONDS);
            if (!jiy.f22590c && (a.mo50386d() == null || !((Boolean) a.mo50386d()).booleanValue())) {
                jiy.f22588a.mo25418e("Offloaded filtering is unavailable.", new Object[0]);
                m16782a(false);
            } else if (this.f22582a.f22585a != null) {
                m16781a(jiy);
            } else {
                m16783b(jiy);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            jiy.f22588a.mo25418e("Offloaded filtering is unavailable.", new Object[0]);
            m16782a(false);
        }
    }

    /* renamed from: a */
    private final void m16782a(boolean z) {
        jjb jjb = this.f22582a.f22587c;
        if (jjb != null) {
            jjb.f22604a.mo7774b();
            if (!z) {
                BleCentralChimeraService.f11094a.mo25418e("Unable to start scanning.", new Object[0]);
                jjb.f22604a.stopSelf();
                return;
            }
            jjb.f22604a.f11097d.mo14043a("start_ble_scan_result", 0);
        }
    }
}
