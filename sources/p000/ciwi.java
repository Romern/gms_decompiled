package p000;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ciwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwi {

    /* renamed from: a */
    public final SecretKeySpec f191593a;

    /* renamed from: b */
    public final SecretKeySpec f191594b;

    /* renamed from: c */
    public final IvParameterSpec f191595c;

    /* renamed from: d */
    public final int f191596d;

    public ciwi(SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2, IvParameterSpec ivParameterSpec, int i) {
        this.f191593a = secretKeySpec;
        this.f191594b = secretKeySpec2;
        this.f191595c = ivParameterSpec;
        this.f191596d = i;
    }
}
