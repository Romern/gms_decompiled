package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdb {

    /* renamed from: a */
    public String f99027a;

    /* renamed from: b */
    public String f99028b;

    /* renamed from: c */
    public int f99029c;

    /* renamed from: d */
    public long f99030d;

    /* renamed from: e */
    public long f99031e;

    /* renamed from: f */
    public byte[] f99032f;

    /* renamed from: g */
    public String f99033g;

    /* renamed from: h */
    public String f99034h;

    /* renamed from: i */
    public long f99035i;

    /* renamed from: j */
    public String f99036j;

    /* renamed from: k */
    public int f99037k = 0;

    /* renamed from: l */
    public byte[] f99038l;

    /* renamed from: m */
    public int f99039m;

    /* renamed from: n */
    public byte[] f99040n;

    /* renamed from: o */
    private long f99041o = -1;

    /* renamed from: p */
    private String f99042p;

    /* renamed from: q */
    private String f99043q;

    /* renamed from: a */
    public static azdb m85385a(Cursor cursor) {
        String str;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("entity_id"));
        int a = LocalEntityId.m94546a(cursor.getInt(cursor.getColumnIndexOrThrow("entity_type")));
        if (a != 3 || !cfeo.m138895z().equals(string) || TextUtils.isEmpty(cfeo.m138844A())) {
            str = cursor.getString(cursor.getColumnIndexOrThrow("profile_name"));
        } else {
            str = cfeo.m138844A();
        }
        azdb azdb = new azdb();
        azdb.f99041o = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        azdb.f99027a = cursor.getString(cursor.getColumnIndexOrThrow("message_id"));
        azdb.f99028b = string;
        azdb.f99029c = a;
        azdb.f99042p = cursor.getString(cursor.getColumnIndexOrThrow("display_id"));
        azdb.f99030d = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp_ms"));
        azdb.f99043q = str;
        azdb.f99031e = cursor.getLong(cursor.getColumnIndexOrThrow("sender_profile_id"));
        azdb.f99032f = cursor.getBlob(cursor.getColumnIndexOrThrow("content"));
        azdb.f99033g = cursor.getString(cursor.getColumnIndexOrThrow("content_type"));
        azdb.f99034h = cursor.getString(cursor.getColumnIndexOrThrow("message_type"));
        azdb.f99035i = cursor.getLong(cursor.getColumnIndexOrThrow("server_timestamp_ms"));
        azdb.f99036j = cursor.getString(cursor.getColumnIndexOrThrow("conversation_id"));
        azdb.f99037k = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        azdb.f99040n = cursor.getBlob(cursor.getColumnIndexOrThrow("message_properties"));
        return azdb;
    }

    /* renamed from: a */
    public final azdd mo54711a() {
        return new azdd(this.f99041o, this.f99027a, this.f99028b, this.f99029c, this.f99042p, this.f99031e, this.f99030d, this.f99032f, this.f99033g, this.f99034h, this.f99035i, this.f99036j, this.f99037k, this.f99043q, this.f99038l, this.f99039m, this.f99040n);
    }
}
