package p000;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: adsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adsr {

    /* renamed from: a */
    private static final bmyx f62659a = bmyx.m108640a(',').mo66917a().mo66920b();

    /* renamed from: a */
    public static List m51114a(Collection collection, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set<String> a = adso.m51105a(sQLiteDatabase, str);
            if (!a.isEmpty()) {
                for (String str2 : a) {
                    bric d = brid.m114048d();
                    d.mo69559d(str);
                    d.mo69558c(str2);
                    arrayList.add(d);
                }
            } else {
                bric d2 = brid.m114048d();
                d2.mo69559d(str);
                arrayList.add(d2);
            }
        }
        new Object[1][0] = arrayList;
        return arrayList;
    }

    /* renamed from: b */
    public static bric m51116b(Collection collection, SQLiteDatabase sQLiteDatabase) {
        if (collection.isEmpty()) {
            return null;
        }
        String str = (String) collection.iterator().next();
        bric d = brid.m114048d();
        d.mo69559d(str);
        Set a = adso.m51105a(sQLiteDatabase, str);
        if (!a.isEmpty()) {
            d.mo69558c((String) a.iterator().next());
        }
        new Object[1][0] = d;
        return d;
    }

    /* renamed from: n */
    public static adsq m51117n() {
        adsq adsq = new adsq();
        adsq.mo33780a(false);
        adsq.mo33781b(0);
        adsq.mo33778a(0L);
        adsq.mo33779a("text_plain");
        return adsq;
    }

    /* renamed from: a */
    public abstract int mo33760a();

    /* renamed from: b */
    public abstract String mo33761b();

    /* renamed from: c */
    public abstract String mo33762c();

    /* renamed from: d */
    public abstract Integer mo33763d();

    /* renamed from: e */
    public abstract Integer mo33764e();

    /* renamed from: f */
    public abstract long mo33766f();

    /* renamed from: g */
    public abstract String mo33767g();

    /* renamed from: h */
    public abstract String mo33768h();

    /* renamed from: i */
    public abstract String mo33770i();

    /* renamed from: j */
    public abstract int mo33771j();

    /* renamed from: k */
    public abstract String mo33772k();

    /* renamed from: l */
    public abstract String mo33773l();

    /* renamed from: m */
    public abstract boolean mo33774m();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo33785o() {
        return m51115a(mo33763d(), mo33761b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Set mo33786p() {
        String g = mo33767g();
        if (!TextUtils.isEmpty(g)) {
            return bnic.m109488a(f62659a.mo66918a((CharSequence) g));
        }
        return bnon.f131923a;
    }

    /* renamed from: a */
    static boolean m51115a(Integer num, String str) {
        Integer num2 = 1;
        if ((!"sms".equals(str) || !num2.equals(num)) && (!"mms".equals(str) || !num2.equals(num))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final brhy mo33784a(SQLiteDatabase sQLiteDatabase) {
        String str;
        bric a = brid.m114045a();
        a.mo69557b(mo33762c());
        a.mo69558c(mo33768h() != null ? mo33768h() : "");
        brhx brhx = new brhx();
        brhx.mo69541a(mo33771j());
        brhx.mo69542b();
        a.mo69548a(brhx);
        if (mo33770i() != null) {
            a.mo69553a("text", mo33770i());
        }
        if (mo33764e() != null) {
            bric bric = new bric("Conversation");
            String valueOf = String.valueOf(mo33764e());
            sdo.m34959a((Object) valueOf);
            bric.mo69553a("id", valueOf);
            bric[] bricArr = {bric};
            sdo.m34959a(bricArr);
            a.mo69552a("isPartOf", bricArr);
        }
        Date date = new Date(mo33766f());
        ArrayList arrayList = new ArrayList();
        if (!mo33774m()) {
            str = "unread";
        } else {
            str = "read";
        }
        arrayList.add(str);
        Set p = mo33786p();
        if (mo33785o()) {
            arrayList.add("inbox");
            sdo.m34959a(date);
            a.mo69551a("dateReceived", date.getTime());
            bric b = m51116b(p, sQLiteDatabase);
            if (b != null) {
                a.mo69549a(b);
            }
        } else {
            arrayList.add("sent");
            sdo.m34959a(date);
            a.mo69551a("dateSent", date.getTime());
            List a2 = m51114a(p, sQLiteDatabase);
            if (!a2.isEmpty()) {
                a.mo69555a((bric[]) a2.toArray(new bric[0]));
            }
        }
        if (!(!"mms".equals(mo33761b()) || mo33772k() == null || mo33773l() == null)) {
            String[] split = mo33772k().split(",");
            String[] strArr = {"text_plain"};
            Object[] objArr = null;
            if (split != null) {
                Class<?> componentType = strArr.getClass().getComponentType();
                int length = split.length;
                Object[] objArr2 = (Object[]) Array.newInstance(componentType, length);
                int i = 0;
                for (String str2 : split) {
                    if (!sdg.m34949a(strArr[0], str2)) {
                        objArr2[i] = str2;
                        i++;
                    }
                }
                if (objArr2 != null) {
                    objArr = i != objArr2.length ? Arrays.copyOf(objArr2, i) : objArr2;
                }
            }
            String[] strArr2 = (String[]) objArr;
            String[] split2 = TextUtils.split(mo33773l(), ",");
            int length2 = strArr2.length;
            int length3 = split2.length;
            if (length2 == length3) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    if (strArr2[i2].startsWith("image_")) {
                        bric bric2 = new bric("Photograph");
                        bric2.mo69557b(split2[i2]);
                        arrayList2.add(bric2);
                    } else if (!strArr2[i2].startsWith("video_")) {
                        adnt.m50872b("Unknown content type: %s", strArr2[i2]);
                    } else {
                        bric bric3 = new bric("VideoObject");
                        bric3.mo69557b(split2[i2]);
                        arrayList2.add(bric3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    a.mo69552a("messageAttachment", (bric[]) arrayList2.toArray(new bric[0]));
                }
            } else {
                adnt.m50872b("contentTypes and mediaUris have different lengths (%d and %d).", Integer.valueOf(length2), Integer.valueOf(length3));
            }
        }
        a.mo69556a((String[]) arrayList.toArray(new String[0]));
        return a.mo69547a();
    }
}
