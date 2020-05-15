package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: amyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyq extends amyj {

    /* renamed from: e */
    public static final String[] f76400e = {"sourceid", "_id"};

    /* renamed from: f */
    public final Uri f76401f;

    /* renamed from: g */
    private final Map f76402g = new HashMap();

    /* renamed from: h */
    private final Set f76403h = new HashSet();

    /* renamed from: i */
    private final anaz f76404i;

    /* renamed from: j */
    private final amyk f76405j;

    /* renamed from: k */
    private final amwl f76406k;

    /* JADX INFO: finally extract failed */
    public amyq(ContentResolver contentResolver, Account account, amvm amvm, anaz anaz, amwl amwl) {
        super(contentResolver, account, amvm);
        String str;
        this.f76404i = anaz;
        this.f76405j = new amyk(account, contentResolver);
        this.f76406k = amwl;
        Uri a = amvt.m63471a(ContactsContract.Groups.CONTENT_URI, account);
        this.f76401f = a;
        amvy a2 = amvy.m63503a(contentResolver, a, null, "sourceid IS NULL AND (system_id = 'Contacts' OR title = 'Starred in Android')", null, "_id");
        while (true) {
            try {
                amvr a3 = a2.mo41464b();
                if (a3 != null) {
                    if (!TextUtils.equals(a3.mo41406l(), "Starred in Android")) {
                        str = a3.mo41405k();
                    } else {
                        str = "Starred in Android";
                    }
                    if (!this.f76402g.containsKey(str)) {
                        this.f76402g.put(str, a3);
                    }
                    this.f76403h.add(a3.mo41400g());
                } else {
                    a2.mo41472f();
                    this.f76402g.size();
                    return;
                }
            } catch (Throwable th) {
                a2.mo41472f();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final List mo41568a(Long l, String str) {
        String str2;
        ContentResolver contentResolver = this.f76380a;
        Uri uri = this.f76401f;
        String[] strArr = amvt.f76137a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = l;
        if (cfwg.f185837a.mo6606a().mo82827a()) {
            str2 = DatabaseUtils.sqlEscapeString(str);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("'");
            sb.append(str);
            sb.append("'");
            str2 = sb.toString();
        }
        objArr[1] = str2;
        amvy b = amvy.m63506b(contentResolver, uri, null, String.format(locale, "data_set IS NULL AND (sourceid IS NOT NULL AND _id != %d AND title = %s AND deleted = 0)", objArr), null, null);
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                amvr a = b.mo41464b();
                if (a == null) {
                    return arrayList;
                }
                arrayList.add(a);
            } finally {
                b.mo41472f();
            }
        }
    }

    /* renamed from: b */
    public final void mo41563b(List list, anaq anaq) {
        Throwable th;
        amvy amvy;
        list.size();
        this.f76382c.mo41389a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            sdo.m34959a(linkedHashMap);
            sdo.m34974b(linkedHashMap.isEmpty());
            StringBuilder sb = new StringBuilder("sourceid");
            sb.append(" in (");
            StringBuilder sb2 = new StringBuilder(String.format("(%s is NULL) AND (%s is NULL) AND %s in (", "sourceid", "system_id", "title"));
            Iterator it = list.iterator();
            boolean z = true;
            boolean z2 = true;
            while (it.hasNext()) {
                amvr amvr = (amvr) it.next();
                if (amvr != null) {
                    String j = amvr.mo41404j();
                    if (!TextUtils.isEmpty(j)) {
                        if (!z) {
                            sb.append(",");
                        }
                        linkedHashMap.put(j, amvr);
                        DatabaseUtils.appendEscapedSQLString(sb, j);
                        if (TextUtils.isEmpty(amvr.mo41406l())) {
                            z = false;
                        } else {
                            if (!z2) {
                                sb2.append(",");
                            }
                            DatabaseUtils.appendEscapedSQLString(sb2, amvr.mo41406l());
                            z = false;
                            z2 = false;
                        }
                    }
                }
            }
            sb.append(")");
            sb2.append(")");
            String format = String.format("%s OR (%s)", sb.toString(), sb2.toString());
            ContentResolver contentResolver = this.f76380a;
            Uri uri = this.f76401f;
            String[] strArr = amvt.f76137a;
            amvy = amvy.m63503a(contentResolver, uri, null, format, null, null);
            try {
                linkedHashMap.size();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (true) {
                    amvr a = amvy.mo41464b();
                    if (a == null) {
                        break;
                    }
                    this.f76382c.mo41389a();
                    if (!TextUtils.isEmpty(a.mo41404j())) {
                        hashMap.put(a.mo41404j(), a);
                    } else if (!this.f76403h.contains(a.mo41400g())) {
                        hashMap2.put(a.mo41406l(), a);
                    }
                }
                amvy.mo41472f();
                for (String str : linkedHashMap.keySet()) {
                    amvr amvr2 = (amvr) linkedHashMap.get(str);
                    if (hashMap.containsKey(str)) {
                        anaq.mo41605a(new anad(amvr2, (amvr) hashMap.get(str)));
                    } else if (!hashMap2.containsKey(amvr2.mo41406l())) {
                        this.f76402g.size();
                        amvr amvr3 = (amvr) this.f76402g.remove(amvr2.mo41405k());
                        if (amvr3 == null) {
                            amvr3 = (amvr) this.f76402g.remove(amvr2.mo41406l());
                        }
                        if (amvr3 != null) {
                            amvr2.mo41404j();
                            amvr2.mo41404j();
                            anaq.mo41605a(new anad(amvr2, amvr3));
                        } else {
                            anaq.mo41605a(new anad(amvr2));
                        }
                    } else {
                        amvr2.mo41406l();
                        anaq.mo41605a(new anad(amvr2, (amvr) hashMap2.remove(amvr2.mo41406l())));
                    }
                }
                amig.m62939a();
                if (((Boolean) amfp.f74866a.mo41191a()).booleanValue() && amvy != null) {
                    amvy.mo41472f();
                }
            } catch (Throwable th2) {
                th = th2;
                amig.m62939a();
                if (((Boolean) amfp.f74866a.mo41191a()).booleanValue() && amvy != null) {
                    amvy.mo41472f();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            amvy = null;
            amig.m62939a();
            amvy.mo41472f();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo41569a(String str) {
        Log.e("FSA2_LocalGroupsReader", str);
        for (amvr amvr : this.f76402g.values()) {
            bxvd da = amni.f75479d.mo74144da();
            amng a = anax.m63874a(amvr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amni amni = (amni) da.f164949b;
            a.getClass();
            amni.f75482b = a;
            amni.f75481a |= 1;
            amig.m62939a();
            if (((Boolean) amfx.f74874a.mo41191a()).booleanValue()) {
                try {
                    amnh a2 = this.f76405j.mo41564a(amvr.mo41400g().longValue());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amni amni2 = (amni) da.f164949b;
                    a2.getClass();
                    amni2.f75483c = a2;
                    amni2.f75481a |= 2;
                } catch (RemoteException e) {
                }
            }
            this.f76404i.mo41637a((amni) da.mo74062i());
        }
        if (cfwd.f185832a.mo6606a().mo82824b()) {
            this.f76406k.mo41490b();
        }
        throw new amyc(new amyb(str));
    }
}
