package p000;

import android.database.Cursor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: azcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcb {

    /* renamed from: a */
    public final azca f98951a;

    /* renamed from: b */
    public final Integer f98952b;

    /* renamed from: c */
    public final Integer f98953c;

    /* renamed from: d */
    public final Integer f98954d;

    /* renamed from: e */
    public final Integer f98955e;

    /* renamed from: f */
    public final Integer f98956f;

    /* renamed from: g */
    public final Integer f98957g;

    /* renamed from: h */
    public final Integer f98958h;

    public azcb(azca azca) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        this.f98951a = azca;
        cbhr cbhr = azca.f98949j;
        Integer num6 = null;
        this.f98952b = cbhr != null ? azpi.m86086d(cbhr.f177169a) : null;
        cbhr cbhr2 = this.f98951a.f98949j;
        if (cbhr2 != null) {
            num = azpi.m86086d(cbhr2.f177170b);
        } else {
            num = null;
        }
        this.f98953c = num;
        cbhr cbhr3 = this.f98951a.f98949j;
        if (cbhr3 != null) {
            num2 = azpi.m86086d(cbhr3.f177171c);
        } else {
            num2 = null;
        }
        this.f98954d = num2;
        cbhr cbhr4 = this.f98951a.f98949j;
        if (cbhr4 != null) {
            num3 = azpi.m86086d(cbhr4.f177172d);
        } else {
            num3 = null;
        }
        this.f98955e = num3;
        cbhr cbhr5 = this.f98951a.f98949j;
        if (cbhr5 != null) {
            num4 = azpi.m86086d(cbhr5.f177174f);
        } else {
            num4 = null;
        }
        this.f98956f = num4;
        cbhr cbhr6 = this.f98951a.f98949j;
        if (cbhr6 != null) {
            num5 = azpi.m86086d(cbhr6.f177175g);
        } else {
            num5 = null;
        }
        this.f98957g = num5;
        cbhr cbhr7 = this.f98951a.f98949j;
        this.f98958h = cbhr7 != null ? azpi.m86086d(cbhr7.f177176h) : num6;
    }

    /* renamed from: a */
    public static azcb m85239a(Cursor cursor) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        Boolean bool;
        cbht cbht;
        cbhr cbhr;
        cbhp cbhp;
        Cursor cursor2 = cursor;
        boolean z = true;
        bmxy.m108588a(cursor.getColumnCount() == azcc.f98959a.length);
        int columnIndex = cursor2.getColumnIndex("_id");
        if (columnIndex != -1) {
            cursor2.getLong(columnIndex);
        }
        int columnIndex2 = cursor2.getColumnIndex("sid");
        if (columnIndex2 != -1) {
            str = cursor2.getString(columnIndex2);
        } else {
            str = null;
        }
        int columnIndex3 = cursor2.getColumnIndex("pid");
        if (columnIndex3 != -1) {
            str2 = cursor2.getString(columnIndex3);
        } else {
            str2 = null;
        }
        int columnIndex4 = cursor2.getColumnIndex("name");
        if (columnIndex4 != -1) {
            str3 = cursor2.getString(columnIndex4);
        } else {
            str3 = null;
        }
        int columnIndex5 = cursor2.getColumnIndex("icon");
        if (columnIndex5 != -1) {
            bArr = cursor2.getBlob(columnIndex5);
        } else {
            bArr = null;
        }
        int columnIndex6 = cursor2.getColumnIndex("nicon");
        if (columnIndex6 != -1) {
            cursor2.getBlob(columnIndex6);
        }
        int columnIndex7 = cursor2.getColumnIndex("nicon");
        if (columnIndex7 != -1) {
            cursor2.getString(columnIndex7);
        }
        int columnIndex8 = cursor2.getColumnIndex("install_url");
        if (columnIndex8 != -1) {
            str4 = cursor2.getString(columnIndex8);
        } else {
            str4 = null;
        }
        int columnIndex9 = cursor2.getColumnIndex("blocked");
        if (columnIndex9 != -1) {
            if (cursor2.getInt(columnIndex9) <= 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        int columnIndex10 = cursor2.getColumnIndex("first_time_notification_clicked");
        Long valueOf = columnIndex10 != -1 ? Long.valueOf(cursor2.getLong(columnIndex10)) : null;
        int columnIndex11 = cursor2.getColumnIndex("first_time_reply_sent");
        Long valueOf2 = columnIndex11 != -1 ? Long.valueOf(cursor2.getLong(columnIndex11)) : null;
        int columnIndex12 = cursor2.getColumnIndex("last_conversation_install_clicked");
        if (columnIndex12 != -1) {
            cursor2.getString(columnIndex12);
        }
        int columnIndex13 = cursor2.getColumnIndex("status");
        if (columnIndex13 != -1) {
            cursor2.getInt(columnIndex13);
        }
        int columnIndex14 = cursor2.getColumnIndex("background_image");
        if (columnIndex14 != -1) {
            cursor2.getBlob(columnIndex14);
        }
        int columnIndex15 = cursor2.getColumnIndex("app_ui_config");
        if (columnIndex15 != -1) {
            cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), cursor2.getBlob(columnIndex15));
        } else {
            cbht = null;
        }
        int columnIndex16 = cursor2.getColumnIndex("app_theme");
        if (columnIndex16 != -1) {
            cbhr = (cbhr) azol.m85935a((bxxk) cbhr.f177167i.mo74142c(7), cursor2.getBlob(columnIndex16));
        } else {
            cbhr = null;
        }
        int columnIndex17 = cursor2.getColumnIndex("app_string_tag_mapping");
        if (columnIndex17 != -1) {
            cbhp = (cbhp) azol.m85935a((bxxk) cbhp.f177158b.mo74142c(7), cursor2.getBlob(columnIndex17));
        } else {
            cbhp = null;
        }
        return new azcb(new azca(str, str2, str3, bArr, str4, bool, valueOf, valueOf2, cbht, cbhr, cbhp));
    }

    /* renamed from: b */
    public final String mo54589b() {
        return this.f98951a.f98941b;
    }

    /* renamed from: c */
    public final String mo54590c() {
        return this.f98951a.f98942c;
    }

    /* renamed from: d */
    public final byte[] mo54591d() {
        return this.f98951a.f98943d;
    }

    /* renamed from: e */
    public final boolean mo54592e() {
        Boolean bool = this.f98951a.f98945f;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: f */
    public final long mo54593f() {
        Long l = this.f98951a.f98947h;
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    /* renamed from: g */
    public final Boolean mo54594g() {
        cbht cbht = this.f98951a.f98948i;
        boolean z = false;
        if (cbht != null && cbht.f177180b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public final Boolean mo54595h() {
        cbht cbht = this.f98951a.f98948i;
        boolean z = false;
        if (cbht != null && cbht.f177181c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: i */
    public final Map mo54596i() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        cbhp cbhp = this.f98951a.f98950k;
        if (cbhp == null) {
            return null;
        }
        bxwc bxwc = cbhp.f177160a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            cbhn cbhn = (cbhn) bxwc.get(i);
            int b = cbic.m127878b(cbhn.f177156a);
            if (b == 0) {
                b = 1;
            }
            concurrentHashMap.put(Integer.valueOf(cbic.m127877a(b)), Long.valueOf(cbhn.f177157b));
        }
        return concurrentHashMap;
    }

    /* renamed from: j */
    public final int mo54597j() {
        cbht cbht = this.f98951a.f98948i;
        if (cbht == null) {
            return 3;
        }
        int b = cbhs.m127867b(cbht.f177179a);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* renamed from: a */
    public final String mo54588a() {
        return this.f98951a.f98940a;
    }
}
