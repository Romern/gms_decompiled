package p000;

/* renamed from: cant */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cant {

    /* renamed from: a */
    public final int f175414a;

    /* renamed from: b */
    public final cans[] f175415b;

    public cant(int i, cans... cansArr) {
        this.f175414a = i;
        this.f175415b = cansArr;
    }

    /* renamed from: a */
    public final int mo74704a() {
        int i = 0;
        for (cans cans : this.f175415b) {
            i += cans.f175412a;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo74705b() {
        return this.f175414a * mo74704a();
    }
}
