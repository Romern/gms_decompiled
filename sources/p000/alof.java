package p000;

/* renamed from: alof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alof {

    /* renamed from: a */
    private final StringBuilder f73937a;

    /* renamed from: b */
    private boolean f73938b = false;

    public alof(StringBuilder sb) {
        this.f73937a = sb;
    }

    /* renamed from: a */
    public final void mo40616a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            if (this.f73938b) {
                this.f73937a.append(',');
            }
            this.f73937a.append(str);
            this.f73938b = true;
        }
    }
}
