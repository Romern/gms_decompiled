package p000;

import java.util.List;

/* renamed from: adrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adrg implements bmxj {

    /* renamed from: a */
    final /* synthetic */ adrj f62547a;

    public adrg(adrj adrj) {
        this.f62547a = adrj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<Boolean> list = (List) obj;
        this.f62547a.f62559d.mo33710b();
        if (list == null) {
            this.f62547a.f62559d.mo33711b(4);
            adns.m50862a().mo33692a(this.f62547a.f62559d.mo33707a());
            return false;
        }
        Boolean bool = true;
        for (Boolean bool2 : list) {
            bool = Boolean.valueOf(bool.booleanValue() & bool2.booleanValue());
        }
        if (bool.booleanValue()) {
            this.f62547a.f62559d.mo33711b(3);
        } else {
            this.f62547a.f62559d.mo33711b(4);
        }
        adns a = adns.m50862a();
        adqo adqo = this.f62547a.f62559d;
        adqo.mo33710b();
        a.mo33692a(adqo.mo33707a());
        return bool;
    }
}
