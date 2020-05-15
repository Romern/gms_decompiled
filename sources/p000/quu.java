package p000;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: quu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quu extends shd {

    /* renamed from: a */
    public final String f42207a;

    /* renamed from: b */
    public final String f42208b;

    /* renamed from: c */
    public final String f42209c = spn.m35895h(this.f42210d.f44453i, this.f42207a);

    /* renamed from: d */
    protected final sgv f42210d;

    public quu(sgv sgv, String str) {
        this.f42210d = sgv;
        this.f42207a = str;
        this.f42208b = spn.m35899j(sgv.f44453i, this.f42207a);
        this.f42210d.f44447g = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
    }
}
