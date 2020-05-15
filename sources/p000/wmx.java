package p000;

import android.net.Uri;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.Collection;
import java.util.List;

/* renamed from: wmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmx extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public final bngx f50927a;

    /* renamed from: b */
    public bngx f50928b = bngx.m109376e();

    /* renamed from: c */
    private final wnk f50929c;

    public wmx(List list, wnk wnk) {
        this.f50927a = bngx.m109368a((Collection) list);
        this.f50929c = wnk;
    }

    /* renamed from: a */
    private static ContactPerson.ContactMethod m42046a(ContactPerson contactPerson) {
        return (ContactPerson.ContactMethod) contactPerson.f31436d.get(0);
    }

    /* renamed from: b */
    private final ContactPerson.ContactMethod m42048b(int i) {
        return m42046a((ContactPerson) ((Pair) this.f50928b.get(i)).first);
    }

    /* renamed from: c */
    private final ContactPerson m42049c(int i) {
        return (ContactPerson) this.f50927a.get(((Integer) ((Pair) this.f50928b.get(i)).second).intValue());
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.f50928b.size();
    }

    public final Filter getFilter() {
        return new wmv(this);
    }

    public final Object getItem(int i) {
        return new Pair(m42049c(i), m42048b(i));
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
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate((int) C0126R.C0128layout.fm_contact_picker_contact_row, viewGroup, false);
        }
        wmw wmw = new wmw(view);
        ContactPerson contactPerson = (ContactPerson) ((Pair) this.f50928b.get(i)).first;
        AvatarReference avatarReference = contactPerson.f31435c;
        if (avatarReference != null) {
            wmw.f50923s.setImageURI(Uri.parse(avatarReference.f81940b));
            wmw.f50924t.setVisibility(4);
            wmw.f50923s.setVisibility(0);
        } else {
            wmw.f50924t.setVisibility(0);
            wmw.f50923s.setVisibility(4);
        }
        if (m42047a(i)) {
            wmw.f50923s.setAlpha(0.3f);
            wmw.f50924t.setAlpha(0.3f);
            wmw.f50925u.setAlpha(0.3f);
            wmw.f50926v.setAlpha(0.3f);
        } else {
            wmw.f50923s.setAlpha(1.0f);
            wmw.f50924t.setAlpha(1.0f);
            wmw.f50925u.setAlpha(1.0f);
            wmw.f50926v.setAlpha(1.0f);
        }
        wmw.f50925u.setText(contactPerson.f31433a);
        wmw.f50926v.setText(m42046a(contactPerson).f31439b);
        return view;
    }

    public final boolean isEnabled(int i) {
        return !m42047a(i);
    }

    /* renamed from: a */
    private final boolean m42047a(int i) {
        return this.f50929c.mo29229e(m42049c(i), m42048b(i));
    }
}
