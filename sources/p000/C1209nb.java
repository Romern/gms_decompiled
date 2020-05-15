package p000;

import java.util.Locale;

/* renamed from: nb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1209nb {

    /* renamed from: a */
    private boolean f26723a;

    /* renamed from: b */
    private int f26724b;

    /* renamed from: c */
    private C1213nf f26725c;

    public C1209nb() {
        m19656a(C1211nd.m19664b(Locale.getDefault()));
    }

    /* renamed from: a */
    private final void m19656a(boolean z) {
        this.f26723a = z;
        this.f26725c = C1211nd.f26731a;
        this.f26724b = 2;
    }

    public C1209nb(Locale locale) {
        m19656a(C1211nd.m19664b(locale));
    }

    /* renamed from: a */
    public final C1211nd mo15489a() {
        if (this.f26724b == 2 && this.f26725c == C1211nd.f26731a) {
            return !this.f26723a ? C1211nd.f26732b : C1211nd.f26733c;
        }
        return new C1211nd(this.f26723a, this.f26724b, this.f26725c);
    }
}
