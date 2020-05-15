package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: bjva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjva {
    /* renamed from: a */
    public static Intent m104680a(bmkd bmkd) {
        String str;
        Intent intent = new Intent();
        if (!bmkd.f129788f.isEmpty()) {
            intent.setAction(bmkd.f129788f);
        } else {
            intent.setAction("android.intent.action.VIEW");
        }
        bxwc bxwc = bmkd.f129789g;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            intent.addCategory((String) bxwc.get(i));
        }
        bxwc bxwc2 = bmkd.f129790h;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bmka bmka = (bmka) bxwc2.get(i2);
            String str2 = "";
            if (bmka.f129777b == 3) {
                str = (String) bmka.f129778c;
            } else {
                str = str2;
            }
            if (TextUtils.isEmpty(str)) {
                String str3 = bmka.f129779d;
                if (bmka.f129777b == 2) {
                    str2 = (String) bmka.f129778c;
                }
                intent.putExtra(str3, str2);
            } else {
                String str4 = bmka.f129779d;
                if (bmka.f129777b == 3) {
                    str2 = (String) bmka.f129778c;
                }
                intent.putExtra(str4, str2);
            }
        }
        intent.setPackage(bmkd.f129784b);
        return intent;
    }

    /* renamed from: a */
    public static Intent m104681a(bmkd bmkd, String str) {
        Intent a = m104680a(bmkd);
        a.setData(Uri.parse(str));
        return a;
    }
}
