package p000;

import com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation;

/* renamed from: zpb */
public final /* synthetic */ class zpb implements aubq {

    /* renamed from: a */
    public static final aubq f55646a = new zpb();

    private zpb() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        srn srn = StartWearableSyncIntentOperation.f32430a;
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) StartWearableSyncIntentOperation.f32430a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unable to save to: %s", "/fitness/WearableSync/sync_request");
        }
    }
}
