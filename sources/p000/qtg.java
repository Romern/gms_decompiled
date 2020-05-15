package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

/* renamed from: qtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qtg extends srp {
    /* renamed from: a */
    private static void m32848a(SQLiteDatabase sQLiteDatabase, qtx qtx) {
        boolean z = true;
        qto.f42105a.mo25412b("Creating table: %s...", qtx.mo24256a());
        Pair[] b = qtx.mo24257b();
        String[] c = qtx.mo24258c();
        if (c == null || c.length <= 0) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(qtx.mo24256a());
        sb.append('(');
        int i = 0;
        while (true) {
            int length = b.length;
            if (i >= length) {
                break;
            }
            sb.append((String) b[i].first);
            sb.append(' ');
            sb.append((String) b[i].second);
            if (z || i + 1 < length) {
                sb.append(',');
            }
            i++;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                int length2 = c.length;
                if (i2 >= length2) {
                    break;
                }
                sb.append(c[i2]);
                i2++;
                if (i2 < length2) {
                    sb.append(',');
                }
            }
        }
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
        for (String[] strArr : qtx.mo24259d()) {
            qto.m32872a(sQLiteDatabase, qtx.mo24256a(), strArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        qth.f42096a.mo25412b("Opening database %s...", "chromesync.data_store");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        qth.f42096a.mo25412b("Upgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            m32848a(sQLiteDatabase, qtw.f42131a);
            i = 2;
        }
        if (i < 3) {
            m32848a(sQLiteDatabase, qtn.f42104a);
            i = 3;
        }
        if (i < 4) {
            m32848a(sQLiteDatabase, qtf.f42095a);
            m32848a(sQLiteDatabase, qtc.f42091a);
            i = 4;
        }
        if (i < 6) {
            qto.f42105a.mo25412b("Dropping table: %s...", "password_index");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS password_index");
            m32848a(sQLiteDatabase, qtn.f42104a);
        } else if (i >= 7) {
            return;
        }
        m32848a(sQLiteDatabase, qtl.f42103a);
        m32848a(sQLiteDatabase, qti.f42099a);
    }

    public qtg(Context context) {
        super(context, "chromesync.data_store", "chromesync.data_store", 7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        qth.f42096a.mo25412b("Creating database %s...", "chromesync.data_store");
        m32848a(sQLiteDatabase, qtb.f42090a);
        m32848a(sQLiteDatabase, qtw.f42131a);
        m32848a(sQLiteDatabase, qtn.f42104a);
        m32848a(sQLiteDatabase, qtf.f42095a);
        m32848a(sQLiteDatabase, qtc.f42091a);
        m32848a(sQLiteDatabase, qtl.f42103a);
        m32848a(sQLiteDatabase, qti.f42099a);
    }
}
