package p000;

import android.database.Cursor;
import android.os.Build;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: bbgq */
final /* synthetic */ class bbgq implements benr {

    /* renamed from: a */
    private final bbgt f102601a;

    /* renamed from: b */
    private final Iterable f102602b;

    public bbgq(bbgt bbgt, Iterable iterable) {
        this.f102601a = bbgt;
        this.f102602b = iterable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.lang.Iterable, bbgo]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final Object mo56134a(bens bens) {
        Throwable th;
        Throwable th2;
        int i;
        bens bens2 = bens;
        bbgt bbgt = this.f102601a;
        Iterable iterable = this.f102602b;
        benp benp = new benp();
        benp.mo60824a("SELECT key_data, value_state_data, value_data, write_ms, access_ms, rowid FROM infinite_data_cache WHERE key_data IN (");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            benp.mo60824a("?");
            benp.f111886a.add(((bxtx) it.next()).mo73780k());
            if (it.hasNext()) {
                benp.mo60824a(", ");
            }
        }
        benp.mo60824a(")");
        Pair pair = (Pair) bbgt.f102609b.mo6606a();
        benp.mo60824a(" AND write_ms>=?");
        benp.mo60823a(Long.valueOf(bbgt.f102608a.mo54417a() - ((TimeUnit) pair.second).toMillis(((Long) pair.first).longValue())));
        beno a = benp.mo60822a();
        bens.m95324a();
        String valueOf = String.valueOf(a.f111884a);
        bljb a2 = blkh.m107282a(valueOf.length() == 0 ? new String("Query: ") : "Query: ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            int i2 = Build.VERSION.SDK_INT;
            Cursor rawQueryWithFactory = bens2.f111891b.rawQueryWithFactory(new benq(a.f111885b), a.f111884a, null, null, bens2.f111890a);
            if (a2 != null) {
                a2.close();
            }
            try {
                bnha h = bnhe.m109414h();
                benp benp2 = new benp();
                benp2.mo60824a("UPDATE OR FAIL infinite_data_cache");
                benp2.mo60824a(" SET access_ms=?");
                benp2.f111886a.add(Long.toString(bbgt.f102608a.mo54417a()));
                benp2.mo60824a(" WHERE rowid IN (");
                while (rawQueryWithFactory.moveToNext()) {
                    byte[] blob = rawQueryWithFactory.getBlob(rawQueryWithFactory.getColumnIndexOrThrow("key_data"));
                    int i3 = rawQueryWithFactory.getInt(rawQueryWithFactory.getColumnIndexOrThrow("value_state_data"));
                    byte[] blob2 = rawQueryWithFactory.getBlob(rawQueryWithFactory.getColumnIndexOrThrow("value_data"));
                    long j = rawQueryWithFactory.getLong(rawQueryWithFactory.getColumnIndexOrThrow("write_ms"));
                    long j2 = rawQueryWithFactory.getLong(rawQueryWithFactory.getColumnIndexOrThrow("rowid"));
                    benp2.mo60824a("?");
                    benp2.mo60823a(Long.valueOf(j2));
                    if (!rawQueryWithFactory.isLast()) {
                        benp2.mo60824a(", ");
                    } else {
                        benp2.mo60824a(")");
                    }
                    bbfx d = bbfz.m87976d();
                    if (i3 != 0) {
                        i = i3 != 1 ? i3 != 2 ? 1 : 4 : 3;
                    } else {
                        i = 2;
                    }
                    d.f102572a = i;
                    d.mo56123a(j);
                    if (blob2 != null) {
                        d.mo56124a(bxtx.m123261a(blob2));
                    }
                    h.mo67695b(bxtx.m123261a(blob), d.mo56122a());
                }
                if (rawQueryWithFactory.getCount() > 0) {
                    bens2.mo60826a(benp2.mo60822a());
                }
                bnhe b = h.mo67618b();
                bbfx d2 = bbfz.m87976d();
                d2.f102572a = 3;
                bbfz a3 = d2.mo56122a();
                bbfv b2 = bbfw.m87969b();
                b2.mo56121a(bngx.m109355a(bnjd.m109575a(iterable, (bmxj) new bbgo(b, a3))));
                bbfw a4 = b2.mo56119a();
                if (rawQueryWithFactory != null) {
                    rawQueryWithFactory.close();
                }
                return a4;
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th;
            throw th2;
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
