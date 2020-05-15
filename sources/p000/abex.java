package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abex extends aaru {

    /* renamed from: e */
    private final Context f57316e;

    /* renamed from: f */
    private final String f57317f;

    /* renamed from: g */
    private final abew f57318g;

    /* renamed from: h */
    private final HelpConfig f57319h;

    /* renamed from: i */
    private final aaxx f57320i;

    /* renamed from: j */
    private boolean f57321j;

    public abex(HelpChimeraActivity helpChimeraActivity, String str, abew abew) {
        super(helpChimeraActivity);
        this.f57316e = helpChimeraActivity;
        this.f57317f = str;
        this.f57318g = abew;
        this.f57319h = helpChimeraActivity.f56986y;
        this.f57320i = helpChimeraActivity.f78965l;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(int, bzps):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(bzpv, int):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void
     arg types: [?[OBJECT, ARRAY], aasg, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(abey, java.lang.CharSequence, wzh):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        aasm aasm;
        int i;
        int i2;
        abey abey = (abey) obj;
        abew abew = this.f57318g;
        boolean z = this.f57321j;
        aazc aazc = (aazc) abew;
        boolean z2 = true;
        aazc.f56869b.f78970q = true;
        if (abey.mo32060d()) {
            return;
        }
        if (aazc.f56870c.mo43207B()) {
            wzh wzh = new wzh(aazc.f56870c.f78819S);
            wzh.mo29584c();
            aazc.f56869b.mo43334a(abey, aazc.f56870c.f78821U, wzh);
            aazc.mo31928b(abey);
        } else if (!ssk.m36235a(aazc.f56869b) || (abey.mo32061e() && z)) {
            if (abey.mo32061e()) {
                if (aazc.f56870c.mo43248w()) {
                    abey = abey.m47590a(aazc.f56870c.mo43250x());
                    aazc.mo31930c(abey);
                    if (!aazc.f56870c.mo43252z()) {
                        if (z2) {
                            aasm = aasm.m46882a(aazc.f56870c.f78815O, aasw.m46952a(), aazc.f56870c);
                        } else {
                            aasm = null;
                        }
                        if (aasm == null || !abey.f57323b.containsKey(aasm.f56492b)) {
                            aazc.mo31933f();
                        } else {
                            HelpConfig helpConfig = aazc.f56870c;
                            aazc.f56869b.mo43333a((aasm) null, aasg.m46857a((aasm) abey.f57323b.get(aasm.f56492b), helpConfig.f78825Y, helpConfig.f78816P, helpConfig.f78817Q, helpConfig.f78818R), false);
                        }
                    } else if (aazc.f56869b.f78969p) {
                        aazc.mo31929c();
                        aazc.f56869b.mo43325K();
                    }
                    aazc.f56869b.supportInvalidateOptionsMenu();
                }
                abcx.m47516d(aazc.f56869b);
            }
            z2 = false;
            aazc.mo31930c(abey);
            if (!aazc.f56870c.mo43252z()) {
            }
            aazc.f56869b.supportInvalidateOptionsMenu();
        } else if (!abey.mo32061e()) {
            aazc.mo31928b(abey);
            aazc.mo31930c(abey);
            if (aazc.f56870c.mo43252z()) {
                aazc.mo31932e();
            } else if (aazc.f56869b.f78969p) {
                aazc.mo31929c();
                aazc.f56869b.mo43325K();
                if (aazc.f56870c.mo43206A()) {
                    if (!z) {
                        HelpChimeraActivity helpChimeraActivity = aazc.f56869b;
                        HelpConfig helpConfig2 = aazc.f56870c;
                        if (!helpConfig2.f78820T) {
                            i2 = 5;
                        } else {
                            i2 = 4;
                        }
                        wzh wzh2 = new wzh(helpConfig2.f78819S);
                        wzh2.mo29584c();
                        aazc.mo31926a(helpChimeraActivity, i2, wzh2.mo29582a());
                    } else {
                        HelpChimeraActivity helpChimeraActivity2 = aazc.f56869b;
                        HelpConfig helpConfig3 = aazc.f56870c;
                        if (!helpConfig3.f78820T) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        wzh wzh3 = new wzh(helpConfig3.f78819S);
                        wzh3.mo29584c();
                        aazc.mo31926a(helpChimeraActivity2, i, wzh3.mo29582a());
                    }
                }
                aazc.f56869b.supportInvalidateOptionsMenu();
            }
        } else {
            HelpChimeraActivity helpChimeraActivity3 = aazc.f56869b;
            if (!helpChimeraActivity3.f78968o) {
                helpChimeraActivity3.mo43339a(true, true);
            }
            aazc.f56869b.f78970q = false;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (aaya.m47229b(ceiz.f182740a.mo6606a().mo79187c()) && this.f57319h.mo43207B() && !ssk.m36235a(this.f57316e)) {
            return abey.m47588a(16, this.f57316e);
        }
        aask b = GoogleHelpChimeraService.m66616b(GoogleHelpChimeraService.m66618c(this.f57319h));
        boolean z = true;
        if (b != null && !b.f56461d) {
            z = false;
        }
        this.f57321j = z;
        abey a = this.f57320i.mo31881a(this.f57316e, abfc.m47607a(this.f57317f, this.f57319h.f78821U), 16, this.f57319h.f78827b);
        if (cefk.m136719b() && this.f57321j && a.mo32061e()) {
            a = this.f57320i.mo31881a(this.f57316e, aasm.m46904y(), MfiClientException.TYPE_MFICLIENT_NOT_STARTED, this.f57319h.f78827b);
        }
        if (!this.f57319h.mo43207B()) {
            return a;
        }
        HelpConfig helpConfig = this.f57319h;
        this.f57320i.mo31889a(abfc.m47607a(helpConfig.f78828c, helpConfig.f78821U), this.f57319h.f78827b);
        return a;
    }
}
