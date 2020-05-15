package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: mva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mva extends DialogFragment {
    /* renamed from: a */
    public static bsqh m25652a() {
        bxvd da = bsqh.f146634g.mo74144da();
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        bsqp.mo70703a((int) C0126R.string.backup_opt_in_backup_disable_confirmation_title);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqh bsqh = (bsqh) da.f164949b;
        bsqq bsqq = (bsqq) bsqp.mo74062i();
        bsqq.getClass();
        bsqh.f146638c = bsqq;
        bsqh.f146636a |= 2;
        bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp2.mo70703a(!cclf.m130397b() ? C0126R.string.turn_off_backup_dialog_description : C0126R.string.turn_off_backup_dialog_description_no_branding);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqh bsqh2 = (bsqh) da.f164949b;
        bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
        bsqq2.getClass();
        bsqh2.f146639d = bsqq2;
        bsqh2.f146636a |= 4;
        bsqp bsqp3 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp3.mo70703a((int) C0126R.string.turn_off_backup_button_label);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqh bsqh3 = (bsqh) da.f164949b;
        bsqq bsqq3 = (bsqq) bsqp3.mo74062i();
        bsqq3.getClass();
        bsqh3.f146640e = bsqq3;
        bsqh3.f146636a |= 8;
        bsqp bsqp4 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp4.mo70703a(17039360);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqh bsqh4 = (bsqh) da.f164949b;
        bsqq bsqq4 = (bsqq) bsqp4.mo74062i();
        bsqq4.getClass();
        bsqh4.f146641f = bsqq4;
        bsqh4.f146636a |= 16;
        return (bsqh) da.mo74062i();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bsqh a = m25652a();
        AlertDialog.Builder a2 = mba.m24785a(getActivity());
        bsqq bsqq = a.f146639d;
        if (bsqq == null) {
            bsqq = bsqq.f146675b;
        }
        AlertDialog.Builder message = a2.setMessage(bsqq.f146677a.mo74151b(0));
        bsqq bsqq2 = a.f146638c;
        if (bsqq2 == null) {
            bsqq2 = bsqq.f146675b;
        }
        AlertDialog.Builder title = message.setTitle(bsqq2.f146677a.mo74151b(0));
        bsqq bsqq3 = a.f146640e;
        if (bsqq3 == null) {
            bsqq3 = bsqq.f146675b;
        }
        AlertDialog.Builder positiveButton = title.setPositiveButton(bsqq3.f146677a.mo74151b(0), new muy(this));
        bsqq bsqq4 = a.f146641f;
        if (bsqq4 == null) {
            bsqq4 = bsqq.f146675b;
        }
        return positiveButton.setNegativeButton(bsqq4.f146677a.mo74151b(0), (DialogInterface.OnClickListener) null).setCancelable(true).create();
    }
}
