package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.security.StorageKey;
import java.io.IOException;
import java.util.List;

/* renamed from: athq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athq {

    /* renamed from: a */
    private static final srn f90384a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    static final athi m75904a() {
        return new athi();
    }

    /* renamed from: b */
    public final void mo50002b(askf askf) {
        m75905a(askf, new athp());
    }

    /* renamed from: a */
    private final void m75905a(askf askf, athp athp) {
        try {
            mo49999a(askf);
        } catch (aths e) {
            String str = askf.f89124b;
            if (athp.f90383a == null) {
                athp.f90383a = new athh().mo49987a(askf);
            }
            mo50001a(askf, mo50000a(askf, athp.f90383a));
            asuc.getInstance().mo49500a(askf.f89126d, "storageKey");
        }
    }

    /* renamed from: a */
    public final int mo49998a(Context context, String str) {
        athp athp = new athp();
        List d = asix.m74203d(context, str);
        int size = d.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            askf askf = new askf((AccountInfo) d.get(i2), str, context);
            try {
                m75905a(askf, athp);
            } catch (IOException e) {
                if (i == 1) {
                    i = 2;
                }
            } catch (atfh e2) {
                bnsl a = f90384a.mo26019b(aske.m74275a());
                a.mo68437a(e2);
                a.mo68432a("athq", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("fetchStorageKeysForAllAccounts error");
                if (athh.m75883a(askf, e2)) {
                    i = 3;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final StorageKey mo49999a(askf askf) {
        StorageKey storageKey;
        athk a = athk.m75896a(askf.f89126d);
        Bundle a2 = a.mo49992a();
        String a3 = athk.m75897a(askf);
        StorageKey storageKey2 = null;
        if (a2.containsKey(a3)) {
            storageKey = (StorageKey) a2.getParcelable(a3);
        } else {
            storageKey = null;
        }
        if (storageKey != null) {
            return storageKey;
        }
        athn athn = (athn) atxr.m76515a(asko.m74292a(askf.f89126d).mo49214a(), athm.f90379a, null, "SELECT storage_key_id, storage_key_encrypted_key, iv FROM StorageKeys WHERE environment=? AND account_id=?", askf.f89125c, askf.f89123a);
        if (athn != null) {
            int i = Build.VERSION.SDK_INT;
            byte[] a4 = m75904a().mo49989a("storage_key_alias_2", athn.f90381b, athn.f90382c);
            if (a4 != null) {
                storageKey2 = new StorageKey(athn.f90380a, a4);
            }
        }
        if (storageKey2 != null) {
            bnsl a5 = f90384a.mo26019b(aske.m74275a());
            a5.mo68432a("athq", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a5.mo68405a("getStorageKeyLocally: retrieved from KeyStore");
            a.mo49995a(askf, storageKey2);
            return storageKey2;
        }
        throw new aths();
    }

    /* renamed from: a */
    public final StorageKey mo50000a(askf askf, btiw btiw) {
        SQLiteDatabase a;
        Cursor query;
        Throwable th;
        askf askf2 = askf;
        btiw btiw2 = btiw;
        bxvd da = btpb.f149825c.mo74144da();
        String str = btiw2.f149047b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btpb btpb = (btpb) da.f164949b;
        str.getClass();
        btpb.f149827a = str;
        btiw.getClass();
        btpb.f149828b = btiw2;
        try {
            btpc btpc = (btpc) atff.m75759a(askf2, "t/security/getstoragekey", (btpb) da.mo74062i(), btpc.f149829c);
            btpd btpd = btpc.f149831a;
            if (btpd == null) {
                btpd = btpd.f149833c;
            }
            sdo.m34974b(btpd.f149836b.mo73744a() == 32);
            btpd btpd2 = btpc.f149831a;
            if (btpd2 == null) {
                btpd2 = btpd.f149833c;
            }
            String str2 = btpd2.f149835a;
            btpd btpd3 = btpc.f149831a;
            if (btpd3 == null) {
                btpd3 = btpd.f149833c;
            }
            StorageKey storageKey = new StorageKey(str2, btpd3.f149836b.getKey());
            btpd btpd4 = btpc.f149832b;
            if (btpd4 != null) {
                try {
                    StorageKey storageKey2 = new StorageKey(btpd4.f149835a, btpd4.f149836b.getKey());
                    srn srn = atbm.f90004a;
                    a = atbm.m75382a(askf2.f89126d);
                    a.beginTransaction();
                    try {
                        query = a.query("PaymentBundles", new String[]{"bundle_id"}, "environment= ? AND account_id= ? AND key_id= ?", new String[]{askf2.f89125c, askf2.f89123a, storageKey.f108658a}, null, null, null);
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            a.update("PaymentBundles", atbm.m75381a(atbm.m75383a(a, askf2, string, storageKey), new athj(storageKey2), storageKey2.f108658a), "bundle_id = ? AND account_id = ? AND environment = ?", atbm.m75392a(string, askf2));
                        }
                        if (query != null) {
                            query.close();
                        }
                        bnsl bnsl = (bnsl) atbm.f90004a.mo68390d();
                        bnsl.mo68432a("atbm", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Successfully rotated keys");
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        bxvd da2 = btox.f149815b.mo74144da();
                        btpd btpd5 = btpc.f149832b;
                        if (btpd5 == null) {
                            btpd5 = btpd.f149833c;
                        }
                        String str3 = btpd5.f149835a;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        str3.getClass();
                        ((btox) da2.f164949b).f149817a = str3;
                        atff.m75765a(askf, "t/security/confirmstoragekeyrotation", (btox) da2.mo74062i(), btoy.f149818a, new atfe(), null);
                        return storageKey2;
                    } catch (atdb e) {
                        bnsl bnsl2 = (bnsl) atbm.f90004a.mo68388c();
                        bnsl2.mo68432a("atbm", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("RotateKeys error");
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                } catch (SQLException | asks e2) {
                    return storageKey;
                } catch (Throwable th3) {
                    a.endTransaction();
                    throw th3;
                }
            } else {
                String str4 = askf2.f89124b;
                return storageKey;
            }
            throw th;
        } catch (atfh e3) {
            new askt().mo49218a(askf2, e3.f90231a);
            throw e3;
        }
    }

    /* renamed from: a */
    public final void mo50001a(askf askf, StorageKey storageKey) {
        athn athn;
        athk.m75896a(askf.f89126d).mo49995a(askf, storageKey);
        int i = Build.VERSION.SDK_INT;
        Pair a = m75904a().mo49988a("storage_key_alias_2", storageKey.f108659b);
        if (a != null) {
            athn = new athn(storageKey.f108658a, (byte[]) a.first, (byte[]) a.second);
        } else {
            athn = null;
        }
        if (athn != null) {
            asko.m74292a(askf.f89126d).mo49214a().execSQL("INSERT OR REPLACE INTO StorageKeys VALUES(?, ?, ?, ?, ?)", new Object[]{askf.f89125c, askf.f89123a, athn.f90380a, athn.f90381b, athn.f90382c});
            return;
        }
        atho.m75903a(askf);
    }
}
