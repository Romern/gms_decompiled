package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.Time;
import android.util.Log;
import java.io.PrintWriter;

/* renamed from: altr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altr {
    /* renamed from: a */
    private static String m61834a(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndex(str));
        return string == null ? "(null)" : string;
    }

    /* renamed from: b */
    private static long m61837b(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    /* renamed from: c */
    private static String m61838c(Cursor cursor, String str) {
        return m61837b(cursor, str) == 0 ? "false" : "true";
    }

    /* renamed from: a */
    private static String m61835a(Time time, long j) {
        time.set(j);
        return time.format("%Y-%m-%d %H:%M:%S");
    }

    /* renamed from: a */
    public static void m61836a(Context context, PrintWriter printWriter, String[] strArr) {
        Cursor rawQuery;
        String str;
        Cursor a;
        if (context != null) {
            try {
                printWriter.write(String.format("CP2 sync enabled=%s\n\n", Boolean.valueOf(alsj.m61651a(context).f74200a.getBoolean("cp2_sync_enabled", false))));
                printWriter.write(String.format("FSA2 sync enabled=%s\n\n", Boolean.valueOf(cgbt.m144707c())));
                printWriter.write(String.format("GAL2 enabled=%s\n\n", Boolean.valueOf(cgbt.m144706b())));
                Time time = new Time();
                alto b = altq.m61806a(context).mo40763b();
                if (b != null) {
                    a = b.mo40744a("SELECT * FROM owners ORDER BY account_name,page_gaia_id", (String[]) null);
                    a.moveToPosition(-1);
                    while (a.moveToNext()) {
                        printWriter.write(" Last sync status=");
                        printWriter.write(m61834a(a, "last_sync_status"));
                        printWriter.write(" start=");
                        printWriter.write(m61835a(time, m61837b(a, "last_sync_start_time")));
                        printWriter.write(" finish=");
                        printWriter.write(m61835a(time, m61837b(a, "last_sync_finish_time")));
                        printWriter.write(" successful sync=");
                        printWriter.write(m61835a(time, m61837b(a, "last_successful_sync_time")));
                        if ("(null)".equals(m61834a(a, "page_gaia_id"))) {
                            printWriter.write(",");
                            printWriter.write(" CP2 circle sync enabled=");
                            printWriter.write(m61838c(a, "sync_circles_to_contacts"));
                            printWriter.write(" CP2 evergreen sync enabled=");
                            printWriter.write(m61838c(a, "sync_evergreen_to_contacts"));
                            printWriter.write(" CP2 me sync enabled=");
                            printWriter.write(m61838c(a, "sync_me_to_contacts"));
                        }
                        printWriter.write("\n");
                    }
                    a.close();
                    printWriter.write("\n");
                }
            } catch (Exception e) {
                try {
                    String exc = e.toString();
                    String stackTraceString = Log.getStackTraceString(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(exc).length() + 27 + String.valueOf(stackTraceString).length());
                    sb.append("Error while dumping log: ");
                    sb.append(exc);
                    sb.append("\n");
                    sb.append(stackTraceString);
                    sb.append("\n");
                    printWriter.write(sb.toString());
                } catch (RuntimeException e2) {
                    String valueOf = String.valueOf(e2.toString());
                    printWriter.write(valueOf.length() == 0 ? new String("Can't dump log.  ") : "Can't dump log.  ".concat(valueOf));
                    return;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                a.close();
                throw th2;
            }
            printWriter.write("People log:\n");
            aluo a2 = aluo.m61909a(context);
            int i = 1000;
            if (strArr != null && strArr.length > 0) {
                try {
                    i = Math.max(10, Integer.parseInt(strArr[0]));
                } catch (RuntimeException e3) {
                }
            }
            Time time2 = new Time();
            SQLiteDatabase readableDatabase = a2.f74315b.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder(126);
                sb2.append("SELECT timestamp,process_id,thread_id,log_tag,account_name,page_id,message FROM logs ORDER BY timestamp DESC LIMIT ");
                sb2.append(i);
                rawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                rawQuery.moveToPosition(rawQuery.getCount());
                while (rawQuery.moveToPrevious()) {
                    time2.set(rawQuery.getLong(0));
                    Object[] objArr = new Object[7];
                    objArr[0] = time2.format("%Y-%m-%d %H:%M:%S");
                    objArr[1] = Integer.valueOf(rawQuery.getInt(1));
                    objArr[2] = Integer.valueOf(rawQuery.getInt(2));
                    objArr[3] = rawQuery.getString(3);
                    objArr[4] = rawQuery.getString(4);
                    objArr[5] = rawQuery.getString(5);
                    String string = rawQuery.getString(6);
                    if (string != null) {
                        String replace = string.replace("\"", "\"\"");
                        StringBuilder sb3 = new StringBuilder(String.valueOf(replace).length() + 2);
                        sb3.append("\"");
                        sb3.append(replace);
                        sb3.append("\"");
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    objArr[6] = str;
                    printWriter.write(String.format("%s,%d,%d,%s,%s,%s,%s\n", objArr));
                }
                rawQuery.close();
                return;
            }
            return;
        }
        printWriter.write("Can't obtain Context.");
    }
}
