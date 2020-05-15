package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: txk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class txk implements txp {

    /* renamed from: e */
    private static final sbw f46913e = new sbw("AbstractAction", "");

    /* renamed from: a */
    public final txr f46914a;

    /* renamed from: b */
    public final uih f46915b;

    /* renamed from: c */
    public final AppIdentity f46916c;

    /* renamed from: d */
    public uaw f46917d;

    /* renamed from: f */
    private final tyq f46918f;

    protected txk(txr txr, uih uih, AppIdentity appIdentity, tyq tyq) {
        this(txr, uih, appIdentity, tyq, uaw.f47070a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract txp mo26874a(txu txu, uey uey);

    /* renamed from: a */
    public final txw mo26875a(txu txu) {
        return new txw(this, mo26874a(txu, mo26895d(txu.f46958a)));
    }

    /* renamed from: a */
    public final uih mo26877a() {
        return this.f46915b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26880a(txv txv, ClientContext clientContext);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract DriveId mo26887b(uhn uhn);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26888b(txv txv) {
    }

    /* renamed from: b */
    public boolean mo26890b(txp txp) {
        return false;
    }

    /* renamed from: c */
    public final uaw mo26891c() {
        return this.f46917d;
    }

    /* renamed from: c */
    public void mo26893c(txv txv) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo26894d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo26896e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public MetadataBundle mo26897f() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo26898g() {
        return true;
    }

    /* renamed from: h */
    public JSONObject mo26899h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestingAppIdentity", this.f46916c.mo18134a());
        jSONObject.put("operationType", this.f46914a.f46950y);
        jSONObject.put("permissionEnforcement", this.f46918f.f46988c);
        uaw uaw = this.f46917d;
        jSONObject.put("conflictStrategy", uaw.f47071b);
        jSONObject.put("notifyOnCompletion", uaw.f47072c);
        jSONObject.put("usesDefaultAccount", uaw.f47073d);
        jSONObject.put("operationTag", new JSONArray((Collection) uaw.f47074e));
        jSONObject.putOpt("binderPackageName", uaw.f47075f);
        jSONObject.put("mustCreateNewRevision", uaw.f47076g);
        return jSONObject;
    }

    /* renamed from: i */
    public final AppIdentity mo26900i() {
        return this.f46916c;
    }

    /* renamed from: j */
    public boolean mo26901j() {
        return false;
    }

    /* renamed from: k */
    public final txr mo26902k() {
        return this.f46914a;
    }

    /* renamed from: l */
    public boolean mo26903l() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo26904m() {
        return String.format("Action type=%s, account=%s, requestingAppIdentity=%s, enforcementMode=%s", this.f46914a, this.f46915b, this.f46916c, this.f46918f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo26905n() {
        return Arrays.hashCode(new Object[]{this.f46914a, this.f46915b, this.f46916c, this.f46918f, this.f46917d});
    }

    protected txk(txr txr, uih uih, AppIdentity appIdentity, tyq tyq, uaw uaw) {
        sdo.checkIfNull(txr, "type must not be null");
        this.f46914a = txr;
        sdo.checkIfNull(uih, "account must not be null");
        this.f46915b = uih;
        sdo.checkIfNull(appIdentity, "app identity must not be null");
        this.f46916c = appIdentity;
        sdo.checkIfNull(tyq, "enforcement mode must not be null");
        this.f46918f = tyq;
        sdo.checkIfNull(uaw, "execution context must not be null");
        this.f46917d = uaw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo26889b() {
        return this.f46917d.mo27025a();
    }

    /* renamed from: c */
    public final uey mo26892c(uhn uhn) {
        uey b = uhn.mo27417b(this.f46915b.f47683b, this.f46916c);
        if (b != null) {
            return b;
        }
        throw new tzu(this.f46916c);
    }

    /* renamed from: d */
    public final uey mo26895d(uhn uhn) {
        if (this.f46918f == tyq.NONE) {
            return uey.m38255a(this.f46915b);
        }
        return mo26892c(uhn);
    }

    /* renamed from: a */
    public final uau mo26876a(uhn uhn) {
        if (this.f46917d.f47072c) {
            try {
                DriveId b = mo26887b(uhn);
                if (b != null) {
                    return new uau(this.f46917d, b, mo26894d(), mo26896e(), mo26897f(), mo26895d(uhn), mo26913s(), this.f46914a);
                }
                f46913e.mo25372b("AbstractAction", "Cannot notify on action completion: null DriveId!");
                return null;
            } catch (tzu e) {
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    protected txk(txr txr, uih uih, JSONObject jSONObject) {
        this(txr, uih, r4, r5, uaw.m37853a(jSONObject));
        AppIdentity a = AppIdentity.m22943a(jSONObject.getJSONObject("requestingAppIdentity"));
        String string = jSONObject.getString("permissionEnforcement");
        tyq[] values = tyq.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            tyq tyq = values[i];
            if (!tyq.f46988c.equals(string)) {
                i++;
            } else {
                return;
            }
        }
        String valueOf = String.valueOf(string);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown permission enforcement mode: ") : "Unknown permission enforcement mode: ".concat(valueOf));
    }

    /* renamed from: a */
    public void mo26878a(txp txp, uhn uhn, long j) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo26879a(txv txv) {
        vpu vpu = txv.f46961a;
        try {
            uey d = mo26895d(vpu.f49757d);
            txv.f46964d.mo28281a(new CallingAppInfo(d, 0));
            mo26888b(txv);
            mo26880a(txv, d.mo27262a(vpu.f49755b));
            if (mo26898g()) {
                uhn uhn = vpu.f49757d;
                sdo.checkIfNull(mo26913s(), "Must have entry spec after apply locally");
                try {
                    ujp d2 = uhn.mo27432d(mo26913s().f47941a);
                    if (d2 != null) {
                        if (d2.f47810b != null) {
                            vpu.f49779z.mo28207a(mo26895d(uhn), d2.f47810b, new vks(302, 2, false, false));
                            return;
                        }
                    }
                    f46913e.mo25374b("AbstractAction", "No driveId data in db to sync entry after apply on server: %s", mo26904m());
                } catch (tzu e) {
                    f46913e.mo25373b("AbstractAction", "Entry not authorized on the app after applying action on server.", e);
                } catch (VolleyError e2) {
                    e = e2;
                    f46913e.mo25373b("AbstractAction", "Unable to sync entry after applying action on server.", e);
                } catch (gid e3) {
                    e = e3;
                    f46913e.mo25373b("AbstractAction", "Unable to sync entry after applying action on server.", e);
                } catch (RuntimeException e4) {
                    f46913e.mo25378c("AbstractAction", "Runtime exception while syncing entry after apply on server.", e4);
                }
            }
        } catch (UserRecoverableAuthException e5) {
            f46913e.mo25372b("AbstractAction", "Failed to apply due to recoverable auth exception.");
            throw e5;
        } catch (gid e6) {
            f46913e.mo25372b("AbstractAction", "App is not authorized on the server. Removing from local cache.");
            uhn uhn2 = vpu.f49757d;
            try {
                uhn2.mo27422b(this.f46915b.f47683b, mo26892c(uhn2).f47395b);
            } catch (tzu e7) {
            }
            throw new tzu(this.f46916c);
        } catch (VolleyError e8) {
            throw tyv.m37777a(e8);
        }
    }

    /* renamed from: a */
    public final boolean mo26881a(DriveId driveId, uhn uhn) {
        try {
            return driveId.equals(mo26887b(uhn));
        } catch (tzu e) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo26882a(AppIdentity appIdentity, uih uih) {
        return this.f46916c.equals(appIdentity) && this.f46915b.equals(uih);
    }

    /* renamed from: a */
    public final boolean mo26883a(Set set) {
        return set.contains(this.f46914a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo26884a(txk txk) {
        return this.f46914a.equals(txk.f46914a) && this.f46915b.equals(txk.f46915b) && this.f46916c.equals(txk.f46916c) && this.f46918f.equals(txk.f46918f) && this.f46917d.equals(txk.f46917d);
    }

    /* renamed from: a */
    public boolean mo26885a(txp txp) {
        ukk s = txp.mo26913s();
        if (s == null) {
            f46913e.mo25374b("AbstractAction", "Action provided to shouldBlock has null EntrySpec: %s", txp.toString());
            return true;
        } else if (mo26913s() != null) {
            return s.equals(mo26913s());
        } else {
            f46913e.mo25374b("AbstractAction", "Executing shouldBlock on an action with null EntrySpec: %s", toString());
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo26886a(uih uih) {
        return this.f46915b.equals(uih);
    }
}
