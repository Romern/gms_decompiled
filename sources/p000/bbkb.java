package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bbkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbkb implements bbkk {

    /* renamed from: a */
    public final bavw f102800a;

    public bbkb(bavw bavw) {
        this.f102800a = bavw;
    }

    /* renamed from: a */
    public static bqgg m88116a(bqgg bqgg, String str) {
        return bqdf.m112620a(bqgg, Throwable.class, new bbjw(str), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public static baws m88119b(batr batr) {
        Account account = null;
        bawr bawr = new bawr(null);
        String str = batr.f101723d;
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            bbev.m87906a("%s: Unable to parse Account with string = '%s'", "AccountUtil", str);
        } else {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (!bawv.m87645a(substring2) || !bawv.m87645a(substring)) {
                bbev.m87910b("%s: Unable to create Account with name = '%s', type = '%s'", "AccountUtil", substring2, substring);
            } else {
                account = new Account(substring2, substring);
            }
        }
        bmxv c = bmxv.m108567c(account);
        if (c != null) {
            bawr.f102000b = c;
            String str2 = batr.f101721b;
            if (str2 != null) {
                bawr.f101999a = str2;
                String str3 = bawr.f101999a == null ? " groupName" : "";
                if (str3.isEmpty()) {
                    return new baue(bawr.f101999a, bawr.f102000b);
                }
                throw new IllegalStateException(str3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str3));
            }
            throw new NullPointerException("Null groupName");
        }
        throw new NullPointerException("Null accountOptional");
    }

    /* renamed from: a */
    public static boolean m88117a(batr batr) {
        return (batr.f101720a & 1) != 0 && batr.f101721b.startsWith("photos_filegroup_");
    }

    /* renamed from: a */
    public static boolean m88118a(batr batr, Account account) {
        return batr.f101723d.equals(bawv.m87644a(account));
    }

    /* renamed from: a */
    public final bqgg mo56175a(List list) {
        bavw bavw = this.f102800a;
        baut e = bauu.m87583e();
        e.mo55989a(true);
        return bqdx.m112674a(m88116a(bavw.mo55995a(e.mo55988a()), "File group search failed"), new bbjv(this, list), bqfb.INSTANCE);
    }
}
