package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: uhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uhe implements vpj {

    /* renamed from: a */
    final /* synthetic */ uhj f47597a;

    /* renamed from: b */
    private SQLiteDatabase f47598b;

    public uhe(uhj uhj) {
        this.f47597a = uhj;
    }

    /* renamed from: a */
    public final synchronized SQLiteDatabase mo27461b() {
        if (this.f47598b == null) {
            this.f47598b = this.f47597a.f47637b.getWritableDatabase();
        }
        return this.f47598b;
    }
}
