package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.widget.ScrollToBottomWebView;

/* renamed from: wrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrd extends Fragment implements wrv {

    /* renamed from: a */
    public byte[] f51161a;

    /* renamed from: b */
    public String f51162b;

    /* renamed from: c */
    public wrc f51163c;

    /* renamed from: d */
    public View f51164d;

    /* renamed from: e */
    public ScrollToBottomWebView f51165e;

    /* renamed from: f */
    private String f51166f;

    /* renamed from: g */
    private String f51167g;

    /* renamed from: h */
    private String f51168h;

    /* renamed from: a */
    public static wrd m42166a(byte[] bArr, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle(5);
        bundle.putByteArray("auditToken", bArr);
        bundle.putString("accountName", str);
        bundle.putString("tosContent", str2);
        bundle.putString("tosContinueButtonText", str3);
        bundle.putString("tosMoreButtonText", str4);
        wrd wrd = new wrd();
        wrd.setArguments(bundle);
        return wrd;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51163c = (wrc) wgq.m41934a(wrc.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51161a = getArguments().getByteArray("auditToken");
        this.f51162b = getArguments().getString("accountName");
        this.f51166f = getArguments().getString("tosContent");
        this.f51167g = getArguments().getString("tosContinueButtonText");
        this.f51168h = getArguments().getString("tosMoreButtonText");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_tos, viewGroup, false);
        this.f51164d = inflate;
        inflate.findViewById(C0126R.C0129id.fm_tos_layout_more_button).setVisibility(0);
        this.f51164d.findViewById(C0126R.C0129id.fm_tos_layout_continue_button).setVisibility(8);
        ScrollToBottomWebView scrollToBottomWebView = (ScrollToBottomWebView) this.f51164d.findViewById(C0126R.C0129id.fm_tos_container);
        this.f51165e = scrollToBottomWebView;
        scrollToBottomWebView.f31482a = this;
        scrollToBottomWebView.setWebViewClient(new wqx(this));
        this.f51165e.loadData(this.f51166f, "text/html; charset=UTF-8", null);
        Button button = (Button) this.f51164d.findViewById(C0126R.C0129id.fm_tos_layout_continue_button);
        button.setText(this.f51167g);
        button.setOnClickListener(new wqz(this));
        Button button2 = (Button) this.f51164d.findViewById(C0126R.C0129id.fm_tos_layout_more_button);
        button2.setText(this.f51168h);
        button2.setOnClickListener(new wra(this));
        return this.f51164d;
    }

    public final void onDestroyView() {
        ScrollToBottomWebView scrollToBottomWebView = this.f51165e;
        if (scrollToBottomWebView != null) {
            scrollToBottomWebView.f31482a = null;
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        this.f51163c = null;
    }
}
