package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: bhhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhh extends C1010ga {

    /* renamed from: Y */
    public final LinkedHashSet f118653Y = new LinkedHashSet();

    /* renamed from: Z */
    public final LinkedHashSet f118654Z = new LinkedHashSet();

    /* renamed from: aa */
    public DateSelector f118655aa;

    /* renamed from: ab */
    public CheckableImageButton f118656ab;

    /* renamed from: ac */
    public Button f118657ac;

    /* renamed from: ad */
    private final LinkedHashSet f118658ad = new LinkedHashSet();

    /* renamed from: ae */
    private final LinkedHashSet f118659ae = new LinkedHashSet();

    /* renamed from: af */
    private int f118660af;

    /* renamed from: ag */
    private bhhr f118661ag;

    /* renamed from: ah */
    private CalendarConstraints f118662ah;

    /* renamed from: ai */
    private bhhb f118663ai;

    /* renamed from: aj */
    private int f118664aj;

    /* renamed from: ak */
    private CharSequence f118665ak;

    /* renamed from: al */
    private boolean f118666al;

    /* renamed from: am */
    private int f118667am;

    /* renamed from: an */
    private TextView f118668an;

    /* renamed from: ao */
    private bhlr f118669ao;

    /* renamed from: a */
    public static boolean m100880a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(bhkx.m101072a(context, (int) C0126R.attr.materialCalendarStyle, bhhb.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: b */
    private static int m100881b(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_content_padding);
        int i = Month.m117562a().f151176e;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(C0126R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: l */
    private final int m100882l() {
        int i = this.f118660af;
        return i == 0 ? this.f118655aa.mo71135e() : i;
    }

    /* renamed from: j */
    public final void mo63753j() {
        String f = this.f118655aa.mo71136f();
        this.f118668an.setContentDescription(String.format(getString(C0126R.string.mtrl_picker_announce_current_selection), f));
        this.f118668an.setText(f);
    }

    /* renamed from: k */
    public final void mo63759k() {
        bhhr bhhr;
        DateSelector dateSelector = this.f118655aa;
        requireContext();
        int l = m100882l();
        CalendarConstraints calendarConstraints = this.f118662ah;
        bhhb bhhb = new bhhb();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", l);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f151166c);
        bhhb.setArguments(bundle);
        this.f118663ai = bhhb;
        if (this.f118656ab.f151200a) {
            DateSelector dateSelector2 = this.f118655aa;
            CalendarConstraints calendarConstraints2 = this.f118662ah;
            bhhr = new bhhk();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            bhhr.setArguments(bundle2);
        } else {
            bhhr = this.f118663ai;
        }
        this.f118661ag = bhhr;
        mo63753j();
        C1058hr a = getChildFragmentManager().mo12516a();
        a.mo12684a((int) C0126R.C0129id.mtrl_calendar_frame, this.f118661ag);
        a.mo11296h();
        bhhr bhhr2 = this.f118661ag;
        bhhr2.f118686ad.add(new bhhf(this));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f118658ad.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f118660af = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f118655aa = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f118662ah = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f118664aj = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f118665ak = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f118667am = bundle.getInt("INPUT_MODE_KEY");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        Dialog dialog = new Dialog(requireContext, m100882l());
        Context context = dialog.getContext();
        this.f118666al = m100880a(context);
        int a = bhkx.m101072a(context, (int) C0126R.attr.colorSurface, bhhh.class.getCanonicalName());
        bhlr bhlr = new bhlr(context, null, C0126R.attr.materialCalendarStyle, 2132019496);
        this.f118669ao = bhlr;
        bhlr.mo63942a(context);
        this.f118669ao.mo63948c(ColorStateList.valueOf(a));
        this.f118669ao.mo63949d(C1280ps.m19933o(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        if (!this.f118666al) {
            i = C0126R.C0128layout.mtrl_picker_dialog;
        } else {
            i = C0126R.C0128layout.mtrl_picker_fullscreen;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f118666al) {
            inflate.findViewById(C0126R.C0129id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m100881b(context), -2));
        } else {
            View findViewById = inflate.findViewById(C0126R.C0129id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C0126R.C0129id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m100881b(context), -1));
            Resources resources = requireContext().getResources();
            findViewById2.setMinimumHeight(resources.getDimensionPixelSize(C0126R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(C0126R.dimen.mtrl_calendar_days_of_week_height) + (bhhm.f118673a * resources.getDimensionPixelSize(C0126R.dimen.mtrl_calendar_day_height)) + ((bhhm.f118673a - 1) * resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.mtrl_picker_header_selection_text);
        this.f118668an = textView;
        C1280ps.m19919f((View) textView, 1);
        this.f118656ab = (CheckableImageButton) inflate.findViewById(C0126R.C0129id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.mtrl_picker_title_text);
        CharSequence charSequence = this.f118665ak;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f118664aj);
        }
        this.f118656ab.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f118656ab;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C1391tv.m20459b(context, C0126R.C0127drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C1391tv.m20459b(context, C0126R.C0127drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f118656ab;
        if (this.f118667am != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        C1280ps.m19894a(this.f118656ab, (C1251oq) null);
        mo63758a(this.f118656ab);
        this.f118656ab.setOnClickListener(new bhhg(this));
        this.f118657ac = (Button) inflate.findViewById(C0126R.C0129id.confirm_button);
        if (this.f118655aa.mo71132b()) {
            this.f118657ac.setEnabled(true);
        } else {
            this.f118657ac.setEnabled(false);
        }
        this.f118657ac.setTag("CONFIRM_BUTTON_TAG");
        this.f118657ac.setOnClickListener(new bhhd(this));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new bhhe(this));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f118659ae.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f118660af);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f118655aa);
        bhgm bhgm = new bhgm(this.f118662ah);
        Month month = this.f118663ai.f118648c;
        if (month != null) {
            bhgm.f118603e = Long.valueOf(month.f151178g);
        }
        if (bhgm.f118603e == null) {
            long j = Month.m117562a().f151178g;
            long j2 = bhgm.f118601c;
            if (j2 > j || j > bhgm.f118602d) {
                j = j2;
            }
            bhgm.f118603e = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bhgm.f118604f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(Month.m117564a(bhgm.f118601c), Month.m117564a(bhgm.f118602d), Month.m117564a(bhgm.f118603e.longValue()), (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY")));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f118664aj);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f118665ak);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void}
     arg types: [bhlr, int, int, int, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float, float, float, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void} */
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f118666al) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f118669ao);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f118669ao, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new bhhz(requireDialog(), rect));
        }
        mo63759k();
    }

    public final void onStop() {
        this.f118661ag.f118686ad.clear();
        super.onStop();
    }

    /* renamed from: a */
    public final void mo63758a(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f118656ab.f151200a) {
            str = checkableImageButton.getContext().getString(C0126R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C0126R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f118656ab.setContentDescription(str);
    }
}
