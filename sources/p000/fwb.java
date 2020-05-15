package p000;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Filter;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: fwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwb extends Filter {

    /* renamed from: a */
    final /* synthetic */ fwd f17403a;

    public fwb(fwd fwd) {
        this.f17403a = fwd;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            filterResults.values = charSequence.toString().trim();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Iterator it;
        ArrayList arrayList;
        this.f17403a.f17426t = (String) filterResults.values;
        if (!TextUtils.isEmpty(this.f17403a.f17426t)) {
            fwd fwd = this.f17403a;
            String str = fwd.f17426t;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String charSequence2 = str.toString();
            String lowerCase = str.toString().toLowerCase();
            String a = fwd.m12504a(charSequence2);
            Iterator it2 = fwd.f17420n.iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i = 1;
                if (!it2.hasNext()) {
                    break;
                }
                ContactPerson contactPerson = (ContactPerson) it2.next();
                if (TextUtils.isEmpty(contactPerson.f9749a)) {
                    it = it2;
                } else if (!contactPerson.f9749a.toLowerCase().contains(lowerCase)) {
                    it = it2;
                } else {
                    if (fwd.f17413g) {
                        linkedHashSet.add(new fwc(contactPerson, contactPerson.mo7263a(), 3));
                        it = it2;
                    } else {
                        ArrayList arrayList2 = contactPerson.f9753e;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            linkedHashSet.add(new fwc(contactPerson, (ContactPerson.ContactMethod) arrayList2.get(i2), 3));
                            i2++;
                            it2 = it2;
                        }
                        it = it2;
                    }
                    it2 = it;
                }
                ArrayList arrayList3 = contactPerson.f9753e;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList3.get(i3);
                        String str2 = contactMethod.f9756b;
                        if (TextUtils.isEmpty(str2)) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            int i4 = contactMethod.f9755a;
                            if (i4 != i) {
                                if (i4 == 2) {
                                    if (fwd.f17418l && a.length() >= fwd.f17427u) {
                                        String a2 = fwd.m12504a(str2);
                                        if (a2.contains(a)) {
                                            linkedHashSet.add(new fwc(contactPerson, contactMethod, 3));
                                            if (a2.equals(a)) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                            } else if (fwd.f17417k) {
                                if (str2.toLowerCase().contains(lowerCase)) {
                                    linkedHashSet.add(new fwc(contactPerson, contactMethod, 3));
                                    if (str2.equals(charSequence2)) {
                                        z = true;
                                    }
                                }
                            }
                            i3++;
                            arrayList3 = arrayList;
                            i = 1;
                        }
                        i3++;
                        arrayList3 = arrayList;
                        i = 1;
                    }
                    it2 = it;
                }
                it2 = it;
            }
            if (fwd.f17417k && !z && Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new ContactPerson.ContactMethod(1, charSequence2));
                linkedHashSet.add(new fwc(new ContactPerson(charSequence2, null, null, arrayList4), null, 5));
            }
            if (fwd.f17418l && !z2 && Patterns.PHONE.matcher(str).matches()) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new ContactPerson.ContactMethod(2, charSequence2));
                linkedHashSet.add(new fwc(new ContactPerson(charSequence2, null, null, arrayList5), null, 5));
            }
            fwd.f17421o = new ArrayList(linkedHashSet);
            fwd fwd2 = this.f17403a;
            fwd2.f17431y = new fvx(fwd2, fwd2.f17421o);
            fwd fwd3 = this.f17403a;
            fwd3.mo43104a(fwd3.f17431y);
            fwd fwd4 = this.f17403a;
            if (fwd4.f17412f) {
                fwd4.f17424r.mo11509a(fwd4.f17426t);
                return;
            }
            return;
        }
        fwd fwd5 = this.f17403a;
        fwd5.mo43104a(fwd5.f17429w);
    }
}
