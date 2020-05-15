package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: elo */
final /* synthetic */ class elo implements elq {

    /* renamed from: a */
    private final elt f15249a;

    /* renamed from: b */
    private final ejb f15250b;

    public elo(elt elt, ejb ejb) {
        this.f15249a = elt;
        this.f15250b = ejb;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        char c;
        elt elt = this.f15249a;
        ejb ejb = this.f15250b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = new ArrayList();
        Long a = elt.m10632a(sQLiteDatabase, ejb);
        if (a != null) {
            c = 1;
            elt.m10633a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{a.toString()}, null, null, null, String.valueOf(elt.f15255b.mo10243b())), new elc(arrayList, ejb));
        } else {
            c = 1;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((ekz) arrayList.get(i)).mo10249a());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        String[] strArr = new String[3];
        strArr[0] = "event_id";
        strArr[c] = "name";
        strArr[2] = "value";
        elt.m10633a(sQLiteDatabase.query("event_metadata", strArr, sb.toString(), null, null, null, null), new eld(hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            ekz ekz = (ekz) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(ekz.mo10249a()))) {
                eix c2 = ekz.mo10251c();
                eiw eiw = new eiw();
                eiw.mo10182a(c2.mo10162a());
                eiw.f15104a = c2.mo10163b();
                eiw.mo10181a(c2.mo10164c());
                eiw.mo10180a(c2.mo10165d());
                eiw.mo10183b(c2.mo10166e());
                eiw.f15105b = new HashMap(c2.mo10168f());
                for (elr elr : (Set) hashMap.get(Long.valueOf(ekz.mo10249a()))) {
                    String str = elr.f15252a;
                    String str2 = elr.f15253b;
                    Map map = eiw.f15105b;
                    if (map != null) {
                        map.put(str, str2);
                    } else {
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    }
                }
                listIterator.set(ekz.m10609a(ekz.mo10249a(), ekz.mo10250b(), eiw.mo10179a()));
            }
        }
        return arrayList;
    }
}
