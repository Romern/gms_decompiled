package com.google.android.gms.googlehelp.recommendations;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PopularArticlesContainer extends LinearLayout {

    /* renamed from: a */
    public HelpChimeraActivity f78995a;

    /* renamed from: b */
    public List f78996b;

    /* renamed from: c */
    public aasm f78997c;

    /* renamed from: d */
    public boolean f78998d;

    /* renamed from: e */
    public int f78999e;

    public PopularArticlesContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static final void m66609a(HelpChimeraActivity helpChimeraActivity, int i, String str, String str2) {
        abcx.m47473a(helpChimeraActivity, i, str, 0, str2);
    }

    /* renamed from: b */
    public static boolean m66610b() {
        return aaya.m47229b(cehp.f182683a.mo6606a().mo79140a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public PopularArticlesContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f78998d = false;
        LayoutInflater from = LayoutInflater.from(context);
        if (!m66610b()) {
            i = C0126R.C0128layout.gh_popular_articles_content_deprecated;
        } else {
            i = C0126R.C0128layout.gh_popular_articles_content;
        }
        from.inflate(i, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public final void mo43372a() {
        aasm aasm;
        HelpChimeraActivity helpChimeraActivity = this.f78995a;
        if (helpChimeraActivity != null) {
            HelpConfig helpConfig = helpChimeraActivity.f56986y;
            String v = helpConfig.mo43247v();
            aasm aasm2 = this.f78997c;
            if (aasm2 == null || !aasm2.f56497g.equals(v)) {
                if (!TextUtils.isEmpty(v)) {
                    aasm = aasm.m46882a(v, aasw.m46952a(), helpConfig);
                } else {
                    aasm = null;
                }
                this.f78997c = aasm;
                if (aasm != null) {
                    mo43373a(true);
                    if (!helpConfig.mo43252z() && this.f78998d) {
                        m66609a(this.f78995a, 27, this.f78997c.f56497g, "");
                        return;
                    }
                    return;
                }
                mo43373a(false);
            } else if (!helpConfig.mo43252z() && this.f78998d) {
                m66609a(this.f78995a, 27, this.f78997c.f56497g, "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43373a(boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(C0126R.C0129id.gh_browse_all_articles_title);
        if (materialButton == null) {
            return;
        }
        if (z) {
            materialButton.setVisibility(0);
            materialButton.setOnClickListener(new abev(this));
            return;
        }
        materialButton.setVisibility(8);
    }
}
