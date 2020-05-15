package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: fyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyg extends anbp {

    /* renamed from: a */
    public String f17617a;

    /* renamed from: b */
    public String f17618b;

    /* renamed from: c */
    public rto f17619c;

    /* renamed from: d */
    public fyf f17620d;

    /* renamed from: m */
    private int f17621m;

    public fyg(Context context, String str, String str2, String str3) {
        super(context, str, null, str2, str3, 0);
    }

    /* renamed from: a */
    public final void mo11509a(String str) {
        String str2 = this.f17617a;
        if (str2 == null || !str2.equals(str)) {
            this.f17618b = null;
            this.f17619c = null;
        } else if (this.f17620d != null) {
            return;
        }
        this.f17621m = 20;
        this.f17617a = str;
        super.mo41661b(str);
    }

    /* renamed from: a */
    public final boolean mo11511a() {
        return this.f17618b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11510a(rkb rkb) {
        fyf fyf = this.f17620d;
        if (fyf != null) {
            fyf.f17615a = true;
            this.f17620d = null;
        }
        if (!TextUtils.isEmpty(this.f76582l)) {
            this.f17620d = new fyf(this);
            rjo rjo = allr.f73629a;
            String str = this.f76579i;
            String str2 = this.f76580j;
            allj allj = new allj();
            allj.f73623a = this.f76582l;
            allj.f73625c = this.f17621m;
            allj.f73624b = this.f17618b;
            amdd.m62644a(rkb, str, str2, allj).mo9458a(this.f17620d);
        }
    }
}
