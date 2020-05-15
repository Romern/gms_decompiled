package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: anns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anns extends Loader implements rjz, rka {

    /* renamed from: a */
    public ConnectionResult f77221a;

    /* renamed from: b */
    public MomentsFeed f77222b;

    /* renamed from: c */
    private final anul f77223c;

    /* renamed from: d */
    private anuy f77224d;

    /* renamed from: e */
    private final Account f77225e;

    /* renamed from: f */
    private final String f77226f;

    /* renamed from: g */
    private final String f77227g;

    /* renamed from: h */
    private final int f77228h;

    /* renamed from: i */
    private final String f77229i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anns(Context context, Account account, String str, String str2, int i, String str3) {
        super(context);
        anul anul = anuy.f77749a;
        this.f77225e = account;
        this.f77226f = str;
        this.f77227g = str2;
        this.f77228h = i;
        this.f77229i = str3;
        this.f77223c = anul;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (isStarted()) {
            onStartLoading();
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo42011a(this.f77224d);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        if (this.f77224d.mo24648p()) {
            mo42011a(this.f77224d);
        } else {
            this.f77224d.mo42332x();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f77224d == null) {
            this.f77224d = anme.m64734a(this.f77223c, getContext(), this, this, this.f77225e.name);
        }
        MomentsFeed momentsFeed = this.f77222b;
        if (momentsFeed != null) {
            deliverResult(momentsFeed);
        }
        if (takeContentChanged() || this.f77222b == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        anuy anuy = this.f77224d;
        if (anuy != null && anuy.mo24648p()) {
            this.f77224d.mo14032j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42011a(anuy anuy) {
        String str = this.f77227g;
        if (str == null) {
            String str2 = this.f77226f;
            if (str2 == null) {
                str2 = "all";
            }
            anuy.mo42326b(this, str2, this.f77228h, this.f77229i);
            return;
        }
        anuy.mo42307a(this, str, this.f77228h, this.f77229i);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f77221a = connectionResult;
        deliverResult(null);
    }
}
