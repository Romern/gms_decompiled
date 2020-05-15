package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: amub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amub extends amto {

    /* renamed from: a */
    Account f75930a;

    /* renamed from: b */
    public amud f75931b;

    /* renamed from: c */
    public AccountParticleDisc f75932c;

    /* renamed from: d */
    private final C0038ax f75933d = new amtu(this);

    /* renamed from: e */
    private amun f75934e;

    /* renamed from: f */
    private C0034at f75935f;

    /* renamed from: h */
    private C0034at f75936h;

    /* renamed from: a */
    public final void mo41338a(int i) {
        this.f75917g.mo41350a(i, 3, amup.m63315a(this.f75930a));
    }

    /* renamed from: b */
    public final int mo41312b() {
        return 3;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amud amud = (amud) adcj.m50162a(getActivity(), mo41332e()).mo3444a(amud.class);
        this.f75931b = amud;
        C0034at a = amud.mo41340a();
        this.f75936h = a;
        a.mo2445a(this, this.f75933d);
        this.f75932c.mo60576a(((amse) getActivity()).mo41298a(), bddo.class);
        C0034at b = this.f75931b.mo41342b();
        this.f75935f = b;
        b.mo2445a(this, new amtz(this));
        if (bundle != null) {
            return;
        }
        if (cfut.m143113b()) {
            mo41333f();
        } else {
            mo41338a(14);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!stm.m36302d(stringExtra)) {
                    mo41338a(5);
                    this.f75931b.mo41345c(stringExtra);
                }
            }
            super.onActivityResult(i, -1, intent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amun.a(int, android.view.View$OnClickListener):void
     arg types: [int, amtx]
     candidates:
      amun.a(android.view.ViewGroup, int):acm
      amun.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      amun.a(int, android.view.View$OnClickListener):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amun.a(int, android.view.View$OnClickListener):void
     arg types: [int, amty]
     candidates:
      amun.a(android.view.ViewGroup, int):acm
      amun.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      amun.a(int, android.view.View$OnClickListener):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.contacts_sync_core_fragment, viewGroup, false);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.account_particle_disc);
        this.f75932c = accountParticleDisc;
        accountParticleDisc.setOnClickListener(new amtv(this));
        amup.m63316a(getString(C0126R.string.common_account_spinner_a11y_tap_action), this.f75932c);
        ((deu) getActivity()).mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.toolbar));
        ((deu) getActivity()).mo8628aW().mo15853b(true);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.help_and_feedback);
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new amtw(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
        amun amun = new amun(getContext().getResources(), bnkn.m109665a(1, 2));
        this.f75934e = amun;
        amun.mo41355a(1, (View.OnClickListener) new amtx(this));
        this.f75934e.mo41355a(2, (View.OnClickListener) new amty(this));
        recyclerView.setAdapter(this.f75934e);
        getActivity();
        recyclerView.setLayoutManager(new aah());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f75932c = null;
        this.f75934e = null;
        this.f75935f.mo2444a(this);
        this.f75935f = null;
        this.f75936h.mo2444a(this);
        this.f75936h = null;
    }

    public final void onResume() {
        super.onResume();
        if (cfut.m143115d()) {
            this.f75935f.mo2444a(this);
            C0034at b = this.f75931b.mo41342b();
            this.f75935f = b;
            b.mo2445a(this, new amua(this));
        }
    }

    /* renamed from: a */
    public final void mo41339a(aucb aucb) {
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = 3;
        ammm.f75307a |= 1;
        if (aucb.mo50384b()) {
            this.f75934e.f75961a = (BackupAndSyncOptInState) aucb.mo50386d();
            this.f75934e.mo171aJ();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammm ammm2 = (ammm) da.f164949b;
            ammm2.f75309c = 1;
            ammm2.f75307a = 2 | ammm2.f75307a;
            int a = amuh.m63297a((BackupAndSyncOptInState) aucb.mo50386d());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammm ammm3 = (ammm) da.f164949b;
            ammm3.f75310d = a - 1;
            ammm3.f75307a |= 4;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammm ammm4 = (ammm) da.f164949b;
            ammm4.f75309c = 2;
            ammm4.f75307a |= 2;
        }
        this.f75917g.mo41352a(3, (ammm) da.mo74062i(), amup.m63315a(this.f75930a));
    }
}
