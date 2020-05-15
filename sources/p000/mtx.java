package p000;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: mtx */
public final /* synthetic */ class mtx implements Comparator {

    /* renamed from: a */
    private final Collator f34728a;

    public mtx(Collator collator) {
        this.f34728a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        Collator collator = this.f34728a;
        mtw mtw = (mtw) obj2;
        String str = ((mtw) obj).f34724a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = mtw.f34724a;
        if (str3 != null) {
            str2 = str3;
        }
        return collator.compare(str, str2);
    }
}
