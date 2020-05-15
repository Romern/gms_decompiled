package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.chimera.DialogFragment;

/* renamed from: fpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fpj implements View.OnClickListener {

    /* renamed from: a */
    final Button f17079a;

    /* renamed from: b */
    final Button f17080b;

    /* renamed from: c */
    final int f17081c;

    /* renamed from: d */
    final /* synthetic */ fpk f17082d;

    public fpj(fpk fpk, Button button, Button button2, int i) {
        this.f17082d = fpk;
        this.f17079a = button;
        this.f17080b = button2;
        this.f17081c = i;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        if (this.f17081c != 1) {
            dialogFragment = new fpn();
            dialogFragment.show(this.f17082d.getFragmentManager(), "timePicker");
        } else {
            dialogFragment = new fok();
            dialogFragment.show(this.f17082d.getFragmentManager(), "datePicker");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("buttonId", view.getId());
        String valueOf = String.valueOf(this.f17079a.getText());
        String valueOf2 = String.valueOf(this.f17080b.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        bundle.putCharArray("dateString", sb.toString().toCharArray());
        dialogFragment.setArguments(bundle);
    }
}
