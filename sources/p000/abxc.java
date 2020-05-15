package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abxc extends abwz {

    /* renamed from: a */
    private abxb f58669a;

    /* renamed from: b */
    private final int f58670b;

    protected abxc(int i, int i2) {
        super(i);
        this.f58670b = i2;
    }

    /* renamed from: a */
    public abstract abxb mo32404a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt);

    /* renamed from: a */
    public final void mo32400a(abvo abvo, abyy abyy, abrv abrv) {
        abxb abxb = this.f58669a;
        if (abxb != null) {
            Set set = abxb.f58667a;
            Set set2 = abxb.f58668b;
            if (!set2.isEmpty() && !set.isEmpty()) {
                HashSet hashSet = new HashSet(set);
                hashSet.removeAll(set2);
                set = hashSet;
            }
            abvo.mo32362a(set2, abyy, abrv, this.f58670b);
            abvo.mo32364b(set, abyy, abrv, this.f58670b);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo32401a(abyy abyy, abrv abrv) {
    }

    /* renamed from: a */
    public final void mo32403a(Context context, SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        this.f58669a = mo32404a(sQLiteDatabase, abvo, abyy, abxt);
    }
}
