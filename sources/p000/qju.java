package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: qju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qju {

    /* renamed from: a */
    private static final Logger f41514a = qgn.m32143a("ManagingAppModule");

    /* renamed from: a */
    static bmxv m32265a(Context context) {
        svu a = svu.m36486a();
        String e = a.mo26194e(context);
        if (e != null) {
            return bmxv.m108566b(m32267a(context, e));
        }
        String d = a.mo26191d(context);
        return d != null ? bmxv.m108566b(m32267a(context, d)) : bmvz.f131120a;
    }

    /* renamed from: a */
    private static bmxv m32266a(Context context, String str, String str2) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(byteArray, 0, byteArray.length);
                return bmxv.m108566b(instance.digest());
            } catch (NoSuchAlgorithmException e) {
                f41514a.mo25419f("no support for %s?", e, str2);
                return bmvz.f131120a;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            f41514a.mo25417e("package info for managing app not found:%s.", e2, e2.getMessage());
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    private static qgy m32267a(Context context, String str) {
        bxvd da = qgy.f41275e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgy qgy = (qgy) da.f164949b;
        str.getClass();
        qgy.f41277a |= 1;
        qgy.f41278b = str;
        bmxv a = m32266a(context, str, "SHA1");
        if (a.mo66813a()) {
            ByteString a2 = ByteString.m123261a((byte[]) a.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgy qgy2 = (qgy) da.f164949b;
            a2.getClass();
            qgy2.f41277a |= 2;
            qgy2.f41279c = a2;
        }
        bmxv a3 = m32266a(context, str, "SHA256");
        if (a3.mo66813a()) {
            ByteString a4 = ByteString.m123261a((byte[]) a3.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgy qgy3 = (qgy) da.f164949b;
            a4.getClass();
            qgy3.f41277a |= 4;
            qgy3.f41280d = a4;
        }
        return (qgy) da.mo74062i();
    }
}
