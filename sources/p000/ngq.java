package p000;

import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.util.Set;

/* renamed from: ngq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngq extends ngr {

    /* renamed from: a */
    public final Set f35538a;

    public ngq(BleSettings bleSettings, nej nej, Set set) {
        super(bleSettings, nej);
        this.f35538a = set;
    }

    /* renamed from: a */
    public final void mo20611a(String str) {
        try {
            this.f35540d.mo20523a(str);
        } catch (Exception e) {
            nha.m26244a("Failure sending 'lost' scan result to listener", e);
        }
    }

    /* renamed from: a */
    public final void mo20612a(boolean z, BleSighting bleSighting) {
        try {
            this.f35540d.mo13774a(!z ? 1 : 2, bleSighting);
        } catch (Exception e) {
            nha.m26244a("Failure delivering scan result", e);
        }
    }
}
