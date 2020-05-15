package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: adtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtg {

    /* renamed from: a */
    public static final long f62702a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    static final String[] f62703b = {"_id"};

    /* renamed from: c */
    public static final String[] f62704c = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read"};

    /* renamed from: d */
    public static final String[] f62705d = {"_id", "msg_box", "thread_id", "date", "sub", "read"};

    /* renamed from: e */
    static final String f62706e = String.format("%s>? OR ((%s=?) AND (%s>?))", "date", "date", "_id");

    /* renamed from: f */
    public static final String f62707f = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", "date", "date", "_id", "date");

    /* renamed from: g */
    public static final String f62708g = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", "date", "date", "_id", "date");

    /* renamed from: i */
    private static final bnic f62709i = bnic.m109494a("image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "text/plain", "video/mp4");

    /* renamed from: j */
    private static final String[] f62710j = {"type", "address"};

    /* renamed from: k */
    private static final String[] f62711k = {"_id", "ct", "text"};

    /* renamed from: l */
    private static final String f62712l = String.format("%s>? OR ((%s=?) AND (%s>?))", "date", "date", "_id");

    /* renamed from: h */
    public final adnr f62713h;

    /* renamed from: m */
    private final Context f62714m;

    /* renamed from: a */
    public static final long m51177a() {
        long Z = ceqm.f183265a.mo6606a().mo79613Z();
        if (Z > 0) {
            return System.currentTimeMillis() - TimeUnit.DAYS.toMillis(Z);
        }
        return -1;
    }

    /* renamed from: b */
    public final adsr mo33809b(int i) {
        Cursor a = this.f62713h.mo33689a(adta.f62680b, f62705d, "_id=?", new String[]{String.valueOf(i)}, null);
        if (a != null) {
            try {
                if (a.moveToNext()) {
                    adsr b = mo33810b(a);
                    a.close();
                    return b;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (a == null) {
            return null;
        }
        a.close();
        return null;
        throw th;
    }

    public adtg(Context context, adnr adnr) {
        this.f62714m = context;
        this.f62713h = adnr;
    }

    /* renamed from: a */
    private static String m51178a(List list) {
        return String.format("_id || ';' || date IN (%s) AND read IS 1", TextUtils.join(",", list));
    }

    /* renamed from: a */
    private final void m51179a(Uri uri, String str, List list) {
        Cursor a = this.f62713h.mo33689a(uri, f62703b, str, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                try {
                    Integer a2 = sra.m36060a(a, 0);
                    if (a2 != null) {
                        list.add(a2);
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        if (a != null) {
            a.close();
            return;
        }
        return;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        p000.adnt.m50870a(r0, "No permission to read phone number", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d4, code lost:
        if (r6 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01db, code lost:
        p000.bqye.m113761a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01df, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x012c, B:30:0x0142] */
    /* renamed from: b */
    public final adsr mo33810b(Cursor cursor) {
        String str;
        Throwable th;
        Cursor cursor2 = cursor;
        int i = 0;
        Integer a = sra.m36060a(cursor2, 0);
        if (a == null) {
            return null;
        }
        Long b = sra.m36068b(cursor2, 3);
        if (b == null || b.longValue() < 0) {
            adns.m50862a().mo33690a(45);
            return null;
        }
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("content://mms/");
        sb.append(valueOf);
        String sb2 = sb.toString();
        int intValue = a.intValue();
        adtf adtf = new adtf();
        Uri withAppendedPath = Uri.withAppendedPath(adta.f62680b, "part");
        adnr adnr = this.f62713h;
        String[] strArr = f62711k;
        StringBuilder sb3 = new StringBuilder(15);
        sb3.append("mid=");
        sb3.append(intValue);
        Cursor a2 = adnr.mo33689a(withAppendedPath, strArr, sb3.toString(), null, null);
        int i2 = 1;
        if (a2 == null) {
            try {
                adnt.m50872b("Couldn't find MMS part for %d", Integer.valueOf(intValue));
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (a2.moveToNext()) {
                String c = sra.m36069c(a2, i);
                String c2 = sra.m36069c(a2, i2);
                if (f62709i.contains(c2)) {
                    if (!"text/plain".equals(c2)) {
                        arrayList.add(Uri.withAppendedPath(withAppendedPath, c));
                    } else {
                        adtf.f62699a = sra.m36069c(a2, 2);
                    }
                    arrayList2.add(c2.replace('/', '_'));
                    i = 0;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 1;
                }
            }
            adtf.f62700b = TextUtils.join(",", arrayList);
            adtf.f62701c = TextUtils.join(",", arrayList2);
            a2.close();
        }
        adsq n = adsr.m51117n();
        n.mo33777a(a.intValue());
        n.mo33782b("mms");
        n.mo33783c(sb2);
        n.f62646a = sra.m36060a(cursor2, 1);
        n.f62647b = sra.m36060a(cursor2, 2);
        int intValue2 = a.intValue();
        Uri.Builder buildUpon = adta.f62680b.buildUpon();
        buildUpon.appendPath(String.valueOf(intValue2)).appendPath("addr");
        Uri build = buildUpon.build();
        StringBuilder sb4 = new StringBuilder();
        Cursor a3 = this.f62713h.mo33689a(build, f62710j, null, null, "type ASC");
        if (a3 == null) {
            adnt.m50872b("Couldn't find MMS part for %d", Integer.valueOf(intValue2));
        } else {
            Context context = this.f62714m;
            TelephonyManager a4 = adnu.m50877a(context);
            if (a4 != null) {
                str = adnu.m50878a(context, a4.getLine1Number());
            } else {
                str = null;
            }
            while (a3.moveToNext()) {
                String a5 = adnu.m50878a(this.f62714m, sra.m36069c(a3, 1));
                if (!TextUtils.isEmpty(a5) && !a5.equals(str)) {
                    if (sb4.length() != 0) {
                        sb4.append(",");
                    }
                    sb4.append(a5);
                }
            }
        }
        if (a3 != null) {
            a3.close();
        }
        n.f62648c = sb4.toString();
        n.mo33778a(TimeUnit.SECONDS.toMillis(b.longValue()));
        n.f62649d = sra.m36069c(cursor2, 4);
        n.f62650e = adtf.f62699a;
        n.mo33781b((int) b.longValue());
        n.mo33779a(adtf.f62701c);
        n.f62651f = adtf.f62700b;
        boolean z = false;
        if (sra.m36061a(cursor2, 5, (Integer) 0).intValue() != 0) {
            z = true;
        }
        n.mo33780a(z);
        return n.mo33776a();
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* renamed from: a */
    public final int mo33804a(String str, long j, int i) {
        String str2;
        String valueOf = String.valueOf(Math.max(j, !"sms".equals(str) ? m51177a() / 1000 : m51177a()));
        adnr adnr = this.f62713h;
        Uri uri = "sms".equals(str) ? adta.f62679a : adta.f62680b;
        String[] strArr = {"count(*) as count"};
        if (!"sms".equals(str)) {
            str2 = f62712l;
        } else {
            str2 = f62706e;
        }
        Cursor a = adnr.mo33689a(uri, strArr, str2, new String[]{valueOf, valueOf, String.valueOf(i)}, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int intValue = sra.m36061a(a, 0, (Integer) 0).intValue();
                    a.close();
                    return intValue;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (a != null) {
            a.close();
        }
        return 0;
        throw th;
    }

    /* renamed from: a */
    public final adsr mo33805a(int i) {
        Cursor a = this.f62713h.mo33689a(adta.f62679a, f62704c, "_id=?", new String[]{String.valueOf(i)}, null);
        if (a != null) {
            try {
                if (a.moveToNext()) {
                    adsr a2 = mo33806a(a);
                    a.close();
                    return a2;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (a == null) {
            return null;
        }
        a.close();
        return null;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final adsr mo33806a(Cursor cursor) {
        boolean z = false;
        Integer a = sra.m36060a(cursor, 0);
        if (a == null) {
            return null;
        }
        Long b = sra.m36068b(cursor, 4);
        if (b == null || b.longValue() < 0) {
            adns.m50862a().mo33690a(44);
            return null;
        }
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("content://sms/");
        sb.append(valueOf);
        String sb2 = sb.toString();
        adsq n = adsr.m51117n();
        n.mo33777a(a.intValue());
        n.mo33782b("sms");
        n.mo33783c(sb2);
        n.f62646a = sra.m36060a(cursor, 1);
        n.f62647b = sra.m36060a(cursor, 2);
        n.f62648c = adnu.m50878a(this.f62714m, sra.m36069c(cursor, 3));
        n.mo33778a(b.longValue());
        n.f62649d = sra.m36069c(cursor, 5);
        n.f62650e = sra.m36069c(cursor, 6);
        n.mo33781b((int) TimeUnit.MILLISECONDS.toSeconds(b.longValue()));
        n.mo33779a("text_plain");
        if (sra.m36061a(cursor, 7, (Integer) 0).intValue() != 0) {
            z = true;
        }
        n.mo33780a(z);
        return n.mo33776a();
    }

    /* renamed from: a */
    public final Iterator mo33807a(Uri uri) {
        return new adst("_id", this.f62713h, uri);
    }

    /* renamed from: a */
    public final List mo33808a(int i, Uri uri, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
            if (arrayList.size() == i) {
                m51179a(uri, m51178a(arrayList), arrayList2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            m51179a(uri, m51178a(arrayList), arrayList2);
        }
        return arrayList2;
    }
}
