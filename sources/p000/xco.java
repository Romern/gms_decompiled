package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import java.util.Date;

/* renamed from: xco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xco extends aaab {

    /* renamed from: e */
    private static final sek f51941e = new sek(new String[]{"AddUsageOperation"}, (short[]) null);

    /* renamed from: a */
    private final xcm f51942a = ((xcm) xcm.f51937d.mo33309a());

    /* renamed from: b */
    private final rnt f51943b;

    /* renamed from: c */
    private final String f51944c;

    /* renamed from: d */
    private final long f51945d;

    public xco(rnt rnt, String str, long j) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "AddUsage");
        this.f51943b = rnt;
        this.f51944c = str;
        this.f51945d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        SQLiteDatabase b;
        try {
            String str = this.f51944c;
            long j = this.f51945d;
            bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
            bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
            sek sek = f51941e;
            String valueOf = String.valueOf(str);
            sek.mo25412b(valueOf.length() == 0 ? new String("addUsage with keyStorageIdentifier ") : "addUsage with keyStorageIdentifier ".concat(valueOf), new Object[0]);
            xcm xcm = this.f51942a;
            Date date = new Date(j);
            bmxy.m108582a(str, "identifier cannot be null");
            bmxy.m108582a(date, "usageTimestamp cannot be null");
            xcm.f51938e.mo25412b("Adding a usage of a registered key", new Object[0]);
            b = xcm.mo29635b();
            b.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", str);
            contentValues.put("usage_timestamp", xcm.m42657a().format(date));
            if (b.insert("usages", null, contentValues) != -1) {
                b.execSQL(String.format("DELETE FROM %1$s WHERE %2$s = ? AND %3$s NOT IN (SELECT %3$s FROM %1$s WHERE %2$s = ? ORDER BY %3$s DESC LIMIT %4$s)", "usages", "id", "usage_timestamp", 50), new String[]{str, str});
                b.setTransactionSuccessful();
                b.endTransaction();
                this.f51943b.mo11797a(Status.f30107a);
                return;
            }
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61232a = "Error adding usage into SQLite database";
            throw a.mo33301a();
        } catch (adbe e) {
            this.f51943b.mo11797a(e.mo33302b());
        } catch (Throwable th) {
            b.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51943b.mo11797a(status);
    }
}
