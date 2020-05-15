package p000;

import android.view.ViewGroup;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;

/* renamed from: awyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyy {

    /* renamed from: a */
    public final boolean f95339a;

    /* renamed from: b */
    public final bmlv f95340b;

    /* renamed from: c */
    public final ViewGroup f95341c;

    /* renamed from: d */
    public final SummaryExpanderWrapper f95342d;

    /* renamed from: e */
    public final bkip f95343e;

    public awyy(boolean z, bmlv bmlv, ViewGroup viewGroup, SummaryExpanderWrapper summaryExpanderWrapper, bkip bkip) {
        this.f95339a = z;
        this.f95340b = bmlv;
        this.f95341c = viewGroup;
        this.f95342d = summaryExpanderWrapper;
        this.f95343e = bkip;
    }

    /* renamed from: a */
    public static awyy m81590a(boolean z, bkip bkip) {
        return new awyy(z, null, null, null, bkip);
    }

    /* renamed from: b */
    public final boolean mo52800b() {
        return this.f95342d != null;
    }

    /* renamed from: c */
    public final boolean mo52801c() {
        return this.f95342d == null;
    }

    /* renamed from: a */
    public static awyy m81591a(boolean z, bmlv bmlv, ViewGroup viewGroup, bkip bkip) {
        return new awyy(z, bmlv, viewGroup, null, bkip);
    }

    /* renamed from: a */
    public final awyx mo52799a() {
        return new awyx(this);
    }
}
