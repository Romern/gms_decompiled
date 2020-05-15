package p000;

import android.content.ContentUris;
import android.content.ContentValues;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: acoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acoa {

    /* renamed from: a */
    public final brhj f60316a;

    public acoa(brhj brhj) {
        this.f60316a = brhj;
    }

    /* renamed from: a */
    public static String m49583a(long j) {
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32941a(acmo acmo) {
        List list;
        List list2;
        acmo acmo2 = acmo;
        brhj brhj = this.f60316a;
        brhy[] brhyArr = new brhy[1];
        Long asLong = acmo2.f60161a.getAsLong("contact_id");
        String asString = acmo2.f60161a.getAsString("display_name");
        String asString2 = acmo2.f60161a.getAsString("lookup_key");
        sdo.m34959a(asLong);
        sdo.m34959a((Object) asString);
        sdo.m34959a((Object) asString2);
        bric d = brid.m114048d();
        d.mo69557b(m49583a(asLong.longValue()));
        d.mo69558c(asString);
        d.mo69553a("identifier", asString2);
        ArrayList arrayList = new ArrayList();
        String asString3 = acmo2.f60161a.getAsString("nickname");
        if (!TextUtils.isEmpty(asString3)) {
            arrayList.add(asString3);
        }
        String asString4 = acmo2.f60161a.getAsString("phonetic_name");
        if (!TextUtils.isEmpty(asString4)) {
            arrayList.add(asString4);
        }
        d.mo69553a("additionalName", (String[]) arrayList.toArray(new String[0]));
        HashSet<String> hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (ContentValues contentValues : acmo2.f60163c.values()) {
            String asString5 = contentValues.getAsString("label");
            if (asString5 != null) {
                hashSet.add(asString5);
                List list3 = (List) hashMap2.get(asString5);
                if (list3 == null) {
                    list2 = new ArrayList();
                    hashMap2.put(asString5, list2);
                } else {
                    list2 = list3;
                }
                String asString6 = contentValues.getAsString("email");
                if (asString6 != null) {
                    list2.add(asString6);
                }
            }
        }
        for (ContentValues contentValues2 : acmo2.f60164d.values()) {
            String asString7 = contentValues2.getAsString("label");
            if (asString7 != null) {
                hashSet.add(asString7);
                List list4 = (List) hashMap3.get(asString7);
                if (list4 == null) {
                    list = new ArrayList();
                    hashMap3.put(asString7, list);
                } else {
                    list = list4;
                }
                String asString8 = contentValues2.getAsString("phone");
                if (asString8 != null) {
                    list.add(asString8);
                }
            }
        }
        for (ContentValues contentValues3 : acmo2.f60165e.values()) {
            String asString9 = contentValues3.getAsString("label");
            if (asString9 != null) {
                hashSet.add(asString9);
                List list5 = (List) hashMap.get(asString9);
                if (list5 == null) {
                    list5 = new ArrayList();
                    hashMap.put(asString9, list5);
                }
                String asString10 = contentValues3.getAsString("postal");
                if (asString10 != null) {
                    list5.add(asString10);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : hashSet) {
            bric bric = new bric("ContactPoint");
            bric.mo69558c(str);
            List list6 = (List) hashMap.get(str);
            if (list6 != null) {
                bric.mo69553a("address", (String[]) list6.toArray(new String[0]));
            }
            List list7 = (List) hashMap2.get(str);
            if (list7 != null) {
                bric.mo69553a("email", (String[]) list7.toArray(new String[0]));
            }
            List list8 = (List) hashMap3.get(str);
            if (list8 != null) {
                bric.mo69553a("telephone", (String[]) list8.toArray(new String[0]));
            }
            arrayList2.add(bric);
        }
        d.mo69552a("contactPoint", (bric[]) arrayList2.toArray(new bric[0]));
        int size = arrayList.size();
        int size2 = arrayList2.size();
        brhx brhx = new brhx();
        brhx.mo69542b();
        brhx.mo69541a(size + 1 + size2);
        d.mo69548a(brhx);
        brhyArr[0] = d.mo69547a();
        brhj.mo32869a(brhyArr);
    }
}
