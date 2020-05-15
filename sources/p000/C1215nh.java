package p000;

/* renamed from: nh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1215nh implements C1216ni {

    /* renamed from: a */
    static final C1215nh f26740a = new C1215nh();

    private C1215nh() {
    }

    /* renamed from: a */
    public final int mo15494a(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            i2 = C1220nm.m19677b(Character.getDirectionality(charSequence.charAt(i3)));
        }
        return i2;
    }
}
