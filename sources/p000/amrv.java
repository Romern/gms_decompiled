package p000;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amrv implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: e */
    public static final /* synthetic */ int f75820e = 0;

    /* renamed from: a */
    public Spinner f75821a;

    /* renamed from: b */
    public CheckBox f75822b;

    /* renamed from: c */
    public final Handler f75823c = new adzt();

    /* renamed from: d */
    public final Runnable f75824d = new amro(this);

    /* renamed from: f */
    private rkb f75825f;

    /* renamed from: g */
    private WebView f75826g;

    static {
        rjo rjo = allr.f73629a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo41282a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.people_settings, viewGroup, false);
        this.f75821a = (Spinner) inflate.findViewById(C0126R.C0129id.show_notification_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(viewGroup.getContext(), C0126R.C0128layout.people_setting_spinner_view);
        arrayAdapter.add("GServices default");
        arrayAdapter.add("Disable");
        arrayAdapter.add("Enable");
        this.f75821a.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f75821a.setOnItemSelectedListener(this);
        this.f75821a.setEnabled(false);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.force_verbose_log);
        this.f75822b = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        WebView webView = (WebView) inflate.findViewById(C0126R.C0129id.text_view);
        this.f75826g = webView;
        webView.getSettings().setBuiltInZoomControls(true);
        this.f75826g.setWebViewClient(new amrp(this));
        return inflate;
    }

    /* renamed from: b */
    public final void mo41288b() {
        this.f75823c.removeCallbacks(this.f75824d);
    }

    /* renamed from: c */
    public final void mo41289c() {
        this.f75826g.pageDown(true);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f75825f.mo24805i()) {
            Bundle bundle = new Bundle();
            bundle.putString("internal_call_method", "SET_FORCE_VERBOSE_LOG");
            bundle.putBoolean("internal_call_arg_1", z);
            amdd.m62643a(this.f75825f, bundle).mo9458a(new amru());
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f75825f.mo24805i()) {
            Bundle bundle = new Bundle();
            bundle.putString("internal_call_method", "SET_SHOW_SYNC_NOTIFICATION_ERROR");
            bundle.putInt("internal_call_arg_1", i);
            amdd.m62643a(this.f75825f, bundle).mo9458a(new amrt());
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* renamed from: a */
    public final void mo41283a() {
        Bundle bundle = new Bundle();
        bundle.putString("internal_call_method", "LOAD_LOG");
        amdd.m62643a(this.f75825f, bundle).mo9458a(new amrq(this));
        mo41287a("Loading log...");
        Bundle bundle2 = new Bundle();
        bundle2.putString("internal_call_method", "GET_SHOW_SYNC_NOTIFICATION_ERROR");
        amdd.m62643a(this.f75825f, bundle2).mo9458a(new amrr(this));
        Bundle bundle3 = new Bundle();
        bundle3.putString("internal_call_method", "GET_FORCE_VERBOSE_LOG");
        amdd.m62643a(this.f75825f, bundle3).mo9458a(new amrs(this));
    }

    /* renamed from: a */
    public final void mo41284a(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(C0126R.C0130menu.people_settings_menu, menu);
    }

    /* renamed from: a */
    public final void mo41285a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.scroll_to_top) {
            this.f75826g.pageUp(true);
        } else if (itemId == C0126R.C0129id.scroll_to_end) {
            mo41289c();
        }
    }

    /* renamed from: a */
    public final void mo41286a(deu deu) {
        sex.m35104a(deu).mo25440a(1);
        deu.setTitle("People debug");
        deu.mo8628aW().mo15853b(true);
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        rjy rjy = new rjy(deu.getApplicationContext());
        rjy.mo24780a(allr.f73629a, a);
        rjy.mo24775a(deu, 0, null);
        this.f75825f = rjy.mo24784b();
    }

    /* renamed from: a */
    public final void mo41287a(String str) {
        String htmlEncode = TextUtils.htmlEncode(str);
        StringBuilder sb = new StringBuilder(String.valueOf(htmlEncode).length() + 37);
        sb.append("<html><body><pre>");
        sb.append(htmlEncode);
        sb.append("</pre></body></html>");
        this.f75826g.loadDataWithBaseURL("", sb.toString(), "text/html", "UTF-8", "");
    }
}
