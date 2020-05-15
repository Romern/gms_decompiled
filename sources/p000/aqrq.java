package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.people.identity.models.Person;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: aqrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrq implements aqvr {

    /* renamed from: a */
    public final List f86664a = new ArrayList();

    /* renamed from: b */
    public final List f86665b = new ArrayList();

    /* renamed from: c */
    public SmartProfilePerson f86666c;

    /* renamed from: d */
    private final List f86667d = new ArrayList();

    /* renamed from: e */
    private final aqqq f86668e;

    /* renamed from: f */
    private bzhs f86669f;

    public aqrq(aqqq aqqq, Bundle bundle) {
        this.f86668e = aqqq;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("merged emails");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("merged phones");
            if (stringArrayList != null) {
                this.f86664a.addAll(stringArrayList);
            }
            if (stringArrayList2 != null) {
                this.f86665b.addAll(stringArrayList2);
            }
        }
    }

    /* renamed from: b */
    private final bngx m72016b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SmartProfilePerson smartProfilePerson = this.f86666c;
        if (smartProfilePerson != null) {
            ArrayList arrayList = new ArrayList();
            List list = smartProfilePerson.f81742i;
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.Emails emails = (Person.Emails) list.get(i);
                    if (!hashSet.contains(emails.mo40923i())) {
                        arrayList.add(emails);
                        hashSet.add(emails.mo40923i());
                    }
                }
                Collections.sort(arrayList, new aqrk());
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.Emails emails2 = (Person.Emails) arrayList.get(i2);
                if (!linkedHashMap.containsKey(emails2.mo40923i())) {
                    bxvd da = bzhq.f170101e.mo74144da();
                    String i3 = emails2.mo40923i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzhq bzhq = (bzhq) da.f164949b;
                    i3.getClass();
                    bzhq.f170103a |= 2;
                    bzhq.f170104b = i3;
                    String a = this.f86668e.mo48080a(emails2.mo40919e(), aqqo.f86610a);
                    if (!TextUtils.isEmpty(a)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzhq bzhq2 = (bzhq) da.f164949b;
                        a.getClass();
                        bzhq2.f170103a |= 8;
                        bzhq2.f170105c = a;
                    }
                    linkedHashMap.put(emails2.mo40923i(), (bzhq) da.mo74062i());
                }
            }
        }
        bzhs bzhs = this.f86669f;
        if (bzhs != null) {
            bxwc bxwc = bzhs.f170115a;
            int size3 = bxwc.size();
            for (int i4 = 0; i4 < size3; i4++) {
                bzhq bzhq3 = (bzhq) bxwc.get(i4);
                if (!bzhq3.f170104b.isEmpty()) {
                    if (linkedHashMap.containsKey(bzhq3.f170104b)) {
                        bzhq bzhq4 = (bzhq) linkedHashMap.get(bzhq3.f170104b);
                        bxvd da2 = bzhq.f170101e.mo74144da();
                        String str = bzhq4.f170104b;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzhq bzhq5 = (bzhq) da2.f164949b;
                        str.getClass();
                        int i5 = bzhq5.f170103a | 2;
                        bzhq5.f170103a = i5;
                        bzhq5.f170104b = str;
                        if ((bzhq4.f170103a & 8) != 0) {
                            String str2 = bzhq4.f170105c;
                            str2.getClass();
                            bzhq5.f170103a = i5 | 8;
                            bzhq5.f170105c = str2;
                        }
                        if ((bzhq3.f170103a & 16) != 0) {
                            int a2 = bzhp.m125803a(bzhq3.f170106d);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bzhq bzhq6 = (bzhq) da2.f164949b;
                            bzhq6.f170106d = a2 - 1;
                            bzhq6.f170103a |= 16;
                        }
                        linkedHashMap.put(bzhq3.f170104b, (bzhq) da2.mo74062i());
                    } else {
                        linkedHashMap.put(bzhq3.f170104b, bzhq3);
                    }
                }
            }
        }
        List list2 = this.f86664a;
        if (list2 != null) {
            int size4 = list2.size();
            for (int i6 = 0; i6 < size4; i6++) {
                String str3 = (String) list2.get(i6);
                if (!linkedHashMap.containsKey(str3)) {
                    bxvd da3 = bzhq.f170101e.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzhq bzhq7 = (bzhq) da3.f164949b;
                    str3.getClass();
                    bzhq7.f170103a |= 2;
                    bzhq7.f170104b = str3;
                    linkedHashMap.put(str3, (bzhq) da3.mo74062i());
                }
            }
        }
        return bngx.m109368a(linkedHashMap.values());
    }

    /* renamed from: c */
    private final bngx m72017c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SmartProfilePerson smartProfilePerson = this.f86666c;
        if (smartProfilePerson != null) {
            ArrayList arrayList = new ArrayList();
            List list = smartProfilePerson.f81758y;
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list.get(i);
                    if (!hashSet.contains(phoneNumbers.mo40985k())) {
                        arrayList.add(phoneNumbers);
                        hashSet.add(phoneNumbers.mo40985k());
                    }
                }
                Collections.sort(arrayList, new aqrl());
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.PhoneNumbers phoneNumbers2 = (Person.PhoneNumbers) arrayList.get(i2);
                if (!linkedHashMap.containsKey(phoneNumbers2.mo40985k())) {
                    bxvd da = bzhr.f170107e.mo74144da();
                    String k = phoneNumbers2.mo40985k();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzhr bzhr = (bzhr) da.f164949b;
                    k.getClass();
                    int i3 = bzhr.f170109a | 2;
                    bzhr.f170109a = i3;
                    bzhr.f170110b = k;
                    bzhr.f170112d = 2;
                    bzhr.f170109a = i3 | 32;
                    String a = this.f86668e.mo48080a(phoneNumbers2.mo40981g(), aqqn.f86609a);
                    if (!TextUtils.isEmpty(a)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzhr bzhr2 = (bzhr) da.f164949b;
                        a.getClass();
                        bzhr2.f170109a |= 8;
                        bzhr2.f170111c = a;
                    }
                    linkedHashMap.put(phoneNumbers2.mo40985k(), (bzhr) da.mo74062i());
                }
            }
        }
        bzhs bzhs = this.f86669f;
        if (bzhs != null) {
            bxwc bxwc = bzhs.f170116b;
            int size3 = bxwc.size();
            for (int i4 = 0; i4 < size3; i4++) {
                bzhr bzhr3 = (bzhr) bxwc.get(i4);
                if (!bzhr3.f170110b.isEmpty()) {
                    if (!linkedHashMap.containsKey(bzhr3.f170110b) || (bzhr3.f170109a & 32) == 0) {
                        linkedHashMap.put(bzhr3.f170110b, bzhr3);
                    } else {
                        String str = bzhr3.f170110b;
                        bxvd a2 = bzhr.f170107e.mo74141a((bzhr) linkedHashMap.get(str));
                        int a3 = bzhp.m125803a(bzhr3.f170112d);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        if (a2.f164950c) {
                            a2.mo74035c();
                            a2.f164950c = false;
                        }
                        bzhr bzhr4 = (bzhr) a2.f164949b;
                        bzhr4.f170112d = a3 - 1;
                        bzhr4.f170109a |= 32;
                        linkedHashMap.put(str, (bzhr) a2.mo74062i());
                    }
                }
            }
        }
        List list2 = this.f86665b;
        if (list2 != null) {
            int size4 = list2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                String str2 = (String) list2.get(i5);
                if (!linkedHashMap.containsKey(str2)) {
                    bxvd da2 = bzhr.f170107e.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzhr bzhr5 = (bzhr) da2.f164949b;
                    str2.getClass();
                    bzhr5.f170109a |= 2;
                    bzhr5.f170110b = str2;
                    linkedHashMap.put(str2, (bzhr) da2.mo74062i());
                }
            }
        }
        return bngx.m109368a(linkedHashMap.values());
    }

    /* renamed from: d */
    private final bngx m72018d() {
        bzhs bzhs = this.f86669f;
        if (bzhs == null || bzhs.f170117c.size() == 0) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        if (!this.f86669f.f170118d.isEmpty()) {
            bxvd da = bzhn.f170094e.mo74144da();
            String str = this.f86669f.f170118d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzhn bzhn = (bzhn) da.f164949b;
            str.getClass();
            bzhn.f170096a |= 2;
            bzhn.f170097b = str;
            j.mo67668c((bzhn) da.mo74062i());
        }
        j.mo67666b((Iterable) this.f86669f.f170117c);
        return j.mo67664a();
    }

    /* renamed from: a */
    public final void mo48115a() {
        bngx b = m72016b();
        bngx c = m72017c();
        bngx d = m72018d();
        List list = this.f86667d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aqrp) list.get(i)).mo48048a(b, c, d);
        }
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        bzhs bzhs = aqqw.f86626b;
        if (bzhs != null) {
            this.f86669f = bzhs;
            mo48115a();
        }
    }

    /* renamed from: a */
    public final void mo48116a(aqrp aqrp) {
        this.f86667d.add(aqrp);
        bngx b = m72016b();
        bngx c = m72017c();
        bngx d = m72018d();
        if (!b.isEmpty() || !c.isEmpty() || !d.isEmpty()) {
            aqrp.mo48048a(b, c, d);
        }
    }
}
