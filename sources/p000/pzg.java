package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pzg */
public final /* synthetic */ class pzg implements aubw {

    /* renamed from: a */
    private final CastDevice f40733a;

    /* renamed from: b */
    private final pky f40734b;

    /* renamed from: c */
    private final qav f40735c;

    /* renamed from: d */
    private final piu f40736d;

    public pzg(CastDevice castDevice, pky pky, piu piu, qav qav) {
        this.f40733a = castDevice;
        this.f40734b = pky;
        this.f40736d = piu;
        this.f40735c = qav;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        CastDevice castDevice = this.f40733a;
        pky pky = this.f40734b;
        piu piu = this.f40736d;
        int a = pzi.m31710a(castDevice, (bshw) obj, pky, this.f40735c);
        if (a == 0) {
            piu.f39254a.f39316e.mo23861b("Successful relay cast session initiated");
        } else {
            piu.mo23224a(a);
        }
    }
}
