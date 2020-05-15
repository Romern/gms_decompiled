package p000;

import java.util.Set;

/* renamed from: bann */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bann {

    /* renamed from: a */
    private final char f101359a;

    /* renamed from: b */
    private final bnic f101360b;

    public bann(char c, Set set) {
        bnia j = bnic.m109500j();
        j.mo67752b((Iterable) set);
        j.mo67629b(Character.valueOf(c));
        this.f101360b = j.mo67751a();
        this.f101359a = c;
    }

    /* renamed from: a */
    public static banm m87218a() {
        return new banm();
    }

    /* renamed from: a */
    public final String mo55808a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (this.f101360b.contains(Character.valueOf(charAt))) {
                sb.append(this.f101359a);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
