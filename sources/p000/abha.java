package p000;

import android.os.SystemClock;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abha extends aaru {

    /* renamed from: e */
    private final HelpChimeraActivity f57462e;

    /* renamed from: f */
    private final HelpConfig f57463f;

    /* renamed from: g */
    private final abcr f57464g;

    public abha(HelpChimeraActivity helpChimeraActivity) {
        super(helpChimeraActivity);
        this.f57462e = helpChimeraActivity;
        this.f57463f = helpChimeraActivity.f56986y;
        this.f57464g = helpChimeraActivity.f56987z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, long):long
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        int i;
        int i2;
        bzra bzra = (bzra) obj;
        HelpChimeraActivity helpChimeraActivity = this.f57462e;
        aavc aavc = helpChimeraActivity.f78959f;
        abha x = helpChimeraActivity.mo43362x();
        long ax = ceeg.f182447a.mo6606a().mo79004ax();
        aavc.f56638b = x;
        long uptimeMillis = SystemClock.uptimeMillis() + ax;
        aavc.f56637a = uptimeMillis;
        aavc.postAtTime(aavc.f56640d, uptimeMillis);
        if (bzra != null) {
            bxvd bxvd = (bxvd) bzra.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bzra);
            aarp aarp = helpChimeraActivity.f78967n;
            if (aarp.mo31699a("should_contact_card_show_chat_available", false)) {
                int a = bzrc.m126061a(((bzra) bxvd.f164949b).f171100b);
                if (a == 0) {
                    a = 1;
                }
                if (a == 3 || a == 4) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bzra bzra2 = (bzra) bxvd.f164949b;
                    bzra2.f171100b = 1;
                    bzra2.f171099a |= 1;
                }
                aawg.m47120h(aarp);
            }
            helpChimeraActivity.f56986y.f78836k = (bzra) bxvd.mo74062i();
            aazc aazc = helpChimeraActivity.f78963j;
            if (!aazc.f56870c.mo43210E()) {
                ContactOptionsContainer h = aazc.mo31935h();
                if (h.f78853b != null) {
                    if (h.f78857f.mo43238m()) {
                        aauw aauw = h.f78853b;
                        TextView b = aauw.mo31815b();
                        if (b != null) {
                            aauw.m47054a(b, aauw.f56631a.getResources().getString(C0126R.string.gh_chat_contact_card_waiting));
                            if (aayi.m47270b()) {
                                i = aayi.m47263a(aauw.f56631a.getContext(), C0126R.attr.gh_primaryBlueColor);
                            } else {
                                i = C1133kh.m17843b(aauw.f56631a.getContext(), C0126R.color.material_blue_grey_500);
                            }
                            b.setTextColor(i);
                        }
                    } else if (!h.f78857f.mo43239n()) {
                        h.f78853b.mo31814a();
                    } else {
                        aauw aauw2 = h.f78853b;
                        TextView b2 = aauw2.mo31815b();
                        if (b2 != null) {
                            aauw.m47054a(b2, aauw2.f56631a.getResources().getString(C0126R.string.gh_contact_option_in_progress));
                            if (aayi.m47270b()) {
                                i2 = aayi.m47263a(aauw2.f56631a.getContext(), C0126R.attr.gh_primaryBlueColor);
                            } else {
                                i2 = C1133kh.m17843b(aauw2.f56631a.getContext(), C0126R.color.google_blue500);
                            }
                            b2.setTextColor(i2);
                        }
                    }
                }
            }
            HelpConfig helpConfig = helpChimeraActivity.f56986y;
            if (helpConfig.f78837l == 3 && !helpConfig.mo43236k()) {
                helpChimeraActivity.mo43331a(58, bzps.CHAT);
            }
        }
        if (helpChimeraActivity.mo43359u()) {
            helpChimeraActivity.mo43360v();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (ssk.m36235a(this.f57462e)) {
            return aava.m47057a(this.f57462e, this.f57463f, this.f57464g);
        }
        return null;
    }
}
