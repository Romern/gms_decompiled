package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: fvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvc extends srp {

    /* renamed from: a */
    private static fvc f17329a;

    /* renamed from: a */
    public static synchronized fvc m12461a(Context context) {
        fvc fvc;
        synchronized (fvc.class) {
            if (f17329a == null) {
                f17329a = new fvc(context);
            }
            fvc = f17329a;
        }
        return fvc;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private fvc(Context context) {
        super(context, "appinvite.db", "appinvite.db", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sms (invitation_id TEXT PRIMARY KEY,operation_id TEXT,status INT DEFAULT(0) );");
    }
}
