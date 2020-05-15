package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: anrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrp extends Loader implements rjz, rka {

    /* renamed from: a */
    public final String f77514a;

    /* renamed from: b */
    public PeopleFeed f77515b;

    /* renamed from: c */
    private final anul f77516c;

    /* renamed from: d */
    private anuy f77517d;

    /* renamed from: e */
    private final String f77518e;

    /* renamed from: f */
    private final String f77519f;

    /* renamed from: g */
    private final String f77520g;

    /* renamed from: h */
    private final int f77521h;

    /* renamed from: i */
    private final int f77522i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anrp(Context context, String str, String str2, String str3, int i, int i2, String str4) {
        super(context);
        anul anul = anuy.f77749a;
        this.f77518e = str;
        this.f77519f = str2;
        this.f77520g = str3;
        this.f77521h = i;
        this.f77522i = i2;
        this.f77514a = str4;
        this.f77516c = anul;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (isStarted()) {
            onStartLoading();
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo42157a(this.f77517d);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        if (this.f77517d.mo24648p()) {
            mo42157a(this.f77517d);
        } else {
            this.f77517d.mo42332x();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f77517d == null) {
            Context context = getContext();
            anwk anwk = new anwk(context);
            anwk.f77819a = this.f77520g;
            anwk.mo42334a("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.me");
            anwk.f77822d = new String[]{"service_googleme"};
            anwk.f77821c = this.f77519f;
            anwk.f77823e = this.f77518e;
            this.f77517d = this.f77516c.mo42292a(context, anwk.mo42333a(), this, this);
        }
        PeopleFeed peopleFeed = this.f77515b;
        if (peopleFeed != null) {
            deliverResult(peopleFeed);
        }
        if (takeContentChanged() || this.f77515b == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        anuy anuy = this.f77517d;
        if (anuy != null && anuy.mo24648p()) {
            this.f77517d.mo14032j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42157a(anuy anuy) {
        anuy.mo42308a(this, this.f77521h, this.f77522i, this.f77514a);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        deliverResult(null);
    }
}
