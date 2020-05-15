package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bjpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpu extends ArrayAdapter {

    /* renamed from: a */
    final int f123112a;

    /* renamed from: b */
    public final C1246ol f123113b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public bjpu(Context context, C1246ol olVar) {
        super(context, (int) C0126R.C0128layout.wallet_view_phone_input_spinner_item, (int) C0126R.C0129id.dropdown_description, r0);
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(olVar.mo15640c());
        int c = olVar.mo15640c();
        for (int i = 0; i < c; i++) {
            int b = olVar.mo15638b(i);
            List<String> list = (List) olVar.mo15641c(i);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (String str : list) {
                    arrayList.add(new bjpw(String.valueOf(b), str));
                }
            } else {
                arrayList = null;
            }
            arrayList2.addAll(arrayList);
        }
        Collections.sort(arrayList2, new bjpv(Collator.getInstance(Locale.getDefault())));
        this.f123113b = olVar;
        int c2 = olVar.mo15640c();
        int i2 = 0;
        for (int i3 = 0; i3 < c2; i3++) {
            int b2 = this.f123113b.mo15638b(i3);
            if (b2 > i2) {
                i2 = b2;
            }
        }
        this.f123112a = ((int) Math.log10((double) i2)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo65439a(String str) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (TextUtils.equals(str, ((bjpw) getItem(i)).f123115a)) {
                return i;
            }
        }
        return -1;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        ((TextView) dropDownView.findViewById(C0126R.C0129id.dropdown_description)).setText(((bjpw) getItem(i)).f123118d);
        return dropDownView;
    }
}
