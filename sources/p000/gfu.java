package p000;

import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Encoding;
import java.io.FileInputStream;

/* renamed from: gfu */
final /* synthetic */ class gfu implements Runnable {

    /* renamed from: a */
    private final gfx f18106a;

    /* renamed from: b */
    private final AudioStreamParams f18107b;

    /* renamed from: c */
    private final gfg f18108c;

    public gfu(gfx gfx, AudioStreamParams audioStreamParams, gfg gfg) {
        this.f18106a = gfx;
        this.f18107b = audioStreamParams;
        this.f18108c = gfg;
    }

    public final void run() {
        gfx gfx = this.f18106a;
        AudioStreamParams audioStreamParams = this.f18107b;
        gfg gfg = this.f18108c;
        gcy gcy = gfx.f18114b;
        srn srn = gdv.f17985a;
        FileInputStream fileInputStream = new FileInputStream(audioStreamParams.f9853a.getFileDescriptor());
        gem gem = gcy.f17900e;
        gdh gdh = new gdh(fileInputStream, audioStreamParams.f9855c, audioStreamParams.f9856d);
        gem.mo11737a();
        gem.f18051b = gdh;
        for (Encoding encoding : gem.f18050a.keySet()) {
            gem.f18051b.mo11642a((gcd) gem.f18050a.get(encoding));
        }
        gcy.f17896a.postDelayed(new gct(gfg), 2000);
    }
}
