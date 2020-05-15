package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;

/* renamed from: iuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuc extends aaab {

    /* renamed from: a */
    private final irb f21765a;

    /* renamed from: b */
    private final String f21766b;

    /* renamed from: c */
    private final Account f21767c;

    /* renamed from: d */
    private final sek f21768d = new sek(new String[]{"RetrieveExportedSymmetricKeyOperation"}, (byte[]) null);

    public iuc(irb irb, String str, Account account) {
        super(129, "RetrieveExportedSymmetricKeyOperation");
        this.f21765a = irb;
        this.f21766b = str;
        this.f21767c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        ipp a;
        SQLiteDatabase sQLiteDatabase;
        isn isn = new isn(context);
        isn.f21612a = 6;
        ipo ipo = new ipo(context);
        try {
            String str = this.f21766b;
            Account account = this.f21767c;
            ipo.f21519c.mo25412b("Finding all symmetric key Instances for %s", str);
            String str2 = account.name;
            a = ipp.m15839a(ipo.f21520b);
            if (ccfj.m129447c()) {
                sQLiteDatabase = a.getReadableDatabase();
            } else {
                sQLiteDatabase = a.getReadableDatabase();
            }
            sQLiteDatabase.beginTransaction();
            Cursor a2 = ipo.m15816a(sQLiteDatabase, "keys", new String[]{"key_handle", "key_type", "master_key", "active_status", "creation_time", "expiration_time"}, "key_name = ? AND account = ? AND exportable = ? AND key_form = ?", new String[]{str, str2, Integer.toString(2), Integer.toString(ehc.SYMMETRIC_KEY.f14909e)});
            if (a2 == null || !a2.moveToFirst()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
                sb.append("No exportable key for keyName=");
                sb.append(str);
                sb.append(" found.");
                throw new isu(sb.toString());
            }
            sQLiteDatabase.setTransactionSuccessful();
            itb a3 = ipo.m15817a(a2, str, str2);
            sQLiteDatabase.endTransaction();
            a.close();
            ita ita = a3.f21655b;
            ExportedSymmetricKey exportedSymmetricKey = new ExportedSymmetricKey(ita.f21650a, ita.f21652c);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21765a.mo13174a(exportedSymmetricKey);
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new isu(valueOf.length() == 0 ? new String("failed to open db ") : "failed to open db ".concat(valueOf));
        } catch (isu e2) {
            this.f21768d.mo25410a((Throwable) e2);
            isn.f21613b = 10;
            isn.mo13317a();
            mo6503a(new Status(25506));
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            a.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21765a.mo13175a(status);
    }
}
