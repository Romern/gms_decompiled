package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* renamed from: asli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asli extends abh {

    /* renamed from: a */
    public final ArrayList f89163a = new ArrayList();

    /* renamed from: d */
    public final ArrayList f89164d = new ArrayList();

    /* renamed from: e */
    public final asku f89165e;

    /* renamed from: f */
    private final asld f89166f;

    /* renamed from: g */
    private final Context f89167g;

    public asli(asld asld, C0013ak akVar, Context context, asku asku) {
        this.f89167g = context;
        this.f89166f = asld;
        this.f89165e = asku;
        asld.f89156c.mo2445a(akVar, new asle(this));
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f89163a.size() + this.f89164d.size() + 1;
    }

    /* renamed from: c */
    public final int mo49225c() {
        return this.f89163a.size();
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return i == mo49225c() ? 1 : 2;
    }

    /* renamed from: a */
    public final int mo49224a(asly asly) {
        if (this.f89163a.contains(asly)) {
            return this.f89163a.indexOf(asly);
        }
        if (this.f89164d.contains(asly)) {
            return this.f89163a.size() + this.f89164d.indexOf(asly) + 1;
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        int i2;
        if (i != 2) {
            i2 = C0126R.C0128layout.tp_tap_diagnostics_list_section_title_item;
        } else {
            i2 = C0126R.C0128layout.tp_tap_diagnostics_list_item;
        }
        return new acm(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        asly asly;
        aslz aslz;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num;
        int i9 = 8;
        if (i == mo49225c()) {
            View view = acm.f201a;
            if (!this.f89164d.isEmpty() && !this.f89163a.isEmpty()) {
                i9 = 0;
            }
            ((TextView) view.findViewById(C0126R.C0129id.DiagnosticsSectionTitle)).setVisibility(i9);
            view.findViewById(C0126R.C0129id.DiagnosticsSectionDivider).setVisibility(i9);
        } else if (i < mo161a()) {
            View view2 = acm.f201a;
            asld asld = this.f89166f;
            if (i == mo49225c() || i >= mo161a()) {
                asly = asly.UNKNOWN;
            } else if (i < this.f89163a.size()) {
                asly = (asly) this.f89163a.get(i);
            } else {
                asly = (asly) this.f89164d.get((i - this.f89163a.size()) - 1);
            }
            C0034at atVar = (C0034at) asld.f89157d.get(asly);
            if (atVar != null) {
                aslx aslx = (aslx) atVar.mo2448b();
                aslw aslw = new aslw();
                aslw.f89192a = asly;
                aslw.f89193b = aslx;
                asly asly2 = asly.UNKNOWN;
                int ordinal = asly.ordinal();
                if (ordinal == 1) {
                    aslw.mo49229a(C0126R.C0127drawable.quantum_gm_ic_contactless_grey600_24);
                    if (aslx == aslx.INCORRECT) {
                        i3 = C0126R.string.tp_enable_nfc_positive_button;
                    } else {
                        i3 = C0126R.string.tp_tap_diagnostics_item_nfc_enabled_title;
                    }
                    aslw.mo49230b(i3);
                    aslw.f89194c = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_nfc_subtitle);
                    aslw.f89196e = Integer.valueOf((int) C0126R.string.tp_enable_nfc_positive_button);
                    aslz = aslw.mo49228a();
                } else if (ordinal == 2) {
                    aslw.mo49229a(C0126R.C0127drawable.quantum_ic_favorite_border_grey600_24);
                    if (aslx == aslx.INCORRECT) {
                        i4 = C0126R.string.tp_tap_diagnostics_item_default_service_unset_title;
                    } else {
                        i4 = C0126R.string.tp_tap_diagnostics_item_default_service_set_title;
                    }
                    aslw.mo49230b(i4);
                    if (aslx == aslx.INCORRECT) {
                        i5 = C0126R.string.tp_tap_diagnostics_item_default_service_unset_subtitle;
                    } else {
                        i5 = C0126R.string.tp_tap_diagnostics_item_default_service_set_subtitle;
                    }
                    aslw.f89194c = Integer.valueOf(i5);
                    aslw.f89196e = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_default_service_cta);
                    aslz = aslw.mo49228a();
                } else if (ordinal == 3) {
                    aslw.mo49229a(C0126R.C0127drawable.quantum_ic_lock_grey600_24);
                    if (aslx == aslx.INCORRECT) {
                        i6 = C0126R.string.tp_tap_diagnostics_item_device_lock_unset_title;
                    } else {
                        i6 = C0126R.string.tp_tap_diagnostics_item_device_lock_set_title;
                    }
                    aslw.mo49230b(i6);
                    aslw.f89194c = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_device_lock_subtitle);
                    aslw.f89196e = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_device_lock_cta);
                    aslz = aslw.mo49228a();
                } else if (ordinal == 4) {
                    aslw.mo49229a(C0126R.C0127drawable.quantum_ic_credit_card_grey600_24);
                    if (aslx == aslx.INCORRECT) {
                        i7 = C0126R.string.tp_tap_diagnostics_item_tokenized_fop_missing_title;
                    } else {
                        i7 = C0126R.string.tp_tap_diagnostics_item_tokenized_fop_existing_title;
                    }
                    aslw.mo49230b(i7);
                    if (aslx == aslx.INCORRECT) {
                        i8 = C0126R.string.tp_tap_diagnostics_item_tokenized_fop_missing_subtitle;
                    } else {
                        i8 = C0126R.string.tp_tap_diagnostics_item_tokenized_fop_existing_subtitle;
                    }
                    aslw.f89194c = Integer.valueOf(i8);
                    aslw.f89196e = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_tokenized_fop_cta);
                    aslz = aslw.mo49228a();
                } else if (ordinal == 5) {
                    aslw.mo49229a(C0126R.C0127drawable.quantum_ic_verified_user_grey600_24);
                    aslw.mo49230b(aslx == aslx.INCORRECT ? C0126R.string.tp_tap_diagnostics_item_attestation_failing_title : C0126R.string.tp_tap_diagnostics_item_attestation_passing_title);
                    if (aslx == aslx.INCORRECT) {
                        num = Integer.valueOf((int) C0126R.string.tp_tap_diagnostics_item_attestation_failing_subtitle);
                    } else {
                        num = null;
                    }
                    aslw.f89194c = num;
                    aslw.f89195d = new Intent("android.intent.action.VIEW").setData(Uri.parse(cgww.m147416c()));
                    aslz = aslw.mo49228a();
                } else {
                    String valueOf = String.valueOf(asly);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("unknown diagnostics item type: ");
                    sb.append(valueOf);
                    throw new AssertionError(sb.toString());
                }
                ((ImageView) view2.findViewById(C0126R.C0129id.DiagnosticsItemIcon)).setImageResource(aslz.f89212c);
                ((TextView) view2.findViewById(C0126R.C0129id.DiagnosticsItemTitleText)).setText(this.f89167g.getString(aslz.f89213d));
                TextView textView = (TextView) view2.findViewById(C0126R.C0129id.DiagnosticsItemSubtitleText);
                if (aslz.f89214e == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    String string = this.f89167g.getString(aslz.f89214e.intValue());
                    Intent intent = aslz.f89215f;
                    if (intent == null) {
                        textView.setText(string);
                    } else {
                        atyg.m76550a(this.f89167g, textView, string, intent);
                    }
                }
                ViewSwitcher viewSwitcher = (ViewSwitcher) view2.findViewById(C0126R.C0129id.DiagnosticsItemStatusViewSwitcher);
                MaterialButton materialButton = (MaterialButton) view2.findViewById(C0126R.C0129id.DiagnosticsItemCtaButton);
                materialButton.setVisibility(8);
                materialButton.setOnClickListener(null);
                if (aslz.f89211b == aslx.INCORRECT) {
                    viewSwitcher.setVisibility(4);
                    if (aslz.f89216g != null) {
                        materialButton.setVisibility(0);
                        materialButton.setText(this.f89167g.getString(aslz.f89216g.intValue()));
                        materialButton.setOnClickListener(new aslh(this, aslz));
                        return;
                    }
                    return;
                }
                viewSwitcher.setVisibility(0);
                if (aslz.f89211b == aslx.LOADING) {
                    i2 = C0126R.C0129id.DiagnosticsItemStatusSpinner;
                } else {
                    i2 = C0126R.C0129id.DiagnosticsItemStatusIcon;
                }
                viewSwitcher.setDisplayedChild(viewSwitcher.indexOfChild(view2.findViewById(i2)));
                return;
            }
            String valueOf2 = String.valueOf(asly);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
            sb2.append("unknown diagnostics item type: ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
