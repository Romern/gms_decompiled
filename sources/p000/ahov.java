package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahov {

    /* renamed from: a */
    public static final ahot f67665a = new ahot();

    /* renamed from: b */
    public final ailh f67666b;

    /* renamed from: c */
    public final AtomicBoolean f67667c = new AtomicBoolean();

    /* renamed from: d */
    public final Object f67668d = new Object();

    /* renamed from: e */
    public final Object f67669e = new Object();

    /* renamed from: f */
    public final Object f67670f = new Object();

    /* renamed from: g */
    public final Object f67671g = new Object();

    /* renamed from: h */
    public final Object f67672h = new Object();

    /* renamed from: i */
    public final Object f67673i = new Object();

    /* renamed from: j */
    public final Object f67674j = new Object();

    /* renamed from: k */
    public final Object f67675k = new Object();

    public ahov(Context context) {
        ailh ailh = new ailh(context);
        this.f67666b = ailh;
        this.f67667c.set(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aipa mo36913a(BluetoothDevice bluetoothDevice, String str, ahfk ahfk) {
        synchronized (this.f67668d) {
            if (!mo36916a()) {
                return null;
            }
            if (!this.f67666b.f69115b.mo37631a()) {
                return null;
            }
            aipa a = this.f67666b.f69118e.mo37574a(bluetoothDevice, str, ahfk);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return r2;
     */
    /* renamed from: b */
    public final String mo36923b() {
        synchronized (this.f67668d) {
            String str = null;
            if (!mo36916a()) {
                return null;
            }
            String string = Settings.Secure.getString(this.f67666b.f69118e.f68960a.getContentResolver(), "bluetooth_address");
            if (string != null && BluetoothAdapter.checkBluetoothAddress(string)) {
                str = string;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final BluetoothDevice mo36925c(String str) {
        synchronized (this.f67668d) {
            if (!mo36916a()) {
                return null;
            }
            if (!this.f67666b.f69115b.mo37631a()) {
                return null;
            }
            BluetoothDevice e = this.f67666b.f69118e.mo37586e(str);
            return e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36927d() {
        synchronized (this.f67670f) {
            if (mo36916a()) {
                this.f67666b.f69120g.mo37753h();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo36929e() {
        aiof aiof = this.f67666b.f69120g;
        int i = Build.VERSION.SDK_INT;
        WifiManager wifiManager = aiof.f69322c;
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.is5GHzBandSupported();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo36931f() {
        synchronized (this.f67672h) {
            if (mo36916a()) {
                this.f67666b.f69122i.f69193a.mo38102c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36933g() {
        synchronized (this.f67673i) {
            if (mo36916a()) {
                this.f67666b.f69123j.mo37712c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36935h() {
        synchronized (this.f67673i) {
            if (mo36916a()) {
                this.f67666b.f69123j.mo37715f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36937i(String str) {
        synchronized (this.f67672h) {
            if (mo36916a()) {
                this.f67666b.f69122i.f69193a.mo38104d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo36938j(String str) {
        synchronized (this.f67672h) {
            if (mo36916a()) {
                this.f67666b.f69122i.f69193a.mo38107e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo36939k(String str) {
        synchronized (this.f67674j) {
            if (mo36916a()) {
                this.f67666b.f69125l.mo37658d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36928d(String str) {
        synchronized (this.f67669e) {
            if (mo36916a()) {
                this.f67666b.f69119f.mo37627f(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo36930e(String str) {
        boolean b;
        synchronized (this.f67671g) {
            b = this.f67666b.f69121h.mo37781b(str);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36934g(String str) {
        synchronized (this.f67672h) {
            if (mo36916a()) {
                this.f67666b.f69122i.f69194b.mo38137b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36936h(String str) {
        synchronized (this.f67672h) {
            if (mo36916a()) {
                this.f67666b.f69122i.f69193a.mo38100b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo36932f(String str) {
        synchronized (this.f67671g) {
            if (mo36916a()) {
                this.f67666b.f69121h.mo37773a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        return r3;
     */
    /* renamed from: a */
    public final aivx mo36914a(aivw aivw, String str, ahfk ahfk) {
        synchronized (this.f67672h) {
            aivx aivx = null;
            if (!mo36916a()) {
                return null;
            }
            if (!this.f67666b.f69116c.mo37789a()) {
                return null;
            }
            aivv aivv = this.f67666b.f69122i.f69194b;
            if (aivw == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aivv", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Refusing to connect to WiFi Aware network because wifiAwarePeer is null.");
            } else {
                aivu aivu = new aivu(aivv.f69904a, aivv.f69905b, aivw, str, ahfk);
                if (airr.SUCCESS != aivv.f69906c.mo37908b(aivu)) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68432a("aivv", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to connect WiFi Aware socket because the MediumOperation failed to register.");
                } else {
                    aivx = aivu.f69898a;
                    aivx.mo37637a(new aivq(aivv, aivu));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36924b(String str) {
        synchronized (this.f67668d) {
            if (mo36916a()) {
                this.f67666b.f69118e.mo37585d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo36926c() {
        synchronized (this.f67670f) {
            if (mo36916a()) {
                this.f67666b.f69120g.mo37750e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo36915a(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bvif bvif = (bvif) it.next();
            bvif bvif2 = bvif.UNKNOWN_MEDIUM;
            switch (bvif.ordinal()) {
                case 2:
                    z = this.f67666b.f69118e.mo37580b();
                    break;
                case 3:
                    z = this.f67666b.f69120g.mo37744a();
                    break;
                case 4:
                    z = this.f67666b.f69119f.mo37621b();
                    break;
                case 5:
                    z = this.f67666b.f69121h.mo37780b();
                    break;
                case 6:
                    z = this.f67666b.f69122i.mo37688b();
                    break;
                case 7:
                    z = this.f67666b.f69125l.mo37656b();
                    break;
                case 8:
                    z = this.f67666b.f69123j.mo37708a();
                    break;
                case 9:
                    z = this.f67666b.f69124k.mo37675a();
                    break;
            }
            if (z) {
                arrayList.add(bvif);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo36916a() {
        if (!this.f67667c.get()) {
            return false;
        }
        try {
            f67665a.mo36911a(this);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36917a(String str) {
        synchronized (this.f67668d) {
            if (!mo36916a()) {
                return false;
            }
            boolean c = this.f67666b.f69118e.mo37583c(str);
            return c;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo36918a(String str, ahon ahon) {
        synchronized (this.f67672h) {
            boolean z = false;
            if (!mo36916a()) {
                return false;
            }
            if (this.f67666b.f69116c.mo37789a()) {
                if (this.f67666b.f69122i.f69193a.mo38097a(str, new aimm(new ahol(ahon)))) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo36919a(String str, ahoo ahoo) {
        synchronized (this.f67668d) {
            boolean z = false;
            if (!mo36916a()) {
                return false;
            }
            if (this.f67666b.f69115b.mo37631a()) {
                aijh aijh = this.f67666b.f69118e;
                ahoo.getClass();
                if (aijh.mo37579a(str, new ahoa(ahoo))) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo36920a(String str, ahos ahos) {
        synchronized (this.f67671g) {
            boolean z = false;
            if (!mo36916a()) {
                return false;
            }
            if (this.f67666b.f69116c.mo37789a()) {
                aiox aiox = this.f67666b.f69121h;
                ahos.getClass();
                if (aiox.mo37777a(str, new ahod(ahos))) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo36921a(String str, String str2, ahop ahop) {
        synchronized (this.f67672h) {
            boolean z = false;
            if (!mo36916a()) {
                return false;
            }
            if (this.f67666b.f69116c.mo37789a()) {
                aimn aimn = this.f67666b.f69122i;
                ahop.getClass();
                ahoe ahoe = new ahoe(ahop);
                aivv aivv = aimn.f69194b;
                ahoe.getClass();
                if (aivv.mo38136a(str, str2, new aiml(ahoe))) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo36922a(String str, byte[] bArr) {
        synchronized (this.f67672h) {
            boolean z = false;
            if (!mo36916a()) {
                return false;
            }
            if (this.f67666b.f69116c.mo37789a() && this.f67666b.f69122i.f69193a.mo38098a(str, bArr)) {
                z = true;
            }
        }
    }
}
