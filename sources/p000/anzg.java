package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzg {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static void m65632a(LayoutInflater layoutInflater, View view, boolean z) {
        layoutInflater.inflate(!z ? C0126R.C0128layout.plus_oob_title : C0126R.C0128layout.plus_oob_title_setup_wizard, (ViewGroup) view.findViewById(C0126R.C0129id.title_layout), true);
    }
}
