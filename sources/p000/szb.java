package p000;

/* renamed from: szb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szb implements chtk {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26261a(byte[] bArr) {
        try {
            return (cbpt) GeneratedMessageLite.m124016a(cbpt.f177955c, bArr, bxus.m123744c());
        } catch (bxwf e) {
            szc.f45471b.mo25417e("Invalid phone verification error details.", e, new Object[0]);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo26262a(Object obj) {
        return ((cbpt) obj).serializeToBytes();
    }
}
