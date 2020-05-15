package p000;

import com.google.android.gms.smart_profile.SmartProfilePerson;

/* renamed from: aqqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqqf implements aqwl {

    /* renamed from: a */
    final /* synthetic */ aqqg f86591a;

    public aqqf(aqqg aqqg) {
        this.f86591a = aqqg;
    }

    /* renamed from: a */
    public final void mo48069a(SmartProfilePerson smartProfilePerson) {
        aqqg aqqg = this.f86591a;
        aqqe aqqe = new aqqe(aqqg, smartProfilePerson, aqqg.f86592a);
        this.f86591a.setListAdapter(aqqe);
        aqqe.notifyDataSetChanged();
    }
}
