package p000;

import java.util.Comparator;
import java.util.Locale;

/* renamed from: yjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjc {

    /* renamed from: a */
    public static final Comparator f53914a = yjb.f53913a;

    /* renamed from: b */
    public final yhg f53915b;

    /* renamed from: c */
    public final yhu f53916c;

    public yjc(yhg yhg, yhu yhu) {
        this.f53915b = yhg;
        this.f53916c = yhu;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "OutputDataPoint{%1$tF %2$tT: %3$s}", Long.valueOf(yhf.m44094b(this.f53915b)), Long.valueOf(yhf.m44096c(this.f53915b)), this.f53916c);
    }
}
