package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: abvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvo extends srp {

    /* renamed from: a */
    private static abvo f58554a = null;

    /* renamed from: b */
    private static final abyo f58555b = new abyo();

    /* renamed from: c */
    private final Context f58556c;

    /* renamed from: d */
    private abxt f58557d;

    /* renamed from: e */
    private final Set f58558e = new HashSet();

    /* renamed from: a */
    private static long m48333a(SQLiteDatabase sQLiteDatabase, abww abww) {
        return m48334a(sQLiteDatabase, abww.mo32394a());
    }

    /* renamed from: c */
    private final void m48347c(SQLiteDatabase sQLiteDatabase) {
        for (String str : fua.m12400a(sQLiteDatabase, "_seq_table")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append("DROP TABLE [");
            sb.append(str);
            sb.append("]");
            sQLiteDatabase.execSQL(sb.toString());
        }
        for (String str2 : fua.m12400a(sQLiteDatabase, "_indexapi")) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
            sb2.append("DROP TABLE [");
            sb2.append(str2);
            sb2.append("]");
            sQLiteDatabase.execSQL(sb2.toString());
        }
        onCreate(sQLiteDatabase);
    }

    /* renamed from: b */
    public final void mo32364b(Set set, abyy abyy, abrv abrv, int i) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            CorpusStatus b = abrv.mo32315b(abyy, abww.mo32395b(), abww.f58662b);
            if (b.f9523a) {
                m48342a(getWritableDatabase(), abww, abyy, b, abrv, i);
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        int i3 = i;
        while (true) {
            if (i3 > i2) {
                if (i3 != 9 || !((Boolean) abzt.f58860aA.mo58455c()).booleanValue()) {
                    break;
                }
                i3--;
            } else {
                int i4 = i;
                while (i4 > i2) {
                    if (i4 == 9) {
                        try {
                            for (String str : fua.m12400a(sQLiteDatabase, "_seq_table")) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
                                sb.append("DROP INDEX IF EXISTS [");
                                sb.append(str);
                                sb.append("_uri_index]");
                                sQLiteDatabase.execSQL(sb.toString());
                            }
                            i4--;
                        } catch (Exception e) {
                            m48340a(i, i2, i4, e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i = i4;
            }
        }
        if (i != i2) {
            m48347c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        boolean z2;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (i3 == 7) {
                    z2 = ((Boolean) abzt.f58910ay.mo58455c()).booleanValue();
                } else if (i3 != 8) {
                    break;
                } else {
                    z2 = ((Boolean) abzt.f58911az.mo58455c()).booleanValue();
                }
                if (!z2) {
                    break;
                }
                i3++;
            } else {
                int i4 = i;
                while (i4 < i2) {
                    if (i4 == 7) {
                        for (String str : fua.m12400a(sQLiteDatabase, "_seq_table")) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
                            sb.append("ALTER TABLE [");
                            sb.append(str);
                            sb.append("] ADD [tag] STRING");
                            sQLiteDatabase.execSQL(sb.toString());
                        }
                    } else if (i4 == 8) {
                        try {
                            for (String str2 : fua.m12400a(sQLiteDatabase, "_seq_table")) {
                                sQLiteDatabase.execSQL(abxu.m48515b(str2));
                            }
                        } catch (Exception e) {
                            m48340a(i, i2, i4, e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                    i4++;
                }
                i = i4;
            }
        }
        if (i != i2) {
            m48347c(sQLiteDatabase);
        }
    }

    public abvo(Context context, int i) {
        super(context, "icing-indexapi.db", "icing-indexapi.db", i);
        this.f58556c = context;
    }

    /* renamed from: a */
    private static long m48334a(SQLiteDatabase sQLiteDatabase, String str) {
        if (fua.m12404c(sQLiteDatabase, str)) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, abxu.m48513a(str));
        }
        return 0;
    }

    /* renamed from: a */
    public static synchronized abvo m48335a(Context context) {
        abvo abvo;
        synchronized (abvo.class) {
            if (f58554a == null) {
                int intValue = ((Integer) abzt.f58863aD.mo58455c()).intValue();
                if (intValue == -1) {
                    intValue = 9;
                }
                f58554a = new abvo(context, intValue);
            }
            abvo = f58554a;
        }
        return abvo;
    }

    /* renamed from: a */
    public static abvo m48336a(Context context, String str) {
        if (abzt.m48729c(str)) {
            return m48335a(context);
        }
        return null;
    }

    /* renamed from: a */
    public static List m48337a(abrv abrv, List list, String[] strArr) {
        int i;
        ArrayList arrayList = new ArrayList(strArr.length);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            absr absr = (absr) list.get(i2);
            bxvd da = abub.f58337e.mo74144da();
            int i3 = ((abzi) abzm.m48654b(absr).get("thing_proto")).f58806a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abub abub = (abub) da.f164949b;
            abub.f58339a |= 1;
            abub.f58340b = i3;
            abub abub2 = (abub) da.mo74062i();
            bxvd da2 = abtu.f58310g.mo74144da();
            int i4 = absr.f58137b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abtu abtu = (abtu) da2.f164949b;
            abtu.f58312a |= 1;
            abtu.f58313b = i4;
            abub2.getClass();
            abtu.mo32345a();
            abtu.f58314c.add(abub2);
            bxvd da3 = abud.f58349v.mo74144da();
            da3.mo73981a((abtu) da2.mo74062i());
            abuh a = abrv.f58078n.mo43395a(strArr, (abud) da3.mo74062i());
            abue abue = (abue) ((abug) a.f58392d.get(0)).f58385a.get(0);
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = i2 + 1;
                if (i5 >= a.f58390b) {
                    break;
                }
                try {
                    arrayList.add((caef) GeneratedMessageLite.m124012a(caef.f172809f, abue.f58375b.mo73754a(i6, abue.f58374a.mo74151b(i5) + i6).mo73760e()));
                    i6 += abue.f58374a.mo74151b(i5);
                    i5++;
                } catch (bxwf e) {
                    throw new IllegalArgumentException("Failed to deserialize bytes", e);
                }
            }
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Set m48338a(Set set, String str) {
        return m48339a(set, Arrays.asList(str));
    }

    /* renamed from: a */
    public static Set m48339a(Set set, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            if (list.contains(abww.f58661a.f58531b)) {
                hashSet.add(abww);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private final void m48340a(int i, int i2, int i3, Exception exc) {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        if (i > i2) {
            str = "downgrade";
        } else {
            str = "upgrade";
        }
        objArr[0] = str;
        objArr[1] = "icing-indexapi.db";
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(i3);
        String format = String.format(locale, "Could not %s %s from version %d to version %d; error occurred at version %d.", objArr);
        absg.m48189a(exc, format);
        new abyp(this.f58556c).mo32456a(format, exc, cema.m137235b());
    }

    /* renamed from: a */
    public static void m48341a(SQLiteDatabase sQLiteDatabase, abww abww, long j) {
        String a = abww.mo32394a();
        absg.m48194b("Cleaning sequence table '%s' where seqno <= %d: deleted %d rows", a, Long.valueOf(j), Integer.valueOf(sQLiteDatabase.delete(abxu.m48513a(a), "seqno<=?", new String[]{String.valueOf(j)})));
    }

    /* renamed from: a */
    public static void m48342a(SQLiteDatabase sQLiteDatabase, abww abww, abyy abyy, CorpusStatus corpusStatus, abrv abrv, int i) {
        Throwable th;
        CorpusStatus corpusStatus2 = corpusStatus;
        abrv abrv2 = abrv;
        bpws a = acxi.m49935a(abrv2.f58066b);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (((bpws) bxvd.f164949b).f139566g) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpws bpws = (bpws) bxvd.f164949b;
            bpws bpws2 = bpws.f139558h;
            bpws.f139561b = bpzc.m112420a(i);
            bpws.f139560a |= 1;
            abrv2.f58083s.mo32440a((bpws) bxvd.mo74062i());
        }
        String str = abww.f58662b;
        String b = abww.mo32395b();
        Cursor query = sQLiteDatabase.query("sqlite_sequence", new String[]{"seq"}, "name=?", new String[]{abww.mo32394a()}, null, null, null);
        try {
            long j = query.moveToNext() ? query.getLong(0) : 0;
            if (query != null) {
                query.close();
            }
            if (j > corpusStatus2.f9524b) {
                absg.m48194b("Requesting indexing of '%s', maxSeqno/lastIndexedSeqno: %d/%d.", b, Long.valueOf(j), Long.valueOf(corpusStatus2.f9524b));
                RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
                requestIndexingCall$Request.f107405a = str;
                requestIndexingCall$Request.f107406b = b;
                requestIndexingCall$Request.f107407c = j;
                acpl acpl = abrv2.f58067c;
                acpl.mo32995d(new abvk(abrv2.f58066b, acpl, abrv.mo32298a(), abrv2.f58079o, abrv2.f58081q, requestIndexingCall$Request, abyy, b));
                return;
            }
            return;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    private static void m48343a(SQLiteDatabase sQLiteDatabase, abyy abyy, abrv abrv, Set set) {
        String str = abyy.f58780f;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            m48341a(sQLiteDatabase, abww, abrv.mo32315b(abyy, abww.mo32395b(), str).f9525c);
        }
    }

    /* renamed from: a */
    public static void m48344a(PrintWriter printWriter, Context context) {
        abvo a = m48336a(context, context.getPackageName());
        if (a == null) {
            String valueOf = String.valueOf(context.getPackageName());
            printWriter.println(valueOf.length() == 0 ? new String("3P app indexing is disabled for package: ") : "3P app indexing is disabled for package: ".concat(valueOf));
            return;
        }
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        String path = readableDatabase.getPath();
        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 12);
        sb.append("\nTables in ");
        sb.append(path);
        sb.append(":");
        printWriter.println(sb.toString());
        for (String str : fua.m12400a(readableDatabase, new String[0])) {
            printWriter.format(" %3d row(s) | %s\n", Long.valueOf(DatabaseUtils.queryNumEntries(readableDatabase, abxu.m48513a(str))), str);
        }
    }

    /* renamed from: a */
    public static void m48345a(String str, abrv abrv, abxt abxt) {
        SQLiteDatabase writableDatabase;
        try {
            if (abrv.f58077m.mo32506d(str) != null) {
                try {
                    writableDatabase = m48335a(abrv.f58066b).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    for (abww abww : abvn.m48330a(writableDatabase, str, abxt)) {
                        String a = abww.mo32394a();
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 23);
                        sb.append("DROP TABLE IF EXISTS [");
                        sb.append(a);
                        sb.append("]");
                        writableDatabase.execSQL(sb.toString());
                    }
                    writableDatabase.delete("type_indexapi", "app_name = ?", new String[]{str});
                    writableDatabase.delete("incarnation_indexapi", "app_name = ?", new String[]{str});
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (RuntimeException e) {
                    RuntimeException runtimeException = e;
                    String valueOf = String.valueOf(str);
                    String str2 = valueOf.length() == 0 ? new String("Failed to unregister package: ") : "Failed to unregister package: ".concat(valueOf);
                    absg.m48189a(runtimeException, str2);
                    abrv.f58083s.mo32447a("index_api_unregister_failed");
                    abrv.mo32331n().mo32457a(str2, runtimeException, f58555b, cema.m137235b(), abzt.f58925bM, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (NullPointerException e2) {
            String valueOf2 = String.valueOf(str);
            absg.m48189a(e2, valueOf2.length() == 0 ? new String("Failed to unregister package: ") : "Failed to unregister package: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    private static final boolean m48346a(SQLiteDatabase sQLiteDatabase, long j, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (m48333a(sQLiteDatabase, (abww) it.next()) > j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final Set mo32359a(SQLiteDatabase sQLiteDatabase, Set set, abyy abyy, abxt abxt) {
        sdo.m34970a(sQLiteDatabase.inTransaction());
        String str = abyy.f58780f;
        absg.m48185a("Running 'clear' for client '%s'.", str);
        Set a = abvn.m48330a(sQLiteDatabase, str, abxt);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            if (set == null || set.contains(abww.f58661a.f58531b)) {
                String a2 = abww.mo32394a();
                absg.m48194b("Clearing sequence table: '%s' by deleting %d rows, remaining %d rows", a2, Integer.valueOf(sQLiteDatabase.delete(abxu.m48513a(a2), null, null)), Long.valueOf(m48334a(sQLiteDatabase, a2)));
            } else {
                it.remove();
            }
        }
        absg.m48185a("Corpora: %d", Integer.valueOf(a.size()));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING PRIMARY KEY, [%s] STRING)", "incarnation_indexapi", "app_name", "incarnation"));
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING, [%s] STRING, PRIMARY KEY([%s], [%s]))", "type_indexapi", "app_name", "type", "app_name", "type"));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo32360a(SQLiteDatabase sQLiteDatabase, abyy abyy, abrv abrv, abxt abxt, int i) {
        sdo.m34974b(sQLiteDatabase.inTransaction());
        String str = abyy.f58780f;
        long max = Math.max(0L, ((Long) abzt.f58946bh.mo58455c()).longValue() - ((long) i));
        Set<abww> a = abvn.m48330a(sQLiteDatabase, str, abxt);
        m48343a(sQLiteDatabase, abyy, abrv, a);
        if (!m48346a(sQLiteDatabase, max, a)) {
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                abrv.mo32323f();
                sQLiteDatabase.beginTransaction();
                m48343a(sQLiteDatabase, abyy, abrv, a);
                if (!m48346a(sQLiteDatabase, max, a)) {
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    try {
                        for (abww abww : a) {
                            CorpusStatus b = abrv.mo32315b(abyy, abww.mo32395b(), str);
                            if (b.f9523a && m48333a(sQLiteDatabase, abww) > max) {
                                m48342a(sQLiteDatabase, abww, abyy, b, abrv, 7);
                            }
                        }
                        sQLiteDatabase.beginTransaction();
                        throw new abxw();
                    } catch (Throwable th) {
                        sQLiteDatabase.beginTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                sQLiteDatabase.beginTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final void mo32361a(SQLiteDatabase sQLiteDatabase, String[] strArr, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            sdo.m34974b(sQLiteDatabase.inTransaction());
            for (String str : strArr) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("uri", str);
                contentValues.put("action", "del");
                sQLiteDatabase.insertOrThrow(abxu.m48513a(abww.mo32394a()), null, contentValues);
            }
        }
    }

    /* renamed from: a */
    public final void mo32362a(Set set, abyy abyy, abrv abrv, int i) {
        abrv abrv2 = abrv;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abww abww = (abww) it.next();
            String str = abww.f58662b;
            String b = abww.mo32395b();
            CorpusStatus b2 = abrv2.mo32315b(abyy, b, str);
            if (!b2.f9523a || Integer.parseInt(b2.f9528f) != abww.f58661a.f58534e) {
                absg.m48185a("Couldn't find corpus '%s'.", b);
                abrv2.f58067c.mo32995d(new abvj(this, this.f58556c, abrv, abxu.m48512a(abww), abyy, b, abww, b2, abrv, i));
            } else {
                m48342a(getWritableDatabase(), abww, abyy, b2, abrv, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r12 = new java.util.HashMap();
        r2 = getWritableDatabase();
        r2.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = p000.abvn.m48332b(r2, r10, r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r3.hasNext() == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r4 = (android.util.Pair) r3.next();
        r5 = (p000.abww) r4.first;
        r4 = (java.lang.String) r4.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r9.mo32424a(p000.abww.m48415b(r4)) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r6 = r5.mo32394a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (p000.fua.m12404c(r2, r6) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r7 = new java.util.ArrayList();
        r14 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 21);
        r14.append("PRAGMA table_info([");
        r14.append(r6);
        r14.append("])");
        r6 = r2.rawQuery(r14.toString(), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r6.moveToNext() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r7.add(r6.getString(r6.getColumnIndexOrThrow("name")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r6 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        r6 = new java.util.ArrayList();
        r13 = p000.abxu.m48514a(r5.f58661a).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r13.hasNext() == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        r6.add((java.lang.String) ((android.util.Pair) r13.next()).first);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        java.util.Collections.sort(r7);
        java.util.Collections.sort(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r7.equals(r6) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r6 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p000.bqye.m113761a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e7, code lost:
        p000.abvn.m48331a(r2, r5.f58662b, r4);
        r4 = p000.abww.m48412a(r4, r10);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 23);
        r6.append("DROP TABLE IF EXISTS [");
        r6.append(r4);
        r6.append("]");
        r2.execSQL(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        r3 = p000.abvn.m48330a(r2, r10, r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        if (r3.hasNext() == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0123, code lost:
        r12.put((p000.abww) r3.next(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0131, code lost:
        r2.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r2.endTransaction();
        r13 = r8.f58780f;
        r14 = r0.f58077m.mo32505c(r13);
        r15 = r19.mo32298a();
        r16 = r15.mo32524a(r14).listIterator();
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        if (r16.hasNext() == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        r6 = (p000.acak) r16.next();
        r3 = r15.mo32543d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        if (r3 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0161, code lost:
        r4 = p000.abww.m48411a(r3.f58138c, r13, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        if (r4 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        if (r12.containsKey(r4) == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016f, code lost:
        r12.put(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0182, code lost:
        if (((java.lang.Boolean) p000.acaw.f59271aA.mo58455c()).booleanValue() == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0188, code lost:
        if (p000.cemz.m137436b() != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018a, code lost:
        r5 = r0.f58067c;
        r6 = new p000.apos(r1.f58556c, r0, p000.abxu.m48512a(r4), r8);
        r5.mo32995d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a2, code lost:
        if (((com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response) r6.mo32295h()).f107404b == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a4, code lost:
        r4 = r0.f58083s;
        r5 = (p000.bpwv) p000.bpww.f139580b.mo74144da();
        r6 = p000.bpyl.f139877i.mo74144da();
        r7 = r3.f58140e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b8, code lost:
        if (r6.f164950c != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bb, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        r11 = (p000.bpyl) r6.f164949b;
        r7.getClass();
        r1 = r11.f139879a | 16;
        r11.f139879a = r1;
        r11.f139884f = r7;
        r3 = r3.f58138c;
        r3.getClass();
        r11.f139879a = r1 | 32;
        r11.f139885g = r3;
        r5.mo68991a(r6);
        r4.mo32437a(6016, (p000.bpww) r5.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ea, code lost:
        r1 = r0.f58067c;
        r11 = new p000.abvi(p000.bqbd.UNREGISTER_CORPUS, r3.f58140e, r19, r6, r14);
        r1.mo32995d(r11);
        r11.mo32295h();
        r2 = true;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0207, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020c, code lost:
        r1 = getWritableDatabase();
        r1.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r0 = r12.entrySet().iterator();
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0220, code lost:
        if (r0.hasNext() == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0222, code lost:
        r4 = (java.util.Map.Entry) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0232, code lost:
        if (((java.lang.Boolean) r4.getValue()).booleanValue() != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0234, code lost:
        r3 = ((p000.abww) r4.getKey()).mo32396c();
        p000.abvn.m48331a(r1, ((p000.abww) r4.getKey()).f58662b, r3);
        r3 = p000.abww.m48412a(r3, r10);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 23);
        r5.append("DROP TABLE IF EXISTS [");
        r5.append(r3);
        r5.append("]");
        r1.execSQL(r5.toString());
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0272, code lost:
        r1.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0278, code lost:
        if (r2 != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x027a, code lost:
        if (r3 != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0280, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0283, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0285, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0288, code lost:
        throw r0;
     */
    /* renamed from: a */
    public final boolean mo32363a(abrv abrv, abyy abyy, abxt abxt) {
        Throwable th;
        abvo abvo = this;
        abrv abrv2 = abrv;
        abyy abyy2 = abyy;
        abxt abxt2 = abxt;
        String str = abyy2.f58780f;
        synchronized (abvo.f58558e) {
            if (acaw.m48798o()) {
                if (abxt2 != abvo.f58557d) {
                    abvo.f58557d = abxt2;
                    abvo.f58558e.clear();
                }
            }
            if (!abvo.f58558e.add(str)) {
                return false;
            }
        }
        throw th;
    }
}
