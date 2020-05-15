package com.google.android.gms.auth.proximity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.UserManager;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlePeripheralChimeraService extends Service implements jjt, jis {

    /* renamed from: a */
    public static final sek f11114a = jsy.m17256a("BlePeripheralService");

    /* renamed from: b */
    public final jnj f11115b = jnj.m16961a();

    /* renamed from: c */
    public final jkh f11116c = jkh.m16839a();

    /* renamed from: d */
    public jju f11117d;

    /* renamed from: e */
    private final jjx f11118e = new jjx(UUID.fromString("f21843b0-9411-434b-b85f-a9b92bd69f77"));

    /* renamed from: f */
    private blvr f11119f;

    /* renamed from: g */
    private jiu f11120g;

    /* renamed from: h */
    private boolean f11121h = false;

    /* renamed from: a */
    public static Intent m6753a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.BlePeripheralService");
    }

    /* renamed from: b */
    public final void mo7777b() {
        mo7779d();
    }

    /* renamed from: c */
    public final void mo7778c() {
        if (!this.f11121h && this.f11117d != null) {
            Context applicationContext = getApplicationContext();
            BluetoothManager bluetoothManager = (BluetoothManager) applicationContext.getSystemService("bluetooth");
            aysp aysp = null;
            if (bluetoothManager == null) {
                f11114a.mo25418e("Bluetooth manager not available, stopping service.", new Object[0]);
                stopSelf();
            } else {
                aysp a = aysp.m84734a(bluetoothManager.openGattServer(applicationContext, this.f11119f.f98425c));
                if (a == null) {
                    f11114a.mo25418e("Failed to open GattServer.", new Object[0]);
                    stopSelf();
                } else {
                    this.f11118e.f22663a = a;
                    BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(UUID.fromString("00002902-0000-1000-8000-00805F9B34FB"), 16);
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(UUID.fromString("00000100-0004-1000-8000-001A11000102"), 32, 0);
                    bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(UUID.fromString("00000100-0004-1000-8000-001A11000101"), 8, 16);
                    BluetoothGattService bluetoothGattService = new BluetoothGattService(UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), 0);
                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
                    if (cchi.m129670b() && ((UserManager) getSystemService("user")).getUserProfiles().size() > 1) {
                        bluetoothGattService.addCharacteristic(new BluetoothGattCharacteristic(UUID.fromString("f21843b0-9411-434b-b85f-a9b92bd69f77"), 2, 1));
                    }
                    a.mo54385a(bluetoothGattService);
                    aysp = a;
                }
            }
            if (aysp != null) {
                this.f11119f.mo66760b(aysp, new jjw(this));
                this.f11121h = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo7779d() {
        jiu jiu;
        jju jju = this.f11117d;
        if (jju != null && (jiu = this.f11120g) != null && !jiu.f22574g && !jju.mo13800a()) {
            stopSelf();
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) "==== BlePeripheralService Dump ====\n\n");
        jiu jiu = this.f11120g;
        if (jiu == null) {
            printWriter.append((CharSequence) "No current background advertiser.\n");
        } else if (jiu.f22574g) {
            String str = jiu.f22572e;
            printWriter.append((CharSequence) "Current advertising background EID: ");
            if (str == null) {
                str = "null";
            }
            printWriter.append((CharSequence) str);
            printWriter.append((CharSequence) "\n");
        } else {
            printWriter.append((CharSequence) "No active background advertisement.\n");
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        f11114a.mo25412b("Service destroyed.", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        jju jju = this.f11117d;
        jju.f22647j.post(new jjk(jju));
        this.f11120g.mo13769a();
        this.f11120g.f22575h = null;
        this.f11117d.f22651n = null;
        this.f11118e.f22663a = null;
        if (this.f11121h) {
            this.f11119f.mo66757a();
            this.f11121h = false;
        }
        this.f11117d = null;
        this.f11120g = null;
        this.f11119f = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        f11114a.mo25412b("onStartCommand() called.", new Object[0]);
        int i4 = Build.VERSION.SDK_INT;
        if (!this.f11117d.mo13801b()) {
            f11114a.mo25418e("Advertising not available, stopping service.", new Object[0]);
            stopSelf();
            return 2;
        } else if (Role.m6772b(this.f11115b.mo13909c())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List b = this.f11115b.mo13907b();
            int size = b.size();
            int i5 = 0;
            while (i5 < size) {
                RemoteDevice remoteDevice = (RemoteDevice) b.get(i5);
                Iterator it = this.f11115b.mo13902a(remoteDevice.f11138b).iterator();
                while (true) {
                    i3 = i5 + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i6 = ((Role) it.next()).f11147c;
                    if (Role.m6773c(i6)) {
                        arrayList2.add(remoteDevice);
                    } else if (Role.m6774d(i6)) {
                        arrayList.add(remoteDevice);
                    }
                }
                i5 = i3;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                this.f11117d.mo13799a(arrayList2);
                if (!arrayList.isEmpty() && !this.f11120g.f22574g) {
                    f11114a.mo25412b("Found %s background devices, advertising...", Integer.valueOf(arrayList.size()));
                    this.f11120g.mo13770a(new jjv(this));
                } else if (arrayList.isEmpty() && this.f11120g.f22574g) {
                    f11114a.mo25412b("No background devices, stopping advertising.", new Object[0]);
                    this.f11120g.mo13769a();
                }
            } else {
                f11114a.mo25412b("No registered remote devices.", new Object[0]);
                stopSelf();
            }
            return 2;
        } else {
            f11114a.mo25412b("No eligible devices, stopping service.", new Object[0]);
            stopSelf();
            return 2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo7775a() {
        mo7778c();
    }

    public final void onCreate() {
        jiu jiu = new jiu(this);
        this.f11120g = jiu;
        jiu.f22575h = this;
        jju jju = new jju();
        this.f11117d = jju;
        jju.f22651n = this;
        this.f11119f = new blvr(UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), UUID.fromString("00000100-0004-1000-8000-001A11000102"), UUID.fromString("00000100-0004-1000-8000-001A11000101"), this.f11118e);
    }

    /* renamed from: a */
    public final void mo7776a(byte[] bArr) {
        f11114a.mo25412b("Set new EID value, %s.", srv.m36160a(bArr));
        this.f11118e.f22664b = bArr;
    }
}
