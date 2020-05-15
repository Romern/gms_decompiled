package p000;

import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajiu */
public final /* synthetic */ class ajiu implements aubw {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70724a;

    public ajiu(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70724a = contactSelectChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.view.SelectionSlider.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.nearby.sharing.view.SelectionSlider.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.gms.nearby.sharing.view.SelectionSlider.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity, java.lang.String):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(android.view.View, java.lang.Object):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.util.List, boolean):void
      ajui.a(android.view.View, java.lang.Object):void
      ajwc.a(java.util.List, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70724a;
        Integer num = (Integer) obj;
        contactSelectChimeraActivity.f80861e.mo44664a(contactSelectChimeraActivity.f80862f.mo38930b(num), false);
        contactSelectChimeraActivity.mo44408a(num.intValue());
        contactSelectChimeraActivity.mo44409a((String) null, true);
    }
}
