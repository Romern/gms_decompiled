package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: axhw */
final /* synthetic */ class axhw implements View.OnClickListener {

    /* renamed from: a */
    private final axic f95964a;

    public axhw(axic axic) {
        this.f95964a = axic;
    }

    public void onClick(View view) {
        axic axic = this.f95964a;
        axic.mo53157a(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE);
        axic.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(axic.getArguments().getString("pin_reset_url", "https://accounts.google.com/ResetPin"))).addFlags(536870912).addFlags(67108864));
    }
}
