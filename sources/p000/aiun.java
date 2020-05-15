package p000;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import java.util.List;

/* renamed from: aiun */
final /* synthetic */ class aiun implements Runnable {

    /* renamed from: a */
    private final aivd f69797a;

    /* renamed from: b */
    private final DiscoverySession f69798b;

    /* renamed from: c */
    private final PeerHandle f69799c;

    /* renamed from: d */
    private final String f69800d;

    /* renamed from: e */
    private final byte[] f69801e;

    /* renamed from: f */
    private final List f69802f;

    /* renamed from: g */
    private final aimm f69803g;

    public aiun(aivd aivd, DiscoverySession discoverySession, PeerHandle peerHandle, String str, byte[] bArr, List list, aimm aimm) {
        this.f69797a = aivd;
        this.f69798b = discoverySession;
        this.f69799c = peerHandle;
        this.f69800d = str;
        this.f69801e = bArr;
        this.f69802f = list;
        this.f69803g = aimm;
    }

    public final void run() {
        this.f69797a.mo38091a(this.f69798b, this.f69799c, this.f69800d, this.f69801e, this.f69802f, this.f69803g);
    }
}
