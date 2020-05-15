package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atve extends atvb {

    /* renamed from: a */
    private final askf f91007a;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atve(TokenizePanChimeraService tokenizePanChimeraService, askf askf) {
        super(tokenizePanChimeraService);
        this.f91007a = askf;
    }

    /* renamed from: a */
    public static Message m76448a(AccountInfo accountInfo, String str) {
        return m76438a(4, new Bundle(), accountInfo, str, null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            TokenizePanChimeraService tokenizePanChimeraService = this.f90985d;
            String str = this.f91007a.f89125c;
            SQLiteDatabase a = asko.m74292a(tokenizePanChimeraService).mo49214a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_id", "seen_warm_welcome");
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
