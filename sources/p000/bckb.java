package p000;

/* renamed from: bckb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bckb implements chtk {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo26261a(byte[] bArr) {
        try {
            return (cbms) bxvk.m124014a(cbms.f177673b, bArr);
        } catch (bxwf e) {
            bbos.m88292b("RpcErrorUtils", "Error parsing TachyonError", e);
            return cbms.f177673b;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo26262a(Object obj) {
        return ((cbms) obj).mo73642k();
    }
}
