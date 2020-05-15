package p000;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: faj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class faj extends avh {

    /* renamed from: b */
    private final LayoutInflater f16151b;

    /* renamed from: c */
    private final List f16152c;

    public faj(fak fak, Context context) {
        this.f16151b = (LayoutInflater) context.getSystemService("layout_inflater");
        if (evi.m11187a(fak.getContext())) {
            this.f16152c = bnkn.m109666a((List) fak.f16154b.f147493c);
        } else {
            this.f16152c = fak.f16154b.f147493c;
        }
    }

    /* renamed from: a */
    public final int mo2709a() {
        return this.f16152c.size();
    }

    /* renamed from: a */
    public final boolean mo2716a(View view, Object obj) {
        return view == obj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final Object mo2711a(ViewGroup viewGroup, int i) {
        View inflate = this.f16151b.inflate((int) C0126R.C0128layout.as_onboarding_step, viewGroup, false);
        bswu bswu = (bswu) this.f16152c.get(i);
        if (!bswu.f147498a.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.onboarding_step_title);
            textView.setVisibility(0);
            textView.setText(bswu.f147498a);
        }
        if (!bswu.f147499b.isEmpty()) {
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.onboarding_step_message);
            textView2.setVisibility(0);
            textView2.setText(bswu.f147499b);
            textView2.setMovementMethod(new ScrollingMovementMethod());
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo2715a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
