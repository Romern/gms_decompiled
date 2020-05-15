package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: altt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altt {

    /* renamed from: a */
    private final ContentValues f74259a = new ContentValues();

    /* renamed from: a */
    private final ContentValues m61842a() {
        this.f74259a.clear();
        return this.f74259a;
    }

    /* renamed from: a */
    private final void m61843a(alto alto, long j, long j2, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            ContentValues a = m61842a();
            a.put("owner_id", Long.valueOf(j));
            a.put("item_id", Long.valueOf(j2));
            m61844a(alto, a, str, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    static final void m61844a(alto alto, ContentValues contentValues, String str, int i) {
        contentValues.put("is_normalized", (Integer) 1);
        contentValues.put("kind", Integer.valueOf(i));
        String[] a = altv.m61849a(str);
        for (String str2 : a) {
            contentValues.put("value", altv.m61851c(str2));
            alto.mo40742a("ac_index", contentValues);
            if (altv.f74261c.matcher(str2).find()) {
                String[] b = altv.m61850b(str2);
                for (int i2 = 1; i2 < b.length; i2++) {
                    contentValues.put("value", alts.m61839a(b[i2]));
                    alto.mo40742a("ac_index", contentValues);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo40775a(alto alto, long j) {
        alto alto2 = alto;
        alto.mo40754e();
        Cursor a = alto2.mo40744a("SELECT p.owner_id,i._id,i.item_type,i.value,i.value2,c.nickname,c.given_name,c.family_name,c.middle_name,c.honorific_prefix,c.honorific_suffix,c.yomi_given_name,c.yomi_family_name,c.yomi_honorific_prefix,c.yomi_honorific_suffix FROM ac_people AS p JOIN ac_container AS c ON p._id=c.people_id JOIN ac_item AS i ON c._id=i.container_id WHERE (p._id = ?1)", new String[]{String.valueOf(j)});
        try {
            int columnCount = a.getColumnCount() - 1;
            while (a.moveToNext()) {
                long j2 = (long) a.getInt(0);
                int i = a.getInt(1);
                int i2 = a.getInt(2);
                if (i2 == 0) {
                    long j3 = (long) i;
                    long j4 = j3;
                    m61843a(alto, j2, j3, a.getString(5), 40);
                    int i3 = 6;
                    while (i3 <= columnCount) {
                        int i4 = i3;
                        m61843a(alto, j2, j4, a.getString(i3), 20);
                        i3 = i4 + 1;
                    }
                } else if (i2 == 1) {
                    long j5 = (long) i;
                    String string = a.getString(3);
                    if (!TextUtils.isEmpty(string)) {
                        ContentValues a2 = m61842a();
                        a2.put("owner_id", Long.valueOf(j2));
                        a2.put("item_id", Long.valueOf(j5));
                        a2.put("is_normalized", (Integer) 0);
                        a2.put("kind", (Integer) 0);
                        a2.put("value", string);
                        alto2.mo40742a("ac_index", a2);
                        amig.m62939a();
                        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83272aB()).booleanValue()) {
                            int indexOf = string.indexOf("@");
                            if (indexOf != -1) {
                                string = string.substring(0, indexOf);
                            }
                            m61844a(alto2, a2, string, 1);
                        } else {
                            m61844a(alto2, a2, string, 1);
                        }
                    }
                }
            }
        } finally {
            a.close();
        }
    }
}
