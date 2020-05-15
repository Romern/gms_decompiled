package p000;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.os.WorkSource;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.android.gms.beacon.scan.impl.LBluetoothLeScannerCompat$3;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ngj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngj extends nga {

    /* renamed from: a */
    protected final ngl f35494a;

    /* renamed from: b */
    public final ngu f35495b;

    /* renamed from: c */
    final ScanCallback f35496c;

    /* renamed from: d */
    public ScheduledFuture f35497d;

    /* renamed from: e */
    private final snf f35498e = snp.m35703a(1, 10);

    /* renamed from: f */
    private final ngn f35499f;

    /* renamed from: g */
    private ScheduledFuture f35500g;

    /* renamed from: h */
    private final Runnable f35501h = new ngh(this);

    /* renamed from: i */
    private final Runnable f35502i = new ngi(this);

    /* renamed from: j */
    private boolean f35503j = false;

    /* renamed from: k */
    private long f35504k = 0;

    /* renamed from: l */
    private int f35505l = -1;

    /* renamed from: m */
    private int f35506m = -1;

    /* renamed from: n */
    private long f35507n = -1;

    /* renamed from: o */
    private Set f35508o = null;

    /* renamed from: p */
    private WorkSource f35509p = null;

    /* renamed from: q */
    private long f35510q;

    /* renamed from: r */
    private long f35511r;

    /* renamed from: s */
    private final nhd f35512s;

    public ngj(ngl ngl, ngn ngn, nhd nhd, ngu ngu) {
        super(ngn);
        this.f35494a = ngl;
        this.f35496c = new LBluetoothLeScannerCompat$3(this, "beacon", "LBluetoothLeScannerCompat");
        this.f35512s = nhd;
        this.f35495b = ngu;
        this.f35499f = ngn;
        nha.m26245b("Using BLE 'L' hardware layer");
        ngu.f35548d = true;
        this.f35510q = m26175f();
    }

    /* renamed from: a */
    private static long m26173a(int i) {
        double d;
        if (i == 0) {
            d = ccos.f179648a.mo6606a().mo76564l();
        } else if (i == 1) {
            d = ccos.f179648a.mo6606a().mo76562j();
        } else if (i != 2) {
            d = ccos.f179648a.mo6606a().mo76565m();
        } else {
            d = ccos.f179648a.mo6606a().mo76563k();
        }
        if (d <= 0.0d) {
            return Long.MAX_VALUE;
        }
        double n = (double) ccos.f179648a.mo6606a().mo76566n();
        Double.isNaN(n);
        return (long) (n / d);
    }

    /* renamed from: a */
    public final boolean mo20585a() {
        return true;
    }

    /* renamed from: b */
    public final void mo20587b() {
        this.f35495b.mo20625f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized void mo20588c() {
        this.f35494a.mo20601a();
        this.f35505l = -1;
        this.f35507n = -1;
        this.f35506m = -1;
        this.f35508o = null;
        this.f35509p = null;
        mo20600e();
    }

    /* renamed from: d */
    public final void mo20599d() {
        this.f35495b.mo20616a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0393, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0395, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032c A[Catch:{ Exception -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x035f A[Catch:{ Exception -> 0x0129 }] */
    /* renamed from: e */
    public final synchronized void mo20600e() {
        boolean z;
        int i;
        ArrayList arrayList;
        boolean z2;
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.f35500g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f35500g = null;
            }
            if (this.f35499f.mo20603a() && this.f35499f.mo20608f() != 13) {
                mo20599d();
                int d = this.f35495b.mo20623d();
                Set<BleFilter> c = this.f35495b.mo20622c();
                long g = this.f35495b.mo20626g();
                WorkSource e = this.f35495b.mo20624e();
                if (d == 0) {
                    z = true;
                } else {
                    if (!(d == 1 || d == 2)) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (!ccos.f179648a.mo6606a().mo76557e() || d != 3) {
                            z = false;
                        }
                    }
                    z = true;
                }
                int h = this.f35495b.mo20627h();
                if (ccos.f179648a.mo6606a().mo76567o()) {
                    if (z && this.f35503j && c.equals(this.f35508o) && g == this.f35507n && d == this.f35505l && h == this.f35506m && e.equals(this.f35509p)) {
                        return;
                    }
                }
                ScheduledFuture scheduledFuture2 = this.f35497d;
                if (!z) {
                    i = d;
                } else if (scheduledFuture2 == null) {
                    i = d;
                    if (SystemClock.elapsedRealtime() - this.f35504k < ccos.m131058e()) {
                        long e2 = ccos.m131058e() + 50;
                        StringBuilder sb = new StringBuilder(67);
                        sb.append("updateOsScan() called too quickly, retry in ");
                        sb.append(e2);
                        sb.append(" ms");
                        nha.m26245b(sb.toString());
                        this.f35497d = this.f35498e.mo25814a(this.f35502i, e2, TimeUnit.MILLISECONDS);
                    }
                }
                if (this.f35503j) {
                    ngl ngl = this.f35494a;
                    ScanCallback scanCallback = this.f35496c;
                    if (ngl.f35520b == null) {
                        ngl.mo20601a();
                    }
                    if (ngl.f35520b != null) {
                        String valueOf = String.valueOf(ngx.m26237a(ngl.f35519a, "getLeState"));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb2.append("Stopping scan on delegate scanner. BT state: ");
                        sb2.append(valueOf);
                        nha.m26245b(sb2.toString());
                        try {
                            ngl.f35520b.stopScan(scanCallback);
                            ngz.m26242b(29);
                        } catch (Exception e3) {
                            ngz.m26242b(31);
                            String valueOf2 = String.valueOf(e3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                            sb3.append("Exception caught calling mLeScanner.stopScan() ");
                            sb3.append(valueOf2);
                            nha.m26245b(sb3.toString());
                            ngl.f35520b = null;
                        }
                        this.f35512s.f35563a.mo20639a(c, m26173a(3));
                        this.f35494a.mo20601a();
                        this.f35503j = false;
                    }
                    nha.m26245b("Delegate scanner is not available. stopScan ignored");
                    this.f35512s.f35563a.mo20639a(c, m26173a(3));
                    this.f35494a.mo20601a();
                    this.f35503j = false;
                }
                StringBuilder sb4 = new StringBuilder(39);
                sb4.append("Updating 'L' scan, scanMode=");
                int i3 = i;
                sb4.append(i3);
                sb4.toString();
                if (z) {
                    this.f35504k = SystemClock.elapsedRealtime();
                    if (!this.f35499f.mo20604b() || !c.isEmpty()) {
                        int i4 = -1;
                        if (c != null) {
                            arrayList = new ArrayList(c.size());
                            for (BleFilter bleFilter : c) {
                                ScanFilter.Builder builder = new ScanFilter.Builder();
                                if (!m26174a(bleFilter.f29255b)) {
                                    builder.setDeviceAddress(bleFilter.f29255b);
                                }
                                if (!m26174a(bleFilter.f29254a)) {
                                    builder.setDeviceName(bleFilter.f29254a);
                                }
                                int i5 = bleFilter.f29261h;
                                if (i5 != i4) {
                                    byte[] bArr = bleFilter.f29262i;
                                    if (bArr != null) {
                                        byte[] bArr2 = bleFilter.f29263j;
                                        if (bArr2 == null) {
                                            builder.setManufacturerData(i5, bArr);
                                        } else {
                                            builder.setManufacturerData(i5, bArr, bArr2);
                                        }
                                    }
                                }
                                ParcelUuid parcelUuid = bleFilter.f29258e;
                                if (parcelUuid != null) {
                                    byte[] bArr3 = bleFilter.f29259f;
                                    if (bArr3 != null) {
                                        byte[] bArr4 = bleFilter.f29260g;
                                        if (bArr4 == null) {
                                            builder.setServiceData(parcelUuid, bArr3);
                                        } else {
                                            builder.setServiceData(parcelUuid, bArr3, bArr4);
                                        }
                                    }
                                }
                                ParcelUuid parcelUuid2 = bleFilter.f29256c;
                                if (parcelUuid2 != null) {
                                    ParcelUuid parcelUuid3 = bleFilter.f29257d;
                                    if (parcelUuid3 == null) {
                                        builder.setServiceUuid(parcelUuid2);
                                    } else {
                                        builder.setServiceUuid(parcelUuid2, parcelUuid3);
                                    }
                                }
                                arrayList.add(builder.build());
                                i4 = -1;
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        ScanSettings.Builder scanMode = new ScanSettings.Builder().setReportDelay(g).setScanMode(i3 != 3 ? i3 : -1);
                        int i6 = Build.VERSION.SDK_INT;
                        scanMode.setCallbackType(h);
                        scanMode.setNumOfMatches(1);
                        scanMode.setMatchMode(1);
                        ScanSettings build = scanMode.build();
                        int size = arrayList.size();
                        int scanMode2 = build.getScanMode();
                        long reportDelayMillis = build.getReportDelayMillis();
                        int callbackType = build.getCallbackType();
                        int size2 = this.f35495b.f35546b.mo20631b().size();
                        String valueOf3 = String.valueOf(e);
                        int i7 = h;
                        long j = g;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + MfiClientException.TYPE_NO_ACCOUNT_INFO);
                        sb5.append("'L' hardware scan: ");
                        sb5.append(size);
                        sb5.append(" filters, scanMode=");
                        sb5.append(scanMode2);
                        sb5.append(", reportdelay=");
                        sb5.append(reportDelayMillis);
                        sb5.append(", callback type=");
                        sb5.append(callbackType);
                        sb5.append(", #clients=");
                        sb5.append(size2);
                        sb5.append(", workSource=");
                        sb5.append(valueOf3);
                        nha.m26245b(sb5.toString());
                        ngl ngl2 = this.f35494a;
                        ScanCallback scanCallback2 = this.f35496c;
                        if (ngl2.f35520b == null) {
                            ngl2.mo20601a();
                        }
                        if (ngl2.f35520b != null) {
                            String valueOf4 = String.valueOf(ngx.m26237a(ngl2.f35519a, "getLeState"));
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 39);
                            sb6.append("Starting scan on OS scanner. BT state: ");
                            sb6.append(valueOf4);
                            nha.m26245b(sb6.toString());
                            try {
                                int i8 = Build.VERSION.SDK_INT;
                                ngl2.f35520b.startScanFromSource(arrayList, build, e, scanCallback2);
                                ngz.m26242b(28);
                                z2 = true;
                            } catch (Exception e4) {
                                ngz.m26242b(30);
                                String valueOf5 = String.valueOf(e4);
                                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 48);
                                sb7.append("Exception caught calling mLeScanner.startScan() ");
                                sb7.append(valueOf5);
                                nha.m26246c(sb7.toString());
                                scanCallback2.onScanFailed(3);
                                ngl2.f35520b = null;
                            }
                            this.f35503j = z2;
                            if (!z2) {
                                this.f35512s.f35563a.mo20639a(c, m26173a(i3));
                                this.f35508o = c;
                                this.f35505l = i3;
                                this.f35507n = j;
                                this.f35509p = e;
                                this.f35506m = i7;
                                long f = (long) ((int) ccos.f179648a.mo6606a().mo76558f());
                                this.f35500g = this.f35498e.mo25769a(this.f35501h, f, f, TimeUnit.MILLISECONDS);
                            } else {
                                nha.m26245b("OS scanner could not start");
                            }
                        }
                        nha.m26245b("Delegate scanner is not available - startScan ignored");
                        z2 = false;
                        this.f35503j = z2;
                        if (!z2) {
                        }
                    } else {
                        nha.m26245b("Stopping 'L' scan: no Location filters.");
                    }
                } else {
                    if (i3 == 3) {
                        int i9 = Build.VERSION.SDK_INT;
                        nha.m26245b("ZERO_POWER is disabled.");
                    }
                    String str = i3 >= 0 ? "powered clients" : "clients";
                    nha.m26245b(str.length() == 0 ? new String("'L' hardware scan: scan stopped, no ") : "'L' hardware scan: scan stopped, no ".concat(str));
                }
                if (i3 < 0) {
                    this.f35499f.mo20605c();
                }
            }
        }
    }

    /* renamed from: f */
    private final long m26175f() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (elapsedRealtimeNanos - this.f35511r < ccos.f179648a.mo6606a().mo76560h() && this.f35511r != 0) {
            return this.f35510q;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f35511r = elapsedRealtimeNanos;
        long j = nanos - elapsedRealtimeNanos;
        this.f35510q = j;
        return j;
    }

    /* renamed from: a */
    private static boolean m26174a(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: a */
    public final void mo20598a(ScanResult scanResult, int i) {
        this.f35495b.mo20619a(new BleSighting(scanResult.getDevice(), scanResult.getScanRecord().getBytes(), scanResult.getRssi(), scanResult.getTimestampNanos() + m26175f()), i);
    }

    /* renamed from: a */
    public final synchronized void mo20583a(nej nej) {
        this.f35495b.mo20620a(nej);
        mo20600e();
    }

    /* renamed from: a */
    public final synchronized void mo20584a(boolean z) {
        this.f35495b.mo20629j();
        mo20600e();
        if (z) {
            this.f35498e.shutdown();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo20586a(BleSettings bleSettings, nej nej) {
        boolean z;
        if (this.f35495b.mo20615a(bleSettings, nej) != null) {
            mo20600e();
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
