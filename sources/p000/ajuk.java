package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajuk extends abh implements Iterable {

    /* renamed from: a */
    public final Context f71297a;

    /* renamed from: d */
    public final List f71298d = new ArrayList();

    /* renamed from: e */
    public final ajui f71299e;

    public ajuk(Context context, ajui ajui) {
        this.f71297a = context;
        this.f71299e = ajui;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f71298d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38927a(ajuj ajuj) {
    }

    /* renamed from: b */
    public final int mo38930b(Object obj) {
        return this.f71298d.indexOf(obj);
    }

    /* renamed from: f */
    public final Object mo38932f(int i) {
        return this.f71298d.get(i);
    }

    public final Iterator iterator() {
        return this.f71298d.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo38931b(int i, Object obj) {
        this.f71298d.set(i, obj);
        mo158M(i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo175b(acm acm) {
        ajuj ajuj = (ajuj) acm;
        ajuj.f201a.getViewTreeObserver().addOnPreDrawListener(new ajuh(this, ajuj));
    }

    /* renamed from: a */
    public void mo168a(ajuj ajuj, int i) {
        Object f = mo38932f(i);
        ajuj.mo38926a(this.f71297a, f);
        ajuj.f201a.setOnClickListener(new ajug(this, ajuj, f));
    }

    /* renamed from: a */
    public final void mo38929a(Object obj) {
        this.f71298d.add(obj);
        mo159N(this.f71298d.size() - 1);
    }
}
