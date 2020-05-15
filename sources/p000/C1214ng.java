package p000;

/* renamed from: ng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1214ng implements C1216ni {

    /* renamed from: a */
    static final C1214ng f26739a = new C1214ng();

    private C1214ng() {
    }

    /* renamed from: a */
    public final int mo15494a(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int a = C1220nm.m19676a(Character.getDirectionality(charSequence.charAt(i2)));
            if (a == 0) {
                return 0;
            }
            if (a == 1) {
                z = true;
            }
        }
        return !z ? 2 : 1;
    }
}
