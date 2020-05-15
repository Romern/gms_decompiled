package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: wvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvf {

    /* renamed from: a */
    public final Integer f51405a;

    /* renamed from: b */
    public final String f51406b;

    /* renamed from: c */
    final int f51407c;

    /* renamed from: d */
    final String f51408d;

    /* renamed from: e */
    public final Object f51409e;

    /* renamed from: f */
    public final String f51410f;

    public wvf(String str, Integer num, Object obj, String str2, int i, String str3) {
        this.f51408d = str;
        this.f51409e = obj;
        this.f51405a = num;
        this.f51406b = str2;
        this.f51407c = i;
        this.f51410f = str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo29444a() {
        Integer num = this.f51405a;
        return num != null && num.equals(Integer.valueOf(C0126R.string.common_loading));
    }

    /* renamed from: b */
    public final boolean mo29445b() {
        return (this.f51406b == null || this.f51410f == null) ? false : true;
    }
}
