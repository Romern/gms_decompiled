package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzj extends txm {
    protected tzj(uih uih, AppIdentity appIdentity, ukk ukk) {
        super(txr.UNDO_CREATE_ENTRY, uih, appIdentity, ukk, tyq.NONE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(uhn, uih, long, boolean):void
     arg types: [uhn, uih, long, int]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void
      vpb.a(uhn, uih, long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        vpb.m40987a(txu.f46958a, this.f46915b, txu.f46959b, false);
        ujx.mo27589b(txu.f46959b);
        if (ujx.mo27523A() || ujx.mo27532J() || !ujx.mo27566ab()) {
            ujx.mo27627m(true);
        } else {
            ujx.mo27534L();
        }
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && mo26884a((tzj) obj);
        }
        return true;
    }

    public final int hashCode() {
        return mo26905n();
    }

    public final String toString() {
        return String.format(Locale.US, "UndoCreateEntryAction[%s]", mo26904m());
    }

    protected tzj(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_CREATE_ENTRY, uih, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
