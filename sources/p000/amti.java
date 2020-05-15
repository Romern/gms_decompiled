package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p002v7.widget.AppCompatTextView;
import android.support.p002v7.widget.SwitchCompat;
import android.support.p002v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;

/* renamed from: amti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amti extends amto {

    /* renamed from: a */
    Account f75897a;

    /* renamed from: b */
    public amud f75898b;

    /* renamed from: c */
    public SwitchCompat f75899c;

    /* renamed from: d */
    public AppCompatTextView f75900d;

    /* renamed from: e */
    public C0034at f75901e;

    /* renamed from: f */
    public int f75902f;

    /* renamed from: h */
    private AccountParticleDisc f75903h;

    /* renamed from: i */
    private ViewGroup f75904i;

    /* renamed from: j */
    private ViewGroup f75905j;

    /* renamed from: k */
    private AppCompatTextView f75906k;

    /* renamed from: l */
    private AppCompatTextView f75907l;

    /* renamed from: m */
    private ViewGroup f75908m;

    /* renamed from: n */
    private ArrayList f75909n;

    /* renamed from: o */
    private C0034at f75910o;

    /* renamed from: p */
    private final View.OnClickListener f75911p = new amsv(this);

    /* renamed from: a */
    private final void m63254a(boolean z) {
        this.f75908m.setVisibility(!z ? 8 : 0);
    }

    /* renamed from: h */
    private final void m63255h() {
        this.f75899c.setEnabled(false);
        this.f75904i.setEnabled(false);
    }

    /* renamed from: b */
    public final int mo41312b() {
        return 5;
    }

    /* renamed from: c */
    public final void mo41329c() {
        Toast.makeText(getContext(), (int) C0126R.string.common_something_went_wrong, 1).show();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amud amud = (amud) adcj.m50162a(getActivity(), mo41332e()).mo3444a(amud.class);
        this.f75898b = amud;
        C0034at b = amud.mo41342b();
        this.f75910o = b;
        b.mo2445a(this, new amsz(this));
        this.f75901e = this.f75898b.mo41344c();
        this.f75903h.mo60576a(((amse) getActivity()).mo41298a(), bddo.class);
        if (bundle == null) {
            if (cfut.m143113b()) {
                mo41333f();
            } else {
                mo41327b(14);
            }
        }
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(getActivity().getThemeResId(), new int[]{16842907});
        this.f75902f = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 2 || i == 1) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (cfus.m143105c()) {
                        new amsu(getActivity()).mo41314a(stringExtra, true, this.f75900d.getVisibility());
                    }
                    amtn amtn = this.f75898b.f75941f;
                    adch adch = new adch();
                    alsl alsl = amtn.f75916a;
                    roz b = rpa.m34196b();
                    b.f43472a = new alst(stringExtra);
                    b.f43473b = new Feature[]{alks.f73599b};
                    aucb b2 = ((rjx) alsl).mo24732b(b.mo24977a());
                    adch.getClass();
                    b2.mo50371a(new amtl(adch));
                    adch.mo2445a(this, new amtd(this, stringExtra, i));
                    super.onActivityResult(i, -1, intent);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.backup_sync_fragment, viewGroup, false);
        this.f75905j = (ViewGroup) inflate.findViewById(C0126R.C0129id.content);
        this.f75903h = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.account_particle_disc);
        this.f75898b = (amud) adcj.m50162a(getActivity(), mo41332e()).mo3444a(amud.class);
        ((deu) getActivity()).mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.toolbar));
        ((deu) getActivity()).mo8628aW().mo15853b(true);
        ((ViewGroup) inflate.findViewById(C0126R.C0129id.account_header_container)).setOnClickListener(new amsx(this));
        this.f75908m = (ViewGroup) inflate.findViewById(C0126R.C0129id.backup_account_container);
        this.f75899c = (SwitchCompat) inflate.findViewById(C0126R.C0129id.backup_sync_toggle);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.backup_sync_toggle_container);
        this.f75904i = viewGroup2;
        viewGroup2.setOnClickListener(this.f75911p);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.help_and_feedback);
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_help_outline_vd_theme_24);
        imageView.setOnClickListener(new amsy(this));
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C0126R.C0129id.contacts_not_backed_up);
        this.f75900d = appCompatTextView;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((int) C0126R.C0127drawable.quantum_gm_ic_info_vd_theme_24, 0, 0, 0);
        this.f75900d.addOnLayoutChangeListener(new amtg(this));
        this.f75907l = (AppCompatTextView) inflate.findViewById(C0126R.C0129id.display_name);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(C0126R.C0129id.account_name);
        this.f75906k = appCompatTextView2;
        appCompatTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, (int) C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24, 0);
        ((ImageView) inflate.findViewById(C0126R.C0129id.super_g)).setImageResource(C0126R.C0127drawable.googleg_standard_color_28_vd);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.information_banner);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C0126R.string.people_backup_sync_information_banner));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(C0126R.string.common_learn_more));
        spannableStringBuilder.setSpan(new amth(this), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f75905j = null;
        this.f75903h = null;
        this.f75899c = null;
        this.f75908m = null;
        this.f75904i = null;
        this.f75906k = null;
        this.f75907l = null;
        this.f75900d = null;
    }

    public final void onResume() {
        super.onResume();
        if (cfut.m143115d()) {
            amud amud = this.f75898b;
            if (!amud.f75940e) {
                this.f75910o.mo2444a(this);
                this.f75910o = this.f75898b.mo41342b();
                this.f75901e.mo2444a(this);
                this.f75901e = this.f75898b.mo41344c();
                this.f75910o.mo2445a(this, new amta(this));
                return;
            }
            amud.f75940e = false;
        }
    }

    /* renamed from: a */
    public final void mo41321a() {
        this.f75899c.setChecked(false);
        m63254a(false);
    }

    /* renamed from: b */
    public final void mo41327b(int i) {
        this.f75917g.mo41350a(i, 5, amup.m63315a(this.f75897a));
    }

    /* renamed from: a */
    public final void mo41322a(int i) {
        if (cfut.m143115d()) {
            this.f75898b.f75940e = true;
        }
        Intent a = amup.m63314a(this.f75897a, getActivity().getResources().getString(C0126R.string.people_select_account_for_backup), this.f75909n);
        mo41327b(4);
        startActivityForResult(a, i);
    }

    /* renamed from: b */
    public final void mo41328b(aucb aucb) {
        this.f75905j.setVisibility(0);
        if (!aucb.mo50384b()) {
            mo41323a(5, aucb);
            this.f75900d.setVisibility(8);
            return;
        }
        int i = ((BackupAndSyncSuggestion) aucb.mo50386d()).f81708a;
        amuh amuh = this.f75917g;
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = 4;
        int i2 = ammm.f75307a | 1;
        ammm.f75307a = i2;
        ammm.f75309c = 1;
        int i3 = i2 | 2;
        ammm.f75307a = i3;
        ammm.f75307a = i3 | 8;
        ammm.f75311e = i;
        amuh.mo41352a(5, (ammm) da.mo74062i(), amup.m63315a(this.f75897a));
        if (i > 0) {
            this.f75900d.setVisibility(0);
            this.f75900d.setText(getContext().getResources().getQuantityString(C0126R.plurals.people_backup_sync_contacts_not_backed_up, i, Integer.valueOf(i)));
            return;
        }
        this.f75900d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo41323a(int i, aucb aucb) {
        int i2;
        amuh amuh = this.f75917g;
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = i - 1;
        ammm.f75307a |= 1;
        if (!aucb.mo50384b()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm2 = (ammm) da.f164949b;
        ammm2.f75309c = i2 - 1;
        ammm2.f75307a |= 2;
        amuh.mo41352a(5, (ammm) da.mo74062i(), amup.m63315a(this.f75897a));
    }

    /* renamed from: a */
    public final void mo41324a(int i, boolean z) {
        this.f75917g.mo41351a(i, 5, amup.m63315a(this.f75897a), z);
    }

    /* renamed from: a */
    public final void mo41325a(aucb aucb) {
        if (!aucb.mo50384b()) {
            Log.e("BackupAndSyncFragment", "Error loading backup state", aucb.mo50387e());
            mo41323a(4, aucb);
            if (cfut.m143116e()) {
                mo41329c();
            }
            m63255h();
            mo41321a();
            this.f75905j.setVisibility(0);
            return;
        }
        int a = amuh.m63297a((BackupAndSyncOptInState) aucb.mo50386d());
        amuh amuh = this.f75917g;
        bxvd da = ammm.f75305f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammm ammm = (ammm) da.f164949b;
        ammm.f75308b = 3;
        int i = ammm.f75307a | 1;
        ammm.f75307a = i;
        ammm.f75309c = 1;
        int i2 = i | 2;
        ammm.f75307a = i2;
        ammm.f75310d = a - 1;
        ammm.f75307a = i2 | 4;
        amuh.mo41352a(5, (ammm) da.mo74062i(), amup.m63315a(this.f75897a));
        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) aucb.mo50386d();
        if (amup.m63319b(backupAndSyncOptInState)) {
            m63255h();
            mo41321a();
            this.f75905j.setVisibility(0);
            return;
        }
        this.f75909n = new ArrayList();
        for (String str : backupAndSyncOptInState.f81707d) {
            this.f75909n.add(amup.m63312a(str));
        }
        boolean a2 = amup.m63317a(backupAndSyncOptInState);
        this.f75899c.setChecked(a2);
        mo41324a(9, a2);
        if (a2) {
            this.f75898b.mo41341a(backupAndSyncOptInState.f81704a).mo2445a(this, new amtb(this));
            if (cfut.m143115d() && !this.f75900d.getText().toString().equals(getResources().getString(C0126R.string.people_backup_sync_will_sync_button))) {
                this.f75900d.setVisibility(8);
                return;
            }
            return;
        }
        this.f75901e.mo2445a(this, new amtc(this));
        mo41321a();
    }

    /* renamed from: a */
    public final void mo41326a(bddo bddo) {
        Account a = amup.m63312a(bddo.mo57896b());
        this.f75897a = a;
        if (a != null) {
            m63254a(true);
            this.f75899c.setChecked(true);
            this.f75903h.mo60577a(bddo);
            this.f75906k.setText(bddo.mo57896b());
            if (TextUtils.isEmpty(bddo.mo57895a())) {
                this.f75907l.setVisibility(8);
            } else {
                this.f75907l.setVisibility(0);
                this.f75907l.setText(bddo.mo57895a());
            }
        }
        this.f75905j.setVisibility(0);
    }
}
