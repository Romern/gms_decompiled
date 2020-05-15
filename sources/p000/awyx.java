package p000;

import android.view.ViewGroup;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;

/* renamed from: awyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyx {

    /* renamed from: a */
    public bmlv f95334a;

    /* renamed from: b */
    public bkip f95335b;

    /* renamed from: c */
    private final boolean f95336c;

    /* renamed from: d */
    private ViewGroup f95337d;

    /* renamed from: e */
    private SummaryExpanderWrapper f95338e;

    public awyx(awyy awyy) {
        this.f95336c = awyy.f95339a;
        this.f95334a = awyy.f95340b;
        this.f95337d = awyy.f95341c;
        this.f95338e = awyy.f95342d;
        this.f95335b = awyy.f95343e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final awyy mo52797a() {
        return new awyy(this.f95336c, this.f95334a, this.f95337d, this.f95338e, this.f95335b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52798a(ViewGroup viewGroup) {
        if (viewGroup instanceof SummaryExpanderWrapper) {
            SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) viewGroup;
            this.f95338e = summaryExpanderWrapper;
            viewGroup = summaryExpanderWrapper.f152309e;
        }
        this.f95337d = viewGroup;
    }
}
