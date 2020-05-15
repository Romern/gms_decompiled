package p000;

import android.bluetooth.BluetoothDevice;
import java.util.HashSet;

/* renamed from: auta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auta implements ause {

    /* renamed from: a */
    final /* synthetic */ autb f92469a;

    /* renamed from: b */
    final /* synthetic */ auti f92470b;

    public auta(autb autb, auti auti) {
        this.f92469a = autb;
        this.f92470b = auti;
    }

    /* renamed from: a */
    public final void mo50658a(BluetoothDevice bluetoothDevice, String str) {
        this.f92470b.mo50900a(false);
    }

    /* renamed from: a */
    public final void mo50659a(BluetoothDevice bluetoothDevice, String str, aury aury, bedt bedt) {
        boolean z = aury.f92392a;
        boolean z2 = aury.f92393b;
        autb.f92471a.mo50711a("Migrated device %s with {onBodyCapable: %b, userAuthCapable %b}", bluetoothDevice, Boolean.valueOf(z), Boolean.valueOf(z2)).mo50708c();
        HashSet hashSet = new HashSet();
        if (z) {
            hashSet.add("on_body");
        }
        if (z2) {
            hashSet.add("user_authenticated");
        }
        String address = bluetoothDevice.getAddress();
        aupn aupn = this.f92469a.f92473c;
        ((aupj) aupn).f92271b.putString(auuj.m77864d(address), str);
        aupn aupn2 = this.f92469a.f92473c;
        ((aupj) aupn2).f92271b.putStringSet(auuj.m77861c(address), hashSet);
        this.f92469a.f92473c.mo50737d();
        this.f92470b.mo50900a(true);
    }
}
