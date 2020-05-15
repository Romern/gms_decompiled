package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdi {

    /* renamed from: a */
    public final long f99075a;

    /* renamed from: b */
    public final String f99076b;

    /* renamed from: c */
    public final int f99077c;

    /* renamed from: d */
    public final String f99078d;

    /* renamed from: e */
    public final String f99079e;

    /* renamed from: f */
    public final String f99080f;

    /* renamed from: g */
    public final long f99081g;

    /* renamed from: h */
    final int f99082h;

    /* renamed from: i */
    public final cbgn f99083i;

    public azdi(long j, String str, int i, String str2, String str3, String str4, long j2, int i2, byte[] bArr) {
        this.f99075a = j;
        this.f99076b = str;
        this.f99077c = i;
        this.f99078d = str2;
        this.f99079e = str3;
        this.f99080f = str4;
        this.f99081g = j2;
        this.f99082h = i2;
        this.f99083i = bArr != null ? (cbgn) azol.m85935a((bxxk) cbgn.f177050e.mo74142c(7), bArr) : null;
    }

    /* renamed from: a */
    public static azdi m85395a(Cursor cursor) {
        String str;
        Cursor cursor2 = cursor;
        if (!cursor.moveToFirst()) {
            azoj.m85933c("ProfileData", "Empty cursor for profile", new Object[0]);
            return null;
        }
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("entity_id"));
        int a = LocalEntityId.m94546a(cursor2.getInt(cursor2.getColumnIndexOrThrow("entity_type")));
        if (a != 3 || !TextUtils.equals(cfeo.m138895z(), string) || TextUtils.isEmpty(cfeo.m138844A())) {
            str = cursor2.getString(cursor2.getColumnIndexOrThrow("profile_name"));
        } else {
            str = cfeo.m138844A();
        }
        azdg azdg = new azdg();
        azdg.f99065a = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
        azdg.f99068d = cursor2.getString(cursor2.getColumnIndexOrThrow("app_id"));
        azdg.f99066b = string;
        azdg.f99067c = a;
        azdg.f99069e = cursor2.getString(cursor2.getColumnIndexOrThrow("display_id"));
        azdg.f99070f = str;
        azdg.f99072h = cursor2.getInt(cursor2.getColumnIndex("status"));
        cursor2.getInt(cursor2.getColumnIndex("blocked"));
        azdg.f99071g = cursor2.getLong(cursor2.getColumnIndex("last_sync_timestamp"));
        azdg.f99073i = cursor2.getBlob(cursor2.getColumnIndexOrThrow("data"));
        return new azdi(azdg.f99065a, azdg.f99066b, azdg.f99067c, azdg.f99068d, azdg.f99069e, azdg.f99070f, azdg.f99071g, azdg.f99072h, azdg.f99073i);
    }

    /* renamed from: a */
    public final long mo54715a() {
        return (long) this.f99082h;
    }
}
