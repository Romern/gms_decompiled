package p000;

import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;

/* renamed from: gft */
final /* synthetic */ class gft implements Runnable {

    /* renamed from: a */
    private final gfx f18102a;

    /* renamed from: b */
    private final gff f18103b;

    /* renamed from: c */
    private final Snoop$Params f18104c;

    /* renamed from: d */
    private final gez f18105d;

    public gft(gfx gfx, gff gff, Snoop$Params snoop$Params, gez gez) {
        this.f18102a = gfx;
        this.f18103b = gff;
        this.f18104c = snoop$Params;
        this.f18105d = gez;
    }

    public final void run() {
        gfx gfx = this.f18102a;
        gff gff = this.f18103b;
        Snoop$Params snoop$Params = this.f18104c;
        gez gez = this.f18105d;
        gcy gcy = gfx.f18114b;
        if (gcy.mo11661a()) {
            gcx gcx = new gcx(gff, snoop$Params.f9888b, snoop$Params.f9889c, snoop$Params.f9890d);
            for (Encoding encoding : snoop$Params.f9887a) {
                gel gel = new gel(gcx, encoding);
                gcy.f17900e.mo11736a(gel.f18049b).f18031b.mo11790a(gel.f18048a);
            }
            gcy.m12949a(gez, 0);
            return;
        }
        gcy.m12949a(gez, 6500);
    }
}
