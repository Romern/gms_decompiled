package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.api.Status;

/* renamed from: atil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atil extends atkk {
    public atil(String str, aswm aswm) {
        super("DeleteDataForTests", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        try {
            a.beginTransaction();
            String[] strArr = {"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "TapInfos", "DoodleRenderedInfos", "WhitelistVerdicts", "PaymentCardOverrides", "QuickAccessWalletCards"};
            for (int i = 0; i < 13; i++) {
                a.delete(strArr[i], null, null);
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            new atkm(context).f90420c.edit().clear().apply();
            this.f90414d.mo49629f(Status.f30107a);
        } catch (SQLiteException e) {
            throw new asks(e);
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }
}
