package p000;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: alqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqk {

    /* renamed from: a */
    public final alqf f74096a = new alqf();

    /* renamed from: b */
    public final alqh f74097b = new alqh();

    /* renamed from: c */
    public final alqg f74098c = new alqg();

    /* renamed from: d */
    public final alqi f74099d = new alqi();

    /* renamed from: e */
    public final alqj f74100e = new alqj();

    /* renamed from: f */
    public long f74101f = -1;

    /* renamed from: a */
    public final void mo40648a() {
        alqf alqf = this.f74096a;
        alqf.f74077a.setLength(0);
        alqf.f74078b.setLength(0);
        alqf.f74079c.setLength(0);
        alqf.f74080d.setLength(0);
        alqf.f74081e.setLength(0);
        alqf.f74082f.setLength(0);
        alqf.f74083g.setLength(0);
        alqf.f74084h = 0;
        alqf.f74085i = 0;
        alqf.f74086j = null;
        alqf.f74088l = null;
        alqf.f74087k = null;
        alqf.f74090n = 0;
        alqh alqh = this.f74097b;
        alqh.f74092a = 0;
        alqh.f74093b = 0;
        this.f74098c.f74091a.clear();
        this.f74099d.f74094a.clear();
        this.f74100e.f74095a.clear();
        this.f74101f = -1;
    }

    /* renamed from: b */
    public final alqa mo40649b() {
        alqf alqf = this.f74096a;
        long j = alqf.f74084h;
        long j2 = alqf.f74085i;
        String str = alqf.f74086j;
        String str2 = alqf.f74087k;
        String str3 = alqf.f74088l;
        String a = alqf.m61513a(alqf.f74077a);
        long j3 = alqf.f74090n;
        String a2 = alqf.m61513a(alqf.f74078b);
        String a3 = alqf.m61513a(alqf.f74080d);
        String a4 = alqf.m61513a(alqf.f74081e);
        String a5 = alqf.m61513a(alqf.f74082f);
        String a6 = alqf.m61513a(alqf.f74079c);
        String a7 = alqf.m61513a(alqf.f74083g);
        String str4 = alqf.f74089m;
        ContentValues contentValues = new ContentValues();
        contentValues.clear();
        contentValues.put("contact_id", Long.valueOf(j));
        contentValues.put("raw_contact_id", Long.valueOf(j2));
        contentValues.put("lookup_key", str);
        contentValues.put("icon_uri", str2);
        contentValues.put("display_name", str3);
        contentValues.put("given_names", a);
        contentValues.put("score", Long.valueOf(j3));
        contentValues.put("emails", a2);
        contentValues.put("nickname", a3);
        contentValues.put("note", a4);
        contentValues.put("organization", a5);
        contentValues.put("phone_numbers", a6);
        contentValues.put("postal_address", a7);
        contentValues.put("phonetic_name", str4);
        alqh alqh = this.f74097b;
        long j4 = alqh.f74092a;
        long j5 = alqh.f74093b;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("TIMES_CONTACTED", Long.valueOf(j4));
        contentValues2.put("LAST_TIME_CONTACTED", Long.valueOf(j5));
        return new alqa(contentValues, contentValues2, new LinkedHashMap(this.f74098c.f74091a), new LinkedHashMap(this.f74099d.f74094a), new LinkedHashMap(this.f74100e.f74095a));
    }
}
