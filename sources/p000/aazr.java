package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: aazr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazr extends BaseAdapter {

    /* renamed from: a */
    public String f56900a = null;

    /* renamed from: b */
    public List f56901b = null;

    /* renamed from: c */
    private final HelpChimeraActivity f56902c;

    public aazr(HelpChimeraActivity helpChimeraActivity) {
        this.f56902c = helpChimeraActivity;
    }

    public final int getCount() {
        List list = this.f56901b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object getItem(int i) {
        return this.f56901b.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasp.a(com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, int, boolean):android.view.View
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, aasn, ?, int]
     candidates:
      aasp.a(android.view.View, com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, boolean):void
      aasp.a(com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, aasm, android.view.View$OnClickListener, int, boolean):android.view.View */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aasm aasm = (aasm) this.f56901b.get(i);
        View a = aasp.m46937a(this.f56902c, aasm, (View.OnClickListener) new aasn(this.f56902c, aasm, i, 7, this.f56900a), (int) C0126R.C0128layout.gh_help_content_line_item, true);
        if (a != null) {
            return a;
        }
        View view2 = new View(this.f56902c);
        view2.setVisibility(8);
        return view2;
    }
}
