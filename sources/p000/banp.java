package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: banp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class banp {

    /* renamed from: a */
    public final Set f101361a;

    /* renamed from: b */
    public final cayo f101362b;

    /* renamed from: c */
    private final bamg f101363c;

    /* renamed from: d */
    private final babr f101364d;

    public banp(babr babr, Set set, bamg bamg, cayo cayo) {
        this.f101364d = babr;
        this.f101361a = set;
        this.f101363c = bamg;
        this.f101362b = cayo;
    }

    /* renamed from: a */
    public final void mo55813a(SQLiteDatabase sQLiteDatabase) {
        ((achw) this.f101362b.mo16713a()).mo25414c("Creating database v%d", 2);
        if (!this.f101364d.mo32684f()) {
            this.f101363c.mo55755a(sQLiteDatabase);
        }
        for (bano bano : this.f101361a) {
            bano.mo55810a(sQLiteDatabase);
        }
    }
}
