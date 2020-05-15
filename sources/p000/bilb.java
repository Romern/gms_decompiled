package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: bilb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilb extends C1538zg {

    /* renamed from: i */
    final ArrayList f120812i = new ArrayList();

    /* renamed from: j */
    final ArrayList f120813j = new ArrayList();

    /* renamed from: k */
    final ArrayList f120814k = new ArrayList();

    /* renamed from: l */
    private final int f120815l;

    public bilb(Resources resources) {
        this.f120815l = resources.getDimensionPixelSize(C0126R.dimen.place_autocomplete_vertical_dropdown);
    }

    /* renamed from: a */
    public static final void m102505a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: i */
    private final void m102506i(acm acm) {
        View view = acm.f201a;
        this.f120814k.add(acm);
        long j = 250;
        if (acm instanceof bild) {
            j = 250 + ((long) (((bild) acm).f120819s * 67));
        }
        view.setTranslationY((float) (-this.f120815l));
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new akc()).setStartDelay(j);
        animate.setListener(new bila(this, view, acm, animate)).start();
    }

    /* renamed from: b */
    public final boolean mo202b() {
        return super.mo202b() || !this.f120812i.isEmpty() || !this.f120814k.isEmpty();
    }

    /* renamed from: d */
    public final void mo205d() {
        for (int size = this.f120812i.size() - 1; size >= 0; size--) {
            acm acm = (acm) this.f120812i.get(size);
            m102505a(acm.f201a);
            mo208e(acm);
            this.f120812i.remove(size);
        }
        ArrayList arrayList = this.f120814k;
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((acm) arrayList.get(size2)).f201a.animate().cancel();
        }
        super.mo205d();
    }

    /* renamed from: g */
    public final void mo64726g() {
        if (!mo202b()) {
            mo207e();
        }
    }

    /* renamed from: a */
    public final void mo198a() {
        ArrayList arrayList = this.f120813j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.mo428b((acm) arrayList.get(i));
        }
        this.f120813j.clear();
        super.mo198a();
        if (!this.f120812i.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(this.f120812i);
            this.f120812i.clear();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                acm acm = (acm) arrayList2.get(i2);
                View view = acm.f201a;
                this.f120814k.add(acm);
                long j = 250;
                if (acm instanceof bild) {
                    j = 250 + ((long) (((bild) acm).f120819s * 67));
                }
                view.setTranslationY((float) (-this.f120815l));
                view.setAlpha(0.0f);
                ViewPropertyAnimator animate = view.animate();
                animate.cancel();
                animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new akc()).setStartDelay(j);
                animate.setListener(new bila(this, view, acm, animate)).start();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo428b(acm acm) {
        mo206d(acm);
        C1280ps.m19876K(acm.f201a);
        if (!(acm instanceof bild) || !((bild) acm).f120820t) {
            this.f120813j.add(acm);
            return true;
        }
        this.f120812i.add(acm);
        return true;
    }

    /* renamed from: d */
    public final void mo206d(acm acm) {
        super.mo206d(acm);
        View view = acm.f201a;
        if (this.f120812i.remove(acm)) {
            m102505a(view);
            mo208e(acm);
        }
        mo64726g();
    }
}
