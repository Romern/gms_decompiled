package p000;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: bjpv */
final /* synthetic */ class bjpv implements Comparator {

    /* renamed from: a */
    private final Collator f123114a;

    public bjpv(Collator collator) {
        this.f123114a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f123114a.compare(((bjpw) obj).f123117c, ((bjpw) obj2).f123117c);
    }
}
