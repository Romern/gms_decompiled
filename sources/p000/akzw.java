package p000;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.lang.ref.WeakReference;

/* renamed from: akzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzw {

    /* renamed from: b */
    public static final Object f73192b = new Object();

    /* renamed from: a */
    public WeakReference f73193a = null;

    /* renamed from: c */
    private final WeakReference f73194c;

    public akzw(View view) {
        this.f73194c = new WeakReference(view);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [bhnc, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: a */
    public final void mo40033a(int i, int i2, View.OnClickListener onClickListener) {
        View view = (View) this.f73194c.get();
        if (view != null) {
            bhnh a = bhnh.m101201a(view, i, -2);
            TextView textView = (TextView) a.f119110e.findViewById(C0126R.C0129id.snackbar_text);
            if (textView != null) {
                a.mo64034c(adyg.m51405b(view.getContext(), C0126R.attr.octOnBackground, C0126R.color.google_grey900));
                textView.setTextColor(adyg.m51405b(view.getContext(), C0126R.attr.octBackground, C0126R.color.google_white));
            }
            if (onClickListener != null) {
                a.mo64030a(i2, onClickListener);
                try {
                    a.mo64033b(adyg.m51405b(view.getContext(), C0126R.attr.octLegacyHighlight300, C0126R.color.google_blue300));
                } catch (Resources.NotFoundException e) {
                }
            }
            a.mo64031a(new akzv(this));
            synchronized (f73192b) {
                this.f73193a = new WeakReference(a);
                C1280ps.m19906b((View) a.f119110e, 1);
                C1280ps.m19919f((View) a.f119110e, 1);
                a.mo64020c();
            }
        }
    }
}
