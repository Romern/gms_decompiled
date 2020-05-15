package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.matchstick.data.RegistrationEntity;

/* renamed from: azic */
final /* synthetic */ class azic implements View.OnClickListener {

    /* renamed from: a */
    private final azid f99461a;

    /* renamed from: b */
    private final RegistrationEntity f99462b;

    public azic(azid azid, RegistrationEntity registrationEntity) {
        this.f99461a = azid;
        this.f99462b = registrationEntity;
    }

    public void onClick(View view) {
        azid azid = this.f99461a;
        RegistrationEntity registrationEntity = this.f99462b;
        Context context = azid.getContext();
        String str = registrationEntity.f111077a.f111074a;
        StringBuilder sb = new StringBuilder();
        sb.append(cfeo.f183719a.mo6606a().mo80986at());
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
            sb2.append("/u/");
            sb2.append(str);
            sb2.append("/phone");
            sb.append(sb2.toString());
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }
}
