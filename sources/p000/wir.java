package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.family.p042v2.model.BirthdayData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.widget.DateSpinner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: wir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wir extends DialogFragment implements wgr {

    /* renamed from: a */
    public wiq f50743a;

    /* renamed from: b */
    public Calendar f50744b;

    /* renamed from: c */
    private String f50745c;

    /* renamed from: d */
    private PageData f50746d;

    /* renamed from: e */
    private PageData f50747e;

    /* renamed from: f */
    private View f50748f;

    /* renamed from: g */
    private int f50749g;

    /* renamed from: a */
    public static final int m41971a(Calendar calendar) {
        if (calendar == null) {
            return -1;
        }
        Calendar instance = GregorianCalendar.getInstance();
        int i = instance.get(1) - calendar.get(1);
        return calendar.get(6) <= instance.get(6) ? i : i - 1;
    }

    /* renamed from: b */
    public final void mo29131b() {
        if (this.f50748f != null) {
            this.f50749g = 2;
            int a = m41971a(this.f50744b);
            this.f50748f.findViewById(C0126R.C0129id.fm_birthday_buttons).setVisibility(8);
            this.f50748f.findViewById(C0126R.C0129id.fm_birthday_confirm_buttons).setVisibility(0);
            if (this.f50747e.f31453a.containsKey(2)) {
                wgz.m41940a((TextView) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_header_text), (String) this.f50747e.f31453a.get(2), new wgt(this.f50747e, this, this.f50745c));
            }
            ((TextView) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_body_text)).setText(getResources().getQuantityString(C0126R.plurals.fm_age_confirmation, a, Integer.valueOf(a)));
            ((DateSpinner) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_date_spinner)).setVisibility(8);
            Button button = (Button) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_confirm_continue_button);
            if (this.f50747e.f31453a.containsKey(4)) {
                button.setText((CharSequence) this.f50747e.f31453a.get(4));
            }
            button.setEnabled(true);
            button.setOnClickListener(new wio(this));
            Button button2 = (Button) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_confirm_cancel_button);
            if (this.f50747e.f31453a.containsKey(5)) {
                button2.setText((CharSequence) this.f50747e.f31453a.get(5));
            }
            button2.setOnClickListener(new wip(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50743a = (wiq) wgq.m41934a(wiq.class, activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    public final void onCreate(Bundle bundle) {
        Calendar calendar;
        char c;
        super.onCreate(bundle);
        this.f50746d = (PageData) getArguments().getParcelable("birthdayPageData");
        this.f50747e = (PageData) getArguments().getParcelable("confirmPageData");
        this.f50745c = getArguments().getString("accountName");
        int i = 1;
        if (bundle != null) {
            String string = bundle.getString("state");
            int hashCode = string.hashCode();
            if (hashCode != 66130002) {
                if (hashCode == 1669100192 && string.equals("CONFIRM")) {
                    c = 1;
                    if (c != 0) {
                        if (c == 1) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
            } else if (string.equals("ENTRY")) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        this.f50749g = i;
        if (bundle != null) {
            calendar = (Calendar) bundle.getSerializable("birthday");
        } else {
            calendar = null;
        }
        this.f50744b = calendar;
        this.f50743a.mo18443b().mo29116b(12);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f50748f = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_birthday_dialog, viewGroup, false);
        int i = this.f50749g;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                mo9306a();
            } else if (i2 == 1) {
                mo29131b();
            }
            return this.f50748f;
        }
        throw null;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50743a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = this.f50749g;
        String str = i != 1 ? i != 2 ? "null" : "CONFIRM" : "ENTRY";
        if (i != 0) {
            bundle.putString("state", str);
            bundle.putSerializable("birthday", this.f50744b);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo9306a() {
        boolean z;
        View view = this.f50748f;
        if (view != null) {
            this.f50749g = 1;
            view.findViewById(C0126R.C0129id.fm_birthday_confirm_buttons).setVisibility(8);
            this.f50748f.findViewById(C0126R.C0129id.fm_birthday_buttons).setVisibility(0);
            if (this.f50746d.f31453a.containsKey(2)) {
                wgz.m41940a((TextView) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_header_text), (String) this.f50746d.f31453a.get(2), new wgt(this.f50746d, this, this.f50745c));
            }
            if (this.f50746d.f31453a.containsKey(3)) {
                wgz.m41940a((TextView) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_body_text), (String) this.f50746d.f31453a.get(3), new wgt(this.f50746d, this, this.f50745c));
            }
            Button button = (Button) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_continue_button);
            if (this.f50746d.f31453a.containsKey(4)) {
                button.setText((CharSequence) this.f50746d.f31453a.get(4));
            }
            if (this.f50744b != null) {
                z = true;
            } else {
                z = false;
            }
            button.setEnabled(z);
            button.setOnClickListener(new wil(this));
            DateSpinner dateSpinner = (DateSpinner) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_date_spinner);
            dateSpinner.setVisibility(0);
            String str = (String) this.f50746d.f31453a.get(8);
            String str2 = (String) this.f50746d.f31453a.get(9);
            String str3 = (String) this.f50746d.f31453a.get(10);
            dateSpinner.f31477a = str;
            dateSpinner.f31478b = str2;
            dateSpinner.f31479c = str3;
            ((wrs) ((Spinner) dateSpinner.findViewById(C0126R.C0129id.fm_birthday_month)).getAdapter()).f51207a = str;
            ((wrt) ((Spinner) dateSpinner.findViewById(C0126R.C0129id.fm_birthday_day)).getAdapter()).f51210a = str2;
            ((EditText) dateSpinner.findViewById(C0126R.C0129id.fm_birthday_year)).setHint(str3);
            BirthdayData birthdayData = (BirthdayData) getArguments().getParcelable("birthday");
            if (birthdayData != null) {
                dateSpinner.mo18573b(birthdayData.f31427a);
                dateSpinner.mo18571a(birthdayData.f31428b);
            }
            Calendar calendar = this.f50744b;
            if (calendar != null) {
                dateSpinner.mo18573b(calendar.get(2));
                dateSpinner.mo18571a(this.f50744b.get(5));
                ((EditText) dateSpinner.findViewById(C0126R.C0129id.fm_birthday_year)).setText(String.valueOf(this.f50744b.get(1)));
            }
            dateSpinner.f31480d = new wim(this, button);
            Button button2 = (Button) this.f50748f.findViewById(C0126R.C0129id.fm_birthday_cancel_button);
            if (this.f50746d.f31453a.containsKey(5)) {
                button2.setText((CharSequence) this.f50746d.f31453a.get(5));
            }
            button2.setOnClickListener(new win(this));
        }
    }
}
