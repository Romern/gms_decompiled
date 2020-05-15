package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;

/* renamed from: asfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfr extends asft {

    /* renamed from: a */
    public static asfr f88853a = null;

    /* renamed from: f */
    private static final bnic f88854f = bnic.m109493a(6, 5, 3, 4, 1);

    /* renamed from: g */
    private int f88855g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asfr.a(int, boolean, boolean, boolean):java.lang.String
     arg types: [int, boolean, boolean, int]
     candidates:
      asfr.a(int, boolean, boolean, bxvd):void
      asft.a(int, boolean, boolean, bxvd):void
      asfr.a(int, boolean, boolean, boolean):java.lang.String */
    /* renamed from: a */
    private final cakt m73993a(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        bxvd da = cakt.f175050e.mo74144da();
        if (this.f88855g <= 0) {
            this.f88855g = 100;
        }
        asfo a = asfo.m73974a(rpr.m34216b());
        int[] iArr = asft.f88862e;
        for (int i : iArr) {
            String a2 = m73994a(i, z3, z4, false);
            float b = ((float) ((cguw.m147106b() ? a.mo49136b(a2) : f88861d.getInt(a2, 0)) * 100)) / ((float) this.f88855g);
            String a3 = m73994a(i, z3, z4, true);
            int b2 = cguw.m147106b() ? a.mo49136b(a3) : f88861d.getInt(a3, 0);
            bxvd da2 = caks.f175045d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            caks caks = (caks) da2.f164949b;
            int i2 = caks.f175047a | 1;
            caks.f175047a = i2;
            caks.f175048b = b;
            caks.f175047a = i2 | 2;
            caks.f175049c = b2;
            caks caks2 = (caks) da2.mo74062i();
            if (i == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakt cakt = (cakt) da.f164949b;
                caks2.getClass();
                cakt.f175053b = caks2;
                cakt.f175052a |= 1;
            } else if (i == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakt cakt2 = (cakt) da.f164949b;
                caks2.getClass();
                cakt2.f175055d = caks2;
                cakt2.f175052a |= 4;
            } else if (i != 2) {
                Log.e("EastworldBattery", "EastworldBatteryProcessor got invalid session type.");
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakt cakt3 = (cakt) da.f164949b;
                caks2.getClass();
                cakt3.f175054c = caks2;
                cakt3.f175052a |= 2;
            }
        }
        return (cakt) da.mo74062i();
    }

    /* renamed from: a */
    static String m73994a(int i, boolean z, boolean z2, boolean z3) {
        return String.valueOf((i * 1000) + ((z ? 1 : 0) * true) + ((z2 ? 1 : 0) * true) + (z3 ? 1 : 0));
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asfr.a(int, boolean, boolean, boolean):java.lang.String
     arg types: [int, int, int, int]
     candidates:
      asfr.a(int, boolean, boolean, bxvd):void
      asft.a(int, boolean, boolean, bxvd):void
      asfr.a(int, boolean, boolean, boolean):java.lang.String */
    /* renamed from: a */
    private static final void m73995a(int i) {
        if (cguw.m147106b()) {
            asfo a = asfo.m73974a(rpr.m34216b());
            ContentValues contentValues = new ContentValues();
            contentValues.put("counter_val", (Integer) 0);
            String[] strArr = new String[8];
            List a2 = asfo.m73975a(i);
            for (int i2 = 0; i2 < 8; i2++) {
                strArr[i2] = String.valueOf(a2.get(i2));
            }
            try {
                a.getWritableDatabase().update("battery_counter", contentValues, "counter_key IN(?, ?, ?, ?, ?, ?, ?, ?)", strArr);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = f88861d.edit();
            bngs j = bngx.m109377j();
            j.mo67668c(m73994a(i, true, true, true));
            j.mo67668c(m73994a(i, false, true, true));
            j.mo67668c(m73994a(i, true, false, true));
            j.mo67668c(m73994a(i, false, false, true));
            j.mo67668c(m73994a(i, true, true, false));
            j.mo67668c(m73994a(i, false, true, false));
            j.mo67668c(m73994a(i, true, false, false));
            j.mo67668c(m73994a(i, false, false, false));
            bngx a3 = j.mo67664a();
            int size = a3.size();
            for (int i3 = 0; i3 < size; i3++) {
                edit.putInt((String) a3.get(i3), 0);
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    private static final void m73996a(long j, long j2, int i, boolean z, boolean z2) {
        if (cguw.m147106b()) {
            asfo a = asfo.m73974a(rpr.m34216b());
            try {
                int a2 = a.mo49133a("event_count");
                ContentValues contentValues = new ContentValues();
                Long valueOf = Long.valueOf(j);
                contentValues.put("elapsed_time", valueOf);
                contentValues.put("wallclock_time", Long.valueOf(j2));
                contentValues.put("battery_level", Integer.valueOf(i));
                contentValues.put("on_battery", Integer.valueOf(z ? 1 : 0));
                contentValues.put("screen_on", Integer.valueOf(z2 ? 1 : 0));
                contentValues.put("event_count", Integer.valueOf(a2 + 1));
                contentValues.put("last_event_time", valueOf);
                a.getWritableDatabase().update("battery_status", contentValues, null, null);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = f88861d.edit();
            edit.putLong(":batteryElapsedTimeLatestStatus", j);
            edit.putLong(":batteryWallTimeLatestStatus", j2);
            edit.putInt(":batteryLevelLatestStatus", i);
            edit.putBoolean(":onBatteryLatestStatus", z);
            edit.putBoolean(":screenOnOffLatestStatus", z2);
            edit.putInt(":batteryProcessedEventCount", f88861d.getInt(":batteryProcessedEventCount", 0) + 1);
            edit.putLong(":batteryLastEventTime", SystemClock.elapsedRealtime());
            edit.apply();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:95:0x02a6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:70:0x0218 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v8, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v9, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v14, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v15, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v18, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v20, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: long} */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int], assign insn: PHI: (r4v3 ?) = (r4v19 ?), (r4v23 ?) binds: [B:182:0x04f8, B:167:0x049a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int], assign insn: PHI: (r1v5 ?) = (r1v9 ?), (r1v10 ?) binds: [B:182:0x04f8, B:167:0x049a] */
    /* JADX WARN: Type inference failed for: r1v9, assign insn: 0x0502: CONST  (r1v9 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v19, assign insn: 0x0507: CONST  (r4v19 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r1v10, assign insn: 0x04a6: CONST  (r1v10 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v23, assign insn: 0x04a7: CONST  (r4v23 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r32v6, assign insn: 0x01c8: CONST  (r32v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v13, assign insn: PHI: (r32v13 ?) = (r32v6 ?), (r32v16 ?), (r32v16 ?), (r32v17 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:67:0x020e, B:70:0x0218, B:73:0x0222, B:57:0x01f0] */
    /* JADX WARN: Type inference failed for: r32v16, assign insn: 0x0216: MOVE  (r32v16 ? I:?[long, double]) = (r5v1 long) */
    /* JADX WARN: Type inference failed for: r32v17, assign insn: 0x01c8: CONST  (r32v17 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asfr.a(int, boolean, boolean, boolean):java.lang.String
     arg types: [int, boolean, boolean, int]
     candidates:
      asfr.a(int, boolean, boolean, bxvd):void
      asft.a(int, boolean, boolean, bxvd):void
      asfr.a(int, boolean, boolean, boolean):java.lang.String */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0713 A[SYNTHETIC, Splitter:B:244:0x0713] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02a0 A[SYNTHETIC, Splitter:B:91:0x02a0] */
    /* renamed from: a */
    public final void mo49140a(int i, boolean z, boolean z2, bxvd bxvd) {
        boolean z3;
        long j;
        String str;
        long j2;
        String str2;
        long j3;
        long j4;
        long j5;
        boolean z4;
        String str3;
        boolean z5;
        int i2;
        int i3;
        int a;
        String str4;
        int i4;
        int ordinal;
        String str5;
        String str6;
        int i5;
        ? r4;
        String str7;
        ? r1;
        long j6;
        long j7;
        int i6;
        int i7;
        String str8;
        String str9;
        boolean z6;
        boolean z7;
        String str10;
        long j8;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        int i9 = i;
        if (!cgte.f187717a.mo6606a().mo84461b()) {
            f88860c.mo24383c("DisabledEastworldProcessorEastworldBattery").mo24359a();
            f88860c.mo24388e();
        } else if (f88854f.contains(Integer.valueOf(i))) {
            rpr b = rpr.m34216b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            Intent registerReceiver = b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            this.f88855g = registerReceiver.getIntExtra("scale", -1);
            if (cguw.m147106b()) {
                z3 = asfo.m73974a(b).mo49137b();
            } else {
                z3 = f88861d.contains(":batteryElapsedTimeLatestStatus");
            }
            String str11 = ":bootTimesSinceReset";
            String str12 = "event_count";
            int i10 = intExtra;
            String str13 = "battery_status";
            if (!z3) {
                int intExtra2 = registerReceiver.getIntExtra("status", -1);
                int intExtra3 = registerReceiver.getIntExtra("level", -1);
                boolean z11 = intExtra2 == 2 ? true : intExtra2 == 5;
                int a2 = asfq.m73984a(f88860c);
                if (cguw.m147106b()) {
                    asfo a3 = asfo.m73974a(rpr.m34216b());
                    String str14 = "last_event_time";
                    if (i9 == 5) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if (!a3.mo49137b()) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            Long valueOf = Long.valueOf(elapsedRealtime);
                            contentValues.put("elapsed_time", valueOf);
                            contentValues.put("wallclock_time", Long.valueOf(currentTimeMillis));
                            contentValues.put("battery_level", Integer.valueOf(intExtra3));
                            contentValues.put("on_battery", Integer.valueOf(!z11));
                            contentValues.put("screen_on", Integer.valueOf(i8));
                            contentValues.put("boot_count", Integer.valueOf(Math.max(a2, 0)));
                            contentValues.put(str14, valueOf);
                            SQLiteDatabase writableDatabase = a3.getWritableDatabase();
                            writableDatabase.insert(str13, null, contentValues);
                            for (int i11 : asft.f88862e) {
                                for (Integer num : asfo.m73975a(i11)) {
                                    int intValue = num.intValue();
                                    contentValues.clear();
                                    contentValues.put("counter_key", Integer.valueOf(intValue));
                                    contentValues.put("counter_val", (Integer) 0);
                                    writableDatabase.insert("battery_counter", null, contentValues);
                                }
                            }
                        } catch (SQLiteException e) {
                        }
                    }
                } else {
                    boolean z12 = !z11;
                    if (i9 == 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = a2;
                    String str15 = str11;
                    m73996a(elapsedRealtime, currentTimeMillis, intExtra3, z12, z10);
                    for (int i13 : asft.f88862e) {
                        m73995a(i13);
                    }
                    if (i12 >= 0) {
                        SharedPreferences.Editor edit = f88861d.edit();
                        edit.putInt(str15, i12);
                        edit.apply();
                    }
                }
            } else {
                String str16 = "last_event_time";
                String str17 = str11;
                String str18 = str13;
                if (cguw.m147106b()) {
                    asfo a4 = asfo.m73974a(b);
                    str2 = str16;
                    ContentValues contentValues2 = new ContentValues();
                    try {
                        str = null;
                        long j9 = 0;
                        j9 = 0;
                        Cursor query = a4.getReadableDatabase().query("battery_status", new String[]{"elapsed_time", "wallclock_time", "battery_level", "screen_on", "on_battery", "boot_count", "last_upload_wallclock_time"}, null, null, null, null, null);
                        try {
                            if (query.moveToFirst()) {
                                long j10 = query.getLong(query.getColumnIndexOrThrow("elapsed_time"));
                                long j11 = query.getLong(query.getColumnIndexOrThrow("wallclock_time"));
                                int i14 = query.getInt(query.getColumnIndexOrThrow("battery_level"));
                                j2 = currentTimeMillis;
                                try {
                                    if (query.getInt(query.getColumnIndexOrThrow("screen_on")) > 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (query.getInt(query.getColumnIndexOrThrow("on_battery")) > 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    str = str18;
                                } catch (Throwable th) {
                                    th = th;
                                    j9 = elapsedRealtime;
                                    str = str18;
                                    str10 = str17;
                                    j = j9;
                                    Throwable th2 = th;
                                    if (query != null) {
                                    }
                                    throw th2;
                                }
                                try {
                                    int i15 = query.getInt(query.getColumnIndexOrThrow("boot_count"));
                                    j9 = elapsedRealtime;
                                    try {
                                        long j12 = query.getLong(query.getColumnIndexOrThrow("last_upload_wallclock_time"));
                                        str10 = str17;
                                        contentValues2.put("elapsed_time", Long.valueOf(j10));
                                        contentValues2.put("wallclock_time", Long.valueOf(j11));
                                        contentValues2.put("battery_level", Integer.valueOf(i14));
                                        contentValues2.put("screen_on", Boolean.valueOf(z8));
                                        contentValues2.put("on_battery", Boolean.valueOf(z9));
                                        contentValues2.put("boot_count", Integer.valueOf(i15));
                                        contentValues2.put("last_upload_wallclock_time", Long.valueOf(j12));
                                    } catch (Throwable th3) {
                                        th = th3;
                                        j = j9;
                                        Throwable th22 = th;
                                        if (query != null) {
                                        }
                                        throw th22;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j9 = elapsedRealtime;
                                    str10 = str17;
                                    j = j9;
                                    Throwable th222 = th;
                                    if (query != null) {
                                    }
                                    throw th222;
                                }
                            } else {
                                j9 = elapsedRealtime;
                                str = str18;
                                j2 = currentTimeMillis;
                                str10 = str17;
                                contentValues2.put("elapsed_time", (Integer) -1);
                                contentValues2.put("wallclock_time", (Integer) -1);
                                contentValues2.put("battery_level", (Integer) 0);
                                contentValues2.put("screen_on", (Boolean) false);
                                contentValues2.put("on_battery", (Boolean) false);
                                contentValues2.put("boot_count", (Integer) 0);
                                contentValues2.put("last_upload_wallclock_time", (Integer) -1);
                            }
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (SQLiteException e2) {
                                    j8 = j;
                                }
                            }
                            int intValue2 = contentValues2.getAsInteger("battery_level").intValue();
                            boolean booleanValue = contentValues2.getAsBoolean("screen_on").booleanValue();
                            boolean booleanValue2 = contentValues2.getAsBoolean("on_battery").booleanValue();
                            long longValue = contentValues2.getAsLong("elapsed_time").longValue();
                            long longValue2 = contentValues2.getAsLong("wallclock_time").longValue();
                            int intValue3 = contentValues2.getAsInteger("boot_count").intValue();
                            j3 = contentValues2.getAsLong("last_upload_wallclock_time").longValue();
                            j4 = longValue2;
                            j5 = longValue;
                            str3 = str10;
                            z4 = booleanValue2;
                            z5 = booleanValue;
                            i2 = intValue3;
                            i3 = intValue2;
                        } catch (Throwable th5) {
                            th = th5;
                            j9 = elapsedRealtime;
                            str = str18;
                            j2 = currentTimeMillis;
                            str10 = str17;
                            j = j9;
                            Throwable th2222 = th;
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (Throwable th6) {
                                    bqye.m113761a(th2222, th6);
                                }
                            }
                            throw th2222;
                        }
                    } catch (SQLiteException e3) {
                        j8 = elapsedRealtime;
                        str = str18;
                        j2 = currentTimeMillis;
                        str10 = str17;
                        contentValues2.put("elapsed_time", (Integer) -1);
                        contentValues2.put("wallclock_time", (Integer) -1);
                        contentValues2.put("battery_level", (Integer) 0);
                        contentValues2.put("screen_on", (Boolean) false);
                        contentValues2.put("on_battery", (Boolean) false);
                        contentValues2.put("boot_count", (Integer) 0);
                        contentValues2.put("last_upload_wallclock_time", (Integer) -1);
                        j = j8;
                        int intValue22 = contentValues2.getAsInteger("battery_level").intValue();
                        boolean booleanValue3 = contentValues2.getAsBoolean("screen_on").booleanValue();
                        boolean booleanValue22 = contentValues2.getAsBoolean("on_battery").booleanValue();
                        long longValue3 = contentValues2.getAsLong("elapsed_time").longValue();
                        long longValue22 = contentValues2.getAsLong("wallclock_time").longValue();
                        int intValue32 = contentValues2.getAsInteger("boot_count").intValue();
                        j3 = contentValues2.getAsLong("last_upload_wallclock_time").longValue();
                        j4 = longValue22;
                        j5 = longValue3;
                        str3 = str10;
                        z4 = booleanValue22;
                        z5 = booleanValue3;
                        i2 = intValue32;
                        i3 = intValue22;
                        a = asfq.m73984a(f88860c);
                        if (i2 != a) {
                        }
                        if (i4 >= 0) {
                        }
                    }
                } else {
                    j = elapsedRealtime;
                    str = str18;
                    str2 = str16;
                    j2 = currentTimeMillis;
                    int i16 = f88861d.getInt(":batteryLevelLatestStatus", 0);
                    boolean z13 = f88861d.getBoolean(":screenOnOffLatestStatus", false);
                    boolean z14 = f88861d.getBoolean(":onBatteryLatestStatus", false);
                    j5 = f88861d.getLong(":batteryElapsedTimeLatestStatus", -1);
                    j4 = f88861d.getLong(":batteryWallTimeLatestStatus", -1);
                    str3 = str17;
                    i2 = f88861d.getInt(str3, 0);
                    j3 = f88861d.getLong(":batteryLastPeriodicUploadWallclockTime", -1);
                    z4 = z14;
                    z5 = z13;
                    i3 = i16;
                }
                a = asfq.m73984a(f88860c);
                if (i2 != a) {
                    i4 = (int) (j - j5);
                    str4 = str;
                } else {
                    if (a < 0) {
                        str4 = str;
                    } else if (cguw.m147106b()) {
                        asfo a5 = asfo.m73974a(rpr.m34216b());
                        try {
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("boot_count", Integer.valueOf(a));
                            SQLiteDatabase writableDatabase2 = a5.getWritableDatabase();
                            str4 = str;
                            try {
                                writableDatabase2.update(str4, contentValues3, null, null);
                            } catch (SQLiteException e4) {
                            }
                        } catch (SQLiteException e5) {
                            str4 = str;
                        }
                    } else {
                        str4 = str;
                        SharedPreferences.Editor edit2 = f88861d.edit();
                        edit2.putInt(str3, a);
                        edit2.apply();
                    }
                    i4 = (int) (j2 - j4);
                }
                if (i4 >= 0) {
                    f88860c.mo24383c("EastworldBatteryProcessorInvalidTimestamp").mo24359a();
                    f88860c.mo24388e();
                    bxvd bxvd2 = bxvd;
                    int i17 = ((cala) bxvd2.f164949b).f175100g + 1;
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cala cala = (cala) bxvd2.f164949b;
                    cala cala2 = cala.f175092h;
                    cala.f175094a |= 8;
                    cala.f175100g = i17;
                    return;
                }
                bxvd bxvd3 = bxvd;
                int i18 = i10 - i3;
                if (cguw.m147106b()) {
                    asfo a6 = asfo.m73974a(rpr.m34216b());
                    try {
                        SQLiteDatabase writableDatabase3 = a6.getWritableDatabase();
                        writableDatabase3.beginTransaction();
                        try {
                            int[] iArr = asft.f88862e;
                            int length = iArr.length;
                            int i19 = 0;
                            while (i19 < length) {
                                int i20 = iArr[i19];
                                str = str4;
                                try {
                                    int a7 = asfo.m73973a(i20, z5, z4, true);
                                    a6.mo49135a(a7, a6.mo49136b(String.valueOf(a7)) + i4);
                                    int a8 = asfo.m73973a(i20, z5, z4, false);
                                    a6.mo49135a(a8, a6.mo49136b(String.valueOf(a8)) + i18);
                                    i19++;
                                    str4 = str;
                                } catch (Throwable th7) {
                                    th = th7;
                                    writableDatabase3.endTransaction();
                                    throw th;
                                }
                            }
                            str = str4;
                            writableDatabase3.setTransactionSuccessful();
                            try {
                                writableDatabase3.endTransaction();
                            } catch (SQLiteException e6) {
                                ordinal = calc.m126745a(i).ordinal();
                                if (ordinal == 1) {
                                }
                                str6 = "last_upload_wallclock_time";
                                str7 = str;
                                i5 = 3;
                                r1 = 0;
                                str5 = str2;
                                r4 = 1;
                                m73996a(j, j2, i10, z7, z6);
                                if (i != r4) {
                                }
                                if (z) {
                                }
                                if (z2) {
                                }
                                if (!cguw.m147106b()) {
                                }
                                asfq.m73988a(bxvd, i7, i6, j7, j6);
                                f88860c.mo24388e();
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            writableDatabase3.endTransaction();
                            throw th;
                        }
                    } catch (SQLiteException e7) {
                        str = str4;
                        ordinal = calc.m126745a(i).ordinal();
                        if (ordinal == 1) {
                        }
                        str6 = "last_upload_wallclock_time";
                        str7 = str;
                        i5 = 3;
                        r1 = 0;
                        str5 = str2;
                        r4 = 1;
                        m73996a(j, j2, i10, z7, z6);
                        if (i != r4) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        if (!cguw.m147106b()) {
                        }
                        asfq.m73988a(bxvd, i7, i6, j7, j6);
                        f88860c.mo24388e();
                    }
                } else {
                    str = str4;
                    SharedPreferences.Editor edit3 = f88861d.edit();
                    int[] iArr2 = asft.f88862e;
                    for (int i21 : iArr2) {
                        String a9 = m73994a(i21, z5, z4, true);
                        edit3.putInt(a9, f88861d.getInt(a9, 0) + i4);
                        String a10 = m73994a(i21, z5, z4, false);
                        edit3.putInt(a10, f88861d.getInt(a10, 0) + i18);
                    }
                    edit3.apply();
                }
                ordinal = calc.m126745a(i).ordinal();
                if (ordinal == 1) {
                    z6 = z5;
                    z7 = z4;
                } else if (ordinal == 3) {
                    if (!z4) {
                        f88860c.mo24383c("EastworldProcessorInvalidBatteryChargerState").mo24359a();
                    }
                    z6 = z5;
                    z7 = false;
                } else if (ordinal == 4) {
                    if (z4) {
                        f88860c.mo24383c("EastworldProcessorInvalidBatteryChargerState").mo24359a();
                    }
                    z6 = z5;
                    z7 = true;
                } else if (ordinal == 5) {
                    if (z5) {
                        f88860c.mo24383c("EastworldProcessorInvalidScreenState").mo24359a();
                    }
                    z7 = z4;
                    z6 = true;
                } else if (ordinal != 6) {
                    Log.e("EastworldBattery", "EastworldBatteryProcessor got invalid action in intent.");
                    str6 = "last_upload_wallclock_time";
                    str5 = str2;
                    str7 = str;
                    r1 = 0;
                    r4 = 1;
                    i5 = 3;
                    if (i != r4) {
                        if (j2 - j3 > cgte.f187717a.mo6606a().mo84460a()) {
                            bxvd da = calg.f175118j.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = r1;
                            }
                            calg calg = (calg) da.f164949b;
                            calg.f175121b = i5;
                            calg.f175120a |= r4;
                            cakt a11 = m73993a(r4, r4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = r1;
                            }
                            calg calg2 = (calg) da.f164949b;
                            a11.getClass();
                            calg2.f175125f = a11;
                            calg2.f175120a |= 32;
                            cakt a12 = m73993a(r1, r4);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = r1;
                            }
                            calg calg3 = (calg) da.f164949b;
                            a12.getClass();
                            calg3.f175124e = a12;
                            calg3.f175120a |= 16;
                            cakt a13 = m73993a(r4, r1);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = r1;
                            }
                            calg calg4 = (calg) da.f164949b;
                            a13.getClass();
                            calg4.f175127h = a13;
                            calg4.f175120a |= 128;
                            cakt a14 = m73993a(r1, r1);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = r1;
                            }
                            calg calg5 = (calg) da.f164949b;
                            a14.getClass();
                            calg5.f175126g = a14;
                            calg5.f175120a |= 64;
                            calg calg6 = (calg) da.mo74062i();
                            int i22 = calg6.f164961ai;
                            if (i22 == -1) {
                                i22 = bxxm.f165037a.mo74228a(calg6).mo74223b(calg6);
                                calg6.f164961ai = i22;
                            }
                            asft.m74000a(da, "EastworldBattery", "EASTWORLD_BATTERY", (int) cgtd.f187715a.mo6606a().mo84474c(), bxvd3);
                            m73995a(r1);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (cguw.m147106b()) {
                                asfo a15 = asfo.m73974a(rpr.m34216b());
                                int a16 = a15.mo49133a("log_upload_count");
                                ContentValues contentValues4 = new ContentValues();
                                contentValues4.put("last_upload_elapsed_time", Long.valueOf(elapsedRealtime2));
                                contentValues4.put(str6, Long.valueOf(currentTimeMillis2));
                                contentValues4.put("log_upload_count", Integer.valueOf(a16 + r4));
                                try {
                                    a15.getWritableDatabase().update(str7, contentValues4, null, null);
                                } catch (SQLiteException e8) {
                                }
                            } else {
                                SharedPreferences.Editor edit4 = f88861d.edit();
                                edit4.putLong(":batteryLastPeriodicUploadWallclockTime", currentTimeMillis2);
                                edit4.putLong(":batteryLastPeriodicUploadElapsedTime", elapsedRealtime2);
                                edit4.putInt(":batteryLogsUploadedCount", f88861d.getInt(":batteryLogsUploadedCount", r1) + r4);
                                edit4.apply();
                            }
                            if (!cgtd.m146973e()) {
                                asfq.m73987a(bxvd3, i22, 4);
                            }
                        }
                    }
                    if (z) {
                        m73995a(2);
                    }
                    if (z2) {
                        m73995a(r4);
                    }
                    if (!cguw.m147106b()) {
                        asfo a17 = asfo.m73974a(rpr.m34216b());
                        ContentValues contentValues5 = new ContentValues();
                        try {
                            String[] strArr = new String[5];
                            strArr[r1] = str12;
                            str8 = str5;
                            try {
                                strArr[r4] = str8;
                                strArr[2] = "log_upload_count";
                                strArr[3] = "last_upload_elapsed_time";
                                strArr[4] = str6;
                                Cursor query2 = a17.getReadableDatabase().query("battery_status", strArr, null, null, null, null, null);
                                try {
                                    if (query2.moveToFirst()) {
                                        str9 = str12;
                                        try {
                                            contentValues5.put(str9, Integer.valueOf(query2.getInt(query2.getColumnIndexOrThrow(str9))));
                                            contentValues5.put(str8, Long.valueOf(query2.getLong(query2.getColumnIndexOrThrow(str8))));
                                            contentValues5.put("log_upload_count", Integer.valueOf(query2.getInt(query2.getColumnIndexOrThrow("log_upload_count"))));
                                            contentValues5.put("last_upload_elapsed_time", Long.valueOf(query2.getLong(query2.getColumnIndexOrThrow("last_upload_elapsed_time"))));
                                            contentValues5.put(str6, Long.valueOf(query2.getLong(query2.getColumnIndexOrThrow(str6))));
                                        } catch (Throwable th9) {
                                            th = th9;
                                            Throwable th10 = th;
                                            if (query2 != null) {
                                                try {
                                                    query2.close();
                                                } catch (Throwable th11) {
                                                    bqye.m113761a(th10, th11);
                                                }
                                            }
                                            throw th10;
                                        }
                                    } else {
                                        str9 = str12;
                                        Integer valueOf2 = Integer.valueOf((int) r1);
                                        contentValues5.put(str9, valueOf2);
                                        contentValues5.put(str8, valueOf2);
                                        contentValues5.put("log_upload_count", valueOf2);
                                        contentValues5.put("last_upload_elapsed_time", valueOf2);
                                        contentValues5.put(str6, valueOf2);
                                    }
                                    if (query2 != null) {
                                        try {
                                            query2.close();
                                        } catch (SQLiteException e9) {
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    str9 = str12;
                                    Throwable th102 = th;
                                    if (query2 != null) {
                                    }
                                    throw th102;
                                }
                            } catch (SQLiteException e10) {
                                str9 = str12;
                                Integer valueOf3 = Integer.valueOf((int) r1);
                                contentValues5.put(str9, valueOf3);
                                contentValues5.put(str8, valueOf3);
                                contentValues5.put("log_upload_count", valueOf3);
                                contentValues5.put("last_upload_elapsed_time", valueOf3);
                                contentValues5.put(str6, valueOf3);
                                i7 = contentValues5.getAsInteger(str9).intValue();
                                i6 = contentValues5.getAsInteger("log_upload_count").intValue();
                                j7 = (long) contentValues5.getAsInteger(str8).intValue();
                                j6 = contentValues5.getAsLong("last_upload_elapsed_time").longValue();
                                asfq.m73988a(bxvd, i7, i6, j7, j6);
                                f88860c.mo24388e();
                            }
                        } catch (SQLiteException e11) {
                            str9 = str12;
                            str8 = str5;
                            Integer valueOf32 = Integer.valueOf((int) r1);
                            contentValues5.put(str9, valueOf32);
                            contentValues5.put(str8, valueOf32);
                            contentValues5.put("log_upload_count", valueOf32);
                            contentValues5.put("last_upload_elapsed_time", valueOf32);
                            contentValues5.put(str6, valueOf32);
                            i7 = contentValues5.getAsInteger(str9).intValue();
                            i6 = contentValues5.getAsInteger("log_upload_count").intValue();
                            j7 = (long) contentValues5.getAsInteger(str8).intValue();
                            j6 = contentValues5.getAsLong("last_upload_elapsed_time").longValue();
                            asfq.m73988a(bxvd, i7, i6, j7, j6);
                            f88860c.mo24388e();
                        }
                        i7 = contentValues5.getAsInteger(str9).intValue();
                        i6 = contentValues5.getAsInteger("log_upload_count").intValue();
                        j7 = (long) contentValues5.getAsInteger(str8).intValue();
                        j6 = contentValues5.getAsLong("last_upload_elapsed_time").longValue();
                    } else {
                        i7 = f88861d.getInt(":batteryProcessedEventCount", r1);
                        int i23 = f88861d.getInt(":batteryLogsUploadedCount", r1);
                        long j13 = f88861d.getLong(":batteryLastEventTime", 0);
                        j6 = f88861d.getLong(":batteryLastPeriodicUploadElapsedTime", 0);
                        j7 = j13;
                        i6 = i23;
                    }
                    asfq.m73988a(bxvd, i7, i6, j7, j6);
                    f88860c.mo24388e();
                } else {
                    if (!z5) {
                        f88860c.mo24383c("EastworldProcessorInvalidScreenState").mo24359a();
                    }
                    z7 = z4;
                    z6 = false;
                }
                str6 = "last_upload_wallclock_time";
                str7 = str;
                i5 = 3;
                r1 = 0;
                str5 = str2;
                r4 = 1;
                m73996a(j, j2, i10, z7, z6);
                if (i != r4) {
                }
                if (z) {
                }
                if (z2) {
                }
                if (!cguw.m147106b()) {
                }
                asfq.m73988a(bxvd, i7, i6, j7, j6);
                f88860c.mo24388e();
            }
        }
    }
}
