package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import java.util.concurrent.Executor;

/* renamed from: batl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class batl implements azzo {

    /* renamed from: a */
    public final bati f101704a;

    /* renamed from: b */
    public final basb f101705b;

    /* renamed from: c */
    public final basa f101706c;

    /* renamed from: d */
    public final String f101707d;

    /* renamed from: e */
    public final Executor f101708e;

    public batl(bati bati, basb basb, String str, Executor executor) {
        this.f101704a = bati;
        this.f101705b = basb;
        barz b = basa.m87474b();
        b.mo55924a(null, 1);
        this.f101706c = b.mo55923a();
        this.f101707d = str;
        this.f101708e = executor;
    }

    /* renamed from: a */
    public final void mo55518a() {
        basb basb = this.f101705b;
        basa basa = this.f101706c;
        bass bass = (bass) basb;
        Executor executor = bass.f101671a;
        afmp afmp = bass.f101676f;
        LatestFootprintFilter a = basn.m87494a(basa);
        aucf aucf = new aucf();
        afmp.mo34966a(new afmk(aucf, new aflq(afmp, a, aucf)));
        bqga.m112781a(basy.m87507a(executor, aucf.f91388a, new basq(bass)), new batk(this), this.f101708e);
    }
}
