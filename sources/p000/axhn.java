package p000;

import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: axhn */
final /* synthetic */ class axhn implements axls {

    /* renamed from: a */
    private final axhs f95949a;

    public axhn(axhs axhs) {
        this.f95949a = axhs;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        axhs axhs = this.f95949a;
        bzwl bzwl = (bzwl) obj;
        axhs.mo53238P(162);
        if (bzwl.f171645a) {
            axhs.mo53238P(166);
            axhs.f95957b.setVisibility(8);
            axhs.f95957b.setChecked(true);
        } else {
            axhs.mo53238P(167);
            axhs.f95957b.setVisibility(0);
            axhs.f95957b.setChecked(false);
        }
        axhs.f95959d.showNext();
        bzwk bzwk = bzwl.f171646b;
        if (bzwk == null) {
            bzwk = bzwk.f171639c;
        }
        if ((bzwk.f171641a & 2) != 0) {
            bzwk bzwk2 = bzwl.f171646b;
            if (bzwk2 == null) {
                bzwk2 = bzwk.f171639c;
            }
            bzwj bzwj = bzwk2.f171642b;
            if (bzwj == null) {
                bzwj = bzwj.f171630g;
            }
            if (axhs.getActivity() != null) {
                int a = bzvi.m126244a(axhs.getArguments().getInt("integrator_id"));
                if (a == 0) {
                    a = 1;
                }
                axhr a2 = axhs.m82625a(a, bzwj);
                axhs.f95958c.setText(String.format(bzwj.f171632a, axhs.getString(a2.f95953a)));
                axhs.f95957b.setText(bzwj.f171637f);
                String[] strArr = a2.f95954b;
                for (String str : strArr) {
                    TextView textView = (TextView) axhs.getLayoutInflater(null).inflate((int) C0126R.C0128layout.list_item, (ViewGroup) null);
                    textView.setText(str);
                    textView.setGravity(17);
                    axhs.f95956a.addView(textView);
                }
            }
        }
    }
}
