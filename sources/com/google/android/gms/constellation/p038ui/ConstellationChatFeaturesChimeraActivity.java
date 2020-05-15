package com.google.android.gms.constellation.p038ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: com.google.android.gms.constellation.ui.ConstellationChatFeaturesChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstellationChatFeaturesChimeraActivity extends qkh {

    /* renamed from: b */
    private static final sek f30535b = tea.m36798a("chat_features");

    /* renamed from: a */
    static String m22798a(String str, String str2) {
        return String.format("<a href=\"%s\">%s</a>", String.format(str, Locale.getDefault()), str2);
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        f30535b.mo25412b("Building chat features page", new Object[0]);
        Context applicationContext = getApplicationContext();
        bngx a = bngx.m109357a(Pair.create(cdfz.f180729a.mo6606a().mo77464a(), Integer.valueOf((int) C0126R.string.c11n_android_steps)), Pair.create(cdfz.f180729a.mo6606a().mo77474k(), Integer.valueOf((int) C0126R.string.c11n_samsung_steps)));
        svf a2 = sug.mo26094a(applicationContext.getString(C0126R.string.c11n_connected_apps), 0);
        bnre i = a.listIterator();
        int i2 = 0;
        while (i.hasNext()) {
            Pair pair = (Pair) i.next();
            tdc a3 = tdc.m36735a(applicationContext, (String) pair.first, ((Integer) pair.second).intValue());
            if (a3 != null) {
                a2.mo26149a((sui) a3);
                a3.mo26086b(i2);
                i2++;
            }
        }
        tde tde = new tde(applicationContext);
        a2.mo26149a((sui) tde);
        tde.mo26105b(C1212ne.m19667a(applicationContext.getString(C0126R.string.c11n_chat_features_text, m22798a(cdfz.f180729a.mo6606a().mo77467d(), applicationContext.getString(C0126R.string.c11n_chat_features_terms_of_service)), m22798a(cdfz.f180729a.mo6606a().mo77466c(), applicationContext.getString(C0126R.string.c11n_chat_features_privacy)), m22798a(cdfz.f180729a.mo6606a().mo77465b(), applicationContext.getString(C0126R.string.c11n_chat_features_learn_more))), 0));
        tde.mo26086b(i2);
    }
}
