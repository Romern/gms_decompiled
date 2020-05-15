package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: xcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcm {

    /* renamed from: a */
    public static final bypv f51934a = bypx.m125085a("version");

    /* renamed from: b */
    public static final bypv f51935b = bypx.m125085a("irk");

    /* renamed from: c */
    public static final bypv f51936c = bypx.m125085a("lk");

    /* renamed from: d */
    public static final adcb f51937d = adca.m50151b(xck.f51928a);

    /* renamed from: e */
    public static final Logger f51938e = new Logger(new String[]{"KeySQLiteDataStore"}, (short[]) null);

    /* renamed from: f */
    private final xwt f51939f;

    public xcm(Context context) {
        this.f51939f = xwt.m43582a(context);
    }

    /* renamed from: a */
    public static KeyPair m42656a(byte[] bArr) {
        try {
            bnim bnim = bypx.m125087b(bArr).mo74447f().f167361a;
            byps a = bypx.m125083a(1);
            byps a2 = bypx.m125083a(2);
            if (!bnim.containsKey(a) || !bnim.containsKey(a2)) {
                adbd a3 = adbe.m50105a();
                a3.f61234c = 8;
                a3.f61232a = "Unable to decode the key pair.";
                throw a3.mo33301a();
            }
            KeyFactory instance = KeyFactory.getInstance("EC");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(((bypx) bnim.get(a2)).mo74445d().f167357a.getKey())), instance.generatePrivate(new PKCS8EncodedKeySpec(((bypx) bnim.get(a)).mo74445d().f167357a.getKey())));
        } catch (bypq | bypw | NoSuchAlgorithmException | InvalidKeySpecException e) {
            adbd a4 = adbe.m50105a();
            a4.f61234c = 8;
            a4.f61233b = e;
            a4.f61232a = "Unable to decode the key pair.";
            throw a4.mo33301a();
        }
    }

    /* renamed from: b */
    public final SQLiteDatabase mo29635b() {
        try {
            return adbc.m50103a(this.f51939f, "fido_embedded_security_key.db", true);
        } catch (SQLiteException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Failed to open the database.";
            throw a.mo33301a();
        }
    }

    /* renamed from: c */
    public final xcl mo29637c(String str) {
        bmxy.m108581a(str);
        Cursor query = this.f51939f.getReadableDatabase().query("registered_credentials", null, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                xcl xcl = new xcl(query);
                query.close();
                return xcl;
            }
            query.close();
            return null;
        } catch (ParseException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to parse the key data.";
            throw a.mo33301a();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final List mo29636b(String str) {
        bmxy.m108582a(str, "rpId cannot be null");
        f51938e.mo25412b("Returning list of keys registered by rpId", new Object[0]);
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.f51939f.getReadableDatabase();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("id LIKE '%");
        sb.append(str);
        sb.append("'");
        Cursor query = readableDatabase.query("registered_credentials", null, sb.toString(), null, null, null, null);
        try {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(new xcl(query));
                query.moveToNext();
            }
            query.close();
            return arrayList;
        } catch (ParseException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to parse the key data.";
            throw a.mo33301a();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static DateFormat m42657a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
    }

    /* renamed from: a */
    public final void mo29633a(String str) {
        bmxy.m108582a(str, "identifier cannot be null");
        f51938e.mo25412b("Deletes information of a registered key from SQLite database", new Object[0]);
        SQLiteDatabase b = mo29635b();
        b.beginTransaction();
        try {
            String[] strArr = {str};
            if (b.delete("registered_credentials", "id = ?", strArr) == 1) {
                b.delete("usages", "id = ?", strArr);
                b.setTransactionSuccessful();
                return;
            }
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61232a = "Error deleting key information from SQLite database";
            throw a.mo33301a();
        } finally {
            b.endTransaction();
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
    public final void mo29634a(String str, Date date, bmxv bmxv) {
        byte[] bArr;
        bmxy.m108582a(str, "registered key identifier cannot be null");
        bmxy.m108582a(date, "registrationTime cannot be null");
        f51938e.mo25412b("Adding a registered key information into SQLite database", new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("registration_time", m42657a().format(date));
        contentValues.put("counter", (Integer) 0);
        if (bmxv.mo66813a()) {
            KeyPair keyPair = (KeyPair) bmxv.mo66814b();
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new bypt(bypx.m125083a(1), bypx.m125082a(keyPair.getPrivate().getEncoded())));
                arrayList.add(new bypt(bypx.m125083a(2), bypx.m125082a(keyPair.getPublic().getEncoded())));
                bArr = bypx.m125086b(arrayList).mo74444c();
            } catch (bypm | bypr e) {
                adbd a = adbe.m50105a();
                a.f61234c = 8;
                a.f61233b = e;
                a.f61232a = "Unable to encode key pair.";
                throw a.mo33301a();
            }
        } else {
            bArr = null;
        }
        contentValues.put("key_data", bArr);
        if (mo29635b().insert("registered_credentials", null, contentValues) == -1) {
            adbd a2 = adbe.m50105a();
            a2.f61234c = 8;
            a2.f61232a = "Error storing key information into SQLite database";
            throw a2.mo33301a();
        }
    }
}
