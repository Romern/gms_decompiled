package p000;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.PowerManager;
import com.google.android.gms.nearby.discovery.fastpair.scanner.FastPairScanner$FastPairFoundScanCallback;
import java.util.concurrent.TimeUnit;

/* renamed from: ahzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzi {

    /* renamed from: a */
    public static final bnic f68464a = bnic.m109489a("fc128e");

    /* renamed from: b */
    public static final ParcelUuid f68465b = new ParcelUuid(ayod.f98113a);

    /* renamed from: c */
    public final Context f68466c;

    /* renamed from: d */
    public ahzh f68467d = ahzh.OFF;

    /* renamed from: e */
    private final buqh f68468e;

    /* renamed from: f */
    private final FastPairScanner$FastPairFoundScanCallback f68469f;

    /* renamed from: g */
    private final buqn f68470g = new ahze(this, "FastPairScannerDowngrade");

    /* renamed from: h */
    private final buqn f68471h = new ahzf(this, "FastPairScreenOffScannerUpgrade");

    public ahzi(Context context) {
        this.f68466c = context;
        this.f68468e = (buqh) ahgz.m55754a(context, buqh.class);
        int i = Build.VERSION.SDK_INT;
        this.f68469f = new FastPairScanner$FastPairFoundScanCallback(context, (ahxa) ahgz.m55754a(context, ahxa.class), this.f68468e);
    }

    /* renamed from: a */
    private final void m56898a(boolean z) {
        this.f68468e.mo72989e(this.f68470g);
        if (!mo37314f()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairScanner2: Skipping stop, already stopped scanning");
            return;
        }
        ahgb a = ahgb.m55683a();
        if (a == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairScanner2: No bluetooth adapter found to stop scanning");
        } else if (m56901h() || !cfoj.m141539T() || z) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairScanner2: Stopping scan");
            a.mo36417a(this.f68469f);
            this.f68467d = ahzh.OFF;
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairScanner2: Scanning still allowed, not stopping, just downgrading.");
            mo37312d();
            mo37310b();
        }
    }

    /* renamed from: b */
    private final void m56900b(long j) {
        this.f68468e.mo72989e(this.f68470g);
        this.f68468e.mo72983a(this.f68470g, j);
    }

    /* renamed from: h */
    private final boolean m56901h() {
        Context context = this.f68466c;
        return context != null && ((PowerManager) context.getSystemService(PowerManager.class)).isInteractive();
    }

    /* renamed from: c */
    public final void mo37311c() {
        ahzh ahzh = !m56901h() ? ahzh.SCREEN_OFF_INACTIVE_SCANNING : ahzh.LOW_POWER_SCANNING;
        if (this.f68467d.equals(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairScanner2: Already in %s scanning", this.f68467d);
            return;
        }
        mo37312d();
        if (m56899a(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairScanner2: Starting %s scanning", ahzh);
            if (ahzh.equals(ahzh.SCREEN_OFF_INACTIVE_SCANNING)) {
                long aS = cfog.f184854a.mo6606a().mo81984aS();
                ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FastPairScanner2: Starting screen off scan in %s seconds", TimeUnit.MILLISECONDS.toSeconds(aS));
                this.f68468e.mo72989e(this.f68471h);
                this.f68468e.mo72983a(this.f68471h, aS);
            }
        }
    }

    /* renamed from: d */
    public final void mo37312d() {
        m56898a(true);
    }

    /* renamed from: e */
    public final void mo37313e() {
        m56898a(false);
    }

    /* renamed from: f */
    public final boolean mo37314f() {
        return this.f68467d.equals(ahzh.LOW_LATENCY_SCANNING) || this.f68467d.equals(ahzh.LOW_POWER_SCANNING) || this.f68467d.equals(ahzh.SCREEN_OFF_ACTIVE_SCANNING) || this.f68467d.equals(ahzh.SCREEN_OFF_INACTIVE_SCANNING);
    }

    /* renamed from: g */
    public final boolean mo37315g() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FastPairScanner2: isAlive? bleEnabled:%b, btEnabled:%b, bleScanAvailable:%b", Boolean.valueOf(burl.m120296b()), Boolean.valueOf(burl.m120292a()), Boolean.valueOf(burl.m120298c()));
        return burl.m120292a() || burl.m120298c();
    }

    /* renamed from: b */
    public final void mo37310b() {
        long j;
        if (mo37314f()) {
            mo37312d();
        }
        if (m56901h()) {
            j = cfog.m141286n();
        } else {
            j = cfog.f184854a.mo6606a().mo81983aR();
        }
        ahzh ahzh = !m56901h() ? ahzh.SCREEN_OFF_ACTIVE_SCANNING : ahzh.LOW_LATENCY_SCANNING;
        if (m56899a(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68423a("FastPairScanner2: Starting %s scan for %s seconds", ahzh, TimeUnit.MILLISECONDS.toSeconds(j));
            m56900b(j);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, ahzh, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: a */
    private final boolean m56899a(ahzh ahzh) {
        ScanSettings scanSettings;
        ahgb a = ahgb.m55683a();
        if (a == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairScanner2: No bluetooth adapter available to start scanning in %s", ahzh);
            return false;
        } else if (this.f68469f == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairScanner2: API level not high enough to start scanning in %s", ahzh);
            return false;
        } else if (!mo37309a()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPairScanner2: Skipping start scanning in %s, scanning not allowed now (screen on: %s)", (Object) ahzh, m56901h());
            return false;
        } else if (this.f68467d.equals(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairScanner2: Skipping restart scanning in %s, already scanning", ahzh);
            return false;
        } else {
            this.f68467d = ahzh;
            ahzh ahzh2 = ahzh.OFF;
            int ordinal = ahzh.ordinal();
            if (ordinal == 1) {
                scanSettings = new ScanSettings.Builder().setScanMode((int) cfog.f184854a.mo6606a().mo81982aQ()).build();
            } else if (ordinal == 2) {
                scanSettings = new ScanSettings.Builder().setScanMode(-1).build();
            } else if (ordinal != 4) {
                scanSettings = new ScanSettings.Builder().setScanMode((int) cfog.m141289q()).build();
            } else {
                scanSettings = new ScanSettings.Builder().setScanMode((int) cfog.f184854a.mo6606a().mo82000ai()).build();
            }
            FastPairScanner$FastPairFoundScanCallback fastPairScanner$FastPairFoundScanCallback = this.f68469f;
            int scanMode = scanSettings.getScanMode();
            int i = FastPairScanner$FastPairFoundScanCallback.f80524c;
            fastPairScanner$FastPairFoundScanCallback.f80526b.set(scanMode);
            a.mo36418a(bngx.m109356a(new ScanFilter.Builder().setServiceData(f68465b, new byte[]{0}, new byte[]{0}).build()), scanSettings, this.f68469f);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo37308a(long j) {
        ahzh ahzh = !m56901h() ? ahzh.SCREEN_OFF_ACTIVE_SCANNING : ahzh.LOW_LATENCY_SCANNING;
        if (this.f68467d.equals(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68423a("FastPairScanner2: Already in %s scanning, downgrade after %s seconds", ahzh, TimeUnit.MILLISECONDS.toSeconds(j));
            m56900b(j);
            return;
        }
        mo37313e();
        if (m56899a(ahzh)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68423a("FastPairScanner2: Starting %s scanning for %s seconds", ahzh, TimeUnit.MILLISECONDS.toSeconds(j));
            m56900b(j);
        }
    }

    /* renamed from: a */
    public final boolean mo37309a() {
        return m56901h() || cfoj.m141539T();
    }
}
