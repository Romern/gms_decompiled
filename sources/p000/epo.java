package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: epo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epo extends C0036av {

    /* renamed from: a */
    public final List f15489a;

    public epo(List list) {
        this.f15489a = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo2667a((C0034at) list.get(i), new epn(this));
        }
        if (list.isEmpty()) {
            mo2450b(Collections.emptyList());
        }
    }
}
