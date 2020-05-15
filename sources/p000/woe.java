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

/* renamed from: woe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class woe implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wof f51026a;

    public woe(wof wof) {
        this.f51026a = wof;
    }

    /* renamed from: a */
    private final void m42097a() {
        Dialog a = wgm.m41916a(this.f51026a.getActivity(), new woc(this), new wod(this));
        if (this.f51026a.f51029c.get() == null) {
            this.f51026a.f51029c = new WeakReference(a);
            a.show();
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new wqg(this.f51026a.getActivity(), this.f51026a.getArguments().getString("accountName"), this.f51026a.f51027a.mo18479k(), this.f51026a.f51027a.mo18478j(), 10, null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            m42097a();
            return;
        }
        Object obj2 = why.f50695a;
        if (obj2 == null || (((brcw) obj2).f142444a & 2) == 0) {
            m42097a();
            return;
        }
        wof wof = this.f51026a;
        View view = wof.f51028b;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_management_loading_screen).setVisibility(8);
            wof.f51028b.findViewById(C0126R.C0129id.fm_management_content_screen).setVisibility(0);
        }
        wof wof2 = this.f51026a;
        bree bree = ((brcw) why.f50695a).f142446c;
        if (bree == null) {
            bree = bree.f142590e;
        }
        PageData pageData = new PageData(bree);
        String string = wof2.getArguments().getString("accountName");
        if (pageData.f31453a.containsKey(28)) {
            whb.m41941a((Toolbar) wof2.f51028b.findViewById(C0126R.C0129id.fm_toolbar), (String) pageData.f31453a.get(28), wof2.getActivity());
        }
        if (pageData.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) wof2.f51028b.findViewById(C0126R.C0129id.fm_management_body_text), (String) pageData.f31453a.get(3), new wgt(pageData, wof2, string));
        }
        Button button = (Button) wof2.f51028b.findViewById(C0126R.C0129id.fm_management_action_button);
        if (pageData.f31453a.containsKey(4)) {
            button.setText((CharSequence) pageData.f31453a.get(4));
        }
        button.setOnClickListener(new wnz(wof2));
        Button button2 = (Button) wof2.f51028b.findViewById(C0126R.C0129id.fm_management_cancel_button);
        if (pageData.f31453a.containsKey(5)) {
            button2.setText((CharSequence) pageData.f31453a.get(5));
        }
        button2.setOnClickListener(new woa(wof2));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
