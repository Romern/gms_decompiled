package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: pmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmz {

    /* renamed from: i */
    public static final /* synthetic */ int f39769i = 0;

    /* renamed from: j */
    private static final int f39770j = ((int) ccxv.f180201a.mo6606a().mo77034t());

    /* renamed from: a */
    public final qav f39771a = new qav("TcpDeviceProberNew");

    /* renamed from: b */
    public final Queue f39772b = new PriorityQueue();

    /* renamed from: c */
    public final Set f39773c = new HashSet();

    /* renamed from: d */
    public final Map f39774d = new HashMap();

    /* renamed from: e */
    public final phy f39775e;

    /* renamed from: f */
    public final poj f39776f;

    /* renamed from: g */
    public final sqv f39777g;

    /* renamed from: h */
    final pne f39778h;

    /* renamed from: k */
    private final qat f39779k;

    /* renamed from: l */
    private final pmx f39780l;

    /* renamed from: m */
    private List f39781m;

    public pmz(Context context, ScheduledExecutorService scheduledExecutorService, phy phy, poj poj, sqv sqv, qat qat, pmx pmx) {
        this.f39779k = qat;
        this.f39775e = phy;
        this.f39776f = poj;
        this.f39777g = sqv;
        this.f39780l = pmx;
        this.f39781m = new ArrayList(f39770j);
        this.f39778h = new pne(this);
        int i = 0;
        while (i < f39770j) {
            i++;
            this.f39781m.add(new pnf(context, scheduledExecutorService, "gms_cast_prober", i, phy, this.f39778h));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x018b A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo23467a(InetSocketAddress inetSocketAddress, bpfn bpfn, boolean z) {
        boolean z2;
        InetSocketAddress inetSocketAddress2 = inetSocketAddress;
        bpfn bpfn2 = bpfn;
        boolean z3 = z;
        if (inetSocketAddress2 != null) {
            Iterator it = this.f39780l.mo23460b().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pnt pnt = (pnt) it.next();
                CastDevice castDevice = pnt.f39878a;
                if (castDevice.f29715c.equals(inetSocketAddress.getAddress()) && castDevice.f29719g == inetSocketAddress.getPort()) {
                    Iterator it2 = this.f39773c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (!pnt.f39880c.contains(str) && !pnt.f39881d.contains(str)) {
                                break;
                            }
                        } else if (!z3) {
                            pic pic = this.f39775e.f39161f;
                            if (pic != null) {
                                pic.mo23157a(inetSocketAddress2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            List list = this.f39781m;
            int size = list.size();
            int i = 0;
            while (i < size) {
                pnf pnf = (pnf) list.get(i);
                InetSocketAddress inetSocketAddress3 = pnf.f39800l;
                if (inetSocketAddress3 != null && inetSocketAddress3.getAddress().equals(inetSocketAddress.getAddress()) && pnf.f39800l.getPort() == inetSocketAddress.getPort()) {
                    return;
                }
                if (!(inetSocketAddress.getAddress() instanceof Inet6Address) || cczx.m132361b()) {
                    String a = this.f39779k.mo23848a();
                    if (a == null) {
                        this.f39771a.mo23675c("Failed to get the BSSID of current network. Skip probing IP %s", inetSocketAddress2);
                        return;
                    }
                    Set set = this.f39773c;
                    if (set != null && !set.isEmpty()) {
                        if (TextUtils.isEmpty(a)) {
                            pnf.f39790b.mo23677d("wifiBssid can't be null or empty.", new Object[0]);
                            z2 = false;
                        } else if (pnf.f39791c.mo23311f() && pnf.f39800l == null) {
                            pnf.f39793e.clear();
                            pnf.f39794f.clear();
                            pnf.f39795g.clear();
                            pnf.f39798j = null;
                            pnf.f39801m = null;
                            pnf.f39802n = null;
                            pnf.f39805q = false;
                            pnf.f39806r = null;
                            pnf.f39803o = null;
                            pnf.f39808t = bpfn.TCP_PROBER_UNKNOWN;
                            pnf.f39804p = false;
                            pnf.f39807s = null;
                            pnf.f39790b.mo23857a("Activate %s (%d)", inetSocketAddress.getAddress(), Integer.valueOf(inetSocketAddress.getPort()));
                            pnf.f39800l = new InetSocketAddress(inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                            pnf.f39793e.addAll(set);
                            pnf.f39803o = a;
                            pnf.f39808t = bpfn2;
                            pnf.f39805q = z3;
                            try {
                                pnf.f39790b.mo23861b("connecting socket now");
                                ((pkk) pnf.f39791c).mo23303a((String) null, pnf.f39800l.getAddress(), pnf.f39800l.getPort());
                            } catch (IOException e) {
                                pnf.f39790b.mo23676c(e, "Exception while connecting socket", new Object[0]);
                                pnf.f39796h.execute(new pnc(pnf, inetSocketAddress2, e));
                                pnf.mo23474a(false);
                            }
                            pnf.f39799k = pnf.f39796h.schedule(new pnd(pnf), pnf.f39789a, TimeUnit.MILLISECONDS);
                            z2 = true;
                        }
                        i++;
                        if (z2) {
                            return;
                        }
                    }
                    z2 = false;
                    i++;
                    if (z2) {
                    }
                } else {
                    this.f39771a.mo23677d("IPv6 is disabled.", new Object[0]);
                    return;
                }
            }
            synchronized (this.f39772b) {
                for (pmy pmy : this.f39772b) {
                    if (pmy.f39765a.equals(inetSocketAddress2)) {
                        pmy.f39768d |= z3;
                        return;
                    }
                }
                this.f39772b.add(new pmy(inetSocketAddress2, bpfn2, z3));
            }
        }
    }
}
