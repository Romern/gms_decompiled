package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: amxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxu extends amxi {

    /* renamed from: g */
    private final amvm f76362g;

    /* renamed from: h */
    private final amyn f76363h;

    public amxu(amyo amyo, amwt amwt, amvt amvt, anaz anaz, amvm amvm, amyn amyn, amye amye) {
        super(ammz.UPDATE, amyo, amvt, anaz, amwt, amye);
        this.f76362g = amvm;
        this.f76363h = amyn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amyo.a(anad, boolean):void
     arg types: [anad, int]
     candidates:
      amyo.a(amvp, amvp):void
      amyo.a(anad, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amxu.a(amvp, boolean):void
     arg types: [amvp, int]
     candidates:
      amxi.a(amvp, amvp):void
      amxu.a(amvp, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r0.f189236a.f189233s == p000.chus.INVALID_ARGUMENT) goto L_0x0059;
     */
    /* renamed from: a */
    private final void m63699a(amvp amvp, boolean z) {
        bler bler;
        amvw a;
        try {
            mo41527a(this.f76279e.mo41503a(amwv.m63574a(amvp), amvp.f76092a), amvp);
        } catch (chuw e) {
            if (z) {
                amye amye = this.f76280f;
                alvf alvf = alvf.UPDATE;
                chuv chuv = e.f189236a;
                if (amye.mo41556a(alvf, chuv.f189233s.f189211r, chuv.f189234t) != 3 && (e.f189236a.f189233s != chus.FAILED_PRECONDITION || !e.getMessage().contains("FingerprintMismatch"))) {
                    amig.m62939a();
                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82921L()).booleanValue()) {
                    }
                }
                Log.w("FSA2_UpdateContactUpSyncer", "Error when update contact to server, doing getContact() now...");
                amwt amwt = this.f76279e;
                String str = amvp.f76092a;
                btcz b = amwt.mo41507b(anaw.m63872a(str));
                amwt.f76216d.mo41626a();
                btdb a2 = amwt.f76214b.mo41249a(amwt.f76213a, b);
                amwt.f76216d.mo41628a("FSA_getPerson", 1, amwy.m63594a(a2));
                if (a2 != null) {
                    if (a2.f148372a.size() > 0) {
                        btec btec = (btec) a2.f148372a.get(0);
                        bynx bynx = btec.f148493b;
                        if (bynx == null || bynx.f167145a != chus.OK.f189211r || (bler = btec.f148492a) == null) {
                            amdk.m62659b("FSA2_ContactSyncGrpc", "Failed to getPerson: %s", a2.toString());
                            throw new amxy(3);
                        }
                        amvp a3 = amww.m63581a(bler, str);
                        if (a3 != null) {
                            String str2 = amvp.f76092a;
                            this.f76276b.mo41567a(new anad(a3, amvp), true);
                            this.f76277c.mo41451b();
                            amig.m62939a();
                            Long valueOf = Long.valueOf(cfvk.f185780a.mo6606a().mo83017br());
                            if (valueOf.longValue() > 0) {
                                try {
                                    this.f76362g.mo41389a();
                                    Thread.sleep(valueOf.longValue());
                                    this.f76362g.mo41389a();
                                } catch (InterruptedException e2) {
                                    amig.m62939a();
                                    if (((Boolean) amid.f74932a.mo41191a()).booleanValue()) {
                                        this.f76278d.mo41632a(amjf.CONTACT, ammz.UPDATE, "InterruptedException_MergeApiContactToLocal", e2);
                                    }
                                    ((anbh) this.f76278d).f76541a.stats.numIoExceptions++;
                                    return;
                                }
                            }
                            amyn amyn = this.f76363h;
                            String[] strArr = {amvp.f76092a};
                            ContentResolver contentResolver = amyn.f76380a;
                            Account account = amyn.f76381b;
                            bnic bnic = amyn.f76392e;
                            String[] strArr2 = amvt.f76137a;
                            a = amvw.m63489a(contentResolver, account, bnic, "sourceid=?", strArr);
                            ArrayList arrayList = new ArrayList();
                            amig.m62939a();
                            int intValue = ((Integer) amhw.f74925a.mo41191a()).intValue();
                            int i = 0;
                            while (true) {
                                amvp a4 = a.mo41464b();
                                if (a4 != null) {
                                    if (i >= intValue) {
                                        break;
                                    }
                                    amyn.f76382c.mo41389a();
                                    if (a4.f76099h || !amyn.m63729a(a4)) {
                                        arrayList.add(a4);
                                        i++;
                                    }
                                } else {
                                    break;
                                }
                            }
                            amyn.mo41560a(amvt.m63471a(ContactsContract.RawContacts.CONTENT_URI, amyn.f76381b), "data_set IS NULL");
                            amvp amvp2 = arrayList.size() > 0 ? (amvp) arrayList.get(0) : null;
                            a.mo41472f();
                            if (amvp2 != null) {
                                m63699a(amvp2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                Log.e("FSA2_ContactSyncGrpc", "Unexpected null result returned by getPeople API");
                throw new amxy(3);
            }
            throw e;
        } catch (Exception e3) {
            this.f76278d.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 1, 1);
            this.f76278d.mo41636a(ammz.UPDATE, amjf.CONTACT, true, 2, 1);
            throw e3;
        } catch (Throwable th) {
            a.mo41472f();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41530b(amvp amvp) {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amxu.a(amvp, boolean):void
     arg types: [amvp, int]
     candidates:
      amxi.a(amvp, amvp):void
      amxu.a(amvp, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41531c(amvp amvp) {
        m63699a(amvp, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo41532d(amvp amvp) {
        mo41527a(this.f76279e.mo41503a(amwv.m63579b(amvp), amvp.f76092a), amvp);
    }
}
