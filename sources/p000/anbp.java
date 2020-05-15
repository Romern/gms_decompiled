package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: anbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anbp extends anbm implements alll {

    /* renamed from: h */
    protected static final Status f76575h = new Status(5);

    /* renamed from: a */
    private final String f76576a;

    /* renamed from: b */
    private final String f76577b;

    /* renamed from: c */
    private final int f76578c;

    /* renamed from: i */
    public final String f76579i;

    /* renamed from: j */
    public final String f76580j;

    /* renamed from: k */
    public boolean f76581k;

    /* renamed from: l */
    public String f76582l;

    static {
        new Status(8);
    }

    public anbp(Context context, String str, String str2, String str3, String str4, int i) {
        super(context);
        if (TextUtils.isEmpty(str3)) {
            Log.w("PeopleClientLoader", "Caller should set application ID");
            str3 = "0";
        }
        this.f76579i = str;
        this.f76580j = str2;
        this.f76576a = str3;
        this.f76577b = str4;
        this.f76578c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rkb mo41654a(Context context) {
        int i = 0;
        if (!TextUtils.isEmpty(this.f76576a)) {
            try {
                i = Integer.parseInt(this.f76576a);
            } catch (NumberFormatException e) {
            }
        }
        allp allp = new allp();
        allp.f73626a = i;
        allq a = allp.mo40491a();
        rjy rjy = new rjy(context);
        rjy.f43173b = this.f76577b;
        rjy.mo24780a(allr.f73629a, a);
        rkb b = rjy.mo24784b();
        b.mo24790a((rjz) new anbo(this));
        return b;
    }

    /* renamed from: b */
    public final void mo40489b() {
        onContentChanged();
    }

    /* renamed from: e */
    public final void mo41662e() {
        if (!this.f76581k && this.f76578c != 0 && mo41660d()) {
            this.f76581k = true;
            rjo rjo = allr.f73629a;
            amdg.m62647a(this.f76570e, this, this.f76579i, this.f76580j, this.f76578c).mo9458a(new anbn(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f76570e == null) {
            this.f76570e = mo41654a(getContext());
            this.f76570e.mo24790a((rjz) new anbk(this));
            this.f76570e.mo24791a((rka) new anbl(this));
        }
        rtp rtp = this.f76572g;
        if (rtp != null) {
            deliverResult(rtp);
        }
        if (takeContentChanged() || this.f76572g == null) {
            forceLoad();
        }
        mo41662e();
    }

    /* renamed from: b */
    public final void mo41661b(String str) {
        this.f76582l = str;
        onContentChanged();
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        if (mo41660d() && this.f76581k) {
            rjo rjo = allr.f73629a;
            amdg.m62648a(this.f76570e, this);
        }
        this.f76581k = false;
        rkb rkb = this.f76570e;
        if (rkb != null && rkb.mo24805i()) {
            this.f76570e.mo24803g();
        }
    }
}
