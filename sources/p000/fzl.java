package p000;

import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: fzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzl {

    /* renamed from: a */
    public final ArrayList f17738a = new ArrayList();

    /* renamed from: b */
    private final Map f17739b = new HashMap();

    /* renamed from: c */
    private final Map f17740c = new HashMap();

    /* renamed from: d */
    private final Map f17741d = new HashMap();

    /* renamed from: a */
    private final void m12782a(ContactPerson contactPerson, String str) {
        if (!sdg.m34949a(contactPerson.f9749a, str)) {
            Object obj = this.f17741d.get(str);
            if (contactPerson.equals(obj)) {
                this.f17741d.remove(str);
            } else if (obj instanceof Set) {
                ((Set) obj).remove(contactPerson);
            }
        }
        m12783b(contactPerson);
    }

    /* renamed from: b */
    private final void m12783b(ContactPerson contactPerson) {
        if (!TextUtils.isEmpty(contactPerson.f9750b)) {
            this.f17739b.put(contactPerson.f9750b, contactPerson);
        }
        Long l = contactPerson.f9751c;
        if (l != null) {
            this.f17740c.put(l, contactPerson);
        }
        Object obj = this.f17741d.get(contactPerson.f9749a);
        if (obj == null) {
            this.f17741d.put(contactPerson.f9749a, contactPerson);
        } else if (obj instanceof ContactPerson) {
            if (!contactPerson.equals(obj)) {
                HashSet hashSet = new HashSet();
                hashSet.add((ContactPerson) obj);
                hashSet.add(contactPerson);
                this.f17741d.put(contactPerson.f9749a, hashSet);
            }
        } else if (obj instanceof Set) {
            ((Set) obj).add(contactPerson);
        }
    }

    /* renamed from: a */
    public final ContactPerson mo11561a(ContactPerson contactPerson) {
        ContactPerson contactPerson2 = (ContactPerson) this.f17739b.get(contactPerson.f9750b);
        if (contactPerson2 == null) {
            ContactPerson contactPerson3 = (ContactPerson) this.f17740c.get(contactPerson.f9751c);
            if (contactPerson3 == null) {
                Object obj = this.f17741d.get(contactPerson.f9749a);
                if (obj instanceof ContactPerson) {
                    ContactPerson contactPerson4 = (ContactPerson) obj;
                    if (fzm.m12799c(contactPerson4, contactPerson)) {
                        m12783b(contactPerson4);
                        return contactPerson4;
                    }
                } else if (obj instanceof Set) {
                    for (ContactPerson contactPerson5 : (Set) obj) {
                        if (fzm.m12799c(contactPerson5, contactPerson)) {
                            m12783b(contactPerson5);
                            return contactPerson5;
                        }
                    }
                }
                this.f17738a.add(contactPerson);
                m12783b(contactPerson);
                return contactPerson;
            }
            String str = contactPerson3.f9749a;
            fzm.m12791a(contactPerson3, contactPerson);
            m12782a(contactPerson3, str);
            return contactPerson3;
        }
        String str2 = contactPerson2.f9749a;
        fzm.m12791a(contactPerson2, contactPerson);
        m12782a(contactPerson2, str2);
        return contactPerson2;
    }

    /* renamed from: a */
    public final void mo11562a() {
        Collator instance = Collator.getInstance();
        instance.setStrength(1);
        Collections.sort(this.f17738a, new fzk(instance));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo11563a(Collection r4) {
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            mo11561a((ContactPerson) r4.get(i));
        }
    }
}
