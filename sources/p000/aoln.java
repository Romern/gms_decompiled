package p000;

import android.content.Context;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;

/* renamed from: aoln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoln extends anog implements Filterable, anof {

    /* renamed from: F */
    public final Context f78403F;

    /* renamed from: G */
    public final String f78404G;

    /* renamed from: H */
    public final String f78405H;

    /* renamed from: I */
    public String f78406I;

    /* renamed from: J */
    public anrm f78407J;

    /* renamed from: K */
    public anro f78408K;

    /* renamed from: L */
    public anrj f78409L;

    /* renamed from: Q */
    private final LoaderManager f78410Q;

    /* renamed from: R */
    private Filter f78411R;

    /* renamed from: S */
    private final aoll f78412S = new aoll(this);

    /* renamed from: T */
    private final aolm f78413T = new aolm(this);

    /* renamed from: U */
    private final aolk f78414U = new aolk(this);

    public aoln(Context context, LoaderManager loaderManager, String str, String str2, String str3, String str4, anqg anqg) {
        super(context, anqg, str3, str4);
        ((anog) this).f77288b = this;
        this.f78403F = context;
        this.f78410Q = loaderManager;
        this.f78404G = str;
        this.f78405H = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AudienceSelectionListPersonView mo42040a(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, int i, View view, boolean z2, boolean z3, boolean z4) {
        AudienceSelectionListPersonView a = super.mo42040a(obj, str, str2, str3, str4, str5, z, i, view, z2, z3, z4);
        a.mo42096a(false);
        return a;
    }

    /* renamed from: b */
    public final void mo42037b() {
        this.f78408K.mo42155a(this.f78406I);
    }

    /* renamed from: e */
    public final void mo42066e() {
        super.mo42066e();
        this.f78407J = (anrm) this.f78410Q.initLoader(1, null, this.f78412S);
        this.f78408K = (anro) this.f78410Q.initLoader(2, null, this.f78413T);
        this.f78409L = (anrj) this.f78410Q.initLoader(3, null, this.f78414U);
    }

    /* renamed from: f */
    public final void mo42067f() {
        this.f78410Q.destroyLoader(1);
        this.f78410Q.destroyLoader(2);
        this.f78410Q.destroyLoader(3);
        super.mo42067f();
    }

    public final Filter getFilter() {
        if (this.f78411R == null) {
            this.f78411R = new aolj(this);
        }
        return this.f78411R;
    }
}
