package p000;

import android.content.Context;
import android.os.Handler;

/* renamed from: bfvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvn extends bfvo {

    /* renamed from: a */
    public final bfsd f115418a;

    /* renamed from: b */
    public final bhci f115419b;

    /* renamed from: c */
    public final Handler f115420c;

    /* renamed from: d */
    public final bfvk f115421d = new bfvk(this);

    /* renamed from: e */
    public final bfvm f115422e = new bfvm(this);

    /* renamed from: f */
    public final asfb f115423f;

    /* renamed from: g */
    public bfvi f115424g = this.f115425h;

    /* renamed from: h */
    private final bfvj f115425h = new bfvj(this);

    public bfvn(Context context, bfsd bfsd, Handler handler) {
        bhci bhci = new bhci(context, handler);
        this.f115418a = bfsd;
        this.f115419b = bhci;
        this.f115420c = handler;
        this.f115423f = bfqt.m97590a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        if (this.f115418a == null) {
            return;
        }
        if (this.f115428u && this.f115429v) {
            this.f115423f.mo49121c(saq.m34797a(this.f115430w));
            if (this.f115424g == this.f115425h) {
                mo62318a(this.f115421d);
                return;
            }
            return;
        }
        mo62318a(this.f115425h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PressureProvider[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo62318a(bfvi bfvi) {
        bfvi bfvi2 = this.f115424g;
        if (bfvi != bfvi2) {
            bfvi2.mo62316b();
            this.f115424g = bfvi;
            bfvi.mo62314a();
            return;
        }
        bfvi2.mo62316b();
        bfvi2.mo62314a();
    }
}
