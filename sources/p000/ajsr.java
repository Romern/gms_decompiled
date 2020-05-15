package p000;

import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

/* renamed from: ajsr */
final /* synthetic */ class ajsr implements roo {

    /* renamed from: a */
    private final CharSequence f71246a;

    public ajsr(CharSequence charSequence) {
        this.f71246a = charSequence;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        CharSequence charSequence = this.f71246a;
        int i = ajty.f71279a;
        akax akax = new akax();
        akax.f71545a.f81126a = charSequence.toString();
        rnt a = ajty.m59007a((aucf) obj2);
        SetDeviceNameParams setDeviceNameParams = akax.f71545a;
        setDeviceNameParams.f81127b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38655a(setDeviceNameParams);
    }
}
