package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgm {
    /* renamed from: a */
    public static Dialog m41914a(Activity activity) {
        C1349sg a = m41918a((Context) activity);
        a.mo15912d(C0126R.string.common_something_went_wrong);
        a.mo15906b((int) C0126R.string.common_ok, wgk.f50622a);
        return a.mo15904b();
    }

    /* renamed from: b */
    public static Dialog m41919b(Activity activity, DialogInterface.OnClickListener onClickListener) {
        String string = activity.getString(C0126R.string.common_app_name);
        C1349sg a = m41918a((Context) activity);
        a.mo15905b((int) C0126R.string.fm_upgrade_required_title);
        a.mo15900a(activity.getString(C0126R.string.fm_upgrade_required_message, new Object[]{string}));
        a.mo15906b((int) C0126R.string.common_got_it, onClickListener);
        return a.mo15904b();
    }

    /* renamed from: a */
    public static Dialog m41915a(Activity activity, DialogInterface.OnClickListener onClickListener) {
        C1349sg a = m41918a((Context) activity);
        a.mo15912d(C0126R.string.common_something_went_wrong);
        a.mo15906b((int) C0126R.string.common_cancel, onClickListener);
        return a.mo15904b();
    }

    /* renamed from: a */
    public static Dialog m41916a(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C1349sg a = m41918a((Context) activity);
        a.mo15912d(C0126R.string.common_something_went_wrong);
        a.mo15906b((int) C0126R.string.common_try_again, onClickListener);
        a.mo15892a((int) C0126R.string.common_cancel, onClickListener2);
        return a.mo15904b();
    }

    /* renamed from: a */
    public static Dialog m41917a(Activity activity, PageData pageData, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z) {
        C1349sg a = m41918a((Context) activity);
        if (pageData.f31453a.containsKey(2)) {
            a.mo15908b((CharSequence) pageData.f31453a.get(2));
        }
        if (pageData.f31453a.containsKey(3)) {
            a.mo15900a(Html.fromHtml(stm.m36299a((String) pageData.f31453a.get(3)), null, new wgt(pageData, (wgr) activity, str)));
        }
        if (pageData.f31453a.containsKey(4) && onClickListener != null) {
            a.mo15909b((CharSequence) pageData.f31453a.get(4), onClickListener);
        }
        if (pageData.f31453a.containsKey(5) && onClickListener2 != null) {
            a.mo15901a((CharSequence) pageData.f31453a.get(5), onClickListener2);
        }
        a.mo15902a(z);
        return a.mo15904b();
    }

    /* renamed from: a */
    public static C1349sg m41918a(Context context) {
        return new wgl(context);
    }
}
