package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ambo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambo extends ambn {

    /* renamed from: o */
    private static final String[] f74667o = {"contact_id"};

    public ambo(Context context, amaw amaw, Bundle bundle) {
        super(context, amaw, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ambg mo41111a(ambm ambm, ambm ambm2, Cursor cursor) {
        String str;
        String str2;
        ambm ambm3 = ambm;
        Cursor cursor2 = cursor;
        sdo.m34959a(ambm);
        sdo.m34959a(cursor);
        anch anch = new anch();
        anch anch2 = new anch();
        HashMap hashMap = new HashMap();
        this.f74657e.mo41711a("people-map start");
        ambn.m62540a(ambm3, hashMap);
        this.f74657e.mo41711a("people-map finish");
        ancu ancu = new ancu();
        ancg ancg = new ancg();
        HashMap hashMap2 = new HashMap();
        ambn.m62542b(ambm2, hashMap2);
        this.f74657e.mo41711a("contact-map start");
        ambn.m62541a(cursor2, ancu, ancg, hashMap2);
        this.f74657e.mo41711a("contact-map finish");
        this.f74657e.mo41711a("merge start");
        ambm3.f74651c = 0;
        cursor2.moveToPosition(0);
        ArrayList a = sqc.m35954a();
        while (true) {
            int i = 1;
            boolean z = !(ambm3.f74651c >= ambm3.f74650b);
            boolean z2 = !cursor.isAfterLast();
            if (!z && !z2) {
                this.f74657e.mo41711a("merge finish");
                return new ambg(ambm3.f74649a, cursor, this.f74654b, anch.mo41691a(), anch, anch2, a, hashMap2, this.f74655c);
            }
            if (z) {
                str = ambm3.mo41109a("name");
            } else {
                str = null;
            }
            if (z2) {
                str2 = cursor2.getString(1);
            } else {
                str2 = null;
            }
            if (!z || !z2) {
                if (z) {
                    i = -1;
                }
            } else if (TextUtils.isEmpty(str)) {
                i = TextUtils.isEmpty(str2) ? 0 : -1;
            } else if (!TextUtils.isEmpty(str2)) {
                i = this.f74664m.compare(str, str2);
            }
            if (i <= 0) {
                int i2 = ambm3.f74651c;
                String a2 = ambm3.mo41109a("gaia_id");
                anch.mo41693a(i2);
                a.add(a2);
                if (a2 == null || ancu.mo41712a(a2) == 0) {
                    anch2.mo41696b();
                } else {
                    anch2.mo41694a(ancu, a2);
                }
                ambm.mo41110a();
            }
            if (i >= 0) {
                int position = cursor.getPosition();
                int a3 = ancg.mo41689a(position);
                if (a3 == 0) {
                    anch.mo41696b();
                    anch2.mo41693a(position);
                    a.add(null);
                } else {
                    for (int i3 = 0; i3 < a3; i3++) {
                        String a4 = ancg.mo41690a(position, i3);
                        if (!hashMap.containsKey(a4)) {
                            anch.mo41696b();
                            anch2.mo41693a(position);
                            a.add(a4);
                        }
                    }
                }
                ambi.m62535a(cursor);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo41114b() {
        String str;
        Cursor cursor;
        if (this.f74656d) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact_id IN(");
            ContentResolver contentResolver = this.f74654b.getContentResolver();
            Uri uri = ContactsContract.Data.CONTENT_URI;
            String[] strArr = f74667o;
            sdo.m34970a(this.f74656d);
            DataHolder dataHolder = this.f74661i;
            sdo.m34959a(dataHolder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data1 IN(");
            ambm ambm = new ambm(dataHolder);
            boolean z = true;
            boolean z2 = true;
            while (ambm.mo41110a()) {
                if (!z2) {
                    sb2.append(",");
                }
                DatabaseUtils.appendEscapedSQLString(sb2, ambm.mo41109a("value"));
                z2 = false;
            }
            sb2.append(")");
            Cursor query = contentResolver.query(uri, strArr, sb2.toString(), null, null);
            if (query == null) {
                str = null;
            } else {
                while (query.moveToNext()) {
                    try {
                        if (!z) {
                            sb.append(",");
                        }
                        sb.append(query.getLong(0));
                        z = false;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                sb.append(")");
                query.close();
                str = sb.toString();
            }
        } else {
            str = "";
        }
        if (str == null) {
            return null;
        }
        if (ambn.f74652l) {
            int i = Build.VERSION.SDK_INT;
            Uri build = ambh.f74630a.buildUpon().appendQueryParameter("visible_contacts_only", "true").build();
            ancr ancr = new ancr();
            ancr.mo41708b(ambi.m62532a());
            ancr.mo41708b(str);
            ancr.mo41708b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.f74654b.getContentResolver().query(build, ambi.f74632a, ancr.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        } else {
            ancr ancr2 = new ancr();
            ambi.m62534a(ancr2, this.f74654b);
            ambi.m62533a(ancr2);
            ancr2.mo41708b(str);
            ancr2.mo41708b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.f74654b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, ambi.f74632a, ancr2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
