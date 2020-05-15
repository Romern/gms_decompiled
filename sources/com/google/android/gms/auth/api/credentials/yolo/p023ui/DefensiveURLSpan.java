package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.DefensiveURLSpan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DefensiveURLSpan extends URLSpan {

    /* renamed from: a */
    private boolean f10195a;

    public DefensiveURLSpan(String str, boolean z) {
        super(str);
        this.f10195a = z;
    }

    public void onClick(View view) {
        try {
            super.onClick(view);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(view.getContext(), view.getResources().getString(C0126R.string.common_no_browser_found), 1).show();
            Log.e("CredentialsApi", "Cannot find the activity.", e);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f10195a);
    }
}
