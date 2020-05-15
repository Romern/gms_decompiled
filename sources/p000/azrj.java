package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: azrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azrj {

    /* renamed from: a */
    public final Integer f99940a;

    /* renamed from: b */
    private final Set f99941b = new HashSet();

    public azrj(Object... objArr) {
        for (Object obj : objArr) {
            this.f99941b.add(String.valueOf(obj));
        }
        this.f99940a = Integer.valueOf(this.f99941b.hashCode());
    }
}
