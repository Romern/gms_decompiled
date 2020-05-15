package p000;

import android.content.Context;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.Map;
import java.util.Set;

/* renamed from: ajuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajuq extends C0917cv {

    /* renamed from: h */
    private static final C1406uj f71312h = new C1406uj();

    /* renamed from: d */
    public boolean f71313d;

    /* renamed from: e */
    public final Set f71314e;

    /* renamed from: f */
    public final Map f71315f = new ArrayMap();

    /* renamed from: g */
    public final ajum f71316g;

    /* renamed from: i */
    private final Context f71317i;

    public ajuq(Context context, ajum ajum) {
        super(f71312h);
        this.f71317i = context;
        this.f71316g = ajum;
        this.f71314e = new ArraySet();
        this.f71313d = true;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) i;
    }

    /* renamed from: b */
    public final void mo38941b(boolean z) {
        if (this.f71313d != z) {
            this.f71313d = z;
            mo171aJ();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new ajup(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.sharing_list_item_contact, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        Object obj;
        ajup ajup = (ajup) acm;
        C0066bx bxVar = ((C0917cv) this).f12178a;
        C0915ct ctVar = bxVar.f5936f;
        if (ctVar == null) {
            C0915ct ctVar2 = bxVar.f5937g;
            if (ctVar2 != null) {
                obj = ctVar2.get(i);
            } else {
                throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
            }
        } else {
            ctVar.mo8243b(i);
            obj = bxVar.f5936f.get(i);
        }
        Contact contact = (Contact) obj;
        if (contact != null) {
            if (cfov.m142057j()) {
                if (this.f71315f.get(Long.valueOf(contact.f80844a)) == null) {
                    this.f71315f.put(Long.valueOf(contact.f80844a), new ArraySet());
                }
                ((Set) this.f71315f.get(Long.valueOf(contact.f80844a))).add(Integer.valueOf(i));
            }
            ajup.mo38926a(this.f71317i, contact);
            ajup.f201a.setOnClickListener(new ajul(this, ajup, contact));
        }
    }

    /* renamed from: a */
    public final boolean mo38940a(Contact contact) {
        return this.f71314e.contains(Long.valueOf(contact.f80844a));
    }
}
