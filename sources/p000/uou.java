package p000;

import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: uou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uou implements uqr {

    /* renamed from: a */
    public final upv f48431a;

    /* renamed from: b */
    public final ums f48432b;

    /* renamed from: c */
    public final ChangesAvailableOptions f48433c;

    /* renamed from: d */
    public final String f48434d;

    /* renamed from: e */
    public final Set f48435e;

    /* renamed from: f */
    private final long f48436f;

    /* renamed from: g */
    private boolean f48437g = false;

    public uou(ums ums, upr upr) {
        Collection collection;
        this.f48432b = ums;
        JSONObject jSONObject = new JSONObject(ums.f48256e);
        int i = jSONObject.getInt("optionsSizeLimit");
        boolean z = jSONObject.getBoolean("optionsRepeats");
        if (jSONObject.has("optionsSpaces")) {
            collection = uqq.m39258a(jSONObject.getJSONArray("optionsSpaces"));
        } else {
            collection = bnon.f131923a;
        }
        this.f48433c = new ChangesAvailableOptions(i, z, new ArrayList(collection));
        this.f48434d = uqq.m39260a(jSONObject);
        this.f48435e = uqq.m39262b(jSONObject);
        long j = jSONObject.getLong("sequenceNumber");
        this.f48436f = j;
        this.f48431a = new upv(upr, j, this.f48433c, this.f48435e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27789a() {
        bkww.m106783b(!this.f48437g, "Already initialized");
        this.f48437g = true;
    }

    /* renamed from: b */
    public final ums mo27791b() {
        return this.f48432b;
    }

    /* renamed from: c */
    public final boolean mo27792c() {
        return this.f48431a.mo27843b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugx.a(java.lang.String, boolean, uog):java.util.Set
     arg types: [java.lang.String, int, uog]
     candidates:
      ugx.a(uif, java.lang.String, boolean):java.util.List
      ugx.a(uih, java.lang.String, java.lang.String):ujx
      ugx.a(uif, java.lang.String, java.lang.String):uot
      uhl.a(uif, java.lang.String, boolean):java.util.List
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      ugx.a(java.lang.String, boolean, uog):java.util.Set */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27790a(uey uey, uhn uhn) {
        mo27789a();
        uij b = uhn.mo27418b(uey.f47394a.f47682a);
        long j = this.f48436f;
        if (j >= b.f47687b) {
            ugx ugx = (ugx) uhn;
            this.f48431a.mo27841a(ugx.mo27360a("ScopedEntryView", true, uoh.m39066a(voz.m40974b(uey.f47394a.f47683b), voz.m40970a(uey), voz.m40969a(this.f48435e), ukm.SEQUENCE_NUMBER.f48022aB.mo27712c(j))));
            return;
        }
        this.f48431a.mo27840a();
    }
}
