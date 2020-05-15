package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjt implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ avka f93279a;

    /* renamed from: b */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93280b;

    public avjt(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity, avka avka) {
        this.f93280b = chimeraUpdateFromSdCardActivity;
        this.f93279a = avka;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String charSequence = ((TextView) view.findViewById(C0126R.C0129id.item_text)).getText().toString();
        View view2 = this.f93280b.f109427c;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = this.f93280b;
        chimeraUpdateFromSdCardActivity.f109427c = view;
        chimeraUpdateFromSdCardActivity.f109426b = charSequence;
        if (charSequence.endsWith("/")) {
            this.f93280b.f109431g.add(charSequence);
            this.f93280b.mo59650b();
            return;
        }
        view.setBackgroundColor(this.f93280b.getResources().getColor(C0126R.color.system_update_file_browser_highlight_color));
        this.f93279a.f93286a = i;
        ((Button) this.f93280b.f109428d.findViewById(C0126R.C0129id.file_browser_ok_button)).setEnabled(true);
    }
}
