package p000;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.List;

/* renamed from: tpr */
final /* synthetic */ class tpr implements View.OnClickListener {

    /* renamed from: a */
    private final tpt f46460a;

    /* renamed from: b */
    private final tsa f46461b;

    public tpr(tpt tpt, tsa tsa) {
        this.f46460a = tpt;
        this.f46461b = tsa;
    }

    public void onClick(View view) {
        List list;
        tpt tpt = this.f46460a;
        tsa tsa = this.f46461b;
        Activity activity = tpt.getActivity();
        if (tsa.mo26752a().mo2448b() == null || ((tql) tsa.mo26752a().mo2448b()).mo26735a() == null) {
            list = bngx.m109376e();
        } else {
            list = (List) ((tql) tsa.mo26752a().mo2448b()).mo26735a();
        }
        tpp tpp = tpt.f46463a;
        tpp.getClass();
        tps tps = new tps(tpp);
        tph tph = new tph(activity, list);
        PackageManager packageManager = tph.f46441b.getPackageManager();
        View inflate = tph.f46441b.getLayoutInflater().inflate((int) C0126R.C0128layout.pwm_appchooser_header, (ViewGroup) null);
        tpf tpf = new tpf(tph.f46441b);
        inflate.findViewById(C0126R.C0129id.progress_bar).setVisibility(0);
        bhia bhia = new bhia(tph.f46441b);
        bhia.mo63782c(inflate);
        bhia.mo63779b(tpf, new toy(tph, tpf, tps));
        bhia.mo63781c((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null);
        bhia.mo15910c();
        aucu.m76780a(snp.m35702a(9), new toz(tph, packageManager)).mo50373a(new tpa(tpf, inflate));
    }
}
