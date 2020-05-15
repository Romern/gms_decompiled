package p000;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.data.RegistrationEntity;
import com.google.android.libraries.matchstick.p091ui.SettingsAccountItemView;
import java.util.ArrayList;

/* renamed from: azid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azid extends Fragment {

    /* renamed from: a */
    private static final LinearLayout.LayoutParams f99463a = new LinearLayout.LayoutParams(-1, -2);

    /* renamed from: b */
    private LayoutInflater f99464b;

    /* renamed from: c */
    private ArrayList f99465c;

    /* renamed from: a */
    private final SettingsAccountItemView m85777a() {
        if (this.f99464b == null) {
            this.f99464b = (LayoutInflater) getContext().getSystemService("layout_inflater");
        }
        return (SettingsAccountItemView) this.f99464b.inflate((int) C0126R.C0128layout.ms_settings_account_item, (ViewGroup) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C1353sk.m20238o();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ms_settings_accounts, viewGroup, false);
        this.f99464b = layoutInflater;
        int i2 = 1;
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(new int[]{16842801});
        int color = obtainStyledAttributes.getColor(0, C1133kh.m17843b(getContext(), C0126R.color.quantum_white_100));
        obtainStyledAttributes.recycle();
        inflate.setBackgroundColor(color);
        Bundle arguments = getArguments();
        ArrayList arrayList = new ArrayList();
        if (!(arguments == null || arguments.getParcelableArrayList("all_accounts_extra") == null || arguments.getParcelableArrayList("all_accounts_extra").isEmpty())) {
            arrayList.addAll(arguments.getParcelableArrayList("all_accounts_extra"));
        }
        this.f99465c = arrayList;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.account_items_container);
        ArrayList arrayList2 = this.f99465c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            azoj.m85932b("AccountFragment", "Account entities are not initialized properly.", new Object[0]);
        } else {
            linearLayout.removeAllViews();
            if (this.f99465c.get(0) == null || ((RegistrationEntity) this.f99465c.get(0)).f111077a != null || ((RegistrationEntity) this.f99465c.get(0)).f111078b == null || ((RegistrationEntity) this.f99465c.get(0)).f111078b.get(0) == null) {
                i2 = 0;
            } else {
                SettingsAccountItemView a = m85777a();
                a.mo60432b(azot.m85964a(((LocalEntityId) ((RegistrationEntity) this.f99465c.get(0)).f111078b.get(0)).f111074a, (TelephonyManager) getContext().getSystemService("phone")));
                a.mo60430a(((LocalEntityId) ((RegistrationEntity) this.f99465c.get(0)).f111078b.get(0)).f111074a);
                a.mo60431b((int) C0126R.string.registered_number);
                a.f111252a.setContentDescription(getString(C0126R.string.registered_number));
                a.mo60428a();
                m85778a(a.findViewById(C0126R.C0129id.item_text_layout));
                linearLayout.addView(a, f99463a);
            }
            if (!(this.f99465c.size() <= i || this.f99465c.get(i) == null || ((RegistrationEntity) this.f99465c.get(i)).f111077a == null)) {
                SettingsAccountItemView a2 = m85777a();
                a2.mo60431b((int) C0126R.string.google_accounts);
                a2.mo60429a(C1133kh.m17843b(getContext(), C0126R.color.quantum_googblue500));
                m85778a(a2.findViewById(C0126R.C0129id.item_text_layout));
                linearLayout.addView(a2, f99463a);
                while (i < this.f99465c.size()) {
                    RegistrationEntity registrationEntity = (RegistrationEntity) this.f99465c.get(i);
                    if (registrationEntity.f111077a != null) {
                        SettingsAccountItemView a3 = m85777a();
                        a3.mo60432b(registrationEntity.f111077a.f111074a);
                        linearLayout.addView(a3, f99463a);
                        ArrayList arrayList3 = registrationEntity.f111078b;
                        if (arrayList3 != null) {
                            int size = arrayList3.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                LocalEntityId localEntityId = (LocalEntityId) arrayList3.get(i3);
                                SettingsAccountItemView a4 = m85777a();
                                a4.mo60432b(azot.m85964a(localEntityId.f111074a, (TelephonyManager) getContext().getSystemService("phone")));
                                a4.mo60430a(localEntityId.f111074a);
                                linearLayout.addView(a4, f99463a);
                            }
                        }
                        SettingsAccountItemView a5 = m85777a();
                        if (i == this.f99465c.size() - 1) {
                            a5.mo60428a();
                        } else {
                            a5.f111253b.setVisibility(0);
                        }
                        a5.mo60431b((int) C0126R.string.manage_account);
                        a5.mo60429a(C1133kh.m17843b(getContext(), C0126R.color.quantum_googblue500));
                        a5.setOnClickListener(new azic(this, registrationEntity));
                        linearLayout.addView(a5, f99463a);
                        i++;
                    } else {
                        i++;
                    }
                }
            }
        }
        return inflate;
    }

    /* renamed from: a */
    private static void m85778a(View view) {
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            view.requestLayout();
        }
    }
}
