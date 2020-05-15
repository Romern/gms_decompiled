package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeopleaffinities;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: amdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdx {

    /* renamed from: a */
    static final Map f74771a;

    /* renamed from: b */
    static final Map f74772b;

    /* renamed from: c */
    static final Map f74773c;

    /* renamed from: d */
    private static final Iterable f74774d = new anca();

    static {
        HashMap hashMap = new HashMap();
        f74771a = hashMap;
        hashMap.put("home", 1);
        f74771a.put("work", 2);
        f74771a.put("mobile", 3);
        f74771a.put("homeFax", 4);
        f74771a.put("workFax", 5);
        f74771a.put("otherFax", 6);
        f74771a.put("pager", 7);
        f74771a.put("companyMain", 8);
        f74771a.put("assistent", 9);
        f74771a.put("car", 10);
        f74771a.put("radio", 11);
        f74771a.put("isdn", 12);
        f74771a.put("callback", 13);
        f74771a.put("telex", 14);
        f74771a.put("tty", 15);
        f74771a.put("workMobile", 16);
        f74771a.put("workPager", 17);
        f74771a.put("main", 18);
        f74771a.put("googleVoice", 19);
        f74771a.put("other", -1);
        f74771a.put(null, -1);
        HashMap hashMap2 = new HashMap();
        f74772b = hashMap2;
        hashMap2.put("home", 1);
        f74772b.put("work", 2);
        f74772b.put("other", -1);
        f74772b.put(null, -1);
        HashMap hashMap3 = new HashMap();
        f74773c = hashMap3;
        hashMap3.put("home", 1);
        f74773c.put("work", 2);
        f74773c.put("other", -1);
        f74773c.put(null, -1);
    }

    /* renamed from: a */
    public static double m62686a(Mergedpeoplemetadata mergedpeoplemetadata, String str) {
        if (mergedpeoplemetadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : m62691a((Iterable) mergedpeoplemetadata.f83117b)) {
                if (str.equals(mergedpeopleaffinities.f83089c)) {
                    return mergedpeopleaffinities.f83090d;
                }
            }
        }
        return 0.0d;
    }

    /* renamed from: a */
    public static Iterable m62691a(Iterable iterable) {
        return iterable == null ? f74774d : iterable;
    }

    /* renamed from: b */
    public static int m62696b(Mergedpeoplemetadata mergedpeoplemetadata) {
        if (m62694a(mergedpeoplemetadata)) {
            return 0;
        }
        if (mergedpeoplemetadata == null || !"circle".equals(mergedpeoplemetadata.f83118c)) {
            return (mergedpeoplemetadata == null || !"contact".equals(mergedpeoplemetadata.f83118c)) ? -1 : 1;
        }
        return 2;
    }

    /* renamed from: c */
    public static Person.Images m62700c(Person person) {
        return (Person.Images) m62692a(person.f83168q, amds.f74766a);
    }

    /* renamed from: c */
    public static boolean m62701c(Mergedpeoplemetadata mergedpeoplemetadata) {
        return mergedpeoplemetadata != null && mergedpeoplemetadata.f83122g;
    }

    /* renamed from: d */
    public static Person.CoverPhotos m62702d(Person person) {
        List list = person.f83159h;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (Person.CoverPhotos) person.f83159h.get(0);
    }

    /* renamed from: e */
    public static final int m62703e(Person person) {
        Person.Metadata metadata = person.f83175x;
        return (metadata == null || !"page".equals(metadata.f83318o)) ? 1 : 2;
    }

    /* renamed from: f */
    public static boolean m62704f(Person person) {
        Person.Metadata metadata = person.f83175x;
        if (metadata == null || TextUtils.isEmpty(metadata.f83319p)) {
            return false;
        }
        if (cgbe.f186279a.mo6606a().mo83442dm()) {
            return true;
        }
        List list = metadata.f83320q;
        if (list != null) {
            return list.contains("googlePlus");
        }
        if (cgbe.f186279a.mo6606a().mo83441dl()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m62705g(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && !TextUtils.isEmpty(metadata.f83319p);
    }

    /* renamed from: h */
    public static boolean m62706h(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && m62690a(metadata.f83310g) > 0;
    }

    /* renamed from: i */
    public static List m62707i(Person person) {
        ArrayList arrayList = new ArrayList();
        if (m62706h(person)) {
            for (String str : m62691a((Iterable) person.f83175x.f83310g)) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                } else {
                    Log.w("PeopleProtoHelper", "Empty contact ID detected");
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static boolean m62708j(Person person) {
        return m62709k(person) != null;
    }

    /* renamed from: k */
    public static Person.Emails m62709k(Person person) {
        Person.Metadata metadata = person.f83175x;
        Object obj = null;
        if (metadata == null || m62704f(person) || m62690a(metadata.f83309f) <= 0) {
            return null;
        }
        amdp amdp = amdp.f74761a;
        List list = person.f83161j;
        int a = m62690a(list);
        int i = 0;
        while (true) {
            if (i >= a) {
                break;
            }
            Object obj2 = list.get(i);
            Mergedpeoplemetadata a2 = amdp.mo41128a(obj2);
            if (a2 != null && a2.f83125j) {
                obj = obj2;
                break;
            }
            i++;
        }
        return (Person.Emails) obj;
    }

    /* renamed from: l */
    public static boolean m62710l(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && metadata.f83304a.contains(8) && "menagerie".equals(person.f83175x.f83311h);
    }

    /* renamed from: m */
    public static String m62711m(Person person) {
        Person.Metadata metadata = person.f83175x;
        if (metadata != null) {
            return metadata.f83319p;
        }
        return null;
    }

    /* renamed from: n */
    public static long m62712n(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null ? metadata.f83317n / 1000 : System.currentTimeMillis();
    }

    /* renamed from: o */
    public static String m62713o(Person person) {
        String m;
        if (m62704f(person) && (m = m62711m(person)) != null) {
            return ancm.m64017f(m);
        }
        Person.Emails k = m62709k(person);
        if (k == null) {
            return null;
        }
        if (!TextUtils.isEmpty(k.f83234f)) {
            return ancm.m64019h(k.f83234f);
        }
        throw new amdy("Email empty.");
    }

    /* renamed from: p */
    public static boolean m62714p(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && metadata.f83312i;
    }

    /* renamed from: q */
    public static boolean m62715q(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && m62690a(metadata.f83309f) > 0;
    }

    /* renamed from: a */
    public static double m62687a(Person.Metadata metadata, String str) {
        if (metadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : m62691a((Iterable) metadata.f83305b)) {
                if (str.equals(mergedpeopleaffinities.f83089c)) {
                    return mergedpeopleaffinities.f83090d;
                }
            }
        }
        return 0.0d;
    }

    /* renamed from: a */
    public static int m62688a(Person.Emails emails) {
        return ((Integer) m62693a(f74772b, emails.f83233e)).intValue();
    }

    /* renamed from: a */
    public static int m62689a(Person.PhoneNumbers phoneNumbers) {
        return ((Integer) m62693a(f74771a, phoneNumbers.f83388e)).intValue();
    }

    /* renamed from: b */
    public static Person.Names m62697b(Person person) {
        return (Person.Names) m62692a(person.f83176y, amdt.f74767a);
    }

    /* renamed from: a */
    public static int m62690a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: b */
    public static String m62698b(Mergedpeoplemetadata mergedpeoplemetadata, String str) {
        if (mergedpeoplemetadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : m62691a((Iterable) mergedpeoplemetadata.f83117b)) {
                if (str.equals(mergedpeopleaffinities.f83089c)) {
                    return mergedpeopleaffinities.f83088b;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m62699b(Person.Metadata metadata, String str) {
        if (metadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : m62691a((Iterable) metadata.f83305b)) {
                if (str.equals(mergedpeopleaffinities.f83089c)) {
                    return mergedpeopleaffinities.f83088b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m62692a(List list, amdq amdq) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (m62694a(amdq.mo41128a(obj))) {
                    return obj;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static Object m62693a(Map map, Object obj) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        return map.get(null);
    }

    /* renamed from: a */
    public static boolean m62694a(Mergedpeoplemetadata mergedpeoplemetadata) {
        String str;
        if (mergedpeoplemetadata == null || (str = mergedpeoplemetadata.f83118c) == null) {
            return true;
        }
        return "profile".equals(str);
    }

    /* renamed from: a */
    public static boolean m62695a(Person person) {
        Person.Metadata metadata = person.f83175x;
        return metadata != null && metadata.mo46747b() && person.f83175x.f83320q.contains("googlePlus") && !person.f83175x.f83320q.contains("googlePlusDisabledByAdmin");
    }
}
