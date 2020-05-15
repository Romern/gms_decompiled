package p000;

/* renamed from: anhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhr {

    /* renamed from: a */
    public final braj[] f76896a;

    /* renamed from: b */
    public anhx[] f76897b;

    public anhr(braj[] brajArr) {
        this.f76896a = brajArr;
    }

    /* renamed from: a */
    public final void mo41837a() {
        braj[] brajArr = this.f76896a;
        if (brajArr != null) {
            int length = brajArr.length;
            int i = 0;
            while (i < length) {
                if (brajArr[i] != null) {
                    i++;
                } else {
                    throw new anfy(29500, "Null RegistrationInfo");
                }
            }
            return;
        }
        throw new anfy(29500, "Null RegistrationInfo");
    }
}
