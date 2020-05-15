package p000;

import java.io.OutputStream;

/* renamed from: beic */
public final /* synthetic */ class beic {
    /* renamed from: a */
    public static OutputStream m95112a(beid beid, OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        String valueOf = String.valueOf(beid.mo60719a());
        throw new begy(valueOf.length() == 0 ? new String("wrapForAppend not supported by ") : "wrapForAppend not supported by ".concat(valueOf));
    }
}
