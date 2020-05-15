package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aplm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aplm implements apln {

    /* renamed from: b */
    private static final String[] f84702b = {"_id", "target_package", "target_class", "tag", "runtime", "flex_time", "period", "last_runtime", "user_id", "required_network_type", "requires_charging", "extras", "retry_strategy", "task_type", "job_id", "content_uris", "source", "source_version", "triggered_content_uris", "required_uris", "preferred_network_type", "preferred_charging_state", "required_idleness_state", "preferred_idleness_state", "service_kind"};

    /* renamed from: c */
    private static final String[] f84703c = {"persistence_level"};

    /* renamed from: a */
    private final aplj f84704a;

    /* renamed from: a */
    private final SQLiteDatabase m70619a(boolean z) {
        if (z) {
            return this.f84704a.getWritableDatabase();
        }
        try {
            return this.f84704a.getReadableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Failed to open database. ") : "Failed to open database. ".concat(valueOf));
            return null;
        }
    }

    /* renamed from: f */
    private final synchronized void m70622f() {
        SQLiteDatabase a = m70619a(true);
        if (a == null) {
            Log.e("NetworkScheduler", "Failed to get the database");
            return;
        }
        a.delete("pending_ops", "persistence_level = ?", new String[]{Integer.toString(0)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47401b() {
        return mo47400a() && cdnj.f181319a.mo6606a().mo77987J();
    }

    /* renamed from: d */
    public final void mo47403d() {
        try {
            this.f84704a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Failed to close. ") : "Failed to close. ".concat(valueOf));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* renamed from: e */
    public final aape mo47404e() {
        long j;
        int i;
        bxvd da;
        SQLiteDatabase a = m70619a(false);
        long j2 = 0;
        if (a == null) {
            j = 0;
            i = 0;
        } else {
            try {
                long maximumSize = a.getMaximumSize();
                try {
                    long length = new File(a.getPath()).length();
                    i = a.getVersion();
                    j2 = maximumSize;
                    j = length;
                } catch (SQLiteException e) {
                    e = e;
                    j2 = maximumSize;
                    j = 0;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    sb.append("Error reading database info: ");
                    sb.append(valueOf);
                    Log.w("NetworkScheduler", sb.toString());
                    i = 0;
                    da = aape.f28742f.mo74144da();
                    if (da.f164950c) {
                    }
                    aape aape = (aape) da.f164949b;
                    aape.f28745b = 1;
                    int i2 = 1 | aape.f28744a;
                    aape.f28744a = i2;
                    int i3 = i2 | 4;
                    aape.f28744a = i3;
                    aape.f28747d = j2;
                    int i4 = i3 | 2;
                    aape.f28744a = i4;
                    aape.f28746c = j;
                    aape.f28744a = i4 | 8;
                    aape.f28748e = (long) i;
                    return (aape) da.mo74062i();
                }
            } catch (SQLiteException e2) {
                e = e2;
                j = 0;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb2.append("Error reading database info: ");
                sb2.append(valueOf2);
                Log.w("NetworkScheduler", sb2.toString());
                i = 0;
                da = aape.f28742f.mo74144da();
                if (da.f164950c) {
                }
                aape aape2 = (aape) da.f164949b;
                aape2.f28745b = 1;
                int i22 = 1 | aape2.f28744a;
                aape2.f28744a = i22;
                int i32 = i22 | 4;
                aape2.f28744a = i32;
                aape2.f28747d = j2;
                int i42 = i32 | 2;
                aape2.f28744a = i42;
                aape2.f28746c = j;
                aape2.f28744a = i42 | 8;
                aape2.f28748e = (long) i;
                return (aape) da.mo74062i();
            }
        }
        da = aape.f28742f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aape aape22 = (aape) da.f164949b;
        aape22.f28745b = 1;
        int i222 = 1 | aape22.f28744a;
        aape22.f28744a = i222;
        int i322 = i222 | 4;
        aape22.f28744a = i322;
        aape22.f28747d = j2;
        int i422 = i322 | 2;
        aape22.f28744a = i422;
        aape22.f28746c = j;
        aape22.f28744a = i422 | 8;
        aape22.f28748e = (long) i;
        return (aape) da.mo74062i();
    }

    public aplm(Context context) {
        int i;
        if (!cdnn.m134231b()) {
            i = 17;
        } else {
            i = 18;
        }
        this.f84704a = new aplj(context, "ns.db", i);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: aeac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: aebl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: aebi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: aeac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: aeac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: aeac} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016e, code lost:
        r2 = r0;
        r7 = r5;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c9, code lost:
        r1 = r0;
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d1, code lost:
        r2 = r0;
        r3 = r24;
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03aa, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03ae, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03b4, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x03b8, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x03ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x03f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x03f5, code lost:
        r3 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x03f7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0437, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0438, code lost:
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x044c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x044f, code lost:
        r34 = r7;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0454, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0456, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        r2 = r0;
        r34 = r7;
        r3 = r24;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0182 A[SYNTHETIC, Splitter:B:109:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x018e A[Catch:{ IllegalArgumentException -> 0x019e }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0193 A[Catch:{ IllegalArgumentException -> 0x019e }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0196 A[Catch:{ IllegalArgumentException -> 0x019e }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c3 A[SYNTHETIC, Splitter:B:132:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c8 A[ExcHandler: all (r0v25 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r36 10  PHI: (r36v4 android.database.Cursor) = (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v6 android.database.Cursor), (r36v6 android.database.Cursor) binds: [B:194:0x02ae, B:195:?, B:176:0x0263, B:177:?, B:142:0x01de, B:143:?, B:158:0x020c, B:132:0x01c3, B:126:0x01b2, B:127:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:126:0x01b2] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01de A[SYNTHETIC, Splitter:B:142:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x021a A[Catch:{ SQLiteException | IllegalStateException -> 0x01ce, all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0220 A[Catch:{ SQLiteException | IllegalStateException -> 0x01ce, all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0244 A[SYNTHETIC, Splitter:B:170:0x0244] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0289 A[Catch:{ IllegalArgumentException -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x033c A[Catch:{ IllegalArgumentException -> 0x03b7, SQLiteException | IllegalStateException -> 0x03b1, all -> 0x0437 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x033d A[Catch:{ IllegalArgumentException -> 0x03b7, SQLiteException | IllegalStateException -> 0x03b1, all -> 0x0437 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0388 A[Catch:{ JSONException -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x03ec A[ExcHandler: SQLiteException | IllegalStateException (e java.lang.Throwable), PHI: r7 r41 10  PHI: (r7v31 android.database.Cursor) = (r7v42 android.database.Cursor), (r7v42 android.database.Cursor), (r7v42 android.database.Cursor), (r7v46 android.database.Cursor), (r7v46 android.database.Cursor), (r7v46 android.database.Cursor) binds: [B:234:0x0370, B:247:0x039e, B:248:?, B:266:0x03d0, B:269:0x03e5, B:270:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r41v7 java.lang.String) = (r41v13 java.lang.String), (r41v13 java.lang.String), (r41v13 java.lang.String), (r41v15 java.lang.String), (r41v15 java.lang.String), (r41v15 java.lang.String) binds: [B:234:0x0370, B:247:0x039e, B:248:?, B:266:0x03d0, B:269:0x03e5, B:270:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:234:0x0370] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x041d A[Catch:{ SQLiteException | IllegalStateException -> 0x0431 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0437 A[ExcHandler: all (th java.lang.Throwable), PHI: r36 10  PHI: (r36v2 android.database.Cursor) = (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v5 android.database.Cursor), (r36v6 android.database.Cursor), (r36v6 android.database.Cursor) binds: [B:139:0x01d8, B:224:0x032b, B:231:0x035c, B:232:?, B:202:0x02c3, B:203:?, B:205:0x02d7, B:206:?, B:207:0x02da, B:208:?, B:216:0x0317, B:165:0x022c, B:123:0x01a4, B:128:0x01b8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:139:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0454 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04d2 A[SYNTHETIC, Splitter:B:353:0x04d2] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce A[ExcHandler: all (r0v57 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:49:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0162  */
    /* renamed from: c */
    public final bngx mo47402c() {
        Throwable th;
        Cursor cursor;
        aech aech;
        Cursor cursor2;
        Throwable th2;
        aech aech2;
        Throwable th3;
        bngx bngx;
        String[] strArr;
        Cursor cursor3;
        aech aech3;
        String str;
        boolean z;
        ArrayList arrayList;
        Throwable th4;
        ArrayList arrayList2;
        Cursor cursor4;
        int i;
        int i2;
        int i3;
        ArrayList arrayList3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        String string;
        int i9;
        String str2;
        Cursor cursor5;
        Cursor cursor6;
        aebo aebo;
        Bundle bundle;
        String str3;
        int i10;
        Set set;
        apid apid;
        String str4;
        IllegalArgumentException illegalArgumentException;
        String str5;
        aeac aeac;
        String string2;
        JSONArray jSONArray;
        int i11;
        String str6;
        String str7;
        try {
            if (mo47401b()) {
                m70622f();
            }
            try {
                aech aech4 = new aech("nts:db:readAll");
                int i12 = 0;
                try {
                    SQLiteDatabase a = m70619a(false);
                    if (a != null) {
                        String[] strArr2 = f84702b;
                        int i13 = 2;
                        int i14 = 1;
                        if (mo47400a()) {
                            try {
                                strArr = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr2, f84703c});
                            } catch (Throwable th5) {
                                th3 = th5;
                                aech2 = aech4;
                                cursor2 = null;
                                try {
                                    aech.close();
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                                throw th2;
                            }
                        } else {
                            strArr = strArr2;
                        }
                        Cursor query = a.query("pending_ops", strArr, null, null, null, null, null, null);
                        if (query != null) {
                            try {
                                boolean c = cedu.m136334c();
                                ArrayList arrayList4 = new ArrayList(query.getCount());
                                query.moveToFirst();
                                while (!query.isAfterLast()) {
                                    try {
                                        int i15 = query.getInt(i12);
                                        String string3 = query.getString(i14);
                                        String string4 = query.getString(i13);
                                        String string5 = query.getString(3);
                                        long j = query.getLong(4);
                                        long j2 = query.getLong(5);
                                        long j3 = query.getLong(6);
                                        long j4 = query.getLong(7);
                                        int i16 = query.getInt(8);
                                        int i17 = query.getInt(9);
                                        if (query.getInt(10) == i14) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        if (!query.isNull(20)) {
                                            try {
                                                i2 = query.getInt(20);
                                            } catch (SQLiteException | IllegalStateException e) {
                                                aech = aech4;
                                                z = c;
                                                arrayList = arrayList4;
                                                th4 = e;
                                                cursor6 = query;
                                                try {
                                                    Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                    cursor3.moveToNext();
                                                    arrayList4 = arrayList;
                                                    query = cursor3;
                                                    aech4 = aech;
                                                    c = z;
                                                    i12 = 0;
                                                    i13 = 2;
                                                    i14 = 1;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    th2 = th;
                                                    cursor2 = cursor3;
                                                    aech.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th8) {
                                                th2 = th8;
                                                aech = aech4;
                                                cursor3 = query;
                                                cursor2 = cursor3;
                                                aech.close();
                                                throw th2;
                                            }
                                        } else {
                                            i2 = i17;
                                        }
                                        aech = aech4;
                                        try {
                                            if (!query.isNull(21)) {
                                                try {
                                                    i3 = query.getInt(21);
                                                } catch (SQLiteException | IllegalStateException e2) {
                                                    th4 = e2;
                                                    z = c;
                                                    arrayList = arrayList4;
                                                    cursor6 = query;
                                                    Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                    cursor3.moveToNext();
                                                    arrayList4 = arrayList;
                                                    query = cursor3;
                                                    aech4 = aech;
                                                    c = z;
                                                    i12 = 0;
                                                    i13 = 2;
                                                    i14 = 1;
                                                } catch (Throwable th9) {
                                                }
                                            } else {
                                                i3 = i;
                                            }
                                            arrayList3 = arrayList4;
                                            if (!query.isNull(22)) {
                                                i4 = query.getInt(22);
                                            } else {
                                                i4 = 0;
                                            }
                                            long j5 = j4;
                                            if (!query.isNull(23)) {
                                                i5 = query.getInt(23);
                                            } else {
                                                i5 = i4;
                                            }
                                            if (!query.isNull(24)) {
                                                i6 = query.getInt(24);
                                            } else {
                                                i6 = 0;
                                            }
                                            if (mo47400a()) {
                                                i8 = i15;
                                                if (!query.isNull(25)) {
                                                    i7 = i16;
                                                    if (query.getInt(25) != 1) {
                                                        z2 = false;
                                                        string = query.getString(11);
                                                        String str8 = string3;
                                                        String string6 = query.getString(12);
                                                        int i18 = i6;
                                                        i9 = query.getInt(13);
                                                        int i19 = i5;
                                                        String string7 = query.getString(15);
                                                        int i20 = i4;
                                                        int i21 = query.getInt(16);
                                                        int i22 = query.getInt(17);
                                                        if (c) {
                                                            z = c;
                                                            str2 = query.getString(19);
                                                        } else {
                                                            z = c;
                                                            str2 = null;
                                                        }
                                                        int i23 = i22;
                                                        int i24 = !query.isNull(14) ? query.getInt(14) : -1;
                                                        Bundle a2 = m70620a(string6);
                                                        aebo = a2 != null ? aebo.m51579a(a2) : null;
                                                        if (aebo == null) {
                                                            aebo = aebo.f63077a;
                                                            cursor5 = query;
                                                        } else {
                                                            cursor5 = query;
                                                        }
                                                        if (string != null) {
                                                            bundle = m70620a(string);
                                                        } else {
                                                            bundle = null;
                                                        }
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            set = new C1225nr();
                                                            i10 = i24;
                                                            try {
                                                                JSONArray jSONArray2 = new JSONArray(str2);
                                                                int i25 = 0;
                                                                while (true) {
                                                                    str3 = string7;
                                                                    try {
                                                                        if (i25 >= jSONArray2.length()) {
                                                                            break;
                                                                        }
                                                                        set.add(Uri.parse(jSONArray2.getString(i25)));
                                                                        i25++;
                                                                        string7 = str3;
                                                                    } catch (JSONException e3) {
                                                                        e = e3;
                                                                        String valueOf = String.valueOf(e.getMessage());
                                                                        Log.w("NetworkScheduler", valueOf.length() != 0 ? new String("Error parsing required uris: ") : "Error parsing required uris: ".concat(valueOf));
                                                                        long elapsedRealtime = (SystemClock.elapsedRealtime() + j) - System.currentTimeMillis();
                                                                        if (i9 == 0) {
                                                                        }
                                                                        int i26 = i20;
                                                                        aeac.f63095g = i26;
                                                                        aeac.f63096h = i19;
                                                                        aeac.f63104p = i26 == 1;
                                                                        sdo.m34959a(aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                                                                        aeac.f63098j = i18;
                                                                        if (mo47400a()) {
                                                                        }
                                                                        apid = apid.m70356a(aeac.mo33974b(), new ComponentName(str8, str5), elapsedRealtime, i7);
                                                                        apid.f84435e = (long) i8;
                                                                        apid.f84437g = j5;
                                                                        apid.f84442l = 2;
                                                                        apid.f84439i = i10;
                                                                        apid.f84440j = apka.m70504a(i21, i23);
                                                                        cursor3 = cursor5;
                                                                        string2 = cursor3.getString(18);
                                                                        try {
                                                                            jSONArray = new JSONArray(string2);
                                                                            while (i11 < jSONArray.length()) {
                                                                            }
                                                                        } catch (JSONException e4) {
                                                                            Log.e("NetworkScheduler", "JSON exception.", e4);
                                                                        }
                                                                        if (apid == null) {
                                                                        }
                                                                        cursor3.moveToNext();
                                                                        arrayList4 = arrayList;
                                                                        query = cursor3;
                                                                        aech4 = aech;
                                                                        c = z;
                                                                        i12 = 0;
                                                                        i13 = 2;
                                                                        i14 = 1;
                                                                    }
                                                                }
                                                            } catch (JSONException e5) {
                                                                e = e5;
                                                                str3 = string7;
                                                                String valueOf2 = String.valueOf(e.getMessage());
                                                                Log.w("NetworkScheduler", valueOf2.length() != 0 ? new String("Error parsing required uris: ") : "Error parsing required uris: ".concat(valueOf2));
                                                                long elapsedRealtime2 = (SystemClock.elapsedRealtime() + j) - System.currentTimeMillis();
                                                                if (i9 == 0) {
                                                                }
                                                                int i262 = i20;
                                                                aeac.f63095g = i262;
                                                                aeac.f63096h = i19;
                                                                aeac.f63104p = i262 == 1;
                                                                sdo.m34959a(aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                                                                aeac.f63098j = i18;
                                                                if (mo47400a()) {
                                                                }
                                                                apid = apid.m70356a(aeac.mo33974b(), new ComponentName(str8, str5), elapsedRealtime2, i7);
                                                                apid.f84435e = (long) i8;
                                                                apid.f84437g = j5;
                                                                apid.f84442l = 2;
                                                                apid.f84439i = i10;
                                                                apid.f84440j = apka.m70504a(i21, i23);
                                                                cursor3 = cursor5;
                                                                string2 = cursor3.getString(18);
                                                                jSONArray = new JSONArray(string2);
                                                                while (i11 < jSONArray.length()) {
                                                                }
                                                                if (apid == null) {
                                                                }
                                                                cursor3.moveToNext();
                                                                arrayList4 = arrayList;
                                                                query = cursor3;
                                                                aech4 = aech;
                                                                c = z;
                                                                i12 = 0;
                                                                i13 = 2;
                                                                i14 = 1;
                                                            }
                                                        } else {
                                                            str3 = string7;
                                                            i10 = i24;
                                                            set = bnon.f131923a;
                                                        }
                                                        long elapsedRealtime22 = (SystemClock.elapsedRealtime() + j) - System.currentTimeMillis();
                                                        if (i9 == 0) {
                                                            try {
                                                                aebi aebi = new aebi();
                                                                aebi.f63099k = string5;
                                                                aebi.f63097i = string4;
                                                                str = "TaskInfo";
                                                                try {
                                                                    String str9 = string4;
                                                                    aebi.mo34004a(j2 / 1000, j3 / 1000);
                                                                    aebi.mo34028b(i17, i2);
                                                                    aebi.mo34024a(i, i3);
                                                                    aebi.f63102n = z2;
                                                                    aebi.f63107s = bundle;
                                                                    aebi.mo34027b(1);
                                                                    aebi.f63106r = aebo;
                                                                    aebi.mo34025a(set);
                                                                    str5 = str9;
                                                                    aeac = aebi;
                                                                } catch (IllegalArgumentException e6) {
                                                                    illegalArgumentException = e6;
                                                                    cursor3 = cursor5;
                                                                    str6 = str;
                                                                }
                                                            } catch (IllegalArgumentException e7) {
                                                                illegalArgumentException = e7;
                                                                str6 = "TaskInfo";
                                                                cursor3 = cursor5;
                                                                try {
                                                                    String valueOf3 = String.valueOf(illegalArgumentException);
                                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                                                                    sb.append("Failed to construct Task from database: ");
                                                                    sb.append(valueOf3);
                                                                    Log.e(str4, sb.toString());
                                                                    apid = null;
                                                                    if (apid == null) {
                                                                    }
                                                                } catch (SQLiteException | IllegalStateException e8) {
                                                                    e = e8;
                                                                    arrayList = arrayList3;
                                                                    th4 = e;
                                                                    Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                                    cursor3.moveToNext();
                                                                    arrayList4 = arrayList;
                                                                    query = cursor3;
                                                                    aech4 = aech;
                                                                    c = z;
                                                                    i12 = 0;
                                                                    i13 = 2;
                                                                    i14 = 1;
                                                                }
                                                                cursor3.moveToNext();
                                                                arrayList4 = arrayList;
                                                                query = cursor3;
                                                                aech4 = aech;
                                                                c = z;
                                                                i12 = 0;
                                                                i13 = 2;
                                                                i14 = 1;
                                                            }
                                                        } else {
                                                            str = "TaskInfo";
                                                            String str10 = string4;
                                                            if (i9 == 1) {
                                                                aebl aebl = new aebl();
                                                                aebl.f63099k = string5;
                                                                str5 = str10;
                                                                aebl.f63097i = str5;
                                                                aebl.f63070a = j3 / 1000;
                                                                aebl.f63071b = j2 / 1000;
                                                                aebl.mo34028b(i17, i2);
                                                                aebl.mo34024a(i, i3);
                                                                aebl.f63102n = z2;
                                                                aebl.f63107s = bundle;
                                                                aebl.mo34027b(1);
                                                                aebl.f63106r = aebo;
                                                                aebl.mo34025a(set);
                                                                aeac = aebl;
                                                            } else {
                                                                str5 = str10;
                                                                if (i9 == 2) {
                                                                    aeac aeac2 = new aeac();
                                                                    aeac2.f63099k = string5;
                                                                    aeac2.f63097i = str5;
                                                                    aeac2.mo34028b(i17, i2);
                                                                    aeac2.mo34024a(i, i3);
                                                                    aeac2.f63102n = z2;
                                                                    aeac2.f63107s = bundle;
                                                                    aeac2.mo34027b(1);
                                                                    aeac2.f63106r = aebo;
                                                                    aeac2.mo34025a(set);
                                                                    ArrayList arrayList5 = new ArrayList();
                                                                    try {
                                                                        JSONObject jSONObject = new JSONObject(str3);
                                                                        JSONArray jSONArray3 = jSONObject.getJSONArray("uri_flags");
                                                                        JSONArray jSONArray4 = jSONObject.getJSONArray("uris");
                                                                        int length = jSONArray3.length();
                                                                        for (int i27 = 0; i27 < length; i27++) {
                                                                            arrayList5.add(new aeab(Uri.parse(jSONArray4.getString(i27)), jSONArray3.getInt(i27)));
                                                                        }
                                                                    } catch (JSONException e9) {
                                                                        Log.e("NetworkScheduler", "JSON exception.", e9);
                                                                    }
                                                                    aeac2.mo33973a(arrayList5);
                                                                    aeac = aeac2;
                                                                } else {
                                                                    cursor3 = cursor5;
                                                                    StringBuilder sb2 = new StringBuilder(89);
                                                                    sb2.append("TaskType must be either ContentUriTriggeredTask, OneoffTask, or PeriodicTask: ");
                                                                    sb2.append(i9);
                                                                    str4 = str;
                                                                    Log.e(str4, sb2.toString());
                                                                    apid = null;
                                                                    if (apid == null) {
                                                                        arrayList = arrayList3;
                                                                    } else if (apid.f84436f) {
                                                                        arrayList = arrayList3;
                                                                        try {
                                                                            arrayList.add(apid);
                                                                        } catch (SQLiteException | IllegalStateException e10) {
                                                                            e = e10;
                                                                        }
                                                                    } else {
                                                                        arrayList = arrayList3;
                                                                    }
                                                                    cursor3.moveToNext();
                                                                    arrayList4 = arrayList;
                                                                    query = cursor3;
                                                                    aech4 = aech;
                                                                    c = z;
                                                                    i12 = 0;
                                                                    i13 = 2;
                                                                    i14 = 1;
                                                                }
                                                            }
                                                        }
                                                        int i2622 = i20;
                                                        aeac.f63095g = i2622;
                                                        aeac.f63096h = i19;
                                                        aeac.f63104p = i2622 == 1;
                                                        sdo.m34959a(aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                                                        aeac.f63098j = i18;
                                                        if (mo47400a()) {
                                                            aeac.f63102n = z2;
                                                        }
                                                        apid = apid.m70356a(aeac.mo33974b(), new ComponentName(str8, str5), elapsedRealtime22, i7);
                                                        apid.f84435e = (long) i8;
                                                        apid.f84437g = j5;
                                                        apid.f84442l = 2;
                                                        apid.f84439i = i10;
                                                        apid.f84440j = apka.m70504a(i21, i23);
                                                        cursor3 = cursor5;
                                                        string2 = cursor3.getString(18);
                                                        if (string2 != null && !string2.isEmpty()) {
                                                            jSONArray = new JSONArray(string2);
                                                            for (i11 = 0; i11 < jSONArray.length(); i11++) {
                                                                apid.mo47259a(Uri.parse(jSONArray.get(i11).toString()));
                                                            }
                                                        }
                                                        if (apid == null) {
                                                        }
                                                        cursor3.moveToNext();
                                                        arrayList4 = arrayList;
                                                        query = cursor3;
                                                        aech4 = aech;
                                                        c = z;
                                                        i12 = 0;
                                                        i13 = 2;
                                                        i14 = 1;
                                                    }
                                                    z2 = true;
                                                    string = query.getString(11);
                                                    String str82 = string3;
                                                    String string62 = query.getString(12);
                                                    int i182 = i6;
                                                    i9 = query.getInt(13);
                                                    int i192 = i5;
                                                    String string72 = query.getString(15);
                                                    int i202 = i4;
                                                    int i212 = query.getInt(16);
                                                    int i222 = query.getInt(17);
                                                    if (c) {
                                                    }
                                                    int i232 = i222;
                                                    if (!query.isNull(14)) {
                                                    }
                                                    Bundle a22 = m70620a(string62);
                                                    if (a22 != null) {
                                                    }
                                                    if (aebo == null) {
                                                    }
                                                    if (string != null) {
                                                    }
                                                    if (!TextUtils.isEmpty(str2)) {
                                                    }
                                                    long elapsedRealtime222 = (SystemClock.elapsedRealtime() + j) - System.currentTimeMillis();
                                                    if (i9 == 0) {
                                                    }
                                                    int i26222 = i202;
                                                    aeac.f63095g = i26222;
                                                    aeac.f63096h = i192;
                                                    aeac.f63104p = i26222 == 1;
                                                    sdo.m34959a(aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                                                    aeac.f63098j = i182;
                                                    if (mo47400a()) {
                                                    }
                                                    apid = apid.m70356a(aeac.mo33974b(), new ComponentName(str82, str5), elapsedRealtime222, i7);
                                                    apid.f84435e = (long) i8;
                                                    apid.f84437g = j5;
                                                    apid.f84442l = 2;
                                                    apid.f84439i = i10;
                                                    apid.f84440j = apka.m70504a(i212, i232);
                                                    cursor3 = cursor5;
                                                    try {
                                                        string2 = cursor3.getString(18);
                                                        jSONArray = new JSONArray(string2);
                                                        while (i11 < jSONArray.length()) {
                                                        }
                                                    } catch (IllegalArgumentException e11) {
                                                        e = e11;
                                                    } catch (SQLiteException | IllegalStateException e12) {
                                                    }
                                                    if (apid == null) {
                                                    }
                                                    cursor3.moveToNext();
                                                    arrayList4 = arrayList;
                                                    query = cursor3;
                                                    aech4 = aech;
                                                    c = z;
                                                    i12 = 0;
                                                    i13 = 2;
                                                    i14 = 1;
                                                }
                                            } else {
                                                i8 = i15;
                                            }
                                            i7 = i16;
                                            z2 = true;
                                            string = query.getString(11);
                                            String str822 = string3;
                                            String string622 = query.getString(12);
                                            int i1822 = i6;
                                            i9 = query.getInt(13);
                                            int i1922 = i5;
                                            String string722 = query.getString(15);
                                            int i2022 = i4;
                                            int i2122 = query.getInt(16);
                                            int i2222 = query.getInt(17);
                                            if (c) {
                                            }
                                            int i2322 = i2222;
                                            if (!query.isNull(14)) {
                                            }
                                            try {
                                                Bundle a222 = m70620a(string622);
                                                if (a222 != null) {
                                                }
                                                if (aebo == null) {
                                                }
                                            } catch (IllegalArgumentException e13) {
                                                cursor5 = query;
                                                try {
                                                    String valueOf4 = String.valueOf(e13.getMessage());
                                                    if (valueOf4.length() == 0) {
                                                        try {
                                                            str7 = new String("Error reading retry strategy, using default: ");
                                                        } catch (IllegalArgumentException e14) {
                                                            illegalArgumentException = e14;
                                                            cursor3 = cursor5;
                                                            str6 = str;
                                                            String valueOf32 = String.valueOf(illegalArgumentException);
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf32).length() + 40);
                                                            sb3.append("Failed to construct Task from database: ");
                                                            sb3.append(valueOf32);
                                                            Log.e(str4, sb3.toString());
                                                            apid = null;
                                                            if (apid == null) {
                                                            }
                                                            cursor3.moveToNext();
                                                            arrayList4 = arrayList;
                                                            query = cursor3;
                                                            aech4 = aech;
                                                            c = z;
                                                            i12 = 0;
                                                            i13 = 2;
                                                            i14 = 1;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            th4 = e;
                                                            arrayList = arrayList3;
                                                            cursor6 = cursor5;
                                                            Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                            cursor3.moveToNext();
                                                            arrayList4 = arrayList;
                                                            query = cursor3;
                                                            aech4 = aech;
                                                            c = z;
                                                            i12 = 0;
                                                            i13 = 2;
                                                            i14 = 1;
                                                        } catch (IllegalStateException e16) {
                                                            e = e16;
                                                            th4 = e;
                                                            arrayList = arrayList3;
                                                            cursor6 = cursor5;
                                                            Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                            cursor3.moveToNext();
                                                            arrayList4 = arrayList;
                                                            query = cursor3;
                                                            aech4 = aech;
                                                            c = z;
                                                            i12 = 0;
                                                            i13 = 2;
                                                            i14 = 1;
                                                        } catch (Throwable th10) {
                                                        }
                                                    } else {
                                                        str7 = "Error reading retry strategy, using default: ".concat(valueOf4);
                                                    }
                                                    Log.w("NetworkScheduler", str7);
                                                    aebo = aebo.f63077a;
                                                } catch (SQLiteException | IllegalStateException e17) {
                                                    e = e17;
                                                    arrayList2 = arrayList3;
                                                    cursor4 = cursor5;
                                                    th4 = e;
                                                    Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                    cursor3.moveToNext();
                                                    arrayList4 = arrayList;
                                                    query = cursor3;
                                                    aech4 = aech;
                                                    c = z;
                                                    i12 = 0;
                                                    i13 = 2;
                                                    i14 = 1;
                                                } catch (Throwable th11) {
                                                }
                                            }
                                            if (string != null) {
                                            }
                                            try {
                                                if (!TextUtils.isEmpty(str2)) {
                                                }
                                                long elapsedRealtime2222 = (SystemClock.elapsedRealtime() + j) - System.currentTimeMillis();
                                                if (i9 == 0) {
                                                }
                                                int i262222 = i2022;
                                                aeac.f63095g = i262222;
                                                aeac.f63096h = i1922;
                                                aeac.f63104p = i262222 == 1;
                                                sdo.m34959a(aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                                                aeac.f63098j = i1822;
                                                if (mo47400a()) {
                                                }
                                                apid = apid.m70356a(aeac.mo33974b(), new ComponentName(str822, str5), elapsedRealtime2222, i7);
                                                apid.f84435e = (long) i8;
                                                apid.f84437g = j5;
                                                apid.f84442l = 2;
                                                apid.f84439i = i10;
                                                apid.f84440j = apka.m70504a(i2122, i2322);
                                                cursor3 = cursor5;
                                                string2 = cursor3.getString(18);
                                                jSONArray = new JSONArray(string2);
                                                while (i11 < jSONArray.length()) {
                                                }
                                            } catch (IllegalArgumentException e18) {
                                                e = e18;
                                                Cursor cursor7 = cursor5;
                                                illegalArgumentException = e;
                                                str4 = str;
                                                String valueOf322 = String.valueOf(illegalArgumentException);
                                                StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf322).length() + 40);
                                                sb32.append("Failed to construct Task from database: ");
                                                sb32.append(valueOf322);
                                                Log.e(str4, sb32.toString());
                                                apid = null;
                                                if (apid == null) {
                                                }
                                                cursor3.moveToNext();
                                                arrayList4 = arrayList;
                                                query = cursor3;
                                                aech4 = aech;
                                                c = z;
                                                i12 = 0;
                                                i13 = 2;
                                                i14 = 1;
                                            } catch (SQLiteException | IllegalStateException e19) {
                                                e = e19;
                                                Cursor cursor8 = cursor5;
                                                th4 = e;
                                                arrayList = arrayList3;
                                                Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                                cursor3.moveToNext();
                                                arrayList4 = arrayList;
                                                query = cursor3;
                                                aech4 = aech;
                                                c = z;
                                                i12 = 0;
                                                i13 = 2;
                                                i14 = 1;
                                            } catch (Throwable th112) {
                                            }
                                            if (apid == null) {
                                            }
                                        } catch (SQLiteException | IllegalStateException e20) {
                                            e = e20;
                                            cursor4 = query;
                                            arrayList2 = arrayList3;
                                            th4 = e;
                                            Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                            cursor3.moveToNext();
                                            arrayList4 = arrayList;
                                            query = cursor3;
                                            aech4 = aech;
                                            c = z;
                                            i12 = 0;
                                            i13 = 2;
                                            i14 = 1;
                                        } catch (Throwable th12) {
                                        }
                                    } catch (SQLiteException | IllegalStateException e21) {
                                        e = e21;
                                        aech = aech4;
                                        boolean z3 = c;
                                        ArrayList arrayList6 = arrayList4;
                                        cursor4 = query;
                                        th4 = e;
                                        Log.e("NetworkScheduler", "Failed to load task from db", th4);
                                        cursor3.moveToNext();
                                        arrayList4 = arrayList;
                                        query = cursor3;
                                        aech4 = aech;
                                        c = z;
                                        i12 = 0;
                                        i13 = 2;
                                        i14 = 1;
                                    }
                                    cursor3.moveToNext();
                                    arrayList4 = arrayList;
                                    query = cursor3;
                                    aech4 = aech;
                                    c = z;
                                    i12 = 0;
                                    i13 = 2;
                                    i14 = 1;
                                }
                                aech3 = aech4;
                                cursor3 = query;
                                bngx = bngx.m109368a((Collection) arrayList4);
                            } catch (Throwable th13) {
                                th = th13;
                                aech = aech4;
                                cursor3 = query;
                                th2 = th;
                                cursor2 = cursor3;
                                aech.close();
                                throw th2;
                            }
                            try {
                                aech3.close();
                                cursor3.close();
                            } catch (Throwable th14) {
                                th = th14;
                                cursor = cursor3;
                            }
                        } else {
                            aech = aech4;
                            cursor3 = query;
                            Log.e("NetworkScheduler", "Trying to initialise periodic task state from DB, but cursor is invalid.");
                            bngx = bngx.m109376e();
                            aech.close();
                        }
                    } else {
                        aech2 = aech4;
                        try {
                            bngx = bngx.m109376e();
                            aech2.close();
                        } catch (Throwable th15) {
                            th = th15;
                            th3 = th;
                            cursor2 = null;
                            aech.close();
                            throw th2;
                        }
                    }
                    return bngx;
                } catch (Throwable th16) {
                    th = th16;
                    aech2 = aech4;
                    th3 = th;
                    cursor2 = null;
                    aech.close();
                    throw th2;
                }
            } catch (Throwable th17) {
                th = th17;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e22) {
            throw new aplo(e22);
        }
    }

    /* renamed from: a */
    static Bundle m70620a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.length() == 1) {
                    String next2 = jSONObject2.keys().next();
                    int i = jSONObject2.getInt(next2);
                    if (i == 0) {
                        bundle.putInt(next, Integer.parseInt(next2));
                    } else if (i == 1) {
                        bundle.putDouble(next, Double.parseDouble(next2));
                    } else if (i == 2) {
                        bundle.putLong(next, Long.parseLong(next2));
                    } else if (i == 3) {
                        bundle.putBoolean(next, Boolean.parseBoolean(next2));
                    } else if (i == 4) {
                        bundle.putString(next, next2);
                    } else if (i == 5) {
                        bundle.putBundle(next, m70620a(next2));
                    }
                } else {
                    Log.e("NetworkScheduler", str.length() == 0 ? new String("Failed to deserialize extra: ") : "Failed to deserialize extra: ".concat(str));
                    return null;
                }
            }
            return bundle;
        } catch (JSONException e) {
            Log.e("NetworkScheduler", str.length() == 0 ? new String("Invalid format for serialized extras: ") : "Invalid format for serialized extras: ".concat(str));
            return null;
        } catch (NumberFormatException e2) {
            Log.e("NetworkScheduler", str.length() == 0 ? new String("Failed to parse numbers from serializzed extras: ") : "Failed to parse numbers from serializzed extras: ".concat(str));
            return null;
        }
    }

    /* renamed from: a */
    static String m70621a(Bundle bundle) {
        int i;
        String str;
        JSONObject jSONObject = new JSONObject();
        for (String str2 : bundle.keySet()) {
            try {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (!(obj instanceof Integer)) {
                        i = !(obj instanceof Double) ? !(obj instanceof Long) ? !(obj instanceof Boolean) ? !(obj instanceof String) ? obj instanceof Bundle ? 5 : -1 : 4 : 3 : 2 : 1;
                    } else {
                        i = 0;
                    }
                    if (i != -1) {
                        if (i == 5) {
                            str = m70621a((Bundle) obj);
                        } else {
                            str = obj.toString();
                        }
                        if (str != null) {
                            jSONObject2.put(str, i);
                            jSONObject.put(str2, jSONObject2);
                        }
                    }
                }
            } catch (JSONException e) {
                String valueOf = String.valueOf(bundle.get(str2));
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(valueOf).length());
                sb.append("Failed to serialize extra parameter: key: ");
                sb.append(str2);
                sb.append("; value: ");
                sb.append(valueOf);
                Log.e("NetworkScheduler", sb.toString());
                return null;
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final synchronized void mo47398a(apid apid) {
        SQLiteDatabase a;
        sdo.m34959a(apid);
        if (apid.f84435e >= 0 && (a = m70619a(true)) != null) {
            try {
                long j = apid.f84435e;
                StringBuilder sb = new StringBuilder(26);
                sb.append("_id = ");
                sb.append(j);
                a.delete("pending_ops", sb.toString(), null);
            } catch (RuntimeException e) {
                Log.e("NetworkScheduler", "Error removing task.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47399a(apid apid, apid apid2) {
        boolean z;
        String str;
        aech aech = new aech("nts:db:addOrUpdate");
        try {
            sdo.m34959a(apid);
            if (apid2 == null || apid.equals(apid2)) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            if (apid2 != null && apid2.f84436f) {
                if (apid.f84436f) {
                    apid.f84435e = apid2.f84435e;
                } else {
                    mo47398a(apid2);
                }
            }
            if (apid.f84436f || mo47401b()) {
                SQLiteDatabase a = m70619a(true);
                if (a != null) {
                    int i = apid.f84445o;
                    ContentValues contentValues = new ContentValues();
                    if (i == 0) {
                        aebj aebj = (aebj) apid.f84444n;
                        contentValues.put("flex_time", Long.valueOf(aebj.f63068a * 1000));
                        contentValues.put("period", Long.valueOf(aebj.f63069b * 1000));
                    } else if (i != 1) {
                        JSONObject jSONObject = new JSONObject();
                        Set<aeab> set = ((aead) apid.f84444n).f62980a;
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (aeab aeab : set) {
                            jSONArray.put(aeab.f62978b);
                            jSONArray2.put(aeab.f62977a);
                        }
                        jSONObject.put("uri_flags", jSONArray);
                        jSONObject.put("uris", jSONArray2);
                        str = jSONObject.toString();
                        contentValues.put("content_uris", str);
                        JSONArray jSONArray3 = new JSONArray();
                        for (Uri uri : apid.mo47263b()) {
                            jSONArray3.put(uri);
                        }
                        contentValues.put("triggered_content_uris", jSONArray3.toString());
                        i = 2;
                    } else {
                        aebm aebm = (aebm) apid.f84444n;
                        contentValues.put("period", Long.valueOf(aebm.f63072a * 1000));
                        contentValues.put("flex_time", Long.valueOf(aebm.f63073b * 1000));
                    }
                    contentValues.put("runtime", Long.valueOf((apid.f84434d - SystemClock.elapsedRealtime()) + System.currentTimeMillis()));
                    contentValues.put("tag", apid.mo47266e());
                    contentValues.put("target_package", apid.f84431a.f28806b);
                    contentValues.put("target_class", apid.mo47269g());
                    contentValues.put("user_id", Integer.valueOf((int) apid.f84431a.f28809e));
                    contentValues.put("last_runtime", Long.valueOf(apid.f84437g));
                    contentValues.put("service_kind", Integer.valueOf(apid.f84444n.f63113f));
                    if (mo47400a()) {
                        contentValues.put("persistence_level", Integer.valueOf(apid.f84444n.f63117j ? 1 : 0));
                    }
                    aeca aeca = apid.f84444n;
                    int i2 = aeca.f63121n;
                    int i3 = aeca.f63123p;
                    contentValues.put("required_network_type", Integer.valueOf(i2));
                    contentValues.put("requires_charging", Integer.valueOf(i3));
                    aeca aeca2 = apid.f84444n;
                    int i4 = aeca2.f63122o;
                    int i5 = aeca2.f63124q;
                    if (i4 != i2) {
                        contentValues.put("preferred_network_type", Integer.valueOf(i4));
                    }
                    if (i5 != i3) {
                        contentValues.put("preferred_charging_state", Integer.valueOf(i5));
                    }
                    aeca aeca3 = apid.f84444n;
                    int i6 = aeca3.f63125r;
                    int i7 = aeca3.f63126s;
                    contentValues.put("required_idleness_state", Integer.valueOf(i6));
                    if (i7 != i6) {
                        contentValues.put("preferred_idleness_state", Integer.valueOf(i7));
                    }
                    Bundle bundle = apid.f84444n.f63120m;
                    if (bundle != null) {
                        contentValues.put("extras", m70621a(bundle));
                    }
                    aebo aebo = apid.f84444n.f63119l;
                    Bundle bundle2 = new Bundle();
                    aebo.mo34012b(bundle2);
                    contentValues.put("retry_strategy", m70621a(bundle2));
                    contentValues.put("task_type", Integer.valueOf(i));
                    contentValues.put("job_id", Integer.valueOf(apid.f84439i));
                    contentValues.put("source", Integer.valueOf(apid.mo47274k()));
                    contentValues.put("source_version", Integer.valueOf(apid.mo47275l()));
                    if (cedu.m136334c()) {
                        Set<Uri> set2 = apid.f84444n.f63118k;
                        JSONArray jSONArray4 = new JSONArray();
                        for (Uri uri2 : set2) {
                            jSONArray4.put(uri2.toString());
                        }
                        contentValues.put("required_uris", jSONArray4.toString());
                    }
                    long j = apid.f84435e;
                    if (j == -1) {
                        apid.f84435e = a.insert("pending_ops", null, contentValues);
                    } else {
                        contentValues.put("_id", Long.valueOf(j));
                        a.replace("pending_ops", null, contentValues);
                    }
                }
            }
        } catch (JSONException e) {
            Log.e("NetworkScheduler", "JSON exception.", e);
            str = null;
        } catch (Throwable th) {
            try {
                aech.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        aech.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47400a() {
        return this.f84704a.mo47396a() && cdnn.m134231b();
    }
}
