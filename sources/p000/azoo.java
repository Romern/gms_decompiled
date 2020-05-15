package p000;

import android.content.Context;

/* renamed from: azoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azoo implements chtk {

    /* renamed from: a */
    final /* synthetic */ Context f99796a;

    public azoo(Context context) {
        this.f99796a = context;
    }

    /* renamed from: b */
    public final cbay mo26261a(byte[] bArr) {
        try {
            return (cbay) GeneratedMessageLite.m124014a(cbay.f176515b, bArr);
        } catch (bxwf e) {
            azph.m85998a(this.f99796a).mo55126a(504, 6);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo26262a(Object obj) {
        return ((cbay) obj).serializeToBytes();
    }
}
