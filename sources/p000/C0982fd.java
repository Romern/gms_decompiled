package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: fd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0982fd {

    /* renamed from: a */
    public final Object[] f16294a = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    public int f16295b;

    /* renamed from: a */
    public final Object mo10728a() {
        int i = this.f16295b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f16294a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f16295b = i2;
        return obj;
    }

    /* renamed from: a */
    public final void mo10729a(Object obj) {
        int i = this.f16295b;
        Object[] objArr = this.f16294a;
        if (i < 256) {
            objArr[i] = obj;
            this.f16295b = i + 1;
        }
    }
}
