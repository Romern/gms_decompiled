package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.webkit.MimeTypeMap;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.zip.DeflaterOutputStream;

/* renamed from: nde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nde {

    /* renamed from: a */
    public static final lvn f35310a = new lvn("MmsAgent");

    /* renamed from: d */
    static final Uri f35311d = Uri.parse("content://mms-sms/canonical-address");

    /* renamed from: e */
    static final String[] f35312e = {"type", "address", "charset"};

    /* renamed from: f */
    static final String[] f35313f = {"text", "chset"};

    /* renamed from: h */
    public static final String[] f35314h = {"_id", "ct", "cl", "text", "_data"};

    /* renamed from: i */
    static final String[] f35315i = {"_id", "sub", "sub_cs", "date", "date_sent", "m_type", "v", "msg_box", "ct_l", "thread_id", "tr_id", "read"};

    /* renamed from: q */
    static final Uri f35316q = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();

    /* renamed from: r */
    private static final String[] f35317r = {"archived"};

    /* renamed from: s */
    private static final String[] f35318s = {"_id", "recipient_ids"};

    /* renamed from: b */
    public final Context f35319b;

    /* renamed from: c */
    public final ContentResolver f35320c;

    /* renamed from: g */
    Map f35321g = null;

    /* renamed from: j */
    public final mbx f35322j;

    /* renamed from: k */
    public final ndd f35323k;

    /* renamed from: l */
    public int f35324l = 0;

    /* renamed from: m */
    public final lyg f35325m;

    /* renamed from: n */
    public final mbx f35326n;

    /* renamed from: o */
    public Timestamp f35327o;

    /* renamed from: p */
    public boolean f35328p;

    /* renamed from: t */
    private final int f35329t = ((int) ccls.f179387a.mo6606a().mo76359u());

    /* renamed from: u */
    private final Map f35330u = new HashMap();

    /* renamed from: v */
    private final lym f35331v;

    /* renamed from: w */
    private long f35332w = 0;

    public nde(Context context, mbx mbx, ndd ndd) {
        this.f35319b = context;
        this.f35322j = mbx;
        this.f35323k = ndd;
        this.f35320c = context.getContentResolver();
        if (ccly.m130639b()) {
            this.f35325m = new lxu(context);
        } else {
            this.f35325m = new lye(context);
        }
        this.f35331v = new lym(context);
        this.f35326n = new mbx(context);
    }

    /* renamed from: b */
    private static void m25956b(JsonWriter jsonWriter, Cursor cursor, String str) {
        int i = cursor.getInt(cursor.getColumnIndex(str));
        if (i != 0) {
            jsonWriter.name(str).value((long) i);
        }
    }

    /* renamed from: a */
    public static String m25954a(String str) {
        if (bmxx.m108577a(str)) {
            return str;
        }
        String[] split = str.split("/");
        int length = split.length - 1;
        split[length] = Uri.encode(split[length]);
        return bmxr.m108543a('/').mo66876a((Object[]) split);
    }

    /* renamed from: b */
    public static final boolean m25957b(String str) {
        String H = ccls.f179387a.mo6606a().mo76327H();
        if (!bmxx.m108577a(H)) {
            for (String str2 : H.split(";", -1)) {
                if (str.startsWith(str2) && !str.equals("text/plain")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m25955a(JsonWriter jsonWriter, Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndex(str));
        if (string != null) {
            jsonWriter.name(str).value(string);
        }
    }

    /* renamed from: a */
    public final Cursor mo20480a() {
        return this.f35320c.query(Telephony.Mms.CONTENT_URI, f35315i, null, null, "date ASC");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x030d A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039c A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x041e A[SYNTHETIC, Splitter:B:189:0x041e] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x048f A[SYNTHETIC, Splitter:B:205:0x048f] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x051f A[SYNTHETIC, Splitter:B:221:0x051f] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0561 A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0571 A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0577 A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5 A[SYNTHETIC, Splitter:B:40:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01de A[Catch:{ all -> 0x02ab, all -> 0x01d2, all -> 0x05ec }] */
    /* renamed from: a */
    public final bzoq mo20481a(Cursor cursor, String str, bzoq bzoq, bzob bzob, Set set) {
        JsonWriter jsonWriter;
        File file;
        int i;
        File file2;
        bzoq bzoq2;
        Cursor cursor2;
        ndc ndc;
        int i2;
        ndc ndc2;
        String str2;
        File file3;
        boolean z;
        int i3;
        int i4;
        Cursor cursor3;
        Cursor query;
        String str3;
        JsonWriter name;
        String str4;
        Cursor cursor4;
        Cursor query2;
        Cursor cursor5;
        Cursor query3;
        String str5;
        Cursor cursor6;
        String string;
        int i5;
        String str6;
        String str7;
        String str8;
        ndc ndc3;
        int i6;
        boolean z2;
        char c;
        Cursor cursor7;
        boolean z3;
        String str9;
        ndc ndc4;
        String str10;
        String str11;
        String str12;
        boolean z4;
        int i7;
        String str13;
        int i8;
        String[] strArr;
        String str14;
        Cursor cursor8;
        Cursor query4;
        Cursor cursor9 = cursor;
        String str15 = str;
        bzoq bzoq3 = bzoq;
        String str16 = "application/smil";
        String str17 = "address";
        String str18 = "part";
        if (cursor.isAfterLast()) {
            return bzoq3;
        }
        File a = mce.m24857a(this.f35319b, str15);
        int i9 = 1;
        int i10 = 0;
        f35310a.mo25412b("backupFile: %s", a.getAbsolutePath());
        try {
            JsonWriter jsonWriter2 = new JsonWriter(new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(a)), StandardCharsets.UTF_8), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT));
            jsonWriter2.beginArray();
            int i11 = 0;
            while (true) {
                if (i11 >= this.f35329t) {
                    file = a;
                    i = i11;
                } else if (!cursor.isAfterLast()) {
                    int i12 = cursor9.getInt(i10);
                    Uri build = Telephony.Mms.CONTENT_URI.buildUpon().appendPath(String.valueOf(i12)).appendPath(str18).build();
                    try {
                        ContentResolver contentResolver = this.f35320c;
                        String[] strArr2 = f35313f;
                        String[] strArr3 = new String[i9];
                        strArr3[i10] = "text/plain";
                        Cursor query5 = contentResolver.query(build, strArr2, "ct=?", strArr3, "_id ASC");
                        if (query5 != null) {
                            try {
                                if (query5.moveToFirst()) {
                                    ndc = new ndc();
                                    while (true) {
                                        if (!TextUtils.isEmpty(ndc.f35308a)) {
                                            ndc.f35308a = ndc.f35308a.concat(query5.getString(i10));
                                        } else {
                                            ndc.f35308a = query5.getString(i10);
                                        }
                                        ndc.f35309b = query5.getInt(1);
                                        if (query5.moveToNext()) {
                                        }
                                        srz.m36171a(query5);
                                        ndc ndc5 = (ndc != null || ndc.f35308a == null) ? null : ndc;
                                        jsonWriter2.beginObject();
                                        boolean z5 = true;
                                        i2 = 0;
                                        while (i2 < cursor.getColumnCount()) {
                                            String columnName = cursor9.getColumnName(i2);
                                            File file4 = a;
                                            String string2 = cursor9.getString(i2);
                                            if (string2 == null) {
                                                ndc3 = ndc5;
                                                str6 = str16;
                                                str8 = str17;
                                                str7 = str18;
                                                z2 = z5;
                                                i6 = i11;
                                            } else {
                                                i6 = i11;
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
                                                    long j = cursor9.getLong(i2);
                                                    if (this.f35321g == null) {
                                                        this.f35321g = new HashMap();
                                                    }
                                                    Map map = this.f35321g;
                                                    Long valueOf = Long.valueOf(j);
                                                    if (map.containsKey(valueOf)) {
                                                        ndc4 = ndc5;
                                                        str10 = str16;
                                                        str11 = str17;
                                                        str12 = str18;
                                                        z4 = z5;
                                                        i5 = i12;
                                                    } else {
                                                        if (j > 0 && (query4 = this.f35320c.query(f35316q, f35318s, "_id=?", new String[]{String.valueOf(j)}, null)) != null) {
                                                            try {
                                                                if (query4.moveToFirst()) {
                                                                    String string3 = query4.getString(1);
                                                                    query4.close();
                                                                    str9 = string3;
                                                                    if (TextUtils.isEmpty(str9)) {
                                                                        Map map2 = this.f35321g;
                                                                        ArrayList arrayList = new ArrayList();
                                                                        String[] split = str9.split(" ", -1);
                                                                        z4 = z5;
                                                                        int length = split.length;
                                                                        ndc4 = ndc5;
                                                                        int i13 = 0;
                                                                        while (i13 < length) {
                                                                            String str19 = str17;
                                                                            String str20 = str18;
                                                                            try {
                                                                                long parseLong = Long.parseLong(split[i13]);
                                                                                if (parseLong < 0) {
                                                                                    try {
                                                                                        lvn lvn = f35310a;
                                                                                        strArr = split;
                                                                                        try {
                                                                                            i8 = length;
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder(45);
                                                                                                sb.append("getAddresses: invalid id ");
                                                                                                sb.append(parseLong);
                                                                                                lvn.mo25416d(sb.toString(), new Object[0]);
                                                                                                str13 = str16;
                                                                                                i7 = i12;
                                                                                            } catch (NumberFormatException e) {
                                                                                                e = e;
                                                                                                str14 = str16;
                                                                                                i7 = i12;
                                                                                                f35310a.mo25415d("getAddresses: invalid id.", e, new Object[0]);
                                                                                                i13++;
                                                                                                str17 = str19;
                                                                                                str18 = str20;
                                                                                                split = strArr;
                                                                                                length = i8;
                                                                                                str16 = str13;
                                                                                                i12 = i7;
                                                                                            }
                                                                                        } catch (NumberFormatException e2) {
                                                                                            e = e2;
                                                                                            i8 = length;
                                                                                            str14 = str16;
                                                                                            i7 = i12;
                                                                                            f35310a.mo25415d("getAddresses: invalid id.", e, new Object[0]);
                                                                                            i13++;
                                                                                            str17 = str19;
                                                                                            str18 = str20;
                                                                                            split = strArr;
                                                                                            length = i8;
                                                                                            str16 = str13;
                                                                                            i12 = i7;
                                                                                        }
                                                                                    } catch (NumberFormatException e3) {
                                                                                        e = e3;
                                                                                        strArr = split;
                                                                                        i8 = length;
                                                                                        str14 = str16;
                                                                                        i7 = i12;
                                                                                        f35310a.mo25415d("getAddresses: invalid id.", e, new Object[0]);
                                                                                        i13++;
                                                                                        str17 = str19;
                                                                                        str18 = str20;
                                                                                        split = strArr;
                                                                                        length = i8;
                                                                                        str16 = str13;
                                                                                        i12 = i7;
                                                                                    }
                                                                                } else {
                                                                                    strArr = split;
                                                                                    i8 = length;
                                                                                    try {
                                                                                        cursor8 = this.f35320c.query(ContentUris.withAppendedId(f35311d, parseLong), null, null, null, null);
                                                                                        str13 = str16;
                                                                                        i7 = i12;
                                                                                    } catch (Exception e4) {
                                                                                        lvn lvn2 = f35310a;
                                                                                        str13 = str16;
                                                                                        StringBuilder sb2 = new StringBuilder(54);
                                                                                        sb2.append("getAddresses: query failed for id ");
                                                                                        sb2.append(parseLong);
                                                                                        i7 = i12;
                                                                                        lvn2.mo25415d(sb2.toString(), e4, new Object[0]);
                                                                                        cursor8 = null;
                                                                                    }
                                                                                    if (cursor8 != null) {
                                                                                        if (cursor8.moveToFirst()) {
                                                                                            String string4 = cursor8.getString(0);
                                                                                            if (TextUtils.isEmpty(string4)) {
                                                                                                lvn lvn3 = f35310a;
                                                                                                StringBuilder sb3 = new StringBuilder(63);
                                                                                                sb3.append("Canonical MMS/SMS address is empty for id: ");
                                                                                                sb3.append(parseLong);
                                                                                                lvn3.mo25416d(sb3.toString(), new Object[0]);
                                                                                            } else {
                                                                                                arrayList.add(string4);
                                                                                            }
                                                                                        }
                                                                                        cursor8.close();
                                                                                    }
                                                                                }
                                                                            } catch (NumberFormatException e5) {
                                                                                e = e5;
                                                                                strArr = split;
                                                                                str14 = str16;
                                                                                i8 = length;
                                                                                i7 = i12;
                                                                                f35310a.mo25415d("getAddresses: invalid id.", e, new Object[0]);
                                                                                i13++;
                                                                                str17 = str19;
                                                                                str18 = str20;
                                                                                split = strArr;
                                                                                length = i8;
                                                                                str16 = str13;
                                                                                i12 = i7;
                                                                            }
                                                                            i13++;
                                                                            str17 = str19;
                                                                            str18 = str20;
                                                                            split = strArr;
                                                                            length = i8;
                                                                            str16 = str13;
                                                                            i12 = i7;
                                                                        }
                                                                        str10 = str16;
                                                                        str11 = str17;
                                                                        str12 = str18;
                                                                        i5 = i12;
                                                                        if (arrayList.isEmpty()) {
                                                                            lvn lvn4 = f35310a;
                                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(str9).length() + 41);
                                                                            sb4.append("No MMS addresses found from ids string [");
                                                                            sb4.append(str9);
                                                                            sb4.append("]");
                                                                            lvn4.mo25416d(sb4.toString(), new Object[0]);
                                                                        }
                                                                        map2.put(valueOf, arrayList);
                                                                    } else {
                                                                        ndc4 = ndc5;
                                                                        str10 = str16;
                                                                        str11 = str17;
                                                                        str12 = str18;
                                                                        z4 = z5;
                                                                        i5 = i12;
                                                                        this.f35321g.put(valueOf, new ArrayList());
                                                                    }
                                                                } else {
                                                                    query4.close();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                jsonWriter = jsonWriter2;
                                                                srz.m36171a(jsonWriter);
                                                                throw th;
                                                            }
                                                        }
                                                        str9 = null;
                                                        if (TextUtils.isEmpty(str9)) {
                                                        }
                                                    }
                                                    List<String> list = (List) this.f35321g.get(Long.valueOf(j));
                                                    if (list != null && !list.isEmpty()) {
                                                        JsonWriter name2 = jsonWriter2.name("recipients");
                                                        name2.beginArray();
                                                        for (String str21 : list) {
                                                            name2.value(str21);
                                                        }
                                                        name2.endArray();
                                                        Map map3 = this.f35330u;
                                                        Long valueOf2 = Long.valueOf(j);
                                                        if (!map3.containsKey(valueOf2)) {
                                                            Uri.Builder buildUpon = Telephony.Threads.CONTENT_URI.buildUpon();
                                                            buildUpon.appendPath(String.valueOf(j)).appendPath("recipients");
                                                            try {
                                                                Cursor query6 = this.f35320c.query(buildUpon.build(), f35317r, null, null, null);
                                                                if (query6 != null) {
                                                                    try {
                                                                        if (query6.moveToFirst()) {
                                                                            if (query6.getInt(0) == 1) {
                                                                                z3 = true;
                                                                            } else {
                                                                                z3 = false;
                                                                            }
                                                                            srz.m36171a(query6);
                                                                            if (z3) {
                                                                                jsonWriter2.name("archived").value(true);
                                                                            }
                                                                            this.f35330u.put(valueOf2, Boolean.valueOf(z3));
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cursor7 = query6;
                                                                        srz.m36171a(cursor7);
                                                                        throw th;
                                                                    }
                                                                }
                                                                srz.m36171a(query6);
                                                                z3 = false;
                                                                if (z3) {
                                                                }
                                                                this.f35330u.put(valueOf2, Boolean.valueOf(z3));
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor7 = null;
                                                                srz.m36171a(cursor7);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                    z5 = z2;
                                                    i2++;
                                                    cursor9 = cursor;
                                                    a = file4;
                                                    i11 = i6;
                                                    ndc5 = ndc3;
                                                    str17 = str8;
                                                    str18 = str7;
                                                    str16 = str6;
                                                    i12 = i5;
                                                } else if (c == 1 || c == 2) {
                                                    ndc3 = ndc5;
                                                    str6 = str16;
                                                    str8 = str17;
                                                    str7 = str18;
                                                    z2 = z5;
                                                } else if (c != 3) {
                                                    jsonWriter2.name(columnName).value(string2);
                                                    ndc3 = ndc5;
                                                    str6 = str16;
                                                    str8 = str17;
                                                    str7 = str18;
                                                    z2 = z5;
                                                    i5 = i12;
                                                    z5 = z2;
                                                    i2++;
                                                    cursor9 = cursor;
                                                    a = file4;
                                                    i11 = i6;
                                                    ndc5 = ndc3;
                                                    str17 = str8;
                                                    str18 = str7;
                                                    str16 = str6;
                                                    i12 = i5;
                                                } else {
                                                    jsonWriter2.name(columnName).value(string2);
                                                    ndc3 = ndc5;
                                                    str6 = str16;
                                                    str8 = str17;
                                                    str7 = str18;
                                                    i5 = i12;
                                                    z5 = false;
                                                    i2++;
                                                    cursor9 = cursor;
                                                    a = file4;
                                                    i11 = i6;
                                                    ndc5 = ndc3;
                                                    str17 = str8;
                                                    str18 = str7;
                                                    str16 = str6;
                                                    i12 = i5;
                                                }
                                            }
                                            i5 = i12;
                                            z5 = z2;
                                            i2++;
                                            cursor9 = cursor;
                                            a = file4;
                                            i11 = i6;
                                            ndc5 = ndc3;
                                            str17 = str8;
                                            str18 = str7;
                                            str16 = str6;
                                            i12 = i5;
                                        }
                                        ndc2 = ndc5;
                                        str2 = str16;
                                        String str22 = str17;
                                        String str23 = str18;
                                        file3 = a;
                                        z = z5;
                                        i3 = i11;
                                        i4 = i12;
                                        JsonWriter name3 = jsonWriter2.name("mms_addresses");
                                        Uri.Builder buildUpon2 = Telephony.Mms.CONTENT_URI.buildUpon();
                                        buildUpon2.appendPath(String.valueOf(i4)).appendPath("addr");
                                        Uri build2 = buildUpon2.build();
                                        name3.beginArray();
                                        query = this.f35320c.query(build2, f35312e, null, null, "_id ASC");
                                        if (query != null) {
                                            str3 = str22;
                                        } else {
                                            try {
                                                if (query.moveToFirst()) {
                                                    while (true) {
                                                        str3 = str22;
                                                        if (query.getString(query.getColumnIndex(str3)) != null) {
                                                            name3.beginObject();
                                                            m25956b(name3, query, "type");
                                                            m25955a(name3, query, str3);
                                                            m25956b(name3, query, "charset");
                                                            name3.endObject();
                                                        }
                                                        if (query.moveToNext()) {
                                                            str22 = str3;
                                                        }
                                                    }
                                                } else {
                                                    str3 = str22;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor3 = query;
                                                srz.m36171a(cursor3);
                                                throw th;
                                            }
                                        }
                                        srz.m36171a(query);
                                        name3.endArray();
                                        name = jsonWriter2.name("attachments");
                                        Uri.Builder buildUpon3 = Telephony.Mms.CONTENT_URI.buildUpon();
                                        str4 = str23;
                                        buildUpon3.appendPath(String.valueOf(i4)).appendPath(str4);
                                        Uri build3 = buildUpon3.build();
                                        name.beginArray();
                                        try {
                                            query2 = this.f35320c.query(build3, f35314h, null, null, "_id ASC");
                                            if (query2 != null) {
                                                try {
                                                    if (query2.moveToFirst()) {
                                                        do {
                                                            String string5 = query2.getString(query2.getColumnIndex("ct"));
                                                            if (m25957b(string5) && (string = query2.getString(query2.getColumnIndex("cl"))) != null) {
                                                                name.beginObject();
                                                                name.name("mime_type").value(string5);
                                                                name.name("filename").value(mac.m24749a(string, query2.getInt(query2.getColumnIndex("_id"))));
                                                                name.name("mms_body").value(query2.getString(query2.getColumnIndex("text")));
                                                                name.endObject();
                                                            }
                                                        } while (query2.moveToNext());
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    cursor4 = query2;
                                                    srz.m36171a(cursor4);
                                                    throw th;
                                                }
                                            }
                                            srz.m36171a(query2);
                                            name.endArray();
                                            Uri.Builder buildUpon4 = Telephony.Mms.CONTENT_URI.buildUpon();
                                            buildUpon4.appendPath(String.valueOf(i4)).appendPath(str4);
                                            query3 = this.f35320c.query(buildUpon4.build(), f35314h, "ct=?", new String[]{str2}, "_id ASC");
                                            if (query3 != null) {
                                                str5 = str2;
                                            } else {
                                                try {
                                                    if (query3.moveToFirst()) {
                                                        while (true) {
                                                            str5 = str2;
                                                            if (str5.equals(query3.getString(query3.getColumnIndex("ct")))) {
                                                                jsonWriter2.name("smil").value(query3.getString(query3.getColumnIndex("text")));
                                                            }
                                                            if (query3.moveToNext()) {
                                                                str2 = str5;
                                                            }
                                                        }
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor5 = query3;
                                                    srz.m36171a(cursor5);
                                                    throw th;
                                                }
                                            }
                                            srz.m36171a(query3);
                                            jsonWriter2.name("mms_body").value("");
                                            if (ndc2 != null) {
                                                jsonWriter2.name("mms_charset").value((long) ndc2.f35309b);
                                            }
                                            if (z) {
                                                cursor6 = cursor;
                                                m25955a(jsonWriter2, cursor6, "sub_cs");
                                            } else {
                                                cursor6 = cursor;
                                            }
                                            jsonWriter2.endObject();
                                            cursor.moveToNext();
                                            i11 = i3 + 1;
                                            cursor9 = cursor6;
                                            str18 = str4;
                                            str16 = str5;
                                            a = file3;
                                            i9 = 1;
                                            i10 = 0;
                                            str17 = str3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor4 = null;
                                            srz.m36171a(cursor4);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                cursor2 = query5;
                                srz.m36171a(cursor2);
                                throw th;
                            }
                        }
                        ndc = null;
                        srz.m36171a(query5);
                        if (ndc != null) {
                        }
                        jsonWriter2.beginObject();
                        boolean z52 = true;
                        i2 = 0;
                        while (i2 < cursor.getColumnCount()) {
                        }
                        ndc2 = ndc5;
                        str2 = str16;
                        String str222 = str17;
                        String str232 = str18;
                        file3 = a;
                        z = z52;
                        i3 = i11;
                        i4 = i12;
                        JsonWriter name32 = jsonWriter2.name("mms_addresses");
                        Uri.Builder buildUpon22 = Telephony.Mms.CONTENT_URI.buildUpon();
                        buildUpon22.appendPath(String.valueOf(i4)).appendPath("addr");
                        Uri build22 = buildUpon22.build();
                        name32.beginArray();
                        try {
                            query = this.f35320c.query(build22, f35312e, null, null, "_id ASC");
                            if (query != null) {
                            }
                            srz.m36171a(query);
                            name32.endArray();
                            name = jsonWriter2.name("attachments");
                            Uri.Builder buildUpon32 = Telephony.Mms.CONTENT_URI.buildUpon();
                            str4 = str232;
                            buildUpon32.appendPath(String.valueOf(i4)).appendPath(str4);
                            Uri build32 = buildUpon32.build();
                            name.beginArray();
                            query2 = this.f35320c.query(build32, f35314h, null, null, "_id ASC");
                            if (query2 != null) {
                            }
                            srz.m36171a(query2);
                            name.endArray();
                            Uri.Builder buildUpon42 = Telephony.Mms.CONTENT_URI.buildUpon();
                            buildUpon42.appendPath(String.valueOf(i4)).appendPath(str4);
                            try {
                                query3 = this.f35320c.query(buildUpon42.build(), f35314h, "ct=?", new String[]{str2}, "_id ASC");
                                if (query3 != null) {
                                }
                                srz.m36171a(query3);
                                jsonWriter2.name("mms_body").value("");
                                if (ndc2 != null) {
                                }
                                if (z) {
                                }
                                jsonWriter2.endObject();
                                cursor.moveToNext();
                                i11 = i3 + 1;
                                cursor9 = cursor6;
                                str18 = str4;
                                str16 = str5;
                                a = file3;
                                i9 = 1;
                                i10 = 0;
                                str17 = str3;
                            } catch (Throwable th9) {
                                th = th9;
                                cursor5 = null;
                                srz.m36171a(cursor5);
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            cursor3 = null;
                            srz.m36171a(cursor3);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        cursor2 = null;
                        srz.m36171a(cursor2);
                        throw th;
                    }
                } else {
                    file = a;
                    i = i11;
                }
            }
            jsonWriter2.endArray();
            srz.m36171a(jsonWriter2);
            if (i > 0) {
                try {
                    this.f35324l += i;
                    String str24 = str;
                    file2 = file;
                    try {
                        bzoq2 = mo20483a(bzoq, bzob, file2, str24);
                        set.add(str24);
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    file2 = file;
                    file2.delete();
                    throw th;
                }
            } else {
                file2 = file;
                bzoq2 = bzoq;
            }
            file2.delete();
            return bzoq2;
        } catch (Throwable th14) {
            th = th14;
            jsonWriter = null;
            srz.m36171a(jsonWriter);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo20486b(boolean z) {
        SharedPreferences.Editor edit = new rtj(this.f35319b, "g1_shared_prefs", true).edit();
        edit.putBoolean("mms_data_deleted", z);
        edit.apply();
        if (z && ccls.f179387a.mo6606a().mo76331L()) {
            lvt.f33072a.mo19669a(this.f35319b, 0);
        }
    }

    /* renamed from: a */
    public final bzoq mo20482a(bzob bzob) {
        lyg lyg = this.f35325m;
        bxvd da = bzop.f170851e.mo74144da();
        String str = bzob.f170790a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((bzop) da.f164949b).f170854b = str;
        bxvd da2 = bzos.f170860b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bzos) da2.f164949b).f170862a = bzor.m125993a(4);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzos bzos = (bzos) da2.mo74062i();
        bzos.getClass();
        ((bzop) da.f164949b).f170855c = bzos;
        long p = ccls.m130537p();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzop) da.f164949b).f170856d = p;
        bxvd a = lyf.m24647a(this.f35319b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzoa bzoa = (bzoa) a.mo74062i();
        bzoa.getClass();
        ((bzop) da.f164949b).f170853a = bzoa;
        bzoq a2 = lyg.mo19737a((bzop) da.mo74062i());
        this.f35332w = 0;
        return a2;
    }

    /* renamed from: a */
    public final bzoq mo20483a(bzoq bzoq, bzob bzob, File file, String str) {
        bzoq bzoq2;
        String str2;
        bzob bzob2 = bzob;
        long length = file.length();
        long j = this.f35332w;
        if (j <= 0 || j + length <= ccls.m130537p()) {
            bzoq2 = bzoq;
        } else {
            mo20484a(bzoq, bzob);
            bzoq2 = mo20482a(bzob2);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        if (fileExtensionFromUrl != null) {
            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        } else {
            str2 = null;
        }
        bxvd da = bzok.f170824c.mo74144da();
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((bzok) da.f164949b).f170827b = str2;
        }
        bzry bzry = new bzry(file);
        try {
            lym lym = this.f35331v;
            bxvd da2 = bzou.f170868f.mo74144da();
            String str3 = bzoq2.f170859a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzou bzou = (bzou) da2.f164949b;
            str3.getClass();
            bzou.f170873d = str3;
            String str4 = bzob2.f170790a;
            str4.getClass();
            bzou.f170871b = str4;
            str.getClass();
            bzou.f170872c = str;
            bzok bzok = (bzok) da.mo74062i();
            bzok.getClass();
            bzou.f170874e = bzok;
            bxvd a = lyf.m24647a(this.f35319b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzoa bzoa = (bzoa) a.mo74062i();
            bzoa.getClass();
            ((bzou) da2.f164949b).f170870a = bzoa;
            bzou bzou2 = (bzou) da2.mo74062i();
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").encodedAuthority(ccls.m130530i()).appendPath("upload").appendPath("v1").appendEncodedPath(bzou2.f170871b).appendPath("files").appendEncodedPath(bzou2.f170872c).appendQueryParameter("transaction_id", bzou2.f170873d);
            bzok bzok2 = bzou2.f170874e;
            if (bzok2 == null) {
                bzok2 = bzok.f170824c;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("file.mime_type", bzok2.f170827b);
            bzoa bzoa2 = bzou2.f170870a;
            if (bzoa2 == null) {
                bzoa2 = bzoa.f170784c;
            }
            lym.m24666a(appendQueryParameter2, bzoa2);
            bzsa bzsa = new bzsa();
            String valueOf = String.valueOf(lym.f33195c.mo19723a());
            bzsa.mo74562b("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            bzst bzst = (bzst) lym.f33196d.mo74581a(appendQueryParameter2.toString(), DataParser.CONNECT_TYPE_POST, bzsa, bzry, null, null).mo74567a().get();
            if (bzst.mo74578b()) {
                int i = bzst.f171296b.f171220a;
                if (i == 200) {
                    this.f35332w += length;
                    bzry.close();
                    return bzoq2;
                }
                throw new mbf("Scotty upload failure", i);
            } else if (!bzst.mo74577a()) {
                throw new IOException("Scotty upload response is empty");
            } else {
                throw bzst.f171295a;
            }
        } catch (bzss | IOException | InterruptedException | ExecutionException | mbb | mbf | mbh e) {
            Throwable th = e;
            mab.m24748a(this.f35319b, th, ccls.m130538q());
            f35310a.mo25415d("Error for backing up attachment", th, new Object[0]);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            bzry.close();
            throw th3;
        }
    }

    /* renamed from: a */
    public final void mo20484a(bzoq bzoq, bzob bzob) {
        lyg lyg = this.f35325m;
        bxvd da = bzoe.f170799d.mo74144da();
        String str = bzob.f170790a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzoe bzoe = (bzoe) da.f164949b;
        str.getClass();
        bzoe.f170802b = str;
        String str2 = bzoq.f170859a;
        str2.getClass();
        bzoe.f170803c = str2;
        bxvd a = lyf.m24647a(this.f35319b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzoa bzoa = (bzoa) a.mo74062i();
        bzoa.getClass();
        ((bzoe) da.f164949b).f170801a = bzoa;
        lyg.mo19738a((bzoe) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo20485a(boolean z) {
        lyg lyg = this.f35325m;
        bxvd da = bzot.f170863d.mo74144da();
        long a = spn.m35843a(this.f35319b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzot) da.f164949b).f170866b = a;
        bxvd a2 = lyf.m24647a(this.f35319b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzoa bzoa = (bzoa) a2.mo74062i();
        bzoa.getClass();
        ((bzot) da.f164949b).f170865a = bzoa;
        bxvd da2 = bxtj.f164776b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bxtj) da2.f164949b).f164778a = z;
        bxtj bxtj = (bxtj) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxtj.getClass();
        ((bzot) da.f164949b).f170867c = bxtj;
        lyg.mo19742a((bzot) da.mo74062i());
    }
}
