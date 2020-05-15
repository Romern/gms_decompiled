package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import org.json.JSONObject;

/* renamed from: tzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzp extends txk {
    protected tzp(uih uih, AppIdentity appIdentity) {
        super(txr.UNDO_PERMISSION, uih, appIdentity, tyq.NONE);
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
    public final txp mo26874a(txu txu, uey uey) {
        vpb.m40987a(txu.f46958a, this.f46915b, txu.f46959b, true);
        return new typ(this.f46915b, uey.f47396c, tyq.NONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DriveId mo26887b(uhn uhn) {
        return null;
    }

    /* renamed from: s */
    public final ukk mo26913s() {
        return null;
    }

    public tzp(uih uih, JSONObject jSONObject) {
        super(txr.UNDO_PERMISSION, uih, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
