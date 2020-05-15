package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.util.Arrays;

/* renamed from: anog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anog extends anpb {

    /* renamed from: F */
    private aonl f77284F = new aono();

    /* renamed from: G */
    private final anox f77285G = new anox(this);

    /* renamed from: H */
    private final aono f77286H = new aono();

    /* renamed from: a */
    public boolean f77287a = false;

    /* renamed from: b */
    public anof f77288b;

    /* renamed from: c */
    public anoz f77289c;

    /* renamed from: d */
    public aonl f77290d;

    public anog(Context context, anqg anqg, String str, String str2) {
        super(context, anqg, str, str2, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo42038a(View view, ViewGroup viewGroup, boolean z) {
        anof anof = this.f77288b;
        if (anof != null) {
            anof.mo42037b();
        }
        return super.mo42038a(view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final aonl mo42044c() {
        aonl[] aonlArr = new aonl[4];
        aonlArr[0] = this.f77290d;
        aonlArr[1] = new aonp(this, (int) C0126R.string.plus_audience_selection_header_circles, new aonk(this.f77377v, this.f77378w));
        aonlArr[2] = new aonp(this, (int) C0126R.string.plus_audience_selection_search_google_results, new aonk(this.f77289c, this.f77380y, this.f77284F));
        aonlArr[3] = !this.f77287a ? this.f77286H : this.f77285G;
        return new aonk(aonlArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo42045d() {
        return this.f77287a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AudienceSelectionListCircleView mo42039a(alzj alzj, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView a = super.mo42039a(alzj, view, viewGroup, z);
        a.mo42098d();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AudienceSelectionListPersonView mo42040a(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, int i, View view, boolean z2, boolean z3, boolean z4) {
        AudienceSelectionListPersonView a = super.mo42040a(obj, str, str2, str3, str4, str5, z, i, view, z2, z3, z4);
        a.mo42098d();
        a.f77420g = true;
        return a;
    }

    /* renamed from: a */
    public final void mo42041a() {
        this.f77289c = null;
        mo42068g();
    }

    /* renamed from: a */
    public void mo42042a(amfa amfa) {
        this.f77289c = new anoz(this, Arrays.asList(amfa));
        mo42068g();
    }

    /* renamed from: a */
    public final void mo42043a(rtp rtp, boolean z) {
        this.f77287a = z;
        this.f77284F = new anoy(this, rtp, rtp.mo24660a());
        mo42068g();
    }
}
