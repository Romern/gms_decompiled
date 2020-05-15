package p000;

import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.sdu.SystemDividingException;
import com.felicanetworks.sdu.SystemDividingUtility;

/* renamed from: brgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brgf implements brff {

    /* renamed from: a */
    final /* synthetic */ SystemDividingUtility f142802a;

    /* renamed from: b */
    final /* synthetic */ Felica f142803b;

    /* renamed from: c */
    final /* synthetic */ brgg f142804c;

    public brgf(brgg brgg, SystemDividingUtility systemDividingUtility, Felica felica) {
        this.f142804c = brgg;
        this.f142802a = systemDividingUtility;
        this.f142803b = felica;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        try {
            this.f142802a.startDividing(this.f142803b, (FSC) obj, new brge(this));
        } catch (SystemDividingException e) {
            this.f142804c.f142807c.f142818f.mo69532a(brgj.f142813c, "SystemDividingException in partitioning", e);
            brgg brgg = this.f142804c;
            brgg.f142807c.mo69505a(brgg.f142805a);
        }
    }
}
