package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ambq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambq extends ambn {

    /* renamed from: o */
    public static final String[] f74669o = {"contact_id"};

    public ambq(Context context, amaw amaw, Bundle bundle) {
        super(context, amaw, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ambg mo41111a(ambm ambm, ambm ambm2, Cursor cursor) {
        sdo.m34959a(ambm);
        sdo.m34959a(cursor);
        anch anch = new anch();
        anch anch2 = new anch();
        HashMap hashMap = new HashMap();
        this.f74657e.mo41711a("people-map start");
        ambn.m62540a(ambm, hashMap);
        this.f74657e.mo41711a("people-map finish");
        ancu ancu = new ancu();
        ancg ancg = new ancg();
        HashMap hashMap2 = new HashMap();
        ambn.m62542b(ambm2, hashMap2);
        this.f74657e.mo41711a("contact-map start");
        ambn.m62541a(cursor, ancu, ancg, hashMap2);
        this.f74657e.mo41711a("contact-map finish");
        this.f74657e.mo41711a("merge start");
        ArrayList a = sqc.m35954a();
        ambm.f74651c = -1;
        while (ambm.mo41110a()) {
            int i = ambm.f74651c;
            String a2 = ambm.mo41109a("gaia_id");
            anch.mo41693a(i);
            a.add(a2);
            if (a2 == null || ancu.mo41712a(a2) == 0) {
                anch2.mo41696b();
            } else {
                anch2.mo41694a(ancu, a2);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) {
            int position = cursor.getPosition();
            int a3 = ancg.mo41689a(position);
            if (a3 == 0) {
                anch.mo41696b();
                anch2.mo41693a(position);
                a.add(null);
            } else {
                for (int i2 = 0; i2 < a3; i2++) {
                    String a4 = ancg.mo41690a(position, i2);
                    if (!hashMap.containsKey(a4)) {
                        anch.mo41696b();
                        anch2.mo41693a(position);
                        a.add(a4);
                    }
                }
            }
            ambi.m62535a(cursor);
        }
        this.f74657e.mo41711a("merge finish");
        return new ambg(ambm.f74649a, cursor, this.f74654b, anch.mo41691a(), anch, anch2, a, hashMap2, this.f74655c);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo41114b() {
        Cursor cursor;
        if (!ambn.f74652l) {
            ancr ancr = new ancr();
            ambi.m62534a(ancr, this.f74654b);
            ambi.m62533a(ancr);
            this.f74657e.mo41711a("lookup start");
            Cursor query = this.f74654b.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(null).appendQueryParameter("limit", Integer.toString(100)).build(), f74669o, "(data1 IS NOT NULL AND data1!='')", null, null);
            Cursor query2 = this.f74654b.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(null).appendQueryParameter("limit", Integer.toString(100)).build(), f74669o, "(data1 IS NOT NULL AND data1!='')", null, null);
            MergeCursor mergeCursor = new MergeCursor(new Cursor[]{new ambp(query), new ambp(query2)});
            try {
                int count = mergeCursor.getCount();
                this.f74657e.mo41711a("lookup finish");
                if (count != 0) {
                    ancr.mo41708b("contact_id IN (");
                    String str = "";
                    while (mergeCursor.moveToNext()) {
                        ancr.mo41707a(str);
                        ancr.mo41707a(Long.toString(mergeCursor.getLong(0)));
                        str = ",";
                    }
                    ancr.mo41707a(")");
                    mergeCursor.close();
                    cursor = this.f74654b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, ambi.f74632a, ancr.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
                } else {
                    mergeCursor.close();
                    return null;
                }
            } catch (Throwable th) {
                mergeCursor.close();
                throw th;
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            Uri build = ambh.f74631b.buildUpon().appendPath(null).appendQueryParameter("visible_contacts_only", "true").build();
            ancr ancr2 = new ancr();
            ancr2.mo41708b(ambi.m62532a());
            ancr2.mo41708b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.f74654b.getContentResolver().query(build, ambi.f74632a, ancr2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
