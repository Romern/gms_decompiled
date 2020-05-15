package p000;

import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Comparator;

/* renamed from: azcq */
final /* synthetic */ class azcq implements Comparator {

    /* renamed from: a */
    static final Comparator f99001a = new azcq();

    private azcq() {
    }

    public final int compare(Object obj, Object obj2) {
        LocalEntityId localEntityId = azcv.f99014b;
        return ((LocalEntityId) obj).f111074a.compareTo(((LocalEntityId) obj2).f111074a);
    }
}
