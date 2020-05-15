package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aian */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aian extends buqn {

    /* renamed from: a */
    final /* synthetic */ PrintWriter f68572a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService f68573b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aian(DiscoveryChimeraService discoveryChimeraService, String str, PrintWriter printWriter) {
        super(str);
        this.f68573b = discoveryChimeraService;
        this.f68572a = printWriter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x028a A[LOOP:5: B:70:0x0284->B:72:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02cb A[LOOP:6: B:74:0x02c5->B:76:0x02cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0361  */
    public final void run() {
        int i;
        boolean z;
        int size;
        int i2;
        String str;
        int i3;
        int i4;
        Integer num;
        ahst ahst = this.f68573b.f80532c;
        PrintWriter printWriter = this.f68572a;
        ahst.f67964f.mo72984b();
        ArrayList arrayList = new ArrayList(ahst.f67961c.mo36468d());
        Collections.sort(arrayList, ahso.f67950a);
        List c = ahst.mo37048c();
        Collections.sort(c, ahsp.f67951a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c.iterator();
        char c2 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            ahsu ahsu = (ahsu) it.next();
            if (ahsu.mo37061H() == 2) {
                i5++;
                i6++;
            } else if (ahsu.mo37061H() == 3) {
                i5++;
            }
            if (ahsu.mo37080f()) {
                arrayList2.add(ahsu);
            } else {
                List list = (List) linkedHashMap.get(ahsu.mo37060G());
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(ahsu.mo37060G(), list);
                }
                list.add(ahsu);
            }
        }
        int i7 = spn.f44932a;
        char c3 = 1;
        if (!ahst.f67965g.mo73036a()) {
            try {
                if ("com.google.android.gms".equals(ModuleManager.get(ahst.f67963e).getCurrentModuleApk().apkPackageName)) {
                    z = false;
                    ahss ahss = new ahss(printWriter, z ? 0 : BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                    ahss.mo37030a("Device:", new Object[0]);
                    size = arrayList2.size();
                    i2 = 0;
                    while (i2 < size) {
                        ahsu ahsu2 = (ahsu) arrayList2.get(i2);
                        Object[] objArr = new Object[i];
                        objArr[c2] = ahst.m56486a(ahsu2);
                        objArr[c3] = ahsu2.mo37084i();
                        ahss.mo37030a("  %s%s", objArr);
                        Object[] objArr2 = new Object[6];
                        objArr2[c2] = ahsu2.mo37060G();
                        objArr2[c3] = ahsu2.mo37097u();
                        objArr2[i] = ahsu2.mo37099w();
                        objArr2[3] = ahsu2.mo37102z();
                        objArr2[4] = ahsu2.mo37088m();
                        int i8 = i5;
                        objArr2[5] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(ahst.f67959a.mo20505a() - ahsu2.mo37101y().longValue()));
                        ahss.mo37030a("    %s, rssi: %s, txPower: %s, distance: %s, mac: %s, last updated: %dm ago", objArr2);
                        int size2 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            i4 = i2 + 1;
                            if (i9 >= size2) {
                                break;
                            }
                            aiac aiac = (aiac) arrayList.get(i9);
                            bzbk a = bzbk.m125615a(aiac.f68548c);
                            if (a == null) {
                                a = bzbk.NEARBY_TYPE_UNKNOWN;
                            }
                            if (a == ahsu2.mo37085j()) {
                                Object[] objArr3 = new Object[4];
                                objArr3[0] = aiac.f68547b;
                                if ((aiac.f68546a & 8) != 0) {
                                    num = Integer.valueOf(aiac.f68550e);
                                } else {
                                    num = null;
                                }
                                objArr3[1] = num;
                                objArr3[2] = aiac.f68549d;
                                objArr3[3] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(ahst.f67959a.mo20505a() - aiac.f68555j));
                                ahss.mo37030a("    %s, rssi: %s, mac: %s, last updated: %dm ago", objArr3);
                            }
                            i9++;
                        }
                        i2 = i4;
                        i5 = i8;
                        c2 = 0;
                        c3 = 1;
                        i = 2;
                    }
                    int i10 = i5;
                    int i11 = 0;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        i11++;
                        List<ahsu> list2 = (List) entry.getValue();
                        String str2 = (String) entry.getKey();
                        if (list2.size() != 1) {
                            i3 = 1;
                        } else if (((ahsu) list2.get(0)).mo37086k() != null) {
                            i3 = 1;
                        } else {
                            ahss.mo37030a("Beacon: %s %s", str2, ahst.m56486a((ahsu) list2.get(0)));
                        }
                        Object[] objArr4 = new Object[i3];
                        objArr4[0] = str2;
                        ahss.mo37030a("Beacon: %s", objArr4);
                        for (ahsu ahsu3 : list2) {
                            ahss.mo37030a("  %s%s, ID: %s", ahst.m56486a(ahsu3), ahsu3.mo37086k(), ahsu3.mo37084i());
                        }
                    }
                    printWriter.println();
                    if (!burl.m120292a()) {
                        printWriter.println("Warning: Bluetooth disabled");
                    }
                    if (!burl.m120293a(ahst.f67963e)) {
                        printWriter.println("Warning: Location disabled");
                    }
                    if (!ahst.f67965g.mo73036a()) {
                        printWriter.println("Warning: Debug mode disabled");
                    }
                    printWriter.printf("Notification count: %d\nListView count: %d\nBeacon count: %d\n", Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11));
                    List<ahyz> d = ahst.mo37050d();
                    ahss.mo37030a("FastPairItem: %d", Integer.valueOf(d.size()));
                    for (ahyz ahyz : d) {
                        ahss.mo37030a("  %s, mac: %s", ahyz.f68437k, ahyz.f68428b);
                    }
                    ahss.close();
                    ahwk ahwk = (ahwk) ahgz.m55754a(this.f68573b, ahwk.class);
                    PrintWriter printWriter2 = this.f68572a;
                    printWriter2.println();
                    printWriter2.println("BatteryAdvertisementManager");
                    int i12 = 0;
                    for (BatteryAdvertisement batteryAdvertisement : ahwk.f68226b.values()) {
                        printWriter2.printf("  element[%d]: %s, key.hash: %s, %ds ago\n", Integer.valueOf(i12), batteryAdvertisement, Integer.valueOf(batteryAdvertisement.f80509f.hashCode()), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - batteryAdvertisement.f80508e)));
                        i12++;
                    }
                    Object[] objArr5 = new Object[1];
                    bxtx bxtx = ahwk.f68228d;
                    objArr5[0] = bxtx == null ? Integer.valueOf(bxtx.hashCode()) : "null";
                    printWriter2.printf("  shown account key.hash: %s\n", objArr5);
                    if (!cfoj.m141557g()) {
                        printWriter2.printf("  connected device list:\n", new Object[0]);
                        synchronized (ahwk.f68227c) {
                            Iterator it2 = ahwk.f68227c.iterator();
                            while (it2.hasNext()) {
                                printWriter2.printf("    %s\n", (String) it2.next());
                            }
                        }
                    }
                    if (cfoj.f184966a.mo6606a().mo82058I()) {
                        busy busy = (busy) ahgz.m55754a(this.f68573b, busy.class);
                        PrintWriter printWriter3 = this.f68572a;
                        printWriter3.println();
                        printWriter3.println("BluetoothDeviceConnectionStateManager");
                        printWriter3.printf("  registered profiles: %s\n", busy.f154831c.toString());
                        printWriter3.printf("  connected profile and devices:\n", new Object[0]);
                        synchronized (busy) {
                            for (int i13 = 0; i13 < busy.f154832d.size(); i13++) {
                                int keyAt = busy.f154832d.keyAt(i13);
                                printWriter3.printf("    profile proxy %d:\n", Integer.valueOf(keyAt));
                                Iterator<BluetoothDevice> it3 = ((BluetoothProfile) busy.f154832d.get(keyAt)).getConnectedDevices().iterator();
                                while (it3.hasNext()) {
                                    printWriter3.printf("      %s\n", it3.next().getAddress());
                                }
                            }
                        }
                    }
                    if (cfoj.f184966a.mo6606a().mo82061L()) {
                        ahzi ahzi = (ahzi) ahgz.m55754a(this.f68573b, ahzi.class);
                        PrintWriter printWriter4 = this.f68572a;
                        printWriter4.println();
                        printWriter4.println("FastPairScanner");
                        printWriter4.printf("  isBleEnabled: %s\n", Boolean.valueOf(burl.m120296b()));
                        printWriter4.printf("  Is alive: %s\n", Boolean.valueOf(ahzi.mo37315g()));
                        printWriter4.printf("  Is scanning: %s\n", Boolean.valueOf(ahzi.mo37314f()));
                        printWriter4.printf("  Current scan mode: %s\n", ahzi.f68467d);
                    }
                    if (cfoj.f184966a.mo6606a().mo82059J()) {
                        ahxa ahxa = (ahxa) ahgz.m55754a(this.f68573b, ahxa.class);
                        PrintWriter printWriter5 = this.f68572a;
                        printWriter5.println();
                        printWriter5.println("FastPairCacheManager");
                        printWriter5.printf("  Current size: %s\n", Integer.valueOf(ahxa.size()));
                        printWriter5.printf("  Max size: %s\n", Integer.valueOf(ahxa.maxSize()));
                        printWriter5.printf("  Items: \n", new Object[0]);
                        for (Map.Entry entry2 : ahxa.snapshot().entrySet()) {
                            printWriter5.printf("    %s: %s\n", entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (!cfoj.f184966a.mo6606a().mo82060K()) {
                        PrintWriter printWriter6 = this.f68572a;
                        bnhe a2 = bnhe.m109413a(((ahxj) ahgz.m55754a(this.f68573b, ahxj.class)).f68288b);
                        printWriter6.println();
                        printWriter6.println("FastPairEventStream");
                        printWriter6.printf("  Connected device count: %d\n", Integer.valueOf(a2.size()));
                        for (BluetoothDevice bluetoothDevice : a2.keySet()) {
                            ahxk ahxk = (ahxk) a2.get(bluetoothDevice);
                            Object[] objArr6 = new Object[2];
                            objArr6[0] = bluetoothDevice;
                            if (ahxk == null) {
                                str = "DISCONNECTED";
                            } else {
                                str = !ahxk.mo37265b() ? "DISCONNECTED" : "CONNECTED";
                            }
                            objArr6[1] = str;
                            printWriter6.printf("    %s [%s]\n", objArr6);
                        }
                        return;
                    }
                    return;
                }
            } catch (IllegalStateException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Should never happen, except in tests (they don't have a module context).");
                z = false;
            }
        }
        z = true;
        ahss ahss2 = new ahss(printWriter, z ? 0 : BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        ahss2.mo37030a("Device:", new Object[0]);
        size = arrayList2.size();
        i2 = 0;
        while (i2 < size) {
        }
        int i102 = i5;
        int i112 = 0;
        while (r0.hasNext()) {
        }
        printWriter.println();
        if (!burl.m120292a()) {
        }
        if (!burl.m120293a(ahst.f67963e)) {
        }
        if (!ahst.f67965g.mo73036a()) {
        }
        printWriter.printf("Notification count: %d\nListView count: %d\nBeacon count: %d\n", Integer.valueOf(i6), Integer.valueOf(i102), Integer.valueOf(i112));
        List<ahyz> d2 = ahst.mo37050d();
        ahss2.mo37030a("FastPairItem: %d", Integer.valueOf(d2.size()));
        while (r0.hasNext()) {
        }
        ahss2.close();
        ahwk ahwk2 = (ahwk) ahgz.m55754a(this.f68573b, ahwk.class);
        PrintWriter printWriter22 = this.f68572a;
        printWriter22.println();
        printWriter22.println("BatteryAdvertisementManager");
        int i122 = 0;
        while (r3.hasNext()) {
        }
        Object[] objArr52 = new Object[1];
        bxtx bxtx2 = ahwk2.f68228d;
        objArr52[0] = bxtx2 == null ? Integer.valueOf(bxtx2.hashCode()) : "null";
        printWriter22.printf("  shown account key.hash: %s\n", objArr52);
        if (!cfoj.m141557g()) {
        }
        if (cfoj.f184966a.mo6606a().mo82058I()) {
        }
        if (cfoj.f184966a.mo6606a().mo82061L()) {
        }
        if (cfoj.f184966a.mo6606a().mo82059J()) {
        }
        if (!cfoj.f184966a.mo6606a().mo82060K()) {
        }
    }
}
