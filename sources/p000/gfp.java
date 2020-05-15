package p000;

import android.os.IBinder;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.HashSet;

/* renamed from: gfp */
final /* synthetic */ class gfp implements Runnable {

    /* renamed from: a */
    private final gfx f18082a;

    /* renamed from: b */
    private final IBinder f18083b;

    /* renamed from: c */
    private final gfm f18084c;

    /* renamed from: d */
    private final String f18085d;

    /* renamed from: e */
    private final TokenReceiver$Params f18086e;

    /* renamed from: f */
    private final gez f18087f;

    public gfp(gfx gfx, IBinder iBinder, gfm gfm, String str, TokenReceiver$Params tokenReceiver$Params, gez gez) {
        this.f18082a = gfx;
        this.f18083b = iBinder;
        this.f18084c = gfm;
        this.f18085d = str;
        this.f18086e = tokenReceiver$Params;
        this.f18087f = gez;
    }

    public final void run() {
        gfx gfx = this.f18082a;
        IBinder iBinder = this.f18083b;
        gfm gfm = this.f18084c;
        String str = this.f18085d;
        TokenReceiver$Params tokenReceiver$Params = this.f18086e;
        gez gez = this.f18087f;
        gcy gcy = gfx.f18114b;
        if (!gcy.mo11661a()) {
            gcy.m12949a(gez, 6500);
            return;
        }
        gcw gcw = new gcw(gfm, str);
        if (gcy.f17897b.mo11631a(gcw, iBinder) != null) {
            HashSet hashSet = new HashSet();
            for (Encoding encoding : tokenReceiver$Params.f9895a) {
                hashSet.add(new gek(gcw, encoding));
            }
            gcy.mo11657a(gcw, hashSet);
            gcy.m12949a(gez, 0);
        }
    }
}
