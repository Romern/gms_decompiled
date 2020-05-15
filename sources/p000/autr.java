package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: autr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autr {

    /* renamed from: a */
    public final String f92508a;

    /* renamed from: b */
    public final String f92509b;

    /* renamed from: c */
    public final BluetoothDevice f92510c;

    /* renamed from: d */
    public final Set f92511d = new HashSet();

    /* renamed from: e */
    public final String f92512e;

    /* renamed from: f */
    public final String f92513f;

    /* renamed from: g */
    public final String f92514g;

    /* renamed from: h */
    public final String f92515h;

    /* renamed from: i */
    public final String f92516i;

    /* renamed from: j */
    public final String f92517j;

    /* renamed from: k */
    public final String f92518k;

    /* renamed from: l */
    public final String f92519l;

    /* renamed from: m */
    public final String f92520m;

    /* renamed from: n */
    public final String f92521n;

    public autr(BluetoothDevice bluetoothDevice) {
        this.f92508a = bluetoothDevice.getAddress();
        this.f92510c = bluetoothDevice;
        this.f92509b = auuj.m77854a(bluetoothDevice);
        this.f92512e = auuj.m77858b(this.f92508a);
        String valueOf = String.valueOf(this.f92508a);
        this.f92513f = valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_bluetooth_title") : "auth_trust_agent_pref_trusted_bluetooth_title".concat(valueOf);
        this.f92521n = auuj.m77870i(this.f92508a);
        this.f92514g = auuj.m77861c(this.f92508a);
        this.f92515h = auuj.m77864d(this.f92508a);
        this.f92518k = auuj.m77856a("on_body", this.f92508a);
        this.f92519l = auuj.m77856a("user_authenticated", this.f92508a);
        this.f92516i = auuj.m77866e(this.f92508a);
        this.f92517j = auuj.m77867f(this.f92508a);
        this.f92520m = auuj.m77868g(this.f92508a);
    }

    /* renamed from: a */
    public static autr m77810a(BluetoothDevice bluetoothDevice, aupn aupn) {
        autr autr = new autr(bluetoothDevice);
        for (String str : ((aupj) aupn).f92270a.getStringSet(auuj.m77861c(bluetoothDevice.getAddress()), Collections.emptySet())) {
            try {
                autr.f92511d.add(new autp(autr.f92510c, str));
            } catch (auto e) {
            }
        }
        return autr;
    }

    /* renamed from: b */
    public final autq mo50914b(aupn aupn) {
        if (mo50913a(aupn)) {
            return new autq(this, aupn);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo50916c() {
        for (autp autp : this.f92511d) {
            if ("on_body".equals(autp.f92505b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo50917d() {
        for (autp autp : this.f92511d) {
            if ("user_authenticated".equals(autp.f92505b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final String mo50918e() {
        String valueOf = String.valueOf(this.f92508a);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_last_eid_migration_check_time_millis_") : "auth_trust_agent_pref_last_eid_migration_check_time_millis_".concat(valueOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof autr) {
            return ((autr) obj).f92508a.equals(this.f92508a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92508a.hashCode();
    }

    /* renamed from: b */
    public final bnic mo50915b() {
        return bnic.m109495a((Collection) this.f92511d);
    }

    /* renamed from: a */
    public static final void m77811a(aupn aupn, String str) {
        if (aupn.mo50729a(str)) {
            aupn.mo50731b(str);
        }
    }

    /* renamed from: a */
    public final void mo50911a(aupn aupn, bedt bedt) {
        bedn bedn = bedt.f106988b.f106985d;
        aupn.mo50732b(this.f92516i, bedn.f106978a);
        aupn.mo50732b(this.f92517j, bedt.f106988b.f106986e);
        aupn.mo50728a(this.f92518k, bedn.f106979b);
        aupn.mo50728a(this.f92519l, bedn.f106980c);
        aupn.mo50732b(this.f92520m, bedt.f106987a);
        aupn.mo50737d();
    }

    /* renamed from: a */
    public final boolean mo50912a() {
        BluetoothDevice bluetoothDevice = this.f92510c;
        return bluetoothDevice != null && bluetoothDevice.getBondState() == 12;
    }

    /* renamed from: a */
    public final boolean mo50913a(aupn aupn) {
        return aupn.mo50729a(this.f92515h);
    }
}
