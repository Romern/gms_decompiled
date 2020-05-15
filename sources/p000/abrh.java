package p000;

/* renamed from: abrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrh extends acpn {

    /* renamed from: a */
    final /* synthetic */ abrv f58035a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrh(abrv abrv, bqbd bqbd) {
        super(bqbd);
        this.f58035a = abrv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        if (!this.f58035a.mo32320d()) {
            absg.m48191b("UpdateNativeConfig skipped because init failed");
            return false;
        }
        abrv abrv = this.f58035a;
        if (abrv.f58078n.mo43404a(abrv.mo32326i())) {
            return true;
        }
        absg.m48191b("Failed while calling updateNativeConfig.");
        return false;
    }
}
