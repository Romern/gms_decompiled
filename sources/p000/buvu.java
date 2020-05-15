package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.WorkSource;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.beacon.BleFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvu implements bvbk {

    /* renamed from: a */
    public final buvc f155082a;

    /* renamed from: b */
    public final buxb f155083b;

    /* renamed from: c */
    public final sbc f155084c;

    /* renamed from: d */
    public final buyv f155085d;

    /* renamed from: e */
    public final AtomicBoolean f155086e;

    /* renamed from: f */
    public bvat f155087f;

    /* renamed from: g */
    public final WorkSource f155088g;

    /* renamed from: h */
    public final nej f155089h = new buvq(this);

    /* renamed from: i */
    public int f155090i = 1;

    /* renamed from: j */
    public int f155091j = 1;

    /* renamed from: k */
    private final buqh f155092k;

    /* renamed from: l */
    private final boolean f155093l;

    /* renamed from: m */
    private final buyz[] f155094m;

    /* renamed from: n */
    private final BleFilter[] f155095n;

    /* renamed from: o */
    private final buwm f155096o = new buvr(this);

    public buvu(Context context, buzb buzb, WorkSource workSource, BleFilter[] bleFilterArr) {
        boolean z;
        this.f155082a = (buvc) ahgz.m55754a(context, buvc.class);
        this.f155092k = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155083b = (buxb) ahgz.m55754a(context, buxb.class);
        int a = buzf.m120802a(buzb.f155368b);
        if ((a == 0 ? 1 : a) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f155093l = z;
        this.f155094m = (buyz[]) new bxvv(buzb.f155370d, buzb.f155364e).toArray(new buyz[0]);
        buyv a2 = buyv.m120788a(buzb.f155369c);
        this.f155085d = a2 == null ? buyv.BLE_ADVERTISE_DATA_TYPE_UNKNOWN : a2;
        this.f155086e = new AtomicBoolean(false);
        this.f155088g = workSource == null ? new WorkSource() : workSource;
        buyv buyv = this.f155085d;
        neh neh = new neh();
        int ordinal = buyv.ordinal();
        if (ordinal == 0) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buvu", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unknown BleAdvertiseDataType: %s", buyv);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
                bnsl2.mo68432a("buvu", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Unknown BleAdvertiseDataType: %s", buyv);
                neh.mo20520a(new byte[0]);
                if (bleFilterArr != null && bleFilterArr.length > 0) {
                    bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl3.mo68432a("buvu", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
                }
                bleFilterArr = new BleFilter[]{neh.mo20515a()};
            }
            this.f155095n = bleFilterArr;
            this.f155084c = new sbc(10000, -1, 1, TimeUnit.SECONDS);
        }
        neh.mo20520a(new byte[0]);
        bnsl bnsl32 = (bnsl) bvcm.f155598a.mo68388c();
        bnsl32.mo68432a("buvu", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl32.mo68405a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
        bleFilterArr = new BleFilter[]{neh.mo20515a()};
        this.f155095n = bleFilterArr;
        this.f155084c = new sbc(10000, -1, 1, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static bvai m120535a(bvae bvae) {
        bvah bvah = (bvah) bvai.f155480d.mo74144da();
        bvah.mo73266a(bvae);
        return (bvai) bvah.mo74062i();
    }

    /* renamed from: b */
    public final void mo73159b() {
        bvat bvat = this.f155087f;
        bxvf bxvf = (bxvf) bvae.f155472e.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvae bvae = (bvae) bxvf.f164949b;
        bvae.f155475b = 4;
        bvae.f155474a |= 1;
        bxvf bxvf2 = (bxvf) buyw.f155343h.mo74144da();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        buyw buyw = (buyw) bxvf2.f164949b;
        buyw.f155350f = 3;
        buyw.f155345a |= 16;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvae bvae2 = (bvae) bxvf.f164949b;
        buyw buyw2 = (buyw) bxvf2.mo74062i();
        buyw2.getClass();
        bvae2.f155477d = buyw2;
        bvae2.f155474a |= 4;
        bvat.mo36284a(m120535a((bvae) bxvf.mo74062i()));
    }

    /* renamed from: c */
    public final List mo73160c() {
        return Arrays.asList(this.f155095n);
    }

    public final String toString() {
        boolean z = this.f155093l;
        String arrays = Arrays.toString(this.f155094m);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 50);
        sb.append("BleScan{inBackground=");
        sb.append(z);
        sb.append(", backgroundStrategies=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static void m120536a(Context context, bvad bvad) {
        if ((bvad.f155467a & 4) != 0) {
            buzb buzb = bvad.f155470d;
            if (buzb == null) {
                buzb = buzb.f155365f;
            }
            int a = buzf.m120802a(buzb.f155368b);
            if (!(a == 0 || a == 1)) {
                buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
                if (buxb != null && buxb.mo73228c()) {
                    buzb buzb2 = bvad.f155470d;
                    if (buzb2 == null) {
                        buzb2 = buzb.f155365f;
                    }
                    if (buwo.m120592a(context, (buyz[]) new bxvv(buzb2.f155370d, buzb.f155364e).toArray(new buyz[0]))) {
                        return;
                    }
                }
                throw new bvdl(buxb.class, buvu.class);
            }
        }
        throw new bvdj("BleScanStrategy is not correctly set");
    }

    /* renamed from: a */
    private static BleFilter[] m120537a(buyv buyv, BleFilter[] bleFilterArr) {
        neh neh = new neh();
        buyv buyv2 = buyv.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        int ordinal = buyv.ordinal();
        if (ordinal == 0) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buvu", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unknown BleAdvertiseDataType: %s", buyv);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                return bleFilterArr;
            }
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl2.mo68432a("buvu", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Unknown BleAdvertiseDataType: %s", buyv);
            neh.mo20520a(new byte[0]);
            if (bleFilterArr != null && bleFilterArr.length > 0) {
                bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
                bnsl3.mo68432a("buvu", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
            }
            return new BleFilter[]{neh.mo20515a()};
        }
        neh.mo20520a(new byte[0]);
        bnsl bnsl32 = (bnsl) bvcm.f155598a.mo68388c();
        bnsl32.mo68432a("buvu", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl32.mo68405a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
        return new BleFilter[]{neh.mo20515a()};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo73157a(boolean z) {
        return (cfoj.m141520A() && z) ? this.f155091j : this.f155090i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo73128a() {
        return bvai.f155480d;
    }

    /* renamed from: a */
    public final void mo73129a(bvat bvat, bvda bvda) {
        this.f155087f = bvat;
        if (this.f155093l) {
            buxb buxb = this.f155083b;
            buwm buwm = this.f155096o;
            List c = mo73160c();
            WorkSource workSource = this.f155088g;
            buyz[] buyzArr = this.f155094m;
            buwo buwo = buxb.f155214l;
            if (buwo != null) {
                if (buyzArr == null) {
                    buyzArr = buwo.f155154a;
                }
                if (buwo.m120592a(buwo.f155156c, buyzArr)) {
                    buwo.f155158e.put(buwm, new buwn(Collections.unmodifiableList(c), workSource, buyzArr));
                    if (buwo.f155163j) {
                        buwo.f155156c.unregisterReceiver(buwo.f155167n);
                    }
                    buwo.f155163j = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    intentFilter.addAction("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED");
                    int i = Build.VERSION.SDK_INT;
                    intentFilter.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
                    if (buwo.m120593a(buwo.mo73187f().f155153c)) {
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        if (cfoa.m141101h()) {
                            intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON");
                            intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF");
                        }
                    }
                    if (buwo.m120595b(buwo.mo73187f().f155153c)) {
                        intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE");
                    }
                    buwo.f155156c.registerReceiver(buwo.f155167n, intentFilter);
                    buwo.f155161h = true;
                    buwo.mo73185d();
                } else {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl.mo68432a("buwo", "a", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("BackgroundBleScanner: Ignoring request, scanning strategies unsupported (%s), maybe the device doesn't support hardware-offloaded filters.", Arrays.toString(buyzArr));
                }
            }
            srn srn = bvcm.f155598a;
            bvda.mo73126a();
            return;
        }
        this.f155083b.mo73220a(new buvs(this, bvda));
    }

    /* renamed from: a */
    public final void mo73130a(bvda bvda) {
        if (this.f155093l) {
            buxb buxb = this.f155083b;
            buwm buwm = this.f155096o;
            buwo buwo = buxb.f155214l;
            if (buwo != null) {
                buwo.f155158e.remove(buwm);
                if (buwo.f155158e.isEmpty()) {
                    if (buwo.f155163j) {
                        buwo.f155163j = false;
                        buwo.f155156c.unregisterReceiver(buwo.f155167n);
                    }
                    buwo.mo73185d();
                } else {
                    buwo.mo73185d();
                }
            }
            bvda.mo73126a();
            srn srn = bvcm.f155598a;
            return;
        }
        if (this.f155086e.compareAndSet(true, false)) {
            this.f155083b.mo73234h();
            srn srn2 = bvcm.f155598a;
        }
        this.f155083b.mo73225b(bvda);
    }

    /* renamed from: a */
    public final void mo73158a(byte[] bArr, BluetoothDevice bluetoothDevice, int i, buyv buyv, int i2) {
        if (this.f155087f != null) {
            this.f155092k.mo72987c(new buvt(this, "BLEInformStatusListener", bluetoothDevice, bArr, buyv, i, i2));
        }
    }
}
