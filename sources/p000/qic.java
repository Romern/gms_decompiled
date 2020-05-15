package p000;

import android.content.SharedPreferences;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qic {

    /* renamed from: a */
    private static final Logger f41444a = qgn.m32143a("AndroidCheckinProtoModule");

    /* renamed from: a */
    static qhg m32199a(cayo cayo, cayo cayo2, cayo cayo3, cayo cayo4, cayo cayo5, qho qho, cayo cayo6, cayo cayo7, qhf qhf, qdu qdu, qjw qjw) {
        qhj qhj;
        SharedPreferences sharedPreferences;
        qdu qdu2 = qdu;
        qjw qjw2 = qjw;
        bxvd da = qhg.f41336o.mo74144da();
        if (qjw2.mo24054a(qhg.class, 1)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg = (qhg) da.f164949b;
            qhf.getClass();
            qhg.f41339b = qhf;
            qhg.f41338a |= 1;
        }
        if (qjw2.mo24054a(qhg.class, 2) && (sharedPreferences = qdu2.f41032b) != null) {
            long j = sharedPreferences.getLong("CheckinTask_bookmark", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg2 = (qhg) da.f164949b;
            qhg2.f41338a |= 8;
            qhg2.f41340c = j;
        }
        if (qjw2.mo24054a(qhg.class, 5) && svu.m36486a().mo26192d()) {
            da.mo74076k("te.bots");
        }
        if (qjw2.mo24054a(qhg.class, 6)) {
            bmxv bmxv = (bmxv) cayo.mo16713a();
            if (bmxv.mo66813a()) {
                String str = (String) bmxv.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhg qhg3 = (qhg) da.f164949b;
                str.getClass();
                qhg3.f41338a |= 16;
                qhg3.f41343f = str;
            }
        }
        if (qjw2.mo24054a(qhg.class, 7)) {
            bmxv bmxv2 = (bmxv) cayo2.mo16713a();
            if (bmxv2.mo66813a()) {
                String str2 = (String) bmxv2.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhg qhg4 = (qhg) da.f164949b;
                str2.getClass();
                qhg4.f41338a |= 32;
                qhg4.f41344g = str2;
            }
        }
        if (qjw2.mo24054a(qhg.class, 8)) {
            bmxv bmxv3 = (bmxv) cayo3.mo16713a();
            if (bmxv3.mo66813a()) {
                String str3 = (String) bmxv3.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhg qhg5 = (qhg) da.f164949b;
                str3.getClass();
                qhg5.f41338a |= 64;
                qhg5.f41345h = str3;
            }
        }
        if (qjw2.mo24054a(qhg.class, 18) && ((bmxv) cayo6.mo16713a()).mo66813a()) {
            boolean booleanValue = ((Boolean) ((bmxv) cayo6.mo16713a()).mo66814b()).booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg6 = (qhg) da.f164949b;
            qhg6.f41338a |= 128;
            qhg6.f41346i = booleanValue;
        }
        if (qjw2.mo24054a(qhg.class, 9)) {
            int intValue = ((Integer) cayo7.mo16713a()).intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg7 = (qhg) da.f164949b;
            qhg7.f41338a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qhg7.f41347j = intValue;
        }
        if (qjw2.mo24054a(qhg.class, 14)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg8 = (qhg) da.f164949b;
            qhg8.f41348k = qho.f41394i;
            qhg8.f41338a |= 1024;
        }
        if (qjw2.mo24054a(qhg.class, 15) && (qhj = qdu2.f41046p) != null) {
            Logger Logger = f41444a;
            Object[] objArr = new Object[2];
            int a = qhi.m32172a(qhj.f41357b);
            if (a == 0) {
                a = 1;
            }
            objArr[0] = Integer.valueOf(a - 1);
            objArr[1] = Integer.valueOf(qhj.f41358c);
            Logger.mo25414c("Checkin reason type: %d attempt count: %d.", objArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg9 = (qhg) da.f164949b;
            qhj.getClass();
            qhg9.f41349l = qhj;
            qhg9.f41338a |= 2048;
        }
        if (qjw2.mo24054a(qhg.class, 16)) {
            Iterable iterable = (Iterable) cayo4.mo16713a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg10 = (qhg) da.f164949b;
            qhg10.mo24050a();
            bxsy.m123078a(iterable, qhg10.f41350m);
        }
        if (qjw2.mo24054a(qhg.class, 19)) {
            bmxv bmxv4 = (bmxv) cayo5.mo16713a();
            if (bmxv4.mo66813a()) {
                String str4 = (String) bmxv4.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhg qhg11 = (qhg) da.f164949b;
                str4.getClass();
                qhg11.f41338a |= 4096;
                qhg11.f41351n = str4;
            }
        }
        return (qhg) da.mo74062i();
    }
}
