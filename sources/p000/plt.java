package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: plt */
final /* synthetic */ class plt implements Runnable {

    /* renamed from: a */
    private final plu f39622a;

    public plt(plu plu) {
        this.f39622a = plu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pnh.a(pnm, bpfn, boolean, boolean):void
     arg types: [pnm, bpfn, int, int]
     candidates:
      pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void
      pnh.a(pnm, bpfn, boolean, boolean):void */
    public final void run() {
        plu plu = this.f39622a;
        if (!ccyz.m132249b() || plu.f39646g.mo23398a()) {
            pnl pnl = plu.f39646g.f39648b;
            synchronized (pnl) {
                plu.f39624a.mo23861b("BleProbingWorker runnable triggered.");
                if (pnl.mo23491c() == null) {
                    plu.f39624a.mo23677d("Failed to get current network info.", new Object[0]);
                    return;
                }
                pes pes = pes.f38974a;
                List<pnm> a = pnl.mo23481a(System.currentTimeMillis());
                Map b = plu.f39625b.mo23460b();
                HashSet hashSet = new HashSet();
                for (pnt pnt : b.values()) {
                    InetAddress inetAddress = pnt.f39878a.f29715c;
                    if (inetAddress != null) {
                        byte[] address = inetAddress.getAddress();
                        hashSet.add(Integer.valueOf((address[2] << 8) + address[3]));
                    }
                }
                for (pnm pnm : a) {
                    CastDevice castDevice = pnm.f39844a;
                    plu.f39624a.mo23856a("Checking BLE device: %s.", pnm);
                    if (TextUtils.isEmpty(castDevice.mo17494a()) || !b.containsKey(castDevice.mo17494a())) {
                        byte[] bArr = castDevice.f29726n;
                        if (bArr == null) {
                            plu.f39624a.mo23861b("The device doesn't have the lowest two bytes.");
                        } else if (!hashSet.contains(Integer.valueOf((bArr[0] << 8) + bArr[1]))) {
                            plu.f39624a.mo23856a("Try to probe BLE device: %s", pnm);
                            plu.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_BLE, false, false);
                        } else {
                            plu.f39624a.mo23861b("A published device has the same IP fragment.");
                        }
                    } else {
                        plu.f39624a.mo23861b("Already published.");
                    }
                }
            }
        }
    }
}
