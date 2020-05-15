package p000;

import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxl implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ fxn f17519a;

    public fxl(fxn fxn) {
        this.f17519a = fxn;
    }

    public final boolean onLongClick(View view) {
        String str;
        ContactPerson contactPerson = (ContactPerson) view.getTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person);
        fxo fxo = this.f17519a.f17521e;
        if (!TextUtils.isEmpty(contactPerson.f9750b)) {
            str = ancm.m64017f(contactPerson.f9750b);
        } else {
            Long l = contactPerson.f9751c;
            if (l == null) {
                ContactPerson.ContactMethod a = contactPerson.mo7263a();
                int i = a.f9755a;
                if (i == 1) {
                    str = ancm.m64019h(a.f9756b);
                } else if (i != 2) {
                    str = null;
                } else {
                    String valueOf = String.valueOf(a.f9756b);
                    str = valueOf.length() == 0 ? new String("p:") : "p:".concat(valueOf);
                }
            } else {
                String valueOf2 = String.valueOf(l.toString());
                str = valueOf2.length() == 0 ? new String("c:") : "c:".concat(valueOf2);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            aqqx aqqx = new aqqx();
            fwo fwo = (fwo) fxo;
            aqqx.mo48093b(fwo.f17464c);
            aqqx.mo48092a(str);
            aqqx.mo48091a(80);
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", fzm.m12789a(fwo.f17462a, contactPerson));
            ((Fragment) fxo).startActivityForResult(aqqx.f86636a, 1);
        }
        return true;
    }
}
