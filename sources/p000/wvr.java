package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: wvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wvr extends wvt {

    /* renamed from: a */
    final /* synthetic */ Bundle f51434a;

    /* renamed from: b */
    final /* synthetic */ long f51435b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvr(rkb rkb, Bundle bundle, long j) {
        super(rkb);
        this.f51434a = bundle;
        this.f51435b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        wyw wyw = (wyw) rjd;
        try {
            Bundle bundle = this.f51434a;
            long j = this.f51435b;
            wzg.m42519a(bundle);
            ((wze) wyw.mo25289B()).mo29473a(bundle, j);
            mo17716a((rkk) Status.f30107a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            mo17719d(wvu.f51439a);
        }
    }
}
