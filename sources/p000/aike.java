package p000;

import android.bluetooth.le.ScanSettings;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aike */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aike extends airo {

    /* renamed from: a */
    public ahgb f69021a;

    /* renamed from: b */
    public final List f69022b;

    /* renamed from: c */
    public final ScanSettings f69023c;

    /* renamed from: d */
    public final aacm f69024d;

    /* renamed from: e */
    private final Runnable f69025e;

    /* renamed from: f */
    private final ScheduledExecutorService f69026f;

    /* renamed from: i */
    private ahfi f69027i;

    public aike(List list, ScanSettings scanSettings, aacm aacm, Runnable runnable, ScheduledExecutorService scheduledExecutorService, ahfk ahfk) {
        super(35, ahfk);
        this.f69022b = list;
        this.f69023c = scanSettings;
        this.f69024d = aacm;
        this.f69025e = runnable;
        this.f69026f = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo37566a() {
        ahfi ahfi = this.f69027i;
        if (ahfi != null) {
            ahfi.mo36396b();
            this.f69027i = null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new aikd(this, countDownLatch).start();
        try {
            countDownLatch.await(cfnv.m140794r(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aike", "a", 2972, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Failed to stop BLE Extended included scanning, timed out after %d seconds.", cfnv.m140794r());
        }
    }

    /* renamed from: b */
    public final int mo37568b() {
        ahgb a = ahgb.m55683a();
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aike", "b", 2846, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start a BLE Extended scanner because Bluetooth is turned off or BLE scanning is not supported on this device.");
            return 4;
        }
        bqgy c = bqgy.m112818c();
        new aikc(this, a, c).start();
        try {
            c.get(cfnv.m140793q(), TimeUnit.SECONDS);
            this.f69021a = a;
            srn srn = ailf.f69111a;
            this.f69027i = ahfi.m55634a(this.f69025e, cfnv.m140791o(), this.f69026f);
            return 2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aike", "b", 2890, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Interrupted while waiting to start BLE Extended included scanning.");
            return 3;
        } catch (ExecutionException e2) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("aike", "b", 2893, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to start BLE Extended included scanning with settings %s.", mo37599c());
            return 4;
        } catch (TimeoutException e3) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e3);
            bnsl4.mo68432a("aike", "b", 2897, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68423a("Failed to start BLE Extended included scanning with settings %s in %d seconds.", mo37599c(), cfnv.m140793q());
            return 4;
        }
    }

    /* renamed from: c */
    public final String mo37599c() {
        String str;
        String str2;
        int scanMode = this.f69023c.getScanMode();
        if (scanMode == -1) {
            str = "SCAN_MODE_OPPORTUNISTIC";
        } else if (scanMode == 0) {
            str = "SCAN_MODE_LOW_POWER";
        } else if (scanMode == 1) {
            str = "SCAN_MODE_BALANCED";
        } else if (scanMode != 2) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("UNKNOWN SCAN MODE(");
            sb.append(scanMode);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "SCAN_MODE_LOW_LATENCY";
        }
        int callbackType = this.f69023c.getCallbackType();
        if (callbackType == 1) {
            str2 = "CALLBACK_TYPE_ALL_MATCHES";
        } else if (callbackType == 2) {
            str2 = "CALLBACK_TYPE_FIRST_MATCH";
        } else if (callbackType != 4) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("UNKNOWN CALLBACK TYPE(");
            sb2.append(callbackType);
            sb2.append(")");
            str2 = sb2.toString();
        } else {
            str2 = "CALLBACK_TYPE_MATCH_LOST";
        }
        long reportDelayMillis = this.f69023c.getReportDelayMillis();
        boolean legacy = this.f69023c.getLegacy();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 93 + String.valueOf(str2).length());
        sb3.append("ScanSettings [scanMode=");
        sb3.append(str);
        sb3.append(", callbackType=");
        sb3.append(str2);
        sb3.append(", reportDelayMillis=");
        sb3.append(reportDelayMillis);
        sb3.append(", legacy=");
        sb3.append(legacy);
        sb3.append("]");
        return sb3.toString();
    }
}
