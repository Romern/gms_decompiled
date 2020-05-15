package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: qpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpj implements qoz {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo24186a(LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        return view == null ? layoutInflater.inflate((int) C0126R.C0128layout.list_item_update, viewGroup, false) : view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24187a() {
        return "";
    }

    /* renamed from: b */
    public final int mo24188b() {
        return 3;
    }
}
