package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aluj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluj {
    /* renamed from: a */
    public static void m61897a(Context context, String str, Account account, String str2) {
        m61899a(context, str, account != null ? account.name : null, str2);
    }

    /* renamed from: b */
    public static void m61904b(Context context, String str, String str2) {
        m61899a(context, str, (String) null, str2);
    }

    /* renamed from: a */
    public static void m61898a(Context context, String str, String str2) {
        m61903a(context, str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m61899a(Context context, String str, String str2, String str3) {
        m61902a(context, str, str2, str3, (Throwable) null);
    }

    /* renamed from: a */
    public static void m61900a(Context context, String str, String str2, String str3, String str4) {
        m61901a(context, str, str2, str3, str4, null);
    }

    /* renamed from: a */
    public static void m61901a(Context context, String str, String str2, String str3, String str4, Throwable th) {
        String str5;
        ContentValues contentValues;
        ContentValues contentValues2;
        String str6;
        String str7;
        String str8;
        if (th != null) {
            try {
                String stackTraceString = Log.getStackTraceString(th);
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(stackTraceString).length());
                sb.append(str4);
                sb.append("\n");
                sb.append(stackTraceString);
                str5 = sb.toString();
            } catch (RuntimeException e) {
                Log.w("PeopleLog", "Unable to write log", e);
                return;
            }
        } else {
            str5 = str4;
        }
        aluo a = aluo.m61909a(context);
        int cg = (int) cgbe.f186279a.mo6606a().mo83409cg();
        int myPid = Process.myPid();
        int myTid = Process.myTid();
        SQLiteDatabase a2 = a.mo40801a();
        if (a2 != null) {
            ContentValues contentValues3 = a.f74316c;
            synchronized (contentValues3) {
                int i = cg - 1;
                try {
                    int longForQuery = (int) DatabaseUtils.longForQuery(a2, "SELECT count(1) FROM logs", null);
                    if (longForQuery > i) {
                        if (longForQuery > 0) {
                            a2.execSQL("DELETE FROM logs WHERE timestamp = (SELECT MIN(timestamp) FROM logs)");
                        }
                    }
                    if (cgbe.f186279a.mo6606a().mo83460n()) {
                        alul alul = new alul(str2, str3, myPid, str5);
                        aluk aluk = a.f74317d;
                        Iterator it = aluk.f74305a.entrySet().iterator();
                        long a3 = aluk.f74306b.mo20505a();
                        while (it.hasNext()) {
                            contentValues = contentValues3;
                            try {
                                if (((alum) ((Map.Entry) it.next()).getValue()).f74311a < a3 - cgbe.f186279a.mo6606a().mo83254K()) {
                                    it.remove();
                                    contentValues3 = contentValues;
                                } else {
                                    contentValues3 = contentValues;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        contentValues2 = contentValues3;
                        if (!aluk.f74305a.containsKey(alul)) {
                            long a4 = a.f74314a.mo20505a();
                            a.mo40802a(a2, str2, str3, myPid, str5, a4, myTid, str);
                            a.f74317d.mo40796a(alul, new alum(a4, 1));
                        } else {
                            alum alum = (alum) a.f74317d.f74305a.get(alul);
                            if (alul.f74307a != null) {
                                str6 = "=?";
                            } else {
                                str6 = " IS NULL";
                            }
                            if (alul.f74308b != null) {
                                str7 = "=?";
                            } else {
                                str7 = " IS NULL";
                            }
                            if (alul.f74310d != null) {
                                str8 = "=?";
                            } else {
                                str8 = " IS NULL";
                            }
                            StringBuilder sb2 = new StringBuilder(str6.length() + 69 + str7.length() + str8.length());
                            sb2.append("process_id=? AND timestamp=? AND account_name");
                            sb2.append(str6);
                            sb2.append(" AND page_id");
                            sb2.append(str7);
                            sb2.append(" AND message");
                            sb2.append(str8);
                            String sb3 = sb2.toString();
                            long j = alum.f74311a;
                            int i2 = alum.f74312b;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.toString(alul.f74309c));
                            arrayList.add(Long.toString(j));
                            String str9 = alul.f74307a;
                            if (str9 != null) {
                                arrayList.add(str9);
                            }
                            String str10 = alul.f74308b;
                            if (str10 != null) {
                                arrayList.add(str10);
                            }
                            if (alul.f74310d != null) {
                                arrayList.add(alul.mo40797a(i2));
                            }
                            alum alum2 = new alum(a.f74314a.mo20505a(), alum.f74312b + 1);
                            a.f74317d.mo40796a(alul, alum2);
                            a.f74316c.clear();
                            String a5 = alul.mo40797a(alum2.f74312b);
                            a.f74316c.put("message", a5);
                            a.f74316c.put("timestamp", Long.valueOf(alum2.f74311a));
                            int update = a2.update("logs", a.f74316c, sb3, (String[]) arrayList.toArray(ancm.f76631b));
                            if (update != 1) {
                                amdk.m62658a("PeopleLog", "Updated %d rows to timestamp=%d, message=%s", Integer.valueOf(update), Long.valueOf(alum2.f74311a), a5);
                            }
                        }
                    } else {
                        contentValues2 = contentValues3;
                        a.mo40802a(a2, str2, str3, myPid, str5, a.f74314a.mo20505a(), myTid, str);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contentValues = contentValues3;
                    throw th;
                }
            }
        }
        long cf = cgbe.f186279a.mo6606a().mo83408cf() * 86400000;
        SQLiteDatabase a6 = a.mo40801a();
        if (a6 != null) {
            a6.execSQL("DELETE FROM logs WHERE timestamp<?;", new String[]{Long.toString(a.f74314a.mo20505a() - cf)});
        }
    }

    /* renamed from: a */
    public static void m61902a(Context context, String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2)) {
            Log.i(str, str3);
        }
        m61901a(context, str, str2, null, str3, th);
    }

    /* renamed from: a */
    public static void m61903a(Context context, String str, String str2, Throwable th) {
        m61901a(context, str, null, null, str2, th);
    }
}
