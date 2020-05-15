package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arff */
final /* synthetic */ class arff implements aubt {

    /* renamed from: a */
    private final arfh f87579a;

    /* renamed from: b */
    private final arjf f87580b;

    public arff(arfh arfh, arjf arjf) {
        this.f87579a = arfh;
        this.f87580b = arjf;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        arfh arfh = this.f87579a;
        arjf arjf = this.f87580b;
        arfh.f87583a.mo25416d("Target mode not enabled.", new Object[0]);
        arfh.f87591i = false;
        arfh.m72643b(arjf, new Status(10557));
    }
}
