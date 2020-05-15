package p000;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: wnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnc extends abh {

    /* renamed from: a */
    public final wnk f50943a;

    /* renamed from: d */
    public final Context f50944d;

    /* renamed from: e */
    private final bngx f50945e;

    public wnc(List list, Context context, wnk wnk) {
        this.f50945e = bngx.m109368a((Collection) list);
        this.f50944d = context;
        this.f50943a = wnk;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f50945e.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new wnb(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.fm_contact_picker_contact_row_container, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        boolean z;
        wnb wnb = (wnb) acm;
        ContactPerson contactPerson = (ContactPerson) this.f50945e.get(i);
        int i2 = wnb.f50938w;
        if (contactPerson.f31435c != null) {
            z = true;
        } else {
            z = false;
        }
        wnb.f50941u = z;
        if (wnb.f50942v.f50943a.mo29225b(contactPerson)) {
            View view = wnb.f50939s;
            wnb.m42054e(view).setVisibility(0);
            wnb.m42051b(view).setVisibility(4);
            wnb.m42050a(view).setVisibility(4);
        } else if (wnb.f50941u) {
            wnb.m42050a(wnb.f50939s).setImageURI(Uri.parse(contactPerson.f31435c.f81940b));
            View view2 = wnb.f50939s;
            wnb.m42054e(view2).setVisibility(4);
            wnb.m42051b(view2).setVisibility(4);
            wnb.m42050a(view2).setVisibility(0);
        } else {
            View view3 = wnb.f50939s;
            wnb.m42054e(view3).setVisibility(4);
            wnb.m42051b(view3).setVisibility(0);
            wnb.m42050a(view3).setVisibility(4);
        }
        List c = wnb.f50942v.f50943a.mo29226c(contactPerson);
        if (c.isEmpty()) {
            c = contactPerson.f31436d;
        }
        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) c.get(0);
        wnb.m42052c(wnb.f50939s).setText(contactPerson.f31433a);
        wnb.m42053d(wnb.f50939s).setText(contactMethod.f31439b);
        wnb.m42053d(wnb.f50939s).setVisibility(0);
        wnb.f50939s.setOnClickListener(new wmy(wnb, contactPerson, contactMethod));
        wnb.f50940t.removeAllViews();
        ImageView v = wnb.mo29216v();
        v.setVisibility(4);
        if (contactPerson.f31436d.size() > 1) {
            v.setVisibility(0);
            v.setOnClickListener(new wmz(wnb, contactPerson));
            ArrayList arrayList = contactPerson.f31436d;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) arrayList.get(i3);
                View inflate = ((LayoutInflater) wnb.f50942v.f50944d.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.fm_contact_picker_contact_row, (ViewGroup) null);
                if (wnb.f50942v.f50943a.mo29229e(contactPerson, contactMethod2)) {
                    wnb.m42054e(inflate).setBackground(null);
                    wnb.m42054e(inflate).setVisibility(0);
                }
                wnb.m42052c(inflate).setText(contactMethod2.f31439b);
                wnb.m42053d(inflate).setVisibility(8);
                inflate.setOnClickListener(new wna(wnb, contactPerson, contactMethod2));
                wnb.f50940t.addView(inflate);
            }
            if (((wni) ((wnj) wnb.f50942v.f50943a).f50955b.get(contactPerson)).f50953b) {
                wnb.mo29216v().setImageResource(C0126R.C0127drawable.quantum_ic_expand_less_vd_theme_24);
                wnb.mo29216v().setClickable(true);
                ImageView v2 = wnb.mo29216v();
                String str = contactPerson.f31433a;
                String string = wnb.f50942v.f50944d.getResources().getString(C0126R.string.fm_collapse);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
                sb.append(str);
                sb.append("; ");
                sb.append(string);
                v2.setContentDescription(sb.toString());
                wnb.f50940t.setVisibility(0);
                wnb.m42053d(wnb.f50939s).setVisibility(8);
                return;
            }
            wnb.mo29216v().setImageResource(C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24);
            ImageView v3 = wnb.mo29216v();
            String str2 = contactPerson.f31433a;
            String string2 = wnb.f50942v.f50944d.getResources().getString(C0126R.string.fm_expand);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(string2).length());
            sb2.append(str2);
            sb2.append("; ");
            sb2.append(string2);
            v3.setContentDescription(sb2.toString());
            wnb.f50940t.setVisibility(8);
            wnb.m42053d(wnb.f50939s).setVisibility(0);
        }
    }
}
