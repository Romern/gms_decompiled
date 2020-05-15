package p000;

import android.os.Bundle;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: adhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhn extends adfj {

    /* renamed from: b */
    final /* synthetic */ adhu f61716b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adhn(adhu adhu) {
        super("getInstantAppCookie");
        this.f61716b = adhu;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        byte[] bArr;
        byte[] bArr2;
        File a = this.f61716b.mo33522a(adfi.f61556b.packageName);
        byte[] bArr3 = null;
        bArr3 = null;
        bArr3 = null;
        r6 = null;
        r6 = null;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        bArr3 = null;
        if (a != null && a.exists()) {
            try {
                FileInputStream fileInputStream3 = new FileInputStream(a);
                try {
                    bArr3 = new byte[fileInputStream3.available()];
                    fileInputStream3.read(bArr3);
                    srz.m36171a((Closeable) fileInputStream3);
                } catch (FileNotFoundException e) {
                    e = e;
                    bArr2 = bArr3;
                    fileInputStream = fileInputStream3;
                    adhu.f61721a.mo33425a(e, "Cookie file does not exist", new Object[0]);
                    srz.m36171a((Closeable) fileInputStream2);
                    bArr3 = bArr;
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("result", bArr3);
                    return bundle2;
                } catch (IOException e2) {
                    e = e2;
                    bArr = bArr3;
                    fileInputStream2 = fileInputStream3;
                    adhu.f61721a.mo33425a(e, "Unable to read cookie file", new Object[0]);
                    srz.m36171a((Closeable) fileInputStream2);
                    bArr3 = bArr;
                    Bundle bundle22 = new Bundle();
                    bundle22.putByteArray("result", bArr3);
                    return bundle22;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream3;
                    srz.m36171a((Closeable) fileInputStream2);
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                bArr2 = null;
                adhu.f61721a.mo33425a(e, "Cookie file does not exist", new Object[0]);
                srz.m36171a((Closeable) fileInputStream2);
                bArr3 = bArr;
                Bundle bundle222 = new Bundle();
                bundle222.putByteArray("result", bArr3);
                return bundle222;
            } catch (IOException e4) {
                e = e4;
                bArr = null;
                adhu.f61721a.mo33425a(e, "Unable to read cookie file", new Object[0]);
                srz.m36171a((Closeable) fileInputStream2);
                bArr3 = bArr;
                Bundle bundle2222 = new Bundle();
                bundle2222.putByteArray("result", bArr3);
                return bundle2222;
            } catch (Throwable th2) {
                th = th2;
                srz.m36171a((Closeable) fileInputStream2);
                throw th;
            }
        }
        Bundle bundle22222 = new Bundle();
        bundle22222.putByteArray("result", bArr3);
        return bundle22222;
    }
}
