package p000;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: atln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class atln extends DialogFragment {

    /* renamed from: a */
    atam f90448a;

    /* renamed from: b */
    protected bpan f90449b = bpan.UNKNOWN_PROMPT_TYPE;

    /* renamed from: c */
    public boolean f90450c;

    /* renamed from: d */
    public boolean f90451d;

    /* renamed from: e */
    public boolean f90452e;

    /* renamed from: f */
    rjx f90453f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Dialog mo50032a(String str, String str2, String str3, String str4) {
        if (this.f90448a == null) {
            rjx b = rjx.m33697b(getActivity());
            this.f90453f = b;
            b.mo24770x().mo50376a(getActivity(), new atlk(this));
        }
        View inflate = LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.tp_dialog_layout, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_headline)).setText(str);
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_text)).setText(str2);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.tp_button_positive);
        button.setText(str3);
        button.setOnClickListener(new atll(this));
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.tp_button_negative);
        button2.setText(str4);
        button2.setOnClickListener(new atlm(this));
        C1349sg sgVar = new C1349sg(getActivity());
        sgVar.mo15907b(inflate);
        return sgVar.mo15904b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9306a();

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        atam atam = this.f90448a;
        if (atam != null) {
            atam.mo49738a(this.f90449b);
        } else {
            this.f90450c = true;
        }
    }
}
