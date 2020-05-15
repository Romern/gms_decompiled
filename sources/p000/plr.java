package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.gms.cast.discovery.BleDeviceScanner$BleScanCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: plr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plr extends ply {

    /* renamed from: a */
    public static final ParcelUuid f39606a = ParcelUuid.fromString("0000FE9F-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    public final BluetoothAdapter f39607b;

    /* renamed from: c */
    public ScheduledFuture f39608c;

    /* renamed from: d */
    public long f39609d;

    /* renamed from: k */
    private final pmn f39610k;

    /* renamed from: l */
    private final Set f39611l = new HashSet();

    /* renamed from: m */
    private boolean f39612m = true;

    /* renamed from: n */
    private BluetoothLeScanner f39613n;

    /* renamed from: o */
    private ScanCallback f39614o;

    /* renamed from: p */
    private ScheduledFuture f39615p;

    /* renamed from: q */
    private long f39616q;

    /* renamed from: r */
    private long f39617r;

    protected plr(Context context, ScheduledExecutorService scheduledExecutorService, phy phy, poj poj, BluetoothManager bluetoothManager, pmn pmn) {
        super(context, scheduledExecutorService, phy, "BLE", poj);
        this.f39607b = bluetoothManager.getAdapter();
        this.f39610k = pmn;
    }

    /* renamed from: e */
    private final void m30786e() {
        BluetoothAdapter bluetoothAdapter = this.f39607b;
        if (bluetoothAdapter != null) {
            if (bluetoothAdapter.isEnabled()) {
                mo23385b();
            }
            ScheduledFuture scheduledFuture = this.f39608c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f39608c = null;
            }
            ScheduledFuture scheduledFuture2 = this.f39615p;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
                this.f39615p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23382a() {
        if (this.f39607b != null) {
            this.f39610k.mo23424a(this);
            m30786e();
        }
    }

    /* renamed from: c */
    public final void mo23387c() {
        if (!this.f39607b.isEnabled()) {
            return;
        }
        if (this.f39645j) {
            long currentTimeMillis = System.currentTimeMillis() - this.f39617r;
            if (currentTimeMillis >= this.f39609d) {
                int i = Build.VERSION.SDK_INT;
                if (this.f39613n == null) {
                    this.f39613n = this.f39607b.getBluetoothLeScanner();
                }
                if (this.f39613n != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new ScanFilter.Builder().setServiceUuid(f39606a).build());
                    ScanSettings build = new ScanSettings.Builder().setScanMode(this.f39612m ^ true ? 1 : 0).build();
                    if (this.f39614o == null) {
                        this.f39614o = new BleDeviceScanner$BleScanCallback(this, "cast", "BleDeviceScanner");
                    }
                    try {
                        this.f39613n.startScan(arrayList, build, this.f39614o);
                        this.f39617r = System.currentTimeMillis();
                        this.f39615p = this.f39642g.schedule(new plm(this), this.f39616q, TimeUnit.MILLISECONDS);
                    } catch (IllegalStateException | NullPointerException e) {
                        this.f39640e.mo23676c(e, "Failed to start BLE scan", new Object[0]);
                        this.f39614o = null;
                    }
                }
            } else {
                this.f39640e.mo23857a("It only has been %d ms since last scan. Wait for %d ms", Long.valueOf(currentTimeMillis), Long.valueOf(this.f39609d - currentTimeMillis));
                this.f39608c = this.f39642g.schedule(new pll(this), this.f39609d - currentTimeMillis, TimeUnit.MILLISECONDS);
            }
        } else {
            mo23385b();
        }
    }

    /* renamed from: a */
    public final void mo23383a(ScanResult scanResult) {
        byte[] manufacturerSpecificData;
        pls pls = new pls();
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null && (manufacturerSpecificData = scanRecord.getManufacturerSpecificData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD)) != null && manufacturerSpecificData.length == 6) {
            String valueOf = String.valueOf(qay.m31780a(Arrays.copyOfRange(manufacturerSpecificData, 2, 6)));
            pls.f39619b = valueOf.length() == 0 ? new String("FA8F") : "FA8F".concat(valueOf);
            boolean z = false;
            pls.f39618a = new byte[]{manufacturerSpecificData[0], manufacturerSpecificData[1]};
            if (ccxg.m131999b()) {
                byte[] serviceData = scanRecord.getServiceData(ParcelUuid.fromString("0000FE9F-0000-1000-8000-00805F9B34FB"));
                if (serviceData != null && serviceData.length == 20) {
                    if ((serviceData[0] & 2) != 0) {
                        z = true;
                    }
                    pls.f39620c = z;
                    pls.f39621d = qay.m31780a(Arrays.copyOfRange(serviceData, 1, 12));
                } else {
                    return;
                }
            }
            if (this.f39611l.add(pls.f39619b)) {
                this.f39643h.mo23134a(pls.f39618a);
            }
            poj poj = this.f39644i;
            new poh(pls, poj.f39918b, poj.f39919c, System.currentTimeMillis()).mo23522a();
            if (qay.m31788b() && ccxg.m131999b()) {
                if (ccxy.m132140b() && this.f39644i.f39918b.mo23495e().f39873b == null) {
                    this.f39644i.mo23519a(System.currentTimeMillis()).mo23522a();
                }
                this.f39610k.mo23426b(this);
                poj poj2 = this.f39644i;
                new pol(poj2.f39918b, poj2.f39919c, pls, System.currentTimeMillis()).mo23522a();
            }
        }
    }

    /* renamed from: b */
    public final void mo23385b() {
        ScanCallback scanCallback;
        int i = Build.VERSION.SDK_INT;
        BluetoothLeScanner bluetoothLeScanner = this.f39613n;
        if (bluetoothLeScanner != null && (scanCallback = this.f39614o) != null) {
            try {
                bluetoothLeScanner.stopScan(scanCallback);
                this.f39614o = null;
            } catch (IllegalStateException e) {
                this.f39640e.mo23677d("Failed to stop BLE scan.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo23386b(Set set, int i) {
        BluetoothAdapter bluetoothAdapter = this.f39607b;
        boolean z = false;
        if (bluetoothAdapter == null) {
            this.f39640e.mo23677d("Failed to start scan because Bluetooth is not supported on this device.", new Object[0]);
            this.f39643h.mo23141e();
            return false;
        } else if (!bluetoothAdapter.isEnabled()) {
            this.f39640e.mo23677d("Failed to start scan because the Bluetooth is disabled.", new Object[0]);
            this.f39643h.mo23141e();
            return false;
        } else {
            this.f39611l.clear();
            if ((i & 2) != 0) {
                z = true;
            }
            this.f39612m = z;
            if (z) {
                this.f39616q = ccxg.f180154a.mo6606a().mo76979g();
                this.f39609d = ccxg.f180154a.mo6606a().mo76978f();
            } else {
                this.f39616q = ccxg.f180154a.mo6606a().mo76974b();
                this.f39609d = ccxg.f180154a.mo6606a().mo76973a();
            }
            this.f39642g.execute(new plk(this));
            if (qay.m31788b() && ccxg.m131999b()) {
                this.f39610k.mo23422a(set);
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23384a(Set set, int i) {
        if (this.f39607b != null) {
            pmn pmn = this.f39610k;
            if (!pmn.f39712b) {
                pmn.mo23424a(this);
            }
        }
        m30786e();
        mo23386b(set, i);
    }
}
