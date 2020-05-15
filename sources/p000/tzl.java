package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzl extends txk {
    protected tzl(uih uih, AppIdentity appIdentity) {
        super(txr.UNDO_DELETE_FILE, uih, appIdentity, tyq.NONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26874a(txu txu, uey uey) {
        tyk.m37742a(txu.f46958a, this.f46915b, txu.f46959b, true);
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DriveId mo26887b(uhn uhn) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo26884a((txk) ((tzl) obj));
    }

    public final int hashCode() {
        return mo26905n();
    }

    /* renamed from: s */
    public final ukk mo26913s() {
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "UndoDeleteFileAction[%s]", mo26904m());
    }

    protected tzl(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_DELETE_FILE, uih, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
