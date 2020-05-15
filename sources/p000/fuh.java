package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import java.util.ArrayList;

/* renamed from: fuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuh implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AppInviteChimeraActivity f17266a;

    public fuh(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.f17266a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        AppInviteChimeraActivity appInviteChimeraActivity = this.f17266a;
        Intent intent = new Intent("com.google.android.gms.appinvite.ACTION_PREVIEW");
        intent.setPackage(appInviteChimeraActivity.f9721c);
        intent.putExtra("com.google.android.gms.appinvite.LAYOUT_RES_ID", qkj.m32287a(appInviteChimeraActivity, C0126R.C0128layout.appinvite_preview_activity));
        ArrayList arrayList = new ArrayList();
        intent.putExtra("com.google.android.gms.appinvite.VIEWS", arrayList);
        Bundle bundle = new Bundle();
        bundle.putInt("View_id", qkj.m32287a(appInviteChimeraActivity, C0126R.C0129id.title));
        bundle.putBoolean("TextView_isTitle", true);
        arrayList.add(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("View_id", qkj.m32287a(appInviteChimeraActivity, C0126R.C0129id.title_container));
        bundle2.putInt("View_minHeight", appInviteChimeraActivity.f9723e.getHeight());
        arrayList.add(bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("View_id", qkj.m32287a(appInviteChimeraActivity, C0126R.C0129id.title_close));
        bundle3.putCharSequence("View_onClickListener", "close");
        arrayList.add(bundle3);
        arrayList.add(appInviteChimeraActivity.mo7243a((int) C0126R.C0129id.email_subject, appInviteChimeraActivity.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")));
        arrayList.add(appInviteChimeraActivity.mo7243a((int) C0126R.C0129id.email_message, appInviteChimeraActivity.f9725g.getText()));
        Bundle bundle4 = new Bundle();
        bundle4.putInt("View_id", qkj.m32287a(appInviteChimeraActivity, C0126R.C0129id.email_content));
        bundle4.putString("WebView_data", appInviteChimeraActivity.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"));
        arrayList.add(bundle4);
        if (intent.resolveActivity(appInviteChimeraActivity.getPackageManager()) != null) {
            appInviteChimeraActivity.startActivityForResult(intent, 0);
            appInviteChimeraActivity.overridePendingTransition(C0126R.anim.abc_slide_in_bottom, C0126R.anim.abc_slide_out_bottom);
        }
    }
}
