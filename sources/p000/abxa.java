package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: abxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class abxa extends abwz {

    /* renamed from: a */
    private Set f58666a = null;

    protected abxa() {
        super(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Set mo32402a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt);

    /* renamed from: a */
    public final void mo32400a(abvo abvo, abyy abyy, abrv abrv) {
        Set<abww> set = this.f58666a;
        if (set != null) {
            String str = abyy.f58780f;
            for (abww abww : set) {
                acpl acpl = abrv.f58067c;
                abvl abvl = new abvl(bqbd.CLEAR_CORPUS_DATA, str, abrv, str, abww);
                acpl.mo32995d(abvl);
                abvl.mo32295h();
            }
        }
    }

    /* renamed from: a */
    public final void mo32403a(Context context, SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        this.f58666a = mo32402a(sQLiteDatabase, abvo, abyy, abxt);
    }
}
