package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: bizn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizn extends BaseAdapter implements bizo {

    /* renamed from: a */
    private final bizp f122389a;

    /* renamed from: b */
    private final bizm f122390b = new bizm();

    public bizn(bizp bizp) {
        this.f122389a = bizp;
        bizp.mo64920a(this);
        m103049b();
    }

    /* renamed from: b */
    private final void m103049b() {
        for (int i = 0; i < getCount(); i++) {
            bizl a = getItem(i);
            bizm bizm = this.f122390b;
            int b = a.mo64907b();
            if (bizm.f122387a.indexOfKey(b) < 0) {
                bizm.f122387a.put(b, bizm.f122388b);
                bizm.f122388b++;
            }
            bizm.f122387a.get(b);
        }
    }

    /* renamed from: a */
    public final bizl getItem(int i) {
        return this.f122389a.mo64919a(i);
    }

    /* renamed from: cB */
    public final void mo64911cB() {
        m103049b();
        notifyDataSetChanged();
    }

    public final int getCount() {
        return this.f122389a.mo64923g();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return this.f122390b.f122387a.get(getItem(i).mo64907b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        bizl a = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(a.mo64907b(), viewGroup, false);
        }
        a.mo48939a(view);
        return view;
    }

    public final int getViewTypeCount() {
        return this.f122390b.f122387a.size();
    }

    public final boolean isEnabled(int i) {
        return getItem(i).mo64908bJ();
    }

    /* renamed from: a */
    public final void mo64910a(bizp bizp, int i) {
        mo64911cB();
    }

    /* renamed from: a */
    public final void mo58967a(bizp bizp, int i, int i2) {
        mo64911cB();
    }

    /* renamed from: b */
    public final void mo58968b(bizp bizp, int i, int i2) {
        mo64911cB();
    }
}
