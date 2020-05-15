package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lqn extends abh {

    /* renamed from: d */
    public final List f26605d = new ArrayList();

    /* renamed from: a */
    public final int mo161a() {
        return this.f26605d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15226a(lqm lqm, Object obj);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new lqm(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.autofill_two_line_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        mo15226a((lqm) acm, this.f26605d.get(i));
    }

    /* renamed from: a */
    public final void mo15378a(Collection collection) {
        this.f26605d.clear();
        this.f26605d.addAll(collection);
        mo171aJ();
    }
}
