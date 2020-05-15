package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.WebViewLayout;

/* renamed from: bkgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgf extends bkbq {
    /* renamed from: a */
    public static bkgf m105678a(String str, int i) {
        if (!((Boolean) bjwe.f123492m.mo54082a()).booleanValue() || (!TextUtils.isEmpty(str) && str.startsWith("https://"))) {
            Bundle a = bkbq.m105268a(i);
            a.putString("url", str);
            bkgf bkgf = new bkgf();
            bkgf.setArguments(a);
            return bkgf;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("web view url should start form 'https', url : ") : "web view url should start form 'https', url : ".concat(valueOf));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final Dialog mo9306a() {
        WebViewLayout webViewLayout = (WebViewLayout) mo65816c().inflate((int) C0126R.C0128layout.view_web_view_layout, (ViewGroup) null, false);
        webViewLayout.mo72119a(getArguments().getString("url"), (String) null);
        bkbj bkbj = new bkbj(mo65815b());
        bkbj.mo65783b(webViewLayout);
        bkbj.mo65782b((int) C0126R.string.wallet_uic_close, (DialogInterface.OnClickListener) null);
        return bkbj.mo65776a();
    }
}
