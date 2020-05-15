package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: xax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xax {

    /* renamed from: b */
    public static final Logger f51830b = new Logger(new String[]{"AppIdCacheDbHelper"}, (short[]) null);

    /* renamed from: a */
    public final xaw f51831a;

    public xax(Context context) {
        this.f51831a = new xaw(context);
    }

    /* renamed from: a */
    private final synchronized void m42581a(String str, String str2) {
        try {
            SQLiteStatement compileStatement = this.f51831a.getWritableDatabase().compileStatement("INSERT OR REPLACE INTO appid_facet VALUES (?,?)");
            try {
                compileStatement.bindString(1, str);
                compileStatement.bindString(2, str2);
                if (compileStatement.executeInsert() != -1) {
                    compileStatement.close();
                } else {
                    throw new IOException(String.format(Locale.ENGLISH, "Failed to set trusted facet %s for AppID %s", str2, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (SQLiteException e) {
            f51830b.mo25418e("SQLiteException thrown when add app id trusted facet", new Object[0]);
        }
    }

    /* renamed from: b */
    public final synchronized void mo29595b(String str) {
        try {
            this.f51831a.getWritableDatabase().delete("appid_facet", "appid = ?", new String[]{str});
        } catch (SQLiteException e) {
            f51830b.mo25418e("SQLiteException thrown when delete facets", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo29592a(String str) {
        try {
            this.f51831a.getWritableDatabase().delete("appid_expiry", "appid = ?", new String[]{str});
        } catch (SQLiteException e) {
            f51830b.mo25418e("SQLiteException thrown when delete expiry", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo29593a(String str, long j) {
        Logger Logger = f51830b;
        Long valueOf = Long.valueOf(j);
        Logger.mo25412b("setCacheExpiry(%s, %d)", str, valueOf);
        try {
            SQLiteStatement compileStatement = this.f51831a.getWritableDatabase().compileStatement("INSERT OR REPLACE INTO appid_expiry VALUES (?,?)");
            try {
                compileStatement.bindString(1, str);
                compileStatement.bindLong(2, j);
                if (compileStatement.executeInsert() == -1) {
                    throw new IOException(String.format(Locale.ENGLISH, "Failed to set expiration time %d for AppID %s", valueOf, str));
                }
            } finally {
                compileStatement.close();
            }
        } catch (SQLiteException e) {
            f51830b.mo25418e("SQLiteException thrown when set cache expiry", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo29594a(String str, List list) {
        f51830b.mo25412b("cacheTrustedFacets(%s, %s)", str, list);
        mo29595b(str);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m42581a(str, (String) list.get(i));
        }
    }
}
