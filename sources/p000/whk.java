package p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;
import java.util.List;

/* renamed from: whk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whk extends abh {

    /* renamed from: a */
    private final List f50649a;

    /* renamed from: d */
    private final rkb f50650d;

    /* renamed from: e */
    private final allg f50651e;

    /* renamed from: f */
    private final boolean f50652f;

    /* renamed from: g */
    private final Resources f50653g;

    public whk(List list, rkb rkb, allg allg, boolean z, Context context) {
        this.f50649a = list;
        this.f50650d = rkb;
        this.f50651e = allg;
        this.f50652f = z;
        this.f50653g = context.getResources();
    }

    /* renamed from: a */
    private static final String m41945a(Contact contact) {
        return !contact.mo18399b() ? contact.f31284c : contact.f31282a;
    }

    /* renamed from: a */
    private final void m41946a(AvatarReferenceImageView avatarReferenceImageView, String str, AvatarReference avatarReference) {
        avatarReferenceImageView.mo46477a(str);
        avatarReferenceImageView.mo46481d();
        avatarReferenceImageView.mo46478a(this.f50650d, this.f50651e, avatarReference);
        avatarReferenceImageView.setBackgroundResource(0);
        avatarReferenceImageView.mo46476a(0);
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f50649a.size();
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        Contact contact = (Contact) this.f50649a.get(i);
        return (TextUtils.isEmpty(contact.f31283b) || contact.f31283b.equals(m41945a(contact)) || !contact.mo18398a()) ? 0 : 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            if (!cdsz.m134909b()) {
                i2 = C0126R.C0128layout.fm_item_1_line_with_avatar_reference_and_icon;
            } else {
                i2 = C0126R.C0128layout.fm_item_1_line_with_avatar_and_icon;
            }
            return new whi(from.inflate(i2, viewGroup, false), this.f50652f);
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Incorrect view type: ");
            sb.append(i);
            wgn.m41926f("ContactsAdapter", sb.toString(), new Object[0]);
            return null;
        } else {
            if (!cdsz.m134909b()) {
                i3 = C0126R.C0128layout.fm_item_2_line_with_avatar_reference_and_icon;
            } else {
                i3 = C0126R.C0128layout.fm_item_2_line_with_avatar_and_icon;
            }
            return new whj(from.inflate(i3, viewGroup, false), this.f50652f);
        }
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        String str;
        Contact contact = (Contact) this.f50649a.get(i);
        if (acm instanceof whi) {
            whi whi = (whi) acm;
            if (!contact.mo18398a()) {
                str = contact.f31283b;
            } else {
                str = m41945a(contact);
            }
            if (cdsz.m134909b()) {
                Uri uri = contact.f31290i;
                if (uri == null) {
                    ImageView imageView = whi.f50643t;
                    Resources resources = this.f50653g;
                    int i2 = Build.VERSION.SDK_INT;
                    imageView.setImageDrawable(rzl.m34707a(resources, this.f50653g.getDrawable(C0126R.C0127drawable.product_logo_avatar_anonymous_color_48, null)));
                } else {
                    whi.f50643t.setImageURI(uri);
                }
            } else {
                m41946a(whi.f50642s, str, contact.f31288g);
            }
            whi.f50644u.setText(str);
        } else if (acm instanceof whj) {
            whj whj = (whj) acm;
            if (cdsz.m134909b()) {
                Uri uri2 = contact.f31290i;
                if (uri2 == null) {
                    ImageView imageView2 = whj.f50646t;
                    Resources resources2 = this.f50653g;
                    int i3 = Build.VERSION.SDK_INT;
                    imageView2.setImageDrawable(rzl.m34707a(resources2, this.f50653g.getDrawable(C0126R.C0127drawable.product_logo_avatar_anonymous_color_48, null)));
                } else {
                    whj.f50646t.setImageURI(uri2);
                }
            } else {
                m41946a(whj.f50645s, contact.f31283b, contact.f31288g);
            }
            whj.f50647u.setText(contact.f31283b);
            whj.f50648v.setText(m41945a(contact));
        }
    }
}
