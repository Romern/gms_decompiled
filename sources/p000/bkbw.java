package p000;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: bkbw */
public final /* synthetic */ class bkbw implements Comparator {

    /* renamed from: a */
    private final Collator f123966a;

    public bkbw(Collator collator) {
        this.f123966a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f123966a.compare(((bkbx) obj).f123969c, ((bkbx) obj2).f123969c);
    }
}
