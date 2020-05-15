package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwt {

    /* renamed from: a */
    public final Context f155183a;

    /* renamed from: b */
    public final bvbu f155184b;

    /* renamed from: c */
    public final BluetoothAdapter f155185c;

    /* renamed from: d */
    public final buwq f155186d;

    /* renamed from: e */
    public final buqh f155187e;

    /* renamed from: f */
    public boolean f155188f;

    /* renamed from: g */
    public Long f155189g;

    /* renamed from: h */
    public final BroadcastReceiver f155190h = new BluetoothAdapterWrapper$1(this, "nearby");

    /* renamed from: i */
    private final Set f155191i = new HashSet();

    public buwt(Context context) {
        long j;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f155183a = context;
        this.f155184b = (bvbu) ahgz.m55754a(context, bvbu.class);
        this.f155185c = defaultAdapter;
        this.f155187e = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155188f = false;
        buwq buwq = null;
        if (mo73197a()) {
            if (defaultAdapter.isEnabled()) {
                j = 0L;
            } else {
                j = null;
            }
            this.f155189g = j;
            context.registerReceiver(this.f155190h, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        this.f155186d = mo73204c() ? new buwq(context, this) : buwq;
    }

    /* renamed from: a */
    private static boolean m120611a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: p */
    private final neg m120612p() {
        if (mo73203b()) {
            return (neg) ahgz.m55754a(this.f155183a, neg.class);
        }
        srn srn = bvcm.f155598a;
        return null;
    }

    /* renamed from: q */
    private final boolean m120613q() {
        int e = mo73206e();
        if (e == 10 || e == 12) {
            return true;
        }
        srn srn = bvcm.f155598a;
        return false;
    }

    /* renamed from: d */
    public final int mo73205d() {
        return this.f155185c.getScanMode();
    }

    /* renamed from: e */
    public final int mo73206e() {
        int state = this.f155185c.getState();
        if (state != 12 || mo73212k()) {
            return state;
        }
        return 11;
    }

    /* renamed from: f */
    public final boolean mo73207f() {
        neg p = m120612p();
        if (p != null) {
            try {
                if (((Boolean) aucu.m76783a(p.mo20512a(), 2, TimeUnit.SECONDS)).booleanValue()) {
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo73208g() {
        return this.f155185c.isDiscovering();
    }

    /* renamed from: h */
    public final boolean mo73209h() {
        srn srn = bvcm.f155598a;
        return this.f155185c.disable();
    }

    /* renamed from: i */
    public final void mo73210i() {
        try {
            this.f155183a.unregisterReceiver(this.f155190h);
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buwt", "i", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
        }
        this.f155188f = true;
    }

    /* renamed from: j */
    public final String mo73211j() {
        return this.f155185c.getName();
    }

    /* renamed from: k */
    public final boolean mo73212k() {
        if (this.f155188f) {
            return false;
        }
        Long l = this.f155189g;
        if (l == null) {
            return this.f155185c.isEnabled();
        }
        byyg byyg = this.f155184b.f155567b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        if (this.f155185c.isEnabled()) {
            byyb byyb = byyg.f168924g;
            if (byyb == null) {
                byyb = byyb.f168875j;
            }
            if (byyb.f168885i <= elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo73213l() {
        int i;
        try {
            i = ((Integer) ahft.m55666a(this.f155185c).mo36404a("getDiscoverableTimeout", new Class[0]).mo36403a(new Object[0])).intValue();
            try {
                srn srn = bvcm.f155598a;
            } catch (ahfu e) {
            }
        } catch (ahfu e2) {
            i = 120;
        }
        if (i != -1) {
            return i;
        }
        return 120;
    }

    /* renamed from: m */
    public final int mo73214m() {
        try {
            return ((Integer) ahft.m55666a(this.f155185c).mo36404a("getConnectionState", new Class[0]).mo36403a(new Object[0])).intValue();
        } catch (ahfu e) {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: n */
    public final SharedPreferences mo73215n() {
        return this.f155183a.getSharedPreferences("copresence_bluetooth_preferences", 0);
    }

    /* renamed from: o */
    public final boolean mo73216o() {
        if (!mo73212k()) {
            if (!cfos.f185168a.mo6606a().mo82250b()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.f155185c.isBleScanAlwaysAvailable()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73197a() {
        return this.f155183a.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo73203b() {
        int i = Build.VERSION.SDK_INT;
        return m120611a(this.f155183a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo73204c() {
        int i = Build.VERSION.SDK_INT;
        return m120611a(this.f155183a) && mo73215n().getBoolean("IS_BLE_ADVERTISING_SUPPORTED", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73198a(int i, int i2) {
        srn srn = bvcm.f155598a;
        StringBuilder sb = new StringBuilder(52);
        sb.append("setScanMode to ");
        sb.append(i);
        sb.append(" with duration ");
        sb.append(i2);
        sb.toString();
        try {
            boolean booleanValue = ((Boolean) ahft.m55666a(this.f155185c).mo36404a("setScanMode", Integer.TYPE, Integer.TYPE).mo36403a(Integer.valueOf(i), Integer.valueOf(i2))).booleanValue();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("setScanMode to ");
            sb2.append(i);
            sb2.append(" with duration ");
            sb2.append(i2);
            sb2.toString();
            return booleanValue;
        } catch (ahfu e) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73199a(BleSettings bleSettings, nej nej) {
        neg p;
        nem nem = new nem(bleSettings);
        nem.f35408a = 1;
        BleSettings a = nem.mo20533a();
        srn srn = bvcm.f155598a;
        if (m120613q() && mo73216o() && (p = m120612p()) != null) {
            try {
                aucu.m76783a(p.mo20514a(nej, a), cfoa.m141095b(), TimeUnit.SECONDS);
                this.f155191i.add(nej);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo73200a(String str) {
        srn srn = bvcm.f155598a;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "setName to ".concat(valueOf);
        } else {
            new String("setName to ");
        }
        boolean name = this.f155185c.setName(str);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            "setName to ".concat(valueOf2);
        } else {
            new String("setName to ");
        }
        return name;
    }

    /* renamed from: a */
    public final boolean mo73201a(UUID uuid, byte[] bArr, boolean z, buyv buyv) {
        boolean z2;
        buwq buwq = this.f155186d;
        if (buwq != null) {
            if (buwq.f155179c) {
                buwq.mo73194b();
            }
            srn srn = bvcm.f155598a;
            ahga a = buwq.mo73192a();
            if (a != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(z).build();
                AdvertiseData.Builder builder = new AdvertiseData.Builder();
                if (buyv == buyv.BLE_ADVERTISE_MANUFACTURER_DATA) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[(length + 2)];
                    bArr2[0] = (byte) (length + 1);
                    bArr2[1] = 16;
                    System.arraycopy(bArr, 0, bArr2, 2, length);
                    builder.addManufacturerData(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, bArr2);
                } else if (uuid == null) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl.mo68432a("buwq", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("BleAdvertise: does not support advertise service data without uuid.");
                } else {
                    ParcelUuid parcelUuid = new ParcelUuid(uuid);
                    builder.addServiceUuid(parcelUuid).addServiceData(parcelUuid, bArr);
                }
                buwq.f155180d = new buwp();
                if (!a.mo36416a(build, builder.build(), buwq.f155180d)) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl2.mo68432a("buwq", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("BleAdvertise: failed to start advertising.");
                } else {
                    buwp buwp = buwq.f155180d;
                    byya byya = buwq.f155177a.f155567b.f168925h;
                    if (byya == null) {
                        byya = byya.f168860j;
                    }
                    try {
                        if (!buwp.f155175a.await(byya.f168865d, TimeUnit.MILLISECONDS) || !buwp.f155176b) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } catch (InterruptedException e) {
                        bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
                        bnsl3.mo68432a("buwp", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("BleAdvertiseImplL: timed out waiting for advertising to start");
                        z2 = false;
                    }
                    buwq.f155179c = z2;
                }
            }
            if (!buwq.f155179c) {
                buwq.mo73194b();
            }
            if (buwq.f155179c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73202a(nej nej) {
        srn srn = bvcm.f155598a;
        if (!m120613q()) {
            return false;
        }
        neg p = m120612p();
        if (p != null) {
            try {
                if (!((Boolean) aucu.m76783a(p.mo20513a(nej), cfoa.m141095b(), TimeUnit.SECONDS)).booleanValue()) {
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return true;
            }
        }
        this.f155191i.remove(nej);
        return true;
    }
}
