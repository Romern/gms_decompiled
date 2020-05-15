package p000;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: apaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apaw {

    /* renamed from: a */
    public final apar f84073a = new apar();

    /* renamed from: b */
    public final apat f84074b = new apat();

    /* renamed from: c */
    public final apas f84075c = new apas();

    /* renamed from: d */
    public final apau f84076d = new apau();

    /* renamed from: e */
    public final apav f84077e = new apav();

    /* renamed from: f */
    public long f84078f = -1;

    /* renamed from: a */
    public final void mo47064a() {
        apar apar = this.f84073a;
        apar.f84055a.setLength(0);
        apar.f84056b.setLength(0);
        apar.f84057c.setLength(0);
        apar.f84058d.setLength(0);
        apar.f84059e.setLength(0);
        apar.f84060f.setLength(0);
        apar.f84061g.setLength(0);
        apar.f84062h = 0;
        apar.f84063i = null;
        apar.f84065k = null;
        apar.f84064j = null;
        apar.f84067m = 0;
        apat apat = this.f84074b;
        apat.f84069a = 0;
        apat.f84070b = 0;
        this.f84075c.f84068a.clear();
        this.f84076d.f84071a.clear();
        this.f84077e.f84072a.clear();
        this.f84078f = -1;
    }

    /* renamed from: b */
    public final apab mo47065b() {
        apar apar = this.f84073a;
        long j = apar.f84062h;
        String str = apar.f84063i;
        String str2 = apar.f84064j;
        String str3 = apar.f84065k;
        String a = apar.m69973a(apar.f84055a);
        long j2 = apar.f84067m;
        String a2 = apar.m69973a(apar.f84056b);
        String a3 = apar.m69973a(apar.f84058d);
        String a4 = apar.m69973a(apar.f84059e);
        String a5 = apar.m69973a(apar.f84060f);
        String a6 = apar.m69973a(apar.f84057c);
        String a7 = apar.m69973a(apar.f84061g);
        String str4 = apar.f84066l;
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", a);
        contentValues.put("score", Long.valueOf(j2));
        contentValues.put("emails", a2);
        contentValues.put("nickname", a3);
        contentValues.put("note", a4);
        contentValues.put("organization", a5);
        contentValues.put("phone_numbers", a6);
        contentValues.put("postal_address", a7);
        contentValues.put("phonetic_name", str4);
        apat apat = this.f84074b;
        long j3 = apat.f84069a;
        long j4 = apat.f84070b;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("TIMES_CONTACTED", Long.valueOf(j3));
        contentValues2.put("LAST_TIME_CONTACTED", Long.valueOf(j4));
        return new apab(contentValues, contentValues2, new LinkedHashMap(this.f84075c.f84068a), new LinkedHashMap(this.f84076d.f84071a), new LinkedHashMap(this.f84077e.f84072a));
    }
}
