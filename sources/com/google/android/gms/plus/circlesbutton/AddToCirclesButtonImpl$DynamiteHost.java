package com.google.android.gms.plus.circlesbutton;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.people.data.AudienceMember;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddToCirclesButtonImpl$DynamiteHost extends antd {

    /* renamed from: a */
    private ansp f82340a;

    /* renamed from: a */
    private final void m68411a() {
        sdo.m34975b(this.f82340a != null, "call initialize() first");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    public void configure(String str, String str2, AudienceMember audienceMember, String str3, antg antg) {
        int i;
        m68411a();
        ansp ansp = this.f82340a;
        ansp.f77604h = str;
        ansp.f77605i = str2;
        ansp.f77601e = audienceMember;
        ansp.f77609m = str3;
        if (!TextUtils.isEmpty(str3)) {
            try {
                i = Integer.parseInt(str3);
            } catch (NumberFormatException e) {
            }
            ansp.f77612p = false;
            ansp.f77613q = 0;
            ansp.f77610n = "sg";
            ansp.f77611o = 0;
            ansp.mo42187a();
            ansp.f77636v = antg;
            if (ansp.f77599c == null) {
                rjy rjy = new rjy(ansp.f77597a, ansp, ansp);
                rjo rjo = allr.f73629a;
                allp allp = new allp();
                allp.f73626a = i;
                rjy.mo24780a(rjo, allp.mo40491a());
                ansp.f77599c = rjy.mo24784b();
            }
            ansp.f77598b = new ansu(ansp.f77599c, ansp.f77604h, ansp.f77605i, ansp);
            rjy rjy2 = new rjy(ansp.f77597a);
            rjy2.mo24779a(ankt.f77031a);
            rjy2.mo24778a(ansp.f77604h);
            ansp.f77600d = rjy2.mo24784b();
            ansp.f77600d.mo24801e();
            new adzt().postDelayed(new ansm(ansp), 500);
            if (ansp.f77606j) {
                return;
            }
            if (ansp.f77599c.mo24805i()) {
                ansp.f77598b.mo42203a();
                ansp.mo42189c();
                return;
            }
            ansp.f77599c.mo24801e();
            return;
        }
        i = 0;
        ansp.f77612p = false;
        ansp.f77613q = 0;
        ansp.f77610n = "sg";
        ansp.f77611o = 0;
        ansp.mo42187a();
        ansp.f77636v = antg;
        if (ansp.f77599c == null) {
        }
        ansp.f77598b = new ansu(ansp.f77599c, ansp.f77604h, ansp.f77605i, ansp);
        rjy rjy22 = new rjy(ansp.f77597a);
        rjy22.mo24779a(ankt.f77031a);
        rjy22.mo24778a(ansp.f77604h);
        ansp.f77600d = rjy22.mo24784b();
        ansp.f77600d.mo24801e();
        new adzt().postDelayed(new ansm(ansp), 500);
        if (ansp.f77606j) {
        }
    }

    public vzr getView() {
        m68411a();
        return vzs.m41642a(this.f82340a);
    }

    public void initialize(vzr vzr, vzr vzr2, vzr vzr3) {
        this.f82340a = new ansp((Context) vzs.m41641a(vzr), (Context) vzs.m41641a(vzr2), (AttributeSet) vzs.m41641a(vzr3));
    }

    public void refreshButton() {
        m68411a();
        this.f82340a.mo42189c();
    }

    public void setAnalyticsStartView(String str, int i) {
        m68411a();
        ansp ansp = this.f82340a;
        ansp.f77610n = str;
        ansp.f77611o = i;
        ansp.mo42190d();
    }

    public void setShowProgressIndicator(boolean z) {
        m68411a();
        this.f82340a.mo42188a(z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ansq.a(int, boolean):void
     arg types: [int, int]
     candidates:
      ansq.a(java.lang.String, boolean):void
      ansq.a(int, boolean):void */
    public void setSize(int i) {
        m68411a();
        this.f82340a.mo42194a(i, true);
    }

    public void setType(int i) {
        m68411a();
        ansp ansp = this.f82340a;
        ansp.mo42198c(i);
        ansp.mo42190d();
    }
}
