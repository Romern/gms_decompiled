package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.model.PageData;
import java.lang.ref.WeakReference;

/* renamed from: wqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wqa implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wqb f51121a;

    public wqa(wqb wqb) {
        this.f51121a = wqb;
    }

    /* renamed from: a */
    private final void m42163a() {
        Dialog a = wgm.m41916a(this.f51121a.getActivity(), new wpy(this), new wpz(this));
        if (this.f51121a.f51124c.get() == null) {
            this.f51121a.f51124c = new WeakReference(a);
            a.show();
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String string = this.f51121a.getArguments().getString("memberId");
        return new wqg(this.f51121a.getActivity(), this.f51121a.getArguments().getString("accountName"), this.f51121a.f51122a.mo18502m(), this.f51121a.f51122a.mo18498e(), string == null ? 12 : 11, string);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            m42163a();
            return;
        }
        Object obj2 = why.f50695a;
        if (obj2 == null || (((brcw) obj2).f142444a & 2) == 0) {
            m42163a();
            return;
        }
        wqb wqb = this.f51121a;
        View view = wqb.f51123b;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_management_loading_screen).setVisibility(8);
            wqb.f51123b.findViewById(C0126R.C0129id.fm_management_content_screen).setVisibility(0);
        }
        wqb wqb2 = this.f51121a;
        bree bree = ((brcw) why.f50695a).f142446c;
        if (bree == null) {
            bree = bree.f142590e;
        }
        PageData pageData = new PageData(bree);
        String string = wqb2.getArguments().getString("accountName");
        if (pageData.f31453a.containsKey(28)) {
            whb.m41941a((Toolbar) wqb2.f51123b.findViewById(C0126R.C0129id.fm_toolbar), (String) pageData.f31453a.get(28), wqb2.getActivity());
        }
        if (pageData.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) wqb2.f51123b.findViewById(C0126R.C0129id.fm_management_body_text), (String) pageData.f31453a.get(3), new wgt(pageData, wqb2, string));
        }
        Button button = (Button) wqb2.f51123b.findViewById(C0126R.C0129id.fm_management_action_button);
        if (pageData.f31453a.containsKey(4)) {
            String str = (String) pageData.f31453a.get(4);
            if (str.isEmpty()) {
                button.setVisibility(8);
            } else {
                button.setText(str);
            }
        }
        button.setOnClickListener(new wpv(wqb2));
        Button button2 = (Button) wqb2.f51123b.findViewById(C0126R.C0129id.fm_management_cancel_button);
        if (pageData.f31453a.containsKey(5)) {
            button2.setText((CharSequence) pageData.f31453a.get(5));
        }
        button2.setOnClickListener(new wpw(wqb2));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
