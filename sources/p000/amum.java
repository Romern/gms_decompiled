package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amum extends acm {

    /* renamed from: s */
    final RelativeLayout f75955s;

    /* renamed from: t */
    final ImageView f75956t = ((ImageView) this.f201a.findViewById(C0126R.C0129id.icon));

    /* renamed from: u */
    final TextView f75957u = ((TextView) this.f201a.findViewById(C0126R.C0129id.title));

    /* renamed from: v */
    final TextView f75958v = ((TextView) this.f201a.findViewById(C0126R.C0129id.body));

    /* renamed from: w */
    final TextView f75959w = ((TextView) this.f201a.findViewById(C0126R.C0129id.button_text));

    /* renamed from: x */
    final ImageView f75960x;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public amum(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.card_layout, viewGroup, false));
        ImageView imageView = (ImageView) this.f201a.findViewById(C0126R.C0129id.arrow_icon);
        this.f75960x = imageView;
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_keyboard_arrow_right_vd_theme_24);
        RelativeLayout relativeLayout = (RelativeLayout) this.f201a.findViewById(C0126R.C0129id.top_container);
        this.f75955s = (RelativeLayout) this.f201a.findViewById(C0126R.C0129id.bottom_container);
    }
}
