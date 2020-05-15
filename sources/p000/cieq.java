package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cieq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cieq implements chqt {

    /* renamed from: a */
    final AtomicReference f189974a = new AtomicReference();

    /* renamed from: b */
    public volatile boolean f189975b;

    static {
        chqn.m149404a("internal-retry-policy");
        chqn.m149404a("internal-hedging-policy");
    }

    /* renamed from: a */
    public final chqs mo56353a(chtv chtv, chqo chqo, chqp chqp) {
        cicy cicy;
        cicz cicz = (cicz) this.f189974a.get();
        if (cicz != null) {
            cicy = (cicy) cicz.f189870a.get(chtv.f189150b);
        } else {
            cicy = null;
        }
        if (cicy == null && cicz != null) {
            cicy = (cicy) cicz.f189871b.get(chtv.f189151c);
        }
        if (cicy == null) {
            return chqp.mo70053a(chtv, chqo);
        }
        Long l = cicy.f189864a;
        if (l != null) {
            chrm a = chrm.m149457a(l.longValue(), TimeUnit.NANOSECONDS);
            chrm chrm = chqo.f189007b;
            if (chrm == null || a.compareTo(chrm) < 0) {
                chqo = chqo.mo85546a(a);
            }
        }
        Boolean bool = cicy.f189865b;
        if (bool != null) {
            if (bool.booleanValue()) {
                chqo chqo2 = new chqo(chqo);
                chqo2.f189012g = Boolean.TRUE;
                chqo = chqo2;
            } else {
                chqo chqo3 = new chqo(chqo);
                chqo3.f189012g = Boolean.FALSE;
                chqo = chqo3;
            }
        }
        Integer num = cicy.f189866c;
        if (num != null) {
            Integer num2 = chqo.f189013h;
            if (num2 == null) {
                chqo = chqo.mo85543a(num.intValue());
            } else {
                chqo = chqo.mo85543a(Math.min(num2.intValue(), cicy.f189866c.intValue()));
            }
        }
        Integer num3 = cicy.f189867d;
        if (num3 != null) {
            Integer num4 = chqo.f189014i;
            if (num4 == null) {
                chqo = chqo.mo85550b(num3.intValue());
            } else {
                chqo = chqo.mo85550b(Math.min(num4.intValue(), cicy.f189867d.intValue()));
            }
        }
        return chqp.mo70053a(chtv, chqo);
    }
}
