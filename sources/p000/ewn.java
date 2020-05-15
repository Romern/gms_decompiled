package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: ewn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ewn extends abh {

    /* renamed from: a */
    private evk f15933a;

    /* renamed from: f */
    public List f15934f;

    /* renamed from: g */
    public final evl f15935g;

    /* renamed from: h */
    public evm f15936h;

    /* renamed from: i */
    public final Context f15937i;

    /* renamed from: j */
    public final fgt f15938j;

    public ewn(Context context, List list, evl evl, fgt fgt) {
        this.f15934f = list;
        this.f15935g = evl;
        this.f15937i = context;
        this.f15938j = fgt;
    }

    /* renamed from: c */
    private final void m11235c() {
        if (this.f15933a != null) {
            if (this.f15934f.isEmpty() || ((ewj) this.f15934f.get(0)).mo10503a() != 1) {
                this.f15934f.add(0, new ewm(this.f15933a));
                mo159N(0);
                return;
            }
            ((ewm) this.f15934f.get(0)).f15932a = this.f15933a;
            mo158M(0);
        } else if (!this.f15934f.isEmpty() && ((ewj) this.f15934f.get(0)).mo10503a() == 1) {
            this.f15934f.remove(0);
            mo160O(0);
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f15934f.size();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final ewo mo10553a(ViewGroup viewGroup) {
        return new ewl(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.as_error_banner, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        ((ewo) acm).mo10506a((ewj) this.f15934f.get(i));
    }

    /* renamed from: a */
    public final void mo10554a(evk evk, evm evm) {
        this.f15933a = evk;
        this.f15936h = evm;
        m11235c();
    }

    /* renamed from: a */
    public final void mo10555a(List list) {
        this.f15934f = list;
        m11235c();
    }
}
