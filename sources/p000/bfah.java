package p000;

import java.util.Collection;
import java.util.Collections;

/* renamed from: bfah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfah {

    /* renamed from: a */
    public final Collection f113234a;

    /* renamed from: b */
    public final Collection f113235b;

    private bfah(Collection collection, Collection collection2) {
        this.f113234a = Collections.unmodifiableCollection(collection);
        this.f113235b = Collections.unmodifiableCollection(collection2);
    }

    /* renamed from: a */
    public static bfah m96286a(Collection collection, Collection collection2) {
        return new bfah(collection, collection2);
    }
}
