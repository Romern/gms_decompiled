package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.AppCompatTextView;
import android.support.p002v7.widget.SwitchCompat;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: amsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsq extends amto implements amuf {

    /* renamed from: a */
    Account f75863a;

    /* renamed from: b */
    public amud f75864b;

    /* renamed from: c */
    public AccountParticleDisc f75865c;

    /* renamed from: d */
    public SwitchCompat f75866d;

    /* renamed from: e */
    private final CompoundButton.OnCheckedChangeListener f75867e = new amsi(this);

    /* renamed from: f */
    private sex f75868f;

    /* renamed from: h */
    private ViewGroup f75869h;

    /* renamed from: i */
    private final C0038ax f75870i = new amsj(this);

    /* renamed from: j */
    private boolean f75871j;

    /* renamed from: b */
    private final void m63237b(boolean z) {
        this.f75866d.setEnabled(z);
        this.f75869h.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo41308a() {
        ContentResolver.setMasterSyncAutomatically(true);
        ContentResolver.setSyncAutomatically(this.f75863a, "com.android.contacts", true);
        mo41311a(false);
        mo41309a(17);
    }

    /* renamed from: b */
    public final int mo41312b() {
        return 4;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amud amud = (amud) adcj.m50162a(getActivity(), mo41332e()).mo3444a(amud.class);
        this.f75864b = amud;
        amud.mo41340a().mo2445a(this, this.f75870i);
        this.f75865c.mo60576a(((amse) getActivity()).mo41298a(), bddo.class);
        if (bundle != null) {
            return;
        }
        if (cfut.m143113b()) {
            mo41333f();
        } else {
            mo41309a(14);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!stm.m36302d(stringExtra)) {
                    mo41309a(5);
                    this.f75864b.mo41345c(stringExtra);
                }
            }
            super.onActivityResult(i, -1, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f75868f = sex.m35104a(getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75871j = cfuw.f185754a.mo6606a().mo82756a();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.account_sync_fragment, viewGroup, false);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.account_particle_disc);
        this.f75865c = accountParticleDisc;
        accountParticleDisc.setOnClickListener(new amsk(this));
        amup.m63316a(getString(C0126R.string.common_account_spinner_a11y_tap_action), this.f75865c);
        ((deu) getActivity()).mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.toolbar));
        ((deu) getActivity()).mo8628aW().mo15853b(true);
        this.f75866d = (SwitchCompat) inflate.findViewById(C0126R.C0129id.auto_sync_toggle);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.auto_sync_toggle_container);
        this.f75869h = viewGroup2;
        if (!this.f75871j) {
            viewGroup2.setOnClickListener(new amsl(this));
            m63237b(false);
        }
        int i = Build.VERSION.SDK_INT;
        sex sex = this.f75868f;
        if (!(sex == null || sex.mo25437a(amxa.m63596a()) == null)) {
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C0126R.C0129id.manage_notification_row);
            viewGroup3.setVisibility(0);
            viewGroup3.setOnClickListener(new amsm(this));
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.help_and_feedback);
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new amsn(this));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f75865c = null;
        this.f75866d = null;
        this.f75869h = null;
    }

    public final void onResume() {
        super.onResume();
        if (this.f75863a != null) {
            mo41311a(false);
        }
    }

    /* renamed from: a */
    public final void mo41309a(int i) {
        this.f75917g.mo41350a(i, 4, amup.m63315a(this.f75863a));
    }

    /* renamed from: a */
    public final void mo41310a(int i, boolean z) {
        this.f75917g.mo41351a(i, 4, amup.m63315a(this.f75863a), z);
    }

    /* renamed from: a */
    public final void mo41311a(boolean z) {
        if (this.f75871j) {
            boolean masterSyncAutomatically = ContentResolver.getMasterSyncAutomatically();
            int isSyncable = ContentResolver.getIsSyncable(this.f75863a, "com.android.contacts");
            if (!masterSyncAutomatically || isSyncable <= 0) {
                if (!masterSyncAutomatically) {
                    m63237b(true);
                    getView().findViewById(C0126R.C0129id.auto_sync_description).setVisibility(8);
                    this.f75869h.setOnClickListener(new amso(this));
                } else {
                    m63237b(false);
                }
                this.f75866d.setOnCheckedChangeListener(null);
                this.f75866d.setChecked(false);
                if (!z) {
                    return;
                }
                if (cfvc.f185760a.mo6606a().mo82760a()) {
                    amuh amuh = this.f75917g;
                    String a = amup.m63315a(this.f75863a);
                    almk almk = amuh.f75945a;
                    bxvd da = ammn.f75312h.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammn ammn = (ammn) da.f164949b;
                    ammn.f75315b = 15;
                    int i = ammn.f75314a | 1;
                    ammn.f75314a = i;
                    int i2 = 3;
                    ammn.f75317d = 3;
                    ammn.f75314a = i | 4;
                    bxvd da2 = amml.f75300d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    amml amml = (amml) da2.f164949b;
                    int i3 = 1 | amml.f75302a;
                    amml.f75302a = i3;
                    amml.f75303b = masterSyncAutomatically;
                    if (isSyncable < 0) {
                        i2 = 2;
                    } else if (isSyncable != 0) {
                        i2 = 4;
                    }
                    amml.f75304c = i2 - 1;
                    amml.f75302a = 2 | i3;
                    amml amml2 = (amml) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammn ammn2 = (ammn) da.f164949b;
                    amml2.getClass();
                    ammn2.f75320g = amml2;
                    ammn2.f75314a |= 32;
                    almk.mo40519a((ammn) da.mo74062i(), a);
                    return;
                }
                mo41309a(16);
                return;
            }
        } else {
            if (!ContentResolver.getMasterSyncAutomatically()) {
                ((AppCompatTextView) getView().findViewById(C0126R.C0129id.auto_sync_description)).setText((int) C0126R.string.people_contacts_sync_global_automatic_sync_off);
            }
            if (!ContentResolver.getMasterSyncAutomatically() || ContentResolver.getIsSyncable(this.f75863a, "com.android.contacts") <= 0) {
                this.f75866d.setOnCheckedChangeListener(null);
                this.f75866d.setChecked(false);
                m63237b(false);
                if (z) {
                    mo41309a(16);
                    return;
                }
                return;
            }
        }
        m63237b(true);
        if (this.f75871j) {
            getView().findViewById(C0126R.C0129id.auto_sync_description).setVisibility(0);
            this.f75869h.setOnClickListener(new amsp(this));
        }
        ((AppCompatTextView) getView().findViewById(C0126R.C0129id.auto_sync_description)).setText((int) C0126R.string.people_contacts_sync_automatic_sync_description);
        this.f75866d.setOnCheckedChangeListener(null);
        boolean syncAutomatically = ContentResolver.getSyncAutomatically(this.f75863a, "com.android.contacts");
        this.f75866d.setChecked(syncAutomatically);
        if (z) {
            mo41310a(7, syncAutomatically);
        }
        this.f75866d.setOnCheckedChangeListener(this.f75867e);
    }
}
