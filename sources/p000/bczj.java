package p000;

import java.security.InvalidParameterException;

/* renamed from: bczj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bczj {
    STACK_CARD(0),
    STANDALONE_CARD(1),
    CARD_CAROUSEL(2);
    

    /* renamed from: d */
    public final int f105184d;

    private bczj(int i) {
        this.f105184d = i;
    }

    /* renamed from: a */
    public static bczj m90341a(int i) {
        bczj bczj = (bczj) bnfi.m109237a(values()).mo67507c(new bczi(i)).mo66815c();
        if (bczj != null) {
            return bczj;
        }
        throw new InvalidParameterException("Invalid CardType.");
    }
}
