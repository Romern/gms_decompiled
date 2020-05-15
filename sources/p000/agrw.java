package p000;

import java.util.concurrent.Callable;

/* renamed from: agrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrw implements Callable {

    /* renamed from: a */
    final /* synthetic */ Long f66331a;

    /* renamed from: b */
    final /* synthetic */ Integer f66332b;

    /* renamed from: c */
    final /* synthetic */ Long f66333c;

    /* renamed from: d */
    final /* synthetic */ agry f66334d;

    /* renamed from: e */
    final /* synthetic */ int f66335e;

    public agrw(agry agry, Long l, int i, Integer num, Long l2) {
        this.f66334d = agry;
        this.f66331a = l;
        this.f66335e = i;
        this.f66332b = num;
        this.f66333c = l2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f66334d.mo36042a(this.f66331a, this.f66335e, this.f66332b, this.f66333c);
    }
}
