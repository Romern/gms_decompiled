package com.google.android.gms.common.account;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseAccountChipAccountPickerChimeraActivity$2 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ Resources.Theme f30093a;

    /* renamed from: b */
    final /* synthetic */ int f30094b;

    /* renamed from: c */
    final /* synthetic */ Context f30095c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAccountChipAccountPickerChimeraActivity$2(String str, Resources.Theme theme, int i, Context context) {
        super(str);
        this.f30093a = theme;
        this.f30094b = i;
        this.f30095c = context;
    }

    public void onClick(View view) {
        Context context = this.f30095c;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getURL()));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Toast.makeText(context, context.getResources().getString(C0126R.string.common_no_browser_found), 1).show();
        rhb.f42954b.mo25418e("no handler found for credentials management url", new Object[0]);
    }

    public final void updateDrawState(TextPaint textPaint) {
        TypedArray obtainStyledAttributes = this.f30093a.obtainStyledAttributes(this.f30094b, new int[]{C0126R.attr.common_account_link_color});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}
