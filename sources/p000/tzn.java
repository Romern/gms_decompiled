package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tzn extends txm {

    /* renamed from: f */
    private final boolean f47006f;

    static {
        new sbw("UndoMetadataAction", "");
    }

    public tzn(uih uih, AppIdentity appIdentity, ukk ukk) {
        super(txr.UNDO_METADATA, uih, appIdentity, ukk, tyq.NONE);
        this.f47006f = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        if (this.f47006f) {
            String i = ujx.mo27616i();
            try {
                vpu.m41034a().f49779z.mo28207a(uey, i, new vks(912, 2, false, true));
            } catch (Exception e) {
            }
        }
        uhn uhn = txu.f46958a;
        long j = txu.f46959b;
        vpb.m40985a(uhn, this.f46915b, j);
        vpb.m40991b(uhn, this.f46915b, j, false);
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return mo26884a((txk) ((tzn) obj));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n())});
    }

    public final String toString() {
        return String.format(Locale.US, "UndoMetadataAction [%s]", mo26904m());
    }

    public tzn(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_METADATA, uih, jSONObject);
        this.f47006f = jSONObject.has("metadataDelta");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
