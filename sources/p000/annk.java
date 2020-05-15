package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: annk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annk extends BaseAdapter implements anmd {

    /* renamed from: a */
    public final ArrayList f77198a = new ArrayList();

    /* renamed from: b */
    public anmj f77199b;

    /* renamed from: c */
    private final anme f77200c;

    /* renamed from: d */
    private final LayoutInflater f77201d;

    /* renamed from: e */
    private final ArrayList f77202e = new ArrayList();

    /* renamed from: f */
    private boolean f77203f;

    public annk(Context context, anme anme, anmj anmj) {
        this.f77201d = LayoutInflater.from(context);
        this.f77200c = anme;
        this.f77199b = anmj;
    }

    /* renamed from: c */
    private final int m64808c() {
        if (this.f77199b.mo41947a()) {
            return this.f77198a.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo41931a() {
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo41985b() {
        this.f77202e.clear();
        this.f77198a.clear();
        this.f77203f = false;
        notifyDataSetInvalidated();
    }

    public final int getCount() {
        return this.f77202e.size() + m64808c() + (this.f77203f ? 1 : 0);
    }

    public final Object getItem(int i) {
        if (i < this.f77202e.size()) {
            return this.f77202e.get(i);
        }
        int size = i - this.f77202e.size();
        if (size < m64808c()) {
            return this.f77198a.get(size);
        }
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return i < this.f77202e.size() + m64808c() ? 0 : 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i < this.f77202e.size()) {
            if (view == null) {
                view = this.f77201d.inflate((int) C0126R.C0128layout.plus_list_apps_item, viewGroup, false);
            }
            anxl anxl = (anxl) this.f77202e.get(i);
            anlv a = this.f77200c.f77115i.mo41925a(anxl);
            ((TextView) view.findViewById(C0126R.C0129id.app_name)).setText(a.f77092a);
            ((ImageView) view.findViewById(C0126R.C0129id.app_icon)).setImageDrawable(a.f77093b);
            String b = anxl.mo42352b();
            if (a.f77094c && b != null) {
                anme anme = this.f77200c;
                anme.f77114h.mo41998a(anxl, b);
                List list = (List) anme.f77116j.get(anxl);
                if (list == null) {
                    list = new ArrayList();
                    anme.f77116j.put(anxl, list);
                }
                list.add(this);
            }
        } else if (i - this.f77202e.size() < m64808c()) {
            if (view == null) {
                view = this.f77201d.inflate((int) C0126R.C0128layout.plus_list_apps_item, viewGroup, false);
            }
            ((TextView) view.findViewById(C0126R.C0129id.app_name)).setText(((BleDevice) this.f77198a.get(i - this.f77202e.size())).f31982b);
            ((ImageView) view.findViewById(C0126R.C0129id.app_icon)).setImageResource(C0126R.C0127drawable.ic_device_placeholder_24);
        } else if (view == null) {
            return this.f77201d.inflate((int) C0126R.C0128layout.plus_list_apps_item_loading, viewGroup, false);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo41984a(Collection r4, boolean z) {
        this.f77202e.clear();
        this.f77203f = z;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            anxl anxl = (anxl) r4.get(i);
            if (this.f77199b.mo41948a(anxl)) {
                this.f77202e.add(anxl);
            }
        }
        notifyDataSetChanged();
    }
}
