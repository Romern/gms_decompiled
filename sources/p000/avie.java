package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.udc.ConsentFlowConfig;
import com.google.android.gms.udc.p077ui.ResizeableIllustrationHeaderView;

/* renamed from: avie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avie extends avhz {

    /* renamed from: m */
    private avgw f93225m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo51250a() {
        return C0126R.C0128layout.udc_consent_fragment_material_v2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51253a(avhb avhb, boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51254a(bxsj bxsj, View view) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avih.a(android.widget.TextView, java.lang.String, boolean, java.lang.String):boolean
     arg types: [android.widget.TextView, java.lang.String, int, java.lang.String]
     candidates:
      avih.a(android.view.View, int, bxsc, com.android.volley.toolbox.ImageLoader):com.android.volley.toolbox.NetworkImageView
      avih.a(android.widget.TextView, bxsk, boolean, java.lang.String):void
      avih.a(android.widget.TextView, java.lang.String, boolean, java.lang.String):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51257b(bxsj bxsj, View view) {
        bxsk bxsk;
        String str;
        avih avih = this.f93198c;
        bxsk bxsk2 = null;
        if ((bxsj.f164689a & 2) != 0) {
            bxsk = bxsj.f164691c;
            if (bxsk == null) {
                bxsk = bxsk.f164695d;
            }
        } else {
            bxsk = null;
        }
        if ((bxsj.f164689a & 8) != 0 && (bxsk2 = bxsj.f164693e) == null) {
            bxsk2 = bxsk.f164695d;
        }
        String str2 = this.f93197b;
        TextView a = avih.m78568a(view, (int) C0126R.C0129id.setting);
        if (a != null) {
            if (!avih.m78576a(bxsk)) {
                String str3 = bxsk.f164699c;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 9);
                sb.append("<b>");
                sb.append(str3);
                sb.append(":</b> ");
                str = sb.toString();
            } else {
                str = "";
            }
            if (!avih.m78576a(bxsk2)) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(bxsk2.f164699c);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            }
            if (avih.mo51266a(a, str, true, str2)) {
                avih.mo51267b(bxsk);
                avih.mo51267b(bxsk2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51252a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, bxru bxru) {
        double d;
        bxsk bxsk;
        LayoutInflater layoutInflater2 = layoutInflater;
        bxru bxru2 = bxru;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0126R.C0129id.udc_consent_container);
        mo51251a(viewGroup2);
        avhb avhb = new avhb(layoutInflater2, viewGroup2);
        if ((bxru2.f164612a & 16) != 0) {
            bxsc bxsc = bxru2.f164615d;
            if (bxsc == null) {
                bxsc = bxsc.f164659d;
            }
            d = avgy.m78499a(bxsc.f164663c);
        } else {
            d = 0.0d;
        }
        ResizeableIllustrationHeaderView resizeableIllustrationHeaderView = (ResizeableIllustrationHeaderView) avhb.mo51218a(C0126R.C0128layout.udc_consent_header_material_v2);
        resizeableIllustrationHeaderView.f109395a = d;
        resizeableIllustrationHeaderView.requestLayout();
        avhb avhb2 = new avhb(layoutInflater2, resizeableIllustrationHeaderView);
        View a = avhb2.mo51218a(C0126R.C0128layout.udc_consent_user_info_material_v2);
        if (this.f93225m == null) {
            allp a2 = allq.m61232a();
            a2.f73626a = 80;
            this.f93225m = new avgw(getContext(), a, C0126R.C0129id.udc_consent_user_avatar, C0126R.C0129id.udc_consent_username, C0126R.C0129id.udc_consent_identity, this.f93198c, a2.mo40491a());
        }
        avgw avgw = this.f93225m;
        Context context = getContext();
        String str = this.f93197b;
        if ((bxru2.f164612a & 512) != 0) {
            bxsk = bxru2.f164619h;
            if (bxsk == null) {
                bxsk = bxsk.f164695d;
            }
        } else {
            bxsk = null;
        }
        Bitmap a3 = rzl.m34706a(BitmapFactory.decodeResource(context.getResources(), C0126R.C0127drawable.avatar_placeholder));
        avgw.f93164b.setImageBitmap(a3);
        avgw.f93165c.mo24713a(str, 0, 0).mo9458a(new avgu(avgw, a3));
        avgw.mo51215a((String) null, bxsk);
        avgw.f93166d.mo24710a((alkx) null).mo9458a(new avgv(avgw, str, bxsk));
        if ((bxru2.f164612a & 16) != 0) {
            ImageView imageView = (ImageView) ((ViewGroup) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_illustration_material_v2)).findViewById(C0126R.C0129id.illustration);
            avih avih = this.f93198c;
            bxsc bxsc2 = bxru2.f164615d;
            if (bxsc2 == null) {
                bxsc2 = bxsc.f164659d;
            }
            avih.mo51263a(imageView, (int) C0126R.C0129id.illustration, bxsc2, this.f93196a);
        }
        bxsk bxsk2 = bxru2.f164617f;
        if (bxsk2 == null) {
            bxsk2 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk2)) {
            TextView textView = (TextView) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_title);
            avih avih2 = this.f93198c;
            bxsk bxsk3 = bxru2.f164617f;
            if (bxsk3 == null) {
                bxsk3 = bxsk.f164695d;
            }
            avih2.mo51262a(textView, (int) C0126R.C0129id.header, bxsk3);
        }
        bxsk bxsk4 = bxru2.f164618g;
        if (bxsk4 == null) {
            bxsk4 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk4)) {
            TextView textView2 = (TextView) avhb.mo51218a(C0126R.C0128layout.udc_consent_product_statement);
            avih avih3 = this.f93198c;
            bxsk bxsk5 = bxru2.f164618g;
            if (bxsk5 == null) {
                bxsk5 = bxsk.f164695d;
            }
            avih3.mo51264a(textView2, bxsk5, this.f93197b);
        }
        mo51255a(layoutInflater, avhb, bxru, consentFlowConfig, C0126R.C0128layout.udc_consent_setting_material_v2);
        bxwc bxwc = bxru2.f164621j;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bxsk bxsk6 = (bxsk) bxwc.get(i);
            if (!avih.m78576a(bxsk6)) {
                this.f93198c.mo51264a(avhb.mo51218a(C0126R.C0128layout.udc_consent_text), bxsk6, this.f93197b);
            }
        }
        bxsk bxsk7 = bxru2.f164622k;
        if (bxsk7 == null) {
            bxsk7 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk7)) {
            View a4 = avhb.mo51218a(C0126R.C0128layout.udc_consent_footer);
            avih avih4 = this.f93198c;
            bxsk bxsk8 = bxru2.f164622k;
            if (bxsk8 == null) {
                bxsk8 = bxsk.f164695d;
            }
            avih4.mo51264a(a4, bxsk8, this.f93197b);
        }
    }
}
