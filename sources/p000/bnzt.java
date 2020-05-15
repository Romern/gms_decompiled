package p000;

import java.io.Serializable;

/* renamed from: bnzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzt implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final String f132419a;

    /* renamed from: b */
    private final int f132420b;

    /* renamed from: c */
    private final String f132421c;

    public bnzt(String str, int i, String str2) {
        this.f132419a = str;
        this.f132420b = i;
        this.f132421c = str2;
    }

    private Object readResolve() {
        return new bnzu(this.f132419a, this.f132420b, this.f132421c);
    }
}
