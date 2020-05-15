package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: anhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhj {

    /* renamed from: c */
    private static final byte[][] f76868c = new byte[0][];

    /* renamed from: d */
    private static final int[] f76869d = {14900366};

    /* renamed from: g */
    private static final anhh f76870g = new anhh();

    /* renamed from: h */
    private static final ExperimentTokens f76871h = ExperimentTokens.f82082a.mo46492a();

    /* renamed from: i */
    private static final byte[][] f76872i = new byte[0][];

    /* renamed from: a */
    public String f76873a;

    /* renamed from: b */
    public final String f76874b;

    /* renamed from: e */
    private final String f76875e;

    /* renamed from: f */
    private final String f76876f;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public anhj(String str, String str2, String str3) {
        this(str, str2, null, str3);
    }

    /* renamed from: a */
    private static Map m64398a(SQLiteDatabase sQLiteDatabase, int i, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT token, provenance, fromUser FROM CrossLoggedExperimentTokens WHERE isCommitted = 1 AND toPackageName = ? AND toVersion = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() != 0) {
                HashMap hashMap = new HashMap();
                while (rawQuery.moveToNext()) {
                    angv.m64356a(hashMap, Integer.valueOf(rawQuery.getInt(1)), rawQuery.getBlob(0));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return hashMap;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static Set m64404b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(true, "Packages", new String[]{"packageName"}, "androidPackageName = ?", new String[]{str}, null, null, null, null);
        try {
            HashSet a = bnpf.m110048a(query.getCount());
            while (query.moveToNext()) {
                a.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private static int m64405c(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToFirst()) {
                int i = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i;
            } else if (query == null) {
                return -1;
            } else {
                query.close();
                return -1;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public anhj(String str, String str2, String str3, String str4) {
        this.f76873a = str;
        this.f76874b = str2;
        this.f76875e = str3 == null ? "" : str3;
        this.f76876f = str4;
    }

    /* renamed from: a */
    private static Set m64399a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"packageName"}, null, null, null, null, null);
        try {
            HashSet a = bnpf.m110048a(query.getCount());
            while (query.moveToNext()) {
                a.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final ExperimentTokens mo41836b(anfw anfw) {
        String str = this.f76874b;
        if (str == null && this.f76873a == null) {
            throw new anfy(29500, "No package name or log source");
        } else if (str != null && this.f76873a != null) {
            throw new anfy(29500, "Both package name and log source specified");
        } else if (this.f76876f != null) {
            ExperimentTokens a = mo41835a(anfw);
            if (a != null) {
                return a.mo46492a();
            }
            throw new anfy(29505, "No config packages for log source, or config package not registered");
        } else {
            throw new anfy(29500, "Calling package must be specified");
        }
    }

    /* renamed from: a */
    private static Set m64400a(SQLiteDatabase sQLiteDatabase, String str) {
        Set<String> b = m64404b(sQLiteDatabase, str);
        bxwc bxwc = cgde.f186589a.mo6606a().mo83510a().f165797a;
        HashSet hashSet = new HashSet();
        for (String str2 : b) {
            if (bxwc.contains(angb.m64191a(str2))) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static void m64401a() {
        f76870g.mo15548a();
    }

    /* renamed from: a */
    private static byte[] m64402a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        Cursor query = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken"}, "user = ? AND packageName = ? AND version = ? AND isCommitted = 1", new String[]{str, str2, Integer.toString(i)}, null, null, null);
        try {
            if (query.moveToFirst()) {
                byte[] blob = query.getBlob(0);
                if (query != null) {
                    query.close();
                }
                return blob;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static byte[][] m64403a(Collection collection) {
        return collection != null ? (byte[][]) collection.toArray(f76872i) : f76872i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        if (r4 != null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0178, code lost:
        if (r4 != null) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0526 A[Catch:{ all -> 0x0511, all -> 0x0519, all -> 0x0467, all -> 0x046f, all -> 0x035b, all -> 0x0363, all -> 0x02d0, all -> 0x02d8, all -> 0x01a2, all -> 0x01aa, all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0533 A[Catch:{ all -> 0x0511, all -> 0x0519, all -> 0x0467, all -> 0x046f, all -> 0x035b, all -> 0x0363, all -> 0x02d0, all -> 0x02d8, all -> 0x01a2, all -> 0x01aa, all -> 0x0562 }] */
    /* renamed from: a */
    public final ExperimentTokens mo41835a(anfw anfw) {
        String str;
        Pair pair;
        ExperimentTokens experimentTokens;
        ExperimentTokens experimentTokens2;
        ArrayList arrayList;
        String str2;
        ExperimentTokens experimentTokens3;
        String str3;
        byte[][] bArr;
        byte[] bArr2;
        int i;
        int i2;
        String str4;
        int[] iArr;
        Cursor query;
        Throwable th;
        int[] iArr2;
        Map map;
        Cursor query2;
        Throwable th2;
        Cursor rawQuery;
        Throwable th3;
        Cursor query3;
        Throwable th4;
        byte[][] bArr3;
        Throwable th5;
        Set set;
        String a = angb.m64192a(this.f76873a, this.f76876f);
        this.f76873a = a;
        String str5 = this.f76874b;
        String str6 = this.f76875e;
        int i3 = 2;
        int i4 = 1;
        if (a == null) {
            String str7 = this.f76876f;
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 2 + String.valueOf(str7).length() + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(":");
            sb.append(str7);
            sb.append(":");
            sb.append(str6);
            str = sb.toString();
        } else if (bdyj.m91582b(a)) {
            String str8 = this.f76876f;
            StringBuilder sb2 = new StringBuilder(a.length() + 2 + String.valueOf(str8).length() + String.valueOf(str6).length());
            sb2.append(a);
            sb2.append(":");
            sb2.append(str8);
            sb2.append(":");
            sb2.append(str6);
            str = sb2.toString();
        } else {
            String str9 = this.f76876f;
            StringBuilder sb3 = new StringBuilder(a.length() + 1 + String.valueOf(str9).length());
            sb3.append(a);
            sb3.append(":");
            sb3.append(str9);
            str = sb3.toString();
        }
        ExperimentTokens experimentTokens4 = (ExperimentTokens) f76870g.mo15546a(str);
        if (experimentTokens4 == null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            anfw.m64180a(writableDatabase);
            String str10 = this.f76873a;
            String str11 = this.f76874b;
            String str12 = this.f76876f;
            char c = 0;
            if (str10 != null) {
                pair = ".metrics".equals(str10) ? new Pair(m64399a(writableDatabase), anhi.DEVICE) : str10.startsWith("app:") ? new Pair(m64404b(writableDatabase, str10.substring(4)), anhi.APP) : new Pair(Collections.singleton(str10), anhi.REGULAR);
            } else if (cgcn.m144758b().f165797a.contains(str11)) {
                pair = new Pair(m64399a(writableDatabase), anhi.DEVICE);
            } else {
                if (cgew.f186700a.mo6606a().mo83575a()) {
                    beah b = cgcc.f186555a.mo6606a().mo83490b();
                    String valueOf = String.valueOf(angb.m64193b(str12));
                    bxwc bxwc = ((bydj) b.mo58476a(valueOf.length() == 0 ? new String("ph_appcfg_") : "ph_appcfg_".concat(valueOf), bydj.f165795b, anga.f76795a)).f165797a;
                    if (!bxwc.contains(str11)) {
                        if (!bxwc.contains("_ALL_APP_LOG_SOURCES") && !cgcc.f186555a.mo6606a().mo83489a().f165797a.contains(str11)) {
                        }
                    }
                    pair = new Pair(m64404b(writableDatabase, str12), anhi.APP);
                }
                Cursor rawQuery2 = writableDatabase.rawQuery("SELECT DISTINCT LogSources.packageName FROM LogSources JOIN Packages ON LogSources.packageName = Packages.packageName WHERE logSourceName = ? AND androidPackageName = ?", new String[]{str11, str12});
                try {
                    if (rawQuery2.getCount() != 0) {
                        set = bnpf.m110048a(rawQuery2.getCount());
                        while (rawQuery2.moveToNext()) {
                            set.add(rawQuery2.getString(0));
                        }
                    } else {
                        set = Collections.emptySet();
                    }
                    rawQuery2.close();
                    if (cget.f186695a.mo6606a().mo83572b()) {
                        if (!set.isEmpty()) {
                            set.addAll(m64400a(writableDatabase, str12));
                        } else {
                            set = m64400a(writableDatabase, str12);
                        }
                    }
                    pair = new Pair(set, anhi.REGULAR);
                } catch (Throwable th6) {
                    writableDatabase.endTransaction();
                    throw th6;
                }
            }
            Set<String> set2 = (Set) pair.first;
            String str13 = this.f76875e;
            anhi anhi = (anhi) pair.second;
            ArrayList arrayList2 = new ArrayList(set2.size());
            for (String str14 : set2) {
                if (!bdyj.m91582b(str14)) {
                    Pair a2 = anfl.m64159a(writableDatabase, str14);
                    if (a2 != null) {
                        String str15 = (String) a2.first;
                        int intValue = ((Integer) a2.second).intValue();
                        i = intValue;
                        str3 = str15;
                        bArr2 = m64402a(writableDatabase, str15, str14, intValue);
                        str4 = str14;
                        arrayList = arrayList2;
                        str2 = str13;
                        i2 = 0;
                        bArr = null;
                    } else {
                        int c2 = m64405c(writableDatabase, str14);
                        if (c2 >= 0) {
                            str4 = str14;
                            arrayList = arrayList2;
                            str2 = str13;
                            i = c2;
                            str3 = "";
                            i2 = 0;
                            bArr2 = null;
                            bArr = null;
                        } else {
                            arrayList = arrayList2;
                            str2 = str13;
                            experimentTokens3 = null;
                            if (experimentTokens3 != null) {
                                arrayList.add(experimentTokens3);
                                str13 = str2;
                                arrayList2 = arrayList;
                                i3 = 2;
                                i4 = 1;
                                c = 0;
                            } else {
                                str13 = str2;
                                arrayList2 = arrayList;
                                i3 = 2;
                                i4 = 1;
                                c = 0;
                            }
                        }
                    }
                } else {
                    int ordinal = anhi.ordinal();
                    if (ordinal == 0) {
                        str4 = str14;
                        arrayList = arrayList2;
                        str2 = str13;
                        i2 = 0;
                        Integer a3 = anfs.m64167a(writableDatabase, str4, str2);
                        if (a3 != null) {
                            int intValue2 = a3.intValue();
                            str3 = str2;
                            bArr2 = m64402a(writableDatabase, str2, str4, a3.intValue());
                            i = intValue2;
                            bArr = null;
                        } else {
                            int c3 = m64405c(writableDatabase, str4);
                            if (c3 >= 0) {
                                str3 = str2;
                                i = c3;
                                bArr2 = null;
                                bArr = null;
                            } else {
                                experimentTokens3 = null;
                                if (experimentTokens3 != null) {
                                }
                            }
                        }
                    } else if (ordinal == i4 || ordinal == i3) {
                        String[] strArr = new String[i4];
                        strArr[c] = "experimentToken";
                        String[] strArr2 = new String[i4];
                        strArr2[c] = str14;
                        str4 = str14;
                        arrayList = arrayList2;
                        str2 = str13;
                        i2 = 0;
                        query3 = writableDatabase.query("ExperimentTokens", strArr, "packageName = ? AND isCommitted = 1", strArr2, null, null, null);
                        if (query3.getCount() > 0) {
                            bArr3 = new byte[query3.getCount()][];
                            int i5 = 0;
                            while (query3.moveToNext()) {
                                bArr3[i5] = query3.getBlob(0);
                                i5++;
                            }
                            if (query3 != null) {
                                query3.close();
                            }
                        } else {
                            if (query3 != null) {
                                query3.close();
                            }
                            bArr3 = null;
                        }
                        bArr = bArr3;
                        str3 = "";
                        i = Integer.MIN_VALUE;
                        bArr2 = null;
                    } else {
                        str4 = str14;
                        arrayList = arrayList2;
                        str2 = str13;
                        str3 = "";
                        i2 = 0;
                        i = Integer.MIN_VALUE;
                        bArr2 = null;
                        bArr = null;
                    }
                }
                if (bArr2 == null) {
                    String[] strArr3 = new String[1];
                    strArr3[i2] = str4;
                    String b2 = anfw.m64185b(strArr3);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(b2).length() + 66);
                    sb4.append("SELECT experimentId FROM WeakExperimentIds WHERE packageName IN (");
                    sb4.append(b2);
                    sb4.append(")");
                    rawQuery = writableDatabase.rawQuery(sb4.toString(), strArr3);
                    int[] iArr3 = new int[rawQuery.getCount()];
                    int i6 = 0;
                    while (rawQuery.moveToNext()) {
                        int i7 = i6 + 1;
                        iArr3[i6] = rawQuery.getInt(i2);
                        i6 = i7;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    iArr = iArr3;
                } else {
                    iArr = null;
                }
                String[] strArr4 = new String[1];
                strArr4[i2] = "packageName";
                int[] iArr4 = iArr;
                int i8 = i;
                query = writableDatabase.query("FlagOverrides", strArr4, "committed = 1", null, null, null, null, "1");
                int count = query.getCount();
                if (query != null) {
                    query.close();
                }
                if (count > 0) {
                    int[] iArr5 = iArr4;
                    if (iArr5 != null) {
                        int[] copyOf = Arrays.copyOf(iArr5, iArr5.length + 1);
                        copyOf[copyOf.length - 1] = 14900366;
                        iArr2 = copyOf;
                    } else {
                        iArr2 = f76869d;
                    }
                    experimentTokens3 = new ExperimentTokens(str3, null, f76868c, f76868c, f76868c, f76868c, iArr2, null, null);
                } else if (anhi == anhi.DEVICE) {
                    experimentTokens3 = new ExperimentTokens(str3, bArr2, f76868c, f76868c, f76868c, f76868c, iArr4, bArr, null);
                } else {
                    if (!bdyj.m91582b(str4) || anhi != anhi.APP) {
                        map = m64398a(writableDatabase, i8, str4);
                    } else {
                        String[] strArr5 = new String[2];
                        strArr5[i2] = "user";
                        strArr5[1] = "version";
                        String[] strArr6 = new String[1];
                        strArr6[i2] = str4;
                        query2 = writableDatabase.query("MultiCommitApplicationStates", strArr5, "packageName = ?", strArr6, null, null, null);
                        HashMap hashMap = new HashMap(query2.getCount());
                        while (query2.moveToNext()) {
                            hashMap.put(query2.getString(i2), Integer.valueOf(query2.getInt(1)));
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                        HashSet<Integer> hashSet = new HashSet(hashMap.values());
                        map = new HashMap();
                        for (Integer num : hashSet) {
                            Map a4 = m64398a(writableDatabase, num.intValue(), str4);
                            if (a4 != null) {
                                for (Map.Entry entry : a4.entrySet()) {
                                    for (byte[] bArr4 : (List) entry.getValue()) {
                                        angv.m64356a(map, (Integer) entry.getKey(), bArr4);
                                    }
                                }
                            }
                        }
                        if (map.isEmpty()) {
                            map = null;
                        }
                    }
                    if (map != null) {
                        experimentTokens3 = new ExperimentTokens(str3, bArr2, m64403a((Collection) map.get(1)), m64403a((Collection) map.get(2)), m64403a((Collection) map.get(3)), m64403a((Collection) map.get(4)), iArr4, bArr, null);
                    } else {
                        experimentTokens3 = new ExperimentTokens(str3, bArr2, f76868c, f76868c, f76868c, f76868c, iArr4, bArr, null);
                    }
                }
                if (experimentTokens3 != null) {
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                experimentTokens = ExperimentTokens.m68219a(arrayList3);
            } else {
                experimentTokens = null;
            }
            anhh anhh = f76870g;
            if (experimentTokens == null) {
                experimentTokens2 = f76871h;
            } else {
                experimentTokens2 = experimentTokens;
            }
            anhh.mo15547a(str, experimentTokens2);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return experimentTokens;
        } else if (experimentTokens4 != f76871h) {
            return experimentTokens4;
        } else {
            return null;
        }
        throw th2;
        throw th3;
        throw th4;
        throw th;
        throw th5;
    }
}
