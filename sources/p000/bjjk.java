package p000;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* renamed from: bjjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjjk extends bjjm implements bjgz {

    /* renamed from: m */
    public ViewGroup f122827m = null;

    protected bjjk(bjgv bjgv, Class cls) {
        super(bjgv, cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract ViewGroup mo65299E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public ViewGroup mo65300F() {
        return this.f122827m;
    }

    /* renamed from: a */
    public final void mo65210a(View view) {
        mo65300F().removeView(view);
        TouchDelegate touchDelegate = mo65300F().getTouchDelegate();
        if (touchDelegate instanceof bjla) {
            bjla bjla = (bjla) touchDelegate;
            TouchDelegate touchDelegate2 = (TouchDelegate) bjla.f122915a.remove(view);
            bjla.f122916b.remove(view);
            if (touchDelegate2 == bjla.f122917c) {
                bjla.f122917c = null;
            }
            view.removeOnLayoutChangeListener(bjla);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo65184p() {
        super.mo65184p();
        mo65177j(this.f122827m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo65185q() {
        super.mo65185q();
        mo65192w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final bjha mo65190u() {
        return bjha.m103465a(this);
    }

    /* renamed from: a */
    public final void mo65211a(View view, int i) {
        mo65300F().addView(view, i);
    }

    /* renamed from: a */
    public void mo65212a(bjgt bjgt, View view) {
        bjla bjla;
        if (bjgt.mo65157D()) {
            ViewGroup F = mo65300F();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                TouchDelegate touchDelegate = F.getTouchDelegate();
                if (touchDelegate instanceof bjla) {
                    bjla = (bjla) touchDelegate;
                } else {
                    bjla = new bjla(F);
                    F.setTouchDelegate(bjla);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Rect rect = new Rect(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                bmxy.m108582a(view, String.format(Locale.US, "Parameter delegateView cannot be null.", new Object[0]));
                bmxy.m108582a(rect, String.format(Locale.US, " Parameter boundOffset cannot be null.", new Object[0]));
                bjla.f122916b.put(view, rect);
                bjla.mo65360a(view);
                view.addOnLayoutChangeListener(bjla);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        ViewGroup E = mo65299E();
        this.f122827m = E;
        E.setClipChildren(false);
        this.f122827m.setClipToPadding(false);
    }
}
