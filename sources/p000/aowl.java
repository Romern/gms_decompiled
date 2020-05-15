package p000;

/* renamed from: aowl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aowl extends Exception {

    /* renamed from: c */
    public final int f83763c;

    public aowl(chuw chuw) {
        int i = chuv.m149608a(chuw).f189233s.f189211r;
        this.f83763c = i;
        aowu.m69734a("RemindersSync", chuw, "Network error, status code %s", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo46961a() {
        return this.f83763c == chus.NOT_FOUND.f189211r || this.f83763c == chus.INVALID_ARGUMENT.f189211r;
    }
}
