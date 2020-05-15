package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: rui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rui extends sbi {

    /* renamed from: b */
    private static final String[] f43699b = {"com.google.android.gms", "com.google.android.gms:car", "com.google.android.gms.feedback", "com.google.android.gms.nearby.connection", "com.google.android.gms.persistent", "com.google.android.gms.room", "com.google.android.gms:snet", "com.google.android.gms.ui", "com.google.android.gms.wearable", "com.google.android.gms.unstable", "com.google.process.gapps", "com.google.process.location", "com.google.android.gms.learning"};

    /* renamed from: c */
    private final rvq f43700c;

    public rui(Context context, sba sba, rvq rvq) {
        super(context);
        sdo.checkIfNull(sba, "exceptionHandlerUtils cannot be null");
        sdo.checkIfNull(rvq, "fixerFramework can not be null");
        this.f43700c = rvq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        android.util.Log.w(r13, "Not shushing due to whitelist override.");
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0433 A[SYNTHETIC, Splitter:B:218:0x0433] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x052a A[SYNTHETIC, Splitter:B:263:0x052a] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x052f A[SYNTHETIC, Splitter:B:268:0x052f] */
    /* renamed from: a */
    public final boolean mo24988a(Thread thread, Throwable th) {
        Throwable th2;
        ruf ruf;
        String str;
        Throwable th3;
        RuntimeException runtimeException;
        String str2;
        SQLiteDatabase writableDatabase;
        long seconds;
        Throwable th4;
        StringBuilder sb;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Cursor cursor;
        rud rud;
        String str10;
        long j;
        long j2;
        long j3;
        long j4;
        rud rud2;
        int i;
        boolean z;
        SQLiteDatabase writableDatabase2;
        rud rud3;
        Throwable th5 = th;
        String str11 = "crash_count";
        String str12 = "crash_hash";
        String str13 = "latest_notification_time";
        String str14 = "latest_tme";
        String str15 = "start_time";
        String str16 = "Error closing database.";
        String str17 = "\n";
        String str18 = "DeviceDoctorHandler";
        try {
            if (th5 instanceof OutOfMemoryError) {
                if (cdkp.f181122a.mo6606a().mo77829p()) {
                    srj.m36117a();
                }
            }
        } catch (Throwable th6) {
            Log.e(str18, "Failed trying to dump open files.", th6);
        }
        if ((th5 instanceof Error) || !cdkp.f181122a.mo6606a().mo77817d()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            if (!apts.m70990a()) {
                th2 = th5;
                Log.w(str18, "Ignoring crash due to lack of permissions.", th2);
                Process.killProcess(Process.myPid());
                return true;
            }
            try {
                ruf ruf2 = new ruf();
                try {
                    sdo.checkIfNull(th5, "The throwable cannot be null.");
                    Log.i("DeviceDrDatabaseHelper", "Cleaning stale data from database!");
                    List e = ruf.m34471e();
                    int i3 = 0;
                    while (i3 < e.size()) {
                        String str19 = str11;
                        String str20 = str12;
                        String str21 = str13;
                        String str22 = str14;
                        String str23 = str15;
                        String str24 = str16;
                        String str25 = str17;
                        Throwable th7 = th5;
                        ((ruh) e.get(i3)).mo25171b(ruf2.getWritableDatabase());
                        i3++;
                        str16 = str24;
                        th5 = th7;
                        str11 = str19;
                        str12 = str20;
                        str13 = str21;
                        str14 = str22;
                        str15 = str23;
                        str17 = str25;
                    }
                    ruf.m34470d();
                    writableDatabase = ruf2.getWritableDatabase();
                    seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    Throwable cause = th.getCause();
                    th4 = th;
                    while (cause != null) {
                        str17 = str17;
                        th4 = cause;
                        str16 = str16;
                        str11 = str2;
                        str12 = str12;
                        str13 = str13;
                        str14 = str14;
                        str15 = str15;
                        cause = cause.getCause();
                        seconds = seconds;
                    }
                    sb = new StringBuilder();
                    str3 = str16;
                } catch (RuntimeException e2) {
                    e = e2;
                    str2 = str16;
                    ruf = ruf2;
                    try {
                        Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                        if (e instanceof SQLiteException) {
                        }
                    } catch (Throwable th8) {
                        th3 = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    str2 = str16;
                    th3 = th;
                    ruf = ruf2;
                    if (ruf != null) {
                    }
                    throw th3;
                }
                try {
                    sb.append(th4.getClass().getName());
                    sb.append(str17);
                    StackTraceElement[] stackTrace = th4.getStackTrace();
                    int length = stackTrace.length;
                    StackTraceElement[] stackTraceElementArr = stackTrace;
                    int i4 = 0;
                    while (i4 < length) {
                        long j5 = seconds;
                        String str26 = str2;
                        String str27 = str17;
                        String str28 = str3;
                        StackTraceElement stackTraceElement = stackTraceElementArr[i4];
                        if (sqx.m36055a(stackTraceElement.getClassName())) {
                            str7 = str12;
                            str6 = str13;
                            str5 = str14;
                            str4 = str15;
                            stackTraceElement = new StackTraceElement(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), "File", -1);
                        } else {
                            str7 = str12;
                            str6 = str13;
                            str5 = str14;
                            str4 = str15;
                        }
                        sb.append(stackTraceElement);
                        sb.append(str27);
                        i4++;
                        str17 = str27;
                        str3 = str28;
                        seconds = j5;
                        str2 = str26;
                        str12 = str7;
                        str13 = str6;
                        str14 = str5;
                        str15 = str4;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    str2 = str3;
                    ruf = ruf2;
                    Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                    if (e instanceof SQLiteException) {
                        throw e;
                    } else if (ruf == null) {
                        return false;
                    } else {
                        try {
                            ruf.close();
                            return false;
                        } catch (RuntimeException e4) {
                            runtimeException = e4;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str2 = str3;
                    th3 = th;
                    ruf = ruf2;
                    if (ruf != null) {
                        try {
                            ruf.close();
                        } catch (RuntimeException e5) {
                            Log.w(str18, str, e5);
                        }
                    }
                    throw th3;
                }
                try {
                    String a = srv.m36160a(spn.m35863a(sb.toString().getBytes(Charset.forName("UTF-8")), "SHA1"));
                    Throwable a2 = sqx.m36051a(th);
                    if (a2 != null) {
                        str9 = Log.getStackTraceString(a2);
                        int length2 = str9.length();
                        str8 = str17;
                        if (length2 > 16384) {
                            str9 = str9.substring(length2 - 16384);
                        }
                    } else {
                        str8 = str17;
                        str9 = "";
                    }
                    writableDatabase.beginTransaction();
                    try {
                        Cursor query = writableDatabase.query("crash_count", new String[]{"stack_trace", "count", str15, str14, "latest_error_dialog_time", str13}, "crash_hash = ? AND latest_tme > ?", new String[]{a, Long.toString(seconds - ruc.f43686a)}, null, null, null);
                        try {
                            if (query.moveToFirst()) {
                                rud = ruc.m34461a(query, a);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Throwable th11) {
                                        th = th11;
                                        str2 = str3;
                                        writableDatabase.endTransaction();
                                        throw th;
                                    }
                                }
                            } else {
                                if (query != null) {
                                    query.close();
                                }
                                rud = null;
                            }
                            if (rud == null) {
                                j = 0;
                                j2 = 1;
                                str10 = str18;
                                j3 = 0;
                                j4 = seconds;
                            } else {
                                str10 = str18;
                                try {
                                    long j6 = rud.f43690c + 1;
                                    long j7 = rud.f43691d;
                                    j = rud.f43693f;
                                    j4 = j7;
                                    j2 = j6;
                                    j3 = rud.f43694g;
                                } catch (Throwable th12) {
                                    th = th12;
                                    str18 = str10;
                                    str2 = str3;
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(str12, a);
                            contentValues.put("stack_trace", str9);
                            contentValues.put(str15, Long.valueOf(j4));
                            contentValues.put(str14, Long.valueOf(seconds));
                            contentValues.put("count", Long.valueOf(j2));
                            contentValues.put("latest_error_dialog_time", Long.valueOf(j));
                            contentValues.put(str13, Long.valueOf(j3));
                            if (writableDatabase.insertWithOnConflict(str2, null, contentValues, 5) != -1) {
                                writableDatabase.setTransactionSuccessful();
                                if (contentValues.containsKey(str12)) {
                                    if (contentValues.containsKey("stack_trace") && contentValues.containsKey("count") && contentValues.containsKey(str14) && contentValues.containsKey(str15) && contentValues.containsKey(str13) && contentValues.containsKey("latest_error_dialog_time")) {
                                        rud3 = new rud(contentValues.getAsString(str12), contentValues.getAsString("stack_trace"), contentValues.getAsLong("count").longValue(), contentValues.getAsLong(str15).longValue(), contentValues.getAsLong(str14).longValue(), contentValues.getAsLong("latest_error_dialog_time").longValue(), contentValues.getAsLong(str13).longValue());
                                        writableDatabase.endTransaction();
                                        rud2 = rud3;
                                    }
                                }
                                Log.i("CrashCountTable", "Missing an expected column from the database.");
                                rud3 = null;
                                try {
                                    writableDatabase.endTransaction();
                                    rud2 = rud3;
                                } catch (RuntimeException e6) {
                                    e = e6;
                                } catch (Throwable th13) {
                                    th = th13;
                                    str18 = str10;
                                    str2 = str3;
                                    th3 = th;
                                    ruf = ruf2;
                                    if (ruf != null) {
                                    }
                                    throw th3;
                                }
                            } else {
                                Log.w("CrashCountTable", "Insert of crash failed due to an unknown error.");
                                try {
                                    writableDatabase.endTransaction();
                                    rud2 = null;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    str18 = str10;
                                    str2 = str3;
                                    ruf = ruf2;
                                    Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                                    if (e instanceof SQLiteException) {
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    str18 = str10;
                                    str2 = str3;
                                    th3 = th;
                                    ruf = ruf2;
                                    if (ruf != null) {
                                    }
                                    throw th3;
                                }
                            }
                            String valueOf = String.valueOf(rud2 != null ? rud2.f43688a : "null");
                            str18 = str10;
                            Log.w(str18, valueOf.length() == 0 ? new String("Crash Hash: ") : "Crash Hash: ".concat(valueOf));
                            rvk c = rvl.m34524c();
                            c.f43749a = bpun.UNCAUGHT_EXCEPTION_HANDLER;
                            c.f43750b = this.f43992a;
                            c.f43755g = rud2;
                            rvl a3 = c.mo25198a();
                            if (!cdkp.m133841h()) {
                                rvb.m34509a();
                            }
                            this.f43700c.mo25209a(a3);
                            if (rud2 == null) {
                                str = str3;
                            } else if (cdkp.f181122a.mo6606a().mo77813P()) {
                                String stackTraceString = Log.getStackTraceString(th);
                                String a4 = ssy.m36271a();
                                String str29 = a4 != null ? a4 : "(null process name)";
                                Throwable th15 = th;
                                if (!(th15 instanceof rum)) {
                                    if (((double) new Random().nextFloat()) <= cdkp.f181122a.mo6606a().mo77811N()) {
                                        Log.w(str18, "Not shushing crash due to random threshold.");
                                        i = 0;
                                    } else if (!sqc.m35958a(f43699b, str29)) {
                                        Log.w(str18, "Not shushing due to process not found in the whitelist.");
                                        i = 0;
                                    } else {
                                        if (!cdkp.m133843j().isEmpty()) {
                                            String j8 = cdkp.m133843j();
                                            String str30 = rud2.f43688a;
                                            if (!TextUtils.isEmpty(j8) && !TextUtils.isEmpty(str30)) {
                                                try {
                                                    Iterator it = bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) j8).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (bmwb.m108443a((String) it.next(), str30)) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e8) {
                                                    String valueOf2 = String.valueOf(j8);
                                                    Log.e(str18, valueOf2.length() == 0 ? new String("Failed to parse string list: ") : "Failed to parse string list: ".concat(valueOf2), e8);
                                                }
                                            }
                                        }
                                        if (rud2.f43692e - rud2.f43693f < 3600) {
                                            Log.w(str18, "Shushing crash due to popup frequency.");
                                            i = 1073741825;
                                        } else {
                                            Log.w(str18, "Shushing crash.");
                                            i = JGCastService.FLAG_PRIVATE_DISPLAY;
                                        }
                                    }
                                    if ((i & JGCastService.FLAG_PRIVATE_DISPLAY) == 0) {
                                        String str31 = rud2.f43688a;
                                        sdo.checkIfNull((Object) str31, (Object) "crashHash cannot be null");
                                        ruf.m34470d();
                                        writableDatabase2 = ruf2.getWritableDatabase();
                                        long seconds2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                                        String[] strArr = {str31};
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("latest_error_dialog_time", Long.valueOf(seconds2));
                                        writableDatabase2.beginTransaction();
                                        if (writableDatabase2.update(str2, contentValues2, "crash_hash = ?", strArr) > 0) {
                                            writableDatabase2.setTransactionSuccessful();
                                        }
                                        writableDatabase2.endTransaction();
                                        z = false;
                                    } else if (!(th15 instanceof rum)) {
                                        int myPid = Process.myPid();
                                        String name = thread.getName();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("FATAL EXCEPTION: ");
                                        sb2.append(name);
                                        String str32 = str8;
                                        sb2.append(str32);
                                        if (!TextUtils.isEmpty(str29)) {
                                            sb2.append("Process: ");
                                            sb2.append(str29);
                                            sb2.append(", ");
                                        }
                                        sb2.append("PID: ");
                                        sb2.append(myPid);
                                        sb2.append(str32);
                                        if (!TextUtils.isEmpty(stackTraceString)) {
                                            sb2.append(stackTraceString);
                                            sb2.append(str32);
                                        }
                                        Log.e(str18, sb2.toString());
                                        spn.m35853a(this.f43992a, myPid, stackTraceString, i);
                                        z = true;
                                    } else {
                                        str2 = str3;
                                        try {
                                            rum rum = (rum) th15;
                                            throw null;
                                        } catch (RuntimeException e9) {
                                            e = e9;
                                            ruf = ruf2;
                                            Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                                            if (e instanceof SQLiteException) {
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th3 = th;
                                            ruf = ruf2;
                                            if (ruf != null) {
                                            }
                                            throw th3;
                                        }
                                    }
                                    try {
                                        ruf2.close();
                                    } catch (RuntimeException e10) {
                                        Log.w(str18, str3, e10);
                                    }
                                    return z;
                                }
                                rum rum2 = (rum) th15;
                                throw null;
                            } else {
                                str = str3;
                            }
                            if (rud2 != null) {
                                Log.w(str18, "Shush is disabled.");
                            } else {
                                Log.w(str18, "No data from the database helper.");
                            }
                            try {
                                ruf2.close();
                                return false;
                            } catch (RuntimeException e11) {
                                runtimeException = e11;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            str2 = str3;
                            cursor = query;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Throwable th18) {
                                    th = th18;
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        str2 = str3;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                    str2 = str3;
                    ruf = ruf2;
                    Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                    if (e instanceof SQLiteException) {
                    }
                } catch (Throwable th20) {
                    th = th20;
                    str2 = str3;
                    th3 = th;
                    ruf = ruf2;
                    if (ruf != null) {
                    }
                    throw th3;
                }
            } catch (RuntimeException e13) {
                e = e13;
                str2 = str16;
                ruf = null;
                Log.w(str18, "Hit a RuntimeException while trying to handle the crash.", e);
                if (e instanceof SQLiteException) {
                }
            } catch (Throwable th21) {
                str = str16;
                th3 = th21;
                ruf = null;
                if (ruf != null) {
                }
                throw th3;
            }
        } catch (aptr e14) {
            th2 = th5;
            Log.w(str18, "Unable to get the information!", e14);
        }
        Log.w(str18, str, runtimeException);
        return false;
    }
}
