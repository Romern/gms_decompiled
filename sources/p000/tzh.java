package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: tzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tzh extends txm {

    /* renamed from: f */
    private final boolean f47005f;

    static {
        new sbw("UndoContentAndMetadataA", "");
    }

    public tzh(uih uih, AppIdentity appIdentity, ukk ukk) {
        super(txr.UNDO_CONTENT_AND_METADATA, uih, appIdentity, ukk, tyq.NONE);
        this.f47005f = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        uhn uhn = txu.f46958a;
        if (this.f47005f) {
            String i = ujx.mo27616i();
            try {
                vpu.m41034a().f49779z.mo28207a(uey, i, new vks(203, 2, false, true));
            } catch (Exception e) {
            }
        }
        long j = txu.f46959b;
        vpb.m40985a(uhn, this.f46915b, j);
        vpb.m40991b(uhn, this.f46915b, j, false);
        vpb.m40988a(uhn, this.f46915b, ujx.mo27551a(), j, true);
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return mo26884a((txk) ((tzh) obj));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n())});
    }

    public final String toString() {
        String m = mo26904m();
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 31);
        sb.append("UndoContentAndMetadataAction [");
        sb.append(m);
        sb.append("]");
        return sb.toString();
    }

    public tzh(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_CONTENT_AND_METADATA, uih, jSONObject);
        this.f47005f = jSONObject.has("metadataDelta");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
