package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: bkjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjr extends LinearLayout implements View.OnClickListener, bkfv {

    /* renamed from: a */
    public bkjq f124441a;

    /* renamed from: b */
    bmel f124442b;

    /* renamed from: c */
    final TextView f124443c = ((TextView) findViewById(C0126R.C0129id.updatable_cart_summary_label));

    /* renamed from: d */
    final TextView f124444d = ((TextView) findViewById(C0126R.C0129id.updatable_cart_summary_displayable_price));

    /* renamed from: e */
    public final ImageView f124445e = ((ImageView) findViewById(C0126R.C0129id.updatable_cart_button_icon));

    /* renamed from: f */
    public bkcb f124446f;

    public bkjr(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.view_updatable_cart_overview, this);
    }

    /* renamed from: a */
    public static bmel m106045a(bkcb bkcb, bmel bmel) {
        if (!bmel.f128963e) {
            return bmel;
        }
        bxvd bxvd = (bxvd) bmel.mo74142c(5);
        bxvd.mo73625a((bxvk) bmel);
        bxwc bxwc = bkcb.mo52029A().f158972b;
        ArrayList arrayList = new ArrayList();
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bweb bweb = (bweb) bxwc.get(i);
            int a = bwea.m121871a(bweb.f158962e);
            if (a == 0) {
                a = 1;
            }
            String a2 = bjvk.m104704a().mo65563a().mo65566a(new BigDecimal(bweb.f158960c), bweb.f158961d);
            if (a == 6) {
                bmei bmei = bmel.f128962d;
                if (bmei == null) {
                    bmei = bmei.f128941d;
                }
                bxvd bxvd2 = (bxvd) bmei.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmei);
                bmei bmei2 = bmel.f128962d;
                if (bmei2 == null) {
                    bmei2 = bmei.f128941d;
                }
                bmej bmej = bmei2.f128944b;
                if (bmej == null) {
                    bmej = bmej.f128946e;
                }
                bxvd bxvd3 = (bxvd) bmej.mo74142c(5);
                bxvd3.mo73625a((bxvk) bmej);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bmej bmej2 = (bmej) bxvd3.f164949b;
                a2.getClass();
                bmej2.f128948a |= 4;
                bmej2.f128950c = a2;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmei bmei3 = (bmei) bxvd2.f164949b;
                bmej bmej3 = (bmej) bxvd3.mo74062i();
                bmej3.getClass();
                bmei3.f128944b = bmej3;
                bmei3.f128943a |= 2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmel bmel2 = (bmel) bxvd.f164949b;
                bmei bmei4 = (bmei) bxvd2.mo74062i();
                bmel bmel3 = bmel.f128957f;
                bmei4.getClass();
                bmel2.f128962d = bmei4;
                bmel2.f128959a |= 2;
            }
            bxvd da = bmek.f128952d.mo74144da();
            String str = bweb.f158959b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmek bmek = (bmek) da.f164949b;
            str.getClass();
            int i2 = 1 | bmek.f128954a;
            bmek.f128954a = i2;
            bmek.f128955b = str;
            a2.getClass();
            bmek.f128954a = i2 | 2;
            bmek.f128956c = a2;
            arrayList.add((bmek) da.mo74062i());
        }
        if (!arrayList.isEmpty()) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmel bmel4 = bmel.f128957f;
            ((bmel) bxvd.f164949b).f128961c = bxvk.m124030de();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmel bmel5 = (bmel) bxvd.f164949b;
            if (!bmel5.f128961c.mo73666a()) {
                bmel5.f128961c = bxvk.m124021a(bmel5.f128961c);
            }
            bxsy.m123078a(arrayList, bmel5.f128961c);
        }
        return (bmel) bxvd.mo74062i();
    }

    /* renamed from: l */
    public final void mo52931l() {
        mo66094a(m106045a(this.f124446f, this.f124442b));
    }

    public void onClick(View view) {
        bkjq bkjq = this.f124441a;
        if (bkjq != null) {
            bkjq.mo66081a(this.f124442b);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f124443c.setEnabled(z);
        this.f124444d.setEnabled(z);
        this.f124445e.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo66094a(bmel bmel) {
        this.f124442b = bmel;
        bmei bmei = bmel.f128962d;
        if (bmei == null) {
            bmei = bmei.f128941d;
        }
        bmej bmej = bmei.f128944b;
        if (bmej == null) {
            bmej = bmej.f128946e;
        }
        TextView textView = this.f124443c;
        bmei bmei2 = this.f124442b.f128962d;
        if (bmei2 == null) {
            bmei2 = bmei.f128941d;
        }
        bmej bmej2 = bmei2.f128944b;
        if (bmej2 == null) {
            bmej2 = bmej.f128946e;
        }
        textView.setText(bmej2.f128949b);
        TextView textView2 = this.f124444d;
        bmei bmei3 = this.f124442b.f128962d;
        if (bmei3 == null) {
            bmei3 = bmei.f128941d;
        }
        bmej bmej3 = bmei3.f128944b;
        if (bmej3 == null) {
            bmej3 = bmej.f128946e;
        }
        textView2.setText(bmej3.f128950c);
        if ((bmej.f128948a & 8) != 0 && this.f124442b.f128961c.size() > 0) {
            ImageView imageView = this.f124445e;
            Context context = getContext();
            bmno bmno = bmej.f128951d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            imageView.setImageResource(bkfr.m105586b(context, bmno.f130142c));
            ImageView imageView2 = this.f124445e;
            bmno bmno2 = bmej.f128951d;
            if (bmno2 == null) {
                bmno2 = bmno.f130138m;
            }
            imageView2.setContentDescription(bmno2.f130149j);
            this.f124445e.setOnClickListener(this);
            bkfr.m105572a(this.f124445e, bkfr.m105588b(getContext()));
        }
        if (TextUtils.isEmpty(this.f124443c.getText()) || TextUtils.isEmpty(this.f124444d.getText())) {
            setVisibility(8);
        }
    }
}
