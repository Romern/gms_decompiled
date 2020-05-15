package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.sdu.SystemDividingException;
import com.felicanetworks.sdu.SystemDividingUtility;
import java.util.List;

/* renamed from: brgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brgc implements brff {

    /* renamed from: a */
    final /* synthetic */ brfd f142797a;

    /* renamed from: b */
    final /* synthetic */ List f142798b;

    /* renamed from: c */
    final /* synthetic */ brgj f142799c;

    public brgc(brgj brgj, brfd brfd, List list) {
        this.f142799c = brgj;
        this.f142797a = brfd;
        this.f142798b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        Felica felica = (Felica) obj;
        try {
            SystemDividingUtility a = this.f142799c.mo69501a(this.f142798b);
            if (a == null) {
                this.f142799c.mo69504a(this.f142797a);
            } else {
                a.startCheckingStatus(felica, new brgb(this));
            }
        } catch (SystemDividingException e) {
            this.f142799c.f142818f.mo69532a(brgj.f142813c, "SystemDividingException in status checking", e);
            this.f142799c.mo69504a(this.f142797a);
        }
    }
}
