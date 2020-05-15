package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfu {

    /* renamed from: b */
    private static final String[] f86004b = {"full_path", "time_ms", "sha256_digest", "is_setuid_root", "is_symlink", "symlink_target", "file_permissions", "file_owner", "file_group", "se_linux_security_context"};

    /* renamed from: a */
    public SQLiteDatabase f86005a;

    /* renamed from: c */
    private final aqft f86006c;

    public aqfu(Context context) {
        this.f86006c = new aqft(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47837a() {
        this.f86005a = this.f86006c.getWritableDatabase();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47838b() {
        this.f86006c.close();
        this.f86005a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47839c() {
        SQLiteDatabase sQLiteDatabase = this.f86005a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f86005a.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x00a3=Splitter:B:29:0x00a3, B:36:0x00ad=Splitter:B:36:0x00ad} */
    /* renamed from: d */
    public final synchronized List mo47840d() {
        Cursor query;
        aqex aqex;
        boolean z;
        mo47837a();
        try {
            query = this.f86005a.query("files_info", f86004b, "is_setuid_root=1", null, null, null, null);
            int count = query.getCount();
            if (count != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < count; i++) {
                    query.moveToNext();
                    String string = query.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        aqex = new aqex();
                        aqex.f85917a = string;
                        boolean z2 = true;
                        aqex.f85919c = true;
                        aqex.f85918b = query.getLong(1);
                        aqex.f85923g = query.getBlob(2);
                        if (query.getInt(3) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aqex.f85920d = z;
                        if (query.getInt(4) != 1) {
                            z2 = false;
                        }
                        aqex.f85921e = z2;
                        aqex.f85922f = query.getString(5);
                        aqex.f85925i = new aqfd();
                        aqex.f85925i.f85942c = query.getInt(6);
                        aqex.f85925i.f85941b = query.getInt(7);
                        aqex.f85925i.f85940a = query.getInt(8);
                        aqex.f85925i.f85944e = query.getString(9);
                    } else {
                        aqex = null;
                    }
                    if (aqex != null) {
                        arrayList.add(aqex);
                    }
                }
                if (query != null) {
                    query.close();
                }
                mo47838b();
                return arrayList;
            }
            if (query != null) {
                query.close();
            }
            mo47838b();
            return null;
        } catch (Throwable th) {
            mo47838b();
            throw th;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    public final synchronized void mo47841e() {
        this.f86005a.execSQL("DROP TABLE files_info");
    }
}
