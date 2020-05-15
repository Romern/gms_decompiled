package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: tgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgx implements C0038ax {

    /* renamed from: a */
    public final View f45981a;

    /* renamed from: b */
    public final ImageView f45982b;

    /* renamed from: c */
    public final tim f45983c;

    /* renamed from: d */
    private final CardButton f45984d;

    /* renamed from: e */
    private final ViewGroup f45985e;

    /* renamed from: f */
    private final TextView f45986f;

    /* renamed from: g */
    private final tie f45987g;

    public tgx(View view, tie tie, tim tim) {
        this.f45987g = tie;
        this.f45983c = tim;
        this.f45981a = view;
        this.f45984d = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45985e = (ViewGroup) view.findViewById(C0126R.C0129id.location_info);
        this.f45982b = (ImageView) view.findViewById(C0126R.C0129id.location_map_image);
        this.f45986f = (TextView) view.findViewById(C0126R.C0129id.shared_current_location_title);
        view.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0241  */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        bmxv bmxv2;
        boolean z;
        int i;
        bzhw bzhw;
        bzhw bzhw2;
        Intent intent;
        this.f45981a.setVisibility(8);
        if (bmxv.mo66813a()) {
            bzjq bzjq = (bzjq) bmxv.mo66814b();
            bzhw bzhw3 = bzjq.f170329b;
            if (bzhw3 == null) {
                bzhw3 = bzhw.f170123h;
            }
            int a = bzhv.m125809a(bzhw3.f170126b);
            if (a != 0 && a == 2) {
                int i2 = bzhw3.f170125a;
                if (!((i2 & 2) == 0 || (i2 & 4) == 0 || bzhw3.f170130f.isEmpty())) {
                    double d = bzhw3.f170127c;
                    double d2 = bzhw3.f170128d;
                    String str = bzhw3.f170130f;
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    String encode = Uri.encode(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 107);
                    sb.append("geo:");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("?q=");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("(");
                    sb.append(encode);
                    sb.append(")");
                    intent2.setData(Uri.parse(sb.toString()));
                    bmxv2 = bmxv.m108566b(intent2);
                    if (!bzhw3.f170131g.isEmpty()) {
                        this.f45982b.setVisibility(8);
                        z = false;
                    } else {
                        String str2 = bzhw3.f170131g;
                        tie tie = this.f45987g;
                        Uri parse = Uri.parse(str2);
                        if (!"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme())) {
                            if (str2.startsWith("//")) {
                                String valueOf = String.valueOf(str2);
                                str2 = valueOf.length() == 0 ? new String("https:") : "https:".concat(valueOf);
                            } else {
                                String valueOf2 = String.valueOf(str2);
                                str2 = valueOf2.length() == 0 ? new String("https://") : "https://".concat(valueOf2);
                            }
                        }
                        tie.mo26557a(str2, 12, new tgs(this, bmxv2));
                        z = true;
                    }
                    if (bzhw3.f170130f.isEmpty()) {
                        this.f45986f.setVisibility(0);
                        String str3 = bzhw3.f170130f;
                        if (bmxv2.mo66813a()) {
                            this.f45985e.setOnClickListener(new tgt(this, bmxv2));
                        }
                        this.f45985e.setVisibility(0);
                        thb a2 = thb.m36953a();
                        a2.f45998a = str3;
                        a2.f46003f = this.f45981a.getContext().getString(C0126R.string.view_in_maps_content_description, str3);
                        a2.f46001d = C1391tv.m20459b(this.f45981a.getContext(), C0126R.C0127drawable.quantum_gm_ic_person_pin_circle_vd_theme_24);
                        if ((bzhw3.f170125a & 8) != 0) {
                            a2.f45999b = this.f45981a.getContext().getString(C0126R.string.shared_current_location_timestamp, DateUtils.getRelativeTimeSpanString(bzhw3.f170129e, System.currentTimeMillis(), 0, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE).toString());
                        } else {
                            this.f45985e.findViewById(C0126R.C0129id.subtext).setVisibility(8);
                        }
                        a2.mo26506a(this.f45985e);
                        z = true;
                    } else {
                        this.f45986f.setVisibility(8);
                        this.f45985e.setVisibility(8);
                    }
                    i = bzhw3.f170125a;
                    if ((i & 2) == 0 || (i & 4) == 0) {
                        this.f45984d.setVisibility(8);
                    } else {
                        bzhw = bzjq.f170329b;
                        if (bzhw == null) {
                            bzhw = bzhw.f170123h;
                        }
                        double d3 = bzhw.f170127c;
                        bzhw2 = bzjq.f170329b;
                        if (bzhw2 == null) {
                            bzhw2 = bzhw.f170123h;
                        }
                        double d4 = bzhw2.f170128d;
                        StringBuilder sb2 = new StringBuilder(49);
                        sb2.append(d3);
                        sb2.append(",");
                        sb2.append(d4);
                        String sb3 = sb2.toString();
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(String.format("https://maps.google.com/maps?daddr=%s", Uri.encode(sb3))));
                        if (intent.resolveActivity(this.f45981a.getContext().getPackageManager()) == null) {
                            this.f45984d.mo17999a((int) C0126R.string.directions);
                            this.f45984d.mo18002b(C0126R.C0127drawable.quantum_gm_ic_directions_vd_theme_24);
                            this.f45984d.setVisibility(0);
                            this.f45984d.setOnClickListener(new tgu(this, intent));
                        } else {
                            this.f45984d.setVisibility(8);
                        }
                    }
                    if (!z) {
                        this.f45981a.setVisibility(8);
                        return;
                    } else {
                        this.f45981a.setVisibility(0);
                        return;
                    }
                }
            }
            if ((bzhw3.f170125a & 32) != 0) {
                bmxv2 = bmxv.m108566b(tgw.m36950a(bzhw3.f170130f));
            } else {
                bmxv2 = bmvz.f131120a;
            }
            if (!bzhw3.f170131g.isEmpty()) {
            }
            if (bzhw3.f170130f.isEmpty()) {
            }
            i = bzhw3.f170125a;
            if ((i & 2) == 0) {
                bzhw = bzjq.f170329b;
                if (bzhw == null) {
                }
                double d32 = bzhw.f170127c;
                bzhw2 = bzjq.f170329b;
                if (bzhw2 == null) {
                }
                double d42 = bzhw2.f170128d;
                StringBuilder sb22 = new StringBuilder(49);
                sb22.append(d32);
                sb22.append(",");
                sb22.append(d42);
                String sb32 = sb22.toString();
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(String.format("https://maps.google.com/maps?daddr=%s", Uri.encode(sb32))));
                if (intent.resolveActivity(this.f45981a.getContext().getPackageManager()) == null) {
                }
                if (!z) {
                }
            }
            this.f45984d.setVisibility(8);
            if (!z) {
            }
        }
    }
}
