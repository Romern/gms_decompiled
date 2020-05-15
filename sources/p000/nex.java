package p000;

/* renamed from: nex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nex extends ney {

    /* renamed from: a */
    public static final byte[] f35435a = {2, 21};

    /* renamed from: b */
    public static final byte[] f35436b = {-1, -1};

    /* renamed from: a */
    public final int mo20552a() {
        return 1;
    }

    /* renamed from: b */
    public final Integer mo20555b(nek nek) {
        return Integer.valueOf(nek.mo20525a(76)[22]);
    }

    /* renamed from: a */
    public final Integer mo20553a(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        byte[] a = nek.mo20525a(76);
        byte[] bArr = new byte[20];
        System.arraycopy(a, 2, bArr, 0, 16);
        System.arraycopy(a, 18, bArr, 16, 4);
        return bArr;
    }
}
