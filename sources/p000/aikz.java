package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.nearby.mediums.BluetoothRadio$1;
import com.google.android.gms.nearby.mediums.BluetoothRadio$2;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aikz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aikz {

    /* renamed from: a */
    public final bqgj f69104a;

    /* renamed from: b */
    private final Context f69105b;

    /* renamed from: c */
    private final airs f69106c;

    /* renamed from: d */
    private final BluetoothAdapter f69107d;

    /* renamed from: e */
    private final AtomicBoolean f69108e;

    /* renamed from: f */
    private airo f69109f;

    /* renamed from: g */
    private final BroadcastReceiver f69110g = new BluetoothRadio$1(this, "nearby");

    public aikz(Context context, airs airs) {
        bqgj b = ahhr.m55806b();
        this.f69105b = context.getApplicationContext();
        this.f69106c = airs;
        this.f69104a = b;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f69107d = defaultAdapter;
        if (defaultAdapter != null) {
            if (!m57397b(false)) {
                m57400e();
            } else if (!m57399d()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aikz", "<init>", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s Failed to take register radio state upon initialization.", "[BLUETOOTH_RADIO]");
                this.f69108e = null;
                return;
            }
            this.f69108e = new AtomicBoolean(this.f69107d.isEnabled());
            srn srn = ailf.f69111a;
            this.f69107d.isEnabled();
            m57401f();
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aikz", "<init>", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to retrieve default BluetoothAdapter, Bluetooth is unsupported.");
        this.f69108e = null;
    }

    /* renamed from: a */
    private final boolean m57396a(boolean z) {
        String str;
        boolean z2;
        Context context;
        if (m57397b(z)) {
            return true;
        }
        if (!z) {
            str = "disable";
        } else {
            str = "enable";
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BluetoothRadio$2 bluetoothRadio$2 = new BluetoothRadio$2("nearby", z, countDownLatch);
        this.f69105b.registerReceiver(bluetoothRadio$2, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        m57402g();
        if (!z) {
            try {
                z2 = this.f69107d.disable();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aikz", "a", 475, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Interrupted while waiting to %s Bluetooth, bailing.", str);
                context = this.f69105b;
            } catch (Throwable th) {
                ahhd.m55766a(this.f69105b, bluetoothRadio$2);
                m57401f();
                throw th;
            }
        } else {
            z2 = this.f69107d.enable();
        }
        if (z2) {
            if (!countDownLatch.await(cfnv.m140796t(), TimeUnit.SECONDS)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68432a("aikz", "a", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s timed out while waiting for latch to signal Bluetooth state change completion.", "[BLUETOOTH_RADIO]");
            } else {
                srn srn = ailf.f69111a;
            }
            if (z) {
                Thread.sleep(cfnv.f184625a.mo6606a().mo81726L());
            }
            ahhd.m55766a(this.f69105b, bluetoothRadio$2);
            m57401f();
            if (m57397b(z)) {
                return true;
            }
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aikz", "a", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68423a("Failed to %s Bluetooth after waiting %d seconds, bailing.", str, cfnv.m140796t());
            return false;
        }
        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
        bnsl4.mo68432a("aikz", "a", 442, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Failed to begin transition to %s Bluetooth.", str);
        context = this.f69105b;
        ahhd.m55766a(context, bluetoothRadio$2);
        m57401f();
        return false;
    }

    /* renamed from: b */
    private final boolean m57397b(boolean z) {
        return !z ? !this.f69107d.isEnabled() : this.f69107d.isEnabled();
    }

    /* renamed from: c */
    private final boolean m57398c() {
        return (this.f69107d == null || this.f69108e == null) ? false : true;
    }

    /* renamed from: d */
    private final boolean m57399d() {
        if (m57403h()) {
            srn srn = ailf.f69111a;
            return true;
        }
        airo airo = new airo(1);
        if (airr.SUCCESS != this.f69106c.mo37908b(airo)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aikz", "d", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Failed to mark Bluetooth as disabled because we were unable to register the MediumOperation.", "[BLUETOOTH_RADIO]");
            return false;
        }
        this.f69109f = airo;
        srn srn2 = ailf.f69111a;
        return true;
    }

    /* renamed from: e */
    private final void m57400e() {
        if (!m57403h()) {
            srn srn = ailf.f69111a;
            return;
        }
        this.f69106c.mo37910c(this.f69109f);
        this.f69109f = null;
        srn srn2 = ailf.f69111a;
    }

    /* renamed from: f */
    private final void m57401f() {
        this.f69105b.registerReceiver(this.f69110g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    /* renamed from: g */
    private final void m57402g() {
        ahhd.m55766a(this.f69105b, this.f69110g);
    }

    /* renamed from: h */
    private final boolean m57403h() {
        return this.f69109f != null;
    }

    /* renamed from: b */
    public final synchronized void mo37632b() {
        if (!m57398c()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aikz", "b", 279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to revert Bluetooth Radio since it was never initialized.", "[BLUETOOTH_RADIO]");
            return;
        }
        srn srn = ailf.f69111a;
        this.f69108e.get();
        try {
            if (!m57396a(this.f69108e.get())) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68432a("aikz", "b", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s Failed to revert Bluetooth back to its most recent manually-set state.", "[BLUETOOTH_RADIO]");
            }
        } finally {
            m57402g();
            ahhr.m55805a(this.f69104a, "BluetoothRadio.singleThreadOffloader");
        }
    }

    aikz(Context context, airs airs, bqgj bqgj) {
        this.f69105b = context.getApplicationContext();
        this.f69106c = airs;
        this.f69104a = bqgj;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f69107d = defaultAdapter;
        if (defaultAdapter != null) {
            if (!m57397b(false)) {
                m57400e();
            } else if (!m57399d()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aikz", "<init>", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s Failed to take register radio state upon initialization.", "[BLUETOOTH_RADIO]");
                this.f69108e = null;
                return;
            }
            this.f69108e = new AtomicBoolean(this.f69107d.isEnabled());
            srn srn = ailf.f69111a;
            this.f69107d.isEnabled();
            m57401f();
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aikz", "<init>", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to retrieve default BluetoothAdapter, Bluetooth is unsupported.");
        this.f69108e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37630a(Intent intent) {
        String str;
        if (!m57398c()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aikz", "a", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to process manual radio state change since Bluetooth Radio was never initialized.", "[BLUETOOTH_RADIO]");
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            srn srn = ailf.f69111a;
            switch (intExtra) {
                case 10:
                    str = "STATE_OFF";
                    break;
                case 11:
                    str = "STATE_TURNING_ON";
                    break;
                case 12:
                    str = "STATE_ON";
                    break;
                case 13:
                    str = "STATE_TURNING_OFF";
                    break;
                default:
                    str = "STATE_UNKNOWN";
                    break;
            }
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Integer.valueOf(intExtra), str};
            if (intExtra == 12) {
                m57400e();
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68432a("aikz", "a", 338, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s State was changed outside of our control. Updating the snapshot to match current radio state.", "[BLUETOOTH_RADIO]");
                this.f69108e.getAndSet(this.f69107d.isEnabled());
            } else if (intExtra == 10) {
                m57399d();
                bnsl bnsl22 = (bnsl) ailf.f69111a.mo68388c();
                bnsl22.mo68432a("aikz", "a", 338, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl22.mo68420a("%s State was changed outside of our control. Updating the snapshot to match current radio state.", "[BLUETOOTH_RADIO]");
                this.f69108e.getAndSet(this.f69107d.isEnabled());
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37631a() {
        if (!m57398c()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aikz", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to enable Bluetooth Radio since it was never initialized.", "[BLUETOOTH_RADIO]");
            return false;
        } else if (m57397b(true)) {
            srn srn = ailf.f69111a;
            m57400e();
            return true;
        } else if (!m57396a(true)) {
            srn srn2 = ailf.f69111a;
            m57400e();
            return false;
        } else {
            m57400e();
            srn srn3 = ailf.f69111a;
            return true;
        }
    }
}
