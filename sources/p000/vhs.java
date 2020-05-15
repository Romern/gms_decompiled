package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: vhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhs {

    /* renamed from: a */
    public final umn f49287a;

    /* renamed from: b */
    public final boolean f49288b = ((Boolean) twy.f46861as.mo58455c()).booleanValue();

    /* renamed from: c */
    private final String f49289c;

    /* renamed from: d */
    private final vit f49290d;

    /* renamed from: e */
    private final Map f49291e;

    /* renamed from: f */
    private boolean f49292f = false;

    /* renamed from: g */
    private boolean f49293g = false;

    /* renamed from: h */
    private int f49294h = 0;

    public vhs(String str, vit vit, umn umn, Map map) {
        this.f49289c = str;
        this.f49290d = vit;
        this.f49287a = umn;
        this.f49291e = map;
    }

    /* renamed from: a */
    public final synchronized boolean mo28463a() {
        if (!this.f49293g) {
            if (vii.f49330d.mo28481a(this.f49290d.getReadableDatabase()) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }

    /* renamed from: b */
    public final synchronized bklw mo28464b() {
        SQLiteDatabase readableDatabase;
        bkvo a;
        Cursor query;
        int i;
        bkpx bkpx;
        ArrayList arrayList;
        Cursor query2;
        bkwz bkwz;
        if (!this.f49293g) {
            readableDatabase = this.f49290d.getReadableDatabase();
            try {
                vii vii = vii.f49330d;
                a = vii.mo28481a(readableDatabase);
                if (a != null) {
                    vio vio = vio.f49344d;
                    query = readableDatabase.query(vio.mo27735b(), vio.f49345e, null, null, null, null, ((unt) vio).f48341a.mo27700a());
                    ArrayList arrayList2 = new ArrayList();
                    while (query.moveToNext()) {
                        arrayList2.add((bkpv) vho.m40444a(query.getString(0)));
                    }
                    query.close();
                    String a2 = vii.mo28482a(readableDatabase, "revision");
                    if (a2 != null) {
                        i = Integer.parseInt(a2);
                    } else {
                        i = -1;
                    }
                    bkpx = new bkpx(i, a.f125334a, arrayList2);
                    arrayList = new ArrayList();
                    vil vil = vil.f49336d;
                    query2 = readableDatabase.query(vil.mo27735b(), vil.f49337e, null, null, null, null, ((unt) vil).f48341a.mo27700a());
                    while (query2.moveToNext()) {
                        arrayList.add((blhg) vho.m40444a(query2.getString(0)));
                    }
                    query2.close();
                    String a3 = vii.mo28482a(readableDatabase, "isReadOnly");
                    if (a3 != null) {
                        if (Boolean.parseBoolean(a3)) {
                            bkwz = bkwz.READ_ONLY;
                        }
                    }
                    bkwz = bkwz.READ_WRITE;
                } else {
                    throw new vht("Missing session metadata.");
                }
            } catch (bkqc e) {
                throw new vht("Error parsing cached json", e);
            } catch (Throwable th) {
                query2.close();
                throw th;
            }
        } else {
            throw new IllegalStateException("Trying to interact with a closed cache.");
        }
        return new bklw(new bkpw(bkpx, bkwz, arrayList, Collections.singletonList(a), null), new bkrb(vhk.m40439a(readableDatabase, 0), vhk.m40439a(readableDatabase, 1), vhk.m40439a(readableDatabase, 2)));
    }

    /* renamed from: c */
    public final synchronized void mo28465c() {
        if (!this.f49292f) {
            this.f49294h++;
        } else {
            throw new IllegalStateException("Cannot add pending changes in the closing state.");
        }
    }

    /* renamed from: d */
    public final synchronized void mo28466d() {
        int i = this.f49294h - 1;
        this.f49294h = i;
        if (i == 0) {
            notifyAll();
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo28467e() {
        return this.f49293g;
    }

    /* renamed from: f */
    public final synchronized void mo28468f() {
        this.f49292f = true;
        while (this.f49294h != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        if (!this.f49293g) {
            this.f49293g = true;
            this.f49290d.close();
            this.f49291e.remove(this.f49289c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final SQLiteDatabase mo28469g() {
        if (!this.f49293g) {
            return this.f49290d.getWritableDatabase();
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final umn mo28470h() {
        if (!this.f49293g) {
            return this.f49287a;
        }
        throw new IllegalStateException("Trying to interact with a closed cache.");
    }
}
