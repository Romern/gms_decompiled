package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: abxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxk extends abxc {

    /* renamed from: a */
    Map f58683a;

    /* renamed from: b */
    private final Thing[] f58684b;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final abxb mo32404a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        Set set;
        String str;
        String str2;
        Iterator it;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        abyy abyy2 = abyy;
        abxt abxt2 = abxt;
        String str3 = "type_indexapi";
        String str4 = "incarnation_indexapi";
        sdo.checkIfNull(this.f58683a, "execute called without validateInput");
        Map map = this.f58683a;
        sdo.m34970a(sQLiteDatabase.inTransaction());
        String str5 = abyy2.f58780f;
        if (map.isEmpty()) {
            set = Collections.emptySet();
        } else {
            if (!"com.google.android.apps.messaging".equals(abyy2.f58780f) || !cemj.f182986a.mo6606a().mo79349b()) {
                set = null;
            } else {
                set = new HashSet();
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                abww abww = (abww) entry.getKey();
                String a = abww.mo32394a();
                if (!fua.m12404c(sQLiteDatabase2, a)) {
                    ArrayList arrayList = new ArrayList();
                    List a2 = abxu.m48514a(abww.f58661a);
                    int size = a2.size();
                    int i = 0;
                    while (true) {
                        it = it2;
                        if (i >= size) {
                            break;
                        }
                        Pair pair = (Pair) a2.get(i);
                        String str6 = (String) pair.first;
                        String str7 = (String) pair.second;
                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 3 + String.valueOf(str7).length());
                        sb.append("[");
                        sb.append(str6);
                        sb.append("] ");
                        sb.append(str7);
                        arrayList.add(sb.toString());
                        i++;
                        str3 = str3;
                        it2 = it;
                        str4 = str4;
                    }
                    String a3 = abww.mo32394a();
                    String join = TextUtils.join(", ", arrayList);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 32 + String.valueOf(join).length());
                    sb2.append("CREATE TABLE IF NOT EXISTS [");
                    sb2.append(a3);
                    sb2.append("] (");
                    sb2.append(join);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    String b = abxu.m48515b(abww.mo32394a());
                    sQLiteDatabase.beginTransaction();
                    try {
                        String str8 = abww.f58662b;
                        String hexString = Long.toHexString(new Random().nextLong());
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("app_name", str8);
                        contentValues.put("incarnation", hexString);
                        sQLiteDatabase2.insertWithOnConflict(str4, null, contentValues, 4);
                        absg.m48186a("Updated %s with: %s.", str4, hexString);
                        ContentValues contentValues2 = new ContentValues(2);
                        contentValues2.put("app_name", abww.f58662b);
                        contentValues2.put("type", abww.mo32396c());
                        sQLiteDatabase2.insertWithOnConflict(str3, null, contentValues2, 4);
                        absg.m48194b("Updated %s with (%s, %s).", str3, abww.f58662b, abww.mo32396c());
                        sQLiteDatabase2.execSQL(sb3);
                        if (sQLiteDatabase.getVersion() >= 9) {
                            sQLiteDatabase2.execSQL(b);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        absg.m48184a("Updated incarnation and type table.");
                        absg.m48194b("Created sequence table: %s. SQL: %s; %s", a, sb3, b);
                        sQLiteDatabase.endTransaction();
                        str = str3;
                        str2 = str4;
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    str = str3;
                    str2 = str4;
                    it = it2;
                }
                List<Thing> list = (List) entry.getValue();
                sdo.m34974b(sQLiteDatabase.inTransaction());
                Set<abww> a4 = abvn.m48330a(sQLiteDatabase2, abww.f58662b, abxt2);
                if (!a4.remove(abww)) {
                    String valueOf = String.valueOf(abww.f58661a.f58531b);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing type: ") : "Missing type: ".concat(valueOf));
                }
                if (set != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(abww.f58661a.f58531b);
                    if ("LocalBusiness".equals(abww.f58661a.f58531b)) {
                        arrayList2.add("DigitalDocument");
                    }
                    if ("DigitalDocument".equals(abww.f58661a.f58531b)) {
                        arrayList2.add("LocalBusiness");
                    }
                    a4 = abvo.m48339a(a4, arrayList2);
                }
                if (set != null) {
                    set.addAll(a4);
                    set.add(abww);
                }
                for (Thing thing : list) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("uri", thing.f152372d);
                    contentValues3.put("action", "del");
                    for (abww abww2 : a4) {
                        sQLiteDatabase2.insertOrThrow(abxu.m48513a(abww2.mo32394a()), null, contentValues3);
                    }
                    contentValues3.put("action", "add");
                    contentValues3.put("doc_score", Integer.valueOf(thing.f152371c.f152375b));
                    contentValues3.put("created_timestamp", Long.valueOf(System.currentTimeMillis()));
                    contentValues3.put("section_thing_proto", abyd.m48529a(thing));
                    bxwc bxwc = abww.f58661a.f58533d;
                    int size2 = bxwc.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        abvf abvf = (abvf) bxwc.get(i2);
                        List a5 = abxt.m48505a(thing, abvf.f58522b);
                        if (!a5.isEmpty()) {
                            String valueOf2 = String.valueOf(abvf.f58522b);
                            contentValues3.put(valueOf2.length() == 0 ? new String("section_") : "section_".concat(valueOf2), TextUtils.join("\u0000", a5));
                        }
                    }
                    sQLiteDatabase2.insertOrThrow(abxu.m48513a(abww.mo32394a()), null, contentValues3);
                }
                str3 = str;
                it2 = it;
                str4 = str2;
            }
            if (set == null) {
                set = abvn.m48330a(sQLiteDatabase2, str5, abxt2);
            }
        }
        return new abxb(set, this.f58683a.keySet());
    }

    public abxk(Thing[] thingArr) {
        super(abxl.m48464a(thingArr), 3);
        this.f58684b = thingArr;
    }

    /* renamed from: a */
    public final void mo32405a(abrv abrv, abyy abyy, abvx abvx) {
        abxl.m48465a(abrv, "update");
        sdo.checkIfNull(this.f58683a, "execute called without validateInput");
        if (cemw.m137394b()) {
            abwr.m48408a(this.f58683a);
        }
        abxy.m48518a(abyy, abrv, this.f58683a);
        for (abww abww : this.f58683a.keySet()) {
            abvr.m48357a(abrv, abyy, abww);
        }
        for (Map.Entry entry : this.f58683a.entrySet()) {
            abww abww2 = (abww) entry.getKey();
            for (Thing thing : (List) entry.getValue()) {
                caef b = abyd.m48530b(thing);
                bxvd da = abqq.f58001c.mo74144da();
                bxvd da2 = abqu.f58016d.mo74144da();
                String str = abww2.f58662b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((abqu) da2.f164949b).f58018a = str;
                String b2 = abww2.mo32395b();
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
                abqq.f58003a = 1;
                abvx.mo32374a((abqq) da.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final void mo32401a(abyy abyy, abrv abrv) {
        if (cemw.m137394b()) {
            abwr.m48408a(this.f58683a);
        }
        abxy.m48518a(abyy, abrv, this.f58683a);
    }

    /* renamed from: a */
    public final void mo32406a(abyy abyy, abrv abrv, abxt abxt) {
        String str = abyy.f58780f;
        abxr.m48490a(this.f58684b, str, abrv.f58066b, false, abxt);
        if (briy.m114098a(3)) {
            int length = this.f58684b.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                briy.m114097a(String.format(Locale.US, "Update Indexable %d / %d", Integer.valueOf(i2), Integer.valueOf(length)));
                briy.m114097a(this.f58684b[i].toString());
                i = i2;
            }
        }
        this.f58683a = abwx.m48421a(this.f58684b, str, abxt);
    }
}
