package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ambe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambe implements amfa {

    /* renamed from: a */
    final /* synthetic */ ambg f74608a;

    /* renamed from: b */
    private final int f74609b;

    /* renamed from: c */
    private boolean f74610c;

    /* renamed from: d */
    private ArrayList f74611d;

    /* renamed from: e */
    private ArrayList f74612e;

    /* renamed from: f */
    private ArrayList f74613f;

    /* renamed from: g */
    private amex f74614g;

    /* renamed from: h */
    private final boolean f74615h = (!TextUtils.isEmpty(mo25473b()));

    public ambe(ambg ambg, int i) {
        this.f74608a = ambg;
        this.f74609b = i;
    }

    /* renamed from: a */
    private static final Iterable m62514a(amex amex) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(amex);
        return arrayList;
    }

    /* renamed from: i */
    private final int m62517i() {
        return this.f74608a.f74621e.mo41695b(this.f74609b);
    }

    /* renamed from: j */
    private final void m62518j() {
        Cursor cursor;
        long j;
        if (!this.f74610c) {
            this.f74610c = true;
            int i = m62517i();
            this.f74611d = new ArrayList(i);
            this.f74612e = new ArrayList();
            this.f74613f = null;
            if (mo41101h()) {
                boolean z = this.f74608a.f74626j;
            }
            if (this.f74613f == null) {
                this.f74613f = new ArrayList();
            }
            this.f74614g = null;
            String b = mo25473b();
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f74608a.f74619c.moveToPosition(this.f74608a.f74621e.mo41692a(this.f74609b, i2))) {
                    this.f74611d.add(Long.valueOf(this.f74608a.f74619c.getLong(0)));
                    do {
                        String string = this.f74608a.f74619c.getString(2);
                        if ("vnd.android.cursor.item/email_v2".equals(string) && this.f74614g == null) {
                            ambg ambg = this.f74608a;
                            String a = m62515a(ambg.f74619c, ambg.f74624h);
                            String string2 = this.f74608a.f74619c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                ambj ambj = new ambj(a, string2);
                                if (!this.f74612e.contains(ambj)) {
                                    if (b == null || !this.f74608a.f74623g.containsKey(ambj.f74635a) || !b.equals(this.f74608a.f74623g.get(ambj.f74635a))) {
                                        this.f74612e.add(ambj);
                                    } else {
                                        this.f74614g = ambj;
                                        this.f74612e.clear();
                                    }
                                }
                            }
                        } else if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                            ambg ambg2 = this.f74608a;
                            String a2 = m62515a(ambg2.f74619c, ambg2.f74625i);
                            String string3 = this.f74608a.f74619c.getString(3);
                            if (!TextUtils.isEmpty(string3)) {
                                ambu ambu = new ambu(a2, string3);
                                if (!this.f74613f.contains(ambu)) {
                                    this.f74613f.add(ambu);
                                }
                            }
                        }
                        cursor = this.f74608a.f74619c;
                        String[] strArr = ambi.f74632a;
                        sdo.m34974b(!cursor.isBeforeFirst());
                        if (cursor.isAfterLast()) {
                            break;
                        }
                        j = cursor.getLong(0);
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } while (j == cursor.getLong(0));
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo25473b() {
        this.f74608a.mo41103d();
        return (String) this.f74608a.f74622f.get(this.f74609b);
    }

    /* renamed from: c */
    public final String mo25474c() {
        this.f74608a.mo41103d();
        if (mo41101h()) {
            return m62516a("name");
        }
        ambg ambg = this.f74608a;
        ambg.f74619c.moveToPosition(ambg.f74621e.mo41692a(this.f74609b, 0));
        return this.f74608a.f74619c.getString(1);
    }

    /* renamed from: d */
    public final String mo25475d() {
        this.f74608a.mo41103d();
        return ancb.f76610a.mo41685a(m62516a("avatar"));
    }

    /* renamed from: e */
    public final String[] mo25476e() {
        this.f74608a.mo41103d();
        return ancm.m64015d(m62516a("v_circle_ids"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ambe) {
            ambe ambe = (ambe) obj;
            return this.f74609b == ambe.f74609b && this.f74608a == ambe.f74608a;
        }
    }

    /* renamed from: f */
    public final Iterable mo25478f() {
        this.f74608a.mo41103d();
        String g = ancm.m64018g(mo25472a());
        if (!TextUtils.isEmpty(g)) {
            return m62514a(new ambj("", g));
        }
        m62518j();
        if (!this.f74615h) {
            this.f74608a.mo41103d();
            if (m62517i() > 0) {
                return this.f74612e;
            }
            mo25472a();
            return amex.f74849b;
        }
        amex amex = this.f74614g;
        return amex != null ? m62514a(amex) : amex.f74849b;
    }

    /* renamed from: g */
    public final Iterable mo25479g() {
        this.f74608a.mo41103d();
        if (ancm.m64020i(mo25472a())) {
            return amfc.f74852a;
        }
        m62518j();
        return this.f74613f;
    }

    /* renamed from: h */
    public final boolean mo41101h() {
        this.f74608a.mo41103d();
        return this.f74608a.f74620d.mo41695b(this.f74609b) > 0;
    }

    public final int hashCode() {
        return (this.f74608a.hashCode() * 31) + this.f74609b;
    }

    /* renamed from: a */
    private final String m62515a(Cursor cursor, ambf ambf) {
        int i = this.f74608a.f74619c.getInt(4);
        if (i == 0) {
            return cursor.getString(5);
        }
        if (i == 0) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = ambf.f74616a;
        Integer valueOf = Integer.valueOf(i);
        String str = (String) concurrentHashMap.get(valueOf);
        if (str != null) {
            return str;
        }
        String a = ambf.mo41099a(ambf.f74617b, i);
        ambf.f74616a.put(valueOf, a);
        return a;
    }

    /* renamed from: a */
    private final String m62516a(String str) {
        if (!mo41101h()) {
            return null;
        }
        int a = this.f74608a.f74620d.mo41692a(this.f74609b, 0);
        DataHolder dataHolder = this.f74608a.f74618b;
        return dataHolder.mo17769c(str, a, dataHolder.mo17762a(a));
    }

    /* renamed from: a */
    public final String mo25472a() {
        this.f74608a.mo41103d();
        return m62516a("qualified_id");
    }
}
