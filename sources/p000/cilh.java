package p000;

import com.felicanetworks.mfc.mfi.Card;

/* renamed from: cilh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilh implements Runnable {

    /* renamed from: a */
    private final String f190616a;

    /* renamed from: b */
    private final Card f190617b;

    /* renamed from: c */
    private final brhc f190618c;

    /* renamed from: d */
    private final brep f190619d;

    /* renamed from: e */
    private final String f190620e;

    /* renamed from: f */
    private final brgl f190621f;

    public cilh(String str, Card card, brhc brhc, brgl brgl, brep brep, String str2) {
        this.f190616a = str;
        this.f190617b = card;
        this.f190618c = brhc;
        this.f190621f = brgl;
        this.f190619d = brep;
        this.f190620e = str2;
    }

    public final void run() {
        this.f190621f.mo69517a(this.f190616a, new cikt(this.f190617b, this.f190618c, this.f190619d, this.f190620e));
    }
}
