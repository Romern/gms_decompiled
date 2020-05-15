package p000;

import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bemr */
final /* synthetic */ class bemr implements bmxj {

    /* renamed from: a */
    private final bend f111839a;

    public bemr(bend bend) {
        this.f111839a = bend;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase;
        bend bend = this.f111839a;
        String str = (String) obj;
        String str2 = bend.f111855i;
        File file = str2 != null ? new File(str2, str) : bend.f111848b.getDatabasePath(str);
        if (!bend.f111861o) {
            benc benc = bend.f111850d;
            String path = file.getPath();
            if (benc.f111846a.add(path)) {
                bend.f111861o = true;
                boolean a = bend.m95304a(bend.f111848b, bend.f111854h);
                bend.f111862p = a;
                if (a) {
                    try {
                        bend.f111862p = file.getCanonicalPath().startsWith(bend.f111848b.getCacheDir().getCanonicalPath());
                    } catch (IOException e) {
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 89);
                sb.append("DB ");
                sb.append(path);
                sb.append(" opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?");
                throw new IllegalStateException(sb.toString());
            }
        }
        Set set = bend.f111856j;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ((WeakReference) it.next()).get();
                if (sQLiteDatabase2 == null) {
                    it.remove();
                } else if (sQLiteDatabase2.isOpen()) {
                    String path2 = sQLiteDatabase2.getPath();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(path2).length() + ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                    sb2.append("Open database reference to ");
                    sb2.append(path2);
                    sb2.append(" already exists. Follow instructions in source to file a bug against TikTok.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
        try {
            sQLiteDatabase = bend.m95301a(bend.f111848b, file, bend.f111854h, bend.f111851e, bend.f111852f, bend.f111853g);
        } catch (bemy | bena | benb e2) {
            try {
                sQLiteDatabase = bend.m95301a(bend.f111848b, file, bend.f111854h, bend.f111851e, bend.f111852f, bend.f111853g);
            } catch (benb e3) {
                throw new bemy("Probably-recoverable database upgrade failure.", e3);
            } catch (bena e4) {
                bnrq bnrq = (bnrq) bend.f111847a.mo68387b();
                bnrq.mo68437a(e4);
                bnrq.mo68432a("bend", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                bend.m95303a(file);
                throw new bemy("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e4);
            } catch (Throwable th) {
                throw new bemy("Recovery by deletion failed.", th);
            }
        }
        bend.f111856j.add(new WeakReference(sQLiteDatabase));
        bend.f111848b.registerComponentCallbacks(bend);
        return sQLiteDatabase;
    }
}
