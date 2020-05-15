package p000;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzm {

    /* renamed from: a */
    private static String[] f17742a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fzm.a(java.util.List, com.google.android.gms.appinvite.model.ContactPerson$ContactMethod):void
     arg types: [java.util.ArrayList, com.google.android.gms.appinvite.model.ContactPerson$ContactMethod]
     candidates:
      fzm.a(amfa, java.lang.String[]):com.google.android.gms.appinvite.model.ContactPerson
      fzm.a(java.lang.Object, java.lang.Object):java.lang.Object
      fzm.a(android.content.Context, com.google.android.gms.appinvite.model.ContactPerson):java.lang.String
      fzm.a(com.google.android.gms.appinvite.model.ContactPerson, com.google.android.gms.appinvite.model.ContactPerson):void
      fzm.a(java.util.List, com.google.android.gms.appinvite.model.ContactPerson$ContactMethod):void */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* renamed from: a */
    public static ContactPerson m12787a(amfa amfa, String[] strArr) {
        AvatarReference avatarReference;
        char c;
        if (!TextUtils.isEmpty(amfa.mo25475d())) {
            avatarReference = new AvatarReference(1, amfa.mo25475d());
        } else {
            avatarReference = null;
        }
        String b = amfa.mo25473b();
        String[] a = m12796a(strArr);
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1240244679) {
                    if (hashCode != 96619420) {
                        if (hashCode == 106642798 && str.equals("phone")) {
                            c = 2;
                            if (c == 0) {
                                if (c == 1) {
                                    for (amex amex : amfa.mo25478f()) {
                                        m12792a((List) arrayList, new ContactPerson.ContactMethod(1, amex.mo41104a(), avatarReference));
                                    }
                                } else if (c == 2) {
                                    try {
                                        for (amfc amfc : amfa.mo25479g()) {
                                            m12792a((List) arrayList, new ContactPerson.ContactMethod(2, amfc.mo41120a(), avatarReference));
                                        }
                                    } catch (Exception e) {
                                    }
                                }
                            } else if (!TextUtils.isEmpty(b)) {
                                m12792a((List) arrayList, new ContactPerson.ContactMethod(0, b, avatarReference));
                            }
                        }
                    } else if (str.equals("email")) {
                        c = 1;
                        if (c == 0) {
                        }
                    }
                } else if (str.equals(BuildConfig.FLAVOR_client)) {
                    c = 0;
                    if (c == 0) {
                    }
                }
                c = 65535;
                if (c == 0) {
                }
            }
        }
        if (arrayList.size() > 0) {
            return new ContactPerson(amfa.mo25474c(), b, avatarReference, arrayList);
        }
        return null;
    }

    /* renamed from: a */
    private static Object m12788a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* renamed from: b */
    public static void m12797b(ContactPerson contactPerson, ContactPerson contactPerson2) {
        if (contactPerson != contactPerson2) {
            contactPerson.f9749a = contactPerson2.f9749a;
            contactPerson.f9750b = contactPerson2.f9750b;
            contactPerson.f9751c = contactPerson2.f9751c;
            contactPerson.f9752d = contactPerson2.f9752d;
            contactPerson.f9753e.clear();
            contactPerson.f9753e.addAll(contactPerson2.f9753e);
            contactPerson.mo7264a(contactPerson2.mo7263a());
        }
    }

    /* renamed from: b */
    private static boolean m12798b(Object obj, Object obj2) {
        return (obj == null) != (obj2 == null);
    }

    /* renamed from: c */
    public static boolean m12799c(ContactPerson contactPerson, ContactPerson contactPerson2) {
        ArrayList arrayList = contactPerson.f9753e;
        ArrayList arrayList2 = contactPerson2.f9753e;
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            return false;
        }
        boolean containsAll = arrayList.containsAll(arrayList2);
        boolean containsAll2 = arrayList2.containsAll(arrayList);
        if (!containsAll || !containsAll2) {
            if (!containsAll) {
                if (!containsAll2) {
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    ArrayList arrayList4 = new ArrayList(arrayList2);
                    arrayList3.removeAll(arrayList2);
                    arrayList4.removeAll(arrayList);
                    if (!m12795a(arrayList3) || !m12795a(arrayList4)) {
                        return false;
                    }
                    return true;
                }
                m12797b(contactPerson, contactPerson2);
            }
            return true;
        }
        if (!m12798b(contactPerson.f9752d, contactPerson2.f9752d)) {
            if (!m12798b(contactPerson.f9750b, contactPerson2.f9750b)) {
                if (m12798b(contactPerson.f9751c, contactPerson2.f9751c) && contactPerson.f9751c == null) {
                    m12797b(contactPerson, contactPerson2);
                }
            } else if (contactPerson.f9750b == null) {
                m12797b(contactPerson, contactPerson2);
            }
        } else if (contactPerson.f9752d == null) {
            m12797b(contactPerson, contactPerson2);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m12800d(ContactPerson contactPerson, ContactPerson contactPerson2) {
        Long l;
        return sdg.m34949a(contactPerson, contactPerson2) || (!TextUtils.isEmpty(contactPerson.f9750b) && contactPerson.f9750b.equals(contactPerson2.f9750b)) || ((l = contactPerson.f9751c) != null && l.equals(contactPerson2.f9751c));
    }

    /* renamed from: a */
    public static String m12789a(Context context, ContactPerson contactPerson) {
        String a = m12790a(contactPerson);
        return TextUtils.isEmpty(a) ? context.getString(C0126R.string.appinvite_contextual_selection_person_no_name_display_name) : a;
    }

    /* renamed from: a */
    public static String m12790a(ContactPerson contactPerson) {
        if (!TextUtils.isEmpty(contactPerson.f9749a)) {
            return contactPerson.f9749a;
        }
        ContactPerson.ContactMethod a = contactPerson.mo7263a();
        if (a == null) {
            return "";
        }
        int i = a.f9755a;
        return (i == 1 || i == 2) ? a.f9756b : "";
    }

    /* renamed from: a */
    public static void m12791a(ContactPerson contactPerson, ContactPerson contactPerson2) {
        contactPerson.f9749a = (String) m12788a(contactPerson.f9749a, contactPerson2.f9749a);
        contactPerson.f9750b = (String) m12788a(contactPerson.f9750b, contactPerson2.f9750b);
        contactPerson.f9751c = (Long) m12788a(contactPerson.f9751c, contactPerson2.f9751c);
        contactPerson.f9752d = (AvatarReference) m12788a(contactPerson.f9752d, contactPerson2.f9752d);
        ArrayList arrayList = new ArrayList(contactPerson2.f9753e);
        arrayList.removeAll(contactPerson.f9753e);
        contactPerson.f9753e.addAll(arrayList);
    }

    /* renamed from: a */
    private static void m12792a(List list, ContactPerson.ContactMethod contactMethod) {
        if (!list.contains(contactMethod)) {
            list.add(contactMethod);
        }
    }

    /* renamed from: a */
    public static void m12793a(List list, List list2, List list3, List list4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m12794a((ContactPerson) it.next(), list2, list3, list4)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static boolean m12794a(ContactPerson contactPerson, List list, List list2, List list3) {
        String str;
        if (contactPerson == null || (list == null && list2 == null && list3 == null)) {
            return false;
        }
        if (list != null && (str = contactPerson.f9750b) != null && list.contains(str)) {
            return true;
        }
        ArrayList arrayList = contactPerson.f9753e;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList.get(i);
                String str2 = contactMethod.f9756b;
                if (str2 != null) {
                    int i2 = contactMethod.f9755a;
                    if (i2 != 1) {
                        if (i2 == 2 && list3 != null && list3.contains(PhoneNumberUtils.stripSeparators(str2))) {
                            return true;
                        }
                    } else if (list2 != null && list2.contains(str2.toLowerCase())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12795a(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ContactPerson.ContactMethod) list.get(i)).f9755a != 0) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        if (r2.length <= 0) goto L_0x000b;
     */
    /* renamed from: a */
    public static synchronized String[] m12796a(String[] strArr) {
        synchronized (fzm.class) {
            if (strArr != null) {
            }
            if (f17742a == null) {
                f17742a = cbvz.f178436a.mo6606a().mo75526i().split(";");
            }
            strArr = f17742a;
        }
        return strArr;
    }
}
