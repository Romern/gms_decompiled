package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.p042v2.invites.contactpicker.AutoCompleteTextView;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

/* renamed from: wnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnj extends Fragment implements wnk {

    /* renamed from: a */
    static final Long f50954a = -1L;

    /* renamed from: b */
    public TreeMap f50955b;

    /* renamed from: c */
    public HashSet f50956c;

    /* renamed from: d */
    ArrayList f50957d;

    /* renamed from: e */
    public AutoCompleteTextView f50958e;

    /* renamed from: f */
    public RecyclerView f50959f;

    /* renamed from: g */
    public ContactPickerOptionsData f50960g;

    /* renamed from: h */
    int f50961h;

    /* renamed from: i */
    public boolean f50962i;

    /* renamed from: j */
    public wnh f50963j;

    /* renamed from: k */
    wnc f50964k;

    /* renamed from: l */
    private LinearLayout f50965l;

    /* renamed from: m */
    private View f50966m;

    /* renamed from: a */
    public static ContactPerson m42061a(ContactPerson.ContactMethod contactMethod) {
        ContactPerson contactPerson = new ContactPerson("", f50954a, null, null);
        contactPerson.mo18541a(bngx.m109356a(contactMethod));
        return contactPerson;
    }

    /* renamed from: c */
    private final void m42062c() {
        Toast.makeText(getContext(), this.f50960g.f31446g, 1).show();
    }

    /* renamed from: d */
    private final void m42063d() {
        TextView textView = (TextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_confirmation);
        textView.setEnabled(false);
        textView.setAlpha(0.3f);
    }

    /* renamed from: f */
    private final void m42065f(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        LinearLayout linearLayout = this.f50965l;
        linearLayout.removeView(linearLayout.findViewWithTag(new Pair(contactPerson, contactMethod)));
    }

    /* renamed from: b */
    public final void mo29223b() {
        TextView textView = (TextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_confirmation);
        textView.setEnabled(true);
        textView.setAlpha(1.0f);
    }

    /* renamed from: e */
    public final boolean mo29229e(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        return mo29226c(contactPerson).contains(contactMethod);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50963j = (wnh) wgq.m41934a(wnh.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50960g = (ContactPickerOptionsData) getArguments().getParcelable("contactPickerOptionsData");
        this.f50962i = false;
        this.f50956c = new HashSet();
        this.f50957d = new ArrayList();
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("selectedContactPersons");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("selectedContactsMethods");
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                this.f50957d.add(new Pair((ContactPerson) parcelableArrayList.get(i), (ContactPerson.ContactMethod) parcelableArrayList2.get(i)));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_contact_picker, viewGroup, false);
        sdo.m34959a(inflate);
        this.f50966m = inflate;
        wgn.m41925e("ContactPickerFragment", "id", new Object[0]);
        wgn.m41925e("ContactPickerFragment", "%d", Integer.valueOf((int) C0126R.C0129id.fm_cp_title));
        if (this.f50966m.equals(null)) {
            wgn.m41925e("ContactPickerFragment", "view is null", new Object[0]);
        }
        if (this.f50960g.equals(null)) {
            wgn.m41925e("ContactPickerFragment", "data is null", new Object[0]);
        }
        this.f50965l = (LinearLayout) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_selected_contacts_container);
        ((TextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_title)).setText(this.f50960g.f31440a);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_mactv);
        this.f50958e = autoCompleteTextView;
        ContactPickerOptionsData contactPickerOptionsData = this.f50960g;
        autoCompleteTextView.f31401b = contactPickerOptionsData.f31447h;
        autoCompleteTextView.setHint(contactPickerOptionsData.f31441b);
        this.f50958e.f31400a = this;
        mo29221a();
        this.f50959f = (RecyclerView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_contact_list);
        getContext();
        this.f50959f.setLayoutManager(new aah());
        TextView textView = (TextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_confirmation);
        textView.setText(this.f50960g.f31445f);
        textView.setOnClickListener(new wnd(this));
        m42063d();
        getLoaderManager().initLoader(0, null, new wng(this));
        return this.f50966m;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50963j = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f50957d;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList3.get(i);
            arrayList.add((ContactPerson) pair.first);
            arrayList2.add((ContactPerson.ContactMethod) pair.second);
        }
        bundle.putParcelableArrayList("selectedContactPersons", arrayList);
        bundle.putParcelableArrayList("selectedContactsMethods", arrayList2);
    }

    /* renamed from: d */
    public static boolean m42064d(ContactPerson contactPerson) {
        return contactPerson.f31434b.equals(f50954a);
    }

    /* renamed from: b */
    public final void mo29224b(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        if (mo29229e(contactPerson, contactMethod)) {
            mo29227c(contactPerson, contactMethod);
        } else if (mo29225b(contactPerson)) {
            if (contactMethod.f31438a == 1) {
                m42062c();
            }
            wni wni = (wni) this.f50955b.get(contactPerson);
            ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) wni.f50952a.get(0);
            this.f50957d.remove(new Pair(contactPerson, contactMethod2));
            m42065f(contactPerson, contactMethod2);
            wni.f50952a.clear();
            wni.f50952a.add(contactMethod);
            this.f50964k.mo158M(mo29220a(contactPerson));
            this.f50957d.add(new Pair(contactPerson, contactMethod));
            LinearLayout linearLayout = this.f50965l;
            String str = contactMethod.f31439b;
            String string = getString(C0126R.string.cp_selected_string);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            wgg.m41907a(linearLayout, sb.toString());
            mo29222a(contactPerson, contactMethod);
        } else {
            mo29228d(contactPerson, contactMethod);
        }
    }

    /* renamed from: c */
    public final List mo29226c(ContactPerson contactPerson) {
        return ((wni) this.f50955b.get(contactPerson)).f50952a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo29220a(ContactPerson contactPerson) {
        return bngx.m109368a((Collection) new ArrayList(this.f50955b.keySet())).indexOf(contactPerson);
    }

    /* renamed from: d */
    public final void mo29228d(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        int i = this.f50961h;
        if (i < this.f50960g.f31449j) {
            int i2 = i + 1;
            this.f50961h = i2;
            if (i2 > 0) {
                mo29223b();
            }
            if (contactMethod.f31438a == 1) {
                m42062c();
            }
            if (m42064d(contactPerson)) {
                this.f50956c.add(contactMethod);
            } else {
                wni wni = (wni) this.f50955b.get(contactPerson);
                if (!wni.f50952a.isEmpty()) {
                    ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) wni.f50952a.get(0);
                    this.f50957d.remove(new Pair(contactPerson, contactMethod2));
                    m42065f(contactPerson, contactMethod2);
                    wni.f50952a.clear();
                    this.f50961h--;
                }
                wni.f50952a.add(contactMethod);
                this.f50964k.mo158M(mo29220a(contactPerson));
            }
            this.f50957d.add(new Pair(contactPerson, contactMethod));
            LinearLayout linearLayout = this.f50965l;
            String str = contactMethod.f31439b;
            String string = getString(C0126R.string.cp_selected_string);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            wgg.m41907a(linearLayout, sb.toString());
            mo29222a(contactPerson, contactMethod);
            mo29221a();
        }
    }

    /* renamed from: c */
    public final void mo29227c(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        int i = this.f50961h - 1;
        this.f50961h = i;
        if (i == 0) {
            m42063d();
        }
        if (m42064d(contactPerson)) {
            this.f50956c.remove(contactMethod);
        } else {
            ((wni) this.f50955b.get(contactPerson)).f50952a.remove(contactMethod);
            this.f50964k.mo158M(mo29220a(contactPerson));
        }
        LinearLayout linearLayout = this.f50965l;
        String str = contactMethod.f31439b;
        String string = getString(C0126R.string.cp_unselected_string);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
        sb.append(str);
        sb.append(" ");
        sb.append(string);
        wgg.m41907a(linearLayout, sb.toString());
        this.f50957d.remove(new Pair(contactPerson, contactMethod));
        m42065f(contactPerson, contactMethod);
        mo29221a();
    }

    /* renamed from: a */
    public final void mo29221a() {
        TextView textView = (TextView) C1280ps.m19914e(this.f50966m, (int) C0126R.C0129id.fm_cp_selection_limit);
        textView.setText(String.format("%d/%d", Integer.valueOf(this.f50961h), Integer.valueOf(this.f50960g.f31449j)));
        textView.setContentDescription(String.format(this.f50960g.f31448i, Integer.valueOf(this.f50961h)));
    }

    /* renamed from: a */
    public final void mo29222a(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.fm_contact_picker_chip, (ViewGroup) null);
        ((TextView) C1280ps.m19914e(inflate, (int) C0126R.C0129id.fm_cp_contact_chip_name)).setText(contactPerson.f31433a);
        TextView textView = (TextView) C1280ps.m19914e(inflate, (int) C0126R.C0129id.fm_cp_contact_chip_method);
        String str = contactMethod.f31439b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("<");
        sb.append(str);
        sb.append(">");
        textView.setText(sb.toString());
        String str2 = contactMethod.f31439b;
        String string = getString(C0126R.string.cp_selected_string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string).length());
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(string);
        textView.setContentDescription(sb2.toString());
        inflate.setTag(new Pair(contactPerson, contactMethod));
        C1280ps.m19914e(inflate, (int) C0126R.C0129id.fm_cp_contact_chip_remove).setOnClickListener(new wne(this, contactPerson, contactMethod));
        this.f50965l.addView(inflate);
    }

    /* renamed from: b */
    public final boolean mo29225b(ContactPerson contactPerson) {
        return !mo29226c(contactPerson).isEmpty();
    }
}
