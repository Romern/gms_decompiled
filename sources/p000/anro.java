package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: anro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anro extends anbp {

    /* renamed from: a */
    public String f77509a;

    /* renamed from: b */
    public String f77510b;

    /* renamed from: c */
    public rto f77511c;

    /* renamed from: d */
    public anrn f77512d;

    /* renamed from: m */
    private int f77513m;

    public anro(Context context, String str, String str2, String str3, String str4) {
        super(context, str, str2, str3, str4, 0);
    }

    /* renamed from: a */
    public final void mo42155a(String str) {
        String str2 = this.f77509a;
        if (str2 == null || !str2.equals(str)) {
            this.f77510b = null;
            this.f77511c = null;
        } else if (this.f77512d != null) {
            return;
        }
        this.f77513m = 20;
        this.f77509a = str;
        super.mo41661b(str);
    }

    /* renamed from: a */
    public final boolean mo42156a() {
        return this.f77510b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11510a(rkb rkb) {
        anrn anrn = this.f77512d;
        if (anrn != null) {
            anrn.f77507a = true;
            this.f77512d = null;
        }
        if (!TextUtils.isEmpty(this.f76582l)) {
            this.f77512d = new anrn(this);
            rjo rjo = allr.f73629a;
            String str = this.f76579i;
            String str2 = this.f76580j;
            allj allj = new allj();
            allj.f73623a = this.f76582l;
            allj.f73625c = this.f77513m;
            allj.f73624b = this.f77510b;
            amdd.m62644a(rkb, str, str2, allj).mo9458a(this.f77512d);
        }
    }
}
