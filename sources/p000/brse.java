package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: brse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brse {

    /* renamed from: a */
    private final Set f143296a;

    /* renamed from: b */
    private final Set f143297b;

    /* renamed from: c */
    private final int f143298c;

    /* renamed from: d */
    private final int f143299d;

    public brse(Set set, Set set2, int i, int i2, Set set3) {
        this.f143296a = Collections.unmodifiableSet(set);
        this.f143297b = Collections.unmodifiableSet(set2);
        this.f143298c = i;
        this.f143299d = i2;
        Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static brsd m114529a(Class cls) {
        return new brsd(cls, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f143296a.toArray()) + ">{" + this.f143298c + ", type=" + this.f143299d + ", deps=" + Arrays.toString(this.f143297b.toArray()) + "}";
    }
}
