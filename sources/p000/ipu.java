package p000;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ipu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ipu {
    /* renamed from: a */
    static List m15864a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                bqld bqld = (bqld) GeneratedMessageLite.m124026b(bqld.f141081f, byteArrayInputStream);
                if (bqld == null) {
                    break;
                }
                arrayList.add(bqld);
            } catch (EOFException e) {
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    static List m15865b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                bqlc bqlc = (bqlc) GeneratedMessageLite.m124026b(bqlc.f141077c, byteArrayInputStream);
                if (bqlc == null) {
                    break;
                }
                arrayList.add(bqlc);
            } catch (EOFException e) {
            }
        }
        return arrayList;
    }
}
