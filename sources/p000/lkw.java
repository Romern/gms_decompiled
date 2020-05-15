package p000;

import android.graphics.drawable.Icon;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: lkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lkw extends lqn {

    /* renamed from: a */
    final /* synthetic */ lkx f26270a;

    public lkw(lkx lkx) {
        this.f26270a = lkx;
    }

    /* renamed from: a */
    public final void mo15225a(String str) {
        Locale locale = Locale.getDefault();
        this.f26270a.f26160b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsActivityControllerfilterQuery", str);
        if (str == null || str.isEmpty()) {
            mo15378a(this.f26270a.f26277g);
        } else {
            String lowerCase = str.toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            List list = this.f26270a.f26277g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kct kct = (kct) list.get(i);
                Credential credential = (Credential) kct.mo14368a();
                String charSequence = krc.m18382a(this.f26270a.f26159a).mo14833h().mo14764a(credential.f11610c).f24745a.toString();
                String str2 = credential.f11608a;
                if (charSequence.toLowerCase(locale).contains(lowerCase) || str2.toLowerCase(locale).contains(lowerCase)) {
                    arrayList.add(kct);
                }
            }
            mo15378a(arrayList);
        }
        mo171aJ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15226a(lqm lqm, Object obj) {
        kct kct = (kct) obj;
        Credential credential = (Credential) kct.mo14368a();
        kcs b = kct.mo14369b();
        String valueOf = String.valueOf(b.mo14375b());
        String valueOf2 = String.valueOf(b.mo14374a());
        String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        kpj a = krc.m18382a(this.f26270a.f26159a).mo14833h().mo14764a(credential.f11610c);
        kcz kcz = a.f24746b;
        if (kcz != null) {
            kco kco = (kco) kcz;
            lqm.f26601s.setImageIcon(Icon.createWithResource(kco.f23825a, kco.f23826b));
            lqm.f26601s.setContentDescription(kco.f23827c);
        } else if (credential.f11610c instanceof kck) {
            kcz a2 = kda.m17662a();
            lqm.f26601s.setImageIcon(Icon.createWithResource(a2.mo14379a(), a2.mo14380b()));
            lqm.f26601s.setImportantForAccessibility(2);
        } else {
            kco kco2 = (kco) kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_chrome_product_grey600_36, "");
            lqm.f26601s.setImageIcon(Icon.createWithResource(kco2.f23825a, kco2.f23826b));
            lqm.f26601s.setImportantForAccessibility(2);
        }
        lqm.f26603u.setText(a.f24745a);
        lqm.f26604v.setText(credential.f11608a);
        int applyDimension = (int) TypedValue.applyDimension(1, 32.0f, this.f26270a.f26159a.getResources().getDisplayMetrics());
        lqm.f26601s.setMaxHeight(applyDimension);
        lqm.f26601s.setMaxWidth(applyDimension);
        lqm.f26602t.setContentDescription(this.f26270a.f26276f.mo15386b(C0126R.string.common_more_options));
        lqm.f26602t.setAlpha(0.54f);
        this.f26270a.f26275e.mo15233a(lqm, str, kct);
    }
}
