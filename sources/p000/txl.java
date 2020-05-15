package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: txl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class txl extends txk implements tyl {

    /* renamed from: e */
    protected final MetadataBundle f46919e;

    /* renamed from: f */
    protected DriveId f46920f;

    /* renamed from: g */
    public DriveId f46921g;

    protected txl(txr txr, uih uih, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId, uaw uaw) {
        super(txr, uih, appIdentity, tyq.NORMAL, uaw);
        this.f46919e = metadataBundle;
        this.f46920f = driveId;
    }

    /* renamed from: a */
    private static final void m37631a(MetadataBundle metadataBundle, Set set, uvy uvy, Object obj) {
        if (!set.contains(uvy)) {
            metadataBundle.mo18273b(uvy, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo26906a(uey uey);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26907a(txu txu, ujx ujx);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DriveId mo26887b(uhn uhn) {
        return this.f46921g;
    }

    /* renamed from: h */
    public JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("metadata", uyj.m39762b(this.f46919e));
        DriveId driveId = this.f46920f;
        if (driveId != null) {
            h.put("parent", driveId.mo18112a());
        }
        DriveId driveId2 = this.f46921g;
        if (driveId2 != null) {
            h.put("newDriveId", driveId2.mo18112a());
        }
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo26904m() {
        return String.format(Locale.US, "%s, initialMetadata=%s, parent=%s, newDriveId=%s", super.mo26904m(), this.f46919e, this.f46920f, this.f46921g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo26905n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.mo26905n()), this.f46919e, this.f46921g, this.f46920f});
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo26909o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo26910p() {
        if (this.f46920f != null) {
            Collection collection = (Collection) this.f46919e.mo18269a(uzm.f48767z);
            C1225nr nrVar = new C1225nr();
            if (collection != null) {
                nrVar.addAll(collection);
            }
            nrVar.add(this.f46920f);
            this.f46919e.mo18273b(uzm.f48767z, nrVar);
        }
    }

    /* renamed from: q */
    public final Set mo26911q() {
        DriveId driveId = this.f46920f;
        if (driveId != null) {
            return Collections.singleton(ukk.m38862a(driveId.f30729b));
        }
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo26912r() {
        return uvw.m39525a(this.f46919e);
    }

    /* renamed from: s */
    public final ukk mo26913s() {
        DriveId driveId = this.f46921g;
        if (driveId != null) {
            return ukk.m38862a(driveId.f30729b);
        }
        return null;
    }

    protected txl(txr txr, uih uih, JSONObject jSONObject) {
        super(txr, uih, jSONObject);
        this.f46919e = uyj.m39759a(jSONObject.getJSONObject("metadata"));
        if (jSONObject.has("parent")) {
            this.f46920f = DriveId.m22925b(jSONObject.getString("parent"));
        } else {
            this.f46920f = null;
        }
        if (jSONObject.has("newDriveId")) {
            this.f46921g = DriveId.m22925b(jSONObject.getString("newDriveId"));
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String, com.google.android.gms.drive.UserMetadata], assign insn: PHI: (r9v1 ?) = (r9v3 ?), (r9v4 ?) binds: [B:37:0x017e, B:29:0x0157] */
    /* JADX WARN: Type inference failed for: r9v3, assign insn: 0x017e: CONST  (r9v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v4, assign insn: 0x0157: CONST  (r9v4 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(boolean, long):void
     arg types: [int, long]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, boolean):java.util.List
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(ujx, ukt, boolean, long):void
     arg types: [ujx, ukt, int, long]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(uhn, uih, long, boolean):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(java.lang.String, boolean):java.util.List
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(java.lang.String, boolean):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ukc.a(boolean, long):void
     arg types: [int, long]
     candidates:
      ukc.a(int, long):void
      ukc.a(uhm, com.google.android.gms.drive.internal.model.Permission):void
      ukc.a(boolean, long):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26874a(txu txu, uey uey) {
        ujx ujx;
        ujx ujx2;
        ujx ujx3;
        ? r9;
        txu txu2 = txu;
        uey uey2 = uey;
        uhn uhn = txu2.f46958a;
        long j = txu2.f46959b;
        try {
            DriveId driveId = this.f46920f;
            if (driveId != null) {
                ukk a = ukk.m38862a(driveId.f30729b);
                ujx a2 = uhn.mo27402a(uey.m38255a(this.f46915b), a);
                if (a2.mo27640w()) {
                    ujx = a2;
                } else {
                    throw new uac(a);
                }
            } else {
                ujx = uhn.mo27401a(uey.m38255a(this.f46915b), "root");
            }
            String str = (String) this.f46919e.mo18269a(uzm.f48741Q);
            String a3 = mo26906a(uey2);
            this.f46919e.mo18273b(uzm.f48738N, a3);
            if (mo26912r()) {
                String str2 = (String) this.f46919e.mo18269a(uzm.f48729E);
                ujx b = uhn.mo27420b(uey.m38255a(this.f46915b), str2, uey2.f47395b, ujx.mo27573ai());
                if (b == null) {
                    ujx2 = uhn.mo27430c(uey.m38255a(this.f46915b), str2, uey2.f47395b, ujx.mo27573ai());
                    if (ujx2 != null) {
                        ujx2.mo27563a(false, j);
                        ((ugx) uhn).f47578a.mo27465a(ulh.f48116a, ulg.CHILD_ENTRY_ID.f48115c.mo27717e(ujx2.mo27551a().f47941a));
                        ujx2.mo27580ap();
                    }
                } else {
                    throw new tzz(b.mo27610g());
                }
            } else {
                ujx2 = null;
            }
            if (ujx2 != null) {
                ujx3 = ujx2;
            } else {
                uih uih = this.f46915b;
                sdo.m34959a((Object) str);
                ujx a4 = ((ugx) uhn).mo27370a(uih, a3, (String) null);
                a4.mo27557a(str);
                a4.mo27611g(a3);
                Date date = new Date();
                a4.mo27594c(date);
                a4.mo27559a(date);
                a4.mo27587b(date);
                a4.mo27562a(true);
                a4.mo27606f();
                a4.mo27563a(false, j);
                a4.mo27533K();
                ujx3 = a4;
            }
            String str3 = uey2.f47395b;
            MetadataBundle b2 = this.f46919e.mo18271b();
            Set c = b2.mo18274c();
            m37631a(b2, c, uzm.f48744c, null);
            m37631a(b2, c, uzm.f48740P, false);
            m37631a(b2, c, uzm.f48762u, false);
            m37631a(b2, c, uzp.f48771c, new Date(0));
            m37631a(b2, c, uzp.f48772d, null);
            m37631a(b2, c, uzp.f48770b, null);
            m37631a(b2, c, uzp.f48773e, null);
            m37631a(b2, c, uzm.f48730F, true);
            ujx ujx4 = ujx3;
            ukt a5 = vpb.m40984a(uhn, ujx4);
            uyj.m39761a(ujx4, a5, j, str3, b2);
            vpb.m40989a(ujx4, a5, ung.UNTRASHED, j);
            vpb.m40990a(ujx4, a5, true, j);
            if (((Boolean) twy.f46896w.mo58455c()).booleanValue()) {
                List a6 = ujx4.mo27550a((String) null, true);
                int size = a6.size();
                for (int i = 0; i < size; i++) {
                    uot uot = (uot) a6.get(i);
                    ula g = uot.mo27787g();
                    if (!g.mo27683a() || g.mo27687c() != j) {
                        uot.mo27783a((String) null, Long.valueOf(j));
                    }
                }
                r9 = 0;
            } else {
                r9 = 0;
            }
            ujx4.mo27555a((UserMetadata) r9);
            ujx4.mo27583b((UserMetadata) r9);
            ujx4.mo27615h(true);
            ujx4.mo27595c(false);
            ujx4.mo27604e(false);
            ujx4.mo27617i((String) r9);
            ujx4.mo27612g(mo26909o());
            ujx4.mo27627m(false);
            a5.mo27725t();
            uhn.mo27374a(ujx4, ujx.mo27613h());
            ujx4.mo27602e(ujx.mo27643z());
            ujx4.mo27622k(!ujx4.mo27573ai());
            ujx4.mo27625l(false);
            uhn.mo27375a(ujx4, Collections.singleton(uey2.f47395b));
            for (ukc ukc : ujx4.mo27575ak()) {
                ukc.mo27644a(-100, j);
                ukc.mo27725t();
            }
            ukc a7 = uhn.mo27403a(ujx4, this.f46915b.f47682a);
            if (a7 == null) {
                ujx4.mo27558a(this.f46915b.f47682a, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, false, j);
            } else {
                a7.mo27647a(false, j);
                a7.mo27644a(3, j);
                a7.mo27725t();
            }
            ujx4.mo27619j("owner");
            mo26907a(txu2, ujx4);
            ujx4.mo27627m(true);
            this.f46921g = ujx4.mo27610g();
            return new tzj(uey2.f47394a, uey2.f47396c, mo26913s());
        } catch (uaa e) {
            throw new uac(ukk.m38862a(this.f46915b.f47683b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26888b(txv txv) {
        DriveId driveId = this.f46920f;
        if (driveId != null) {
            try {
                ujx a = txv.f46961a.f49757d.mo27400a(uey.m38255a(this.f46915b), driveId);
                if (a.mo27616i() != null) {
                    this.f46920f = a.mo27610g();
                    return;
                }
                throw new uab(ukk.m38862a(driveId.f30729b));
            } catch (uaa | urd e) {
                throw new uac(driveId);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26908a(uhn uhn, ujx ujx, String str) {
        String i = ujx.mo27616i();
        if (i == null) {
            ujp a = uhn.mo27368a(this.f46915b, str);
            if (a != null) {
                a.mo27726u();
            }
            ujx.mo27585b(str);
        } else if (!i.equals(str)) {
            boolean r = mo26912r();
            StringBuilder sb = new StringBuilder(44);
            sb.append("Inconsistent resourceId, isSingleton = ");
            sb.append(r);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo26884a(txk txk) {
        if (txk.getClass() == getClass() && super.mo26884a(txk)) {
            txl txl = (txl) txk;
            if (!sdg.m34949a(this.f46919e, txl.f46919e) || !sdg.m34949a(this.f46921g, txl.f46921g) || !sdg.m34949a(this.f46920f, txl.f46920f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo26885a(txp txp) {
        if (super.mo26885a(txp) || ((txp instanceof tyr) && txq.m37690a((tyr) txp, this))) {
            return true;
        }
        return false;
    }
}
