package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabase;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: aszr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszr {

    /* renamed from: a */
    private static final srn f89923a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static btow m75254a(Context context, String str) {
        btow btow;
        ArrayList arrayList;
        String b = askc.m74272b();
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        byte[] b2 = atxr.m76518b(a, "SELECT response_proto from WhitelistVerdicts where package_name = ? and environment = ?", new String[]{str, b});
        if (b2 != null) {
            btow = (btow) GeneratedMessageLite.m124016a(btow.f149810d, b2, bxus.m123744c());
        } else {
            btow = null;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (btow != null && btow.f149813b >= currentTimeMillis) {
            return btow;
        }
        bxvd da = btov.f149806c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((btov) da.f164949b).f149808a = str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            arrayList = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                arrayList.add(m75255a(signature.toByteArray()));
            }
        } catch (PackageManager.NameNotFoundException e) {
            arrayList = new ArrayList();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btov btov = (btov) da.f164949b;
        if (!btov.f149809b.mo73666a()) {
            btov.f149809b = GeneratedMessageLite.m124021a(btov.f149809b);
        }
        bxsy.m123078a(arrayList, btov.f149809b);
        btov btov2 = (btov) da.mo74062i();
        askf b3 = askg.m74283b(context, str);
        if (b3 == null) {
            b3 = new askf("", "", b, context);
        }
        btow btow2 = (btow) atff.m75759a(b3, "z/security/checkwhitelist", btov2, btow.f149810d);
        String b4 = askc.m74272b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", str);
        contentValues.put("response_proto", btow2.serializeToBytes());
        contentValues.put("environment", b4);
        a.insertWithOnConflict("WhitelistVerdicts", null, contentValues, 5);
        return btow2;
    }

    /* renamed from: a */
    private static String m75255a(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            bnsl bnsl = (bnsl) f89923a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Could not compute fingerprints for signatures");
            messageDigest = null;
        }
        messageDigest.update(bArr);
        return asti.m74760a(messageDigest.digest());
    }
}
