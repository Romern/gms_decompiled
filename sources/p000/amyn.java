package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: amyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyn extends amyj {

    /* renamed from: e */
    public static final bnic f76392e = bnic.m109494a("vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/group_membership", "vnd.android.cursor.item/identity", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/note", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/website", "vnd.android.cursor.item/name", "vnd.com.google.cursor.item/contact_calendar_link", "vnd.com.google.cursor.item/contact_extended_property", "vnd.com.google.cursor.item/contact_external_id", "vnd.com.google.cursor.item/contact_hobby", "vnd.com.google.cursor.item/contact_jot", "vnd.com.google.cursor.item/contact_language", "vnd.com.google.cursor.item/contact_misc", "vnd.com.google.cursor.item/contact_user_defined_field", "vnd.com.google.cursor.item/contact_file_as");

    public amyn(ContentResolver contentResolver, Account account, amvm amvm) {
        super(contentResolver, account, amvm);
    }

    /* renamed from: a */
    public static boolean m63729a(amvp amvp) {
        List list = amvp.f76111t;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                ContentValues contentValues = (ContentValues) list.get(i);
                contentValues.toString();
                i++;
                if (contentValues.getAsString("group_sourceid") == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo41563b(List list, anaq anaq) {
        anad anad;
        list.size();
        this.f76382c.mo41389a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sdo.m34959a(linkedHashMap);
        sdo.m34974b(linkedHashMap.isEmpty());
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        int i = 1;
        int i2 = 0;
        boolean z = true;
        while (i2 < size) {
            amvp amvp = (amvp) list.get(i2);
            if (amvp != null) {
                if (!z) {
                    sb.append(",");
                }
                String str = amvp.f76092a;
                linkedHashMap.put(str, amvp);
                DatabaseUtils.appendEscapedSQLString(sb, str);
                z = false;
            }
            i2++;
            i = 1;
        }
        char c = 2;
        Object[] objArr = new Object[2];
        objArr[0] = "sourceid" + " in (" + ((CharSequence) sb) + ") OR (sync2 in (" + ((CharSequence) sb) + ") AND sourceid IS NULL)";
        objArr[i] = "data_set IS NULL AND sourceid IS NULL AND sync3 IS NOT NULL";
        String format = String.format("(%s) OR (%s)", objArr);
        ContentResolver contentResolver = this.f76380a;
        Account account = this.f76381b;
        bnic bnic = f76392e;
        String[] strArr = amvt.f76137a;
        amvw a = amvw.m63489a(contentResolver, account, bnic, format, null);
        try {
            List<amvp> e = a.mo41471e();
            amig.m62939a();
            if (((Boolean) amfp.f74866a.mo41191a()).booleanValue()) {
                a.mo41472f();
            }
            linkedHashMap.size();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (amvp amvp2 : e) {
                String str2 = amvp2.f76092a;
                if (str2 == null) {
                    String str3 = amvp2.f76094c;
                    if (str3 != null) {
                        hashMap.put(str3, amvp2);
                    }
                } else {
                    hashMap.put(str2, amvp2);
                }
            }
            for (String str4 : linkedHashMap.keySet()) {
                this.f76382c.mo41389a();
                amvp amvp3 = (amvp) linkedHashMap.get(str4);
                if (amvp3 != null) {
                    if (hashMap.containsKey(str4)) {
                        anad = new anad(amvp3, (amvp) hashMap.get(str4));
                    } else {
                        HashSet hashSet = new HashSet();
                        List[] listArr = new List[4];
                        listArr[0] = amvp3.f76081A;
                        listArr[i] = amvp3.f76085E;
                        listArr[c] = amvp3.f76106o;
                        listArr[3] = amvp3.f76087G;
                        ArrayList arrayList = new ArrayList(Arrays.asList(listArr));
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            List<ContentValues> list2 = (List) arrayList.get(i3);
                            if (list2 != null) {
                                for (ContentValues contentValues : list2) {
                                    hashSet.add(contentValues.getAsString("data1"));
                                }
                            }
                            i3++;
                            c = 2;
                            i = 1;
                        }
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = hashSet;
                        Integer valueOf = Integer.valueOf(Arrays.hashCode(objArr2));
                        anad = hashMap2.containsKey(valueOf) ? new anad(amvp3, (amvp) hashMap2.remove(valueOf)) : new anad(amvp3);
                    }
                    anaq.mo41605a(anad);
                } else {
                    c = 2;
                    i = 1;
                }
            }
            e.size();
        } catch (Throwable th) {
            Throwable th2 = th;
            amig.m62939a();
            if (((Boolean) amfp.f74866a.mo41191a()).booleanValue()) {
                a.mo41472f();
            }
            throw th2;
        }
    }
}
