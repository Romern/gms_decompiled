package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: ckj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckj implements cjq {

    /* renamed from: a */
    private final cjq f6979a;

    public ckj(cjq cjq) {
        this.f6979a = cjq;
    }

    /* renamed from: a */
    private static Uri m4399a(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = m4399a(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m4399a(str) : parse;
        }
        if (uri == null || !this.f6979a.mo3931a(uri)) {
            return null;
        }
        return this.f6979a.mo3930a(uri, i, i2, cdk);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        String str = (String) obj;
        return true;
    }
}
