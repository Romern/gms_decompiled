package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: anth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anth extends Loader implements rjz, rka, anup {

    /* renamed from: a */
    public ConnectionResult f77711a;

    /* renamed from: b */
    public String f77712b;

    /* renamed from: c */
    private anuy f77713c;

    /* renamed from: d */
    private rtm f77714d;

    /* renamed from: e */
    private final ArrayList f77715e = new ArrayList();

    /* renamed from: f */
    private final anul f77716f;

    /* renamed from: g */
    private final Account f77717g;

    /* renamed from: h */
    private final int f77718h;

    /* renamed from: i */
    private final String f77719i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anth(Context context, Account account, int i, String str) {
        super(context);
        anul anul = anuy.f77749a;
        this.f77717g = account;
        this.f77718h = i;
        this.f77719i = str;
        this.f77716f = anul;
    }

    /* renamed from: a */
    public final void mo42225a() {
        int size = this.f77715e.size();
        for (int i = 0; i < size; i++) {
            ((rtm) this.f77715e.get(i)).mo12460c();
        }
        this.f77715e.clear();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo42226a(this.f77713c);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        if (this.f77713c.mo24648p()) {
            mo42226a(this.f77713c);
        } else {
            this.f77713c.mo42332x();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        rtm rtm = this.f77714d;
        if (rtm != null) {
            rtm.mo12460c();
            mo42225a();
        }
        this.f77714d = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f77713c == null) {
            this.f77713c = anme.m64737b(this.f77716f, getContext(), this, this, this.f77717g.name);
        }
        rtm rtm = this.f77714d;
        if (rtm != null) {
            deliverResult(rtm);
        }
        if (takeContentChanged() || this.f77714d == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        anuy anuy = this.f77713c;
        if (anuy != null && anuy.mo24648p()) {
            this.f77713c.mo14032j();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (isStarted()) {
            onStartLoading();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42226a(anuy anuy) {
        anuy.mo42312a(this, this.f77718h, this.f77719i);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        mo42227a(connectionResult, null);
    }

    /* renamed from: a */
    public final void mo42028a(ConnectionResult connectionResult, anxm anxm, String str) {
        this.f77712b = str;
        mo42227a(connectionResult, anxm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42227a(ConnectionResult connectionResult, rtm rtm) {
        this.f77711a = connectionResult;
        deliverResult(rtm);
    }

    /* renamed from: a */
    public final void deliverResult(rtm rtm) {
        if (!isReset()) {
            rtm rtm2 = this.f77714d;
            this.f77714d = rtm;
            if (isStarted()) {
                super.deliverResult(rtm);
            }
            if (rtm2 != null && rtm2 != rtm) {
                this.f77715e.add(rtm2);
                mo42225a();
            }
        } else if (rtm != null) {
            rtm.mo12460c();
        }
    }
}
