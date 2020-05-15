package p000;

import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.magictether.host.ApDisablingIntentOperation;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: afay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afay implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TetherListenerChimeraService f64111a;

    public afay(TetherListenerChimeraService tetherListenerChimeraService) {
        this.f64111a = tetherListenerChimeraService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0145 A[SYNTHETIC, Splitter:B:70:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016d A[DONT_GENERATE] */
    public final void run() {
        List list;
        int i;
        aezx aezx;
        boolean z;
        int i2;
        if (cfcj.m138659f()) {
            this.f64111a.stopSelf();
            return;
        }
        afaz.m52798a();
        afba.m52799e(0);
        if (!afak.m52783a()) {
            Logger Logger = TetherListenerChimeraService.f79824e;
            this.f64111a.stopSelf();
            afba.m52799e(1);
            return;
        }
        Set a = this.f64111a.mo43840a();
        TetherListenerChimeraService tetherListenerChimeraService = this.f64111a;
        boolean z2 = !a.isEmpty();
        if (!cfcs.m138695b()) {
            z2 = afaj.m52782a(tetherListenerChimeraService).mo34695b();
        }
        if (z2) {
            rpr b = rpr.m34216b();
            if (TetherListenerChimeraService.f79823a == null) {
                TetherListenerChimeraService.f79823a = new TetherListenerChimeraService.BluetoothStateChangeReceiver();
                b.registerReceiver(TetherListenerChimeraService.f79823a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            }
            if (afak.m52784b()) {
                afby a2 = afbv.m52820a(b);
                afca a3 = afbz.m52827a(a2);
                if (!a2.mo34732b() || !a3.mo34735a()) {
                    TetherListenerChimeraService.m67141a(b, false);
                } else {
                    aezy.m52769a(b).mo34703a(false);
                    afcg.m52833a().mo34740a(ApDisablingIntentOperation.m67131a(b));
                }
                if (cfcs.m138695b()) {
                    TetherListenerChimeraService tetherListenerChimeraService2 = this.f64111a;
                    a.getClass();
                    list = tetherListenerChimeraService2.mo43839a(new afaw(a));
                } else {
                    list = this.f64111a.mo43839a(afax.f64110a);
                }
                if (list.isEmpty()) {
                    this.f64111a.stopSelf();
                    afba.m52799e(4);
                    return;
                }
                synchronized (this.f64111a.f79825b) {
                    if (!cfcg.f183612a.mo6606a().mo80825a()) {
                        i = 32;
                    } else {
                        i = 8;
                    }
                    aezx aezx2 = this.f64111a.f79826c;
                    if (aezx2 != null) {
                        synchronized (aezx2.f64063d) {
                            z = !new HashSet(aezx2.f64061b).equals(new HashSet(list));
                        }
                        if (!z) {
                            aezx aezx3 = this.f64111a.f79826c;
                            synchronized (aezx3.f64063d) {
                                Role role = aezx3.f64064e;
                                if (role != null) {
                                    i2 = role.f11147c;
                                } else {
                                    i2 = 0;
                                }
                            }
                            if (i2 == i) {
                                aezx aezx4 = this.f64111a.f79826c;
                                if (aezx4.f64062c) {
                                    aezx4.mo34701c();
                                }
                                aezx = this.f64111a.f79826c;
                                if (!aezx.f64062c) {
                                    try {
                                        aezx.mo34699a(i);
                                        if (!(aezx2 == null || aezx2 == this.f64111a.f79826c)) {
                                            aezx2.mo34698a();
                                        }
                                    } catch (gid e) {
                                        TetherListenerChimeraService.f79824e.mo25417e("ProximityAuth API connection failed.", e, new Object[0]);
                                        this.f64111a.stopSelf();
                                        afba.m52799e(7);
                                        return;
                                    }
                                }
                                if (cfcj.m138656c()) {
                                    TetherListenerChimeraService.f79824e.mo25414c("Forcing unregister of all devices due to magic tether being disabled via gservices.", new Object[0]);
                                    this.f64111a.stopSelf();
                                    afba.m52799e(5);
                                    return;
                                }
                                afba.m52799e(6);
                                return;
                            }
                        }
                    }
                    Object[] objArr = {Integer.valueOf(list.size()), TextUtils.join("\n ", list)};
                    TetherListenerChimeraService tetherListenerChimeraService3 = this.f64111a;
                    tetherListenerChimeraService3.f79827d = new afav(tetherListenerChimeraService3);
                    TetherListenerChimeraService tetherListenerChimeraService4 = this.f64111a;
                    tetherListenerChimeraService4.f79826c = new aezx(b, list, tetherListenerChimeraService4.f79827d);
                    aezx = this.f64111a.f79826c;
                    if (!aezx.f64062c) {
                    }
                    if (cfcj.m138656c()) {
                    }
                }
            } else {
                this.f64111a.stopSelf();
                afba.m52799e(3);
            }
        } else {
            this.f64111a.stopSelf();
            afba.m52799e(2);
        }
    }
}
