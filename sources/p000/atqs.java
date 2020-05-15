package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity;
import java.util.List;

/* renamed from: atqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqs extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ SelectUntokenizedCardChimeraActivity f90686a;

    /* renamed from: b */
    private final LayoutInflater f90687b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public atqs(SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity, Context context, List list) {
        super(context, 0, list);
        this.f90686a = selectUntokenizedCardChimeraActivity;
        this.f90687b = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a;
        btjq btjq = (btjq) getItem(i);
        if (view == null) {
            view = this.f90687b.inflate((int) C0126R.C0128layout.tp_select_untokenized_card_item, viewGroup, false);
        }
        view.setTag(btjq);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.label);
        RadioButton radioButton = (RadioButton) view.findViewById(C0126R.C0129id.left_icon_radio);
        boolean z = true;
        C1321rf.m20065a(radioButton, new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{this.f90686a.getResources().getColor(C0126R.color.google_grey600), azxe.m86324a(getContext(), C0126R.attr.colorAccent)}));
        textView.setText(btjq.f149165b);
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.ineligibleLabel);
        int a2 = atyg.m76547a(getContext(), C0126R.attr.colorOnBackground);
        SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity = this.f90686a;
        int i2 = SelectUntokenizedCardChimeraActivity.f108831o;
        int i3 = 8;
        if (!selectUntokenizedCardChimeraActivity.f108835d) {
            textView.setTextColor(getContext().getResources().getColor(a2));
            textView2.setVisibility(8);
        } else {
            btjo btjo = btjq.f149167d;
            if (btjo == null || (a = btjn.m116843a(btjo.f149155a)) == 0 || a != 3) {
                z = false;
            }
            Resources resources = getContext().getResources();
            if (z) {
                a2 = C0126R.color.quantum_black_hint_text;
            }
            textView.setTextColor(resources.getColor(a2));
            if (z) {
                i3 = 0;
            }
            textView2.setVisibility(i3);
        }
        view.setOnClickListener(this.f90686a.f108837f);
        boolean equals = btjq.equals(this.f90686a.f108833b);
        radioButton.setChecked(equals);
        if (equals) {
            ((RadioButton) this.f90686a.f108836e.findViewById(C0126R.C0129id.left_icon_radio)).setChecked(false);
        }
        return view;
    }
}
