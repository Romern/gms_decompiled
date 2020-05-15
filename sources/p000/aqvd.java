package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import java.util.ArrayList;

/* renamed from: aqvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvd extends DialogFragment {
    /* renamed from: a */
    public static aqvd m72153a(int i, int i2, String str, ArrayList arrayList) {
        aqvd aqvd = new aqvd();
        Bundle bundle = new Bundle();
        bundle.putInt("titleId", i);
        bundle.putInt("quickActionId", i2);
        bundle.putString("viewerAccountName", str);
        bundle.putParcelableArrayList("contactInfoOptions", arrayList);
        aqvd.setArguments(bundle);
        return aqvd;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Intent intent;
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contactInfoOptions");
        String string = getArguments().getString("viewerAccountName");
        int i = getArguments().getInt("quickActionId");
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.contact_info_dialog, (ViewGroup) null);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0126R.C0129id.entries);
        int i2 = 0;
        while (true) {
            if (i2 >= parcelableArrayList.size()) {
                viewGroup = viewGroup2;
                break;
            }
            String string2 = ((Bundle) parcelableArrayList.get(i2)).getString("extraValue");
            String string3 = ((Bundle) parcelableArrayList.get(i2)).getString("extraFormattedType");
            int i3 = C0126R.C0127drawable.quantum_ic_email_vd_theme_24;
            int i4 = C0126R.string.contact_info_email_content_description;
            if (i != C0126R.C0129id.quick_actions_call) {
                if (i != C0126R.C0129id.quick_actions_email) {
                    if (i != C0126R.C0129id.quick_actions_schedule) {
                        break;
                    }
                    intent = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", string2);
                } else {
                    intent = aqqk.m71972a(string2, string);
                }
            } else {
                intent = aqqk.m71971a(string2);
                i4 = C0126R.string.contact_info_phone_content_description;
                i3 = C0126R.C0127drawable.quantum_ic_call_vd_theme_24;
            }
            i2++;
            String string4 = getActivity().getString(i4, new Object[]{Integer.valueOf(i2), Integer.valueOf(parcelableArrayList.size()), string3, string2});
            View inflate = LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.contact_info_item, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.text);
            tey.m36891a(getActivity(), textView, string2, string3);
            C1334rs.m20107b(textView, C1391tv.m20459b(getActivity(), i3), null, null, null);
            inflate.setContentDescription(string4);
            inflate.setOnClickListener(new aqvc(this, intent));
            viewGroup3.addView(inflate);
        }
        AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle(getArguments().getInt("titleId"));
        if (viewGroup != null) {
            title.setView(viewGroup);
        }
        return title.create();
    }
}
