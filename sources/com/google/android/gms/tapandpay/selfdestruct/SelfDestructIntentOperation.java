package com.google.android.gms.tapandpay.selfdestruct;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelfDestructIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108660a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        SQLiteDatabase d;
        String str;
        try {
            athu.m75913a(this);
            if (!intent.getBooleanExtra("unconditional_self_destruct", false)) {
                if ((!asjk.m74227a() || asjk.m74232f(this)) && asjk.m74228b(this)) {
                    bnsl bnsl = (bnsl) f108660a.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Self-destruct fired with a secure keyguard.  Clearing notification but not keys");
                    aszy.m75270b(this);
                    return;
                }
            }
            bnsl bnsl2 = (bnsl) f108660a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Self-destructing, clearing tokens");
            aszy.m75271c();
            aszy.m75269b();
            String b = askc.m74272b();
            for (AccountInfo accountInfo : asix.m74203d(this, b)) {
                atds a = atds.m75666a(new askf(accountInfo, b, this));
                CardInfo[] cardInfoArr = a.mo49845a().f108369a;
                int length = cardInfoArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = cardInfoArr[i].f108340a;
                    atdz atdz = a.f90151a;
                    d = atdz.mo49886d();
                    d.beginTransaction();
                    atdt b2 = atdz.mo49878b(d, str2);
                    if (b2 != null) {
                        d.execSQL("DELETE FROM PaymentBundles WHERE bundle_id=? AND account_id=? AND environment=?", atdz.mo49889e(str2));
                        atdz.mo49882b(d);
                        d.setTransactionSuccessful();
                        d.endTransaction();
                        atdz.mo49872a(b2, "deleteToken");
                        str = b;
                    } else {
                        bnsl bnsl3 = (bnsl) atdz.f90166a.mo68387b();
                        str = b;
                        bnsl3.mo68432a("atdz", "f", 793, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("deleteToken error: card not found");
                        d.endTransaction();
                        b2 = null;
                    }
                    if (b2 != null) {
                        if (b2.f90157c) {
                            bxvd da = btkj.f149261d.mo74144da();
                            btiy btiy = b2.f90155a.f149123a;
                            if (btiy == null) {
                                btiy = btiy.f149054c;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btkj btkj = (btkj) da.f164949b;
                            btiy.getClass();
                            btkj.f149263a = btiy;
                            btkj.f149264b = btnw.m116966a(5);
                            atff.m75765a(atdz.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b, new atfe(), null);
                        }
                    }
                    a.mo49860d(str2);
                    atkl.f90415a.mo50008a();
                    i++;
                    b = str;
                }
            }
        } catch (asks e) {
            bnsl bnsl4 = (bnsl) f108660a.mo68388c();
            bnsl4.mo68437a(e);
            bnsl4.mo68432a("com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Error self destructing");
        } catch (Throwable th) {
            d.endTransaction();
            throw th;
        }
    }
}
