package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: jxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxg extends jxa {

    /* renamed from: b */
    public static final imr f23444b = imr.m15727a("title_res_id");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        imi imi = (imi) layoutInflater.inflate((int) C0126R.C0128layout.auth_progress_dialog, viewGroup, false);
        ims ims = this.f23439a;
        if (ims != null) {
            Integer num = (Integer) ims.mo13146a(f23444b);
            if (num != null) {
                imi.mo7879a(getString(num.intValue()));
            }
            return imi;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }
}
