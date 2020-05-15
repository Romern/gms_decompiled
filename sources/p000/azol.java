package p000;

/* renamed from: azol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azol {
    /* renamed from: a */
    public static bxxc m85935a(bxxk bxxk, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (bxxc) bxxk.mo73662b(bArr, bxus.m123744c());
        } catch (bxwf e) {
            return null;
        } catch (Exception e2) {
            throw new IllegalArgumentException("Unable to create instance of proto", e2);
        }
    }
}
