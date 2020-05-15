package com.google.android.gms.wallet.p088ui.component.alert;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LinkView;

/* renamed from: com.google.android.gms.wallet.ui.component.alert.AlertMessageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertMessageView extends LinearLayout implements View.OnClickListener, bjwh {

    /* renamed from: a */
    View f110485a;

    /* renamed from: b */
    ImageWithCaptionView f110486b;

    /* renamed from: c */
    InfoMessageView f110487c;

    /* renamed from: d */
    ViewGroup f110488d;

    /* renamed from: e */
    LinkView f110489e;

    /* renamed from: f */
    public Button f110490f;

    /* renamed from: g */
    public bkbn f110491g;

    /* renamed from: h */
    public bjwk f110492h;

    /* renamed from: i */
    private ViewGroup f110493i;

    /* renamed from: j */
    private bkdb f110494j;

    /* renamed from: k */
    private bwhs f110495k;

    public AlertMessageView(Context context) {
        super(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m94218a(bwhs bwhs, int i, LayoutInflater layoutInflater, bjxv bjxv) {
        bwhm bwhm;
        ColorStateList d = i == getContext().getResources().getColor(17170443) ? bkfr.m105605d(getContext()) : bkfr.m105587b(i);
        ImageWithCaptionView imageWithCaptionView = this.f110486b;
        bmno bmno = bwhs.f159559f;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        imageWithCaptionView.mo71991a(bmno);
        this.f110486b.f152075m = d;
        InfoMessageView infoMessageView = this.f110487c;
        bmnr bmnr = bwhs.f159555b;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72006b(bmnr);
        this.f110487c.setId(bjxv.mo65614a());
        if ((bwhs.f159554a & 16) != 0) {
            bwhm bwhm2 = bwhs.f159557d;
            if (bwhm2 == null) {
                bwhm2 = bwhm.f159522h;
            }
            int a = bwhl.m121966a(bwhm2.f159529f);
            if (a == 0 || a == 1) {
                bxvd bxvd = (bxvd) bwhm2.mo74142c(5);
                bxvd.mo73625a((bxvk) bwhm2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwhm bwhm3 = (bwhm) bxvd.f164949b;
                bwhm3.f159529f = 2;
                bwhm3.f159524a |= 16;
                bwhm = (bwhm) bxvd.mo74062i();
            } else {
                bwhm = bwhm2;
            }
            LinkView a2 = LinkView.m118644a(bwhm, getContext(), this.f110488d, layoutInflater, bjxv, this.f110494j);
            this.f110489e = a2;
            a2.setGravity(17);
            this.f110489e.setTextColor(d);
            this.f110488d.addView(this.f110489e);
        }
        if ((bwhs.f159554a & 8) != 0) {
            Button button = (Button) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_secondary_button, this.f110488d, false);
            this.f110490f = button;
            bwht bwht = bwhs.f159556c;
            if (bwht == null) {
                bwht = bwht.f159561d;
            }
            button.setText(bwht.f159565c);
            this.f110490f.setId(bjxv.mo65614a());
            this.f110490f.setTextColor(d);
            this.f110490f.setOnClickListener(this);
            this.f110488d.addView(this.f110490f);
        }
        if ((bwhs.f159554a & 32) != 0) {
            bmdb bmdb = bwhs.f159558e;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            this.f110491g = (bkbn) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_standard_button_basic, this.f110488d, false);
            if (((bmdb.f128769a & 8) == 0 || bmdb.f128773e.isEmpty()) && getContext().getString(C0126R.string.common_dismiss) != null) {
                bxvd bxvd2 = (bxvd) bmdb.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmdb);
                String string = getContext().getString(C0126R.string.common_dismiss);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmdb bmdb2 = (bmdb) bxvd2.f164949b;
                string.getClass();
                bmdb2.f128769a |= 8;
                bmdb2.f128773e = string;
                bmdb = (bmdb) bxvd2.mo74062i();
            }
            this.f110491g.mo52707a(bmdb);
            this.f110491g.setId(bjxv.mo65614a());
            this.f110491g.mo52703a().setTextColor(d);
            this.f110491g.mo52710b().setOnClickListener(this);
            bjwl.m104784a(this.f110491g.mo52710b(), bmdb.f128770b, this.f110492h);
            this.f110488d.addView(this.f110491g.mo52710b());
        }
        if (this.f110488d.getChildCount() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f110493i.getLayoutParams();
            marginLayoutParams.bottomMargin = marginLayoutParams.topMargin;
            this.f110493i.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        bkbn bkbn = this.f110491g;
        if (bkbn != null) {
            View b = bkbn.mo52710b();
            bmdb bmdb = this.f110495k.f159558e;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            bjwl.m104790b(b, bmdb.f128770b, this.f110492h);
        }
    }

    public void onClick(View view) {
        String str;
        bxtx bxtx;
        if (view == this.f110490f) {
            bwht bwht = this.f110495k.f159556c;
            if (bwht == null) {
                bwht = bwht.f159561d;
            }
            if (bwht.f159563a == 2 && ((bxtx) bwht.f159564b).mo73744a() > 0) {
                Bundle bundle = new Bundle();
                if (bwht.f159563a == 2) {
                    bxtx = (bxtx) bwht.f159564b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                bundle.putByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN", bxtx.mo73780k());
                this.f110494j.mo51905a(22, bundle);
                return;
            }
            String str2 = "";
            if (bwht.f159563a == 3) {
                str = (String) bwht.f159564b;
            } else {
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                if (bwht.f159563a == 3) {
                    str2 = (String) bwht.f159564b;
                }
                getContext().startActivity(intent.setData(Uri.parse(str2)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110485a = findViewById(C0126R.C0129id.divider);
        this.f110493i = (ViewGroup) findViewById(C0126R.C0129id.content_container);
        this.f110486b = (ImageWithCaptionView) findViewById(C0126R.C0129id.icon);
        this.f110487c = (InfoMessageView) findViewById(C0126R.C0129id.description);
        this.f110488d = (ViewGroup) findViewById(C0126R.C0129id.button_container);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo60076a(bwhs bwhs, bjxv bjxv, bkdb bkdb, boolean z) {
        this.f110495k = bwhs;
        this.f110494j = bkdb;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (!z) {
            this.f110485a.setVisibility(0);
        }
        int a = bwhq.m121971a(bwhs.f159560g);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 2 && i != 3) {
            m94218a(bwhs, bkfr.m105542a(getContext(), (int) C0126R.attr.colorAccent), from, bjxv);
        } else if (z) {
            int color = getResources().getColor(17170443);
            m94218a(bwhs, color, from, bjxv);
            this.f110487c.mo72000a(color);
        } else {
            m94218a(bwhs, bkfr.m105542a(getContext(), (int) C0126R.attr.walletCardViewPageErrorColor), from, bjxv);
        }
    }
}
