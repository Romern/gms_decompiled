package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.sdu.SystemDividingUtility;
import java.util.List;

/* renamed from: brgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brgg implements brff {

    /* renamed from: a */
    final /* synthetic */ brgo f142805a;

    /* renamed from: b */
    final /* synthetic */ List f142806b;

    /* renamed from: c */
    final /* synthetic */ brgj f142807c;

    public brgg(brgj brgj, brgo brgo, List list) {
        this.f142807c = brgj;
        this.f142805a = brgo;
        this.f142806b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        Felica felica = (Felica) obj;
        SystemDividingUtility a = this.f142807c.mo69501a(this.f142806b);
        if (a == null) {
            this.f142807c.mo69505a(this.f142805a);
            return;
        }
        brgj brgj = this.f142807c;
        brgj.f142821i = brgj.f142823k.mo49928b(new brgf(this, a, felica));
        brgj brgj2 = this.f142807c;
        brgj2.f142821i.mo49924a(brgj2.f142817e);
    }
}
