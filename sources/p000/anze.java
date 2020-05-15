package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;

/* renamed from: anze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anze extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    protected anxy f77917a;

    /* renamed from: b */
    private anzd f77918b;

    /* renamed from: a */
    public static anze m65631a(boolean z, String str, String str2, String str3) {
        anze anze = new anze();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_setup_wizard_theme", z);
        bundle.putString("title", str);
        bundle.putString("text", str2);
        bundle.putString("button_text", str3);
        anze.setArguments(bundle);
        return anze;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anzd)) {
            String valueOf = String.valueOf(anzd.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.f77918b = (anzd) activity;
        if (!(activity instanceof anxy)) {
            String valueOf2 = String.valueOf(anxy.class.getSimpleName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf2));
        } else {
            this.f77917a = (anxy) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.back_button) {
            this.f77918b.mo42483f();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = getArguments().getBoolean("is_setup_wizard_theme");
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_oob_upgrade_account_info_fragment, viewGroup, false);
        anzg.m65632a(layoutInflater, inflate, z);
        String string = getArguments().getString("title");
        if (TextUtils.isEmpty(string)) {
            string = getResources().getString(C0126R.string.plus_unified_setup_activity_title);
        }
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(Html.fromHtml(string));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.text_layout);
        ArrayList arrayList = new ArrayList();
        UpgradeAccountEntity.DescriptionEntity descriptionEntity = (UpgradeAccountEntity.DescriptionEntity) getArguments().getParcelable("description");
        if (descriptionEntity != null) {
            arrayList.add(anzh.m65635a(this.f77917a, descriptionEntity.f83075e, descriptionEntity.f83073c, null, null, descriptionEntity.f83074d));
        }
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("errors");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AccountField.ErrorsEntity errorsEntity = (AccountField.ErrorsEntity) parcelableArrayList.get(i2);
                arrayList.add(anzh.m65634a(this.f77917a, errorsEntity.f82682e, errorsEntity.f82680c, errorsEntity.f82681d));
            }
        }
        String string2 = getArguments().getString("text");
        if (!TextUtils.isEmpty(string2)) {
            arrayList.add(Html.fromHtml(string2));
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!z) {
                i = C0126R.C0128layout.plus_oob_upgrade_account_info_view;
            } else {
                i = C0126R.C0128layout.plus_oob_upgrade_account_info_view_setup_wizard;
            }
            TextView textView = (TextView) ((LinearLayout) layoutInflater.inflate(i, (ViewGroup) linearLayout, true)).getChildAt(i3);
            textView.setText((CharSequence) arrayList.get(i3));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Button button = (Button) inflate.findViewById(C0126R.C0129id.back_button);
        button.setOnClickListener(this);
        String string3 = getArguments().getString("button_text");
        if (!TextUtils.isEmpty(string3)) {
            button.setText(string3);
        } else {
            button.setText((int) C0126R.string.plus_oob_done_button_label);
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f77918b = null;
    }
}
