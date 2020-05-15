package p000;

/* renamed from: afqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqh {
    /* renamed from: a */
    public static bxxc m53443a(bdyx bdyx, bbep bbep, bxxk bxxk) {
        byte[] bArr = (byte[]) bdyx.mo58455c();
        if (bArr.length == 0) {
            return null;
        }
        try {
            return (bxxc) bxxk.mo73662b(bArr, bxus.m123743b());
        } catch (bxwf e) {
            bbep.mo34988b(1004);
            bbev.m87906a("%s: Unable to read %s from phenotype.", "MDDUtil", bxxk.getClass().getName());
            return null;
        }
    }
}
