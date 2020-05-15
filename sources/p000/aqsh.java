package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqsh {

    /* renamed from: a */
    public final Context f86683a;

    /* renamed from: b */
    public final View f86684b;

    /* renamed from: c */
    public final tie f86685c;

    /* renamed from: d */
    public final bziw f86686d;

    /* renamed from: e */
    public final Resources f86687e;

    /* renamed from: f */
    public aqsg f86688f;

    /* renamed from: g */
    public Button f86689g;

    /* renamed from: h */
    public Button f86690h;

    /* renamed from: i */
    public View f86691i;

    /* renamed from: j */
    public View f86692j;

    /* renamed from: k */
    public final aqpu f86693k;

    /* renamed from: l */
    private final LayoutInflater f86694l;

    public aqsh(Context context, View view, tie tie, bziw bziw, aqpu aqpu) {
        this.f86683a = context;
        this.f86684b = view;
        this.f86685c = tie;
        this.f86686d = bziw;
        this.f86693k = aqpu;
        this.f86687e = context.getResources();
        this.f86694l = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final void mo48125a() {
        this.f86691i.setVisibility(0);
        this.f86689g.setEnabled(false);
        this.f86690h.setEnabled(false);
    }

    /* renamed from: b */
    public final void mo48127b() {
        this.f86691i.setVisibility(8);
        this.f86689g.setEnabled(true);
        this.f86690h.setEnabled(true);
    }

    /* renamed from: c */
    public final void mo48128c() {
        this.f86684b.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo48126a(ViewGroup viewGroup, String str) {
        TextView textView;
        if (cgnz.m146325b()) {
            textView = (TextView) this.f86694l.inflate((int) C0126R.C0128layout.gm_merge_card_subentry, viewGroup, false);
        } else {
            textView = (TextView) this.f86694l.inflate((int) C0126R.C0128layout.merge_card_subentry, viewGroup, false);
        }
        textView.setText(str);
        viewGroup.addView(textView);
    }
}
