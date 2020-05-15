package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.SparseArray;

/* renamed from: asko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asko extends srp {

    /* renamed from: a */
    private static final srn f89128a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static asko f89129b;

    /* renamed from: c */
    private final int f89130c = 36;

    /* renamed from: a */
    public static asko m74292a(Context context) {
        return m74293a(context, "android_pay");
    }

    /* renamed from: b */
    public static boolean m74295b(Context context) {
        return context.getDatabasePath("android_pay").exists();
    }

    /* renamed from: c */
    public static void m74296c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("QuickAccessWalletCards", null, null);
            sQLiteDatabase.delete("PaymentCardOverrides", null, null);
            sQLiteDatabase.delete("SePaymentCards", null, null);
            sQLiteDatabase.delete("StorageKeys", null, null);
            sQLiteDatabase.delete("DoodleRenderedInfos", null, null);
            sQLiteDatabase.delete("ActivationMethodLimits", null, null);
            sQLiteDatabase.delete("SelectAidCache", null, null);
            sQLiteDatabase.delete("TapDoodleGroups", null, null);
            sQLiteDatabase.delete("TapInfos", null, null);
            sQLiteDatabase.delete("PaymentCards", null, null);
            sQLiteDatabase.delete("PaymentBundles", null, null);
            sQLiteDatabase.delete("Wallets", null, null);
            sQLiteDatabase.delete("GlobalValues", null, null);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((bnsl) f89128a.mo68388c()).mo68411a("Version downgrade, old: %d, new: %d", i, i2);
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((bnsl) f89128a.mo68388c()).mo68411a("Version upgrade, old: %d, new: %d", i, i2);
        if (i < 28) {
            sra.m36066a(sQLiteDatabase);
            m74294a(sQLiteDatabase, 0, i2);
            return;
        }
        m74294a(sQLiteDatabase, i, i2);
    }

    private asko(Context context, String str) {
        super(context, str, str, 36);
    }

    /* renamed from: a */
    static synchronized asko m74293a(Context context, String str) {
        asko asko;
        synchronized (asko.class) {
            int i = spn.f44932a;
            if (f89129b == null) {
                f89129b = new asko(context, str);
            }
            asko = f89129b;
        }
        return asko;
    }

    /* renamed from: a */
    private static void m74294a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(28, new askn());
        sparseArray.put(29, new aski());
        sparseArray.put(30, new askl());
        sparseArray.put(31, new askq());
        sparseArray.put(32, new askh());
        sparseArray.put(33, new askj());
        sparseArray.put(34, new askp());
        sparseArray.put(35, new askm());
        sparseArray.put(36, new askk());
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            askr askr = (askr) sparseArray.valueAt(i3);
            if (keyAt > i) {
                if (keyAt <= i2) {
                    askr.mo49213a(sQLiteDatabase);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase mo49214a() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            throw new asks(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m74294a(sQLiteDatabase, 0, this.f89130c);
    }

    /* renamed from: a */
    public final void mo49215a(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (!TextUtils.isEmpty(str)) {
                String[] strArr = {"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                for (int i = 0; i < 10; i++) {
                    sQLiteDatabase.delete(strArr[i], "account_id=?", new String[]{str});
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                String[] strArr2 = {"TapInfos", "DoodleRenderedInfos"};
                for (int i2 = 0; i2 < 2; i2++) {
                    sQLiteDatabase.delete(strArr2[i2], "account_name=?", new String[]{str2});
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (SQLiteException e) {
            throw new asks(e);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
