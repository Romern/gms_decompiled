package p000;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import java.io.IOException;

/* renamed from: yyv */
final /* synthetic */ class yyv implements yzl {

    /* renamed from: a */
    private final yzp f54833a;

    public yyv(yzp yzp) {
        this.f54833a = yzp;
    }

    /* renamed from: a */
    public final Object mo30865a(String str) {
        yzp yzp = this.f54833a;
        int i = Build.VERSION.SDK_INT;
        zgp zgp = new zgp(yzp.f54857c, yzp.mo30882f(), yzp.f54858d);
        try {
            bnre i2 = yzp.mo30878d(str).mo31340a().listIterator();
            while (i2.hasNext()) {
                yqq yqq = (yqq) i2.next();
                zhi b = zgp.mo31094b(yqq.f54423a);
                b.f55083d = yqq.f54424b;
                b.f55084e = yqq.f54425c;
                b.f55085f = yqq.f54426d;
                b.f55086g = yqq.f54427e;
                b.f55087h = yqq.f54428f;
                b.f55088i = yqq.f54429g;
                b.mo31114a(yqq.f54423a);
            }
        } catch (SQLiteException | IOException e) {
            bnsl bnsl = (bnsl) yzp.f54854a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("yzp", "h", 623, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while initializing claimed devices");
        }
        return zgp;
    }
}
