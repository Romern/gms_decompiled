package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpz {

    /* renamed from: a */
    public final View f86573a;

    /* renamed from: b */
    private final ViewGroup f86574b;

    /* renamed from: c */
    private final tim f86575c;

    /* renamed from: d */
    private final Map f86576d;

    /* renamed from: e */
    private boolean f86577e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public aqpz(Context context, ViewGroup viewGroup, tim tim) {
        LayoutInflater from = LayoutInflater.from(context);
        if (!cgnz.m146325b()) {
            this.f86573a = from.inflate((int) C0126R.C0128layout.cards_section, viewGroup, false);
        } else if (!cgmy.f187331a.mo6606a().mo84139j()) {
            this.f86573a = from.inflate((int) C0126R.C0128layout.gm_cards_section, viewGroup, false);
        } else if (!cgne.f187350a.mo6606a().mo84151e()) {
            this.f86573a = from.inflate((int) C0126R.C0128layout.gm_cards_section_bugfix, viewGroup, false);
        } else {
            this.f86573a = from.inflate((int) C0126R.C0128layout.gm_cards_section_bugfix_and_font_bugfix, viewGroup, false);
        }
        this.f86574b = (ViewGroup) this.f86573a.findViewById(C0126R.C0129id.cards_container);
        this.f86576d = new HashMap();
        this.f86575c = tim;
    }

    /* renamed from: a */
    public final void mo48056a() {
        this.f86574b.removeAllViews();
        this.f86576d.clear();
    }

    /* renamed from: b */
    public final void mo48060b() {
        for (int i = 0; i < this.f86574b.getChildCount(); i++) {
            View childAt = this.f86574b.getChildAt(i);
            if (this.f86576d.containsKey(childAt) && childAt.getGlobalVisibleRect(new Rect())) {
                this.f86575c.mo26567a((tin) this.f86576d.get(childAt), new tio[0]);
            }
        }
    }

    /* renamed from: c */
    public final void mo48061c() {
        this.f86573a.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo48062d() {
        this.f86573a.setVisibility(8);
    }

    /* renamed from: e */
    public final boolean mo48063e() {
        if (!cgnz.m146325b()) {
            return this.f86577e;
        }
        for (int i = 0; i < this.f86574b.getChildCount(); i++) {
            if (this.f86574b.getChildAt(i).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo48057a(View view, int i, tin tin) {
        if (cgnz.m146325b()) {
            this.f86574b.addView(view, i);
            this.f86576d.put(view, tin);
            this.f86577e = true;
        } else if (view.getVisibility() == 0) {
            this.f86574b.addView(view, i);
            this.f86576d.put(view, tin);
            this.f86577e = true;
        }
    }

    /* renamed from: a */
    public final void mo48058a(View view, tin tin) {
        mo48057a(view, this.f86574b.getChildCount(), tin);
    }

    /* renamed from: a */
    public final void mo48059a(String str) {
        TextView textView = (TextView) this.f86573a.findViewById(C0126R.C0129id.title);
        textView.setText(str);
        if (cgnz.m146325b()) {
            textView.setVisibility(0);
        } else {
            this.f86573a.findViewById(C0126R.C0129id.title_container).setVisibility(0);
        }
    }
}
