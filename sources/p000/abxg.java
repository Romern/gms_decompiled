package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: abxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxg extends abxc {

    /* renamed from: a */
    private final String[] f58673a;

    /* renamed from: a */
    public final abxb mo32404a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        HashSet hashSet;
        List<String> list;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        abvo abvo2 = abvo;
        String[] strArr = this.f58673a;
        sdo.m34970a(sQLiteDatabase.inTransaction());
        String str = abyy.f58780f;
        Set a = abvn.m48330a(sQLiteDatabase2, str, abxt);
        if ("com.google.android.apps.messaging".equals(str) && cemj.f182986a.mo6606a().mo79348a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("Message", new abvm(abvo.m48338a(a, "Message")));
            hashMap.put("Conversation", new abvm(abvo.m48338a(a, "Conversation")));
            hashMap.put("Person", new abvm(abvo.m48338a(a, "Person")));
            hashMap.put("DigitalDocument", new abvm(abvo.m48338a(a, "DigitalDocument")));
            hashMap.put("LocalBusiness", new abvm(abvo.m48338a(a, "LocalBusiness")));
            int length = strArr.length;
            int i = 0;
            loop0:
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    if (str2.startsWith("messages", 44)) {
                        list = Arrays.asList("Message");
                    } else if (str2.startsWith("conversations", 44)) {
                        list = Arrays.asList("Conversation");
                    } else if (str2.startsWith("participants", 44)) {
                        list = Arrays.asList("Person");
                    } else if (str2.startsWith("annotations", 44)) {
                        list = Arrays.asList("LocalBusiness", "DigitalDocument");
                    } else {
                        absg.m48191b("Unknown url format from com.google.android.apps.messaging. Falling back to fanout");
                        list = Collections.emptyList();
                    }
                    if (list.isEmpty()) {
                        hashSet = null;
                        break;
                    }
                    for (String str3 : list) {
                        abvm abvm = (abvm) hashMap.get(str3);
                        if (abvm == null) {
                            hashSet = null;
                            break loop0;
                        }
                        if (abvm.f58553b == null) {
                            abvm.f58553b = new ArrayList();
                        }
                        abvm.f58553b.add(str2);
                    }
                    i++;
                } else {
                    hashSet = new HashSet();
                    for (abvm abvm2 : hashMap.values()) {
                        List list2 = abvm2.f58553b;
                        if (list2 != null) {
                            abvo2.mo32361a(sQLiteDatabase2, (String[]) list2.toArray(new String[0]), abvm2.f58552a);
                            hashSet.addAll(abvm2.f58552a);
                        }
                    }
                }
            }
            if (hashSet != null) {
                a = hashSet;
                return abxb.m48430a(a);
            }
        }
        abvo2.mo32361a(sQLiteDatabase2, strArr, a);
        return abxb.m48430a(a);
    }

    public abxg(String[] strArr) {
        super(abxl.m48464a(strArr), 5);
        this.f58673a = strArr;
    }

    /* renamed from: a */
    public final void mo32405a(abrv abrv, abyy abyy, abvx abvx) {
        String[] strArr = this.f58673a;
        for (String str : strArr) {
            bxvd da = abqq.f58001c.mo74144da();
            bxvd da2 = abqs.f58008c.mo74144da();
            String str2 = abyy.f58780f;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abqs abqs = (abqs) da2.f164949b;
            str2.getClass();
            abqs.f58010a = str2;
            str.getClass();
            abqs.f58011b = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqq abqq = (abqq) da.f164949b;
            abqs abqs2 = (abqs) da2.mo74062i();
            abqs2.getClass();
            abqq.f58004b = abqs2;
            abqq.f58003a = 3;
            abvx.mo32374a((abqq) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo32406a(abyy abyy, abrv abrv, abxt abxt) {
        String[] strArr = this.f58673a;
        if (strArr != null) {
            int length = strArr.length;
            if (length <= 1000) {
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    if (str != null) {
                        try {
                            abyf.m48535a(str);
                            i++;
                        } catch (IllegalArgumentException e) {
                            throw new abxq(e.getMessage(), bpzq.INVALID_ARGUMENT_URI);
                        }
                    } else {
                        throw new abxq("URL cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
                    }
                }
                return;
            }
            throw new abxq("Providing more than 1000 URLs in one remove call is not allowed.", bpzq.INVALID_ARGUMENT_TOO_MANY);
        }
        throw new abxq("URLs cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
    }
}
