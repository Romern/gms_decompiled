package p000;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bilz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilz extends abh implements bimt {

    /* renamed from: a */
    public final bimy f120876a;

    /* renamed from: d */
    public final bihb f120877d;

    /* renamed from: e */
    public boolean f120878e;

    /* renamed from: f */
    private List f120879f = new ArrayList();

    public bilz(bimy bimy, bihb bihb) {
        this.f120876a = bimy;
        this.f120877d = bihb;
        this.f120878e = true;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f120879f.size() + 1;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return i != 0 ? 1 : 0;
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
        if (mo162a(i) == 0) {
            return new bily(from.inflate((int) C0126R.C0128layout.place_picker_list_title, viewGroup, false));
        }
        return new bilx(this, from.inflate((int) C0126R.C0128layout.place_picker_list_nearby_place, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        int i2;
        Drawable drawable;
        String str;
        if (mo162a(i) != 0) {
            bilx bilx = (bilx) acm;
            aelh aelh = (aelh) this.f120879f.get(i - 1);
            bilx.f120872v = aelh;
            bilx.f120869s.setText(aelh.mo8024q());
            bilx.f120870t.setText(aelh.mo8025r());
            ImageView imageView = bilx.f120871u;
            bihb bihb = bilx.f120873w.f120877d;
            Iterator it = aelh.mo8008b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    drawable = (Drawable) bihb.f120580a.get("establishment");
                    break;
                }
                drawable = (Drawable) bihb.f120580a.get(bhqm.m101334a(((Integer) it.next()).intValue()));
                if (drawable != null) {
                    break;
                }
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = bilx.f120871u;
            bihb bihb2 = bilx.f120873w.f120877d;
            Iterator it2 = aelh.mo8008b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = (String) bihb2.f120581b.get("establishment");
                    break;
                }
                str = (String) bihb2.f120581b.get(bhqm.m101334a(((Integer) it2.next()).intValue()));
                if (str != null) {
                    break;
                }
            }
            imageView2.setContentDescription(str);
            return;
        }
        boolean z = this.f120878e;
        View view = ((bily) acm).f120875s;
        if (!z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo64751a(List list) {
        this.f120879f = list;
        this.f120878e = false;
        mo171aJ();
    }
}
