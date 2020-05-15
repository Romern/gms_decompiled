package p000;

import android.os.IBinder;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import java.util.HashSet;

/* renamed from: gfr */
final /* synthetic */ class gfr implements Runnable {

    /* renamed from: a */
    private final gfx f18092a;

    /* renamed from: b */
    private final IBinder f18093b;

    /* renamed from: c */
    private final gfj f18094c;

    /* renamed from: d */
    private final String f18095d;

    /* renamed from: e */
    private final TokenBroadcaster$Params f18096e;

    /* renamed from: f */
    private final gez f18097f;

    public gfr(gfx gfx, IBinder iBinder, gfj gfj, String str, TokenBroadcaster$Params tokenBroadcaster$Params, gez gez) {
        this.f18092a = gfx;
        this.f18093b = iBinder;
        this.f18094c = gfj;
        this.f18095d = str;
        this.f18096e = tokenBroadcaster$Params;
        this.f18097f = gez;
    }

    public final void run() {
        gfx gfx = this.f18092a;
        IBinder iBinder = this.f18093b;
        gfj gfj = this.f18094c;
        String str = this.f18095d;
        TokenBroadcaster$Params tokenBroadcaster$Params = this.f18096e;
        gez gez = this.f18097f;
        gcy gcy = gfx.f18114b;
        if (!gcy.mo11662b()) {
            gcy.m12949a(gez, 6501);
            return;
        }
        gcv gcv = new gcv(gfj, str);
        if (gcy.f17897b.mo11631a(gcv, iBinder) != null) {
            HashSet hashSet = new HashSet();
            for (Encoding encoding : tokenBroadcaster$Params.f9893c) {
                hashSet.add(new geo(gcv, encoding, tokenBroadcaster$Params.f9892b, tokenBroadcaster$Params.f9891a, tokenBroadcaster$Params.f9894d));
            }
            gcy.mo11656a(gcv, hashSet);
            gcy.m12949a(gez, 0);
        }
    }
}
