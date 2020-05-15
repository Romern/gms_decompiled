package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: typ */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class typ extends txk {
    public typ(uih uih, AppIdentity appIdentity, tyq tyq) {
        super(txr.NULL, uih, appIdentity, tyq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26874a(txu txu, uey uey) {
        return this;
    }

    /* renamed from: b */
    public final DriveId mo26887b(uhn uhn) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return mo26884a((txk) ((typ) obj));
    }

    public final int hashCode() {
        return mo26905n() * 17;
    }

    /* renamed from: s */
    public final ukk mo26913s() {
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "NullAction[%s]", mo26904m());
    }

    public typ(uih uih, JSONObject jSONObject) {
        super(txr.NULL, uih, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply null action on the server");
    }
}
