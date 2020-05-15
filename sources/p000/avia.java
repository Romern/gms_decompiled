package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: avia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avia extends avhz {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo51250a() {
        return C0126R.C0128layout.udc_consent_fragment_glif;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int i = Build.VERSION.SDK_INT;
        mo51256b();
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51252a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, bxru bxru) {
        boolean z;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0126R.C0129id.udc_consent_container);
        mo51251a(viewGroup2);
        avhb avhb = new avhb(layoutInflater, viewGroup2);
        ViewGroup viewGroup3 = (ViewGroup) avhb.mo51218a(C0126R.C0128layout.udc_consent_header);
        if (viewGroup3 != null) {
            avhb avhb2 = new avhb(layoutInflater, viewGroup3);
            if ((bxru.f164612a & 16) != 0) {
                ImageView imageView = (ImageView) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_illustration_glif);
                avih avih = this.f93198c;
                bxsc bxsc = bxru.f164615d;
                if (bxsc == null) {
                    bxsc = bxsc.f164659d;
                }
                avih.mo51263a(imageView, (int) C0126R.C0129id.illustration, bxsc, this.f93196a);
            }
            bxsk bxsk = bxru.f164617f;
            if (bxsk == null) {
                bxsk = bxsk.f164695d;
            }
            if (!avih.m78576a(bxsk)) {
                TextView textView = (TextView) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_title_glif);
                avih avih2 = this.f93198c;
                bxsk bxsk2 = bxru.f164617f;
                if (bxsk2 == null) {
                    bxsk2 = bxsk.f164695d;
                }
                avih2.mo51262a(textView, (int) C0126R.C0129id.header, bxsk2);
            }
        }
        if ((bxru.f164612a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            View a = avhb.mo51218a(C0126R.C0128layout.udc_consent_product_statement_glif);
            avih avih3 = this.f93198c;
            bxsk bxsk3 = bxru.f164618g;
            if (bxsk3 == null) {
                bxsk3 = bxsk.f164695d;
            }
            avih3.mo51264a(a, bxsk3, this.f93197b);
        }
        if ((bxru.f164612a & 512) != 0) {
            View a2 = avhb.mo51218a(C0126R.C0128layout.udc_consent_identity);
            avih avih4 = this.f93198c;
            bxsk bxsk4 = bxru.f164619h;
            if (bxsk4 == null) {
                bxsk4 = bxsk.f164695d;
            }
            avih4.mo51262a(a2, (int) C0126R.C0129id.header, bxsk4);
            avhb.mo51218a(C0126R.C0128layout.udc_consent_separator);
        }
        boolean a3 = mo51255a(layoutInflater, avhb, bxru, consentFlowConfig, C0126R.C0128layout.udc_consent_setting_glif);
        bxwc bxwc = bxru.f164621j;
        int size = bxwc.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            bxsk bxsk5 = (bxsk) bxwc.get(i);
            if (!avih.m78576a(bxsk5)) {
                if (!a3) {
                    z = false;
                } else {
                    z = z2;
                }
                mo51253a(avhb, z, true);
                this.f93198c.mo51264a(avhb.mo51218a(C0126R.C0128layout.udc_consent_text_glif), bxsk5, this.f93197b);
                a3 = true;
                z2 = false;
            }
        }
        bxsk bxsk6 = bxru.f164622k;
        if (bxsk6 == null) {
            bxsk6 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk6)) {
            mo51253a(avhb, a3, true);
            View a4 = avhb.mo51218a(C0126R.C0128layout.udc_consent_footer);
            avih avih5 = this.f93198c;
            bxsk bxsk7 = bxru.f164622k;
            if (bxsk7 == null) {
                bxsk7 = bxsk.f164695d;
            }
            avih5.mo51264a(a4, bxsk7, this.f93197b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51253a(avhb avhb, boolean z, boolean z2) {
        if (z) {
            avhb.mo51218a(C0126R.C0128layout.udc_consent_separator);
            if (z2) {
                avhb.mo51218a(C0126R.C0128layout.udc_consent_spacer);
            }
        }
    }
}
