package p000;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filterable;
import com.felicanetworks.mfc.C0126R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bikz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikz extends abh implements Filterable {

    /* renamed from: a */
    public final aepm f120804a;

    /* renamed from: d */
    public int f120805d = 0;

    /* renamed from: e */
    public int f120806e = 0;

    /* renamed from: f */
    private final Map f120807f;

    public bikz(rkb rkb) {
        this.f120804a = new aepm(rkb);
        this.f120807f = new HashMap();
        mo170a(true);
        this.f120804a.registerDataSetObserver(new bikx(this));
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        if (this.f120804a.getItemViewType(i) != 0) {
            return (long) this.f120804a.getItem(i).mo34282d().hashCode();
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f120804a.getCount();
    }

    /* renamed from: b */
    public final void mo174b(abj abj) {
        super.mo174b(abj);
        if (this.f120807f.containsKey(abj)) {
            this.f120804a.unregisterDataSetObserver((DataSetObserver) this.f120807f.get(abj));
            this.f120807f.remove(abj);
        }
    }

    /* renamed from: c */
    public final aepl getFilter() {
        return this.f120804a.f63596a;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return this.f120804a.getItemViewType(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new acm(from.inflate((int) C0126R.C0128layout.place_autocomplete_item_powered_by_google, viewGroup, false));
        }
        if (i == 1) {
            return new bild(from.inflate((int) C0126R.C0128layout.place_autocomplete_item_prediction, viewGroup, false));
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo166a(abj abj) {
        super.mo166a(abj);
        biky biky = new biky(abj);
        this.f120804a.registerDataSetObserver(biky);
        this.f120807f.put(abj, biky);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        if (this.f120804a.getItemViewType(i) != 0) {
            boolean z = false;
            if (this.f120805d == 0 && this.f120806e > 0) {
                z = true;
            }
            bild bild = (bild) acm;
            aepm aepm = this.f120804a;
            bild.f120819s = i;
            bild.f120820t = z;
            aepm.mo34423a(bild.f201a, i);
            bild.f201a.setOnClickListener(new bilc(bild, aepm, i));
            return;
        }
        this.f120804a.mo34422a(acm.f201a);
    }
}
