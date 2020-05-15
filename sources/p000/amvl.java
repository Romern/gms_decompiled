package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/* renamed from: amvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvl {

    /* renamed from: a */
    private final Context f76022a;

    public amvl(Context context) {
        this.f76022a = context;
    }

    /* renamed from: a */
    public static boolean m63383a(int i, int i2) {
        if (((long) i2) <= cfxe.f185877a.mo6606a().mo82896s()) {
            double d = (double) i;
            double t = cfxe.f185877a.mo6606a().mo82897t();
            Double.isNaN(d);
            if (((double) i2) <= d * t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m63384c() {
        return !cfxe.m143374m();
    }

    /* renamed from: d */
    public static boolean m63385d() {
        return !cfxe.m143375n();
    }

    /* renamed from: e */
    private final String m63386e() {
        almg almg;
        if (cfum.m143092c()) {
            almg = almc.m61252a(this.f76022a).mo40498a(EnumSet.of(almb.SHEEPDOG_ELIGIBLE));
        } else {
            almg = new almg(cfum.m143091b());
        }
        EnumSet of = EnumSet.of(allz.DEVICE);
        EnumSet of2 = EnumSet.of(almb.SHEEPDOG_ELIGIBLE);
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        for (int i = 0; i < almg.f73684a.f73649a.size(); i++) {
            allw allw = (allw) almg.f73684a.f73649a.get(i);
            allz a = allz.m61245a(allw.f73639a);
            if (a == null) {
                a = allz.UNKNOWN;
            }
            if (of.contains(a)) {
                almb a2 = almb.m61249a(allw.f73645g);
                if (a2 == null) {
                    a2 = almb.UNKNOWN;
                }
                if (of2.contains(a2)) {
                    arrayList.clear();
                    arrayList.addAll((Collection) almg.f73685b.get(i));
                    arrayList.removeAll((Collection) almg.f73686c.get(i));
                    hashSet.addAll(arrayList);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (cfxe.m143373l()) {
            sb.append("(data_set IS NULL) AND ");
        }
        sb.append("(deleted = 0) AND ((account_name IS NULL AND account_type IS NULL) OR (account_type IN ( ");
        ArrayList arrayList2 = new ArrayList();
        for (String str : hashSet) {
            arrayList2.add(DatabaseUtils.sqlEscapeString(str));
        }
        sb.append(TextUtils.join(",", arrayList2));
        sb.append(")))");
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo41388b() {
        return mo41387a(m63386e());
    }

    /* renamed from: a */
    public final int mo41385a() {
        String e = m63386e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 11);
        sb.append("(");
        sb.append(e);
        sb.append(") AND (%s)");
        return mo41387a(String.format(sb.toString(), "sourceid IS NOT NULL OR sync1 IS NOT NULL OR sync2 IS NOT NULL OR sync3 IS NOT NULL OR sync4 IS NOT NULL"));
    }

    /* renamed from: a */
    public final int mo41386a(Uri uri, String str) {
        int i;
        String[] strArr = amvt.f76137a;
        Cursor query = this.f76022a.getContentResolver().query(uri, new String[]{"_count"}, str, null, null);
        if (query != null) {
            try {
                boolean moveToLast = query.moveToLast();
                if (!cfwv.f185860a.mo6606a().mo82845a()) {
                    i = query.getInt(0);
                } else if (moveToLast) {
                    i = query.getInt(0);
                } else {
                    throw new aaaj(13, "Failed to operate Cursor.moveToLast()");
                }
                query.close();
                return i;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new aaaj(13, "Failed to query contact count: NULL cursor");
        }
        throw th;
    }

    /* renamed from: a */
    public final int mo41387a(String str) {
        return mo41386a(ContactsContract.RawContacts.CONTENT_URI, str);
    }
}
