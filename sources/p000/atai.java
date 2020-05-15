package p000;

import android.hardware.SensorEvent;

/* renamed from: atai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atai extends aaco {

    /* renamed from: a */
    final /* synthetic */ ataj f89948a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public atai(ataj ataj, String str, String str2) {
        super(str, str2);
        this.f89948a = ataj;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        boolean z = false;
        if (sensorEvent.values != null && sensorEvent.values.length > 0 && sensorEvent.values[0] == 0.0f) {
            z = true;
        }
        bnsl a = ataj.f89949a.mo26019b(aske.m74275a());
        a.mo68432a("atai", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Off body sensor changed. isOffBody: %b", Boolean.valueOf(z));
        this.f89948a.f89950b = !z;
    }
}
