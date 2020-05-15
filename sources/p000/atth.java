package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: atth */
final /* synthetic */ class atth implements aubq {

    /* renamed from: a */
    private final attj f90869a;

    /* renamed from: b */
    private final atsy f90870b;

    /* renamed from: c */
    private final int f90871c;

    public atth(attj attj, atsy atsy, int i) {
        this.f90869a = attj;
        this.f90870b = atsy;
        this.f90871c = i;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int i;
        attj attj = this.f90869a;
        atsy atsy = this.f90870b;
        int i2 = this.f90871c;
        Boolean bool = (Boolean) aucb.mo50386d();
        if (bool == null) {
            attj.mo50178a();
            return;
        }
        boolean booleanValue = bool.booleanValue();
        atgt a = atgt.m75868a(atsy.f90858u);
        if (a.f90321f == atgs.ID) {
            i = C0126R.C0127drawable.tp_id_logo_color_199x129dp;
        } else {
            i = C0126R.C0127drawable.tp_quicpay_logo_inset;
        }
        atqh atqh = new atqh();
        atqh.f90658a = i;
        atqh.f90663f = bpan.CHECK_SECURE_ELEMENT_PROMPT;
        atqh.f90661d = atsy.f90857t;
        atqh.mo50118a(!booleanValue);
        atqh.f90664g = attj.mo50186b((int) C0126R.string.common_continue);
        atqh.f90662e = 13;
        String a2 = a.f90321f.mo49970a(attj.f90898f);
        if (i2 == 2) {
            atqh.f90660c = attj.f90898f.getString(C0126R.string.tp_felica_eligible_legacy_title, new Object[]{a2});
            if (a.f90321f == atgs.ID) {
                atqh.f90659b = attj.f90898f.getString(C0126R.string.tp_id_legacy_message, new Object[]{a2});
            } else {
                atqh.f90659b = attj.f90898f.getString(C0126R.string.tp_felica_legacy_message, new Object[]{a2});
            }
        } else {
            atqh.f90660c = attj.f90898f.getString(C0126R.string.tp_felica_eligible_title, new Object[]{a2});
            atqh.f90659b = attj.f90898f.getString(C0126R.string.tp_felica_eligible_message, new Object[]{a2});
        }
        atqh.mo50117a().show(attj.f90898f.getSupportFragmentManager(), "CheckSEDialogTag");
    }
}
