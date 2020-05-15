package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajuy extends ajuk {

    /* renamed from: f */
    public int f71344f = 0;

    /* renamed from: g */
    private final ajiw f71345g;

    public ajuy(Context context, ajiw ajiw) {
        super(context, ajiw);
        this.f71345g = ajiw;
    }

    /* renamed from: g */
    public final void mo38953g(int i) {
        this.f71344f = i;
        mo171aJ();
        ajiw ajiw = this.f71345g;
        int i2 = this.f71344f;
        int i3 = 2;
        if (i2 != 1) {
            i3 = i2 != 2 ? 1 : 0;
        }
        ajiw.f70726a.f80866j.mo38899a(i3);
        if (i3 != 0) {
            ContactSelectChimeraActivity contactSelectChimeraActivity = ajiw.f70726a;
            if (i3 != 1) {
                contactSelectChimeraActivity.f80864h.mo38941b(true);
            } else {
                contactSelectChimeraActivity.f80864h.mo38941b(false);
            }
            ContactSelectChimeraActivity contactSelectChimeraActivity2 = ajiw.f70726a;
            if (cfov.m142031G()) {
                aucb b = contactSelectChimeraActivity2.mo44411g().mo38893G().mo50382b(new ajip(contactSelectChimeraActivity2));
                b.mo50373a(new ajiq(contactSelectChimeraActivity2));
                b.mo50372a(new ajir(contactSelectChimeraActivity2));
            }
        }
        ajiw.f70726a.mo44408a(i3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new ajux(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.sharing_list_item_visibility, viewGroup, false));
    }
}
