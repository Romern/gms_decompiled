package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ansp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansp extends ansq implements rjz, rka, alll, anst {

    /* renamed from: x */
    private static int f77595x = -1;

    /* renamed from: y */
    private static int f77596y = -1;

    /* renamed from: a */
    public final Context f77597a;

    /* renamed from: b */
    public ansu f77598b;

    /* renamed from: c */
    public rkb f77599c;

    /* renamed from: d */
    public rkb f77600d;

    /* renamed from: e */
    public AudienceMember f77601e;

    /* renamed from: f */
    public String[] f77602f;

    /* renamed from: g */
    public String f77603g;

    /* renamed from: h */
    public String f77604h;

    /* renamed from: i */
    public String f77605i;

    /* renamed from: j */
    public boolean f77606j;

    /* renamed from: k */
    public boolean f77607k;

    /* renamed from: l */
    public boolean f77608l;

    /* renamed from: m */
    public String f77609m;

    /* renamed from: n */
    public String f77610n;

    /* renamed from: o */
    public int f77611o;

    /* renamed from: p */
    public boolean f77612p;

    /* renamed from: q */
    public int f77613q;

    /* renamed from: w */
    private String f77614w;

    public ansp(Context context, Context context2, AttributeSet attributeSet) {
        super(context, context2, attributeSet);
        this.f77597a = context;
        if (f77595x == -1) {
            f77595x = context2.getResources().getColor(C0126R.color.plus_add_to_circles_header_text_white);
            f77596y = context2.getResources().getColor(C0126R.color.plus_add_to_circles_header_red);
        }
        mo42187a();
        m65110e();
    }

    /* renamed from: e */
    private final void m65110e() {
        mo42196b(4);
        mo42197b(false);
    }

    /* renamed from: f */
    private final void m65111f() {
        alkz alkz = new alkz();
        alkz.f73616b = Arrays.asList(this.f77601e.f30295e);
        rjo rjo = allr.f73629a;
        amcf.m62589a(this.f77599c, this.f77604h, this.f77605i, alkz).mo9458a(new ansn(this));
        alkv alkv = new alkv();
        alkv.f73610b = this.f77614w;
        amcf.m62588a(this.f77599c, this.f77604h, this.f77605i, alkv).mo9458a(new anso(this));
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
    }

    /* renamed from: b */
    public final void mo40489b() {
        m65111f();
    }

    /* renamed from: c */
    public final void mo42189c() {
        rkb rkb = this.f77599c;
        if (rkb == null || !rkb.mo24805i() || this.f77601e == null) {
            m65110e();
            return;
        }
        rjo rjo = allr.f73629a;
        amdg.m62647a(this.f77599c, this, this.f77604h, this.f77605i, 6);
        m65111f();
    }

    /* renamed from: d */
    public final void mo42190d() {
        int length;
        String str;
        if (this.f77607k && this.f77608l) {
            ansu ansu = this.f77598b;
            if (ansu.f77642a) {
                String[] strArr = this.f77602f;
                if (strArr == null || (length = strArr.length) == 0) {
                    m65109a((String) null);
                } else {
                    if (length != 1) {
                        str = this.f77632r.getString(C0126R.string.circle_button_circles, Integer.valueOf(length));
                    } else {
                        str = ansu.mo42202a(strArr[0]);
                    }
                    m65109a(str);
                }
                mo42196b(0);
                mo42197b(true);
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = this.f77602f;
                if (strArr2 != null && (r2 = strArr2.length) > 0) {
                    for (String str2 : strArr2) {
                        arrayList.add(AudienceMember.m22640b(str2, this.f77598b.mo42202a(str2)));
                    }
                }
                if (arrayList.size() <= 0 && this.f77603g != null && this.f77633s == 2) {
                    rqe rqe = new rqe(this.f77604h, this.f77609m);
                    rqe.f43519a.putExtra("EXTRA_PLUS_PAGE_ID", this.f77605i);
                    rqe.f43519a.putExtra("EXTRA_TARGET_CIRCLE_ID", this.f77603g);
                    rqe.f43519a.putExtra("EXTRA_UPDATE_PERSON", this.f77601e);
                    rqe.f43519a.putExtra("EXTRA_START_VIEW_NAMESPACE", this.f77610n);
                    rqe.f43519a.putExtra("EXTRA_START_VIEW_TYPE_NUM", this.f77611o);
                    setTag(rqe.f43519a);
                    return;
                }
                rqa rqa = new rqa("com.google.android.gms.common.acl.UPDATE_CIRCLES");
                rqa.mo25007a(this.f77604h);
                rqa.mo25017c(this.f77605i);
                rqa.mo25013b((List) arrayList);
                rqa.mo25006a(this.f77601e);
                rqa.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_HEADER_TEXT_COLOR", f77595x);
                rqa.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_HEADER_BACKGROUND_COLOR", f77596y);
                rqa.mo25019d(this.f77609m);
                setTag(rqa.f43513a);
            }
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f77598b.mo42203a();
        mo42189c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77606j = true;
        rkb rkb = this.f77599c;
        if (rkb != null) {
            rkb.mo24801e();
        }
        rkb rkb2 = this.f77600d;
        if (rkb2 != null) {
            rkb2.mo24801e();
        }
    }

    public void onClick(View view) {
        super.onClick(view);
        int i = this.f77613q + 1;
        this.f77613q = i;
        if (i > 0 && this.f77600d != null) {
            FavaDiagnosticsEntity favaDiagnosticsEntity = new FavaDiagnosticsEntity(this.f77610n, this.f77611o);
            while (this.f77613q > 0) {
                rjo rjo = ankt.f77031a;
                anwn.m65473a(this.f77600d, this.f77605i, anls.f77086h, favaDiagnosticsEntity);
                this.f77613q--;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        rkb rkb = this.f77599c;
        if (rkb != null) {
            rkb.mo24803g();
        }
        rkb rkb2 = this.f77600d;
        if (rkb2 != null) {
            rkb2.mo24803g();
        }
        this.f77606j = false;
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ansq.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      ansq.a(int, boolean):void
      ansq.a(java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m65109a(String str) {
        super.mo42195a(str, true);
        mo42188a(false);
    }

    /* renamed from: a */
    public final void mo42187a() {
        this.f77607k = false;
        this.f77608l = false;
        this.f77603g = null;
        this.f77614w = this.f77632r.getString(C0126R.string.circle_button_following_circle);
        this.f77602f = null;
        this.f77598b = null;
        this.f77636v = null;
    }

    /* renamed from: a */
    public final void mo42188a(boolean z) {
        if (this.f77635u != z) {
            this.f77635u = z;
            if (!z) {
                ProgressBar progressBar = this.f77634t;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else {
                if (this.f77634t == null) {
                    this.f77634t = new ProgressBar(getContext());
                    this.f77634t.setIndeterminate(true);
                    addView(this.f77634t);
                }
                this.f77634t.setVisibility(0);
            }
            invalidate();
            mo42197b(!z);
        }
    }
}
