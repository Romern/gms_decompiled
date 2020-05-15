package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vev implements ves {

    /* renamed from: a */
    public static final sbw f49146a = new sbw("NetworkStoreImpl", "");

    /* renamed from: b */
    public final ConnectivityManager f49147b;

    /* renamed from: c */
    public final Object f49148c = new Object();

    /* renamed from: d */
    public final Set f49149d = new HashSet();

    /* renamed from: e */
    public final Set f49150e = new HashSet();

    /* renamed from: f */
    public final Comparator f49151f = new veu(this);

    /* renamed from: g */
    private final ConnectivityManager.NetworkCallback f49152g = new vet(this);

    public vev(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        this.f49147b = connectivityManager;
        this.f49147b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.f49152g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4.isRoaming() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r5.mo18217a() == 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4.getType() == 1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = r3.f49147b.getNetworkInfo(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r5.mo18218b() != false) goto L_0x0022;
     */
    /* renamed from: a */
    public final boolean mo28363a(Network network, txg txg) {
        synchronized (this.f49148c) {
            if (!this.f49149d.contains(network)) {
                return false;
            }
        }
    }
}
