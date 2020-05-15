package p000;

import android.app.backup.RestoreSet;
import java.util.function.Predicate;

/* renamed from: lvc */
final /* synthetic */ class lvc implements Predicate {

    /* renamed from: a */
    private final lve f33021a;

    public lvc(lve lve) {
        this.f33021a = lve;
    }

    public final boolean test(Object obj) {
        return ((RestoreSet) obj).token == this.f33021a.f33025c;
    }
}
