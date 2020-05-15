package p000;

/* renamed from: boag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boag implements Appendable {

    /* renamed from: a */
    int f132450a = this.f132451b;

    /* renamed from: b */
    final /* synthetic */ int f132451b;

    /* renamed from: c */
    final /* synthetic */ Appendable f132452c;

    /* renamed from: d */
    final /* synthetic */ String f132453d;

    public boag(int i, Appendable appendable, String str) {
        this.f132451b = i;
        this.f132452c = appendable;
        this.f132453d = str;
    }

    public final Appendable append(char c) {
        if (this.f132450a == 0) {
            this.f132452c.append(this.f132453d);
            this.f132450a = this.f132451b;
        }
        this.f132452c.append(c);
        this.f132450a--;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
