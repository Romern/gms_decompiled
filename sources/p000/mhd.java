package p000;

import android.app.backup.FullBackupDataOutput;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Pair;
import android.util.SparseArray;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: mhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mhd implements mhe {

    /* renamed from: B */
    private static final String[] f33685B = {"archived"};

    /* renamed from: a */
    static final String[] f33686a = {"_id", "address", "body", "subject", "date", "date_sent", "status", "type", "thread_id", "read"};

    /* renamed from: b */
    static final String[] f33687b = {"_id", "sub", "sub_cs", "date", "date_sent", "m_type", "v", "msg_box", "ct_l", "thread_id", "tr_id", "read"};

    /* renamed from: c */
    static final String[] f33688c = {"type", "address", "charset"};

    /* renamed from: d */
    static final String[] f33689d = {"text", "chset"};

    /* renamed from: e */
    static final String[] f33690e = {"text", "chset", "mid"};

    /* renamed from: f */
    static final String[] f33691f = {"text", "chset", "mid", "_id", "ct", "cl"};

    /* renamed from: l */
    static final Uri f33692l = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();

    /* renamed from: m */
    static final Uri f33693m = Uri.parse("content://mms-sms/canonical-address");

    /* renamed from: n */
    public static final /* synthetic */ int f33694n = 0;

    /* renamed from: o */
    private static final lvn f33695o = new lvn("TelephonyBackupAgent");

    /* renamed from: p */
    private static final String[] f33696p = {"_id", "recipient_ids"};

    /* renamed from: A */
    private final Context f33697A;

    /* renamed from: g */
    public final int f33698g = ((int) ccnr.f179566a.mo6606a().mo76481b());

    /* renamed from: h */
    public final int f33699h = ((int) ccnr.f179566a.mo6606a().mo76480a());

    /* renamed from: i */
    public Map f33700i = new HashMap();

    /* renamed from: j */
    public long f33701j = -1;

    /* renamed from: k */
    public long f33702k = -1;

    /* renamed from: q */
    private final int f33703q = ((int) cckw.f179263a.mo6606a().mo76245j());

    /* renamed from: r */
    private final long f33704r = ((long) ((int) cckw.f179263a.mo6606a().mo76247l()));

    /* renamed from: s */
    private final boolean f33705s = cckw.f179263a.mo6606a().mo76244i();

    /* renamed from: t */
    private int f33706t = ((int) cckw.f179263a.mo6606a().mo76246k());

    /* renamed from: u */
    private final bmzi f33707u = bmzn.m108681a(mgy.f33676a);

    /* renamed from: v */
    private final bmzi f33708v = bmzn.m108681a(mgz.f33677a);

    /* renamed from: w */
    private final bmzi f33709w = bmzn.m108681a(mha.f33678a);

    /* renamed from: x */
    private final ContentResolver f33710x;

    /* renamed from: y */
    private Map f33711y = null;

    /* renamed from: z */
    private Map f33712z = null;

    public mhd(Context context) {
        this.f33697A = context;
        this.f33710x = context.getContentResolver();
    }

    /* renamed from: a */
    private final int m25097a(Cursor cursor, JsonWriter jsonWriter) {
        int i = 0;
        while (i < this.f33703q && !cursor.isAfterLast()) {
            i += m25098a(jsonWriter, cursor, (SparseArray) null);
            cursor.moveToNext();
        }
        return i;
    }

    /* renamed from: b */
    private final String m25106b(long j) {
        boolean z;
        if (j <= 0) {
            return null;
        }
        if (this.f33712z == null || !((Boolean) this.f33708v.mo6606a()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Map map = this.f33712z;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                return (String) this.f33712z.get(valueOf);
            }
        }
        Cursor query = this.f33710x.query(f33692l, f33696p, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                do {
                    long j2 = query.getLong(0);
                    String string = query.getString(1);
                    if (j == j2) {
                        query.close();
                        return string;
                    } else if (z) {
                        this.f33712z.put(Long.valueOf(j2), string);
                    }
                } while (query.moveToNext());
            }
        } catch (SQLException e) {
            f33695o.mo25416d("Error while querying recipients sequentially: %s", e.getMessage());
            mab.m24748a(this.f33697A, e, ((Double) this.f33709w.mo6606a()).doubleValue());
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private final int m25098a(JsonWriter jsonWriter, Cursor cursor, SparseArray sparseArray) {
        mhc mhc;
        char c;
        mhc mhc2;
        JsonWriter jsonWriter2 = jsonWriter;
        Cursor cursor2 = cursor;
        SparseArray sparseArray2 = sparseArray;
        int i = cursor2.getInt(0);
        Cursor cursor3 = null;
        if (sparseArray2 != null) {
            mhc = (mhc) sparseArray2.get(i);
        } else {
            try {
                Cursor query = this.f33710x.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath(String.valueOf(i)).appendPath("part").build(), f33689d, "ct=?", new String[]{"text/plain"}, "_id ASC");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            mhc2 = new mhc();
                            do {
                                m25104a(mhc2, query);
                            } while (query.moveToNext());
                            srz.m36171a(query);
                            mhc = (mhc2 != null || mhc2.f33681a == null) ? null : mhc2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = query;
                        srz.m36171a(cursor3);
                        throw th;
                    }
                }
                mhc2 = null;
                srz.m36171a(query);
                if (mhc2 != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                srz.m36171a(cursor3);
                throw th;
            }
        }
        if (mhc != null && (mhc.f33681a != null || ccnx.m130935b())) {
            jsonWriter.beginObject();
            boolean z = true;
            for (int i2 = 0; i2 < cursor.getColumnCount(); i2++) {
                String columnName = cursor2.getColumnName(i2);
                String string = cursor2.getString(i2);
                if (string != null) {
                    switch (columnName.hashCode()) {
                        case -1562235024:
                            if (columnName.equals("thread_id")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -891548977:
                            if (columnName.equals("sub_cs")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94650:
                            if (columnName.equals("_id")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114240:
                            if (columnName.equals("sub")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        m25102a(jsonWriter2, cursor2.getLong(i2));
                    } else if (!(c == 1 || c == 2)) {
                        if (c != 3) {
                            jsonWriter2.name(columnName).value(string);
                        } else {
                            jsonWriter2.name(columnName).value(string);
                            z = false;
                        }
                    }
                }
            }
            JsonWriter name = jsonWriter2.name("mms_addresses");
            Uri.Builder buildUpon = Telephony.Mms.CONTENT_URI.buildUpon();
            buildUpon.appendPath(String.valueOf(i)).appendPath("addr");
            Uri build = buildUpon.build();
            name.beginArray();
            try {
                cursor3 = this.f33710x.query(build, f33688c, null, null, "_id ASC");
                if (cursor3 != null) {
                    try {
                        if (cursor3.moveToFirst()) {
                            do {
                                if (cursor3.getString(cursor3.getColumnIndex("address")) != null) {
                                    name.beginObject();
                                    m25107b(name, cursor3, "type");
                                    m25103a(name, cursor3, "address");
                                    m25107b(name, cursor3, "charset");
                                    name.endObject();
                                }
                            } while (cursor3.moveToNext());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        srz.m36171a(cursor3);
                        throw th;
                    }
                }
                srz.m36171a(cursor3);
                name.endArray();
                if (mhc.f33681a != null || ccnx.f179588a.mo6606a().mo76508i()) {
                    jsonWriter2.name("mms_body").value(bmxx.m108578b(mhc.f33681a));
                    jsonWriter2.name("mms_charset").value((long) mhc.f33682b);
                }
                if (!z) {
                    m25103a(jsonWriter2, cursor2, "sub_cs");
                }
                if (mhc.f33684d != null) {
                    JsonWriter name2 = jsonWriter2.name("attachments");
                    name2.beginArray();
                    List list = mhc.f33684d;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        mhb mhb = (mhb) list.get(i3);
                        name2.beginObject();
                        name2.name("mime_type").value(mhb.f33679a);
                        name2.name("filename").value(mhb.f33680b);
                        name2.endObject();
                    }
                    name2.endArray();
                }
                if (mhc.f33683c != null) {
                    jsonWriter2.name("smil").value(mhc.f33683c);
                }
                jsonWriter.endObject();
                return 1;
            } catch (Throwable th4) {
                th = th4;
                srz.m36171a(cursor3);
                throw th;
            }
        } else {
            f33695o.mo25418e("Mms body is null", new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    private static void m25107b(JsonWriter jsonWriter, Cursor cursor, String str) {
        int i = cursor.getInt(cursor.getColumnIndex(str));
        if (i != 0) {
            jsonWriter.name(str).value((long) i);
        }
    }

    /* renamed from: b */
    public final Cursor mo20010b() {
        return this.f33710x.query(Telephony.Mms.CONTENT_URI, f33687b, null, null, "date ASC");
    }

    /* renamed from: a */
    public static long m25099a(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("date"));
    }

    /* renamed from: a */
    private final SparseArray m25100a(ArrayList arrayList) {
        Cursor cursor;
        Cursor cursor2;
        int i;
        boolean z;
        boolean z2;
        mhd mhd = this;
        ArrayList arrayList2 = arrayList;
        if (arrayList.isEmpty()) {
            return new SparseArray();
        }
        Uri build = Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build();
        SparseArray sparseArray = new SparseArray();
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        char c = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) arrayList2.get(i2)).intValue();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(intValue);
            sparseArray.put(intValue, new mhc());
        }
        try {
            int i3 = 1;
            if (!ccnx.m130935b()) {
                cursor2 = mhd.f33710x.query(build, f33690e, String.format("%s IN (%s) AND %s = ?", "mid", sb, "ct"), new String[]{"text/plain"}, "_id ASC");
            } else {
                cursor2 = mhd.f33710x.query(build, f33691f, String.format("%s IN (%s)", "mid", sb), null, "_id ASC");
            }
            if (cursor2 == null) {
                try {
                    f33695o.mo25416d("Cursor is null when doing batch query", new Object[0]);
                    srz.m36171a(cursor2);
                    return null;
                } catch (SQLException e) {
                    e = e;
                    try {
                        f33695o.mo25415d("Exception while doing batch query", e, new Object[0]);
                        srz.m36171a(cursor2);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                        srz.m36171a(cursor);
                        throw th;
                    }
                }
            } else {
                if (cursor2.moveToFirst()) {
                    long j = 0;
                    long j2 = 0;
                    while (true) {
                        int i4 = cursor2.getInt(cursor2.getColumnIndex("mid"));
                        mhc mhc = (mhc) sparseArray.get(i4);
                        if (mhc == null) {
                            lvn lvn = f33695o;
                            Object[] objArr = new Object[i3];
                            objArr[c] = Integer.valueOf(i4);
                            lvn.mo25418e("Got part id for the message that wasn't in the batch query, msgId=%d", objArr);
                        } else {
                            if (mhd.f33704r > j) {
                                String string = cursor2.getString(cursor2.getColumnIndex("text"));
                                if (ccnx.m130935b()) {
                                    int i5 = cursor2.getInt(cursor2.getColumnIndex("_id"));
                                    String string2 = cursor2.getString(cursor2.getColumnIndex("cl"));
                                    String string3 = cursor2.getString(cursor2.getColumnIndex("ct"));
                                    String str = "";
                                    if (mad.m24755a(string3)) {
                                        str = mac.m24749a(string2, i5);
                                    }
                                    i = bmxx.m108578b(string).length() + str.length() + string3.length();
                                } else {
                                    i = bmxx.m108578b(string).length();
                                }
                                long j3 = ((long) i) + j2;
                                boolean z3 = true;
                                while (true) {
                                    if (j3 > mhd.f33704r) {
                                        if (arrayList.size() <= 1) {
                                            break;
                                        }
                                        int intValue2 = ((Integer) arrayList2.remove(arrayList.size() - 1)).intValue();
                                        f33695o.logVerbose("Batch doesn't fit in memory after new part added, new size: %d, removing %d", Long.valueOf(j3), Integer.valueOf(intValue2));
                                        mhc mhc2 = (mhc) sparseArray.get(intValue2);
                                        sparseArray.remove(intValue2);
                                        if (intValue2 == i4) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (intValue2 == i4) {
                                            i = 0;
                                        }
                                        z3 &= z2;
                                        String str2 = mhc2.f33681a;
                                        if (str2 != null) {
                                            j2 -= (long) str2.length();
                                        }
                                        j3 = ((long) i) + j2;
                                        mhd = this;
                                        arrayList2 = arrayList;
                                    } else {
                                        break;
                                    }
                                }
                                Long valueOf = Long.valueOf(j3);
                                if (!z3) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                Pair create = Pair.create(valueOf, Boolean.valueOf(z));
                                j2 = ((Long) create.first).longValue();
                                if (((Boolean) create.second).booleanValue()) {
                                }
                            }
                            m25104a(mhc, cursor2);
                        }
                        if (!cursor2.moveToNext()) {
                            break;
                        }
                        mhd = this;
                        arrayList2 = arrayList;
                        j = 0;
                        c = 0;
                        i3 = 1;
                    }
                }
                srz.m36171a(cursor2);
                return sparseArray;
            }
        } catch (SQLException e2) {
            e = e2;
            cursor2 = null;
            f33695o.mo25415d("Exception while doing batch query", e, new Object[0]);
            srz.m36171a(cursor2);
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            srz.m36171a(cursor);
            throw th;
        }
    }

    /* renamed from: a */
    public static final void m25101a(Cursor cursor, int i) {
        if (i > 0 && cursor.getCount() > i) {
            cursor.moveToPosition(cursor.getCount() - i);
        } else {
            cursor.moveToFirst();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c7  */
    /* renamed from: a */
    private final void m25102a(JsonWriter jsonWriter, long j) {
        String str;
        Map map;
        String[] strArr;
        Cursor cursor;
        Cursor query;
        String str2;
        JsonWriter jsonWriter2 = jsonWriter;
        long j2 = j;
        if (this.f33711y == null) {
            this.f33711y = new HashMap();
        }
        if (this.f33712z == null && ((Boolean) this.f33708v.mo6606a()).booleanValue()) {
            this.f33712z = new HashMap();
        }
        Map map2 = this.f33711y;
        Long valueOf = Long.valueOf(j);
        if (!map2.containsKey(valueOf)) {
            long j3 = 0;
            if (j2 > 0 && (query = this.f33710x.query(f33692l, f33696p, "_id=?", new String[]{String.valueOf(j)}, null)) != null) {
                try {
                    if (query.moveToFirst()) {
                        str2 = query.getString(1);
                    } else if (!((Boolean) this.f33707u.mo6606a()).booleanValue() || query.getCount() != 0) {
                        query.close();
                    } else {
                        f33695o.mo25416d("Couldn't find thread id, trying sequential search", new Object[0]);
                        str2 = m25106b(j2);
                    }
                    query.close();
                    str = str2;
                    if (!TextUtils.isEmpty(str)) {
                        this.f33711y.put(valueOf, new ArrayList());
                    } else {
                        Map map3 = this.f33711y;
                        ArrayList arrayList = new ArrayList();
                        String[] split = str.split(" ");
                        int length = split.length;
                        int i = 0;
                        while (i < length) {
                            String str3 = str;
                            try {
                                long parseLong = Long.parseLong(split[i]);
                                if (parseLong < j3) {
                                    lvn lvn = f33695o;
                                    StringBuilder sb = new StringBuilder(45);
                                    sb.append("getAddresses: invalid id ");
                                    sb.append(parseLong);
                                    lvn.mo25418e(sb.toString(), new Object[0]);
                                    strArr = split;
                                } else {
                                    try {
                                        cursor = this.f33710x.query(ContentUris.withAppendedId(f33693m, parseLong), null, null, null, null);
                                        strArr = split;
                                    } catch (Exception e) {
                                        lvn lvn2 = f33695o;
                                        StringBuilder sb2 = new StringBuilder(54);
                                        sb2.append("getAddresses: query failed for id ");
                                        sb2.append(parseLong);
                                        strArr = split;
                                        lvn2.mo25417e(sb2.toString(), e, new Object[0]);
                                        cursor = null;
                                    }
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                String string = cursor.getString(0);
                                                if (TextUtils.isEmpty(string)) {
                                                    lvn lvn3 = f33695o;
                                                    StringBuilder sb3 = new StringBuilder(63);
                                                    sb3.append("Canonical MMS/SMS address is empty for id: ");
                                                    sb3.append(parseLong);
                                                    lvn3.mo25418e(sb3.toString(), new Object[0]);
                                                } else {
                                                    arrayList.add(string);
                                                }
                                            }
                                        } finally {
                                            cursor.close();
                                        }
                                    }
                                }
                            } catch (NumberFormatException e2) {
                                strArr = split;
                                lvn lvn4 = f33695o;
                                String valueOf2 = String.valueOf(e2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                                sb4.append("getAddresses: invalid id. ");
                                sb4.append(valueOf2);
                                lvn4.mo25417e(sb4.toString(), e2, new Object[0]);
                            }
                            i++;
                            str = str3;
                            split = strArr;
                            j3 = 0;
                        }
                        String str4 = str;
                        if (arrayList.isEmpty()) {
                            lvn lvn5 = f33695o;
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 41);
                            sb5.append("No MMS addresses found from ids string [");
                            sb5.append(str4);
                            sb5.append("]");
                            lvn5.mo25418e(sb5.toString(), new Object[0]);
                        }
                        map3.put(valueOf, arrayList);
                    }
                    map = this.f33712z;
                    if (map != null) {
                        map.remove(Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            str = null;
            if (!TextUtils.isEmpty(str)) {
            }
            map = this.f33712z;
            if (map != null) {
            }
        }
        List<String> list = (List) this.f33711y.get(Long.valueOf(j));
        if (list != null && !list.isEmpty()) {
            JsonWriter name = jsonWriter2.name("recipients");
            name.beginArray();
            for (String str5 : list) {
                name.value(str5);
            }
            name.endArray();
            Map map4 = this.f33700i;
            Long valueOf3 = Long.valueOf(j);
            if (!map4.containsKey(valueOf3)) {
                boolean a = m25105a(j2);
                if (a) {
                    jsonWriter2.name("archived").value(true);
                }
                this.f33700i.put(valueOf3, Boolean.valueOf(a));
            }
        }
    }

    /* renamed from: a */
    private static void m25103a(JsonWriter jsonWriter, Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndex(str));
        if (string != null) {
            jsonWriter.name(str).value(string);
        }
    }

    /* renamed from: a */
    private static final void m25104a(mhc mhc, Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("text"));
        if (cursor.getColumnIndex("_id") > 0 && cursor.getColumnIndex("cl") > 0 && cursor.getColumnIndex("ct") > 0) {
            int i = cursor.getInt(cursor.getColumnIndex("_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("cl"));
            String string3 = cursor.getString(cursor.getColumnIndex("ct"));
            if (mad.m24755a(string3)) {
                mhb mhb = new mhb(string3, mac.m24749a(string2, i));
                if (mhc.f33684d == null) {
                    mhc.f33684d = new ArrayList();
                }
                mhc.f33684d.add(mhb);
                return;
            } else if (string3.equals("application/smil")) {
                mhc.f33683c = string;
                return;
            }
        }
        if (!TextUtils.isEmpty(mhc.f33681a)) {
            mhc.f33681a = mhc.f33681a.concat(string);
        } else {
            mhc.f33681a = string;
        }
        if (!TextUtils.isEmpty(mhc.f33681a)) {
            mhc.f33682b = cursor.getInt(cursor.getColumnIndex("chset"));
        }
    }

    /* renamed from: a */
    private final boolean m25105a(long j) {
        Uri.Builder buildUpon = Telephony.Threads.CONTENT_URI.buildUpon();
        buildUpon.appendPath(String.valueOf(j)).appendPath("recipients");
        Cursor cursor = null;
        boolean z = true;
        try {
            cursor = this.f33710x.query(buildUpon.build(), f33685B, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        if (cursor.getInt(0) != 1) {
                            z = false;
                        }
                        srz.m36171a(cursor);
                        return z;
                    }
                } catch (SQLException e) {
                    e = e;
                    try {
                        f33695o.mo25416d("Cannot query thread archived: %s", e.getMessage());
                        mab.m24748a(this.f33697A, e, ((Double) this.f33709w.mo6606a()).doubleValue());
                        srz.m36171a(cursor);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (SQLException e2) {
            e = e2;
            f33695o.mo25416d("Cannot query thread archived: %s", e.getMessage());
            mab.m24748a(this.f33697A, e, ((Double) this.f33709w.mo6606a()).doubleValue());
            srz.m36171a(cursor);
            return false;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a(cursor);
            throw th;
        }
        srz.m36171a(cursor);
        return false;
    }

    /* renamed from: a */
    public final Cursor mo20008a() {
        return this.f33710x.query(Telephony.Sms.CONTENT_URI, f33686a, null, null, "date ASC");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e A[Catch:{ all -> 0x017d }] */
    /* renamed from: a */
    public final void mo20009a(FullBackupDataOutput fullBackupDataOutput, Cursor cursor, String str) {
        JsonWriter jsonWriter;
        char c;
        if (!cursor.isAfterLast()) {
            File a = mce.m24857a(this.f33697A, str);
            int i = 0;
            f33695o.mo25412b("backupFile: %s", a.getAbsolutePath());
            try {
                jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(a)), StandardCharsets.UTF_8), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT));
                try {
                    if (!str.endsWith("_sms_backup")) {
                        jsonWriter.beginArray();
                        if (this.f33706t > 0) {
                            f33695o.logVerbose("Batching queries for MMS bodies with batch size %d", Integer.valueOf(this.f33706t));
                            int position = cursor.getPosition();
                            ArrayList arrayList = new ArrayList();
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.f33706t) {
                                    if (cursor.isAfterLast()) {
                                        break;
                                    }
                                    arrayList.add(Integer.valueOf(cursor.getInt(0)));
                                    i2++;
                                    cursor.moveToNext();
                                } else {
                                    break;
                                }
                            }
                            int size = arrayList.size();
                            SparseArray a2 = m25100a(arrayList);
                            if (this.f33705s) {
                                while (a2 == null && this.f33706t > 0) {
                                    f33695o.logVerbose("Looks like query was too big (batch size: %d), trying to decrease by 1", Integer.valueOf(arrayList.size()));
                                    arrayList.remove(arrayList.size() - 1);
                                    this.f33706t = arrayList.size();
                                    a2 = m25100a(arrayList);
                                }
                            }
                            if (this.f33706t != 0) {
                                if (a2 != null) {
                                    cursor.move(-(size - a2.size()));
                                    int position2 = cursor.getPosition();
                                    cursor.moveToPosition(position);
                                    while (cursor.getPosition() < position2) {
                                        i += m25098a(jsonWriter, cursor, a2);
                                        cursor.moveToNext();
                                    }
                                }
                            }
                            f33695o.logVerbose("Couldn't batch queries, falling back to separate queries", new Object[0]);
                            cursor.moveToPosition(position);
                            i = m25097a(cursor, jsonWriter);
                        } else {
                            i = m25097a(cursor, jsonWriter);
                        }
                        jsonWriter.endArray();
                    } else {
                        jsonWriter.beginArray();
                        int i3 = 0;
                        while (i3 < this.f33703q && !cursor.isAfterLast()) {
                            jsonWriter.beginObject();
                            for (int i4 = 0; i4 < cursor.getColumnCount(); i4++) {
                                String columnName = cursor.getColumnName(i4);
                                String string = cursor.getString(i4);
                                if (string != null) {
                                    int hashCode = columnName.hashCode();
                                    if (hashCode != -1562235024) {
                                        if (hashCode == 94650 && columnName.equals("_id")) {
                                            c = 1;
                                            if (c == 0) {
                                                m25102a(jsonWriter, cursor.getLong(i4));
                                            } else if (c != 1) {
                                                jsonWriter.name(columnName).value(string);
                                            }
                                        }
                                    } else if (columnName.equals("thread_id")) {
                                        c = 0;
                                        if (c == 0) {
                                        }
                                    }
                                    c = 65535;
                                    if (c == 0) {
                                    }
                                }
                            }
                            jsonWriter.endObject();
                            i3++;
                            cursor.moveToNext();
                        }
                        jsonWriter.endArray();
                        i = i3;
                    }
                    srz.m36171a(jsonWriter);
                    if (i > 0) {
                        mad.m24754a("com.android.providers.telephony", "d_f", a.getParent(), a.getAbsolutePath(), fullBackupDataOutput);
                    }
                    a.delete();
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a(jsonWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jsonWriter = null;
                srz.m36171a(jsonWriter);
                throw th;
            }
        }
    }
}
