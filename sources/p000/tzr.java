package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzr extends txm {
    protected tzr(uih uih, AppIdentity appIdentity, ukk ukk) {
        super(txr.UNDO_TRASH, uih, appIdentity, ukk, tyq.NONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        vpb.m40991b(txu.f46958a, this.f46915b, txu.f46959b, true);
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo26884a((txk) ((tzr) obj));
    }

    public final int hashCode() {
        return mo26905n();
    }

    public final String toString() {
        return String.format(Locale.US, "UndoSetTrashedAction[%s]", mo26904m());
    }

    protected tzr(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_TRASH, uih, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
