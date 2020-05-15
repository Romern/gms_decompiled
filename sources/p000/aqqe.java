package p000;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.people.identity.models.Person;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: aqqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqe extends BaseAdapter {

    /* renamed from: a */
    public final Fragment f86586a;

    /* renamed from: b */
    public final Resources f86587b = this.f86586a.getResources();

    /* renamed from: c */
    private final LayoutInflater f86588c;

    /* renamed from: d */
    private List f86589d;

    /* renamed from: e */
    private final aqwa f86590e;

    public aqqe(Fragment fragment, SmartProfilePerson smartProfilePerson, aqwa aqwa) {
        this.f86586a = fragment;
        this.f86588c = LayoutInflater.from(fragment.getActivity());
        this.f86590e = aqwa;
        if (smartProfilePerson != null && smartProfilePerson.mo40995H()) {
            this.f86589d = new ArrayList();
            List list = smartProfilePerson.f81752s;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Person.Memberships memberships = (Person.Memberships) list.get(i);
                if (memberships.mo40954a()) {
                    Person.Metadata b = memberships.mo46297b();
                    if (b.mo40936a() && b.mo40937b().equals("cp2")) {
                        aqqc aqqc = new aqqc();
                        aqqc.f86583b = b.mo40941f();
                        this.f86589d.add(aqqc);
                    }
                }
            }
            if (smartProfilePerson.mo40998K()) {
                HashMap hashMap = new HashMap();
                List list2 = smartProfilePerson.f81754u;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Person.Names names = (Person.Names) list2.get(i2);
                    if (names.mo40954a()) {
                        Person.Metadata b2 = names.mo46297b();
                        if (b2.mo40936a() && b2.mo40937b().equals("cp2")) {
                            hashMap.put(b2.mo40941f(), names.mo40957e());
                        }
                    }
                }
                List list3 = this.f86589d;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    aqqc aqqc2 = (aqqc) list3.get(i3);
                    String str = aqqc2.f86583b;
                    if (hashMap.containsKey(str)) {
                        aqqc2.f86582a = (String) hashMap.get(str);
                    }
                }
            }
        }
    }

    public final int getCount() {
        return this.f86589d.size();
    }

    public final Object getItem(int i) {
        return this.f86589d.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aqqd aqqd;
        if (view == null) {
            view = this.f86588c.inflate((int) C0126R.C0128layout.profile_contacts_picker_item, viewGroup, false);
            aqqd = new aqqd();
            aqqd.f86584a = (ImageView) view.findViewById(C0126R.C0129id.avatar);
            aqqd.f86585b = (TextView) view.findViewById(C0126R.C0129id.display_name);
            view.setTag(aqqd);
        } else {
            aqqd = (aqqd) view.getTag();
        }
        aqqc aqqc = (aqqc) this.f86589d.get(i);
        aqwa aqwa = this.f86590e;
        int i2 = i + 100;
        aqwa.f86955a.initLoader(i2, null, new aqvz(aqwa, aqqc.f86583b, new aqqa(this, aqqd)));
        aqqd.f86585b.setText(aqqc.f86582a);
        view.setOnClickListener(new aqqb(this, aqqc));
        return view;
    }
}
