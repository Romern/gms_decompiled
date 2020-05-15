package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: srp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class srp extends SQLiteOpenHelper {

    /* renamed from: a */
    private final String f45047a;

    /* renamed from: b */
    private boolean f45048b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: srp.<init>(android.content.Context, java.lang.String, java.lang.String, int, boolean):void
     arg types: [android.content.Context, java.lang.String, java.lang.String, int, int]
     candidates:
      srp.<init>(android.content.Context, java.lang.String, java.lang.String, int, android.database.DatabaseErrorHandler):void
      srp.<init>(android.content.Context, java.lang.String, java.lang.String, int, boolean):void */
    public srp(Context context, String str, String str2, int i) {
        this(context, str, str2, i, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10020a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10021b(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2 = this.f45047a;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(str2.length() + 29);
            sb.append(str2);
            sb.append("_GmsSQLiteOpenHelper_onCreate");
            str = sb.toString();
        } else {
            str = "GmsSQLiteOpenHelper_onCreate";
        }
        bljb a = blkh.m107282a(str, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            mo10020a(sQLiteDatabase);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.f45048b) {
            sra.m36066a(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            return;
        }
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (cdoz.f181455a.mo6606a().mo78125r()) {
            String str2 = this.f45047a;
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 27);
                sb.append(str2);
                sb.append("_GmsSQLiteOpenHelper_onOpen");
                str = sb.toString();
            } else {
                str = "GmsSQLiteOpenHelper_onOpen";
            }
            bljb a = blkh.m107282a(str, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                mo10021b(sQLiteDatabase);
                if (a != null) {
                    a.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            mo10021b(sQLiteDatabase);
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public static void m36137a(SQLiteOpenHelper sQLiteOpenHelper) {
        int i = Build.VERSION.SDK_INT;
        Long valueOf = Long.valueOf(cdnd.f181300a.mo6606a().mo77950b());
        if (valueOf.longValue() > 0) {
            String databaseName = sQLiteOpenHelper.getDatabaseName();
            String a = cdnd.f181300a.mo6606a().mo77949a();
            if (TextUtils.isEmpty(a) || !sqz.m36058a(a, databaseName)) {
                sQLiteOpenHelper.setIdleConnectionTimeout(valueOf.longValue());
            }
        }
    }

    public srp(Context context, String str, String str2, int i, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, null, i, databaseErrorHandler);
        this.f45048b = true;
        this.f45047a = str2;
        m36137a(this);
    }

    public srp(Context context, String str, String str2, int i, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f45048b = true;
        this.f45047a = str2;
        if (z) {
            m36137a(this);
        }
    }
}
