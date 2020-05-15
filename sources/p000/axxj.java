package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import java.util.Map;

/* renamed from: axxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxj {
    /* renamed from: a */
    public static axos m83471a(axxv axxv, String str, String str2) {
        axxi b = m83476b(axxv, str, str2);
        if (b != null) {
            return axos.m82822a(b.f96647b.f96642d);
        }
        return null;
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
    /* renamed from: b */
    static ContentValues m83475b(axxi axxi) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sourceNode", axxi.f96650e);
        contentValues.put("seqId", Long.valueOf(axxi.f96651f));
        contentValues.put("v1SourceNode", axxi.f96650e);
        contentValues.put("v1SeqId", Long.valueOf(axxi.f96652g));
        contentValues.put("timestampMs", Long.valueOf(axxi.f96653h));
        if (!axxi.f96648c) {
            contentValues.put("deleted", (Integer) 0);
            contentValues.put("data", axxi.f96647b.f96642d);
        } else {
            contentValues.put("deleted", (Integer) 1);
            contentValues.putNull("data");
        }
        contentValues.put("assetsPresent", Integer.valueOf(axxi.f96649d ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public static axxi m83472a(Cursor cursor) {
        boolean z;
        boolean z2 = true;
        axxi axxi = new axxi(axue.m83239a(cursor.getString(1), cursor.getString(2)));
        axxi.f96650e = cursor.getString(7);
        axxi.f96651f = cursor.getLong(5);
        axxi.f96652g = cursor.getLong(14);
        axxi.f96653h = cursor.getLong(9);
        if (cursor.getInt(6) != 0) {
            z = true;
        } else {
            z = false;
        }
        axxi.f96648c = z;
        if (cursor.getLong(10) == 0) {
            z2 = false;
        }
        axxi.f96649d = z2;
        axxi.f96647b = new axxf(cursor.getString(3), cursor.getString(4));
        if (!axxi.f96648c) {
            axxi.f96647b.f96642d = cursor.getBlob(8);
        }
        String b = m83477b(cursor);
        String string = cursor.getString(11);
        if (string != null) {
            while (b.equals(m83477b(cursor))) {
                String string2 = cursor.getString(12);
                if (!axxi.f96648c) {
                    axxi.f96647b.mo53711a(string, axuh.m83243a(string2));
                }
                if (!cursor.moveToNext()) {
                    break;
                }
                string = cursor.getString(11);
            }
        } else {
            cursor.moveToNext();
        }
        return axxi;
    }

    /* renamed from: b */
    public static axxi m83476b(axxv axxv, String str, String str2) {
        Cursor a = axxv.mo53726a(ayha.f97559a, new Uri.Builder().scheme("wear").authority(str).path(str2).build());
        try {
            a.moveToFirst();
            if (!a.isAfterLast()) {
                return m83472a(a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    static String m83477b(Cursor cursor) {
        return cursor.getString(0);
    }

    /* renamed from: a */
    public static DataItemParcelable m83473a(axxi axxi) {
        DataItemParcelable dataItemParcelable = new DataItemParcelable(axxi.f96647b.f96641c);
        axxf axxf = axxi.f96647b;
        dataItemParcelable.f110916c = axxf.f96642d;
        for (Map.Entry entry : axxf.mo53710a().entrySet()) {
            String str = (String) entry.getKey();
            dataItemParcelable.f110915b.put(str, new axqv(((axuh) entry.getValue()).f96387b, str));
        }
        return dataItemParcelable;
    }

    /* renamed from: a */
    public static void m83474a(axxv axxv, String str, String str2, axos axos) {
        axxf axxf = new axxf(str, str2);
        axxf.f96642d = axos.mo53333a();
        axxv.mo53728a(ayha.f97559a, axxf);
    }
}
