package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: anxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anxz extends LinearLayout {

    /* renamed from: a */
    protected final boolean f77854a;

    /* renamed from: b */
    protected aoed f77855b;

    /* renamed from: c */
    protected anxy f77856c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, anxz, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public anxz(Context context, boolean z) {
        super(context);
        this.f77854a = z;
        LayoutInflater.from(context).inflate(mo42413a(), (ViewGroup) this, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo42413a();

    /* renamed from: a */
    public final String mo42414a(int i) {
        return getResources().getString(i);
    }

    /* renamed from: b */
    public abstract boolean mo42416b();

    /* renamed from: c */
    public abstract aoed mo42417c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo42418d() {
        return this.f77855b.mo42605l() && this.f77855b.mo42604k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo42419e() {
        return this.f77855b.mo42599f() && this.f77855b.mo42598d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public FavaDiagnosticsEntity mo42421g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final aodt mo42422h() {
        aodt aodt = new aodt();
        aodt.f78229a = this.f77855b.mo42600g();
        aodt.f78232d.add(4);
        aodt.f78230b = this.f77855b.mo42608o();
        aodt.f78232d.add(9);
        aodt.f78231c = this.f77855b.mo42611r();
        aodt.f78232d.add(11);
        return aodt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final CharSequence mo42423i() {
        if (!this.f77855b.mo42601h() || !this.f77855b.mo42603j() || !this.f77855b.mo42602i().mo42579d()) {
            return null;
        }
        return anzh.m65635a(this.f77856c, this.f77855b.mo42602i().mo42578c(), this.f77855b.mo42600g(), this.f77855b.mo42602i().mo42577b(), null, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public final String toString() {
        Object obj;
        Object obj2;
        Object[] objArr = new Object[4];
        objArr[0] = getClass().getSimpleName();
        aoed aoed = this.f77855b;
        Object obj3 = "";
        if (aoed != null) {
            obj = aoed.mo42600g();
        } else {
            obj = obj3;
        }
        objArr[1] = obj;
        aoed aoed2 = this.f77855b;
        if (aoed2 != null) {
            obj2 = aoed2.mo42608o();
        } else {
            obj2 = obj3;
        }
        objArr[2] = obj2;
        aoed aoed3 = this.f77855b;
        if (aoed3 != null) {
            obj3 = Boolean.valueOf(aoed3.mo42598d());
        }
        objArr[3] = obj3;
        return String.format("%s<id=\"%s\" type=\"%s\" hidden=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42415a(aoed aoed, anxy anxy) {
        rzz.m34731b(aoed);
        rzz.m34731b(anxy);
        this.f77855b = aoed;
        this.f77856c = anxy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo42420f() {
        return !mo42418d() || mo42419e();
    }
}
