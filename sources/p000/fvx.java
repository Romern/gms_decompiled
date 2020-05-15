package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;
import java.util.Collection;

/* renamed from: fvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvx extends aonm {

    /* renamed from: a */
    final /* synthetic */ fwd f17398a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fvx(fwd fwd, Collection collection) {
        super(collection);
        this.f17398a = fwd;
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f17398a.f17407a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo11413a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        AvatarReferenceImageView avatarReferenceImageView;
        fwc fwc = (fwc) obj;
        if (view == null) {
            view = this.f17398a.f78590N.inflate((int) C0126R.C0128layout.appinvite_auto_complete_item, viewGroup, false);
        }
        ContactPerson contactPerson = fwc.f17404a;
        ContactPerson.ContactMethod contactMethod = fwc.f17405b;
        if (contactMethod == null) {
            contactMethod = contactPerson.mo7263a();
        }
        String a = fzm.m12789a(this.f17398a.f17411e, contactPerson);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C0126R.C0129id.avatar_container);
        if (viewGroup2.getChildCount() == 0) {
            AvatarReferenceImageView avatarReferenceImageView2 = new AvatarReferenceImageView(viewGroup2.getContext());
            viewGroup2.addView(avatarReferenceImageView2, new ViewGroup.LayoutParams(-1, -1));
            avatarReferenceImageView = avatarReferenceImageView2;
        } else {
            avatarReferenceImageView = (AvatarReferenceImageView) viewGroup2.getChildAt(0);
        }
        avatarReferenceImageView.mo46481d();
        if (fwc.f17406c != 5) {
            avatarReferenceImageView.mo46477a(a);
        } else {
            String str = null;
            if (!(a == null || a.trim().length() == 0)) {
                str = a.trim().substring(0, 1);
            }
            avatarReferenceImageView.mo46477a(str);
        }
        fwd fwd = this.f17398a;
        fzj.m12781a(fwd.f17410d, fwd.f17416j, avatarReferenceImageView, contactPerson, contactMethod, fwd.f17419m);
        ((TextView) view.findViewById(C0126R.C0129id.name)).setText(a);
        ((TextView) view.findViewById(C0126R.C0129id.contact_detail)).setText(fzj.m12780a(this.f17398a.f17411e, contactMethod));
        return view;
    }
}
