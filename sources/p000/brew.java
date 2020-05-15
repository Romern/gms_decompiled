package p000;

import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.util.List;

/* renamed from: brew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brew implements brff {

    /* renamed from: a */
    final /* synthetic */ brfa f142734a;

    /* renamed from: b */
    final /* synthetic */ List f142735b;

    /* renamed from: c */
    final /* synthetic */ String f142736c;

    /* renamed from: d */
    final /* synthetic */ brez f142737d;

    /* renamed from: e */
    final /* synthetic */ int f142738e;

    /* renamed from: f */
    final /* synthetic */ int f142739f;

    public brew(brez brez, brfa brfa, List list, String str, int i, int i2) {
        this.f142737d = brez;
        this.f142734a = brfa;
        this.f142735b = list;
        this.f142736c = str;
        this.f142738e = i;
        this.f142739f = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69479a(Object obj) {
        Felica felica = (Felica) obj;
        try {
            felica.activateFelica((String[]) this.f142735b.toArray(new String[0]), new brev(this, felica));
        } catch (FelicaException e) {
            this.f142737d.mo69502a(8, e);
            this.f142734a.mo49936a(bret.m113949a(e));
            this.f142737d.mo69480a(5);
            this.f142737d.mo69508b(felica, this.f142738e);
            this.f142737d.mo69509c();
        } catch (Throwable th) {
            this.f142737d.mo69508b(felica, this.f142738e);
            this.f142737d.mo69509c();
            throw th;
        }
    }
}
