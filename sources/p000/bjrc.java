package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayDeque;
import java.util.List;

/* renamed from: bjrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrc extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    final List f123160a;

    /* renamed from: b */
    final ArrayDeque f123161b = new ArrayDeque();

    /* renamed from: c */
    public final bjgv f123162c;

    /* renamed from: d */
    public bjre f123163d;

    /* renamed from: e */
    private final bjrh f123164e;

    /* renamed from: f */
    private ListView f123165f;

    public bjrc(bjgv bjgv, bjrh bjrh, List list) {
        super(bjgv.f122692a.f122732i, (int) C0126R.C0128layout.wallet_view_drop_down_option, list);
        this.f123162c = bjgv;
        this.f123164e = bjrh;
        this.f123160a = list;
    }

    /* renamed from: b */
    private static void m104414b(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* renamed from: a */
    public final bjre mo65467a(bwxl bwxl) {
        bjre bjre;
        bjgt a = this.f123162c.f122694c.mo65205a(bwxl.f161386b);
        if (a != null) {
            mo65469a((bjre) a);
        }
        if (this.f123161b.isEmpty()) {
            bjgv bjgv = this.f123162c;
            bjre = (bjre) bjgv.f122694c.mo65206a(bjgv, bwxl);
        } else {
            bjre bjre2 = (bjre) this.f123161b.removeFirst();
            this.f123162c.f122694c.mo65208a(bwxl, bjre2);
            bjre = bjre2;
        }
        bjrh bjrh = this.f123164e;
        bjrh.mo65160a((bjgt) bjre);
        int a2 = bxae.m122487a(bjrh.f123175m.f161702c);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 1 != 1) {
            bjre.f123169p.setVisibility(0);
        } else {
            bjre.f123169p.setVisibility(8);
        }
        return bjre;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public final Filter getFilter() {
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        bjre bjre;
        if (this.f123165f != viewGroup) {
            ListView listView = (ListView) viewGroup;
            this.f123165f = listView;
            listView.setRecyclerListener(new bjrb(this));
        }
        bwxl bwxl = (bwxl) this.f123160a.get(i);
        if (view == null) {
            view = new FrameLayout(this.f123162c.f122692a.f122732i);
        } else {
            if (((ViewGroup) view).getChildCount() == 0) {
                view.setTag(C0126R.C0129id.ui_reference, null);
            }
            mo65468a(view);
        }
        bjre bjre2 = this.f123163d;
        if (bjre2 == null || bwxl.f161388d != bjre2.f122677b.f161388d) {
            bjre = mo65467a(bwxl);
        } else {
            if (!bjre2.mo65174h()) {
                this.f123163d.mo65176j();
            }
            bjre = this.f123163d;
        }
        m104414b(bjre.f122682g);
        view.setTag(C0126R.C0129id.ui_reference, Long.valueOf(bjre.mo65188t()));
        ((ViewGroup) view).addView(bjre.f122682g);
        return view;
    }

    /* renamed from: a */
    public final void mo65468a(View view) {
        bjre bjre;
        ((ViewGroup) view).removeAllViews();
        Long l = (Long) view.getTag(C0126R.C0129id.ui_reference);
        if (!(l == null || (bjre = (bjre) this.f123162c.f122694c.mo65205a(l.longValue())) == null)) {
            if (bjre == this.f123163d) {
                bjre.mo65179l();
            } else {
                mo65469a(bjre);
            }
        }
        view.setTag(C0126R.C0129id.ui_reference, null);
    }

    /* renamed from: a */
    public final void mo65469a(bjre bjre) {
        m104414b(bjre.f122682g);
        this.f123162c.f122694c.mo65207a(bjre);
        bjre.mo65178k();
        bjgx bjgx = bjre.f122680e;
        if (bjgx instanceof bjgt) {
            ((bjgt) bjgx).mo65167b(bjre);
        }
        this.f123161b.addFirst(bjre);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65470a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bjgt bjgt = (bjgt) list.get(i);
            if (bjgt instanceof bjre) {
                if (bjgt != this.f123163d) {
                    mo65469a((bjre) bjgt);
                } else {
                    bjgt.mo65179l();
                }
            }
        }
    }
}
