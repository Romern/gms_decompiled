package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apwn extends svm {

    /* renamed from: c */
    public int f85019c = Integer.MAX_VALUE;

    /* renamed from: l */
    public int f85020l;

    /* renamed from: m */
    public CharSequence f85021m;

    public apwn(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static int m71103a(sue sue, sue sue2) {
        int i;
        if (sue == sue2) {
            return 0;
        }
        apwn apwn = (apwn) sue;
        int i2 = apwn.f85019c;
        int e = sue2.mo26089e();
        if (i2 < e) {
            i = -1;
        } else {
            i = i2 == e ? 0 : 1;
        }
        if (i != 0) {
            return i;
        }
        CharSequence charSequence = apwn.f85021m;
        CharSequence d = sue2.mo26088d();
        if (charSequence != null && d != null) {
            return String.CASE_INSENSITIVE_ORDER.compare(charSequence.toString(), d.toString());
        }
        if (charSequence == d) {
            return 0;
        }
        if (charSequence != null) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo23821a() {
        return C0126R.C0128layout.find_my_device_top_toggle;
    }

    /* renamed from: a */
    public final void mo26084a(int i) {
        this.f85020l = i;
    }

    /* renamed from: a */
    public final void mo26085a(CharSequence charSequence) {
        this.f85021m = charSequence;
    }

    /* renamed from: a */
    public final void mo26103a(svf svf) {
    }

    /* renamed from: b */
    public final svb mo23822b() {
        return apwm.f85018a;
    }

    /* renamed from: b */
    public final void mo26086b(int i) {
        this.f85019c = i;
    }

    /* renamed from: c */
    public final int mo26087c() {
        return this.f85020l;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m71103a(this, (sue) obj);
    }

    /* renamed from: d */
    public final CharSequence mo26088d() {
        return this.f85021m;
    }

    /* renamed from: e */
    public final int mo26089e() {
        return this.f85019c;
    }

    /* renamed from: f */
    public final boolean mo26146f() {
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int identityHashCode = System.identityHashCode(this);
        int i = this.f85019c;
        String valueOf = String.valueOf(this.f85021m);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 25 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo26144a(sue sue) {
        return m71103a(this, sue);
    }
}
