package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: elz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class elz extends SQLiteOpenHelper {

    /* renamed from: a */
    static final int f15261a = 3;

    /* renamed from: b */
    public static final /* synthetic */ int f15262b = 0;

    /* renamed from: e */
    private static final ely f15263e = elv.f15258a;

    /* renamed from: f */
    private static final ely f15264f = elw.f15259a;

    /* renamed from: g */
    private static final ely f15265g;

    /* renamed from: h */
    private static final List f15266h;

    /* renamed from: c */
    private final int f15267c;

    /* renamed from: d */
    private boolean f15268d = false;

    static {
        ely ely = elx.f15260a;
        f15265g = ely;
        f15266h = Arrays.asList(f15263e, f15264f, ely);
    }

    public elz(Context context, int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f15267c = i;
    }

    /* renamed from: a */
    private final void m10652a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f15268d) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f15268d = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m10652a(sQLiteDatabase);
        m10653a(sQLiteDatabase, 0, this.f15267c);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        m10652a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m10652a(sQLiteDatabase);
        m10653a(sQLiteDatabase, i, i2);
    }

    /* renamed from: a */
    private static final void m10653a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f15266h.size()) {
            while (i < i2) {
                ((ely) f15266h.get(i)).mo10268a(sQLiteDatabase);
                i++;
            }
            return;
        }
        int size = f15266h.size();
        StringBuilder sb = new StringBuilder(122);
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(size);
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
}
