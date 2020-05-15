package p000;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;

/* renamed from: xbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbi {

    /* renamed from: a */
    private static final sek f51874a = new sek(new String[]{"OriginCalculator"}, (short[]) null);

    /* renamed from: a */
    public final String mo29607a(BrowserRequestOptions browserRequestOptions) {
        try {
            Uri f = browserRequestOptions.mo18688f();
            return new URL(f.getScheme(), f.getHost(), f.getPort(), "").toString();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final String mo29608a(String str) {
        bmxv b = xbj.m42601b(str);
        if (!b.mo66813a()) {
            f51874a.mo25418e("Unable to get the signature for package %s.", str);
            return null;
        }
        String valueOf = String.valueOf(Base64.encodeToString(((ByteBuffer) b.mo66814b()).array(), 11));
        return valueOf.length() == 0 ? new String("android:apk-key-hash:") : "android:apk-key-hash:".concat(valueOf);
    }
}
