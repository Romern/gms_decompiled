package p000;

import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: aifg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aifg extends roh {

    /* renamed from: c */
    final /* synthetic */ String f68866c;

    /* renamed from: d */
    final /* synthetic */ rod f68867d;

    /* renamed from: e */
    final /* synthetic */ DiscoveryOptions f68868e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aifg(rod rod, String str, rod rod2, DiscoveryOptions discoveryOptions) {
        super(rod);
        this.f68866c = str;
        this.f68867d = rod2;
        this.f68868e = discoveryOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        aieh aieh = (aieh) rjd;
        aifj aifj = new aifj(aucf);
        String str = this.f68866c;
        rod rod = this.f68867d;
        DiscoveryOptions discoveryOptions = this.f68868e;
        aidx aidx = new aidx(rod);
        aieh.f68829a.add(aidx);
        aiim aiim = new aiim();
        aiim.mo37545a(new aiee(aifj));
        aiim.mo37547a(str);
        aiim.mo37546a(discoveryOptions);
        aiim.mo37544a(aidx);
        ((aigl) aieh.mo25289B()).mo36599a(aiim.f68917a);
    }
}
