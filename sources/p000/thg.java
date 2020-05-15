package p000;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: thg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thg extends DialogFragment {
    /* renamed from: a */
    private final View.OnClickListener m36960a(Intent intent) {
        return new thf(this, intent);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bhia bhia = new bhia(getActivity(), 2132018790);
        bhia.mo63791f(getArguments().getInt("titleId"));
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contactInfoOptions");
        String string = getArguments().getString("viewerAccountName");
        int i = getArguments().getInt("quickActionType");
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.gm_contact_info_dialog, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0126R.C0129id.entries);
        if (i == 0) {
            int i2 = 0;
            while (i2 < parcelableArrayList.size()) {
                String string2 = ((Bundle) parcelableArrayList.get(i2)).getString("extraValue");
                String string3 = ((Bundle) parcelableArrayList.get(i2)).getString("extraFormattedType");
                thb a = m36961a(string2, string3, ((Bundle) parcelableArrayList.get(i2)).getString("extraSourceContext"));
                i2++;
                a.f46003f = getActivity().getString(C0126R.string.contact_info_phone_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(parcelableArrayList.size()), string3, string2});
                a.f46001d = C1391tv.m20459b(getActivity(), C0126R.C0127drawable.quantum_ic_call_vd_theme_24);
                a.f46006i = m36960a(thc.m36957a(string2));
                viewGroup2.addView(a.mo26505a(getActivity(), viewGroup2));
            }
        } else if (i == 1) {
            m36963a(parcelableArrayList, string, 1, viewGroup2);
        } else if (i == 2) {
            m36963a(parcelableArrayList, string, 2, viewGroup2);
        }
        bhia.mo63787d(viewGroup);
        return bhia.mo15904b();
    }

    /* renamed from: a */
    private static final thb m36961a(String str, String str2, String str3) {
        thb a = thb.m36953a();
        a.f45998a = str;
        if (!TextUtils.isEmpty(str2)) {
            a.f45999b = str2;
            a.f46000c = str3;
        } else {
            a.f45999b = str3;
        }
        return a;
    }

    /* renamed from: a */
    public static thg m36962a(int i, int i2, String str, ArrayList arrayList) {
        boolean z;
        boolean z2 = true;
        if (arrayList != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Must provide contact info to disambiguate.");
        if (arrayList.size() < 2) {
            z2 = false;
        }
        sdo.m34975b(z2, "Must have at least two options to disambiguate.");
        thg thg = new thg();
        Bundle bundle = new Bundle();
        bundle.putInt("titleId", i);
        bundle.putInt("quickActionType", i2);
        bundle.putString("viewerAccountName", str);
        bundle.putParcelableArrayList("contactInfoOptions", arrayList);
        thg.setArguments(bundle);
        return thg;
    }

    /* renamed from: a */
    private final void m36963a(List list, String str, int i, ViewGroup viewGroup) {
        int i2 = 0;
        while (i2 < list.size()) {
            String string = ((Bundle) list.get(i2)).getString("extraValue");
            String string2 = ((Bundle) list.get(i2)).getString("extraFormattedType");
            thb a = m36961a(string, string2, ((Bundle) list.get(i2)).getString("extraSourceContext"));
            i2++;
            a.f46003f = getActivity().getString(C0126R.string.contact_info_email_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(list.size()), string2, string});
            a.f46001d = C1391tv.m20459b(getActivity(), C0126R.C0127drawable.quantum_gm_ic_email_vd_theme_24);
            if (i == 1) {
                a.f46006i = m36960a(thc.m36958a(string, str));
            } else {
                a.f46006i = m36960a(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", string));
            }
            viewGroup.addView(a.mo26505a(getActivity(), viewGroup));
        }
    }
}
