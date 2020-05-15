package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aovd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovd {

    /* renamed from: c */
    public static final aovc f83659c = new aouz();

    /* renamed from: d */
    public static final aovc f83660d = new aova();

    /* renamed from: f */
    private static final Object f83661f = new Object();

    /* renamed from: g */
    private static volatile aovd f83662g;

    /* renamed from: h */
    private static final ScheduledExecutorService f83663h = adzl.f62962b.mo25877a(1, 2);

    /* renamed from: a */
    public final Object f83664a = new Object();

    /* renamed from: b */
    public final HashMap f83665b = new HashMap();

    /* renamed from: e */
    public final Map f83666e = new ConcurrentHashMap();

    private aovd() {
    }

    /* renamed from: a */
    public static aovd m69610a() {
        if (f83662g == null) {
            synchronized (f83661f) {
                if (f83662g == null) {
                    f83662g = new aovd();
                }
            }
        }
        return f83662g;
    }

    /* renamed from: a */
    public final void mo46930a(blox blox, String str) {
        if (blox != null && (blox.f127162a & 2) != 0 && !TextUtils.isEmpty(str)) {
            String str2 = blox.f127163b;
            aost aost = (aost) this.f83666e.get(str2);
            if (aost != null) {
                try {
                    Parcel bj = aost.mo8529bj();
                    bj.writeString(str2);
                    bj.writeString(str);
                    aost.mo8528b(6, bj);
                } catch (RemoteException e) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo46931a(DataHolder dataHolder, aovc aovc) {
        synchronized (this.f83664a) {
            String str = null;
            if (dataHolder.f30168h != 0 && dataHolder.mo17766a("account_name")) {
                String c = dataHolder.mo17769c("account_name", 0, 0);
                if (!TextUtils.isEmpty(c)) {
                    str = c;
                }
            }
            if (str != null && this.f83665b.containsKey(str)) {
                for (Set set : ((WeakHashMap) this.f83665b.get(str)).values()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            aovc.mo46928a((aost) it.next(), dataHolder);
                        } catch (RemoteException e) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46932a(String str, aost aost) {
        this.f83666e.put(str, aost);
        f83663h.schedule(new aovb(this, str), 5, TimeUnit.MINUTES);
    }
}
