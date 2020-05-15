package p000;

import android.content.Context;
import java.nio.ByteBuffer;

/* renamed from: xbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbd {

    /* renamed from: b */
    private static final Logger f51859b = new Logger(new String[]{"FacetIdCalculator"}, (short[]) null);

    /* renamed from: a */
    private final Context f51860a;

    public xbd(Context context) {
        this.f51860a = context;
    }

    /* renamed from: a */
    public static final xbc m42595a(String str) {
        bmxv b = xbj.m42601b(str);
        if (b.mo66813a()) {
            return new xbc(((ByteBuffer) b.mo66814b()).array());
        }
        f51859b.mo25418e("Unable to get the signature for package %s.", str);
        return null;
    }

    /* renamed from: a */
    public final xbc mo29604a(String str, String str2) {
        bmxv b = xbj.m42601b(str2);
        if (!b.mo66813a()) {
            f51859b.mo25418e("Unable to get the signature for package %s.", str2);
            return null;
        } else if ("com.google.android.gms".equals(str2) || xaz.m42591a(this.f51860a, str2, (ByteBuffer) b.mo66814b())) {
            return new xbc(str);
        } else {
            return null;
        }
    }
}
