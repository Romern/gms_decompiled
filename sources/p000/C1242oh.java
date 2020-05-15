package p000;

/* renamed from: oh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1242oh implements C1241og {

    /* renamed from: a */
    private final Object[] f26800a;

    /* renamed from: b */
    private int f26801b;

    public C1242oh(int i) {
        this.f26800a = new Object[i];
    }

    /* renamed from: a */
    public Object mo8188a() {
        int i = this.f26801b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f26800a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f26801b = i2;
        return obj;
    }

    /* renamed from: a */
    public boolean mo8189a(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f26801b;
            if (i >= i2) {
                Object[] objArr = this.f26800a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f26801b = i2 + 1;
                return true;
            } else if (this.f26800a[i] != obj) {
                i++;
            } else {
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }
}
