package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: vof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vof extends vnt {

    /* renamed from: b */
    private final Collator f49640b;

    public vof(String str) {
        super(str, C0126R.string.drive_document_title, true);
        Collator instance = Collator.getInstance(Locale.getDefault());
        this.f49640b = instance;
        instance.setStrength(0);
    }

    /* renamed from: a */
    public final vnz mo28676a(txb txb, Context context) {
        int a = m40895a(txb);
        int a2 = txb.mo24660a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vnx(context.getString(C0126R.string.drive_fast_scroll_title_grouper_collections), a));
        arrayList.add(new vnx(context.getString(C0126R.string.drive_title_grouper_files), a2 - a));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new vnx(context.getString(C0126R.string.drive_fast_scroll_title_grouper_collections), a));
        String valueOf = String.valueOf(context.getString(C0126R.string.drive_alphabet_set));
        String str = valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf);
        ArrayList arrayList3 = new ArrayList(str.length());
        int i = 0;
        while (i < str.length()) {
            int offsetByCodePoints = str.offsetByCodePoints(i, 1);
            arrayList3.add(str.substring(i, offsetByCodePoints));
            i = offsetByCodePoints;
        }
        Collections.sort(arrayList3, this.f49640b);
        Iterator it = arrayList3.iterator();
        String str2 = (String) it.next();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            int a3 = txb.mo24660a();
            int i2 = a;
            while (a3 > i2) {
                int i3 = (a3 + i2) / 2;
                if (this.f49640b.compare(txb.mo24661a(i3).mo26858d(), str3) < 0) {
                    i2 = i3 + 1;
                } else {
                    a3 = i3;
                }
            }
            arrayList2.add(new vnx(str2, i2 - a));
            str2 = str3;
            a = i2;
        }
        arrayList2.add(new vnx(str2, a2 - a));
        return new vnz(arrayList, arrayList2, txb);
    }

    /* renamed from: a */
    public final voe mo28677a(Context context) {
        return vod.f49630a.mo28686a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28673a(vge vge) {
        vge.f49229a.add(new FieldWithSortOrder(((uvt) vgg.f49230a).f48653a, true));
    }
}
