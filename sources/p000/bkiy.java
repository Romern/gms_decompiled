package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;

/* renamed from: bkiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkiy extends bkix implements DialogInterface.OnClickListener {

    /* renamed from: a */
    TextView f124334a;

    /* renamed from: b */
    FifeNetworkImageView f124335b;

    /* renamed from: d */
    private View f124336d;

    /* renamed from: e */
    private View f124337e;

    /* renamed from: a */
    public static bkiy m105892a(int i, boolean z) {
        bkiy bkiy = new bkiy();
        Bundle a = bkbq.m105268a(i);
        a.putBoolean("nfcEnabled", z);
        bkiy.setArguments(a);
        return bkiy;
    }

    /* renamed from: d */
    public final void mo66064d() {
        this.f124337e.setVisibility(4);
        this.f124336d.setVisibility(0);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            startActivity(new Intent("android.settings.NFC_SETTINGS"));
        }
    }

    /* renamed from: a */
    public final Dialog mo9306a() {
        View view;
        bkbj bkbj = new bkbj(mo65815b());
        if (!bkfr.m105621h(mo65815b()) || !((Boolean) bjwe.f123467B.mo54082a()).booleanValue()) {
            view = mo65816c().inflate((int) C0126R.C0128layout.view_nfc_instruction, (ViewGroup) null);
        } else {
            view = LayoutInflater.from(bkbj.f123944a).inflate((int) C0126R.C0128layout.view_nfc_instruction, (ViewGroup) null);
        }
        this.f124334a = (TextView) view.findViewById(C0126R.C0129id.nfc_popup_message);
        this.f124335b = (FifeNetworkImageView) view.findViewById(C0126R.C0129id.nfc_instruction_image);
        this.f124337e = view.findViewById(C0126R.C0129id.nfc_instruction_layout);
        this.f124336d = view.findViewById(C0126R.C0129id.nfc_instruction_spinner);
        bkbj.mo65783b(view);
        if (getArguments().getBoolean("nfcEnabled")) {
            bkbj.mo65777a((int) C0126R.string.wallet_uic_nfc_popup_title);
            bkbj.mo65778a((int) C0126R.string.wallet_uic_close, (DialogInterface.OnClickListener) null);
            this.f124334a.setText((int) C0126R.string.wallet_uic_nfc_popup_enabled_information);
            String str = (String) bjwe.f123491l.mo54082a();
            if (!TextUtils.isEmpty(str)) {
                this.f124335b.mo71889a(str, bjvn.m104721b(mo65815b().getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                this.f124335b.mo71888a();
                this.f124335b.setVisibility(0);
            }
        } else {
            bkbj.mo65777a((int) C0126R.string.wallet_uic_nfc_enable_title);
            bkbj.mo65782b((int) C0126R.string.wallet_uic_nfc_enable_button, this);
            this.f124334a.setText((int) C0126R.string.wallet_uic_nfc_popup_disabled_information);
            this.f124335b.setVisibility(8);
        }
        return bkbj.mo65776a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66063a(bkiw bkiw) {
        getTag();
        bkiw.mo66062a();
    }
}
