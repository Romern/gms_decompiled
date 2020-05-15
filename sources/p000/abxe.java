package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: abxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxe extends abxc {

    /* renamed from: a */
    Map f58671a;

    /* renamed from: b */
    private final Thing[] f58672b;

    /* renamed from: a */
    public final abxb mo32404a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        Set set;
        Thing[] thingArr = this.f58672b;
        sdo.m34970a(sQLiteDatabase.inTransaction());
        String str = abyy.f58780f;
        int length = thingArr.length;
        if (length == 0) {
            set = Collections.emptySet();
        } else {
            if (briy.m114098a(3)) {
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    briy.m114097a(String.format(Locale.US, "Patch Indexable %d / %d", Integer.valueOf(i2), Integer.valueOf(length)));
                    briy.m114097a(thingArr[i].toString());
                    i = i2;
                }
            }
            bndu r = bndu.m109109r();
            for (Thing thing : thingArr) {
                r.mo67268a(abxt.mo32425b(thing.f152373e).f58531b, thing);
            }
            bndu r2 = bndu.m109109r();
            Set a = abvn.m48330a(sQLiteDatabase, str, abxt);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                abww abww = (abww) it.next();
                String str2 = abww.f58661a.f58531b;
                if (r.mo67271d(str2)) {
                    r2.mo67268a(str2, abww);
                } else {
                    it.remove();
                }
            }
            for (Map.Entry entry : r2.mo67315n()) {
                abww abww2 = (abww) entry.getValue();
                for (Thing thing2 : r.mo67127c((String) entry.getKey())) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("action", "mod");
                    contentValues.put("uri", thing2.f152372d);
                    contentValues.put("section_thing_proto", abyd.m48529a(thing2));
                    sQLiteDatabase.insertOrThrow(abxu.m48513a(abww2.mo32394a()), null, contentValues);
                }
            }
            set = a;
        }
        return abxb.m48430a(set);
    }

    public abxe(Thing[] thingArr) {
        super(abxl.m48464a(thingArr), 4);
        this.f58672b = thingArr;
    }

    /* renamed from: a */
    public final void mo32405a(abrv abrv, abyy abyy, abvx abvx) {
        abxl.m48465a(abrv, "patch");
        sdo.checkIfNull(this.f58671a, "execute called without validateInput");
        for (Map.Entry entry : this.f58671a.entrySet()) {
            abww abww = (abww) entry.getKey();
            for (Thing thing : (List) entry.getValue()) {
                caef b = abyd.m48530b(thing);
                bxvd da = abqq.f58001c.mo74144da();
                bxvd da2 = abqu.f58016d.mo74144da();
                String str = abww.f58662b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((abqu) da2.f164949b).f58018a = str;
                String b2 = abww.mo32395b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                abqu abqu = (abqu) da2.f164949b;
                b2.getClass();
                abqu.f58019b = b2;
                b.getClass();
                abqu.f58020c = b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abqq abqq = (abqq) da.f164949b;
                abqu abqu2 = (abqu) da2.mo74062i();
                abqu2.getClass();
                abqq.f58004b = abqu2;
                abqq.f58003a = 2;
                abvx.mo32374a((abqq) da.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final void mo32406a(abyy abyy, abrv abrv, abxt abxt) {
        abxr.m48490a(this.f58672b, abyy.f58780f, abrv.f58066b, true, abxt);
        this.f58671a = abwx.m48421a(this.f58672b, abyy.f58780f, abxt);
    }
}
