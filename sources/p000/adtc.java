package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: adtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtc extends srp {

    /* renamed from: a */
    public static final String[] f62692a = {"_id", "msg_type", "date"};

    /* renamed from: b */
    public static final String[] f62693b = {"_id", "msg_type"};

    /* renamed from: e */
    private static adtc f62694e;

    /* renamed from: c */
    public final Context f62695c;

    /* renamed from: d */
    public final brhj f62696d;

    /* renamed from: a */
    public static synchronized adtc m51167a(Context context) {
        adtc adtc;
        synchronized (adtc.class) {
            if (f62694e == null) {
                f62694e = new adtc(context, "ipa_mmssms.db", brhj.m114016a(context));
            }
            adtc = f62694e;
        }
        return adtc;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        adnt.m50869a("Upgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != i2) {
            onCreate(sQLiteDatabase);
            adta.m51158g(this.f62695c);
        }
    }

    public adtc(Context context, String str, brhj brhj) {
        super(context, str, str, 3);
        this.f62695c = context;
        this.f62696d = brhj;
    }

    /* renamed from: a */
    public static String m51168a(String str, Integer num) {
        String str2;
        if (!"sms".equals(str)) {
            str2 = "content://mms/";
        } else {
            str2 = "content://sms/";
        }
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
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
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a3  */
    /* renamed from: a */
    public final int mo33800a(List list, String str, adtg adtg) {
        int i;
        adsl adsl;
        adno adno;
        int i2;
        int i3;
        adno adno2;
        Integer num;
        String str2;
        String str3;
        Throwable th;
        String str4 = str;
        adtg adtg2 = adtg;
        SQLiteDatabase a = mo33802a();
        if (a == null) {
            adnt.m50871b("Got null db in SmsCorpusDbOpenHelper.updateReadStatus");
            return 0;
        }
        a.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            int i4 = 1;
            contentValues.put("read", (Integer) 1);
            Iterator it = list.iterator();
            int i5 = 0;
            while (true) {
                i = 2;
                if (!it.hasNext()) {
                    break;
                }
                i5 += a.update("mmssms", contentValues, "_id=? AND msg_type=?", new String[]{String.valueOf((Integer) it.next()), str4});
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            Object[] objArr = {Integer.valueOf(i5), str4, Boolean.valueOf(ceqm.m137879j())};
            if (ceqm.m137879j()) {
                adsl = new adsl(this.f62696d, 8, (int) ceqm.m137886q());
            } else {
                adsl = new adsn(this.f62696d, 8, (int) ceqm.m137886q());
            }
            int size = list.size();
            int i6 = 0;
            while (i6 < size) {
                Integer num2 = (Integer) list.get(i6);
                brhy brhy = null;
                if (!ceqm.m137879j()) {
                    adsr a2 = "sms".equals(str4) ? adtg2.mo33805a(num2.intValue()) : adtg2.mo33809b(num2.intValue());
                    if (a2 != null) {
                        brhy = a2.mo33784a(a);
                        i2 = i6;
                        i3 = size;
                        adno = adsl;
                    } else {
                        i2 = i6;
                        i3 = size;
                        adno = adsl;
                    }
                } else {
                    String[] strArr = new String[i4];
                    strArr[0] = "msg_box";
                    String[] strArr2 = new String[i];
                    strArr2[0] = String.valueOf(num2);
                    strArr2[i4] = str4;
                    String str5 = "sms";
                    i2 = i6;
                    i3 = size;
                    adno = adsl;
                    Cursor query = a.query("mmssms", strArr, "_id=? AND msg_type=?", strArr2, null, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToNext()) {
                                num = sra.m36061a(query, 0, (Integer) null);
                                query.close();
                                if (num == null) {
                                    String[] strArr3 = new String[2];
                                    strArr3[0] = "read";
                                    if (!adsr.m51115a(num, str4)) {
                                        str2 = "sent";
                                    } else {
                                        str2 = "inbox";
                                    }
                                    strArr3[1] = str2;
                                    if (str5.equals(str4)) {
                                        String valueOf = String.valueOf(num2);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                                        sb.append("content://sms/");
                                        sb.append(valueOf);
                                        str3 = sb.toString();
                                    } else {
                                        String valueOf2 = String.valueOf(num2);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                                        sb2.append("content://mms/");
                                        sb2.append(valueOf2);
                                        str3 = sb2.toString();
                                    }
                                    bric a3 = brid.m114045a();
                                    a3.mo69557b(str3);
                                    a3.mo69556a(strArr3);
                                    brhy = a3.mo69547a();
                                } else {
                                    brhy = null;
                                }
                            }
                        } catch (Throwable th2) {
                            bqye.m113761a(th, th2);
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    num = null;
                    if (num == null) {
                    }
                }
                if (brhy == null) {
                    adno2 = adno;
                } else {
                    adno2 = adno;
                    adno2.mo33683a(brhy);
                }
                i6 = i2 + 1;
                adsl = adno2;
                size = i3;
                i = 2;
                i4 = 1;
            }
            adsl.mo33684b();
            return i5;
        } catch (Throwable th3) {
            a.endTransaction();
            throw th3;
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final adtb mo33801a(String str, Iterator it) {
        long j;
        long j2;
        String str2 = str;
        SQLiteDatabase a = mo33802a();
        if (a == null) {
            adnt.m50872b("Got null db SmsCorpusDbOpenHelper.processNewMessages for %s", str2);
            return new adtb(0, null);
        }
        adsn adsn = new adsn(this.f62696d, 7, (int) ceqm.m137886q());
        C1240of ofVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            adsr adsr = (adsr) it.next();
            if (adsr != null) {
                a.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    sra.m36064a(contentValues, "_id", Integer.valueOf(adsr.mo33760a()));
                    sra.m36065a(contentValues, "msg_type", adsr.mo33761b());
                    sra.m36064a(contentValues, "msg_box", adsr.mo33763d());
                    if (!"sms".equals(adsr.mo33761b())) {
                        j = TimeUnit.MILLISECONDS.toSeconds(adsr.mo33766f());
                    } else {
                        j = adsr.mo33766f();
                    }
                    contentValues.put("date", Long.valueOf(j));
                    sra.m36064a(contentValues, "read", Integer.valueOf(adsr.mo33774m() ? 1 : 0));
                    sra.m36065a(contentValues, "phone_numbers", bmxr.m108544a(",").mo66874a((Iterable) adsr.mo33786p()));
                    a.insert("mmssms", null, contentValues);
                    if (!"sms".equals(str2)) {
                        j2 = TimeUnit.MILLISECONDS.toSeconds(adsr.mo33766f());
                    } else {
                        j2 = adsr.mo33766f();
                    }
                    if (!adsr.mo33774m()) {
                        i2++;
                    }
                    i++;
                    ofVar = new C1240of(Long.valueOf(j2), Integer.valueOf(adsr.mo33760a()));
                    a.setTransactionSuccessful();
                    adsn.mo33683a(adsr.mo33784a(a));
                    a.endTransaction();
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            }
        }
        adsn.mo33684b();
        Object[] objArr = {Integer.valueOf(i), str2, Integer.valueOf(i2)};
        return new adtb(i, ofVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteDatabase mo33802a() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        new Object[1][0] = "DROP TABLE IF EXISTS mmssms";
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms");
        new Object[1][0] = "CREATE TABLE mmssms(msg_type TEXT NOT NULL,_id INTEGER NOT NULL,msg_box INTEGER,date INTEGER NOT NULL,read INTEGER NOT NULL DEFAULT 0,phone_numbers TEXT,PRIMARY KEY(msg_type,_id) ON CONFLICT REPLACE)";
        sQLiteDatabase.execSQL("CREATE TABLE mmssms(msg_type TEXT NOT NULL,_id INTEGER NOT NULL,msg_box INTEGER,date INTEGER NOT NULL,read INTEGER NOT NULL DEFAULT 0,phone_numbers TEXT,PRIMARY KEY(msg_type,_id) ON CONFLICT REPLACE)");
        if (ceqm.m137881l()) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contact_annotation");
                sQLiteDatabase.execSQL("CREATE TABLE contact_annotation(phone_number TEXT NOT NULL,contact_name TEXT NOT NULL,PRIMARY KEY(phone_number,contact_name) ON CONFLICT REPLACE)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                new Object[1][0] = "contact_annotation";
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }
}
