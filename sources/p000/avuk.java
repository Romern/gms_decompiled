package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: avuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avuk extends avuo {

    /* renamed from: a */
    final /* synthetic */ avty f93936a;

    /* renamed from: b */
    final /* synthetic */ aucf f93937b;

    public avuk(avty avty, aucf aucf) {
        this.f93936a = avty;
        this.f93937b = aucf;
    }

    /* renamed from: a */
    public final void mo51616a(Status status, boolean z, ConsentInformation consentInformation) {
        this.f93936a.f93907a = consentInformation;
        rpc.m34202a(status, Boolean.valueOf(z), this.f93937b);
    }
}
