package p000;

import android.view.ViewGroup;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxh extends fxg {

    /* renamed from: e */
    private static final Object[] f17499e = {""};

    /* renamed from: f */
    private final fwo f17500f;

    /* renamed from: g */
    private final int[] f17501g;

    /* renamed from: h */
    private final int f17502h;

    public fxh(fwo fwo, int[] iArr, int i) {
        this.f17500f = fwo;
        this.f17501g = iArr;
        this.f17502h = i;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final int mo161a() {
        if (!((fxg) this).f17497a) {
            return this.f17501g.length;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        fwm fwm = this.f17500f.f17485x;
    }

    /* renamed from: a */
    public final void mo11455a(ContactPerson contactPerson) {
    }

    /* renamed from: a */
    public final void mo11456a(ContactPerson contactPerson, int i) {
    }

    /* renamed from: b */
    public final void mo11458b(ContactPerson contactPerson) {
    }

    /* renamed from: c */
    public final void mo11463c(boolean z) {
    }

    /* renamed from: f */
    public final int mo11468f() {
        int length = f17499e.length;
        return 1;
    }

    /* renamed from: g */
    public final int mo11471g(int i) {
        return this.f17502h;
    }

    public final int getPositionForSection(int i) {
        return 0;
    }

    public final int getSectionForPosition(int i) {
        return 0;
    }

    public final Object[] getSections() {
        return f17499e;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return this.f17501g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11472g(boolean z) {
        if (!z) {
            mo177c(0, this.f17501g.length);
        } else {
            mo178d(0, this.f17501g.length);
        }
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        fwm fwm = this.f17500f.f17485x;
        if (fwm != null) {
            return fwm.mo7261k();
        }
        return null;
    }
}
