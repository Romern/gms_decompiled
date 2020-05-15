package p000;

import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;

/* renamed from: zky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zky extends yuh {

    /* renamed from: a */
    final /* synthetic */ zgh f55341a;

    /* renamed from: b */
    final /* synthetic */ zlf f55342b;

    /* renamed from: c */
    final /* synthetic */ int f55343c;

    /* renamed from: d */
    final /* synthetic */ bqgy f55344d;

    public zky(zgh zgh, zlf zlf, int i, bqgy bqgy) {
        this.f55341a = zgh;
        this.f55342b = zlf;
        this.f55343c = i;
        this.f55344d = bqgy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30783a() {
        bnsl bnsl = (bnsl) CollectSensorChimeraService.f32383b.mo68388c();
        bnsl.mo68432a("zky", "a", 291, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Unable to register for %s", this.f55341a);
        this.f55342b.mo31222a(this.f55343c, false);
        this.f55344d.mo69138b((Object) false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30784b() {
    }
}
