package p000;

import android.util.Pair;
import android.widget.Filter;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: wmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wmv extends Filter {

    /* renamed from: a */
    final /* synthetic */ wmx f50922a;

    public wmv(wmx wmx) {
        this.f50922a = wmx;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.f50922a.f50927a.size(); i++) {
                ContactPerson contactPerson = (ContactPerson) this.f50922a.f50927a.get(i);
                String charSequence2 = charSequence.toString();
                if (!contactPerson.f31433a.toLowerCase(Locale.getDefault()).startsWith(charSequence2.toLowerCase(Locale.getDefault()))) {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = contactPerson.f31436d;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList3.get(i2);
                        if (contactMethod.f31439b.toLowerCase(Locale.US).startsWith(charSequence2.toLowerCase(Locale.US))) {
                            arrayList.add(contactMethod);
                        }
                    }
                } else {
                    arrayList = contactPerson.f31436d;
                }
                bngs j = bngx.m109377j();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ContactPerson contactPerson2 = new ContactPerson(contactPerson.f31433a, contactPerson.f31434b, contactPerson.f31435c, contactPerson.f31437e);
                    contactPerson2.mo18541a(bngx.m109356a((ContactPerson.ContactMethod) arrayList.get(i3)));
                    j.mo67668c(contactPerson2);
                }
                bngx a = j.mo67664a();
                int size3 = a.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(new Pair((ContactPerson) a.get(i4), Integer.valueOf(i)));
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f50922a.f50928b = filterResults.values != null ? bngx.m109368a((Collection) ((ArrayList) filterResults.values)) : bngx.m109376e();
        this.f50922a.notifyDataSetChanged();
    }
}
