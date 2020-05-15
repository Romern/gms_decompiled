package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: tqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tqj {
    /* renamed from: a */
    public abstract String mo26718a();

    /* renamed from: b */
    public abstract bmxv mo26719b();

    /* renamed from: c */
    public abstract bmxv mo26720c();

    /* renamed from: d */
    public abstract bmxv mo26721d();

    /* renamed from: e */
    public abstract qun mo26722e();

    /* renamed from: f */
    public final String mo26741f() {
        String encodedAuthority = Uri.parse(mo26718a()).getEncodedAuthority();
        if (bmxx.m108577a(encodedAuthority)) {
            return mo26718a();
        }
        bmxv g = mo26742g();
        return g.mo66813a() ? (String) g.mo66814b() : encodedAuthority;
    }

    /* renamed from: g */
    public final bmxv mo26742g() {
        Uri parse = Uri.parse(mo26718a());
        String encodedAuthority = parse.getEncodedAuthority();
        if (parse.getScheme().equals("android") && !bmxx.m108577a(encodedAuthority)) {
            List c = bmyx.m108640a('@').mo66925c((CharSequence) parse.getEncodedAuthority());
            if (c.size() == 2) {
                return bmxv.m108566b(Uri.decode((String) c.get(1)));
            }
        }
        return bmvz.f131120a;
    }
}
