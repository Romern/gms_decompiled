package p000;

/* renamed from: adys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adys {

    /* renamed from: a */
    private int f62939a = 0;

    /* renamed from: b */
    private float f62940b = 0.0f;

    /* renamed from: a */
    public int mo33938a() {
        return this.f62939a;
    }

    /* renamed from: a */
    public void mo33939a(float f) {
        this.f62940b += f;
        int i = this.f62939a + 1;
        this.f62939a = i;
        if (i < 0) {
            this.f62939a = 1;
            this.f62940b = f;
        }
    }

    /* renamed from: b */
    public float mo33940b() {
        return this.f62940b;
    }
}
