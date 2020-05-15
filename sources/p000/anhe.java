package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: anhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhe {

    /* renamed from: e */
    private static final Flag[] f76852e = new Flag[0];

    /* renamed from: f */
    private static final String[] f76853f = new String[0];

    /* renamed from: g */
    private static final Configurations f76854g = new Configurations("", "", new Configuration[0], false, null, 0);

    /* renamed from: a */
    public String f76855a;

    /* renamed from: b */
    public final String f76856b;

    /* renamed from: c */
    public final String f76857c;

    /* renamed from: d */
    String f76858d;

    /* renamed from: h */
    private final String f76859h;

    /* renamed from: i */
    private final boolean f76860i = cgem.m144888c();

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public anhe(String str, String str2, String str3, String str4, String str5) {
        this.f76855a = str;
        this.f76856b = str2;
        this.f76857c = str3;
        this.f76858d = str4;
        this.f76859h = str5;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations
     arg types: [java.util.TreeSet, java.util.TreeSet, java.lang.String, anhd, int]
     candidates:
      anhe.a(android.database.sqlite.SQLiteDatabase, int, java.lang.String, anhd, com.google.android.gms.phenotype.Flag[]):com.google.android.gms.phenotype.Configurations
      anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations */
    /* renamed from: a */
    private final Configurations m64380a(SQLiteDatabase sQLiteDatabase, int i, String str, anhd anhd, Flag[] flagArr) {
        Throwable th;
        Throwable th2;
        Flag[] flagArr2 = flagArr;
        TreeSet treeSet = new TreeSet(Flag.f82097j);
        Cursor query = sQLiteDatabase.query("Flags", anfq.f76775b, "packageName = ?", new String[]{this.f76855a}, null, null, null);
        while (query.moveToNext()) {
            try {
                treeSet.add(m64382a(query));
            } catch (Throwable th3) {
                bqye.m113761a(th, th3);
            }
        }
        if (query != null) {
            query.close();
        }
        TreeSet treeSet2 = new TreeSet(Flag.f82097j);
        Cursor query2 = sQLiteDatabase.query("Flags", anfq.f76775b, "packageName = ? AND version = ? AND user = ? AND committed = 0", new String[]{this.f76855a, Integer.toString(i), this.f76856b}, null, null, "name");
        try {
            if (this.f76860i) {
                if (!anfe.m64150a(sQLiteDatabase, this.f76855a, i, this.f76856b, false, query2)) {
                    String str2 = this.f76855a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 71);
                    sb.append("Can't return configuration for package ");
                    sb.append(str2);
                    sb.append(" due to detected flag corruption");
                    throw new anfx(sb.toString());
                }
            }
            while (query2.moveToNext()) {
                Flag a = m64382a(query2);
                treeSet2.add(a);
                treeSet.remove(a);
            }
            if (query2 != null) {
                query2.close();
            }
            if (flagArr2 != null) {
                for (Flag flag : flagArr2) {
                    treeSet2.remove(flag);
                    treeSet2.add(flag);
                    treeSet.remove(flag);
                }
            }
            return m64381a((Set) treeSet2, (Set) treeSet, str, anhd, false);
        } catch (Throwable th4) {
            bqye.m113761a(th2, th4);
        }
        throw th;
        throw th2;
    }

    /* renamed from: b */
    static int m64386b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Throwable th;
        Throwable th2;
        String str3 = str;
        if (str3.equals("com.google.EMPTY")) {
            return 0;
        }
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{str3}, null, null, null);
        try {
            if (query.moveToFirst()) {
                int i = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                Cursor query2 = sQLiteDatabase.query("ExperimentTokens", new String[]{"version"}, "packageName = ? AND version <= ? AND user = ? AND isCommitted = 0", new String[]{str3, Integer.toString(i), str2}, null, null, "version DESC", "1");
                try {
                    if (query2.moveToFirst()) {
                        int i2 = query2.getInt(0);
                        if (query2 != null) {
                            query2.close();
                        }
                        return i2;
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    return i;
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
            } else {
                throw new anfy(29503);
            }
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
        throw th;
        throw th2;
    }

    /* renamed from: b */
    public static boolean m64387b(String str) {
        if (m64383a()) {
            return cgcr.m144764b().f165797a.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    static Configurations m64381a(Set set, Set set2, String str, anhd anhd, boolean z) {
        TextUtils.join(", ", set);
        TextUtils.join(", ", set2);
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Flag flag = (Flag) it.next();
            angv.m64356a(hashMap, Integer.valueOf(flag.f82106h), flag);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            Flag flag2 = (Flag) it2.next();
            angv.m64356a(hashMap2, Integer.valueOf(flag2.f82106h), flag2);
        }
        ArrayList arrayList = new ArrayList();
        HashSet<Integer> hashSet = new HashSet();
        hashSet.addAll(hashMap.keySet());
        hashSet.addAll(hashMap2.keySet());
        for (Integer num : hashSet) {
            Collection collection = (Collection) hashMap.get(num);
            Collection<Flag> collection2 = (Collection) hashMap2.get(num);
            Flag[] flagArr = f76852e;
            if (collection != null) {
                flagArr = (Flag[]) collection.toArray(new Flag[collection.size()]);
            }
            String[] strArr = f76853f;
            if (collection2 != null) {
                strArr = new String[collection2.size()];
                int i = 0;
                for (Flag flag3 : collection2) {
                    strArr[i] = flag3.f82099a;
                    i++;
                }
            }
            arrayList.add(new Configuration(num.intValue(), flagArr, strArr));
        }
        return new Configurations(str, anhd.f76850c, (Configuration[]) arrayList.toArray(new Configuration[arrayList.size()]), z, anhd.f76849b, anhd.f76851d);
    }

    /* renamed from: a */
    static Flag m64382a(Cursor cursor) {
        boolean z;
        int i = cursor.getInt(0);
        String string = cursor.getString(1);
        if (!cursor.isNull(2)) {
            return new Flag(new HashSet(), string, cursor.getLong(2), false, 0.0d, "", new byte[0], 1, i);
        } else if (!cursor.isNull(3)) {
            if (cursor.getInt(3) != 0) {
                z = true;
            } else {
                z = false;
            }
            return new Flag(new HashSet(), string, 0, z, 0.0d, "", new byte[0], 2, i);
        } else if (!cursor.isNull(4)) {
            return new Flag(new HashSet(), string, 0, false, cursor.getDouble(4), "", new byte[0], 3, i);
        } else if (!cursor.isNull(5)) {
            return new Flag(new HashSet(), string, 0, false, 0.0d, cursor.getString(5), new byte[0], 4, i);
        } else if (!cursor.isNull(6)) {
            return new Flag(string, cursor.getBlob(6), i);
        } else {
            String valueOf = String.valueOf(string);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Flag without value: ") : "Flag without value: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public static boolean m64383a() {
        aytw.m84814b();
        return cgcr.m144765c();
    }

    /* renamed from: a */
    static Flag[] m64384a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query;
        Cursor query2 = sQLiteDatabase.query("FlagOverrides", anfq.f76775b, null, null, null, null, "1");
        try {
            if (query2.getCount() != 0) {
                if (query2 != null) {
                    query2.close();
                }
                int i = 0;
                Cursor query3 = sQLiteDatabase.query("FlagOverrides", anfq.f76775b, "packageName = ? AND user = '*' AND committed = 0", new String[]{str}, null, null, null);
                try {
                    Cursor query4 = sQLiteDatabase.query("FlagOverrides", anfq.f76775b, "packageName = ? AND user = ? AND committed = 0", new String[]{str, str2}, null, null, null);
                    try {
                        if (query3.getCount() + query4.getCount() == 0) {
                            query = sQLiteDatabase.query("FlagOverrides", anfq.f76775b, "packageName != ? AND committed = 1", null, null, null, null, "1");
                            if (query.getCount() != 0) {
                                Flag[] flagArr = f76852e;
                                query.close();
                                if (query4 != null) {
                                    query4.close();
                                }
                                if (query3 != null) {
                                    query3.close();
                                }
                                return flagArr;
                            }
                            query.close();
                            if (query4 != null) {
                                query4.close();
                            }
                            if (query3 != null) {
                                query3.close();
                            }
                            return null;
                        }
                        Flag[] flagArr2 = new Flag[(query3.getCount() + query4.getCount())];
                        while (query3.moveToNext()) {
                            int i2 = i + 1;
                            flagArr2[i] = m64382a(query3);
                            i = i2;
                        }
                        while (query4.moveToNext()) {
                            int i3 = i + 1;
                            flagArr2[i] = m64382a(query4);
                            i = i3;
                        }
                        if (query4 != null) {
                            query4.close();
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        return flagArr2;
                    } catch (Throwable th) {
                        if (query4 != null) {
                            query4.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (query3 != null) {
                        try {
                            query3.close();
                        } catch (Throwable th3) {
                            bqye.m113761a(th2, th3);
                        }
                    }
                    throw th2;
                }
            } else {
                if (query2 != null) {
                    query2.close();
                }
                return null;
            }
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
        throw th;
    }

    /* renamed from: a */
    public static String[] m64385a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(" ", 9);
        int length = split.length;
        if (length == 8 || length == 7) {
            return split;
        }
        return null;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:19:0x0062 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:314:0x0557 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:294:0x0516 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:299:0x0528 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:172:0x0321 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:247:0x046b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:186:0x0380 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String], assign insn: 0x002c: CONST_STR  (r4v1 ? I:java.lang.String) =  "" */
    /* JADX WARN: Type inference failed for: r4v4, assign insn: PHI: (r4v4 ?) = (r4v1 ?), (r4v5 ?), (r4v5 ?), (r4v7 ?), (r4v10 ?) binds: [B:19:0x0062, B:314:0x0557, B:315:?, B:294:0x0516, B:299:0x0528] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.sqlite.SQLiteDatabase], assign insn: PHI: (r4v5 ?) = (r4v6 ?), (r4v13 ?), (r4v14 ?), (r4v22 ?), (r4v26 ?) binds: [B:306:0x053f, B:288:0x050b, B:274:0x04ea, B:264:0x04a3, B:255:0x047b] */
    /* JADX WARN: Type inference failed for: r4v6, assign insn: 0x053f: MOVE  (r4v6 ? I:?[OBJECT, ARRAY]) = (r6v0 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v7, assign insn: PHI: (r4v7 ?) = (r4v1 ?), (r4v36 ?), (r4v41 ?) binds: [B:69:0x0140, B:293:0x0515, B:130:0x0218] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.database.sqlite.SQLiteDatabase], assign insn: 0x0526: MOVE  (r4v10 ? I:?[OBJECT, ARRAY]) = (r22v0 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v11, assign insn: PHI: (r4v11 ?) = (r4v1 ?), (r4v25 ?), (r4v37 ?), (r4v38 ?) binds: [B:292:0x0513, B:253:0x0476, B:272:0x04e8, B:262:0x049e] */
    /* JADX WARN: Type inference failed for: r4v13, assign insn: 0x050c: MOVE  (r4v13 ? I:?[OBJECT, ARRAY]) = (r6v0 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v14, assign insn: 0x04eb: MOVE  (r4v14 ? I:?[OBJECT, ARRAY]) = (r22v3 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v15, assign insn: PHI: (r4v15 ?) = (r4v1 ?), (r4v25 ?), (r4v28 ?), (r4v25 ?), (r4v25 ?), (r4v25 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?) binds: [B:266:0x04a9, B:175:0x0346, B:247:0x046b, B:209:0x03e7, B:234:0x0457, B:221:0x0413, B:93:0x01c2, B:116:0x01f2, B:107:0x01e4, B:108:?, B:100:0x01d9, B:101:?, B:284:0x0506] */
    /* JADX WARN: Type inference failed for: r4v22, assign insn: 0x04a4: MOVE  (r4v22 ? I:?[OBJECT, ARRAY]) = (r15v3 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v23, assign insn: PHI: (r4v23 ?) = (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v25 ?), (r4v25 ?), (r4v25 ?) binds: [B:122:0x0206, B:123:?, B:136:0x0236, B:144:0x0248, B:154:0x0261, B:155:?, B:162:0x027c, B:172:0x0321, B:173:?, B:205:0x03b6] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.String], assign insn: 0x02ec: INVOKE  (r4v25 ? I:java.lang.String) = (r5v9 java.lang.StringBuilder) type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String */
    /* JADX WARN: Type inference failed for: r4v26, assign insn: 0x047c: MOVE  (r4v26 ? I:?[OBJECT, ARRAY]) = (r17v3 android.database.sqlite.SQLiteDatabase) */
    /* JADX WARN: Type inference failed for: r4v28, assign insn: PHI: (r4v28 ?) = (r4v25 ?), (r4v39 ?), (r4v40 ?) binds: [B:241:0x0462, B:203:0x03ae, B:193:0x038e] */
    /* JADX WARN: Type inference failed for: r4v30, assign insn: PHI: (r4v30 ?) = (r4v25 ?), (r4v32 ?) binds: [B:198:0x039c, B:186:0x0380] */
    /* JADX WARN: Type inference failed for: r4v31, assign insn: PHI: (r4v31 ?) = (r4v25 ?), (r4v32 ?) binds: [B:183:0x0360, B:184:?] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.String], assign insn: 0x0371: INVOKE  (r4v32 ? I:java.lang.String) = (r1v41 java.lang.String), (r24v0 java.lang.String) type: VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String */
    /* JADX WARN: Type inference failed for: r4v33, assign insn: PHI: (r4v33 ?) = (r4v32 ?), (r4v32 ?), (r4v25 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?), (r4v1 ?) binds: [B:189:0x0386, B:190:?, B:167:0x0312, B:149:0x0252, B:139:0x0241, B:140:?, B:133:0x0221, B:125:0x020e] */
    /* JADX WARN: Type inference failed for: r4v36, assign insn: ?: MOVE  (r4v36 ?) = (r4v11 ?) */
    /* JADX WARN: Type inference failed for: r4v37, assign insn: ?: MOVE  (r4v37 ?) = (r4v15 ?) */
    /* JADX WARN: Type inference failed for: r4v38, assign insn: ?: MOVE  (r4v38 ?) = (r4v23 ?) */
    /* JADX WARN: Type inference failed for: r4v39, assign insn: ?: MOVE  (r4v39 ?) = (r4v30 ?) */
    /* JADX WARN: Type inference failed for: r4v40, assign insn: ?: MOVE  (r4v40 ?) = (r4v31 ?) */
    /* JADX WARN: Type inference failed for: r4v41, assign insn: ?: MOVE  (r4v41 ?) = (r4v33 ?) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations
     arg types: [java.util.TreeSet, java.util.TreeSet, ?, anhd, int]
     candidates:
      anhe.a(android.database.sqlite.SQLiteDatabase, int, java.lang.String, anhd, com.google.android.gms.phenotype.Flag[]):com.google.android.gms.phenotype.Configurations
      anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01dc, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01df, code lost:
        r10 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r5 = p000.anhd.f76848a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e2, code lost:
        if (r8 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f6, code lost:
        r22 = r6;
        r10 = null;
        r3 = r14;
        r17 = 4;
        r18 = 2;
        r5 = p000.anhd.f76848a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0218, code lost:
        r1 = r0;
        r22 = r15;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0498, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0499, code lost:
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04a3, code lost:
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x050a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x050b, code lost:
        r1 = r0;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x050e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x050f, code lost:
        r1 = r0;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0551, code lost:
        r1 = p000.anhe.f76854g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0553, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0132, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        if (r8 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0140, code lost:
        r1 = r0;
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (p000.cgec.m144834i() == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a3, code lost:
        r22 = r6;
        r3 = r14;
        r17 = 4;
        r17 = 4;
        r17 = 4;
        r18 = 2;
        r18 = 2;
        r18 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r8 = r6.query("ExperimentTokens", new java.lang.String[]{"serverToken"}, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new java.lang.String[]{r7.f76855a, java.lang.Integer.toString(r2), r7.f76856b}, null, null, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ca, code lost:
        if (r8.moveToFirst() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cc, code lost:
        r10 = null;
        r9 = new p000.anhd(null, r8.getString(0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d7, code lost:
        if (r8 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0221 A[SYNTHETIC, Splitter:B:133:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0241 A[SYNTHETIC, Splitter:B:139:0x0241] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f2 A[Catch:{ anfy -> 0x04a2, anfx -> 0x049d, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0465 A[SYNTHETIC, Splitter:B:243:0x0465] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0480 A[Catch:{ all -> 0x04fa, all -> 0x0504, all -> 0x044d, all -> 0x0455, all -> 0x01e8, all -> 0x01f0, anfy -> 0x04e9, anfx -> 0x04e7, all -> 0x04e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0498 A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r15 10  PHI: (r15v5 android.database.sqlite.SQLiteDatabase) = (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v7 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase) binds: [B:122:0x0206, B:123:?, B:136:0x0236, B:144:0x0248, B:154:0x0261, B:155:?, B:162:0x027c, B:172:0x0321, B:173:?, B:205:0x03b6, B:189:0x0386, B:190:?, B:167:0x0312, B:149:0x0252, B:139:0x0241, B:140:?, B:133:0x0221, B:125:0x020e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:136:0x0236] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04a2 A[ExcHandler: anfy (r0v12 'e' anfy A[CUSTOM_DECLARE]), PHI: r15 10  PHI: (r15v3 android.database.sqlite.SQLiteDatabase) = (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v7 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v11 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase), (r15v2 android.database.sqlite.SQLiteDatabase) binds: [B:122:0x0206, B:123:?, B:136:0x0236, B:144:0x0248, B:154:0x0261, B:155:?, B:162:0x027c, B:172:0x0321, B:173:?, B:205:0x03b6, B:189:0x0386, B:190:?, B:167:0x0312, B:149:0x0252, B:139:0x0241, B:140:?, B:133:0x0221, B:125:0x020e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:122:0x0206] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x050e A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x051c A[Catch:{ all -> 0x053a, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0537 A[Catch:{ all -> 0x053a, all -> 0x0558 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:294:0x0516=Splitter:B:294:0x0516, B:314:0x0557=Splitter:B:314:0x0557} */
    /* renamed from: a */
    public final Configurations mo41834a(Context context, anfw anfw) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        Configurations configurations;
        anfy anfy;
        SQLiteDatabase sQLiteDatabase3;
        anfx anfx;
        int i;
        char c;
        char c2;
        String str;
        anhd anhd;
        Flag[] flagArr;
        String str2;
        String a;
        boolean z;
        boolean z2;
        Throwable th2;
        int i2;
        Cursor query;
        Throwable th3;
        Cursor query2;
        Throwable th4;
        Throwable th5;
        anhd anhd2;
        Throwable th6;
        String str3 = this.f76855a;
        if (str3 != null) {
            String str4 = this.f76858d;
            if (str4 == null) {
                throw new anfy(29500, "No target package");
            } else if (str3.endsWith(str4) || this.f76855a.equals("com.google.EMPTY")) {
                String str5 = this.f76856b;
                if (str5 != null) {
                    ? r4 = "";
                    if (str5.equals(r4) || angd.m64196a(this.f76856b, context)) {
                        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
                        anfw.m64180a(writableDatabase);
                        this.f76855a = angb.m64192a(this.f76855a, this.f76859h);
                        String a2 = angb.m64192a(this.f76858d, this.f76859h);
                        this.f76858d = a2;
                        try {
                            if (this.f76855a.equals(a2)) {
                                i = 0;
                            } else {
                                i = 0;
                                Cursor query3 = writableDatabase.query("LogSources", new String[]{"packageName"}, "packageName = ?", new String[]{this.f76855a}, null, null, "1");
                                try {
                                    int count = query3.getCount();
                                    if (query3 != null) {
                                        query3.close();
                                    }
                                    if (count > 0) {
                                        throw new anfy(29500, "Alternate package cannot have log sources");
                                    }
                                } catch (anfy e) {
                                    anfy = e;
                                    r4 = sQLiteDatabase3;
                                } catch (anfx e2) {
                                    e = e2;
                                    r4 = r4;
                                    anfx = e;
                                    r4 = r4;
                                    try {
                                        if (anfx.f76790a != 29512) {
                                        }
                                        throw anfx;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteDatabase2 = r4;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            if (m64387b(this.f76858d)) {
                                if (!this.f76856b.equals(r4)) {
                                    sQLiteDatabase3 = writableDatabase;
                                    String str6 = this.f76856b;
                                    String str7 = this.f76858d;
                                    StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 47 + String.valueOf(str7).length());
                                    sb.append("Can't commit to ");
                                    sb.append(str6);
                                    sb.append(" for direct boot aware package ");
                                    sb.append(str7);
                                    throw new anfy(29500, sb.toString());
                                }
                            }
                            int b = m64386b(writableDatabase, this.f76855a, this.f76856b);
                            Flag[] a3 = m64384a(writableDatabase, this.f76858d, this.f76856b);
                            if (a3 != null) {
                                Flag[] flagArr2 = a3;
                                int length = flagArr2.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    Flag flag = flagArr2[i3];
                                    if (flag.f82099a.equals("__phenotype_server_token")) {
                                        if (flag.f82105g == 4) {
                                            anhd = new anhd(null, flag.mo46502d(), 0);
                                            sQLiteDatabase3 = writableDatabase;
                                            str = null;
                                            flagArr = flagArr2;
                                            c2 = 4;
                                            c = 2;
                                            break;
                                        }
                                    }
                                    i3++;
                                }
                            } else {
                                String[] strArr = new String[3];
                                strArr[i] = "experimentToken";
                                strArr[1] = "serverToken";
                                strArr[2] = "servingVersion";
                                String[] strArr2 = new String[3];
                                strArr2[i] = this.f76855a;
                                strArr2[1] = Integer.toString(b);
                                strArr2[2] = this.f76856b;
                                Flag[] flagArr3 = a3;
                                Cursor query4 = writableDatabase.query("ExperimentTokens", strArr, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", strArr2, null, null, null, null);
                                if (query4.moveToFirst()) {
                                    anhd2 = new anhd(query4.getBlob(i), query4.getString(1), query4.getLong(2));
                                    if (query4 != null) {
                                        query4.close();
                                    }
                                } else {
                                    anhd2 = anhd.f76848a;
                                    if (query4 != null) {
                                        query4.close();
                                    }
                                }
                                sQLiteDatabase3 = writableDatabase;
                                anhd = anhd2;
                                flagArr = flagArr3;
                                str = null;
                                c2 = 4;
                                c = 2;
                            }
                            SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase3;
                            try {
                                Pair a4 = anfw.m64176a(sQLiteDatabase4, this.f76858d, this.f76856b);
                                String str8 = this.f76857c;
                                if (str8 != null) {
                                    String[] a5 = m64385a(str8);
                                    if (a5 != null) {
                                        str2 = a5[c2];
                                        a = a4 == null ? anfo.m64164a(sQLiteDatabase4, this.f76858d, ((Integer) a4.second).intValue(), (String) a4.first, true) : str;
                                        String a6 = anfo.m64164a(sQLiteDatabase4, this.f76855a, b, this.f76856b, false);
                                        if (flagArr != null) {
                                            if (flagArr != f76852e) {
                                                z = false;
                                                boolean equals = str2.equals(a);
                                                if (!z) {
                                                    z2 = false;
                                                } else {
                                                    if (equals) {
                                                        if (cgec.f186635a.mo6606a().mo83528i()) {
                                                            z2 = true;
                                                        }
                                                    }
                                                    z2 = false;
                                                }
                                                String str9 = this.f76856b;
                                                String str10 = this.f76855a;
                                                Flag[] flagArr4 = flagArr;
                                                String str11 = r4;
                                                long a7 = anfm.m64161a(sQLiteDatabase4, str10);
                                                String str12 = this.f76858d;
                                                if (a == null) {
                                                    a = str11;
                                                }
                                                String str13 = !z2 ? "0" : "1";
                                                String str14 = "0";
                                                anhd anhd3 = anhd;
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 38 + String.valueOf(str10).length() + String.valueOf(a6).length() + String.valueOf(str12).length() + String.valueOf(a).length() + str13.length());
                                                sb2.append(str9);
                                                sb2.append(" ");
                                                sb2.append(str10);
                                                sb2.append(" ");
                                                sb2.append(b);
                                                sb2.append(" ");
                                                sb2.append(a7);
                                                sb2.append(" ");
                                                sb2.append(a6);
                                                sb2.append(" ");
                                                sb2.append(str12);
                                                sb2.append(" ");
                                                sb2.append(a);
                                                sb2.append(" ");
                                                sb2.append(str13);
                                                r4 = sb2.toString();
                                                if (z2) {
                                                    String str15 = (String) a4.first;
                                                    int intValue = ((Integer) a4.second).intValue();
                                                    TreeSet treeSet = new TreeSet();
                                                    TreeSet treeSet2 = new TreeSet(Flag.f82097j);
                                                    Flag[] c3 = anhb.m64375c(sQLiteDatabase4, this.f76858d);
                                                    if (c3 != null) {
                                                        for (Flag flag2 : c3) {
                                                            treeSet.add(flag2);
                                                            treeSet2.add(flag2);
                                                        }
                                                    }
                                                    String[] strArr3 = anfq.f76775b;
                                                    String[] strArr4 = new String[3];
                                                    strArr4[0] = this.f76858d;
                                                    strArr4[1] = Integer.toString(intValue);
                                                    strArr4[c] = str15;
                                                    String str16 = str14;
                                                    SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase4;
                                                    try {
                                                        Cursor query5 = sQLiteDatabase4.query("Flags", strArr3, "packageName = ? AND version = ? AND user = ? AND committed = 1", strArr4, null, null, "name");
                                                        try {
                                                            if (!this.f76860i) {
                                                                i2 = b;
                                                                sQLiteDatabase4 = sQLiteDatabase5;
                                                            } else if (!anfe.m64150a(sQLiteDatabase5, this.f76858d, intValue, str15, true, query5)) {
                                                                try {
                                                                    r4 = String.valueOf(r4.substring(0, r4.length() - 1)).concat(str16);
                                                                    sQLiteDatabase4 = sQLiteDatabase5;
                                                                    try {
                                                                        configurations = m64380a(sQLiteDatabase5, b, (String) r4, anhd3, f76852e);
                                                                        if (query5 != null) {
                                                                            query5.close();
                                                                        }
                                                                        sQLiteDatabase3 = sQLiteDatabase4;
                                                                    } catch (Throwable th9) {
                                                                        th2 = th9;
                                                                        sQLiteDatabase3 = sQLiteDatabase4;
                                                                        r4 = r4;
                                                                        if (query5 != null) {
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th2 = th10;
                                                                    sQLiteDatabase3 = sQLiteDatabase5;
                                                                    r4 = r4;
                                                                    if (query5 != null) {
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                i2 = b;
                                                                sQLiteDatabase4 = sQLiteDatabase5;
                                                            }
                                                            while (query5.moveToNext()) {
                                                                try {
                                                                    Flag a8 = m64382a(query5);
                                                                    if (!treeSet2.contains(a8)) {
                                                                        treeSet.add(a8);
                                                                        treeSet2.add(a8);
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    sQLiteDatabase3 = sQLiteDatabase4;
                                                                    th2 = th;
                                                                    if (query5 != null) {
                                                                        try {
                                                                            query5.close();
                                                                        } catch (Throwable th12) {
                                                                            bqye.m113761a(th2, th12);
                                                                        }
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                            if (query5 != null) {
                                                                query5.close();
                                                            }
                                                            TreeSet treeSet3 = new TreeSet();
                                                            TreeSet treeSet4 = new TreeSet(Flag.f82097j);
                                                            String[] strArr5 = anfq.f76775b;
                                                            String[] strArr6 = new String[3];
                                                            strArr6[0] = this.f76855a;
                                                            strArr6[1] = Integer.toString(i2);
                                                            strArr6[c] = this.f76856b;
                                                            sQLiteDatabase3 = sQLiteDatabase4;
                                                            query = sQLiteDatabase4.query("Flags", strArr5, "packageName = ? AND version = ? AND user = ? AND committed = 0", strArr6, null, null, "name");
                                                            if (this.f76860i) {
                                                                if (!anfe.m64150a(sQLiteDatabase3, this.f76855a, i2, this.f76856b, false, query)) {
                                                                    String str17 = this.f76855a;
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str17).length() + 71);
                                                                    sb3.append("Can't return configuration for package ");
                                                                    sb3.append(str17);
                                                                    sb3.append(" due to detected flag corruption");
                                                                    throw new anfx(sb3.toString());
                                                                }
                                                            }
                                                            while (query.moveToNext()) {
                                                                Flag a9 = m64382a(query);
                                                                treeSet3.add(a9);
                                                                treeSet4.add(a9);
                                                            }
                                                            if (query != null) {
                                                                query.close();
                                                            }
                                                            treeSet3.removeAll(treeSet);
                                                            treeSet2.removeAll(treeSet4);
                                                            configurations = m64381a((Set) treeSet3, (Set) treeSet2, (String) r4, anhd3, true);
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            sQLiteDatabase3 = sQLiteDatabase5;
                                                            th2 = th;
                                                            if (query5 != null) {
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (anfy e3) {
                                                        anfy = e3;
                                                        r4 = sQLiteDatabase5;
                                                        if (anfy.f76792a == 29503) {
                                                        }
                                                        throw anfy;
                                                    } catch (anfx e4) {
                                                        e = e4;
                                                        sQLiteDatabase3 = sQLiteDatabase5;
                                                        anfx = e;
                                                        r4 = r4;
                                                        if (anfx.f76790a != 29512) {
                                                        }
                                                        throw anfx;
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        sQLiteDatabase = sQLiteDatabase5;
                                                        sQLiteDatabase.endTransaction();
                                                        throw th;
                                                    }
                                                } else {
                                                    sQLiteDatabase3 = sQLiteDatabase4;
                                                    configurations = m64380a(sQLiteDatabase3, b, (String) r4, anhd3, flagArr4);
                                                }
                                                sQLiteDatabase3.setTransactionSuccessful();
                                                sQLiteDatabase3.endTransaction();
                                                return configurations;
                                            }
                                        }
                                        z = true;
                                        boolean equals2 = str2.equals(a);
                                        if (!z) {
                                        }
                                        String str92 = this.f76856b;
                                        String str102 = this.f76855a;
                                        Flag[] flagArr42 = flagArr;
                                        String str112 = r4;
                                        long a72 = anfm.m64161a(sQLiteDatabase4, str102);
                                        String str122 = this.f76858d;
                                        if (a == null) {
                                        }
                                        if (!z2) {
                                        }
                                        String str142 = "0";
                                        anhd anhd32 = anhd;
                                        StringBuilder sb22 = new StringBuilder(String.valueOf(str92).length() + 38 + String.valueOf(str102).length() + String.valueOf(a6).length() + String.valueOf(str122).length() + String.valueOf(a).length() + str13.length());
                                        sb22.append(str92);
                                        sb22.append(" ");
                                        sb22.append(str102);
                                        sb22.append(" ");
                                        sb22.append(b);
                                        sb22.append(" ");
                                        sb22.append(a72);
                                        sb22.append(" ");
                                        sb22.append(a6);
                                        sb22.append(" ");
                                        sb22.append(str122);
                                        sb22.append(" ");
                                        sb22.append(a);
                                        sb22.append(" ");
                                        sb22.append(str13);
                                        r4 = sb22.toString();
                                        if (z2) {
                                        }
                                        sQLiteDatabase3.setTransactionSuccessful();
                                        sQLiteDatabase3.endTransaction();
                                        return configurations;
                                    }
                                }
                                str2 = "!";
                                if (a4 == null) {
                                }
                                String a62 = anfo.m64164a(sQLiteDatabase4, this.f76855a, b, this.f76856b, false);
                                if (flagArr != null) {
                                }
                                z = true;
                                boolean equals22 = str2.equals(a);
                                if (!z) {
                                }
                                String str922 = this.f76856b;
                                String str1022 = this.f76855a;
                                Flag[] flagArr422 = flagArr;
                                String str1122 = r4;
                                long a722 = anfm.m64161a(sQLiteDatabase4, str1022);
                                String str1222 = this.f76858d;
                                if (a == null) {
                                }
                                if (!z2) {
                                }
                                String str1422 = "0";
                                anhd anhd322 = anhd;
                                StringBuilder sb222 = new StringBuilder(String.valueOf(str922).length() + 38 + String.valueOf(str1022).length() + String.valueOf(a62).length() + String.valueOf(str1222).length() + String.valueOf(a).length() + str13.length());
                                sb222.append(str922);
                                sb222.append(" ");
                                sb222.append(str1022);
                                sb222.append(" ");
                                sb222.append(b);
                                sb222.append(" ");
                                sb222.append(a722);
                                sb222.append(" ");
                                sb222.append(a62);
                                sb222.append(" ");
                                sb222.append(str1222);
                                sb222.append(" ");
                                sb222.append(a);
                                sb222.append(" ");
                                sb222.append(str13);
                                r4 = sb222.toString();
                                if (z2) {
                                }
                                sQLiteDatabase3.setTransactionSuccessful();
                                sQLiteDatabase3.endTransaction();
                            } catch (anfy e5) {
                            } catch (anfx e6) {
                                e = e6;
                                sQLiteDatabase3 = sQLiteDatabase4;
                                r4 = r4;
                                anfx = e;
                                r4 = r4;
                                if (anfx.f76790a != 29512) {
                                }
                                throw anfx;
                            } catch (Throwable th15) {
                            }
                        } catch (anfy e7) {
                            r4 = writableDatabase;
                            anfy = e7;
                        } catch (anfx e8) {
                            e = e8;
                            sQLiteDatabase3 = writableDatabase;
                            anfx = e;
                            r4 = r4;
                            if (anfx.f76790a != 29512) {
                                sQLiteDatabase3.endTransaction();
                                anfw.m64180a(sQLiteDatabase3);
                                r4 = sQLiteDatabase3;
                                anfw.m64181a((SQLiteDatabase) r4, this.f76855a, this.f76856b, m64386b(r4, this.f76855a, this.f76856b));
                                r4.setTransactionSuccessful();
                            }
                            throw anfx;
                        } catch (Throwable th16) {
                        }
                        return configurations;
                    }
                    throw new anfy(29500, "Invalid user");
                }
                throw new anfy(29500, "No user");
            } else {
                throw new anfy(29500, "Invalid alternate configuration name");
            }
        } else {
            throw new anfy(29500, "No source package");
        }
        throw th4;
        throw th6;
        th = th;
        sQLiteDatabase = sQLiteDatabase2;
        sQLiteDatabase.endTransaction();
        throw th;
        throw th3;
        throw th5;
    }
}
