package p000;

import java.util.logging.Level;

/* renamed from: bnrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnrt extends bnro {

    /* renamed from: a */
    public static final bnrs f132043a = new bnrs();

    public bnrt(bnsx bnsx) {
        super(bnsx);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    @Deprecated
    /* renamed from: a */
    public static bnrt m110178a(String str) {
        if (!str.isEmpty()) {
            return new bnrt(bntd.m110367a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException("injected class name is empty");
    }

    /* renamed from: a */
    public final bnrq mo26019b(Level level) {
        boolean c = mo68389c(level);
        boolean a = bntd.m110369a(this.f132041b.mo68471a(), level, c);
        return (!c && !a) ? f132043a : new bnrr(this, level, a);
    }
}
