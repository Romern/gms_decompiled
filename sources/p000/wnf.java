package p000;

import com.google.android.gms.family.p042v2.model.ContactPerson;
import java.util.Comparator;

/* renamed from: wnf */
final /* synthetic */ class wnf implements Comparator {

    /* renamed from: a */
    static final Comparator f50950a = new wnf();

    private wnf() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((ContactPerson) obj).f31433a.compareTo(((ContactPerson) obj2).f31433a);
    }
}
