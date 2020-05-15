package com.google.android.gms.udc.p077ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URISyntaxException;

/* renamed from: com.google.android.gms.udc.ui.UdcAuthUrlSpan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcAuthUrlSpan extends URLSpan {

    /* renamed from: c */
    private static final srn f109397c = srn.m36124a();

    /* renamed from: a */
    public final boolean f109398a;

    /* renamed from: b */
    public String f109399b;

    /* renamed from: d */
    private final String f109400d;

    /* renamed from: e */
    private final avin f109401e;

    public UdcAuthUrlSpan(String str, String str2, boolean z, avin avin) {
        super(str);
        this.f109400d = str2;
        this.f109398a = z;
        this.f109401e = avin;
    }

    /* renamed from: a */
    private final Intent m93678a(Context context) {
        if (TextUtils.isEmpty(this.f109400d)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(this.f109400d, 0);
            if (spn.m35860a(context, parseUri)) {
                return parseUri;
            }
        } catch (URISyntaxException e) {
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f109400d));
        if (!this.f109398a || TextUtils.isEmpty(this.f109399b)) {
            return intent;
        }
        intent.putExtra("com.google.android.gms.udc.ACCOUNT_NAME", this.f109399b);
        return intent;
    }

    public final String getURL() {
        if (!this.f109398a || stm.m36302d(this.f109399b)) {
            return super.getURL();
        }
        return avji.m78610a(this.f109399b, super.getURL()).toString();
    }

    public void onClick(View view) {
        avho avho;
        int i;
        Context context = view.getContext();
        Intent a = m93678a(context);
        if (a != null && spn.m35860a(context, a)) {
            try {
                context.startActivity(a);
                return;
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) f109397c.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.udc.ui.UdcAuthUrlSpan", "onClick", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Can't launch activity");
            }
        }
        String url = super.getURL();
        avjn avjn = new avjn(context, this.f109399b);
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof avho)) {
                if (!(context2 instanceof ContextWrapper)) {
                    avho = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            } else {
                avho = (avho) context2;
                break;
            }
        }
        if (avho != null) {
            i = avho.mo51239b();
        } else {
            i = 0;
        }
        avin avin = this.f109401e;
        if (avin == null) {
            avin = new avin(context, new avij(context));
        }
        avim a2 = avin.mo51273a(url, this.f109399b);
        bsoy bsoy = a2.f93234b;
        boolean z = a2.f93233a;
        bxvd da = bsou.f146425e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsou bsou = (bsou) da.f164949b;
        bsou.f146429c = bsoy.f146451d;
        int i2 = bsou.f146427a | 2;
        bsou.f146427a = i2;
        int i3 = i2 | 4;
        bsou.f146427a = i3;
        bsou.f146430d = z;
        if (url != null) {
            url.getClass();
            bsou.f146427a = i3 | 1;
            bsou.f146428b = url;
        }
        bxvd da2 = bspq.f146567d.mo74144da();
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.UDC_MOBILE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i4 = bspp.f146555a | 1;
        bspp.f146555a = i4;
        bspp.f146557c = 29021;
        int i5 = i4 | 2;
        bspp.f146555a = i5;
        bspp.f146555a = i5 | 16;
        bspp.f146560f = false;
        bxvd da3 = bsph.f146490m.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsph bsph = (bsph) da3.f164949b;
        bsou bsou2 = (bsou) da.mo74062i();
        bsou2.getClass();
        bsph.f146503l = bsou2;
        bsph.f146492a |= 4096;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        bsph bsph2 = (bsph) da3.mo74062i();
        bsph2.getClass();
        bspp2.f146564j = bsph2;
        bspp2.f146555a |= 1024;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspq bspq = (bspq) da2.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        avjn.mo51295a((bspq) da2.mo74062i(), i);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("main_url", super.getURL());
        a.mo25396a("url", getURL());
        a.mo25396a("dataAvRef", this.f109400d);
        a.mo25396a("needsAuth", Boolean.valueOf(this.f109398a));
        a.mo25396a("accountName", this.f109399b);
        return a.toString();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
