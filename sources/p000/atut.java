package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atut extends atvb {

    /* renamed from: a */
    private final askf f90936a;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atut(TokenizePanChimeraService tokenizePanChimeraService, askf askf) {
        super(tokenizePanChimeraService);
        this.f90936a = askf;
    }

    /* renamed from: a */
    public static Message m76412a(AccountInfo accountInfo, String str) {
        return atvb.m76438a(12, new Bundle(), accountInfo, str, null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            TokenizePanChimeraService tokenizePanChimeraService = this.f90985d;
            String str = this.f90936a.f89125c;
            SQLiteDatabase a = asko.m74292a(tokenizePanChimeraService).mo49214a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_id", "seen_keyguard_setup");
            contentValues.put("value", "true");
            contentValues.put("environment", str);
            a.insertWithOnConflict("GlobalValues", null, contentValues, 5);
        } catch (asks e) {
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Void voidR = (Void) obj;
    }
}
