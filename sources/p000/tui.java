package p000;

import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tui extends tuv {

    /* renamed from: a */
    private tsz f46680a;

    public final void onCreate(Bundle bundle) {
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        tsz tsz = this.f46680a;
        Toolbar toolbar = tsz.f46621c;
        toolbar.findViewById(C0126R.C0129id.search_edit_text).setVisibility(0);
        toolbar.findViewById(C0126R.C0129id.google_account_title).setVisibility(8);
        if (cdpx.m134644b()) {
            toolbar.findViewById(C0126R.C0129id.password_picker_search_button).setVisibility(8);
            toolbar.findViewById(C0126R.C0129id.toolbar_title).setVisibility(8);
        }
        menu.clear();
        menuInflater.inflate(C0126R.C0130menu.pwm_appbar_search_menu, menu);
        tsz.f46622d = menu.findItem(C0126R.C0129id.clear_search_button);
        tsz.mo26780a();
        C1264pc.m19827a(tsz.f46622d, tsz.f46620b.getResources().getText(C0126R.string.abc_searchview_description_clear));
        tsz.f46619a.requestFocus();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_search_screen, viewGroup, false);
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        if (((tsw) getChildFragmentManager().findFragmentByTag("password_list_fragment_tag_on_search")) == null) {
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.password_list_container, tsw.m37457a(string, true), "password_list_fragment_tag_on_search").commitNow();
        }
        tsf tsf = (tsf) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string)).mo3444a(tsf.class);
        tsf.f46583f.mo2445a(this, new tug(this, inflate));
        ((EditText) getActivity().findViewById(C0126R.C0129id.search_edit_text)).setText(bmxx.m108578b((String) tsf.f46584g.mo2448b()));
        tsz tsz = new tsz((Toolbar) getActivity().findViewById(C0126R.C0129id.pwm_toolbar), getActivity());
        tsz.f46619a.setOnFocusChangeListener(new tsx((InputMethodManager) tsz.f46620b.getSystemService("input_method")));
        tsz.f46619a.addTextChangedListener(new tsy(tsz));
        EditText editText = tsz.f46619a;
        editText.setImeOptions(editText.getImeOptions() | 301989894);
        this.f46680a = tsz;
        tsw tsw = (tsw) getChildFragmentManager().findFragmentByTag("password_list_fragment_tag_on_search");
        C0034at atVar = this.f46680a.f46623e;
        tsw.getClass();
        atVar.mo2445a(this, new tuh(tsw));
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        tsz tsz = this.f46680a;
        if (menuItem.getItemId() != C0126R.C0129id.clear_search_button) {
            return false;
        }
        ((EditText) tsz.f46621c.findViewById(C0126R.C0129id.search_edit_text)).setText("");
        return true;
    }
}
