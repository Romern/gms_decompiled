package p000;

import java.util.List;

/* renamed from: chut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chut implements chtq {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85644a(byte[] bArr) {
        int i;
        byte b;
        List list = chuv.f189214a;
        int length = bArr.length;
        char c = 1;
        int i2 = 0;
        if (length == 1 && bArr[0] == 48) {
            return chuv.f189215b;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i2 = (b - 48) * 10;
            }
            chuv chuv = chuv.f189217d;
            String str = new String(bArr, bmwy.f131156a);
            return chuv.mo85687a(str.length() != 0 ? new String("Unknown code ") : "Unknown code ".concat(str));
        }
        c = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i = i2 + (b2 - 48)) < chuv.f189214a.size()) {
            return (chuv) chuv.f189214a.get(i);
        }
        chuv chuv2 = chuv.f189217d;
        String str2 = new String(bArr, bmwy.f131156a);
        return chuv2.mo85687a(str2.length() != 0 ? new String("Unknown code ") : "Unknown code ".concat(str2));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo85645a(Object obj) {
        chus chus = ((chuv) obj).f189233s;
        chus chus2 = chus.OK;
        return chus.f189212s;
    }
}
