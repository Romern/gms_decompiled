package p000;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: fzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzj {
    /* renamed from: a */
    public static String m12780a(Context context, ContactPerson.ContactMethod contactMethod) {
        if (contactMethod == null) {
            return null;
        }
        int i = contactMethod.f9755a;
        if (i == 0) {
            return context.getString(C0126R.string.appinvite_contextual_selection_method_google);
        }
        if (i != 3) {
            return contactMethod.f9756b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r4.equals("public") != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* renamed from: a */
    public static void m12781a(rkb rkb, allg allg, AvatarReferenceImageView avatarReferenceImageView, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod, boolean z) {
        AvatarReference avatarReference;
        Long l;
        int i;
        char c = 0;
        if (contactMethod == null || contactMethod.f9755a != 3) {
            if (contactMethod != null) {
                avatarReference = contactMethod.f9757c;
            } else {
                avatarReference = null;
            }
            if (avatarReference == null) {
                avatarReference = contactPerson.f9752d;
            }
            if (avatarReference != null || (l = contactPerson.f9751c) == null) {
                avatarReferenceImageView.mo46478a(rkb, allg, avatarReference);
            } else {
                long longValue = l.longValue();
                avatarReferenceImageView.f82060b = null;
                Long l2 = avatarReferenceImageView.f82061c;
                Long valueOf = Long.valueOf(longValue);
                if (!sdg.m34949a(l2, valueOf)) {
                    avatarReferenceImageView.mo46475a();
                    avatarReferenceImageView.mo46479b();
                    avatarReferenceImageView.f82061c = valueOf;
                    avatarReferenceImageView.f82062d = null;
                    avatarReferenceImageView.f82064f = new anbr(avatarReferenceImageView, avatarReferenceImageView.f82061c.longValue(), avatarReferenceImageView.f82065g);
                    avatarReferenceImageView.f82064f.execute(new Void[0]);
                } else {
                    BitmapDrawable bitmapDrawable = avatarReferenceImageView.f82062d;
                    if (bitmapDrawable != null) {
                        avatarReferenceImageView.f82059a.setImageDrawable(bitmapDrawable);
                        avatarReferenceImageView.mo46480c();
                    } else if (avatarReferenceImageView.f82064f == null) {
                        avatarReferenceImageView.mo46479b();
                        avatarReferenceImageView.f82064f = new anbr(avatarReferenceImageView, avatarReferenceImageView.f82061c.longValue(), avatarReferenceImageView.f82065g);
                        avatarReferenceImageView.f82064f.execute(new Void[0]);
                    }
                }
            }
            avatarReferenceImageView.setBackgroundResource(0);
            avatarReferenceImageView.mo46476a(0);
            return;
        }
        String str = contactMethod.f9756b;
        int hashCode = str.hashCode();
        if (hashCode != -1326197564) {
            if (hashCode != -977423767) {
                if (hashCode == 2076861994 && str.equals("extendedCircles")) {
                    c = 2;
                    int i2 = C0126R.C0127drawable.common_acl_chip_green;
                    if (c == 0) {
                        if (z) {
                            i2 = C0126R.C0127drawable.common_acl_chip_red;
                        }
                        i = C0126R.C0127drawable.common_ic_acl_public;
                    } else if (c == 1) {
                        if (z) {
                            i2 = C0126R.C0127drawable.common_acl_chip_red;
                        }
                        i = C0126R.C0127drawable.common_ic_acl_domain;
                    } else if (c != 2) {
                        i2 = C0126R.C0127drawable.common_acl_chip_blue;
                        i = C0126R.C0127drawable.common_ic_acl_circles;
                    } else {
                        if (z) {
                            i2 = C0126R.C0127drawable.common_acl_chip_red;
                        }
                        i = C0126R.C0127drawable.common_ic_acl_extended;
                    }
                    avatarReferenceImageView.mo46475a();
                    avatarReferenceImageView.f82060b = null;
                    avatarReferenceImageView.f82061c = null;
                    avatarReferenceImageView.f82062d = null;
                    avatarReferenceImageView.f82059a.setImageResource(i);
                    avatarReferenceImageView.mo46480c();
                    avatarReferenceImageView.setBackgroundResource(i2);
                    avatarReferenceImageView.mo46476a(avatarReferenceImageView.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_avatar_circle_padding));
                }
            }
        } else if (str.equals("domain")) {
            c = 1;
            int i22 = C0126R.C0127drawable.common_acl_chip_green;
            if (c == 0) {
            }
            avatarReferenceImageView.mo46475a();
            avatarReferenceImageView.f82060b = null;
            avatarReferenceImageView.f82061c = null;
            avatarReferenceImageView.f82062d = null;
            avatarReferenceImageView.f82059a.setImageResource(i);
            avatarReferenceImageView.mo46480c();
            avatarReferenceImageView.setBackgroundResource(i22);
            avatarReferenceImageView.mo46476a(avatarReferenceImageView.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_avatar_circle_padding));
        }
        c = 65535;
        int i222 = C0126R.C0127drawable.common_acl_chip_green;
        if (c == 0) {
        }
        avatarReferenceImageView.mo46475a();
        avatarReferenceImageView.f82060b = null;
        avatarReferenceImageView.f82061c = null;
        avatarReferenceImageView.f82062d = null;
        avatarReferenceImageView.f82059a.setImageResource(i);
        avatarReferenceImageView.mo46480c();
        avatarReferenceImageView.setBackgroundResource(i222);
        avatarReferenceImageView.mo46476a(avatarReferenceImageView.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_avatar_circle_padding));
    }
}
