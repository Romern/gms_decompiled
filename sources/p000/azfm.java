package p000;

/* renamed from: azfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azfm implements chtk {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26261a(byte[] bArr) {
        try {
            return (cbms) GeneratedMessageLite.m124016a(cbms.f177673b, bArr, bxus.m123744c());
        } catch (bxwf e) {
            azoj.m85933c("NetworkUtils", "Invalid Tachyon error details.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo26262a(Object obj) {
        return ((cbms) obj).serializeToBytes();
    }
}
