package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: baca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baca extends cazu {

    /* renamed from: b */
    private final cazn f100454b;

    /* renamed from: c */
    private final cazn f100455c;

    /* renamed from: d */
    private final cazn f100456d;

    private baca(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(baca.class), cijl);
        this.f100454b = cbac.m127643a(cazn);
        this.f100455c = cbac.m127643a(cazn2);
        this.f100456d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static baca m86553a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new baca(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return bqga.m112775a((byik) ((byik) ((byik) ciih.m150373a(new byij(), (chqp) list.get(0))).mo86138a((chqm) list.get(1))).mo86137a(((babr) list.get(2)).mo32700v(), TimeUnit.SECONDS));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100454b.mo75201b(), this.f100455c.mo75201b(), this.f100456d.mo75201b());
    }
}
