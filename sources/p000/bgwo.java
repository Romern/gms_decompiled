package p000;

/* renamed from: bgwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bgwo implements bgyu {
    First,
    ChargingInVehicle,
    Moving,
    Stationary,
    WifiTriggered;

    /* renamed from: a */
    public final String mo63285a() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 4 ? "Normal" : "Wifi triggered" : "Charging in vehicle" : "First upload";
    }

    /* renamed from: a */
    public final String mo63286a(boolean z) {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? ordinal != 4 ? "default" : "wifiTriggered" : "stationary" : "chargingInVehicle" : "firstUpload";
    }

    /* renamed from: b */
    public final /* synthetic */ long mo63287b(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return chcs.f188354a.mo6606a().mo85107j();
        }
        if (ordinal == 2) {
            return chcs.f188354a.mo6606a().mo85088ax();
        }
        if (ordinal == 3) {
            return chcs.f188354a.mo6606a().mo85058aT();
        }
        if (ordinal == 4) {
            return chcs.f188354a.mo6606a().mo85099bh();
        }
        throw null;
    }

    /* renamed from: b */
    public final String mo63288b() {
        return "internal";
    }

    /* renamed from: c */
    public final String mo63289c() {
        return null;
    }
}
