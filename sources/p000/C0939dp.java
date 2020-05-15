package p000;

import android.database.sqlite.SQLiteStatement;

/* renamed from: dp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0939dp extends C0938do implements C0930dg {

    /* renamed from: b */
    private final SQLiteStatement f13722b;

    public C0939dp(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f13722b = sQLiteStatement;
    }

    /* renamed from: a */
    public final void mo9362a() {
        this.f13722b.executeInsert();
    }

    /* renamed from: b */
    public final void mo9363b() {
        this.f13722b.executeUpdateDelete();
    }
}
